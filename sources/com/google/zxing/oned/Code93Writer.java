package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import java.util.Collection;
import java.util.Collections;

public class Code93Writer extends OneDimensionalCodeWriter {
    public static int h(boolean[] zArr, int i2, int i3) {
        for (int i4 = 0; i4 < 9; i4++) {
            boolean z2 = true;
            int i5 = i2 + i4;
            if (((1 << (8 - i4)) & i3) == 0) {
                z2 = false;
            }
            zArr[i5] = z2;
        }
        return 9;
    }

    public static int i(String str, int i2) {
        int i3 = 0;
        int i4 = 1;
        for (int length = str.length() - 1; length >= 0; length--) {
            i3 += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(str.charAt(length)) * i4;
            i4++;
            if (i4 > i2) {
                i4 = 1;
            }
        }
        return i3 % 47;
    }

    public static String j(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(length << 1);
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (charAt == 0) {
                sb.append("bU");
            } else if (charAt <= 26) {
                sb.append('a');
                sb.append((char) (charAt + '@'));
            } else if (charAt <= 31) {
                sb.append('b');
                sb.append((char) (charAt + '&'));
            } else if (charAt == ' ' || charAt == '$' || charAt == '%' || charAt == '+') {
                sb.append(charAt);
            } else if (charAt <= ',') {
                sb.append('c');
                sb.append((char) (charAt + ' '));
            } else if (charAt <= '9') {
                sb.append(charAt);
            } else if (charAt == ':') {
                sb.append("cZ");
            } else if (charAt <= '?') {
                sb.append('b');
                sb.append((char) (charAt + 11));
            } else if (charAt == '@') {
                sb.append("bV");
            } else if (charAt <= 'Z') {
                sb.append(charAt);
            } else if (charAt <= '_') {
                sb.append('b');
                sb.append((char) (charAt - 16));
            } else if (charAt == '`') {
                sb.append("bW");
            } else if (charAt <= 'z') {
                sb.append('d');
                sb.append((char) (charAt - ' '));
            } else if (charAt <= 127) {
                sb.append('b');
                sb.append((char) (charAt - '+'));
            } else {
                throw new IllegalArgumentException("Requested content contains a non-encodable character: '" + charAt + "'");
            }
        }
        return sb.toString();
    }

    public boolean[] d(String str) {
        String j2 = j(str);
        int length = j2.length();
        if (length <= 80) {
            boolean[] zArr = new boolean[(((j2.length() + 4) * 9) + 1)];
            int h2 = h(zArr, 0, Code93Reader.f32714c);
            for (int i2 = 0; i2 < length; i2++) {
                h2 += h(zArr, h2, Code93Reader.f32713b["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(j2.charAt(i2))]);
            }
            int i3 = i(j2, 20);
            int[] iArr = Code93Reader.f32713b;
            int h3 = h2 + h(zArr, h2, iArr[i3]);
            int h4 = h3 + h(zArr, h3, iArr[i(j2 + "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".charAt(i3), 15)]);
            zArr[h4 + h(zArr, h4, Code93Reader.f32714c)] = true;
            return zArr;
        }
        throw new IllegalArgumentException("Requested contents should be less than 80 digits long after converting to extended encoding, but got ".concat(String.valueOf(length)));
    }

    public Collection f() {
        return Collections.singleton(BarcodeFormat.CODE_93);
    }
}
