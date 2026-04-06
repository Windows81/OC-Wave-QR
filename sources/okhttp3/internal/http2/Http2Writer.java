package okhttp3.internal.http2;

import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.Util;
import okhttp3.internal.http2.Hpack;
import okio.Buffer;
import okio.BufferedSink;

@Metadata
public final class Http2Writer implements Closeable {
    public static final Companion F = new Companion((DefaultConstructorMarker) null);
    public static final Logger G = Logger.getLogger(Http2.class.getName());

    /* renamed from: A  reason: collision with root package name */
    public final boolean f43152A;

    /* renamed from: B  reason: collision with root package name */
    public final Buffer f43153B;
    public int C = 16384;
    public boolean D;
    public final Hpack.Writer E;

    /* renamed from: z  reason: collision with root package name */
    public final BufferedSink f43154z;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public Http2Writer(BufferedSink bufferedSink, boolean z2) {
        Intrinsics.i(bufferedSink, "sink");
        this.f43154z = bufferedSink;
        this.f43152A = z2;
        Buffer buffer = new Buffer();
        this.f43153B = buffer;
        this.E = new Hpack.Writer(0, false, buffer, 3, (DefaultConstructorMarker) null);
    }

    public final synchronized void a(Settings settings) {
        try {
            Intrinsics.i(settings, "peerSettings");
            if (!this.D) {
                this.C = settings.e(this.C);
                if (settings.b() != -1) {
                    this.E.e(settings.b());
                }
                f(0, 0, 4, 1);
                this.f43154z.flush();
            } else {
                throw new IOException("closed");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b() {
        try {
            if (this.D) {
                throw new IOException("closed");
            } else if (this.f43152A) {
                Logger logger = G;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(Util.t(">> CONNECTION " + Http2.f43061b.p(), new Object[0]));
                }
                this.f43154z.k1(Http2.f43061b);
                this.f43154z.flush();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void c(boolean z2, int i2, Buffer buffer, int i3) {
        if (!this.D) {
            d(i2, z2 ? 1 : 0, buffer, i3);
        } else {
            throw new IOException("closed");
        }
    }

    public synchronized void close() {
        this.D = true;
        this.f43154z.close();
    }

    public final void d(int i2, int i3, Buffer buffer, int i4) {
        f(i2, i4, 0, i3);
        if (i4 > 0) {
            BufferedSink bufferedSink = this.f43154z;
            Intrinsics.f(buffer);
            bufferedSink.N0(buffer, (long) i4);
        }
    }

    public final void f(int i2, int i3, int i4, int i5) {
        Logger logger = G;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(Http2.f43060a.c(false, i2, i3, i4, i5));
        }
        if (i3 > this.C) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.C + ": " + i3).toString());
        } else if ((Integer.MIN_VALUE & i2) == 0) {
            Util.c0(this.f43154z, i3);
            this.f43154z.writeByte(i4 & 255);
            this.f43154z.writeByte(i5 & 255);
            this.f43154z.writeInt(i2 & Integer.MAX_VALUE);
        } else {
            throw new IllegalArgumentException(("reserved bit set: " + i2).toString());
        }
    }

    public final synchronized void flush() {
        if (!this.D) {
            this.f43154z.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void g(int i2, ErrorCode errorCode, byte[] bArr) {
        try {
            Intrinsics.i(errorCode, "errorCode");
            Intrinsics.i(bArr, "debugData");
            if (this.D) {
                throw new IOException("closed");
            } else if (errorCode.f() != -1) {
                boolean z2 = false;
                f(0, bArr.length + 8, 7, 0);
                this.f43154z.writeInt(i2);
                this.f43154z.writeInt(errorCode.f());
                if (bArr.length == 0) {
                    z2 = true;
                }
                if (!z2) {
                    this.f43154z.write(bArr);
                }
                this.f43154z.flush();
            } else {
                throw new IllegalArgumentException("errorCode.httpCode == -1");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void j(boolean z2, int i2, List list) {
        Intrinsics.i(list, "headerBlock");
        if (!this.D) {
            this.E.g(list);
            long n0 = this.f43153B.n0();
            long min = Math.min((long) this.C, n0);
            int i3 = (n0 > min ? 1 : (n0 == min ? 0 : -1));
            int i4 = i3 == 0 ? 4 : 0;
            if (z2) {
                i4 |= 1;
            }
            f(i2, (int) min, 1, i4);
            this.f43154z.N0(this.f43153B, min);
            if (i3 > 0) {
                y(i2, n0 - min);
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final int k() {
        return this.C;
    }

    public final synchronized void l(boolean z2, int i2, int i3) {
        if (!this.D) {
            f(0, 8, 6, z2 ? 1 : 0);
            this.f43154z.writeInt(i2);
            this.f43154z.writeInt(i3);
            this.f43154z.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void m(int i2, int i3, List list) {
        Intrinsics.i(list, "requestHeaders");
        if (!this.D) {
            this.E.g(list);
            long n0 = this.f43153B.n0();
            int min = (int) Math.min(((long) this.C) - 4, n0);
            int i4 = min + 4;
            long j2 = (long) min;
            int i5 = (n0 > j2 ? 1 : (n0 == j2 ? 0 : -1));
            f(i2, i4, 5, i5 == 0 ? 4 : 0);
            this.f43154z.writeInt(i3 & Integer.MAX_VALUE);
            this.f43154z.N0(this.f43153B, j2);
            if (i5 > 0) {
                y(i2, n0 - j2);
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void r(int i2, ErrorCode errorCode) {
        Intrinsics.i(errorCode, "errorCode");
        if (this.D) {
            throw new IOException("closed");
        } else if (errorCode.f() != -1) {
            f(i2, 4, 3, 0);
            this.f43154z.writeInt(errorCode.f());
            this.f43154z.flush();
        } else {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }

    public final synchronized void t(Settings settings) {
        try {
            Intrinsics.i(settings, "settings");
            if (!this.D) {
                int i2 = 0;
                f(0, settings.i() * 6, 4, 0);
                while (i2 < 10) {
                    if (settings.f(i2)) {
                        this.f43154z.writeShort(i2 != 4 ? i2 != 7 ? i2 : 4 : 3);
                        this.f43154z.writeInt(settings.a(i2));
                    }
                    i2++;
                }
                this.f43154z.flush();
            } else {
                throw new IOException("closed");
            }
        } finally {
        }
    }

    public final synchronized void x(int i2, long j2) {
        if (this.D) {
            throw new IOException("closed");
        } else if (j2 == 0 || j2 > 2147483647L) {
            throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j2).toString());
        } else {
            f(i2, 4, 8, 0);
            this.f43154z.writeInt((int) j2);
            this.f43154z.flush();
        }
    }

    public final void y(int i2, long j2) {
        while (j2 > 0) {
            long min = Math.min((long) this.C, j2);
            j2 -= min;
            f(i2, (int) min, 9, j2 == 0 ? 4 : 0);
            this.f43154z.N0(this.f43153B, min);
        }
    }
}
