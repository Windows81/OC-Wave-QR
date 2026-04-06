package okio;

import java.io.OutputStream;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class RealBufferedSink implements BufferedSink {

    /* renamed from: A  reason: collision with root package name */
    public final Buffer f43423A = new Buffer();

    /* renamed from: B  reason: collision with root package name */
    public boolean f43424B;

    /* renamed from: z  reason: collision with root package name */
    public final Sink f43425z;

    public RealBufferedSink(Sink sink) {
        Intrinsics.i(sink, "sink");
        this.f43425z = sink;
    }

    public BufferedSink K0(String str) {
        Intrinsics.i(str, "string");
        if (!this.f43424B) {
            this.f43423A.K0(str);
            return u0();
        }
        throw new IllegalStateException("closed");
    }

    public void N0(Buffer buffer, long j2) {
        Intrinsics.i(buffer, "source");
        if (!this.f43424B) {
            this.f43423A.N0(buffer, j2);
            u0();
            return;
        }
        throw new IllegalStateException("closed");
    }

    public long P0(Source source) {
        Intrinsics.i(source, "source");
        long j2 = 0;
        while (true) {
            long o1 = source.o1(this.f43423A, 8192);
            if (o1 == -1) {
                return j2;
            }
            j2 += o1;
            u0();
        }
    }

    public BufferedSink Q0(long j2) {
        if (!this.f43424B) {
            this.f43423A.Q0(j2);
            return u0();
        }
        throw new IllegalStateException("closed");
    }

    public BufferedSink V() {
        if (!this.f43424B) {
            long n0 = this.f43423A.n0();
            if (n0 > 0) {
                this.f43425z.N0(this.f43423A, n0);
            }
            return this;
        }
        throw new IllegalStateException("closed");
    }

    public BufferedSink a(int i2) {
        if (!this.f43424B) {
            this.f43423A.q1(i2);
            return u0();
        }
        throw new IllegalStateException("closed");
    }

    public void close() {
        if (!this.f43424B) {
            try {
                if (this.f43423A.n0() > 0) {
                    Sink sink = this.f43425z;
                    Buffer buffer = this.f43423A;
                    sink.N0(buffer, buffer.n0());
                }
                th = null;
            } catch (Throwable th) {
                th = th;
            }
            try {
                this.f43425z.close();
            } catch (Throwable th2) {
                if (th == null) {
                    th = th2;
                }
            }
            this.f43424B = true;
            if (th != null) {
                throw th;
            }
        }
    }

    public void flush() {
        if (!this.f43424B) {
            if (this.f43423A.n0() > 0) {
                Sink sink = this.f43425z;
                Buffer buffer = this.f43423A;
                sink.N0(buffer, buffer.n0());
            }
            this.f43425z.flush();
            return;
        }
        throw new IllegalStateException("closed");
    }

    public boolean isOpen() {
        return !this.f43424B;
    }

    public BufferedSink k1(ByteString byteString) {
        Intrinsics.i(byteString, "byteString");
        if (!this.f43424B) {
            this.f43423A.k1(byteString);
            return u0();
        }
        throw new IllegalStateException("closed");
    }

    public Buffer s() {
        return this.f43423A;
    }

    public String toString() {
        return "buffer(" + this.f43425z + ')';
    }

    public Timeout u() {
        return this.f43425z.u();
    }

    public BufferedSink u0() {
        if (!this.f43424B) {
            long f2 = this.f43423A.f();
            if (f2 > 0) {
                this.f43425z.N0(this.f43423A, f2);
            }
            return this;
        }
        throw new IllegalStateException("closed");
    }

    public int write(ByteBuffer byteBuffer) {
        Intrinsics.i(byteBuffer, "source");
        if (!this.f43424B) {
            int write = this.f43423A.write(byteBuffer);
            u0();
            return write;
        }
        throw new IllegalStateException("closed");
    }

    public BufferedSink writeByte(int i2) {
        if (!this.f43424B) {
            this.f43423A.writeByte(i2);
            return u0();
        }
        throw new IllegalStateException("closed");
    }

    public BufferedSink writeInt(int i2) {
        if (!this.f43424B) {
            this.f43423A.writeInt(i2);
            return u0();
        }
        throw new IllegalStateException("closed");
    }

    public BufferedSink writeShort(int i2) {
        if (!this.f43424B) {
            this.f43423A.writeShort(i2);
            return u0();
        }
        throw new IllegalStateException("closed");
    }

    public BufferedSink x1(long j2) {
        if (!this.f43424B) {
            this.f43423A.x1(j2);
            return u0();
        }
        throw new IllegalStateException("closed");
    }

    public OutputStream y1() {
        return new RealBufferedSink$outputStream$1(this);
    }

    public BufferedSink write(byte[] bArr) {
        Intrinsics.i(bArr, "source");
        if (!this.f43424B) {
            this.f43423A.write(bArr);
            return u0();
        }
        throw new IllegalStateException("closed");
    }

    public BufferedSink write(byte[] bArr, int i2, int i3) {
        Intrinsics.i(bArr, "source");
        if (!this.f43424B) {
            this.f43423A.write(bArr, i2, i3);
            return u0();
        }
        throw new IllegalStateException("closed");
    }
}
