package okio;

import javax.crypto.Cipher;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class CipherSink implements Sink {

    /* renamed from: A  reason: collision with root package name */
    public final Cipher f43348A;

    /* renamed from: B  reason: collision with root package name */
    public final int f43349B;
    public boolean C;

    /* renamed from: z  reason: collision with root package name */
    public final BufferedSink f43350z;

    public void N0(Buffer buffer, long j2) {
        Intrinsics.i(buffer, "source");
        SegmentedByteString.b(buffer.n0(), 0, j2);
        if (!this.C) {
            while (j2 > 0) {
                j2 -= (long) b(buffer, j2);
            }
            return;
        }
        throw new IllegalStateException("closed");
    }

    public final Throwable a() {
        int outputSize = this.f43348A.getOutputSize(0);
        Throwable th = null;
        if (outputSize == 0) {
            return null;
        }
        if (outputSize > 8192) {
            try {
                BufferedSink bufferedSink = this.f43350z;
                byte[] doFinal = this.f43348A.doFinal();
                Intrinsics.h(doFinal, "doFinal(...)");
                bufferedSink.write(doFinal);
                return null;
            } catch (Throwable th2) {
                return th2;
            }
        } else {
            Buffer s2 = this.f43350z.s();
            Segment t0 = s2.t0(outputSize);
            try {
                int doFinal2 = this.f43348A.doFinal(t0.f43432a, t0.f43434c);
                t0.f43434c += doFinal2;
                s2.m0(s2.n0() + ((long) doFinal2));
            } catch (Throwable th3) {
                th = th3;
            }
            if (t0.f43433b == t0.f43434c) {
                s2.f43339z = t0.b();
                SegmentPool.b(t0);
            }
            return th;
        }
    }

    public final int b(Buffer buffer, long j2) {
        Segment segment = buffer.f43339z;
        Intrinsics.f(segment);
        int min = (int) Math.min(j2, (long) (segment.f43434c - segment.f43433b));
        Buffer s2 = this.f43350z.s();
        int outputSize = this.f43348A.getOutputSize(min);
        while (outputSize > 8192) {
            int i2 = this.f43349B;
            if (min <= i2) {
                BufferedSink bufferedSink = this.f43350z;
                byte[] update = this.f43348A.update(buffer.e1(j2));
                Intrinsics.h(update, "update(...)");
                bufferedSink.write(update);
                return (int) j2;
            }
            min -= i2;
            outputSize = this.f43348A.getOutputSize(min);
        }
        Segment t0 = s2.t0(outputSize);
        int update2 = this.f43348A.update(segment.f43432a, segment.f43433b, min, t0.f43432a, t0.f43434c);
        t0.f43434c += update2;
        s2.m0(s2.n0() + ((long) update2));
        if (t0.f43433b == t0.f43434c) {
            s2.f43339z = t0.b();
            SegmentPool.b(t0);
        }
        this.f43350z.u0();
        buffer.m0(buffer.n0() - ((long) min));
        int i3 = segment.f43433b + min;
        segment.f43433b = i3;
        if (i3 == segment.f43434c) {
            buffer.f43339z = segment.b();
            SegmentPool.b(segment);
        }
        return min;
    }

    public void close() {
        if (!this.C) {
            this.C = true;
            Throwable a2 = a();
            try {
                this.f43350z.close();
            } catch (Throwable th) {
                if (a2 == null) {
                    a2 = th;
                }
            }
            if (a2 != null) {
                throw a2;
            }
        }
    }

    public void flush() {
        this.f43350z.flush();
    }

    public Timeout u() {
        return this.f43350z.u();
    }
}
