package coil.disk;

import android.os.StatFs;
import java.io.Closeable;
import java.io.File;
import kotlin.Metadata;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import okio.FileSystem;
import okio.Path;

@Metadata
public interface DiskCache {

    @Metadata
    public static final class Builder {

        /* renamed from: a  reason: collision with root package name */
        public Path f23392a;

        /* renamed from: b  reason: collision with root package name */
        public FileSystem f23393b = FileSystem.f43375b;

        /* renamed from: c  reason: collision with root package name */
        public double f23394c = 0.02d;

        /* renamed from: d  reason: collision with root package name */
        public long f23395d = 10485760;

        /* renamed from: e  reason: collision with root package name */
        public long f23396e = 262144000;

        /* renamed from: f  reason: collision with root package name */
        public long f23397f;

        /* renamed from: g  reason: collision with root package name */
        public CoroutineDispatcher f23398g = Dispatchers.b();

        public final DiskCache a() {
            long j2;
            Path path = this.f23392a;
            if (path != null) {
                if (this.f23394c > 0.0d) {
                    try {
                        File z2 = path.z();
                        z2.mkdir();
                        StatFs statFs = new StatFs(z2.getAbsolutePath());
                        j2 = RangesKt.q((long) (this.f23394c * ((double) statFs.getBlockCountLong()) * ((double) statFs.getBlockSizeLong())), this.f23395d, this.f23396e);
                    } catch (Exception unused) {
                        j2 = this.f23395d;
                    }
                } else {
                    j2 = this.f23397f;
                }
                return new RealDiskCache(j2, path, this.f23393b, this.f23398g);
            }
            throw new IllegalStateException("directory == null");
        }

        public final Builder b(File file) {
            return c(Path.Companion.d(Path.f43404A, file, false, 1, (Object) null));
        }

        public final Builder c(Path path) {
            this.f23392a = path;
            return this;
        }
    }

    @Metadata
    public interface Editor {
        void a();

        Path getData();

        Path v();

        Snapshot w();
    }

    @Metadata
    public interface Snapshot extends Closeable {
        Editor B0();

        Path getData();

        Path v();
    }

    Editor a(String str);

    Snapshot b(String str);

    FileSystem c();
}
