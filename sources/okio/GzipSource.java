package okio;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class GzipSource implements Source {

    /* renamed from: A  reason: collision with root package name */
    public final RealBufferedSource f43386A;

    /* renamed from: B  reason: collision with root package name */
    public final Inflater f43387B;
    public final InflaterSource C;
    public final CRC32 D = new CRC32();

    /* renamed from: z  reason: collision with root package name */
    public byte f43388z;

    public GzipSource(Source source) {
        Intrinsics.i(source, "source");
        RealBufferedSource realBufferedSource = new RealBufferedSource(source);
        this.f43386A = realBufferedSource;
        Inflater inflater = new Inflater(true);
        this.f43387B = inflater;
        this.C = new InflaterSource((BufferedSource) realBufferedSource, inflater);
    }

    public final void a(String str, int i2, int i3) {
        if (i3 != i2) {
            String format = String.format("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(new Object[]{str, Integer.valueOf(i3), Integer.valueOf(i2)}, 3));
            Intrinsics.h(format, "format(...)");
            throw new IOException(format);
        }
    }

    public final void b() {
        this.f43386A.v1(10);
        byte r2 = this.f43386A.f43427A.r(3);
        boolean z2 = ((r2 >> 1) & 1) == 1;
        if (z2) {
            d(this.f43386A.f43427A, 0, 10);
        }
        a("ID1ID2", 8075, this.f43386A.readShort());
        this.f43386A.skip(8);
        if (((r2 >> 2) & 1) == 1) {
            this.f43386A.v1(2);
            if (z2) {
                d(this.f43386A.f43427A, 0, 2);
            }
            long l1 = (long) (this.f43386A.f43427A.l1() & 65535);
            this.f43386A.v1(l1);
            if (z2) {
                d(this.f43386A.f43427A, 0, l1);
            }
            this.f43386A.skip(l1);
        }
        if (((r2 >> 3) & 1) == 1) {
            long a2 = this.f43386A.a((byte) 0);
            if (a2 != -1) {
                if (z2) {
                    d(this.f43386A.f43427A, 0, a2 + 1);
                }
                this.f43386A.skip(a2 + 1);
            } else {
                throw new EOFException();
            }
        }
        if (((r2 >> 4) & 1) == 1) {
            long a3 = this.f43386A.a((byte) 0);
            if (a3 != -1) {
                if (z2) {
                    d(this.f43386A.f43427A, 0, a3 + 1);
                }
                this.f43386A.skip(a3 + 1);
            } else {
                throw new EOFException();
            }
        }
        if (z2) {
            a("FHCRC", this.f43386A.l1(), (short) ((int) this.D.getValue()));
            this.D.reset();
        }
    }

    public final void c() {
        a("CRC", this.f43386A.c1(), (int) this.D.getValue());
        a("ISIZE", this.f43386A.c1(), (int) this.f43387B.getBytesWritten());
    }

    public void close() {
        this.C.close();
    }

    public final void d(Buffer buffer, long j2, long j3) {
        Segment segment = buffer.f43339z;
        Intrinsics.f(segment);
        while (true) {
            int i2 = segment.f43434c;
            int i3 = segment.f43433b;
            if (j2 < ((long) (i2 - i3))) {
                break;
            }
            j2 -= (long) (i2 - i3);
            segment = segment.f43437f;
            Intrinsics.f(segment);
        }
        while (j3 > 0) {
            int i4 = (int) (((long) segment.f43433b) + j2);
            int min = (int) Math.min((long) (segment.f43434c - i4), j3);
            this.D.update(segment.f43432a, i4, min);
            j3 -= (long) min;
            segment = segment.f43437f;
            Intrinsics.f(segment);
            j2 = 0;
        }
    }

    public long o1(Buffer buffer, long j2) {
        Intrinsics.i(buffer, "sink");
        int i2 = (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1));
        if (i2 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j2).toString());
        } else if (i2 == 0) {
            return 0;
        } else {
            if (this.f43388z == 0) {
                b();
                this.f43388z = 1;
            }
            if (this.f43388z == 1) {
                long n0 = buffer.n0();
                long o1 = this.C.o1(buffer, j2);
                if (o1 != -1) {
                    d(buffer, n0, o1);
                    return o1;
                }
                this.f43388z = 2;
            }
            if (this.f43388z == 2) {
                c();
                this.f43388z = 3;
                if (!this.f43386A.l0()) {
                    throw new IOException("gzip finished without exhausting source");
                }
            }
            return -1;
        }
    }

    public Timeout u() {
        return this.f43386A.u();
    }
}
