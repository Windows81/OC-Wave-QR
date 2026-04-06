package androidx.datastore.core.okio;

import androidx.datastore.core.InterProcessCoordinator;
import androidx.datastore.core.Storage;
import androidx.datastore.core.StorageConnection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okio.FileSystem;
import okio.Path;

@Metadata
public final class OkioStorage<T> implements Storage<T> {

    /* renamed from: f  reason: collision with root package name */
    public static final Companion f20655f = new Companion((DefaultConstructorMarker) null);

    /* renamed from: g  reason: collision with root package name */
    public static final Set f20656g = new LinkedHashSet();

    /* renamed from: h  reason: collision with root package name */
    public static final Synchronizer f20657h = new Synchronizer();

    /* renamed from: a  reason: collision with root package name */
    public final FileSystem f20658a;

    /* renamed from: b  reason: collision with root package name */
    public final OkioSerializer f20659b;

    /* renamed from: c  reason: collision with root package name */
    public final Function2 f20660c;

    /* renamed from: d  reason: collision with root package name */
    public final Function0 f20661d;

    /* renamed from: e  reason: collision with root package name */
    public final Lazy f20662e;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Set a() {
            return OkioStorage.f20656g;
        }

        public final Synchronizer b() {
            return OkioStorage.f20657h;
        }

        public Companion() {
        }
    }

    public OkioStorage(FileSystem fileSystem, OkioSerializer okioSerializer, Function2 function2, Function0 function0) {
        Intrinsics.i(fileSystem, "fileSystem");
        Intrinsics.i(okioSerializer, "serializer");
        Intrinsics.i(function2, "coordinatorProducer");
        Intrinsics.i(function0, "producePath");
        this.f20658a = fileSystem;
        this.f20659b = okioSerializer;
        this.f20660c = function2;
        this.f20661d = function0;
        this.f20662e = LazyKt.b(new OkioStorage$canonicalPath$2(this));
    }

    public StorageConnection a() {
        String path = f().toString();
        synchronized (f20657h) {
            Set set = f20656g;
            if (!set.contains(path)) {
                set.add(path);
            } else {
                throw new IllegalStateException(("There are multiple DataStores active for the same file: " + path + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
            }
        }
        return new OkioStorageConnection(this.f20658a, f(), this.f20659b, (InterProcessCoordinator) this.f20660c.m(f(), this.f20658a), new OkioStorage$createConnection$2(this));
    }

    public final Path f() {
        return (Path) this.f20662e.getValue();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ OkioStorage(FileSystem fileSystem, OkioSerializer okioSerializer, Function2 function2, Function0 function0, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(fileSystem, okioSerializer, (i2 & 4) != 0 ? AnonymousClass1.f20663z : function2, function0);
    }
}
