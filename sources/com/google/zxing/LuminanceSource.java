package com.google.zxing;

public abstract class LuminanceSource {

    /* renamed from: a  reason: collision with root package name */
    public final int f32449a;

    /* renamed from: b  reason: collision with root package name */
    public final int f32450b;

    public final int a() {
        return this.f32450b;
    }

    public abstract byte[] b();

    public abstract byte[] c(int i2, byte[] bArr);

    public final int d() {
        return this.f32449a;
    }

    public final String toString() {
        int i2 = this.f32449a;
        byte[] bArr = new byte[i2];
        StringBuilder sb = new StringBuilder(this.f32450b * (i2 + 1));
        for (int i3 = 0; i3 < this.f32450b; i3++) {
            bArr = c(i3, bArr);
            for (int i4 = 0; i4 < this.f32449a; i4++) {
                byte b2 = bArr[i4] & 255;
                sb.append(b2 < 64 ? '#' : b2 < 128 ? '+' : b2 < 192 ? '.' : ' ');
            }
            sb.append(10);
        }
        return sb.toString();
    }
}
