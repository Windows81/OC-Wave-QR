package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.FormatException;
import java.util.Collection;
import java.util.Collections;

public final class UPCEWriter extends UPCEANWriter {
    public boolean[] d(String str) {
        int length = str.length();
        if (length == 7) {
            try {
                str = str + UPCEANReader.b(UPCEReader.c(str));
            } catch (FormatException e2) {
                throw new IllegalArgumentException(e2);
            }
        } else if (length == 8) {
            try {
                if (!UPCEANReader.a(UPCEReader.c(str))) {
                    throw new IllegalArgumentException("Contents do not pass checksum");
                }
            } catch (FormatException unused) {
                throw new IllegalArgumentException("Illegal contents");
            }
        } else {
            throw new IllegalArgumentException("Requested contents should be 7 or 8 digits long, but got ".concat(String.valueOf(length)));
        }
        OneDimensionalCodeWriter.c(str);
        int digit = Character.digit(str.charAt(0), 10);
        if (digit == 0 || digit == 1) {
            int i2 = UPCEReader.f32735g[digit][Character.digit(str.charAt(7), 10)];
            boolean[] zArr = new boolean[51];
            int b2 = OneDimensionalCodeWriter.b(zArr, 0, UPCEANReader.f32729a, true);
            for (int i3 = 1; i3 <= 6; i3++) {
                int digit2 = Character.digit(str.charAt(i3), 10);
                if (((i2 >> (6 - i3)) & 1) == 1) {
                    digit2 += 10;
                }
                b2 += OneDimensionalCodeWriter.b(zArr, b2, UPCEANReader.f32733e[digit2], false);
            }
            OneDimensionalCodeWriter.b(zArr, b2, UPCEANReader.f32731c, false);
            return zArr;
        }
        throw new IllegalArgumentException("Number system must be 0 or 1");
    }

    public Collection f() {
        return Collections.singleton(BarcodeFormat.UPC_E);
    }
}
