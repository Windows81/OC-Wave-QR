package okio;

import javax.crypto.Cipher;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class CipherSource implements Source {

    /* renamed from: A  reason: collision with root package name */
    public final Cipher f43351A;

    /* renamed from: B  reason: collision with root package name */
    public final int f43352B;
    public final Buffer C;
    public boolean D;
    public boolean E;

    /* renamed from: z  reason: collision with root package name */
    public final BufferedSource f43353z;

    public final void a() {
        int outputSize = this.f43351A.getOutputSize(0);
        if (outputSize != 0) {
            Segment t0 = this.C.t0(outputSize);
            int doFinal = this.f43351A.doFinal(t0.f43432a, t0.f43433b);
            t0.f43434c += doFinal;
            Buffer buffer = this.C;
            buffer.m0(buffer.n0() + ((long) doFinal));
            if (t0.f43433b == t0.f43434c) {
                this.C.f43339z = t0.b();
                SegmentPool.b(t0);
            }
        }
    }

    public final void b() {
        while (this.C.n0() == 0 && !this.D) {
            if (this.f43353z.l0()) {
                this.D = true;
                a();
                return;
            }
            c();
        }
    }

    public final void c() {
        Segment segment = this.f43353z.s().f43339z;
        Intrinsics.f(segment);
        int i2 = segment.f43434c - segment.f43433b;
        int outputSize = this.f43351A.getOutputSize(i2);
        while (outputSize > 8192) {
            int i3 = this.f43352B;
            if (i2 <= i3) {
                this.D = true;
                Buffer buffer = this.C;
                byte[] doFinal = this.f43351A.doFinal(this.f43353z.h0());
                Intrinsics.h(doFinal, "doFinal(...)");
                buffer.write(doFinal);
                return;
            }
            i2 -= i3;
            outputSize = this.f43351A.getOutputSize(i2);
        }
        Segment t0 = this.C.t0(outputSize);
        int update = this.f43351A.update(segment.f43432a, segment.f43433b, i2, t0.f43432a, t0.f43433b);
        this.f43353z.skip((long) i2);
        t0.f43434c += update;
        Buffer buffer2 = this.C;
        buffer2.m0(buffer2.n0() + ((long) update));
        if (t0.f43433b == t0.f43434c) {
            this.C.f43339z = t0.b();
            SegmentPool.b(t0);
        }
    }

    public void close() {
        this.E = true;
        this.f43353z.close();
    }

    public long o1(Buffer buffer, long j2) {
        Intrinsics.i(buffer, "sink");
        int i2 = (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1));
        if (i2 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j2).toString());
        } else if (this.E) {
            throw new IllegalStateException("closed");
        } else if (i2 == 0) {
            return 0;
        } else {
            b();
            return this.C.o1(buffer, j2);
        }
    }

    public Timeout u() {
        return this.f43353z.u();
    }
}
