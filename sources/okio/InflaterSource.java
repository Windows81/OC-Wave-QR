package okio;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class InflaterSource implements Source {

    /* renamed from: A  reason: collision with root package name */
    public final Inflater f43393A;

    /* renamed from: B  reason: collision with root package name */
    public int f43394B;
    public boolean C;

    /* renamed from: z  reason: collision with root package name */
    public final BufferedSource f43395z;

    public InflaterSource(BufferedSource bufferedSource, Inflater inflater) {
        Intrinsics.i(bufferedSource, "source");
        Intrinsics.i(inflater, "inflater");
        this.f43395z = bufferedSource;
        this.f43393A = inflater;
    }

    public final long a(Buffer buffer, long j2) {
        Intrinsics.i(buffer, "sink");
        int i2 = (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1));
        if (i2 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j2).toString());
        } else if (this.C) {
            throw new IllegalStateException("closed");
        } else if (i2 == 0) {
            return 0;
        } else {
            try {
                Segment t0 = buffer.t0(1);
                b();
                int inflate = this.f43393A.inflate(t0.f43432a, t0.f43434c, (int) Math.min(j2, (long) (8192 - t0.f43434c)));
                c();
                if (inflate > 0) {
                    t0.f43434c += inflate;
                    long j3 = (long) inflate;
                    buffer.m0(buffer.n0() + j3);
                    return j3;
                }
                if (t0.f43433b == t0.f43434c) {
                    buffer.f43339z = t0.b();
                    SegmentPool.b(t0);
                }
                return 0;
            } catch (DataFormatException e2) {
                throw new IOException(e2);
            }
        }
    }

    public final boolean b() {
        if (!this.f43393A.needsInput()) {
            return false;
        }
        if (this.f43395z.l0()) {
            return true;
        }
        Segment segment = this.f43395z.s().f43339z;
        Intrinsics.f(segment);
        int i2 = segment.f43434c;
        int i3 = segment.f43433b;
        int i4 = i2 - i3;
        this.f43394B = i4;
        this.f43393A.setInput(segment.f43432a, i3, i4);
        return false;
    }

    public final void c() {
        int i2 = this.f43394B;
        if (i2 != 0) {
            int remaining = i2 - this.f43393A.getRemaining();
            this.f43394B -= remaining;
            this.f43395z.skip((long) remaining);
        }
    }

    public void close() {
        if (!this.C) {
            this.f43393A.end();
            this.C = true;
            this.f43395z.close();
        }
    }

    public long o1(Buffer buffer, long j2) {
        Intrinsics.i(buffer, "sink");
        do {
            long a2 = a(buffer, j2);
            if (a2 > 0) {
                return a2;
            }
            if (this.f43393A.finished() || this.f43393A.needsDictionary()) {
                return -1;
            }
        } while (!this.f43395z.l0());
        throw new EOFException("source exhausted prematurely");
    }

    public Timeout u() {
        return this.f43395z.u();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public InflaterSource(Source source, Inflater inflater) {
        this(Okio.d(source), inflater);
        Intrinsics.i(source, "source");
        Intrinsics.i(inflater, "inflater");
    }
}
