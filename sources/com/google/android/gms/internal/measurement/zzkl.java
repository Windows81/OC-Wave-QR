package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class zzkl extends zzjp {

    /* renamed from: b  reason: collision with root package name */
    public static final Logger f25590b = Logger.getLogger(zzkl.class.getName());

    /* renamed from: c  reason: collision with root package name */
    public static final boolean f25591c = zzny.w();

    /* renamed from: a  reason: collision with root package name */
    public zzko f25592a;

    public static class zza extends zzkl {

        /* renamed from: d  reason: collision with root package name */
        public final byte[] f25593d;

        /* renamed from: e  reason: collision with root package name */
        public final int f25594e;

        /* renamed from: f  reason: collision with root package name */
        public int f25595f;

        public zza(byte[] bArr, int i2, int i3) {
            super();
            if (bArr == null) {
                throw new NullPointerException("buffer");
            } else if (((bArr.length - i3) | i3) >= 0) {
                this.f25593d = bArr;
                this.f25595f = 0;
                this.f25594e = i3;
            } else {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(bArr.length), 0, Integer.valueOf(i3)}));
            }
        }

        public final void F0(byte[] bArr, int i2, int i3) {
            try {
                System.arraycopy(bArr, i2, this.f25593d, this.f25595f, i3);
                this.f25595f += i3;
            } catch (IndexOutOfBoundsException e2) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f25595f), Integer.valueOf(this.f25594e), Integer.valueOf(i3)}), e2);
            }
        }

        public final void L(int i2) {
            if (i2 >= 0) {
                Z(i2);
            } else {
                R((long) i2);
            }
        }

        public final void O(int i2, int i3) {
            a0(i2, 0);
            L(i3);
        }

        public final void P(int i2, long j2) {
            a0(i2, 0);
            R(j2);
        }

        public final void Q(int i2, zzjs zzjs) {
            a0(1, 3);
            g0(2, i2);
            p(3, zzjs);
            a0(1, 4);
        }

        public final void R(long j2) {
            if (!zzkl.f25591c || b() < 10) {
                while ((j2 & -128) != 0) {
                    byte[] bArr = this.f25593d;
                    int i2 = this.f25595f;
                    this.f25595f = i2 + 1;
                    bArr[i2] = (byte) (((int) j2) | 128);
                    j2 >>>= 7;
                }
                try {
                    byte[] bArr2 = this.f25593d;
                    int i3 = this.f25595f;
                    this.f25595f = i3 + 1;
                    bArr2[i3] = (byte) ((int) j2);
                } catch (IndexOutOfBoundsException e2) {
                    throw new zzb(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f25595f), Integer.valueOf(this.f25594e), 1}), e2);
                }
            } else {
                while ((j2 & -128) != 0) {
                    byte[] bArr3 = this.f25593d;
                    int i4 = this.f25595f;
                    this.f25595f = i4 + 1;
                    zzny.m(bArr3, (long) i4, (byte) (((int) j2) | 128));
                    j2 >>>= 7;
                }
                byte[] bArr4 = this.f25593d;
                int i5 = this.f25595f;
                this.f25595f = i5 + 1;
                zzny.m(bArr4, (long) i5, (byte) ((int) j2));
            }
        }

        public final void T(byte[] bArr, int i2, int i3) {
            Z(i3);
            F0(bArr, 0, i3);
        }

        public final void Z(int i2) {
            while ((i2 & -128) != 0) {
                byte[] bArr = this.f25593d;
                int i3 = this.f25595f;
                this.f25595f = i3 + 1;
                bArr[i3] = (byte) (i2 | 128);
                i2 >>>= 7;
            }
            try {
                byte[] bArr2 = this.f25593d;
                int i4 = this.f25595f;
                this.f25595f = i4 + 1;
                bArr2[i4] = (byte) i2;
            } catch (IndexOutOfBoundsException e2) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f25595f), Integer.valueOf(this.f25594e), 1}), e2);
            }
        }

        public final void a(byte[] bArr, int i2, int i3) {
            F0(bArr, i2, i3);
        }

        public final void a0(int i2, int i3) {
            Z((i2 << 3) | i3);
        }

        public final int b() {
            return this.f25594e - this.f25595f;
        }

        public final void g0(int i2, int i3) {
            a0(i2, 0);
            Z(i3);
        }

        public final void l(byte b2) {
            try {
                byte[] bArr = this.f25593d;
                int i2 = this.f25595f;
                this.f25595f = i2 + 1;
                bArr[i2] = b2;
            } catch (IndexOutOfBoundsException e2) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f25595f), Integer.valueOf(this.f25594e), 1}), e2);
            }
        }

        public final void m(int i2) {
            try {
                byte[] bArr = this.f25593d;
                int i3 = this.f25595f;
                int i4 = i3 + 1;
                this.f25595f = i4;
                bArr[i3] = (byte) i2;
                int i5 = i3 + 2;
                this.f25595f = i5;
                bArr[i4] = (byte) (i2 >> 8);
                int i6 = i3 + 3;
                this.f25595f = i6;
                bArr[i5] = (byte) (i2 >> 16);
                this.f25595f = i3 + 4;
                bArr[i6] = (byte) (i2 >>> 24);
            } catch (IndexOutOfBoundsException e2) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f25595f), Integer.valueOf(this.f25594e), 1}), e2);
            }
        }

        public final void n(int i2, int i3) {
            a0(i2, 5);
            m(i3);
        }

        public final void o(int i2, long j2) {
            a0(i2, 1);
            u(j2);
        }

        public final void p(int i2, zzjs zzjs) {
            a0(i2, 2);
            v(zzjs);
        }

        public final void q(int i2, zzml zzml) {
            a0(1, 3);
            g0(2, i2);
            a0(3, 2);
            w(zzml);
            a0(1, 4);
        }

        public final void r(int i2, zzml zzml, zznd zznd) {
            a0(i2, 2);
            Z(((zzji) zzml).d(zznd));
            zznd.i(zzml, this.f25592a);
        }

        public final void s(int i2, String str) {
            a0(i2, 2);
            x(str);
        }

        public final void t(int i2, boolean z2) {
            a0(i2, 0);
            l(z2 ? (byte) 1 : 0);
        }

        public final void u(long j2) {
            try {
                byte[] bArr = this.f25593d;
                int i2 = this.f25595f;
                int i3 = i2 + 1;
                this.f25595f = i3;
                bArr[i2] = (byte) ((int) j2);
                int i4 = i2 + 2;
                this.f25595f = i4;
                bArr[i3] = (byte) ((int) (j2 >> 8));
                int i5 = i2 + 3;
                this.f25595f = i5;
                bArr[i4] = (byte) ((int) (j2 >> 16));
                int i6 = i2 + 4;
                this.f25595f = i6;
                bArr[i5] = (byte) ((int) (j2 >> 24));
                int i7 = i2 + 5;
                this.f25595f = i7;
                bArr[i6] = (byte) ((int) (j2 >> 32));
                int i8 = i2 + 6;
                this.f25595f = i8;
                bArr[i7] = (byte) ((int) (j2 >> 40));
                int i9 = i2 + 7;
                this.f25595f = i9;
                bArr[i8] = (byte) ((int) (j2 >> 48));
                this.f25595f = i2 + 8;
                bArr[i9] = (byte) ((int) (j2 >> 56));
            } catch (IndexOutOfBoundsException e2) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f25595f), Integer.valueOf(this.f25594e), 1}), e2);
            }
        }

        public final void v(zzjs zzjs) {
            Z(zzjs.u());
            zzjs.q(this);
        }

        public final void w(zzml zzml) {
            Z(zzml.h());
            zzml.c(this);
        }

        public final void x(String str) {
            int i2 = this.f25595f;
            try {
                int A0 = zzkl.A0(str.length() * 3);
                int A02 = zzkl.A0(str.length());
                if (A02 == A0) {
                    int i3 = i2 + A02;
                    this.f25595f = i3;
                    int b2 = zzoc.b(str, this.f25593d, i3, b());
                    this.f25595f = i2;
                    Z((b2 - i2) - A02);
                    this.f25595f = b2;
                    return;
                }
                Z(zzoc.a(str));
                this.f25595f = zzoc.b(str, this.f25593d, this.f25595f, b());
            } catch (zzog e2) {
                this.f25595f = i2;
                y(str, e2);
            } catch (IndexOutOfBoundsException e3) {
                throw new zzb(e3);
            }
        }
    }

    public static class zzb extends IOException {
        public zzb(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }

        public zzb(String str, Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + str, th);
        }
    }

    public static int A(int i2, zzml zzml) {
        return (A0(8) << 1) + B0(2, i2) + A0(24) + Y(zzml);
    }

    public static int A0(int i2) {
        return (352 - (Integer.numberOfLeadingZeros(i2) * 9)) >>> 6;
    }

    public static int B(int i2, zzml zzml, zznd zznd) {
        return (A0(i2 << 3) << 1) + ((zzji) zzml).d(zznd);
    }

    public static int B0(int i2, int i3) {
        return A0(i2 << 3) + A0(i3);
    }

    public static int C(int i2, String str) {
        return A0(i2 << 3) + G(str);
    }

    public static int D(int i2, boolean z2) {
        return A0(i2 << 3) + 1;
    }

    public static int E(zzjs zzjs) {
        int u2 = zzjs.u();
        return A0(u2) + u2;
    }

    public static int E0(int i2) {
        return (i2 >> 31) ^ (i2 << 1);
    }

    public static int F(zzml zzml) {
        return zzml.h();
    }

    public static int G(String str) {
        int i2;
        try {
            i2 = zzoc.a(str);
        } catch (zzog unused) {
            i2 = str.getBytes(zzle.f25633a).length;
        }
        return A0(i2) + i2;
    }

    public static zzkl H(byte[] bArr) {
        return new zza(bArr, 0, bArr.length);
    }

    public static int U(int i2, long j2) {
        return A0(i2 << 3) + 8;
    }

    public static int V(int i2, zzjs zzjs) {
        int A0 = A0(i2 << 3);
        int u2 = zzjs.u();
        return A0 + A0(u2) + u2;
    }

    public static int W(int i2, zzml zzml, zznd zznd) {
        return A0(i2 << 3) + i(zzml, zznd);
    }

    public static int X(long j2) {
        return 8;
    }

    public static int Y(zzml zzml) {
        int h2 = zzml.h();
        return A0(h2) + h2;
    }

    public static int c(double d2) {
        return 8;
    }

    public static int c0(int i2) {
        return s0((long) i2);
    }

    public static int d(float f2) {
        return 4;
    }

    public static int d0(int i2, long j2) {
        return A0(i2 << 3) + s0(j2);
    }

    public static int e(int i2, double d2) {
        return A0(i2 << 3) + 8;
    }

    public static int e0(int i2, zzjs zzjs) {
        return (A0(8) << 1) + B0(2, i2) + V(3, zzjs);
    }

    public static int f(int i2, float f2) {
        return A0(i2 << 3) + 4;
    }

    public static int f0(long j2) {
        return s0(j2);
    }

    public static int g(int i2, zzlt zzlt) {
        return (A0(8) << 1) + B0(2, i2) + z(3, zzlt);
    }

    public static int h(zzlt zzlt) {
        int a2 = zzlt.a();
        return A0(a2) + a2;
    }

    public static int h0(int i2) {
        return 4;
    }

    public static int i(zzml zzml, zznd zznd) {
        int d2 = ((zzji) zzml).d(zznd);
        return A0(d2) + d2;
    }

    public static int i0(int i2, int i3) {
        return A0(i2 << 3) + s0((long) i3);
    }

    public static int j(boolean z2) {
        return 1;
    }

    public static int j0(int i2, long j2) {
        return A0(i2 << 3) + 8;
    }

    public static int k(byte[] bArr) {
        int length = bArr.length;
        return A0(length) + length;
    }

    public static int k0(long j2) {
        return 8;
    }

    public static int l0(int i2) {
        return s0((long) i2);
    }

    public static int m0(int i2, int i3) {
        return A0(i2 << 3) + 4;
    }

    public static int n0(int i2, long j2) {
        return A0(i2 << 3) + s0(z0(j2));
    }

    public static int o0(long j2) {
        return s0(z0(j2));
    }

    public static int p0(int i2) {
        return 4;
    }

    public static int q0(int i2, int i3) {
        return A0(i2 << 3) + s0((long) i3);
    }

    public static int r0(int i2, long j2) {
        return A0(i2 << 3) + s0(j2);
    }

    public static int s0(long j2) {
        return (640 - (Long.numberOfLeadingZeros(j2) * 9)) >>> 6;
    }

    public static int t0(int i2) {
        return A0(E0(i2));
    }

    public static int u0(int i2, int i3) {
        return A0(i2 << 3) + 4;
    }

    public static int x0(int i2) {
        return A0(i2 << 3);
    }

    public static int y0(int i2, int i3) {
        return A0(i2 << 3) + A0(E0(i3));
    }

    public static int z(int i2, zzlt zzlt) {
        int A0 = A0(i2 << 3);
        int a2 = zzlt.a();
        return A0 + A0(a2) + a2;
    }

    public static long z0(long j2) {
        return (j2 >> 63) ^ (j2 << 1);
    }

    public final void C0(int i2) {
        Z(E0(i2));
    }

    public final void D0(int i2, int i3) {
        g0(i2, E0(i3));
    }

    public final void I() {
        if (b() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public final void J(double d2) {
        u(Double.doubleToRawLongBits(d2));
    }

    public final void K(float f2) {
        m(Float.floatToRawIntBits(f2));
    }

    public abstract void L(int i2);

    public final void M(int i2, double d2) {
        o(i2, Double.doubleToRawLongBits(d2));
    }

    public final void N(int i2, float f2) {
        n(i2, Float.floatToRawIntBits(f2));
    }

    public abstract void O(int i2, int i3);

    public abstract void P(int i2, long j2);

    public abstract void Q(int i2, zzjs zzjs);

    public abstract void R(long j2);

    public final void S(boolean z2) {
        l(z2 ? (byte) 1 : 0);
    }

    public abstract void T(byte[] bArr, int i2, int i3);

    public abstract void Z(int i2);

    public abstract void a0(int i2, int i3);

    public abstract int b();

    public abstract void g0(int i2, int i3);

    public abstract void l(byte b2);

    public abstract void m(int i2);

    public abstract void n(int i2, int i3);

    public abstract void o(int i2, long j2);

    public abstract void p(int i2, zzjs zzjs);

    public abstract void q(int i2, zzml zzml);

    public abstract void r(int i2, zzml zzml, zznd zznd);

    public abstract void s(int i2, String str);

    public abstract void t(int i2, boolean z2);

    public abstract void u(long j2);

    public abstract void v(zzjs zzjs);

    public final void v0(int i2, long j2) {
        P(i2, z0(j2));
    }

    public abstract void w(zzml zzml);

    public final void w0(long j2) {
        R(z0(j2));
    }

    public abstract void x(String str);

    public final void y(String str, zzog zzog) {
        f25590b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", zzog);
        byte[] bytes = str.getBytes(zzle.f25633a);
        try {
            Z(bytes.length);
            a(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e2) {
            throw new zzb(e2);
        }
    }

    public zzkl() {
    }
}
