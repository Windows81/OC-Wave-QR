package com.google.zxing.qrcode.encoder;

import java.lang.reflect.Array;
import java.util.Arrays;

public final class ByteMatrix {

    /* renamed from: a  reason: collision with root package name */
    public final byte[][] f32855a;

    /* renamed from: b  reason: collision with root package name */
    public final int f32856b;

    /* renamed from: c  reason: collision with root package name */
    public final int f32857c;

    public ByteMatrix(int i2, int i3) {
        int[] iArr = new int[2];
        iArr[1] = i2;
        iArr[0] = i3;
        this.f32855a = (byte[][]) Array.newInstance(Byte.TYPE, iArr);
        this.f32856b = i2;
        this.f32857c = i3;
    }

    public void a(byte b2) {
        for (byte[] fill : this.f32855a) {
            Arrays.fill(fill, b2);
        }
    }

    public byte b(int i2, int i3) {
        return this.f32855a[i3][i2];
    }

    public byte[][] c() {
        return this.f32855a;
    }

    public int d() {
        return this.f32857c;
    }

    public int e() {
        return this.f32856b;
    }

    public void f(int i2, int i3, int i4) {
        this.f32855a[i3][i2] = (byte) i4;
    }

    public void g(int i2, int i3, boolean z2) {
        this.f32855a[i3][i2] = z2 ? (byte) 1 : 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder((this.f32856b * 2 * this.f32857c) + 2);
        for (int i2 = 0; i2 < this.f32857c; i2++) {
            byte[] bArr = this.f32855a[i2];
            for (int i3 = 0; i3 < this.f32856b; i3++) {
                byte b2 = bArr[i3];
                if (b2 == 0) {
                    sb.append(" 0");
                } else if (b2 != 1) {
                    sb.append("  ");
                } else {
                    sb.append(" 1");
                }
            }
            sb.append(10);
        }
        return sb.toString();
    }
}
