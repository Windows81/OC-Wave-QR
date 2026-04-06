package okio;

import java.util.zip.CRC32;
import java.util.zip.Deflater;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class GzipSink implements Sink {

    /* renamed from: A  reason: collision with root package name */
    public final Deflater f43383A;

    /* renamed from: B  reason: collision with root package name */
    public final DeflaterSink f43384B;
    public boolean C;
    public final CRC32 D;

    /* renamed from: z  reason: collision with root package name */
    public final RealBufferedSink f43385z;

    public void N0(Buffer buffer, long j2) {
        Intrinsics.i(buffer, "source");
        int i2 = (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1));
        if (i2 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j2).toString());
        } else if (i2 != 0) {
            a(buffer, j2);
            this.f43384B.N0(buffer, j2);
        }
    }

    public final void a(Buffer buffer, long j2) {
        Segment segment = buffer.f43339z;
        Intrinsics.f(segment);
        while (j2 > 0) {
            int min = (int) Math.min(j2, (long) (segment.f43434c - segment.f43433b));
            this.D.update(segment.f43432a, segment.f43433b, min);
            j2 -= (long) min;
            segment = segment.f43437f;
            Intrinsics.f(segment);
        }
    }

    public final void b() {
        this.f43385z.a((int) this.D.getValue());
        this.f43385z.a((int) this.f43383A.getBytesRead());
    }

    public void close() {
        if (!this.C) {
            try {
                this.f43384B.b();
                b();
                th = null;
            } catch (Throwable th) {
                th = th;
            }
            try {
                this.f43383A.end();
            } catch (Throwable th2) {
                if (th == null) {
                    th = th2;
                }
            }
            try {
                this.f43385z.close();
            } catch (Throwable th3) {
                if (th == null) {
                    th = th3;
                }
            }
            this.C = true;
            if (th != null) {
                throw th;
            }
        }
    }

    public void flush() {
        this.f43384B.flush();
    }

    public Timeout u() {
        return this.f43385z.u();
    }
}
