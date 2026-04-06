package com.google.android.gms.internal.measurement;

class zzkb extends zzjz {
    public final byte[] C;

    public zzkb(byte[] bArr) {
        super();
        bArr.getClass();
        this.C = bArr;
    }

    public final boolean A(zzjs zzjs, int i2, int i3) {
        if (i3 > zzjs.u()) {
            int u2 = u();
            throw new IllegalArgumentException("Length too large: " + i3 + u2);
        } else if (i3 > zzjs.u()) {
            int u3 = zzjs.u();
            throw new IllegalArgumentException("Ran off end of other: " + 0 + ", " + i3 + ", " + u3);
        } else if (!(zzjs instanceof zzkb)) {
            return zzjs.m(0, i3).equals(m(0, i3));
        } else {
            zzkb zzkb = (zzkb) zzjs;
            byte[] bArr = this.C;
            byte[] bArr2 = zzkb.C;
            int B2 = B() + i3;
            int B3 = B();
            int B4 = zzkb.B();
            while (B3 < B2) {
                if (bArr[B3] != bArr2[B4]) {
                    return false;
                }
                B3++;
                B4++;
            }
            return true;
        }
    }

    public int B() {
        return 0;
    }

    public byte e(int i2) {
        return this.C[i2];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzjs) || u() != ((zzjs) obj).u()) {
            return false;
        }
        if (u() == 0) {
            return true;
        }
        if (!(obj instanceof zzkb)) {
            return obj.equals(this);
        }
        zzkb zzkb = (zzkb) obj;
        int g2 = g();
        int g3 = zzkb.g();
        if (g2 == 0 || g3 == 0 || g2 == g3) {
            return A(zzkb, 0, u());
        }
        return false;
    }

    public final zzjs m(int i2, int i3) {
        int i4 = zzjs.i(0, i3, u());
        return i4 == 0 ? zzjs.f25568A : new zzjw(this.C, B(), i4);
    }

    public final void q(zzjp zzjp) {
        zzjp.a(this.C, B(), u());
    }

    public byte s(int i2) {
        return this.C[i2];
    }

    public int u() {
        return this.C.length;
    }

    public final int v(int i2, int i3, int i4) {
        return zzle.a(i2, this.C, B(), i4);
    }
}
