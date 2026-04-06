package com.google.android.gms.internal.measurement;

import java.util.Arrays;

public final class zznw {

    /* renamed from: f  reason: collision with root package name */
    public static final zznw f25712f = new zznw(0, new int[0], new Object[0], false);

    /* renamed from: a  reason: collision with root package name */
    public int f25713a;

    /* renamed from: b  reason: collision with root package name */
    public int[] f25714b;

    /* renamed from: c  reason: collision with root package name */
    public Object[] f25715c;

    /* renamed from: d  reason: collision with root package name */
    public int f25716d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f25717e;

    public zznw() {
        this(0, new int[8], new Object[8], true);
    }

    public static zznw c(zznw zznw, zznw zznw2) {
        int i2 = zznw.f25713a + zznw2.f25713a;
        int[] copyOf = Arrays.copyOf(zznw.f25714b, i2);
        System.arraycopy(zznw2.f25714b, 0, copyOf, zznw.f25713a, zznw2.f25713a);
        Object[] copyOf2 = Arrays.copyOf(zznw.f25715c, i2);
        System.arraycopy(zznw2.f25715c, 0, copyOf2, zznw.f25713a, zznw2.f25713a);
        return new zznw(i2, copyOf, copyOf2, true);
    }

    public static void f(int i2, Object obj, zzos zzos) {
        int i3 = i2 >>> 3;
        int i4 = i2 & 7;
        if (i4 == 0) {
            zzos.e(i3, ((Long) obj).longValue());
        } else if (i4 == 1) {
            zzos.x(i3, ((Long) obj).longValue());
        } else if (i4 == 2) {
            zzos.C(i3, (zzjs) obj);
        } else if (i4 != 3) {
            if (i4 == 5) {
                zzos.f(i3, ((Integer) obj).intValue());
                return;
            }
            throw new RuntimeException(zzlk.a());
        } else if (zzos.a() == 1) {
            zzos.t(i3);
            ((zznw) obj).j(zzos);
            zzos.j(i3);
        } else {
            zzos.j(i3);
            ((zznw) obj).j(zzos);
            zzos.t(i3);
        }
    }

    public static zznw k() {
        return f25712f;
    }

    public static zznw l() {
        return new zznw();
    }

    public final int a() {
        int r0;
        int i2 = this.f25716d;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.f25713a; i4++) {
            int i5 = this.f25714b[i4];
            int i6 = i5 >>> 3;
            int i7 = i5 & 7;
            if (i7 == 0) {
                r0 = zzkl.r0(i6, ((Long) this.f25715c[i4]).longValue());
            } else if (i7 == 1) {
                r0 = zzkl.U(i6, ((Long) this.f25715c[i4]).longValue());
            } else if (i7 == 2) {
                r0 = zzkl.V(i6, (zzjs) this.f25715c[i4]);
            } else if (i7 == 3) {
                r0 = (zzkl.x0(i6) << 1) + ((zznw) this.f25715c[i4]).a();
            } else if (i7 == 5) {
                r0 = zzkl.m0(i6, ((Integer) this.f25715c[i4]).intValue());
            } else {
                throw new IllegalStateException(zzlk.a());
            }
            i3 += r0;
        }
        this.f25716d = i3;
        return i3;
    }

    public final zznw b(zznw zznw) {
        if (zznw.equals(f25712f)) {
            return this;
        }
        n();
        int i2 = this.f25713a + zznw.f25713a;
        d(i2);
        System.arraycopy(zznw.f25714b, 0, this.f25714b, this.f25713a, zznw.f25713a);
        System.arraycopy(zznw.f25715c, 0, this.f25715c, this.f25713a, zznw.f25713a);
        this.f25713a = i2;
        return this;
    }

    public final void d(int i2) {
        int[] iArr = this.f25714b;
        if (i2 > iArr.length) {
            int i3 = this.f25713a;
            int i4 = i3 + (i3 / 2);
            if (i4 >= i2) {
                i2 = i4;
            }
            if (i2 < 8) {
                i2 = 8;
            }
            this.f25714b = Arrays.copyOf(iArr, i2);
            this.f25715c = Arrays.copyOf(this.f25715c, i2);
        }
    }

    public final void e(int i2, Object obj) {
        n();
        d(this.f25713a + 1);
        int[] iArr = this.f25714b;
        int i3 = this.f25713a;
        iArr[i3] = i2;
        this.f25715c[i3] = obj;
        this.f25713a = i3 + 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zznw)) {
            return false;
        }
        zznw zznw = (zznw) obj;
        int i2 = this.f25713a;
        if (i2 == zznw.f25713a) {
            int[] iArr = this.f25714b;
            int[] iArr2 = zznw.f25714b;
            int i3 = 0;
            while (true) {
                if (i3 >= i2) {
                    Object[] objArr = this.f25715c;
                    Object[] objArr2 = zznw.f25715c;
                    int i4 = this.f25713a;
                    int i5 = 0;
                    while (i5 < i4) {
                        if (objArr[i5].equals(objArr2[i5])) {
                            i5++;
                        }
                    }
                    return true;
                } else if (iArr[i3] != iArr2[i3]) {
                    break;
                } else {
                    i3++;
                }
            }
        }
        return false;
    }

    public final void g(zzos zzos) {
        if (zzos.a() == 2) {
            for (int i2 = this.f25713a - 1; i2 >= 0; i2--) {
                zzos.l(this.f25714b[i2] >>> 3, this.f25715c[i2]);
            }
            return;
        }
        for (int i3 = 0; i3 < this.f25713a; i3++) {
            zzos.l(this.f25714b[i3] >>> 3, this.f25715c[i3]);
        }
    }

    public final void h(StringBuilder sb, int i2) {
        for (int i3 = 0; i3 < this.f25713a; i3++) {
            zzmm.d(sb, i2, String.valueOf(this.f25714b[i3] >>> 3), this.f25715c[i3]);
        }
    }

    public final int hashCode() {
        int i2 = this.f25713a;
        int i3 = (i2 + 527) * 31;
        int[] iArr = this.f25714b;
        int i4 = 17;
        int i5 = 17;
        for (int i6 = 0; i6 < i2; i6++) {
            i5 = (i5 * 31) + iArr[i6];
        }
        int i7 = (i3 + i5) * 31;
        Object[] objArr = this.f25715c;
        int i8 = this.f25713a;
        for (int i9 = 0; i9 < i8; i9++) {
            i4 = (i4 * 31) + objArr[i9].hashCode();
        }
        return i7 + i4;
    }

    public final int i() {
        int i2 = this.f25716d;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.f25713a; i4++) {
            i3 += zzkl.e0(this.f25714b[i4] >>> 3, (zzjs) this.f25715c[i4]);
        }
        this.f25716d = i3;
        return i3;
    }

    public final void j(zzos zzos) {
        if (this.f25713a != 0) {
            if (zzos.a() == 1) {
                for (int i2 = 0; i2 < this.f25713a; i2++) {
                    f(this.f25714b[i2], this.f25715c[i2], zzos);
                }
                return;
            }
            for (int i3 = this.f25713a - 1; i3 >= 0; i3--) {
                f(this.f25714b[i3], this.f25715c[i3], zzos);
            }
        }
    }

    public final void m() {
        if (this.f25717e) {
            this.f25717e = false;
        }
    }

    public final void n() {
        if (!this.f25717e) {
            throw new UnsupportedOperationException();
        }
    }

    public zznw(int i2, int[] iArr, Object[] objArr, boolean z2) {
        this.f25716d = -1;
        this.f25713a = i2;
        this.f25714b = iArr;
        this.f25715c = objArr;
        this.f25717e = z2;
    }
}
