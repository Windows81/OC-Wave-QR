package okhttp3;

import java.io.Closeable;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import okio.Options;
import okio.Source;
import okio.Timeout;

@Metadata
public final class MultipartReader implements Closeable {
    public static final Companion D = new Companion((DefaultConstructorMarker) null);
    public static final Options E;

    /* renamed from: A  reason: collision with root package name */
    public final ByteString f42707A;

    /* renamed from: B  reason: collision with root package name */
    public boolean f42708B;
    public PartSource C;

    /* renamed from: z  reason: collision with root package name */
    public final BufferedSource f42709z;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    @Metadata
    public static final class Part implements Closeable {

        /* renamed from: z  reason: collision with root package name */
        public final BufferedSource f42710z;

        public void close() {
            this.f42710z.close();
        }
    }

    @Metadata
    public final class PartSource implements Source {

        /* renamed from: A  reason: collision with root package name */
        public final /* synthetic */ MultipartReader f42711A;

        /* renamed from: z  reason: collision with root package name */
        public final Timeout f42712z;

        public void close() {
            if (Intrinsics.d(this.f42711A.C, this)) {
                this.f42711A.C = null;
            }
        }

        public long o1(Buffer buffer, long j2) {
            Buffer buffer2 = buffer;
            long j3 = j2;
            Intrinsics.i(buffer2, "sink");
            if (j3 < 0) {
                throw new IllegalArgumentException(("byteCount < 0: " + j3).toString());
            } else if (Intrinsics.d(this.f42711A.C, this)) {
                Timeout u2 = this.f42711A.f42709z.u();
                Timeout timeout = this.f42712z;
                MultipartReader multipartReader = this.f42711A;
                long i2 = u2.i();
                long a2 = Timeout.f43453e.a(timeout.i(), u2.i());
                TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                u2.h(a2, timeUnit);
                if (u2.f()) {
                    long d2 = u2.d();
                    if (timeout.f()) {
                        u2.e(Math.min(u2.d(), timeout.d()));
                    }
                    try {
                        long a3 = multipartReader.f(j3);
                        long o1 = a3 == 0 ? -1 : multipartReader.f42709z.o1(buffer2, a3);
                        u2.h(i2, timeUnit);
                        if (timeout.f()) {
                            u2.e(d2);
                        }
                        return o1;
                    } catch (Throwable th) {
                        u2.h(i2, TimeUnit.NANOSECONDS);
                        if (timeout.f()) {
                            u2.e(d2);
                        }
                        throw th;
                    }
                } else {
                    if (timeout.f()) {
                        u2.e(timeout.d());
                    }
                    try {
                        long a4 = multipartReader.f(j3);
                        long o12 = a4 == 0 ? -1 : multipartReader.f42709z.o1(buffer2, a4);
                        u2.h(i2, timeUnit);
                        if (timeout.f()) {
                            u2.b();
                        }
                        return o12;
                    } catch (Throwable th2) {
                        u2.h(i2, TimeUnit.NANOSECONDS);
                        if (timeout.f()) {
                            u2.b();
                        }
                        throw th2;
                    }
                }
            } else {
                throw new IllegalStateException("closed");
            }
        }

        public Timeout u() {
            return this.f42712z;
        }
    }

    static {
        Options.Companion companion = Options.C;
        ByteString.Companion companion2 = ByteString.C;
        E = companion.d(companion2.d("\r\n"), companion2.d("--"), companion2.d(" "), companion2.d("\t"));
    }

    public void close() {
        if (!this.f42708B) {
            this.f42708B = true;
            this.C = null;
            this.f42709z.close();
        }
    }

    public final long f(long j2) {
        this.f42709z.v1((long) this.f42707A.N());
        long x2 = this.f42709z.s().x(this.f42707A);
        return x2 == -1 ? Math.min(j2, (this.f42709z.s().n0() - ((long) this.f42707A.N())) + 1) : Math.min(j2, x2);
    }
}
