package com.google.zxing.common;

import com.google.zxing.Binarizer;
import com.google.zxing.LuminanceSource;
import com.google.zxing.NotFoundException;

public class GlobalHistogramBinarizer extends Binarizer {

    /* renamed from: d  reason: collision with root package name */
    public static final byte[] f32612d = new byte[0];

    /* renamed from: b  reason: collision with root package name */
    public byte[] f32613b;

    /* renamed from: c  reason: collision with root package name */
    public final int[] f32614c;

    public static int c(int[] iArr) {
        int length = iArr.length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < length; i5++) {
            int i6 = iArr[i5];
            if (i6 > i2) {
                i4 = i5;
                i2 = i6;
            }
            if (i6 > i3) {
                i3 = i6;
            }
        }
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < length; i9++) {
            int i10 = i9 - i4;
            int i11 = iArr[i9] * i10 * i10;
            if (i11 > i8) {
                i7 = i9;
                i8 = i11;
            }
        }
        if (i4 <= i7) {
            int i12 = i4;
            i4 = i7;
            i7 = i12;
        }
        if (i4 - i7 > length / 16) {
            int i13 = i4 - 1;
            int i14 = -1;
            int i15 = i13;
            while (i13 > i7) {
                int i16 = i13 - i7;
                int i17 = i16 * i16 * (i4 - i13) * (i3 - iArr[i13]);
                if (i17 > i14) {
                    i15 = i13;
                    i14 = i17;
                }
                i13--;
            }
            return i15 << 3;
        }
        throw NotFoundException.a();
    }

    public BitMatrix a() {
        LuminanceSource b2 = b();
        int d2 = b2.d();
        int a2 = b2.a();
        BitMatrix bitMatrix = new BitMatrix(d2, a2);
        d(d2);
        int[] iArr = this.f32614c;
        for (int i2 = 1; i2 < 5; i2++) {
            byte[] c2 = b2.c((a2 * i2) / 5, this.f32613b);
            int i3 = (d2 << 2) / 5;
            for (int i4 = d2 / 5; i4 < i3; i4++) {
                int i5 = (c2[i4] & 255) >> 3;
                iArr[i5] = iArr[i5] + 1;
            }
        }
        int c3 = c(iArr);
        byte[] b3 = b2.b();
        for (int i6 = 0; i6 < a2; i6++) {
            int i7 = i6 * d2;
            for (int i8 = 0; i8 < d2; i8++) {
                if ((b3[i7 + i8] & 255) < c3) {
                    bitMatrix.i(i8, i6);
                }
            }
        }
        return bitMatrix;
    }

    public final void d(int i2) {
        if (this.f32613b.length < i2) {
            this.f32613b = new byte[i2];
        }
        for (int i3 = 0; i3 < 32; i3++) {
            this.f32614c[i3] = 0;
        }
    }
}
