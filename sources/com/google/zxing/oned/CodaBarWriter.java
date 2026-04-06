package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import java.util.Collection;
import java.util.Collections;

public final class CodaBarWriter extends OneDimensionalCodeWriter {

    /* renamed from: b  reason: collision with root package name */
    public static final char[] f32703b;

    /* renamed from: c  reason: collision with root package name */
    public static final char[] f32704c = {'T', 'N', '*', 'E'};

    /* renamed from: d  reason: collision with root package name */
    public static final char[] f32705d = {'/', ':', '+', '.'};

    /* renamed from: e  reason: collision with root package name */
    public static final char f32706e;

    static {
        char[] cArr = {'A', 'B', 'C', 'D'};
        f32703b = cArr;
        f32706e = cArr[0];
    }

    public boolean[] d(String str) {
        int i2;
        if (str.length() < 2) {
            StringBuilder sb = new StringBuilder();
            char c2 = f32706e;
            sb.append(c2);
            sb.append(str);
            sb.append(c2);
            str = sb.toString();
        } else {
            char upperCase = Character.toUpperCase(str.charAt(0));
            char upperCase2 = Character.toUpperCase(str.charAt(str.length() - 1));
            char[] cArr = f32703b;
            boolean a2 = CodaBarReader.a(cArr, upperCase);
            boolean a3 = CodaBarReader.a(cArr, upperCase2);
            char[] cArr2 = f32704c;
            boolean a4 = CodaBarReader.a(cArr2, upperCase);
            boolean a5 = CodaBarReader.a(cArr2, upperCase2);
            if (a2) {
                if (!a3) {
                    throw new IllegalArgumentException("Invalid start/end guards: ".concat(str));
                }
            } else if (a4) {
                if (!a5) {
                    throw new IllegalArgumentException("Invalid start/end guards: ".concat(str));
                }
            } else if (a3 || a5) {
                throw new IllegalArgumentException("Invalid start/end guards: ".concat(str));
            } else {
                StringBuilder sb2 = new StringBuilder();
                char c3 = f32706e;
                sb2.append(c3);
                sb2.append(str);
                sb2.append(c3);
                str = sb2.toString();
            }
        }
        int i3 = 20;
        for (int i4 = 1; i4 < str.length() - 1; i4++) {
            if (Character.isDigit(str.charAt(i4)) || str.charAt(i4) == '-' || str.charAt(i4) == '$') {
                i3 += 9;
            } else if (CodaBarReader.a(f32705d, str.charAt(i4))) {
                i3 += 10;
            } else {
                throw new IllegalArgumentException("Cannot encode : '" + str.charAt(i4) + '\'');
            }
        }
        boolean[] zArr = new boolean[(i3 + (str.length() - 1))];
        int i5 = 0;
        for (int i6 = 0; i6 < str.length(); i6++) {
            char upperCase3 = Character.toUpperCase(str.charAt(i6));
            if (i6 == 0 || i6 == str.length() - 1) {
                if (upperCase3 == '*') {
                    upperCase3 = 'C';
                } else if (upperCase3 == 'E') {
                    upperCase3 = 'D';
                } else if (upperCase3 == 'N') {
                    upperCase3 = 'B';
                } else if (upperCase3 == 'T') {
                    upperCase3 = 'A';
                }
            }
            int i7 = 0;
            while (true) {
                char[] cArr3 = CodaBarReader.f32700a;
                if (i7 >= cArr3.length) {
                    i2 = 0;
                    break;
                } else if (upperCase3 == cArr3[i7]) {
                    i2 = CodaBarReader.f32701b[i7];
                    break;
                } else {
                    i7++;
                }
            }
            int i8 = 0;
            int i9 = 0;
            boolean z2 = true;
            while (i8 < 7) {
                zArr[i5] = z2;
                i5++;
                if (((i2 >> (6 - i8)) & 1) == 0 || i9 == 1) {
                    z2 = !z2;
                    i8++;
                    i9 = 0;
                } else {
                    i9++;
                }
            }
            if (i6 < str.length() - 1) {
                zArr[i5] = false;
                i5++;
            }
        }
        return zArr;
    }

    public Collection f() {
        return Collections.singleton(BarcodeFormat.CODABAR);
    }
}
