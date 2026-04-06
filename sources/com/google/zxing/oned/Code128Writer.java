package com.google.zxing.oned;

import com.google.api.Endpoint;
import com.google.zxing.BarcodeFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public final class Code128Writer extends OneDimensionalCodeWriter {

    public enum CType {
        UNCODABLE,
        ONE_DIGIT,
        TWO_DIGITS,
        FNC_1
    }

    public static int h(CharSequence charSequence, int i2, int i3) {
        CType i4;
        CType i5;
        char charAt;
        CType i6 = i(charSequence, i2);
        CType cType = CType.ONE_DIGIT;
        if (i6 != cType) {
            CType cType2 = CType.UNCODABLE;
            if (i6 == cType2) {
                if (i2 >= charSequence.length() || ((charAt = charSequence.charAt(i2)) >= ' ' && (i3 != 101 || (charAt >= '`' && (charAt < 241 || charAt > 244))))) {
                    return 100;
                }
                return Endpoint.TARGET_FIELD_NUMBER;
            } else if (i3 == 101 && i6 == CType.FNC_1) {
                return Endpoint.TARGET_FIELD_NUMBER;
            } else {
                if (i3 == 99) {
                    return 99;
                }
                if (i3 == 100) {
                    CType cType3 = CType.FNC_1;
                    if (i6 == cType3 || (i4 = i(charSequence, i2 + 2)) == cType2 || i4 == cType) {
                        return 100;
                    }
                    if (i4 == cType3) {
                        return i(charSequence, i2 + 3) == CType.TWO_DIGITS ? 99 : 100;
                    }
                    int i7 = i2 + 4;
                    while (true) {
                        i5 = i(charSequence, i7);
                        if (i5 != CType.TWO_DIGITS) {
                            break;
                        }
                        i7 += 2;
                    }
                    return i5 == CType.ONE_DIGIT ? 100 : 99;
                }
                if (i6 == CType.FNC_1) {
                    i6 = i(charSequence, i2 + 1);
                }
                return i6 == CType.TWO_DIGITS ? 99 : 100;
            }
        } else if (i3 == 101) {
            return Endpoint.TARGET_FIELD_NUMBER;
        } else {
            return 100;
        }
    }

    public static CType i(CharSequence charSequence, int i2) {
        int length = charSequence.length();
        if (i2 >= length) {
            return CType.UNCODABLE;
        }
        char charAt = charSequence.charAt(i2);
        if (charAt == 241) {
            return CType.FNC_1;
        }
        if (charAt < '0' || charAt > '9') {
            return CType.UNCODABLE;
        }
        int i3 = i2 + 1;
        if (i3 >= length) {
            return CType.ONE_DIGIT;
        }
        char charAt2 = charSequence.charAt(i3);
        return (charAt2 < '0' || charAt2 > '9') ? CType.ONE_DIGIT : CType.TWO_DIGITS;
    }

    public boolean[] d(String str) {
        int length = str.length();
        if (length <= 0 || length > 80) {
            throw new IllegalArgumentException("Contents length should be between 1 and 80 characters, but got ".concat(String.valueOf(length)));
        }
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            char charAt = str.charAt(i3);
            switch (charAt) {
                case 241:
                case 242:
                case 243:
                case 244:
                    break;
                default:
                    if (charAt <= 127) {
                        break;
                    } else {
                        throw new IllegalArgumentException("Bad character in input: ".concat(String.valueOf(charAt)));
                    }
            }
        }
        ArrayList<int[]> arrayList = new ArrayList<>();
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 1;
        while (true) {
            int i8 = 103;
            if (i4 < length) {
                int h2 = h(str, i4, i6);
                int i9 = 100;
                if (h2 == i6) {
                    switch (str.charAt(i4)) {
                        case 241:
                            i9 = 102;
                            break;
                        case 242:
                            i9 = 97;
                            break;
                        case 243:
                            i9 = 96;
                            break;
                        case 244:
                            if (i6 == 101) {
                                i9 = 101;
                                break;
                            }
                            break;
                        default:
                            if (i6 != 100) {
                                if (i6 == 101) {
                                    char charAt2 = str.charAt(i4);
                                    i9 = charAt2 - ' ';
                                    if (i9 < 0) {
                                        i9 = charAt2 + '@';
                                        break;
                                    }
                                } else {
                                    i9 = Integer.parseInt(str.substring(i4, i4 + 2));
                                    i4++;
                                    break;
                                }
                            } else {
                                i9 = str.charAt(i4) - ' ';
                                break;
                            }
                            break;
                    }
                    i4++;
                } else {
                    if (i6 != 0) {
                        i8 = h2;
                    } else if (h2 == 100) {
                        i8 = 104;
                    } else if (h2 != 101) {
                        i8 = 105;
                    }
                    i9 = i8;
                    i6 = h2;
                }
                arrayList.add(Code128Reader.f32707a[i9]);
                i5 += i9 * i7;
                if (i4 != 0) {
                    i7++;
                }
            } else {
                int[][] iArr = Code128Reader.f32707a;
                arrayList.add(iArr[i5 % 103]);
                arrayList.add(iArr[106]);
                int i10 = 0;
                for (int[] iArr2 : arrayList) {
                    for (int i11 : (int[]) r13.next()) {
                        i10 += i11;
                    }
                }
                boolean[] zArr = new boolean[i10];
                for (int[] b2 : arrayList) {
                    i2 += OneDimensionalCodeWriter.b(zArr, i2, b2, true);
                }
                return zArr;
            }
        }
    }

    public Collection f() {
        return Collections.singleton(BarcodeFormat.CODE_128);
    }
}
