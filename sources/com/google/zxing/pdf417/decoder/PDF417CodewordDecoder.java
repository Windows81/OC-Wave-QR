package com.google.zxing.pdf417.decoder;

import com.google.zxing.pdf417.PDF417Common;
import java.lang.reflect.Array;

final class PDF417CodewordDecoder {

    /* renamed from: a  reason: collision with root package name */
    public static final float[][] f32782a;

    static {
        int i2;
        int length = PDF417Common.f32766b.length;
        int[] iArr = new int[2];
        iArr[1] = 8;
        iArr[0] = length;
        f32782a = (float[][]) Array.newInstance(Float.TYPE, iArr);
        int i3 = 0;
        while (true) {
            int[] iArr2 = PDF417Common.f32766b;
            if (i3 < iArr2.length) {
                int i4 = iArr2[i3];
                int i5 = i4 & 1;
                int i6 = 0;
                while (i6 < 8) {
                    float f2 = 0.0f;
                    while (true) {
                        i2 = i4 & 1;
                        if (i2 != i5) {
                            break;
                        }
                        f2 += 1.0f;
                        i4 >>= 1;
                    }
                    f32782a[i3][7 - i6] = f2 / 17.0f;
                    i6++;
                    i5 = i2;
                }
                i3++;
            } else {
                return;
            }
        }
    }
}
