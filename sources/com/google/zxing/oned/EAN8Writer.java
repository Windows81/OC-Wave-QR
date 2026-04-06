package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.FormatException;
import java.util.Collection;
import java.util.Collections;

public final class EAN8Writer extends UPCEANWriter {
    public boolean[] d(String str) {
        int length = str.length();
        if (length == 7) {
            try {
                str = str + UPCEANReader.b(str);
            } catch (FormatException e2) {
                throw new IllegalArgumentException(e2);
            }
        } else if (length == 8) {
            try {
                if (!UPCEANReader.a(str)) {
                    throw new IllegalArgumentException("Contents do not pass checksum");
                }
            } catch (FormatException unused) {
                throw new IllegalArgumentException("Illegal contents");
            }
        } else {
            throw new IllegalArgumentException("Requested contents should be 7 or 8 digits long, but got ".concat(String.valueOf(length)));
        }
        OneDimensionalCodeWriter.c(str);
        boolean[] zArr = new boolean[67];
        int b2 = OneDimensionalCodeWriter.b(zArr, 0, UPCEANReader.f32729a, true);
        for (int i2 = 0; i2 <= 3; i2++) {
            b2 += OneDimensionalCodeWriter.b(zArr, b2, UPCEANReader.f32732d[Character.digit(str.charAt(i2), 10)], false);
        }
        int b3 = b2 + OneDimensionalCodeWriter.b(zArr, b2, UPCEANReader.f32730b, false);
        for (int i3 = 4; i3 <= 7; i3++) {
            b3 += OneDimensionalCodeWriter.b(zArr, b3, UPCEANReader.f32732d[Character.digit(str.charAt(i3), 10)], true);
        }
        OneDimensionalCodeWriter.b(zArr, b3, UPCEANReader.f32729a, true);
        return zArr;
    }

    public Collection f() {
        return Collections.singleton(BarcodeFormat.EAN_8);
    }
}
