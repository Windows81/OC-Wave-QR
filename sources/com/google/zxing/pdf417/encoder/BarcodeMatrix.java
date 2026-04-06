package com.google.zxing.pdf417.encoder;

import java.lang.reflect.Array;

public final class BarcodeMatrix {

    /* renamed from: a  reason: collision with root package name */
    public final BarcodeRow[] f32797a;

    /* renamed from: b  reason: collision with root package name */
    public int f32798b;

    /* renamed from: c  reason: collision with root package name */
    public final int f32799c;

    /* renamed from: d  reason: collision with root package name */
    public final int f32800d;

    public BarcodeMatrix(int i2, int i3) {
        BarcodeRow[] barcodeRowArr = new BarcodeRow[i2];
        this.f32797a = barcodeRowArr;
        int length = barcodeRowArr.length;
        for (int i4 = 0; i4 < length; i4++) {
            this.f32797a[i4] = new BarcodeRow(((i3 + 4) * 17) + 1);
        }
        this.f32800d = i3 * 17;
        this.f32799c = i2;
        this.f32798b = -1;
    }

    public BarcodeRow a() {
        return this.f32797a[this.f32798b];
    }

    public byte[][] b(int i2, int i3) {
        int[] iArr = new int[2];
        iArr[1] = this.f32800d * i2;
        iArr[0] = this.f32799c * i3;
        byte[][] bArr = (byte[][]) Array.newInstance(Byte.TYPE, iArr);
        int i4 = this.f32799c * i3;
        for (int i5 = 0; i5 < i4; i5++) {
            bArr[(i4 - i5) - 1] = this.f32797a[i5 / i3].b(i2);
        }
        return bArr;
    }

    public void c() {
        this.f32798b++;
    }
}
