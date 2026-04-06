package okio;

import java.io.IOException;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
class InputStreamSource implements Source {

    /* renamed from: A  reason: collision with root package name */
    public final Timeout f43396A;

    /* renamed from: z  reason: collision with root package name */
    public final InputStream f43397z;

    public InputStreamSource(InputStream inputStream, Timeout timeout) {
        Intrinsics.i(inputStream, "input");
        Intrinsics.i(timeout, "timeout");
        this.f43397z = inputStream;
        this.f43396A = timeout;
    }

    public void close() {
        this.f43397z.close();
    }

    public long o1(Buffer buffer, long j2) {
        Intrinsics.i(buffer, "sink");
        int i2 = (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1));
        if (i2 == 0) {
            return 0;
        }
        if (i2 >= 0) {
            try {
                this.f43396A.g();
                Segment t0 = buffer.t0(1);
                int read = this.f43397z.read(t0.f43432a, t0.f43434c, (int) Math.min(j2, (long) (8192 - t0.f43434c)));
                if (read != -1) {
                    t0.f43434c += read;
                    long j3 = (long) read;
                    buffer.m0(buffer.n0() + j3);
                    return j3;
                } else if (t0.f43433b != t0.f43434c) {
                    return -1;
                } else {
                    buffer.f43339z = t0.b();
                    SegmentPool.b(t0);
                    return -1;
                }
            } catch (AssertionError e2) {
                if (Okio.e(e2)) {
                    throw new IOException(e2);
                }
                throw e2;
            }
        } else {
            throw new IllegalArgumentException(("byteCount < 0: " + j2).toString());
        }
    }

    public String toString() {
        return "source(" + this.f43397z + ')';
    }

    public Timeout u() {
        return this.f43396A;
    }
}
