package okio;

import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import okio.internal.Buffer;

@Metadata
public final class RealBufferedSource implements BufferedSource {

    /* renamed from: A  reason: collision with root package name */
    public final Buffer f43427A = new Buffer();

    /* renamed from: B  reason: collision with root package name */
    public boolean f43428B;

    /* renamed from: z  reason: collision with root package name */
    public final Source f43429z;

    public RealBufferedSource(Source source) {
        Intrinsics.i(source, "source");
        this.f43429z = source;
    }

    public long A1() {
        v1(1);
        int i2 = 0;
        while (true) {
            int i3 = i2 + 1;
            if (!V0((long) i3)) {
                break;
            }
            byte r2 = this.f43427A.r((long) i2);
            if ((r2 >= 48 && r2 <= 57) || ((r2 >= 97 && r2 <= 102) || (r2 >= 65 && r2 <= 70))) {
                i2 = i3;
            } else if (i2 == 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("Expected leading [0-9a-fA-F] character but was 0x");
                String num = Integer.toString(r2, CharsKt.a(16));
                Intrinsics.h(num, "toString(...)");
                sb.append(num);
                throw new NumberFormatException(sb.toString());
            }
        }
        return this.f43427A.A1();
    }

    public InputStream B1() {
        return new RealBufferedSource$inputStream$1(this);
    }

    public int D1(Options options) {
        Intrinsics.i(options, "options");
        if (!this.f43428B) {
            while (true) {
                int e2 = Buffer.e(this.f43427A, options, true);
                if (e2 == -2) {
                    if (this.f43429z.o1(this.f43427A, 8192) == -1) {
                        break;
                    }
                } else if (e2 != -1) {
                    this.f43427A.skip((long) options.n()[e2].N());
                    return e2;
                }
            }
            return -1;
        }
        throw new IllegalStateException("closed");
    }

    public String M(long j2) {
        v1(j2);
        return this.f43427A.M(j2);
    }

    public String M0(Charset charset) {
        Intrinsics.i(charset, "charset");
        this.f43427A.P0(this.f43429z);
        return this.f43427A.M0(charset);
    }

    public ByteString R(long j2) {
        v1(j2);
        return this.f43427A.R(j2);
    }

    public boolean V0(long j2) {
        if (j2 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j2).toString());
        } else if (!this.f43428B) {
            while (this.f43427A.n0() < j2) {
                if (this.f43429z.o1(this.f43427A, 8192) == -1) {
                    return false;
                }
            }
            return true;
        } else {
            throw new IllegalStateException("closed");
        }
    }

    public long a(byte b2) {
        return b(b2, 0, Long.MAX_VALUE);
    }

    public String a1() {
        return x0(Long.MAX_VALUE);
    }

    public long b(byte b2, long j2, long j3) {
        if (this.f43428B) {
            throw new IllegalStateException("closed");
        } else if (0 > j2 || j2 > j3) {
            throw new IllegalArgumentException(("fromIndex=" + j2 + " toIndex=" + j3).toString());
        } else {
            while (j2 < j3) {
                long t2 = this.f43427A.t(b2, j2, j3);
                if (t2 != -1) {
                    return t2;
                }
                long n0 = this.f43427A.n0();
                if (n0 >= j3 || this.f43429z.o1(this.f43427A, 8192) == -1) {
                    return -1;
                }
                j2 = Math.max(j2, n0);
            }
            return -1;
        }
    }

    public int c1() {
        v1(4);
        return this.f43427A.c1();
    }

    public void close() {
        if (!this.f43428B) {
            this.f43428B = true;
            this.f43429z.close();
            this.f43427A.b();
        }
    }

    public byte[] e1(long j2) {
        v1(j2);
        return this.f43427A.e1(j2);
    }

    public byte[] h0() {
        this.f43427A.P0(this.f43429z);
        return this.f43427A.h0();
    }

    public boolean isOpen() {
        return !this.f43428B;
    }

    public boolean l0() {
        if (!this.f43428B) {
            return this.f43427A.l0() && this.f43429z.o1(this.f43427A, 8192) == -1;
        }
        throw new IllegalStateException("closed");
    }

    public short l1() {
        v1(2);
        return this.f43427A.l1();
    }

    public long o1(Buffer buffer, long j2) {
        Intrinsics.i(buffer, "sink");
        if (j2 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j2).toString());
        } else if (this.f43428B) {
            throw new IllegalStateException("closed");
        } else if (this.f43427A.n0() == 0 && this.f43429z.o1(this.f43427A, 8192) == -1) {
            return -1;
        } else {
            return this.f43427A.o1(buffer, Math.min(j2, this.f43427A.n0()));
        }
    }

    public long p1() {
        v1(8);
        return this.f43427A.p1();
    }

    public BufferedSource peek() {
        return Okio.d(new PeekSource(this));
    }

    public void q0(Buffer buffer, long j2) {
        Intrinsics.i(buffer, "sink");
        try {
            v1(j2);
            this.f43427A.q0(buffer, j2);
        } catch (EOFException e2) {
            buffer.P0(this.f43427A);
            throw e2;
        }
    }

    public long r1(Sink sink) {
        Intrinsics.i(sink, "sink");
        long j2 = 0;
        while (this.f43429z.o1(this.f43427A, 8192) != -1) {
            long f2 = this.f43427A.f();
            if (f2 > 0) {
                j2 += f2;
                sink.N0(this.f43427A, f2);
            }
        }
        if (this.f43427A.n0() <= 0) {
            return j2;
        }
        long n0 = j2 + this.f43427A.n0();
        Buffer buffer = this.f43427A;
        sink.N0(buffer, buffer.n0());
        return n0;
    }

    public int read(ByteBuffer byteBuffer) {
        Intrinsics.i(byteBuffer, "sink");
        if (this.f43427A.n0() == 0 && this.f43429z.o1(this.f43427A, 8192) == -1) {
            return -1;
        }
        return this.f43427A.read(byteBuffer);
    }

    public byte readByte() {
        v1(1);
        return this.f43427A.readByte();
    }

    public void readFully(byte[] bArr) {
        Intrinsics.i(bArr, "sink");
        try {
            v1((long) bArr.length);
            this.f43427A.readFully(bArr);
        } catch (EOFException e2) {
            int i2 = 0;
            while (this.f43427A.n0() > 0) {
                Buffer buffer = this.f43427A;
                int read = buffer.read(bArr, i2, (int) buffer.n0());
                if (read != -1) {
                    i2 += read;
                } else {
                    throw new AssertionError();
                }
            }
            throw e2;
        }
    }

    public int readInt() {
        v1(4);
        return this.f43427A.readInt();
    }

    public long readLong() {
        v1(8);
        return this.f43427A.readLong();
    }

    public short readShort() {
        v1(2);
        return this.f43427A.readShort();
    }

    public Buffer s() {
        return this.f43427A;
    }

    public void skip(long j2) {
        if (!this.f43428B) {
            while (j2 > 0) {
                if (this.f43427A.n0() == 0 && this.f43429z.o1(this.f43427A, 8192) == -1) {
                    throw new EOFException();
                }
                long min = Math.min(j2, this.f43427A.n0());
                this.f43427A.skip(min);
                j2 -= min;
            }
            return;
        }
        throw new IllegalStateException("closed");
    }

    public String toString() {
        return "buffer(" + this.f43429z + ')';
    }

    public Timeout u() {
        return this.f43429z.u();
    }

    public long v0() {
        int i2;
        v1(1);
        long j2 = 0;
        while (true) {
            long j3 = j2 + 1;
            if (!V0(j3)) {
                break;
            }
            byte r2 = this.f43427A.r(j2);
            if ((r2 >= 48 && r2 <= 57) || (j2 == 0 && r2 == 45)) {
                j2 = j3;
            } else if (i2 == 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("Expected a digit or '-' but was 0x");
                String num = Integer.toString(r2, CharsKt.a(16));
                Intrinsics.h(num, "toString(...)");
                sb.append(num);
                throw new NumberFormatException(sb.toString());
            }
        }
        return this.f43427A.v0();
    }

    public void v1(long j2) {
        if (!V0(j2)) {
            throw new EOFException();
        }
    }

    public String x0(long j2) {
        if (j2 >= 0) {
            long j3 = j2 == Long.MAX_VALUE ? Long.MAX_VALUE : j2 + 1;
            long b2 = b((byte) 10, 0, j3);
            if (b2 != -1) {
                return Buffer.d(this.f43427A, b2);
            }
            if (j3 < Long.MAX_VALUE && V0(j3) && this.f43427A.r(j3 - 1) == 13 && V0(1 + j3) && this.f43427A.r(j3) == 10) {
                return Buffer.d(this.f43427A, j3);
            }
            Buffer buffer = new Buffer();
            Buffer buffer2 = this.f43427A;
            buffer2.j(buffer, 0, Math.min((long) 32, buffer2.n0()));
            throw new EOFException("\\n not found: limit=" + Math.min(this.f43427A.n0(), j2) + " content=" + buffer.X().p() + 8230);
        }
        throw new IllegalArgumentException(("limit < 0: " + j2).toString());
    }
}
