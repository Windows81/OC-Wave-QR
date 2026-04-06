package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.FormatException;
import java.util.Collection;
import java.util.Collections;

public final class EAN13Writer extends UPCEANWriter {
    public boolean[] d(String str) {
        int length = str.length();
        if (length == 12) {
            try {
                str = str + UPCEANReader.b(str);
            } catch (FormatException e2) {
                throw new IllegalArgumentException(e2);
            }
        } else if (length == 13) {
            try {
                if (!UPCEANReader.a(str)) {
                    throw new IllegalArgumentException("Contents do not pass checksum");
                }
            } catch (FormatException unused) {
                throw new IllegalArgumentException("Illegal contents");
            }
        } else {
            throw new IllegalArgumentException("Requested contents should be 12 or 13 digits long, but got ".concat(String.valueOf(length)));
        }
        OneDimensionalCodeWriter.c(str);
        int i2 = EAN13Reader.f32715f[Character.digit(str.charAt(0), 10)];
        boolean[] zArr = new boolean[95];
        int b2 = OneDimensionalCodeWriter.b(zArr, 0, UPCEANReader.f32729a, true);
        for (int i3 = 1; i3 <= 6; i3++) {
            int digit = Character.digit(str.charAt(i3), 10);
            if (((i2 >> (6 - i3)) & 1) == 1) {
                digit += 10;
            }
            b2 += OneDimensionalCodeWriter.b(zArr, b2, UPCEANReader.f32733e[digit], false);
        }
        int b3 = b2 + OneDimensionalCodeWriter.b(zArr, b2, UPCEANReader.f32730b, false);
        for (int i4 = 7; i4 <= 12; i4++) {
            b3 += OneDimensionalCodeWriter.b(zArr, b3, UPCEANReader.f32732d[Character.digit(str.charAt(i4), 10)], true);
        }
        OneDimensionalCodeWriter.b(zArr, b3, UPCEANReader.f32729a, true);
        return zArr;
    }

    public Collection f() {
        return Collections.singleton(BarcodeFormat.EAN_13);
    }
}
