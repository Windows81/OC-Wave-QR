package androidx.datastore.core;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;

@Metadata
public final class FileStorageConnection<T> implements StorageConnection<T> {

    /* renamed from: a  reason: collision with root package name */
    public final File f20586a;

    /* renamed from: b  reason: collision with root package name */
    public final Serializer f20587b;

    /* renamed from: c  reason: collision with root package name */
    public final InterProcessCoordinator f20588c;

    /* renamed from: d  reason: collision with root package name */
    public final Function0 f20589d;

    /* renamed from: e  reason: collision with root package name */
    public final AtomicBoolean f20590e = new AtomicBoolean(false);

    /* renamed from: f  reason: collision with root package name */
    public final Mutex f20591f = MutexKt.b(false, 1, (Object) null);

    public FileStorageConnection(File file, Serializer serializer, InterProcessCoordinator interProcessCoordinator, Function0 function0) {
        Intrinsics.i(file, "file");
        Intrinsics.i(serializer, "serializer");
        Intrinsics.i(interProcessCoordinator, "coordinator");
        Intrinsics.i(function0, "onClose");
        this.f20586a = file;
        this.f20587b = serializer;
        this.f20588c = interProcessCoordinator;
        this.f20589d = function0;
    }

    private final void f() {
        if (this.f20590e.get()) {
            throw new IllegalStateException("StorageConnection has already been disposed.");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00ad A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00bb A[SYNTHETIC, Splitter:B:37:0x00bb] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00fd A[SYNTHETIC, Splitter:B:52:0x00fd] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object b(kotlin.jvm.functions.Function2 r10, kotlin.coroutines.Continuation r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof androidx.datastore.core.FileStorageConnection$writeScope$1
            if (r0 == 0) goto L_0x0013
            r0 = r11
            androidx.datastore.core.FileStorageConnection$writeScope$1 r0 = (androidx.datastore.core.FileStorageConnection$writeScope$1) r0
            int r1 = r0.I
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.I = r1
            goto L_0x0018
        L_0x0013:
            androidx.datastore.core.FileStorageConnection$writeScope$1 r0 = new androidx.datastore.core.FileStorageConnection$writeScope$1
            r0.<init>(r9, r11)
        L_0x0018:
            java.lang.Object r11 = r0.G
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.I
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x005c
            if (r2 == r4) goto L_0x0049
            if (r2 != r3) goto L_0x0041
            java.lang.Object r10 = r0.F
            androidx.datastore.core.Closeable r10 = (androidx.datastore.core.Closeable) r10
            java.lang.Object r1 = r0.E
            java.io.File r1 = (java.io.File) r1
            java.lang.Object r2 = r0.D
            kotlinx.coroutines.sync.Mutex r2 = (kotlinx.coroutines.sync.Mutex) r2
            java.lang.Object r0 = r0.C
            androidx.datastore.core.FileStorageConnection r0 = (androidx.datastore.core.FileStorageConnection) r0
            kotlin.ResultKt.b(r11)     // Catch:{ all -> 0x003e }
            goto L_0x00b1
        L_0x003e:
            r11 = move-exception
            goto L_0x0102
        L_0x0041:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0049:
            java.lang.Object r10 = r0.E
            kotlinx.coroutines.sync.Mutex r10 = (kotlinx.coroutines.sync.Mutex) r10
            java.lang.Object r2 = r0.D
            kotlin.jvm.functions.Function2 r2 = (kotlin.jvm.functions.Function2) r2
            java.lang.Object r4 = r0.C
            androidx.datastore.core.FileStorageConnection r4 = (androidx.datastore.core.FileStorageConnection) r4
            kotlin.ResultKt.b(r11)
            r8 = r2
            r2 = r10
            r10 = r8
            goto L_0x007a
        L_0x005c:
            kotlin.ResultKt.b(r11)
            r9.f()
            java.io.File r11 = r9.f20586a
            r9.g(r11)
            kotlinx.coroutines.sync.Mutex r11 = r9.f20591f
            r0.C = r9
            r0.D = r10
            r0.E = r11
            r0.I = r4
            java.lang.Object r2 = r11.d(r5, r0)
            if (r2 != r1) goto L_0x0078
            return r1
        L_0x0078:
            r4 = r9
            r2 = r11
        L_0x007a:
            java.io.File r11 = new java.io.File     // Catch:{ all -> 0x00f0 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f0 }
            r6.<init>()     // Catch:{ all -> 0x00f0 }
            java.io.File r7 = r4.f20586a     // Catch:{ all -> 0x00f0 }
            java.lang.String r7 = r7.getAbsolutePath()     // Catch:{ all -> 0x00f0 }
            r6.append(r7)     // Catch:{ all -> 0x00f0 }
            java.lang.String r7 = ".tmp"
            r6.append(r7)     // Catch:{ all -> 0x00f0 }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x00f0 }
            r11.<init>(r6)     // Catch:{ all -> 0x00f0 }
            androidx.datastore.core.FileWriteScope r6 = new androidx.datastore.core.FileWriteScope     // Catch:{ IOException -> 0x010b }
            androidx.datastore.core.Serializer r7 = r4.f20587b     // Catch:{ IOException -> 0x010b }
            r6.<init>(r11, r7)     // Catch:{ IOException -> 0x010b }
            r0.C = r4     // Catch:{ all -> 0x00fe }
            r0.D = r2     // Catch:{ all -> 0x00fe }
            r0.E = r11     // Catch:{ all -> 0x00fe }
            r0.F = r6     // Catch:{ all -> 0x00fe }
            r0.I = r3     // Catch:{ all -> 0x00fe }
            java.lang.Object r10 = r10.m(r6, r0)     // Catch:{ all -> 0x00fe }
            if (r10 != r1) goto L_0x00ae
            return r1
        L_0x00ae:
            r1 = r11
            r0 = r4
            r10 = r6
        L_0x00b1:
            kotlin.Unit r11 = kotlin.Unit.f40552a     // Catch:{ all -> 0x003e }
            r10.close()     // Catch:{ all -> 0x00b8 }
            r10 = r5
            goto L_0x00b9
        L_0x00b8:
            r10 = move-exception
        L_0x00b9:
            if (r10 != 0) goto L_0x00fd
            boolean r10 = r1.exists()     // Catch:{ IOException -> 0x00f2 }
            if (r10 == 0) goto L_0x00f5
            java.io.File r10 = r0.f20586a     // Catch:{ IOException -> 0x00f2 }
            boolean r10 = androidx.datastore.core.FileMoves_androidKt.a(r1, r10)     // Catch:{ IOException -> 0x00f2 }
            if (r10 == 0) goto L_0x00ca
            goto L_0x00f5
        L_0x00ca:
            java.io.IOException r10 = new java.io.IOException     // Catch:{ IOException -> 0x00f2 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00f2 }
            r11.<init>()     // Catch:{ IOException -> 0x00f2 }
            java.lang.String r3 = "Unable to rename "
            r11.append(r3)     // Catch:{ IOException -> 0x00f2 }
            r11.append(r1)     // Catch:{ IOException -> 0x00f2 }
            java.lang.String r3 = " to "
            r11.append(r3)     // Catch:{ IOException -> 0x00f2 }
            java.io.File r0 = r0.f20586a     // Catch:{ IOException -> 0x00f2 }
            r11.append(r0)     // Catch:{ IOException -> 0x00f2 }
            java.lang.String r0 = ". This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file."
            r11.append(r0)     // Catch:{ IOException -> 0x00f2 }
            java.lang.String r11 = r11.toString()     // Catch:{ IOException -> 0x00f2 }
            r10.<init>(r11)     // Catch:{ IOException -> 0x00f2 }
            throw r10     // Catch:{ IOException -> 0x00f2 }
        L_0x00f0:
            r10 = move-exception
            goto L_0x0116
        L_0x00f2:
            r10 = move-exception
            r11 = r1
            goto L_0x010c
        L_0x00f5:
            kotlin.Unit r10 = kotlin.Unit.f40552a     // Catch:{ all -> 0x00f0 }
            r2.e(r5)
            kotlin.Unit r10 = kotlin.Unit.f40552a
            return r10
        L_0x00fd:
            throw r10     // Catch:{ IOException -> 0x00f2 }
        L_0x00fe:
            r10 = move-exception
            r1 = r11
            r11 = r10
            r10 = r6
        L_0x0102:
            r10.close()     // Catch:{ all -> 0x0106 }
            goto L_0x010a
        L_0x0106:
            r10 = move-exception
            kotlin.ExceptionsKt.a(r11, r10)     // Catch:{ IOException -> 0x00f2 }
        L_0x010a:
            throw r11     // Catch:{ IOException -> 0x00f2 }
        L_0x010b:
            r10 = move-exception
        L_0x010c:
            boolean r0 = r11.exists()     // Catch:{ all -> 0x00f0 }
            if (r0 == 0) goto L_0x0115
            r11.delete()     // Catch:{ all -> 0x00f0 }
        L_0x0115:
            throw r10     // Catch:{ all -> 0x00f0 }
        L_0x0116:
            r2.e(r5)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.FileStorageConnection.b(kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public InterProcessCoordinator c() {
        return this.f20588c;
    }

    public void close() {
        this.f20590e.set(true);
        this.f20589d.invoke();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x007c, code lost:
        r10 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0088, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        kotlin.ExceptionsKt.a(r10, r1);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:31:0x007b, B:36:0x0084] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x007b A[SYNTHETIC, Splitter:B:31:0x007b] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object e(kotlin.jvm.functions.Function3 r9, kotlin.coroutines.Continuation r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof androidx.datastore.core.FileStorageConnection$readScope$1
            if (r0 == 0) goto L_0x0013
            r0 = r10
            androidx.datastore.core.FileStorageConnection$readScope$1 r0 = (androidx.datastore.core.FileStorageConnection$readScope$1) r0
            int r1 = r0.H
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.H = r1
            goto L_0x0018
        L_0x0013:
            androidx.datastore.core.FileStorageConnection$readScope$1 r0 = new androidx.datastore.core.FileStorageConnection$readScope$1
            r0.<init>(r8, r10)
        L_0x0018:
            java.lang.Object r10 = r0.F
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.H
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x003e
            if (r2 != r3) goto L_0x0036
            boolean r9 = r0.E
            java.lang.Object r1 = r0.D
            androidx.datastore.core.Closeable r1 = (androidx.datastore.core.Closeable) r1
            java.lang.Object r0 = r0.C
            androidx.datastore.core.FileStorageConnection r0 = (androidx.datastore.core.FileStorageConnection) r0
            kotlin.ResultKt.b(r10)     // Catch:{ all -> 0x0034 }
            goto L_0x006b
        L_0x0034:
            r10 = move-exception
            goto L_0x0084
        L_0x0036:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x003e:
            kotlin.ResultKt.b(r10)
            r8.f()
            kotlinx.coroutines.sync.Mutex r10 = r8.f20591f
            boolean r10 = kotlinx.coroutines.sync.Mutex.DefaultImpls.b(r10, r4, r3, r4)
            androidx.datastore.core.FileReadScope r2 = new androidx.datastore.core.FileReadScope     // Catch:{ all -> 0x008d }
            java.io.File r5 = r8.f20586a     // Catch:{ all -> 0x008d }
            androidx.datastore.core.Serializer r6 = r8.f20587b     // Catch:{ all -> 0x008d }
            r2.<init>(r5, r6)     // Catch:{ all -> 0x008d }
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.Boxing.a(r10)     // Catch:{ all -> 0x007e }
            r0.C = r8     // Catch:{ all -> 0x007e }
            r0.D = r2     // Catch:{ all -> 0x007e }
            r0.E = r10     // Catch:{ all -> 0x007e }
            r0.H = r3     // Catch:{ all -> 0x007e }
            java.lang.Object r9 = r9.d(r2, r5, r0)     // Catch:{ all -> 0x007e }
            if (r9 != r1) goto L_0x0066
            return r1
        L_0x0066:
            r0 = r8
            r1 = r2
            r7 = r10
            r10 = r9
            r9 = r7
        L_0x006b:
            r1.close()     // Catch:{ all -> 0x0070 }
            r1 = r4
            goto L_0x0071
        L_0x0070:
            r1 = move-exception
        L_0x0071:
            if (r1 != 0) goto L_0x007b
            if (r9 == 0) goto L_0x007a
            kotlinx.coroutines.sync.Mutex r9 = r0.f20591f
            kotlinx.coroutines.sync.Mutex.DefaultImpls.c(r9, r4, r3, r4)
        L_0x007a:
            return r10
        L_0x007b:
            throw r1     // Catch:{ all -> 0x007c }
        L_0x007c:
            r10 = move-exception
            goto L_0x0092
        L_0x007e:
            r9 = move-exception
            r0 = r8
            r1 = r2
            r7 = r10
            r10 = r9
            r9 = r7
        L_0x0084:
            r1.close()     // Catch:{ all -> 0x0088 }
            goto L_0x008c
        L_0x0088:
            r1 = move-exception
            kotlin.ExceptionsKt.a(r10, r1)     // Catch:{ all -> 0x007c }
        L_0x008c:
            throw r10     // Catch:{ all -> 0x007c }
        L_0x008d:
            r9 = move-exception
            r0 = r8
            r7 = r10
            r10 = r9
            r9 = r7
        L_0x0092:
            if (r9 == 0) goto L_0x0099
            kotlinx.coroutines.sync.Mutex r9 = r0.f20591f
            kotlinx.coroutines.sync.Mutex.DefaultImpls.c(r9, r4, r3, r4)
        L_0x0099:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.FileStorageConnection.e(kotlin.jvm.functions.Function3, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void g(File file) {
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                throw new IOException("Unable to create parent directories of " + file);
            }
        }
    }
}
