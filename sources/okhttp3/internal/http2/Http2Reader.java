package okhttp3.internal.http2;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntProgression;
import kotlin.ranges.RangesKt;
import okhttp3.internal.Util;
import okhttp3.internal.http2.Hpack;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import okio.Source;
import okio.Timeout;

@Metadata
public final class Http2Reader implements Closeable {
    public static final Companion D = new Companion((DefaultConstructorMarker) null);
    public static final Logger E;

    /* renamed from: A  reason: collision with root package name */
    public final boolean f43124A;

    /* renamed from: B  reason: collision with root package name */
    public final ContinuationSource f43125B;
    public final Hpack.Reader C;

    /* renamed from: z  reason: collision with root package name */
    public final BufferedSource f43126z;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Logger a() {
            return Http2Reader.E;
        }

        public final int b(int i2, int i3, int i4) {
            if ((i3 & 8) != 0) {
                i2--;
            }
            if (i4 <= i2) {
                return i2 - i4;
            }
            throw new IOException("PROTOCOL_ERROR padding " + i4 + " > remaining length " + i2);
        }

        public Companion() {
        }
    }

    @Metadata
    public static final class ContinuationSource implements Source {

        /* renamed from: A  reason: collision with root package name */
        public int f43127A;

        /* renamed from: B  reason: collision with root package name */
        public int f43128B;
        public int C;
        public int D;
        public int E;

        /* renamed from: z  reason: collision with root package name */
        public final BufferedSource f43129z;

        public ContinuationSource(BufferedSource bufferedSource) {
            Intrinsics.i(bufferedSource, "source");
            this.f43129z = bufferedSource;
        }

        public final int a() {
            return this.D;
        }

        public final void b() {
            int i2 = this.C;
            int K = Util.K(this.f43129z);
            this.D = K;
            this.f43127A = K;
            int d2 = Util.d(this.f43129z.readByte(), 255);
            this.f43128B = Util.d(this.f43129z.readByte(), 255);
            Companion companion = Http2Reader.D;
            if (companion.a().isLoggable(Level.FINE)) {
                companion.a().fine(Http2.f43060a.c(true, this.C, this.f43127A, d2, this.f43128B));
            }
            int readInt = this.f43129z.readInt() & Integer.MAX_VALUE;
            this.C = readInt;
            if (d2 != 9) {
                throw new IOException(d2 + " != TYPE_CONTINUATION");
            } else if (readInt != i2) {
                throw new IOException("TYPE_CONTINUATION streamId changed");
            }
        }

        public final void c(int i2) {
            this.f43128B = i2;
        }

        public void close() {
        }

        public final void d(int i2) {
            this.D = i2;
        }

        public final void f(int i2) {
            this.f43127A = i2;
        }

        public final void g(int i2) {
            this.E = i2;
        }

        public final void j(int i2) {
            this.C = i2;
        }

        public long o1(Buffer buffer, long j2) {
            Intrinsics.i(buffer, "sink");
            while (true) {
                int i2 = this.D;
                if (i2 == 0) {
                    this.f43129z.skip((long) this.E);
                    this.E = 0;
                    if ((this.f43128B & 4) != 0) {
                        return -1;
                    }
                    b();
                } else {
                    long o1 = this.f43129z.o1(buffer, Math.min(j2, (long) i2));
                    if (o1 == -1) {
                        return -1;
                    }
                    this.D -= (int) o1;
                    return o1;
                }
            }
        }

        public Timeout u() {
            return this.f43129z.u();
        }
    }

    @Metadata
    public interface Handler {
        void b();

        void c(boolean z2, Settings settings);

        void e(boolean z2, int i2, int i3, List list);

        void f(int i2, long j2);

        void g(boolean z2, int i2, BufferedSource bufferedSource, int i3);

        void h(boolean z2, int i2, int i3);

        void i(int i2, int i3, int i4, boolean z2);

        void k(int i2, ErrorCode errorCode);

        void p(int i2, int i3, List list);

        void q(int i2, ErrorCode errorCode, ByteString byteString);
    }

    static {
        Logger logger = Logger.getLogger(Http2.class.getName());
        Intrinsics.h(logger, "getLogger(Http2::class.java.name)");
        E = logger;
    }

    public Http2Reader(BufferedSource bufferedSource, boolean z2) {
        Intrinsics.i(bufferedSource, "source");
        this.f43126z = bufferedSource;
        this.f43124A = z2;
        ContinuationSource continuationSource = new ContinuationSource(bufferedSource);
        this.f43125B = continuationSource;
        this.C = new Hpack.Reader(continuationSource, 4096, 0, 4, (DefaultConstructorMarker) null);
    }

    public final boolean b(boolean z2, Handler handler) {
        Intrinsics.i(handler, "handler");
        try {
            this.f43126z.v1(9);
            int K = Util.K(this.f43126z);
            if (K <= 16384) {
                int d2 = Util.d(this.f43126z.readByte(), 255);
                int d3 = Util.d(this.f43126z.readByte(), 255);
                int readInt = this.f43126z.readInt() & Integer.MAX_VALUE;
                Logger logger = E;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(Http2.f43060a.c(true, readInt, K, d2, d3));
                }
                if (!z2 || d2 == 4) {
                    switch (d2) {
                        case 0:
                            d(handler, K, d3, readInt);
                            return true;
                        case 1:
                            j(handler, K, d3, readInt);
                            return true;
                        case 2:
                            m(handler, K, d3, readInt);
                            return true;
                        case 3:
                            t(handler, K, d3, readInt);
                            return true;
                        case 4:
                            x(handler, K, d3, readInt);
                            return true;
                        case 5:
                            r(handler, K, d3, readInt);
                            return true;
                        case 6:
                            k(handler, K, d3, readInt);
                            return true;
                        case 7:
                            f(handler, K, d3, readInt);
                            return true;
                        case 8:
                            y(handler, K, d3, readInt);
                            return true;
                        default:
                            this.f43126z.skip((long) K);
                            return true;
                    }
                } else {
                    throw new IOException("Expected a SETTINGS frame but was " + Http2.f43060a.b(d2));
                }
            } else {
                throw new IOException("FRAME_SIZE_ERROR: " + K);
            }
        } catch (EOFException unused) {
            return false;
        }
    }

    public final void c(Handler handler) {
        Intrinsics.i(handler, "handler");
        if (!this.f43124A) {
            BufferedSource bufferedSource = this.f43126z;
            ByteString byteString = Http2.f43061b;
            ByteString R = bufferedSource.R((long) byteString.N());
            Logger logger = E;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(Util.t("<< CONNECTION " + R.p(), new Object[0]));
            }
            if (!Intrinsics.d(byteString, R)) {
                throw new IOException("Expected a connection header but was " + R.U());
            }
        } else if (!b(true, handler)) {
            throw new IOException("Required SETTINGS preface not received");
        }
    }

    public void close() {
        this.f43126z.close();
    }

    public final void d(Handler handler, int i2, int i3, int i4) {
        if (i4 != 0) {
            int i5 = 0;
            boolean z2 = (i3 & 1) != 0;
            if ((i3 & 32) == 0) {
                if ((i3 & 8) != 0) {
                    i5 = Util.d(this.f43126z.readByte(), 255);
                }
                handler.g(z2, i4, this.f43126z, D.b(i2, i3, i5));
                this.f43126z.skip((long) i5);
                return;
            }
            throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
        }
        throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
    }

    public final void f(Handler handler, int i2, int i3, int i4) {
        if (i2 < 8) {
            throw new IOException("TYPE_GOAWAY length < 8: " + i2);
        } else if (i4 == 0) {
            int readInt = this.f43126z.readInt();
            int readInt2 = this.f43126z.readInt();
            int i5 = i2 - 8;
            ErrorCode a2 = ErrorCode.f43026A.a(readInt2);
            if (a2 != null) {
                ByteString byteString = ByteString.D;
                if (i5 > 0) {
                    byteString = this.f43126z.R((long) i5);
                }
                handler.q(readInt, a2, byteString);
                return;
            }
            throw new IOException("TYPE_GOAWAY unexpected error code: " + readInt2);
        } else {
            throw new IOException("TYPE_GOAWAY streamId != 0");
        }
    }

    public final List g(int i2, int i3, int i4, int i5) {
        this.f43125B.d(i2);
        ContinuationSource continuationSource = this.f43125B;
        continuationSource.f(continuationSource.a());
        this.f43125B.g(i3);
        this.f43125B.c(i4);
        this.f43125B.j(i5);
        this.C.k();
        return this.C.e();
    }

    public final void j(Handler handler, int i2, int i3, int i4) {
        if (i4 != 0) {
            int i5 = 0;
            boolean z2 = (i3 & 1) != 0;
            if ((i3 & 8) != 0) {
                i5 = Util.d(this.f43126z.readByte(), 255);
            }
            if ((i3 & 32) != 0) {
                l(handler, i4);
                i2 -= 5;
            }
            handler.e(z2, i4, -1, g(D.b(i2, i3, i5), i5, i3, i4));
            return;
        }
        throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
    }

    public final void k(Handler handler, int i2, int i3, int i4) {
        if (i2 != 8) {
            throw new IOException("TYPE_PING length != 8: " + i2);
        } else if (i4 == 0) {
            int readInt = this.f43126z.readInt();
            int readInt2 = this.f43126z.readInt();
            boolean z2 = true;
            if ((i3 & 1) == 0) {
                z2 = false;
            }
            handler.h(z2, readInt, readInt2);
        } else {
            throw new IOException("TYPE_PING streamId != 0");
        }
    }

    public final void l(Handler handler, int i2) {
        int readInt = this.f43126z.readInt();
        handler.i(i2, readInt & Integer.MAX_VALUE, Util.d(this.f43126z.readByte(), 255) + 1, (Integer.MIN_VALUE & readInt) != 0);
    }

    public final void m(Handler handler, int i2, int i3, int i4) {
        if (i2 != 5) {
            throw new IOException("TYPE_PRIORITY length: " + i2 + " != 5");
        } else if (i4 != 0) {
            l(handler, i4);
        } else {
            throw new IOException("TYPE_PRIORITY streamId == 0");
        }
    }

    public final void r(Handler handler, int i2, int i3, int i4) {
        if (i4 != 0) {
            int d2 = (i3 & 8) != 0 ? Util.d(this.f43126z.readByte(), 255) : 0;
            handler.p(i4, this.f43126z.readInt() & Integer.MAX_VALUE, g(D.b(i2 - 4, i3, d2), d2, i3, i4));
            return;
        }
        throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
    }

    public final void t(Handler handler, int i2, int i3, int i4) {
        if (i2 != 4) {
            throw new IOException("TYPE_RST_STREAM length: " + i2 + " != 4");
        } else if (i4 != 0) {
            int readInt = this.f43126z.readInt();
            ErrorCode a2 = ErrorCode.f43026A.a(readInt);
            if (a2 != null) {
                handler.k(i4, a2);
                return;
            }
            throw new IOException("TYPE_RST_STREAM unexpected error code: " + readInt);
        } else {
            throw new IOException("TYPE_RST_STREAM streamId == 0");
        }
    }

    public final void x(Handler handler, int i2, int i3, int i4) {
        int readInt;
        if (i4 != 0) {
            throw new IOException("TYPE_SETTINGS streamId != 0");
        } else if ((i3 & 1) != 0) {
            if (i2 == 0) {
                handler.b();
                return;
            }
            throw new IOException("FRAME_SIZE_ERROR ack frame should be empty!");
        } else if (i2 % 6 == 0) {
            Settings settings = new Settings();
            IntProgression u2 = RangesKt.u(RangesKt.v(0, i2), 6);
            int n2 = u2.n();
            int o2 = u2.o();
            int p2 = u2.p();
            if ((p2 > 0 && n2 <= o2) || (p2 < 0 && o2 <= n2)) {
                while (true) {
                    int e2 = Util.e(this.f43126z.readShort(), 65535);
                    readInt = this.f43126z.readInt();
                    if (e2 != 2) {
                        if (e2 == 3) {
                            e2 = 4;
                        } else if (e2 != 4) {
                            if (e2 == 5 && (readInt < 16384 || readInt > 16777215)) {
                            }
                        } else if (readInt >= 0) {
                            e2 = 7;
                        } else {
                            throw new IOException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                        }
                    } else if (!(readInt == 0 || readInt == 1)) {
                        throw new IOException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                    }
                    settings.h(e2, readInt);
                    if (n2 == o2) {
                        break;
                    }
                    n2 += p2;
                }
                throw new IOException("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: " + readInt);
            }
            handler.c(false, settings);
        } else {
            throw new IOException("TYPE_SETTINGS length % 6 != 0: " + i2);
        }
    }

    public final void y(Handler handler, int i2, int i3, int i4) {
        if (i2 == 4) {
            long f2 = Util.f(this.f43126z.readInt(), 2147483647L);
            if (f2 != 0) {
                handler.f(i4, f2);
                return;
            }
            throw new IOException("windowSizeIncrement was 0");
        }
        throw new IOException("TYPE_WINDOW_UPDATE length !=4: " + i2);
    }
}
