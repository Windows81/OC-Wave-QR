package io.realm.internal;

import io.realm.RealmConfiguration;
import io.realm.RealmFieldType;
import io.realm.exceptions.RealmError;
import io.realm.internal.OsRealmConfig;
import io.realm.internal.OsResults;
import io.realm.internal.android.AndroidCapabilities;
import io.realm.internal.android.AndroidRealmNotifier;
import java.io.Closeable;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.annotation.Nullable;

public final class OsSharedRealm implements Closeable, NativeObject {
    public static final byte FILE_EXCEPTION_INCOMPATIBLE_SYNC_FILE = 7;
    public static final byte FILE_EXCEPTION_KIND_ACCESS_ERROR = 0;
    public static final byte FILE_EXCEPTION_KIND_BAD_HISTORY = 1;
    public static final byte FILE_EXCEPTION_KIND_EXISTS = 3;
    public static final byte FILE_EXCEPTION_KIND_FORMAT_UPGRADE_REQUIRED = 6;
    public static final byte FILE_EXCEPTION_KIND_INCOMPATIBLE_LOCK_FILE = 5;
    public static final byte FILE_EXCEPTION_KIND_NOT_FOUND = 4;
    public static final byte FILE_EXCEPTION_KIND_PERMISSION_DENIED = 2;
    private static final long nativeFinalizerPtr = nativeGetFinalizerPtr();
    private static final List<OsSharedRealm> sharedRealmsUnderConstruction = new CopyOnWriteArrayList();
    private static volatile File temporaryDirectory;
    public final Capabilities capabilities;
    public final NativeContext context;
    final List<WeakReference<OsResults.Iterator>> iterators;
    private final long nativePtr;
    private final OsRealmConfig osRealmConfig;
    private final List<WeakReference<PendingRow>> pendingRows;
    public final RealmNotifier realmNotifier;
    private final OsSchemaInfo schemaInfo;
    private final List<OsSharedRealm> tempSharedRealmsForCallback;

    public interface InitializationCallback {
        void onInit(OsSharedRealm osSharedRealm);
    }

    public interface MigrationCallback {
        void onMigrationNeeded(OsSharedRealm osSharedRealm, long j2, long j3);
    }

    public interface SchemaChangedCallback {
        void onSchemaChanged();
    }

    public static class VersionID implements Comparable<VersionID> {

        /* renamed from: B  reason: collision with root package name */
        public static final VersionID f40212B = new VersionID(-1, -1);

        /* renamed from: A  reason: collision with root package name */
        public final long f40213A;

        /* renamed from: z  reason: collision with root package name */
        public final long f40214z;

        public VersionID(long j2, long j3) {
            this.f40214z = j2;
            this.f40213A = j3;
        }

        /* renamed from: d */
        public int compareTo(VersionID versionID) {
            if (versionID != null) {
                long j2 = this.f40214z;
                long j3 = versionID.f40214z;
                if (j2 > j3) {
                    return 1;
                }
                return j2 < j3 ? -1 : 0;
            }
            throw new IllegalArgumentException("Version cannot be compared to a null value.");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            VersionID versionID = (VersionID) obj;
            return this.f40214z == versionID.f40214z && this.f40213A == versionID.f40213A;
        }

        public int hashCode() {
            long j2 = this.f40214z;
            long j3 = this.f40213A;
            return (((int) (j2 ^ (j2 >>> 32))) * 31) + ((int) ((j3 >>> 32) ^ j3));
        }

        public String toString() {
            return "VersionID{version=" + this.f40214z + ", index=" + this.f40213A + '}';
        }
    }

    private OsSharedRealm(OsRealmConfig osRealmConfig2, VersionID versionID) {
        ArrayList arrayList = new ArrayList();
        this.tempSharedRealmsForCallback = arrayList;
        this.pendingRows = new CopyOnWriteArrayList();
        this.iterators = new ArrayList();
        AndroidCapabilities androidCapabilities = new AndroidCapabilities();
        AndroidRealmNotifier androidRealmNotifier = new AndroidRealmNotifier(this, androidCapabilities);
        NativeContext a2 = osRealmConfig2.a();
        this.context = a2;
        List<OsSharedRealm> list = sharedRealmsUnderConstruction;
        list.add(this);
        try {
            long nativeGetSharedRealm = nativeGetSharedRealm(osRealmConfig2.getNativePtr(), versionID.f40214z, versionID.f40213A, androidRealmNotifier);
            this.nativePtr = nativeGetSharedRealm;
            arrayList.clear();
            list.remove(this);
            this.osRealmConfig = osRealmConfig2;
            this.schemaInfo = new OsSchemaInfo(nativeGetSchemaInfo(nativeGetSharedRealm), this);
            a2.a(this);
            this.capabilities = androidCapabilities;
            this.realmNotifier = androidRealmNotifier;
            if (versionID.equals(VersionID.f40212B)) {
                nativeSetAutoRefresh(nativeGetSharedRealm, androidCapabilities.a());
            }
        } catch (Throwable th) {
            this.tempSharedRealmsForCallback.clear();
            sharedRealmsUnderConstruction.remove(this);
            throw th;
        }
    }

    private void detachIterators() {
        for (WeakReference<OsResults.Iterator> weakReference : this.iterators) {
            OsResults.Iterator iterator = (OsResults.Iterator) weakReference.get();
            if (iterator != null) {
                iterator.c();
            }
        }
        this.iterators.clear();
    }

    private void executePendingRowQueries() {
        for (WeakReference<PendingRow> weakReference : this.pendingRows) {
            PendingRow pendingRow = (PendingRow) weakReference.get();
            if (pendingRow != null) {
                pendingRow.c();
            }
        }
        this.pendingRows.clear();
    }

    public static OsSharedRealm getInstance(RealmConfiguration realmConfiguration, VersionID versionID) {
        return getInstance(new OsRealmConfig.Builder(realmConfiguration), versionID);
    }

    public static File getTemporaryDirectory() {
        return temporaryDirectory;
    }

    public static void initialize(File file) {
        if (temporaryDirectory == null) {
            String absolutePath = file.getAbsolutePath();
            if (file.isDirectory() || file.mkdirs() || file.isDirectory()) {
                if (!absolutePath.endsWith("/")) {
                    absolutePath = absolutePath + "/";
                }
                nativeInit(absolutePath);
                temporaryDirectory = file;
                return;
            }
            throw new IOException("failed to create temporary directory: " + absolutePath);
        }
    }

    private static native void nativeBeginTransaction(long j2);

    private static native void nativeCancelTransaction(long j2);

    private static native void nativeCloseSharedRealm(long j2);

    private static native void nativeCommitTransaction(long j2);

    private static native boolean nativeCompact(long j2);

    private static native long nativeCreateTable(long j2, String str);

    private static native long nativeCreateTableWithPrimaryKeyField(long j2, String str, String str2, int i2, boolean z2);

    private static native long nativeFreeze(long j2);

    private static native long nativeGetActiveSubscriptionSet(long j2);

    private static native long nativeGetFinalizerPtr();

    private static native long nativeGetLatestSubscriptionSet(long j2);

    private static native long nativeGetSchemaInfo(long j2);

    private static native long nativeGetSharedRealm(long j2, long j3, long j4, RealmNotifier realmNotifier2);

    private static native long nativeGetTableRef(long j2, String str);

    private static native String[] nativeGetTablesName(long j2);

    private static native long[] nativeGetVersionID(long j2);

    private static native boolean nativeHasTable(long j2, String str);

    private static native void nativeInit(String str);

    private static native boolean nativeIsAutoRefresh(long j2);

    private static native boolean nativeIsClosed(long j2);

    private static native boolean nativeIsEmpty(long j2);

    private static native boolean nativeIsFrozen(long j2);

    private static native boolean nativeIsInTransaction(long j2);

    private static native long nativeNumberOfVersions(long j2);

    private static native void nativeRefresh(long j2);

    private static native void nativeRegisterSchemaChangedCallback(long j2, SchemaChangedCallback schemaChangedCallback);

    private static native void nativeRenameTable(long j2, String str, String str2);

    private static native void nativeSetAutoRefresh(long j2, boolean z2);

    private static native long nativeSize(long j2);

    private static native void nativeStopWaitForChange(long j2);

    private static native boolean nativeWaitForChange(long j2);

    private static native void nativeWriteCopy(long j2, String str, @Nullable byte[] bArr);

    private static void runInitializationCallback(long j2, OsRealmConfig osRealmConfig2, InitializationCallback initializationCallback) {
        initializationCallback.onInit(new OsSharedRealm(j2, osRealmConfig2));
    }

    private static void runMigrationCallback(long j2, OsRealmConfig osRealmConfig2, MigrationCallback migrationCallback, long j3) {
        migrationCallback.onMigrationNeeded(new OsSharedRealm(j2, osRealmConfig2), j3, osRealmConfig2.c().p());
    }

    public void addIterator(OsResults.Iterator iterator) {
        this.iterators.add(new WeakReference(iterator));
    }

    public void addPendingRow(PendingRow pendingRow) {
        this.pendingRows.add(new WeakReference(pendingRow));
    }

    public void beginTransaction() {
        detachIterators();
        executePendingRowQueries();
        nativeBeginTransaction(this.nativePtr);
    }

    public void cancelTransaction() {
        nativeCancelTransaction(this.nativePtr);
    }

    public void close() {
        RealmNotifier realmNotifier2 = this.realmNotifier;
        if (realmNotifier2 != null) {
            realmNotifier2.close();
        }
        synchronized (this.context) {
            nativeCloseSharedRealm(this.nativePtr);
        }
    }

    public void commitTransaction() {
        nativeCommitTransaction(this.nativePtr);
    }

    public boolean compact() {
        return nativeCompact(this.nativePtr);
    }

    public Table createTable(String str) {
        return new Table(this, nativeCreateTable(this.nativePtr, str));
    }

    public Table createTableWithPrimaryKey(String str, String str2, RealmFieldType realmFieldType, boolean z2) {
        return new Table(this, nativeCreateTableWithPrimaryKeyField(this.nativePtr, str, str2, realmFieldType.getNativeValue(), z2));
    }

    public OsSharedRealm freeze() {
        return new OsSharedRealm(this.osRealmConfig, getVersionID());
    }

    public RealmConfiguration getConfiguration() {
        return this.osRealmConfig.c();
    }

    public long getNativeFinalizerPtr() {
        return nativeFinalizerPtr;
    }

    public long getNativePtr() {
        return this.nativePtr;
    }

    public long getNumberOfVersions() {
        return nativeNumberOfVersions(this.nativePtr);
    }

    public String getPath() {
        return this.osRealmConfig.c().k();
    }

    public OsSchemaInfo getSchemaInfo() {
        return this.schemaInfo;
    }

    public Table getTable(String str) {
        return new Table(this, nativeGetTableRef(this.nativePtr, str));
    }

    public String[] getTablesNames() {
        String[] nativeGetTablesName = nativeGetTablesName(this.nativePtr);
        return nativeGetTablesName != null ? nativeGetTablesName : new String[0];
    }

    public VersionID getVersionID() {
        long[] nativeGetVersionID = nativeGetVersionID(this.nativePtr);
        if (nativeGetVersionID != null) {
            return new VersionID(nativeGetVersionID[0], nativeGetVersionID[1]);
        }
        throw new IllegalStateException("Cannot get versionId, this could be related to a non existing read/write transaction");
    }

    public boolean hasTable(String str) {
        return nativeHasTable(this.nativePtr, str);
    }

    public void invalidateIterators() {
        for (WeakReference<OsResults.Iterator> weakReference : this.iterators) {
            OsResults.Iterator iterator = (OsResults.Iterator) weakReference.get();
            if (iterator != null) {
                iterator.f();
            }
        }
        this.iterators.clear();
    }

    public boolean isAutoRefresh() {
        return nativeIsAutoRefresh(this.nativePtr);
    }

    public boolean isClosed() {
        return nativeIsClosed(this.nativePtr);
    }

    public boolean isEmpty() {
        return nativeIsEmpty(this.nativePtr);
    }

    public boolean isFrozen() {
        return nativeIsFrozen(this.nativePtr);
    }

    public boolean isInTransaction() {
        return nativeIsInTransaction(this.nativePtr);
    }

    public boolean isSyncRealm() {
        return this.osRealmConfig.d() != null;
    }

    public void refresh() {
        if (!isFrozen()) {
            nativeRefresh(this.nativePtr);
            return;
        }
        throw new IllegalStateException("It is not possible to refresh frozen Realms.");
    }

    public void registerSchemaChangedCallback(SchemaChangedCallback schemaChangedCallback) {
        nativeRegisterSchemaChangedCallback(this.nativePtr, schemaChangedCallback);
    }

    public void removePendingRow(PendingRow pendingRow) {
        for (WeakReference next : this.pendingRows) {
            PendingRow pendingRow2 = (PendingRow) next.get();
            if (pendingRow2 == null || pendingRow2 == pendingRow) {
                this.pendingRows.remove(next);
            }
        }
    }

    public void renameTable(String str, String str2) {
        try {
            nativeRenameTable(this.nativePtr, str, str2);
        } catch (IllegalArgumentException e2) {
            throw new RealmError(e2.getMessage());
        }
    }

    public void setAutoRefresh(boolean z2) {
        this.capabilities.c((String) null);
        nativeSetAutoRefresh(this.nativePtr, z2);
    }

    public long size() {
        return nativeSize(this.nativePtr);
    }

    public void stopWaitForChange() {
        nativeStopWaitForChange(this.nativePtr);
    }

    public boolean waitForChange() {
        return nativeWaitForChange(this.nativePtr);
    }

    public void writeCopy(File file, @Nullable byte[] bArr) {
        if (!file.isFile() || !file.exists()) {
            if (isSyncRealm()) {
                Util.a("writeCopyTo() cannot be called from the main thread when using synchronized Realms.");
            }
            try {
                nativeWriteCopy(this.nativePtr, file.getAbsolutePath(), bArr);
            } catch (RuntimeException e2) {
                String message = e2.getMessage();
                if (message.contains("Could not write file as not all client changes are integrated in server")) {
                    throw new IllegalStateException(message);
                }
                throw e2;
            }
        } else {
            throw new IllegalArgumentException("The destination file must not exist");
        }
    }

    public static OsSharedRealm getInstance(OsRealmConfig.Builder builder, VersionID versionID) {
        OsRealmConfig b2 = builder.b();
        ObjectServerFacade.e().k(b2);
        return new OsSharedRealm(b2, versionID);
    }

    public OsSharedRealm(long j2, OsRealmConfig osRealmConfig2) {
        this(j2, osRealmConfig2, osRealmConfig2.a());
        for (OsSharedRealm next : sharedRealmsUnderConstruction) {
            if (next.context == osRealmConfig2.a()) {
                next.tempSharedRealmsForCallback.add(this);
                return;
            }
        }
        throw new IllegalStateException("Cannot find the parent 'OsSharedRealm' which is under construction.");
    }

    public OsSharedRealm(long j2, OsRealmConfig osRealmConfig2, NativeContext nativeContext) {
        this.tempSharedRealmsForCallback = new ArrayList();
        this.pendingRows = new CopyOnWriteArrayList();
        this.iterators = new ArrayList();
        this.nativePtr = j2;
        this.osRealmConfig = osRealmConfig2;
        this.schemaInfo = new OsSchemaInfo(nativeGetSchemaInfo(j2), this);
        this.context = nativeContext;
        nativeContext.a(this);
        this.capabilities = new AndroidCapabilities();
        this.realmNotifier = null;
        nativeSetAutoRefresh(j2, false);
    }
}
