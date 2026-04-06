package com.hansecom.abt.util;

import android.graphics.Bitmap;
import com.google.zxing.common.BitMatrix;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class BitmapExtKt {
    public static final Bitmap a(BitMatrix bitMatrix, int i2, int i3, Bitmap.Config config) {
        Intrinsics.i(bitMatrix, "<this>");
        Intrinsics.i(config, "config");
        Bitmap createBitmap = Bitmap.createBitmap(bitMatrix.h(), bitMatrix.g(), config);
        int h2 = bitMatrix.h();
        for (int i4 = 0; i4 < h2; i4++) {
            int g2 = bitMatrix.g();
            for (int i5 = 0; i5 < g2; i5++) {
                createBitmap.setPixel(i4, i5, bitMatrix.f(i4, i5) ? i2 : i3);
            }
        }
        return createBitmap;
    }
}
