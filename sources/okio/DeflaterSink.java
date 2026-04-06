package okio;

import java.io.IOException;
import java.util.zip.Deflater;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class DeflaterSink implements Sink {

    /* renamed from: A  reason: collision with root package name */
    public final Deflater f43354A;

    /* renamed from: B  reason: collision with root package name */
    public boolean f43355B;

    /* renamed from: z  reason: collision with root package name */
    public final BufferedSink f43356z;

    public DeflaterSink(BufferedSink bufferedSink, Deflater deflater) {
        Intrinsics.i(bufferedSink, "sink");
        Intrinsics.i(deflater, "deflater");
        this.f43356z = bufferedSink;
        this.f43354A = deflater;
    }

    public void N0(Buffer buffer, long j2) {
        Intrinsics.i(buffer, "source");
        SegmentedByteString.b(buffer.n0(), 0, j2);
        while (j2 > 0) {
            Segment segment = buffer.f43339z;
            Intrinsics.f(segment);
            int min = (int) Math.min(j2, (long) (segment.f43434c - segment.f43433b));
            this.f43354A.setInput(segment.f43432a, segment.f43433b, min);
            a(false);
            long j3 = (long) min;
            buffer.m0(buffer.n0() - j3);
            int i2 = segment.f43433b + min;
            segment.f43433b = i2;
            if (i2 == segment.f43434c) {
                buffer.f43339z = segment.b();
                SegmentPool.b(segment);
            }
            j2 -= j3;
        }
    }

    public final void a(boolean z2) {
        Segment t0;
        int i2;
        Buffer s2 = this.f43356z.s();
        while (true) {
            t0 = s2.t0(1);
            if (z2) {
                try {
                    Deflater deflater = this.f43354A;
                    byte[] bArr = t0.f43432a;
                    int i3 = t0.f43434c;
                    i2 = deflater.deflate(bArr, i3, 8192 - i3, 2);
                } catch (NullPointerException e2) {
                    throw new IOException("Deflater already closed", e2);
                }
            } else {
                Deflater deflater2 = this.f43354A;
                byte[] bArr2 = t0.f43432a;
                int i4 = t0.f43434c;
                i2 = deflater2.deflate(bArr2, i4, 8192 - i4);
            }
            if (i2 > 0) {
                t0.f43434c += i2;
                s2.m0(s2.n0() + ((long) i2));
                this.f43356z.u0();
            } else if (this.f43354A.needsInput()) {
                break;
            }
        }
        if (t0.f43433b == t0.f43434c) {
            s2.f43339z = t0.b();
            SegmentPool.b(t0);
        }
    }

    public final void b() {
        this.f43354A.finish();
        a(false);
    }

    public void close() {
        if (!this.f43355B) {
            try {
                b();
                th = null;
            } catch (Throwable th) {
                th = th;
            }
            try {
                this.f43354A.end();
            } catch (Throwable th2) {
                if (th == null) {
                    th = th2;
                }
            }
            try {
                this.f43356z.close();
            } catch (Throwable th3) {
                if (th == null) {
                    th = th3;
                }
            }
            this.f43355B = true;
            if (th != null) {
                throw th;
            }
        }
    }

    public void flush() {
        a(true);
        this.f43356z.flush();
    }

    public String toString() {
        return "DeflaterSink(" + this.f43356z + ')';
    }

    public Timeout u() {
        return this.f43356z.u();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public DeflaterSink(Sink sink, Deflater deflater) {
        this(Okio.c(sink), deflater);
        Intrinsics.i(sink, "sink");
        Intrinsics.i(deflater, "deflater");
    }
}
