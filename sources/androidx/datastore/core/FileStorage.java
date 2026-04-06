package androidx.datastore.core;

import java.io.File;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class FileStorage<T> implements Storage<T> {

    /* renamed from: d  reason: collision with root package name */
    public static final Companion f20578d = new Companion((DefaultConstructorMarker) null);

    /* renamed from: e  reason: collision with root package name */
    public static final Set f20579e = new LinkedHashSet();

    /* renamed from: f  reason: collision with root package name */
    public static final Object f20580f = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final Serializer f20581a;

    /* renamed from: b  reason: collision with root package name */
    public final Function1 f20582b;

    /* renamed from: c  reason: collision with root package name */
    public final Function0 f20583c;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Set a() {
            return FileStorage.f20579e;
        }

        public final Object b() {
            return FileStorage.f20580f;
        }

        public Companion() {
        }
    }

    public FileStorage(Serializer serializer, Function1 function1, Function0 function0) {
        Intrinsics.i(serializer, "serializer");
        Intrinsics.i(function1, "coordinatorProducer");
        Intrinsics.i(function0, "produceFile");
        this.f20581a = serializer;
        this.f20582b = function1;
        this.f20583c = function0;
    }

    public StorageConnection a() {
        File canonicalFile = ((File) this.f20583c.invoke()).getCanonicalFile();
        synchronized (f20580f) {
            String absolutePath = canonicalFile.getAbsolutePath();
            Set set = f20579e;
            if (!set.contains(absolutePath)) {
                Intrinsics.h(absolutePath, "path");
                set.add(absolutePath);
            } else {
                throw new IllegalStateException(("There are multiple DataStores active for the same file: " + absolutePath + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
            }
        }
        Intrinsics.h(canonicalFile, "file");
        return new FileStorageConnection(canonicalFile, this.f20581a, (InterProcessCoordinator) this.f20582b.invoke(canonicalFile), new FileStorage$createConnection$2(canonicalFile));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FileStorage(Serializer serializer, Function1 function1, Function0 function0, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(serializer, (i2 & 2) != 0 ? AnonymousClass1.f20584z : function1, function0);
    }
}
