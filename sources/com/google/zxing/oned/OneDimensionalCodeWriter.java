package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.Writer;
import com.google.zxing.common.BitMatrix;
import java.util.Collection;
import java.util.Map;
import java.util.regex.Pattern;

public abstract class OneDimensionalCodeWriter implements Writer {

    /* renamed from: a  reason: collision with root package name */
    public static final Pattern f32725a = Pattern.compile("[0-9]+");

    public static int b(boolean[] zArr, int i2, int[] iArr, boolean z2) {
        int i3 = 0;
        for (int i4 : iArr) {
            int i5 = 0;
            while (i5 < i4) {
                zArr[i2] = z2;
                i5++;
                i2++;
            }
            i3 += i4;
            z2 = !z2;
        }
        return i3;
    }

    public static void c(String str) {
        if (!f32725a.matcher(str).matches()) {
            throw new IllegalArgumentException("Input should only contain digits 0-9");
        }
    }

    public static BitMatrix g(boolean[] zArr, int i2, int i3, int i4) {
        int length = zArr.length;
        int i5 = i4 + length;
        int max = Math.max(i2, i5);
        int max2 = Math.max(1, i3);
        int i6 = max / i5;
        int i7 = (max - (length * i6)) / 2;
        BitMatrix bitMatrix = new BitMatrix(max, max2);
        int i8 = 0;
        while (i8 < length) {
            if (zArr[i8]) {
                bitMatrix.j(i7, 0, i6, max2);
            }
            i8++;
            i7 += i6;
        }
        return bitMatrix;
    }

    public BitMatrix a(String str, BarcodeFormat barcodeFormat, int i2, int i3, Map map) {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        } else if (i2 < 0 || i3 < 0) {
            throw new IllegalArgumentException("Negative size is not allowed. Input: " + i2 + 'x' + i3);
        } else {
            Collection f2 = f();
            if (f2 == null || f2.contains(barcodeFormat)) {
                int e2 = e();
                if (map != null) {
                    EncodeHintType encodeHintType = EncodeHintType.MARGIN;
                    if (map.containsKey(encodeHintType)) {
                        e2 = Integer.parseInt(map.get(encodeHintType).toString());
                    }
                }
                return g(d(str), i2, i3, e2);
            }
            throw new IllegalArgumentException("Can only encode " + f2 + ", but got " + barcodeFormat);
        }
    }

    public abstract boolean[] d(String str);

    public int e() {
        return 10;
    }

    public Collection f() {
        return null;
    }
}
