package com.google.zxing.pdf417;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.Writer;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.pdf417.encoder.Compaction;
import com.google.zxing.pdf417.encoder.Dimensions;
import com.google.zxing.pdf417.encoder.PDF417;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.Map;

public final class PDF417Writer implements Writer {
    public static BitMatrix b(byte[][] bArr, int i2) {
        int i3 = i2 * 2;
        BitMatrix bitMatrix = new BitMatrix(bArr[0].length + i3, bArr.length + i3);
        bitMatrix.c();
        int g2 = (bitMatrix.g() - i2) - 1;
        int i4 = 0;
        while (i4 < bArr.length) {
            byte[] bArr2 = bArr[i4];
            for (int i5 = 0; i5 < bArr[0].length; i5++) {
                if (bArr2[i5] == 1) {
                    bitMatrix.i(i5 + i2, g2);
                }
            }
            i4++;
            g2--;
        }
        return bitMatrix;
    }

    public static BitMatrix c(PDF417 pdf417, String str, int i2, int i3, int i4, int i5) {
        boolean z2;
        pdf417.e(str, i2);
        byte[][] b2 = pdf417.f().b(1, 4);
        if ((i4 > i3) != (b2[0].length < b2.length)) {
            b2 = d(b2);
            z2 = true;
        } else {
            z2 = false;
        }
        int min = Math.min(i3 / b2[0].length, i4 / b2.length);
        if (min <= 1) {
            return b(b2, i5);
        }
        byte[][] b3 = pdf417.f().b(min, min << 2);
        if (z2) {
            b3 = d(b3);
        }
        return b(b3, i5);
    }

    public static byte[][] d(byte[][] bArr) {
        int length = bArr[0].length;
        int[] iArr = new int[2];
        iArr[1] = bArr.length;
        iArr[0] = length;
        byte[][] bArr2 = (byte[][]) Array.newInstance(Byte.TYPE, iArr);
        for (int i2 = 0; i2 < bArr.length; i2++) {
            int length2 = (bArr.length - i2) - 1;
            for (int i3 = 0; i3 < bArr[0].length; i3++) {
                bArr2[i3][length2] = bArr[i2][i3];
            }
        }
        return bArr2;
    }

    public BitMatrix a(String str, BarcodeFormat barcodeFormat, int i2, int i3, Map map) {
        if (barcodeFormat == BarcodeFormat.PDF_417) {
            PDF417 pdf417 = new PDF417();
            int i4 = 30;
            int i5 = 2;
            if (map != null) {
                EncodeHintType encodeHintType = EncodeHintType.PDF417_COMPACT;
                if (map.containsKey(encodeHintType)) {
                    pdf417.h(Boolean.parseBoolean(map.get(encodeHintType).toString()));
                }
                EncodeHintType encodeHintType2 = EncodeHintType.PDF417_COMPACTION;
                if (map.containsKey(encodeHintType2)) {
                    pdf417.i(Compaction.valueOf(map.get(encodeHintType2).toString()));
                }
                EncodeHintType encodeHintType3 = EncodeHintType.PDF417_DIMENSIONS;
                if (map.containsKey(encodeHintType3)) {
                    Dimensions dimensions = (Dimensions) map.get(encodeHintType3);
                    pdf417.j(dimensions.a(), dimensions.c(), dimensions.b(), dimensions.d());
                }
                EncodeHintType encodeHintType4 = EncodeHintType.MARGIN;
                if (map.containsKey(encodeHintType4)) {
                    i4 = Integer.parseInt(map.get(encodeHintType4).toString());
                }
                EncodeHintType encodeHintType5 = EncodeHintType.ERROR_CORRECTION;
                if (map.containsKey(encodeHintType5)) {
                    i5 = Integer.parseInt(map.get(encodeHintType5).toString());
                }
                EncodeHintType encodeHintType6 = EncodeHintType.CHARACTER_SET;
                if (map.containsKey(encodeHintType6)) {
                    pdf417.k(Charset.forName(map.get(encodeHintType6).toString()));
                }
            }
            return c(pdf417, str, i5, i2, i3, i4);
        }
        throw new IllegalArgumentException("Can only encode PDF_417, but got ".concat(String.valueOf(barcodeFormat)));
    }
}
