package com.google.zxing;

public final class InvertedLuminanceSource extends LuminanceSource {

    /* renamed from: c  reason: collision with root package name */
    public final LuminanceSource f32448c;

    public byte[] b() {
        byte[] b2 = this.f32448c.b();
        int d2 = d() * a();
        byte[] bArr = new byte[d2];
        for (int i2 = 0; i2 < d2; i2++) {
            bArr[i2] = (byte) (255 - (b2[i2] & 255));
        }
        return bArr;
    }

    public byte[] c(int i2, byte[] bArr) {
        byte[] c2 = this.f32448c.c(i2, bArr);
        int d2 = d();
        for (int i3 = 0; i3 < d2; i3++) {
            c2[i3] = (byte) (255 - (c2[i3] & 255));
        }
        return c2;
    }
}
