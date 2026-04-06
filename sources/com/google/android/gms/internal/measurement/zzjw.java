package com.google.android.gms.internal.measurement;

final class zzjw extends zzkb {
    public final int D;
    public final int E;

    public zzjw(byte[] bArr, int i2, int i3) {
        super(bArr);
        zzjs.i(i2, i2 + i3, bArr.length);
        this.D = i2;
        this.E = i3;
    }

    public final int B() {
        return this.D;
    }

    public final byte e(int i2) {
        int u2 = u();
        if (((u2 - (i2 + 1)) | i2) >= 0) {
            return this.C[this.D + i2];
        }
        if (i2 < 0) {
            throw new ArrayIndexOutOfBoundsException("Index < 0: " + i2);
        }
        throw new ArrayIndexOutOfBoundsException("Index > length: " + i2 + ", " + u2);
    }

    public final byte s(int i2) {
        return this.C[this.D + i2];
    }

    public final int u() {
        return this.E;
    }
}
