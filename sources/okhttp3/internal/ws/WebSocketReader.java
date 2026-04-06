package okhttp3.internal.ws;

import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.Util;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;

@Metadata
public final class WebSocketReader implements Closeable {

    /* renamed from: A  reason: collision with root package name */
    public final BufferedSource f43301A;

    /* renamed from: B  reason: collision with root package name */
    public final FrameCallback f43302B;
    public final boolean C;
    public final boolean D;
    public boolean E;
    public int F;
    public long G;
    public boolean H;
    public boolean I;
    public boolean J;
    public final Buffer K = new Buffer();
    public final Buffer L = new Buffer();
    public MessageInflater M;
    public final byte[] N;
    public final Buffer.UnsafeCursor O;

    /* renamed from: z  reason: collision with root package name */
    public final boolean f43303z;

    @Metadata
    public interface FrameCallback {
        void a(ByteString byteString);

        void b(String str);

        void c(ByteString byteString);

        void d(ByteString byteString);

        void e(int i2, String str);
    }

    public WebSocketReader(boolean z2, BufferedSource bufferedSource, FrameCallback frameCallback, boolean z3, boolean z4) {
        Intrinsics.i(bufferedSource, "source");
        Intrinsics.i(frameCallback, "frameCallback");
        this.f43303z = z2;
        this.f43301A = bufferedSource;
        this.f43302B = frameCallback;
        this.C = z3;
        this.D = z4;
        Buffer.UnsafeCursor unsafeCursor = null;
        this.N = z2 ? null : new byte[4];
        this.O = !z2 ? new Buffer.UnsafeCursor() : unsafeCursor;
    }

    public final void a() {
        c();
        if (this.I) {
            b();
        } else {
            f();
        }
    }

    public final void b() {
        String str;
        short s2;
        long j2 = this.G;
        if (j2 > 0) {
            this.f43301A.q0(this.K, j2);
            if (!this.f43303z) {
                Buffer buffer = this.K;
                Buffer.UnsafeCursor unsafeCursor = this.O;
                Intrinsics.f(unsafeCursor);
                buffer.O(unsafeCursor);
                this.O.d(0);
                WebSocketProtocol webSocketProtocol = WebSocketProtocol.f43300a;
                Buffer.UnsafeCursor unsafeCursor2 = this.O;
                byte[] bArr = this.N;
                Intrinsics.f(bArr);
                webSocketProtocol.b(unsafeCursor2, bArr);
                this.O.close();
            }
        }
        switch (this.F) {
            case 8:
                long n0 = this.K.n0();
                if (n0 != 1) {
                    if (n0 != 0) {
                        s2 = this.K.readShort();
                        str = this.K.e0();
                        String a2 = WebSocketProtocol.f43300a.a(s2);
                        if (a2 != null) {
                            throw new ProtocolException(a2);
                        }
                    } else {
                        s2 = 1005;
                        str = "";
                    }
                    this.f43302B.e(s2, str);
                    this.E = true;
                    return;
                }
                throw new ProtocolException("Malformed close payload length of 1.");
            case 9:
                this.f43302B.c(this.K.X());
                return;
            case 10:
                this.f43302B.d(this.K.X());
                return;
            default:
                throw new ProtocolException("Unknown control opcode: " + Util.R(this.F));
        }
    }

    /* JADX INFO: finally extract failed */
    public final void c() {
        boolean z2;
        if (!this.E) {
            long i2 = this.f43301A.u().i();
            this.f43301A.u().c();
            try {
                int d2 = Util.d(this.f43301A.readByte(), 255);
                this.f43301A.u().h(i2, TimeUnit.NANOSECONDS);
                int i3 = d2 & 15;
                this.F = i3;
                boolean z3 = false;
                boolean z4 = (d2 & 128) != 0;
                this.H = z4;
                boolean z5 = (d2 & 8) != 0;
                this.I = z5;
                if (!z5 || z4) {
                    boolean z6 = (d2 & 64) != 0;
                    if (i3 == 1 || i3 == 2) {
                        if (!z6) {
                            z2 = false;
                        } else if (this.C) {
                            z2 = true;
                        } else {
                            throw new ProtocolException("Unexpected rsv1 flag");
                        }
                        this.J = z2;
                    } else if (z6) {
                        throw new ProtocolException("Unexpected rsv1 flag");
                    }
                    if ((d2 & 32) != 0) {
                        throw new ProtocolException("Unexpected rsv2 flag");
                    } else if ((d2 & 16) == 0) {
                        int d3 = Util.d(this.f43301A.readByte(), 255);
                        if ((d3 & 128) != 0) {
                            z3 = true;
                        }
                        if (z3 == this.f43303z) {
                            throw new ProtocolException(this.f43303z ? "Server-sent frames must not be masked." : "Client-sent frames must be masked.");
                        }
                        long j2 = (long) (d3 & 127);
                        this.G = j2;
                        if (j2 == 126) {
                            this.G = (long) Util.e(this.f43301A.readShort(), 65535);
                        } else if (j2 == 127) {
                            long readLong = this.f43301A.readLong();
                            this.G = readLong;
                            if (readLong < 0) {
                                throw new ProtocolException("Frame length 0x" + Util.S(this.G) + " > 0x7FFFFFFFFFFFFFFF");
                            }
                        }
                        if (this.I && this.G > 125) {
                            throw new ProtocolException("Control frame must be less than 125B.");
                        } else if (z3) {
                            BufferedSource bufferedSource = this.f43301A;
                            byte[] bArr = this.N;
                            Intrinsics.f(bArr);
                            bufferedSource.readFully(bArr);
                        }
                    } else {
                        throw new ProtocolException("Unexpected rsv3 flag");
                    }
                } else {
                    throw new ProtocolException("Control frames must be final.");
                }
            } catch (Throwable th) {
                this.f43301A.u().h(i2, TimeUnit.NANOSECONDS);
                throw th;
            }
        } else {
            throw new IOException("closed");
        }
    }

    public void close() {
        MessageInflater messageInflater = this.M;
        if (messageInflater != null) {
            messageInflater.close();
        }
    }

    public final void d() {
        while (!this.E) {
            long j2 = this.G;
            if (j2 > 0) {
                this.f43301A.q0(this.L, j2);
                if (!this.f43303z) {
                    Buffer buffer = this.L;
                    Buffer.UnsafeCursor unsafeCursor = this.O;
                    Intrinsics.f(unsafeCursor);
                    buffer.O(unsafeCursor);
                    this.O.d(this.L.n0() - this.G);
                    WebSocketProtocol webSocketProtocol = WebSocketProtocol.f43300a;
                    Buffer.UnsafeCursor unsafeCursor2 = this.O;
                    byte[] bArr = this.N;
                    Intrinsics.f(bArr);
                    webSocketProtocol.b(unsafeCursor2, bArr);
                    this.O.close();
                }
            }
            if (!this.H) {
                g();
                if (this.F != 0) {
                    throw new ProtocolException("Expected continuation opcode. Got: " + Util.R(this.F));
                }
            } else {
                return;
            }
        }
        throw new IOException("closed");
    }

    public final void f() {
        int i2 = this.F;
        if (i2 == 1 || i2 == 2) {
            d();
            if (this.J) {
                MessageInflater messageInflater = this.M;
                if (messageInflater == null) {
                    messageInflater = new MessageInflater(this.D);
                    this.M = messageInflater;
                }
                messageInflater.a(this.L);
            }
            if (i2 == 1) {
                this.f43302B.b(this.L.e0());
            } else {
                this.f43302B.a(this.L.X());
            }
        } else {
            throw new ProtocolException("Unknown opcode: " + Util.R(i2));
        }
    }

    public final void g() {
        while (!this.E) {
            c();
            if (this.I) {
                b();
            } else {
                return;
            }
        }
    }
}
