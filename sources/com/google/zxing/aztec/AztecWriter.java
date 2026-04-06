package com.google.zxing.aztec;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.Writer;
import com.google.zxing.aztec.encoder.AztecCode;
import com.google.zxing.aztec.encoder.Encoder;
import com.google.zxing.common.BitMatrix;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Map;

public final class AztecWriter implements Writer {
    public static BitMatrix c(String str, BarcodeFormat barcodeFormat, int i2, int i3, Charset charset, int i4, int i5) {
        if (barcodeFormat == BarcodeFormat.AZTEC) {
            return d(Encoder.d(str.getBytes(charset), i4, i5), i2, i3);
        }
        throw new IllegalArgumentException("Can only encode AZTEC, but got ".concat(String.valueOf(barcodeFormat)));
    }

    public static BitMatrix d(AztecCode aztecCode, int i2, int i3) {
        BitMatrix a2 = aztecCode.a();
        if (a2 != null) {
            int h2 = a2.h();
            int g2 = a2.g();
            int max = Math.max(i2, h2);
            int max2 = Math.max(i3, g2);
            int min = Math.min(max / h2, max2 / g2);
            int i4 = (max - (h2 * min)) / 2;
            int i5 = (max2 - (g2 * min)) / 2;
            BitMatrix bitMatrix = new BitMatrix(max, max2);
            int i6 = 0;
            while (i6 < g2) {
                int i7 = 0;
                int i8 = i4;
                while (i7 < h2) {
                    if (a2.f(i7, i6)) {
                        bitMatrix.j(i8, i5, min, min);
                    }
                    i7++;
                    i8 += min;
                }
                i6++;
                i5 += min;
            }
            return bitMatrix;
        }
        throw new IllegalStateException();
    }

    public BitMatrix a(String str, BarcodeFormat barcodeFormat, int i2, int i3, Map map) {
        Charset charset = StandardCharsets.ISO_8859_1;
        int i4 = 33;
        int i5 = 0;
        if (map != null) {
            EncodeHintType encodeHintType = EncodeHintType.CHARACTER_SET;
            if (map.containsKey(encodeHintType)) {
                charset = Charset.forName(map.get(encodeHintType).toString());
            }
            EncodeHintType encodeHintType2 = EncodeHintType.ERROR_CORRECTION;
            if (map.containsKey(encodeHintType2)) {
                i4 = Integer.parseInt(map.get(encodeHintType2).toString());
            }
            EncodeHintType encodeHintType3 = EncodeHintType.AZTEC_LAYERS;
            if (map.containsKey(encodeHintType3)) {
                i5 = Integer.parseInt(map.get(encodeHintType3).toString());
            }
        }
        return c(str, barcodeFormat, i2, i3, charset, i4, i5);
    }

    public BitMatrix b(String str, BarcodeFormat barcodeFormat, int i2, int i3) {
        return a(str, barcodeFormat, i2, i3, (Map) null);
    }
}
