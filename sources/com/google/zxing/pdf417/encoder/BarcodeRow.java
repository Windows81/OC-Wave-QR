package com.google.zxing.pdf417.encoder;

final class BarcodeRow {

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f32801a;

    /* renamed from: b  reason: collision with root package name */
    public int f32802b = 0;

    public BarcodeRow(int i2) {
        this.f32801a = new byte[i2];
    }

    public void a(boolean z2, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = this.f32802b;
            this.f32802b = i4 + 1;
            c(i4, z2);
        }
    }

    public byte[] b(int i2) {
        int length = this.f32801a.length * i2;
        byte[] bArr = new byte[length];
        for (int i3 = 0; i3 < length; i3++) {
            bArr[i3] = this.f32801a[i3 / i2];
        }
        return bArr;
    }

    public final void c(int i2, boolean z2) {
        this.f32801a[i2] = z2 ? (byte) 1 : 0;
    }
}
