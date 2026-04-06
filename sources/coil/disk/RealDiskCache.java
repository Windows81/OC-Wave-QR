package coil.disk;

import coil.disk.DiskCache;
import coil.disk.DiskLruCache;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineDispatcher;
import okio.ByteString;
import okio.FileSystem;
import okio.Path;

@Metadata
public final class RealDiskCache implements DiskCache {

    /* renamed from: e  reason: collision with root package name */
    public static final Companion f23421e = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final long f23422a;

    /* renamed from: b  reason: collision with root package name */
    public final Path f23423b;

    /* renamed from: c  reason: collision with root package name */
    public final FileSystem f23424c;

    /* renamed from: d  reason: collision with root package name */
    public final DiskLruCache f23425d;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    @Metadata
    public static final class RealEditor implements DiskCache.Editor {

        /* renamed from: a  reason: collision with root package name */
        public final DiskLruCache.Editor f23426a;

        public RealEditor(DiskLruCache.Editor editor) {
            this.f23426a = editor;
        }

        public void a() {
            this.f23426a.a();
        }

        /* renamed from: b */
        public RealSnapshot w() {
            DiskLruCache.Snapshot c2 = this.f23426a.c();
            if (c2 != null) {
                return new RealSnapshot(c2);
            }
            return null;
        }

        public Path getData() {
            return this.f23426a.f(1);
        }

        public Path v() {
            return this.f23426a.f(0);
        }
    }

    @Metadata
    public static final class RealSnapshot implements DiskCache.Snapshot {

        /* renamed from: z  reason: collision with root package name */
        public final DiskLruCache.Snapshot f23427z;

        public RealSnapshot(DiskLruCache.Snapshot snapshot) {
            this.f23427z = snapshot;
        }

        /* renamed from: a */
        public RealEditor B0() {
            DiskLruCache.Editor a2 = this.f23427z.a();
            if (a2 != null) {
                return new RealEditor(a2);
            }
            return null;
        }

        public void close() {
            this.f23427z.close();
        }

        public Path getData() {
            return this.f23427z.b(1);
        }

        public Path v() {
            return this.f23427z.b(0);
        }
    }

    public RealDiskCache(long j2, Path path, FileSystem fileSystem, CoroutineDispatcher coroutineDispatcher) {
        this.f23422a = j2;
        this.f23423b = path;
        this.f23424c = fileSystem;
        this.f23425d = new DiskLruCache(c(), d(), coroutineDispatcher, e(), 1, 2);
    }

    public DiskCache.Editor a(String str) {
        DiskLruCache.Editor E = this.f23425d.E(f(str));
        if (E != null) {
            return new RealEditor(E);
        }
        return null;
    }

    public DiskCache.Snapshot b(String str) {
        DiskLruCache.Snapshot F = this.f23425d.F(f(str));
        if (F != null) {
            return new RealSnapshot(F);
        }
        return null;
    }

    public FileSystem c() {
        return this.f23424c;
    }

    public Path d() {
        return this.f23423b;
    }

    public long e() {
        return this.f23422a;
    }

    public final String f(String str) {
        return ByteString.C.d(str).M().p();
    }
}
