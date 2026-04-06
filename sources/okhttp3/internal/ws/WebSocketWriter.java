package okhttp3.internal.ws;

import java.io.Closeable;
import java.io.IOException;
import java.util.Random;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okio.Buffer;
import okio.BufferedSink;
import okio.ByteString;

@Metadata
public final class WebSocketWriter implements Closeable {

    /* renamed from: A  reason: collision with root package name */
    public final BufferedSink f43304A;

    /* renamed from: B  reason: collision with root package name */
    public final Random f43305B;
    public final boolean C;
    public final boolean D;
    public final long E;
    public final Buffer F = new Buffer();
    public final Buffer G;
    public boolean H;
    public MessageDeflater I;
    public final byte[] J;
    public final Buffer.UnsafeCursor K;

    /* renamed from: z  reason: collision with root package name */
    public final boolean f43306z;

    public WebSocketWriter(boolean z2, BufferedSink bufferedSink, Random random, boolean z3, boolean z4, long j2) {
        Intrinsics.i(bufferedSink, "sink");
        Intrinsics.i(random, "random");
        this.f43306z = z2;
        this.f43304A = bufferedSink;
        this.f43305B = random;
        this.C = z3;
        this.D = z4;
        this.E = j2;
        this.G = bufferedSink.s();
        Buffer.UnsafeCursor unsafeCursor = null;
        this.J = z2 ? new byte[4] : null;
        this.K = z2 ? new Buffer.UnsafeCursor() : unsafeCursor;
    }

    public final void a(int i2, ByteString byteString) {
        ByteString byteString2 = ByteString.D;
        if (!(i2 == 0 && byteString == null)) {
            if (i2 != 0) {
                WebSocketProtocol.f43300a.c(i2);
            }
            Buffer buffer = new Buffer();
            buffer.writeShort(i2);
            if (byteString != null) {
                buffer.k1(byteString);
            }
            byteString2 = buffer.X();
        }
        try {
            b(8, byteString2);
        } finally {
            this.H = true;
        }
    }

    public final void b(int i2, ByteString byteString) {
        if (!this.H) {
            int N = byteString.N();
            if (((long) N) <= 125) {
                this.G.writeByte(i2 | 128);
                if (this.f43306z) {
                    this.G.writeByte(N | 128);
                    Random random = this.f43305B;
                    byte[] bArr = this.J;
                    Intrinsics.f(bArr);
                    random.nextBytes(bArr);
                    this.G.write(this.J);
                    if (N > 0) {
                        long n0 = this.G.n0();
                        this.G.k1(byteString);
                        Buffer buffer = this.G;
                        Buffer.UnsafeCursor unsafeCursor = this.K;
                        Intrinsics.f(unsafeCursor);
                        buffer.O(unsafeCursor);
                        this.K.d(n0);
                        WebSocketProtocol.f43300a.b(this.K, this.J);
                        this.K.close();
                    }
                } else {
                    this.G.writeByte(N);
                    this.G.k1(byteString);
                }
                this.f43304A.flush();
                return;
            }
            throw new IllegalArgumentException("Payload size must be less than or equal to 125");
        }
        throw new IOException("closed");
    }

    public final void c(int i2, ByteString byteString) {
        Intrinsics.i(byteString, "data");
        if (!this.H) {
            this.F.k1(byteString);
            int i3 = i2 | 128;
            if (this.C && ((long) byteString.N()) >= this.E) {
                MessageDeflater messageDeflater = this.I;
                if (messageDeflater == null) {
                    messageDeflater = new MessageDeflater(this.D);
                    this.I = messageDeflater;
                }
                messageDeflater.a(this.F);
                i3 = i2 | 192;
            }
            long n0 = this.F.n0();
            this.G.writeByte(i3);
            int i4 = this.f43306z ? 128 : 0;
            if (n0 <= 125) {
                this.G.writeByte(i4 | ((int) n0));
            } else if (n0 <= 65535) {
                this.G.writeByte(i4 | 126);
                this.G.writeShort((int) n0);
            } else {
                this.G.writeByte(i4 | 127);
                this.G.w1(n0);
            }
            if (this.f43306z) {
                Random random = this.f43305B;
                byte[] bArr = this.J;
                Intrinsics.f(bArr);
                random.nextBytes(bArr);
                this.G.write(this.J);
                if (n0 > 0) {
                    Buffer buffer = this.F;
                    Buffer.UnsafeCursor unsafeCursor = this.K;
                    Intrinsics.f(unsafeCursor);
                    buffer.O(unsafeCursor);
                    this.K.d(0);
                    WebSocketProtocol.f43300a.b(this.K, this.J);
                    this.K.close();
                }
            }
            this.G.N0(this.F, n0);
            this.f43304A.V();
            return;
        }
        throw new IOException("closed");
    }

    public void close() {
        MessageDeflater messageDeflater = this.I;
        if (messageDeflater != null) {
            messageDeflater.close();
        }
    }

    public final void d(ByteString byteString) {
        Intrinsics.i(byteString, "payload");
        b(9, byteString);
    }

    public final void f(ByteString byteString) {
        Intrinsics.i(byteString, "payload");
        b(10, byteString);
    }
}
