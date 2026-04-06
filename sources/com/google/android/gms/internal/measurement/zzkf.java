package com.google.android.gms.internal.measurement;

import java.util.Arrays;

final class zzkf extends zzkg {

    /* renamed from: e  reason: collision with root package name */
    public final byte[] f25574e;

    /* renamed from: f  reason: collision with root package name */
    public int f25575f;

    /* renamed from: g  reason: collision with root package name */
    public int f25576g;

    /* renamed from: h  reason: collision with root package name */
    public int f25577h;

    /* renamed from: i  reason: collision with root package name */
    public int f25578i;

    /* renamed from: j  reason: collision with root package name */
    public int f25579j;

    /* renamed from: k  reason: collision with root package name */
    public int f25580k;

    public final boolean A() {
        return this.f25577h == this.f25575f;
    }

    public final boolean B() {
        return I() != 0;
    }

    public final void C() {
        int i2 = this.f25575f + this.f25576g;
        this.f25575f = i2;
        int i3 = i2 - this.f25578i;
        int i4 = this.f25580k;
        if (i3 > i4) {
            int i5 = i3 - i4;
            this.f25576g = i5;
            this.f25575f = i2 - i5;
            return;
        }
        this.f25576g = 0;
    }

    public final void D(int i2) {
        if (i2 >= 0) {
            int i3 = this.f25575f;
            int i4 = this.f25577h;
            if (i2 <= i3 - i4) {
                this.f25577h = i4 + i2;
                return;
            }
        }
        if (i2 < 0) {
            throw zzlk.f();
        }
        throw zzlk.i();
    }

    public final byte E() {
        int i2 = this.f25577h;
        if (i2 != this.f25575f) {
            byte[] bArr = this.f25574e;
            this.f25577h = i2 + 1;
            return bArr[i2];
        }
        throw zzlk.i();
    }

    public final int F() {
        int i2 = this.f25577h;
        if (this.f25575f - i2 >= 4) {
            byte[] bArr = this.f25574e;
            this.f25577h = i2 + 4;
            return ((bArr[i2 + 3] & 255) << 24) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16);
        }
        throw zzlk.i();
    }

    public final int G() {
        byte b2;
        byte b3;
        int i2 = this.f25577h;
        int i3 = this.f25575f;
        if (i3 != i2) {
            byte[] bArr = this.f25574e;
            int i4 = i2 + 1;
            byte b4 = bArr[i2];
            if (b4 >= 0) {
                this.f25577h = i4;
                return b4;
            } else if (i3 - i4 >= 9) {
                int i5 = i2 + 2;
                byte b5 = (bArr[i4] << 7) ^ b4;
                if (b5 < 0) {
                    b2 = b5 ^ Byte.MIN_VALUE;
                } else {
                    int i6 = i2 + 3;
                    byte b6 = (bArr[i5] << 14) ^ b5;
                    if (b6 >= 0) {
                        b3 = b6 ^ 16256;
                    } else {
                        int i7 = i2 + 4;
                        byte b7 = b6 ^ (bArr[i6] << 21);
                        if (b7 < 0) {
                            b2 = -2080896 ^ b7;
                        } else {
                            i6 = i2 + 5;
                            byte b8 = bArr[i7];
                            byte b9 = (b7 ^ (b8 << 28)) ^ 266354560;
                            if (b8 < 0) {
                                i7 = i2 + 6;
                                if (bArr[i6] < 0) {
                                    i6 = i2 + 7;
                                    if (bArr[i7] < 0) {
                                        i7 = i2 + 8;
                                        if (bArr[i6] < 0) {
                                            i6 = i2 + 9;
                                            if (bArr[i7] < 0) {
                                                int i8 = i2 + 10;
                                                if (bArr[i6] >= 0) {
                                                    byte b10 = b9;
                                                    i5 = i8;
                                                    b2 = b10;
                                                }
                                            }
                                        }
                                    }
                                }
                                b2 = b9;
                            }
                            b3 = b9;
                        }
                        i5 = i7;
                    }
                    i5 = i6;
                }
                this.f25577h = i5;
                return b2;
            }
        }
        return (int) t();
    }

    public final long H() {
        int i2 = this.f25577h;
        if (this.f25575f - i2 >= 8) {
            byte[] bArr = this.f25574e;
            this.f25577h = i2 + 8;
            return ((((long) bArr[i2 + 7]) & 255) << 56) | (((long) bArr[i2]) & 255) | ((((long) bArr[i2 + 1]) & 255) << 8) | ((((long) bArr[i2 + 2]) & 255) << 16) | ((((long) bArr[i2 + 3]) & 255) << 24) | ((((long) bArr[i2 + 4]) & 255) << 32) | ((((long) bArr[i2 + 5]) & 255) << 40) | ((((long) bArr[i2 + 6]) & 255) << 48);
        }
        throw zzlk.i();
    }

    public final long I() {
        long j2;
        long j3;
        long j4;
        int i2 = this.f25577h;
        int i3 = this.f25575f;
        if (i3 != i2) {
            byte[] bArr = this.f25574e;
            int i4 = i2 + 1;
            byte b2 = bArr[i2];
            if (b2 >= 0) {
                this.f25577h = i4;
                return (long) b2;
            } else if (i3 - i4 >= 9) {
                int i5 = i2 + 2;
                byte b3 = (bArr[i4] << 7) ^ b2;
                if (b3 < 0) {
                    j2 = (long) (b3 ^ Byte.MIN_VALUE);
                } else {
                    int i6 = i2 + 3;
                    byte b4 = (bArr[i5] << 14) ^ b3;
                    if (b4 >= 0) {
                        j2 = (long) (b4 ^ 16256);
                        i5 = i6;
                    } else {
                        int i7 = i2 + 4;
                        byte b5 = b4 ^ (bArr[i6] << 21);
                        if (b5 < 0) {
                            i5 = i7;
                            j2 = (long) (-2080896 ^ b5);
                        } else {
                            long j5 = (long) b5;
                            int i8 = i2 + 5;
                            long j6 = j5 ^ (((long) bArr[i7]) << 28);
                            if (j6 >= 0) {
                                j4 = 266354560;
                            } else {
                                int i9 = i2 + 6;
                                long j7 = j6 ^ (((long) bArr[i8]) << 35);
                                if (j7 < 0) {
                                    j3 = -34093383808L;
                                } else {
                                    i8 = i2 + 7;
                                    j6 = j7 ^ (((long) bArr[i9]) << 42);
                                    if (j6 >= 0) {
                                        j4 = 4363953127296L;
                                    } else {
                                        i9 = i2 + 8;
                                        j7 = j6 ^ (((long) bArr[i8]) << 49);
                                        if (j7 < 0) {
                                            j3 = -558586000294016L;
                                        } else {
                                            i5 = i2 + 9;
                                            long j8 = (j7 ^ (((long) bArr[i9]) << 56)) ^ 71499008037633920L;
                                            if (j8 < 0) {
                                                int i10 = i2 + 10;
                                                if (((long) bArr[i5]) >= 0) {
                                                    i5 = i10;
                                                }
                                            }
                                            j2 = j8;
                                        }
                                    }
                                }
                                j2 = j7 ^ j3;
                                i5 = i9;
                            }
                            j2 = j6 ^ j4;
                        }
                    }
                }
                this.f25577h = i5;
                return j2;
            }
        }
        return t();
    }

    public final double a() {
        return Double.longBitsToDouble(H());
    }

    public final int b(int i2) {
        if (i2 >= 0) {
            int g2 = i2 + g();
            if (g2 >= 0) {
                int i3 = this.f25580k;
                if (g2 <= i3) {
                    this.f25580k = g2;
                    C();
                    return i3;
                }
                throw zzlk.i();
            }
            throw zzlk.g();
        }
        throw zzlk.f();
    }

    public final float e() {
        return Float.intBitsToFloat(F());
    }

    public final void f(int i2) {
        if (this.f25579j != i2) {
            throw zzlk.b();
        }
    }

    public final int g() {
        return this.f25577h - this.f25578i;
    }

    public final void h(int i2) {
        this.f25580k = i2;
        C();
    }

    public final int i() {
        return G();
    }

    public final boolean j(int i2) {
        int p2;
        int i3 = i2 & 7;
        int i4 = 0;
        if (i3 == 0) {
            if (this.f25575f - this.f25577h >= 10) {
                while (i4 < 10) {
                    byte[] bArr = this.f25574e;
                    int i5 = this.f25577h;
                    this.f25577h = i5 + 1;
                    if (bArr[i5] < 0) {
                        i4++;
                    }
                }
                throw zzlk.e();
            }
            while (i4 < 10) {
                if (E() < 0) {
                    i4++;
                }
            }
            throw zzlk.e();
            return true;
        } else if (i3 == 1) {
            D(8);
            return true;
        } else if (i3 == 2) {
            D(G());
            return true;
        } else if (i3 == 3) {
            do {
                p2 = p();
                if (p2 == 0 || !j(p2)) {
                    f(((i2 >>> 3) << 3) | 4);
                }
                p2 = p();
                break;
            } while (!j(p2));
            f(((i2 >>> 3) << 3) | 4);
            return true;
        } else if (i3 == 4) {
            return false;
        } else {
            if (i3 == 5) {
                D(4);
                return true;
            }
            throw zzlk.a();
        }
    }

    public final int k() {
        return F();
    }

    public final int m() {
        return G();
    }

    public final int n() {
        return F();
    }

    public final int o() {
        return zzkg.l(G());
    }

    public final int p() {
        if (A()) {
            this.f25579j = 0;
            return 0;
        }
        int G = G();
        this.f25579j = G;
        if ((G >>> 3) != 0) {
            return G;
        }
        throw zzlk.c();
    }

    public final int q() {
        return G();
    }

    public final long r() {
        return H();
    }

    public final long s() {
        return I();
    }

    public final long t() {
        long j2 = 0;
        for (int i2 = 0; i2 < 64; i2 += 7) {
            byte E = E();
            j2 |= ((long) (E & Byte.MAX_VALUE)) << i2;
            if ((E & 128) == 0) {
                return j2;
            }
        }
        throw zzlk.e();
    }

    public final long u() {
        return H();
    }

    public final long v() {
        return zzkg.c(I());
    }

    public final long w() {
        return I();
    }

    public final zzjs x() {
        byte[] bArr;
        int G = G();
        if (G > 0) {
            int i2 = this.f25575f;
            int i3 = this.f25577h;
            if (G <= i2 - i3) {
                zzjs p2 = zzjs.p(this.f25574e, i3, G);
                this.f25577h += G;
                return p2;
            }
        }
        if (G == 0) {
            return zzjs.f25568A;
        }
        if (G > 0) {
            int i4 = this.f25575f;
            int i5 = this.f25577h;
            if (G <= i4 - i5) {
                int i6 = G + i5;
                this.f25577h = i6;
                bArr = Arrays.copyOfRange(this.f25574e, i5, i6);
                return zzjs.w(bArr);
            }
        }
        if (G > 0) {
            throw zzlk.i();
        } else if (G == 0) {
            bArr = zzle.f25634b;
            return zzjs.w(bArr);
        } else {
            throw zzlk.f();
        }
    }

    public final String y() {
        int G = G();
        if (G > 0) {
            int i2 = this.f25575f;
            int i3 = this.f25577h;
            if (G <= i2 - i3) {
                String str = new String(this.f25574e, i3, G, zzle.f25633a);
                this.f25577h += G;
                return str;
            }
        }
        if (G == 0) {
            return "";
        }
        if (G < 0) {
            throw zzlk.f();
        }
        throw zzlk.i();
    }

    public final String z() {
        int G = G();
        if (G > 0) {
            int i2 = this.f25575f;
            int i3 = this.f25577h;
            if (G <= i2 - i3) {
                String d2 = zzoc.d(this.f25574e, i3, G);
                this.f25577h += G;
                return d2;
            }
        }
        if (G == 0) {
            return "";
        }
        if (G <= 0) {
            throw zzlk.f();
        }
        throw zzlk.i();
    }

    public zzkf(byte[] bArr, int i2, int i3, boolean z2) {
        super();
        this.f25580k = Integer.MAX_VALUE;
        this.f25574e = bArr;
        this.f25575f = i3 + i2;
        this.f25577h = i2;
        this.f25578i = i2;
    }
}
