package com.google.zxing.datamatrix;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.Dimension;
import com.google.zxing.EncodeHintType;
import com.google.zxing.Writer;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.datamatrix.encoder.DefaultPlacement;
import com.google.zxing.datamatrix.encoder.ErrorCorrection;
import com.google.zxing.datamatrix.encoder.HighLevelEncoder;
import com.google.zxing.datamatrix.encoder.SymbolInfo;
import com.google.zxing.datamatrix.encoder.SymbolShapeHint;
import com.google.zxing.qrcode.encoder.ByteMatrix;
import java.util.Map;

public final class DataMatrixWriter implements Writer {
    public static BitMatrix b(ByteMatrix byteMatrix, int i2, int i3) {
        BitMatrix bitMatrix;
        int e2 = byteMatrix.e();
        int d2 = byteMatrix.d();
        int max = Math.max(i2, e2);
        int max2 = Math.max(i3, d2);
        int min = Math.min(max / e2, max2 / d2);
        int i4 = (max - (e2 * min)) / 2;
        int i5 = (max2 - (d2 * min)) / 2;
        if (i3 < d2 || i2 < e2) {
            bitMatrix = new BitMatrix(e2, d2);
            i4 = 0;
            i5 = 0;
        } else {
            bitMatrix = new BitMatrix(i2, i3);
        }
        bitMatrix.c();
        int i6 = 0;
        while (i6 < d2) {
            int i7 = i4;
            int i8 = 0;
            while (i8 < e2) {
                if (byteMatrix.b(i8, i6) == 1) {
                    bitMatrix.j(i7, i5, min, min);
                }
                i8++;
                i7 += min;
            }
            i6++;
            i5 += min;
        }
        return bitMatrix;
    }

    public static BitMatrix c(DefaultPlacement defaultPlacement, SymbolInfo symbolInfo, int i2, int i3) {
        int h2 = symbolInfo.h();
        int g2 = symbolInfo.g();
        ByteMatrix byteMatrix = new ByteMatrix(symbolInfo.j(), symbolInfo.i());
        int i4 = 0;
        for (int i5 = 0; i5 < g2; i5++) {
            if (i5 % symbolInfo.f32683e == 0) {
                int i6 = 0;
                for (int i7 = 0; i7 < symbolInfo.j(); i7++) {
                    byteMatrix.g(i6, i4, i7 % 2 == 0);
                    i6++;
                }
                i4++;
            }
            int i8 = 0;
            for (int i9 = 0; i9 < h2; i9++) {
                if (i9 % symbolInfo.f32682d == 0) {
                    byteMatrix.g(i8, i4, true);
                    i8++;
                }
                byteMatrix.g(i8, i4, defaultPlacement.e(i9, i5));
                int i10 = i8 + 1;
                int i11 = symbolInfo.f32682d;
                if (i9 % i11 == i11 - 1) {
                    byteMatrix.g(i10, i4, i5 % 2 == 0);
                    i8 += 2;
                } else {
                    i8 = i10;
                }
            }
            int i12 = i4 + 1;
            int i13 = symbolInfo.f32683e;
            if (i5 % i13 == i13 - 1) {
                int i14 = 0;
                for (int i15 = 0; i15 < symbolInfo.j(); i15++) {
                    byteMatrix.g(i14, i12, true);
                    i14++;
                }
                i4 += 2;
            } else {
                i4 = i12;
            }
        }
        return b(byteMatrix, i2, i3);
    }

    public BitMatrix a(String str, BarcodeFormat barcodeFormat, int i2, int i3, Map map) {
        Dimension dimension;
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        } else if (barcodeFormat != BarcodeFormat.DATA_MATRIX) {
            throw new IllegalArgumentException("Can only encode DATA_MATRIX, but got ".concat(String.valueOf(barcodeFormat)));
        } else if (i2 < 0 || i3 < 0) {
            throw new IllegalArgumentException("Requested dimensions can't be negative: " + i2 + 'x' + i3);
        } else {
            SymbolShapeHint symbolShapeHint = SymbolShapeHint.FORCE_NONE;
            Dimension dimension2 = null;
            if (map != null) {
                SymbolShapeHint symbolShapeHint2 = (SymbolShapeHint) map.get(EncodeHintType.DATA_MATRIX_SHAPE);
                if (symbolShapeHint2 != null) {
                    symbolShapeHint = symbolShapeHint2;
                }
                Dimension dimension3 = (Dimension) map.get(EncodeHintType.MIN_SIZE);
                if (dimension3 == null) {
                    dimension3 = null;
                }
                dimension = (Dimension) map.get(EncodeHintType.MAX_SIZE);
                if (dimension == null) {
                    dimension = null;
                }
                dimension2 = dimension3;
            } else {
                dimension = null;
            }
            String b2 = HighLevelEncoder.b(str, symbolShapeHint, dimension2, dimension);
            SymbolInfo l2 = SymbolInfo.l(b2.length(), symbolShapeHint, dimension2, dimension, true);
            DefaultPlacement defaultPlacement = new DefaultPlacement(ErrorCorrection.b(b2, l2), l2.h(), l2.g());
            defaultPlacement.h();
            return c(defaultPlacement, l2, i2, i3);
        }
    }
}
