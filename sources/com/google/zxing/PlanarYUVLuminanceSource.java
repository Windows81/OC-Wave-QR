package com.google.zxing;

public final class PlanarYUVLuminanceSource extends LuminanceSource {

    /* renamed from: c  reason: collision with root package name */
    public final byte[] f32454c;

    /* renamed from: d  reason: collision with root package name */
    public final int f32455d;

    /* renamed from: e  reason: collision with root package name */
    public final int f32456e;

    /* renamed from: f  reason: collision with root package name */
    public final int f32457f;

    /* renamed from: g  reason: collision with root package name */
    public final int f32458g;

    public byte[] b() {
        int d2 = d();
        int a2 = a();
        int i2 = this.f32455d;
        if (d2 == i2 && a2 == this.f32456e) {
            return this.f32454c;
        }
        int i3 = d2 * a2;
        byte[] bArr = new byte[i3];
        int i4 = (this.f32458g * i2) + this.f32457f;
        if (d2 == i2) {
            System.arraycopy(this.f32454c, i4, bArr, 0, i3);
            return bArr;
        }
        for (int i5 = 0; i5 < a2; i5++) {
            System.arraycopy(this.f32454c, i4, bArr, i5 * d2, d2);
            i4 += this.f32455d;
        }
        return bArr;
    }

    public byte[] c(int i2, byte[] bArr) {
        if (i2 < 0 || i2 >= a()) {
            throw new IllegalArgumentException("Requested row is outside the image: ".concat(String.valueOf(i2)));
        }
        int d2 = d();
        if (bArr == null || bArr.length < d2) {
            bArr = new byte[d2];
        }
        System.arraycopy(this.f32454c, ((i2 + this.f32458g) * this.f32455d) + this.f32457f, bArr, 0, d2);
        return bArr;
    }
}
