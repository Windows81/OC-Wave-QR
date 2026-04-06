package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import java.util.Collection;
import java.util.Collections;

public final class ITFWriter extends OneDimensionalCodeWriter {

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f32720b = {1, 1, 1, 1};

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f32721c = {3, 1, 1};

    /* renamed from: d  reason: collision with root package name */
    public static final int[][] f32722d = {new int[]{1, 1, 3, 3, 1}, new int[]{3, 1, 1, 1, 3}, new int[]{1, 3, 1, 1, 3}, new int[]{3, 3, 1, 1, 1}, new int[]{1, 1, 3, 1, 3}, new int[]{3, 1, 3, 1, 1}, new int[]{1, 3, 3, 1, 1}, new int[]{1, 1, 1, 3, 3}, new int[]{3, 1, 1, 3, 1}, new int[]{1, 3, 1, 3, 1}};

    public boolean[] d(String str) {
        int length = str.length();
        if (length % 2 != 0) {
            throw new IllegalArgumentException("The length of the input should be even");
        } else if (length <= 80) {
            OneDimensionalCodeWriter.c(str);
            boolean[] zArr = new boolean[((length * 9) + 9)];
            int b2 = OneDimensionalCodeWriter.b(zArr, 0, f32720b, true);
            for (int i2 = 0; i2 < length; i2 += 2) {
                int digit = Character.digit(str.charAt(i2), 10);
                int digit2 = Character.digit(str.charAt(i2 + 1), 10);
                int[] iArr = new int[10];
                for (int i3 = 0; i3 < 5; i3++) {
                    int i4 = i3 * 2;
                    int[][] iArr2 = f32722d;
                    iArr[i4] = iArr2[digit][i3];
                    iArr[i4 + 1] = iArr2[digit2][i3];
                }
                b2 += OneDimensionalCodeWriter.b(zArr, b2, iArr, true);
            }
            OneDimensionalCodeWriter.b(zArr, b2, f32721c, true);
            return zArr;
        } else {
            throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got ".concat(String.valueOf(length)));
        }
    }

    public Collection f() {
        return Collections.singleton(BarcodeFormat.ITF);
    }
}
