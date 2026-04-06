package com.google.zxing.datamatrix.encoder;

import com.google.zxing.Dimension;
import java.util.Arrays;

public final class HighLevelEncoder {
    public static int a(CharSequence charSequence, int i2) {
        int length = charSequence.length();
        int i3 = 0;
        if (i2 < length) {
            char charAt = charSequence.charAt(i2);
            while (f(charAt) && i2 < length) {
                i3++;
                i2++;
                if (i2 < length) {
                    charAt = charSequence.charAt(i2);
                }
            }
        }
        return i3;
    }

    public static String b(String str, SymbolShapeHint symbolShapeHint, Dimension dimension, Dimension dimension2) {
        int i2 = 0;
        Encoder[] encoderArr = {new ASCIIEncoder(), new C40Encoder(), new TextEncoder(), new X12Encoder(), new EdifactEncoder(), new Base256Encoder()};
        EncoderContext encoderContext = new EncoderContext(str);
        encoderContext.n(symbolShapeHint);
        encoderContext.l(dimension, dimension2);
        if (str.startsWith("[)>\u001e05\u001d") && str.endsWith("\u001e\u0004")) {
            encoderContext.r(236);
            encoderContext.m(2);
            encoderContext.f32669f += 7;
        } else if (str.startsWith("[)>\u001e06\u001d") && str.endsWith("\u001e\u0004")) {
            encoderContext.r(237);
            encoderContext.m(2);
            encoderContext.f32669f += 7;
        }
        while (encoderContext.i()) {
            encoderArr[i2].a(encoderContext);
            if (encoderContext.e() >= 0) {
                i2 = encoderContext.e();
                encoderContext.j();
            }
        }
        int a2 = encoderContext.a();
        encoderContext.p();
        int a3 = encoderContext.g().a();
        if (!(a2 >= a3 || i2 == 0 || i2 == 5 || i2 == 4)) {
            encoderContext.r(254);
        }
        StringBuilder b2 = encoderContext.b();
        if (b2.length() < a3) {
            b2.append(129);
        }
        while (b2.length() < a3) {
            b2.append(o(b2.length() + 1));
        }
        return encoderContext.b().toString();
    }

    public static int c(float[] fArr, int[] iArr, int i2, byte[] bArr) {
        Arrays.fill(bArr, (byte) 0);
        for (int i3 = 0; i3 < 6; i3++) {
            int ceil = (int) Math.ceil((double) fArr[i3]);
            iArr[i3] = ceil;
            if (i2 > ceil) {
                Arrays.fill(bArr, (byte) 0);
                i2 = ceil;
            }
            if (i2 == ceil) {
                bArr[i3] = (byte) (bArr[i3] + 1);
            }
        }
        return i2;
    }

    public static int d(byte[] bArr) {
        int i2 = 0;
        for (int i3 = 0; i3 < 6; i3++) {
            i2 += bArr[i3];
        }
        return i2;
    }

    public static void e(char c2) {
        String hexString = Integer.toHexString(c2);
        throw new IllegalArgumentException("Illegal character: " + c2 + " (0x" + ("0000".substring(0, 4 - hexString.length()) + hexString) + ')');
    }

    public static boolean f(char c2) {
        return c2 >= '0' && c2 <= '9';
    }

    public static boolean g(char c2) {
        return c2 >= 128 && c2 <= 255;
    }

    public static boolean h(char c2) {
        if (c2 == ' ') {
            return true;
        }
        if (c2 < '0' || c2 > '9') {
            return c2 >= 'A' && c2 <= 'Z';
        }
        return true;
    }

    public static boolean i(char c2) {
        return c2 >= ' ' && c2 <= '^';
    }

    public static boolean j(char c2) {
        if (c2 == ' ') {
            return true;
        }
        if (c2 < '0' || c2 > '9') {
            return c2 >= 'a' && c2 <= 'z';
        }
        return true;
    }

    public static boolean k(char c2) {
        if (m(c2) || c2 == ' ') {
            return true;
        }
        if (c2 < '0' || c2 > '9') {
            return c2 >= 'A' && c2 <= 'Z';
        }
        return true;
    }

    public static boolean l(char c2) {
        return false;
    }

    public static boolean m(char c2) {
        return c2 == 13 || c2 == '*' || c2 == '>';
    }

    public static int n(CharSequence charSequence, int i2, int i3) {
        float[] fArr;
        int i4;
        int i5;
        CharSequence charSequence2 = charSequence;
        int i6 = i2;
        if (i6 >= charSequence.length()) {
            return i3;
        }
        float f2 = 2.0f;
        int i7 = 6;
        int i8 = 4;
        int i9 = 3;
        if (i3 == 0) {
            fArr = new float[]{0.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.25f};
        } else {
            fArr = new float[]{1.0f, 2.0f, 2.0f, 2.0f, 2.0f, 2.25f};
            fArr[i3] = 0.0f;
        }
        int i10 = 0;
        while (true) {
            int i11 = i6 + i10;
            if (i11 == charSequence.length()) {
                byte[] bArr = new byte[i7];
                int[] iArr = new int[i7];
                int c2 = c(fArr, iArr, Integer.MAX_VALUE, bArr);
                int d2 = d(bArr);
                if (iArr[0] == c2) {
                    return 0;
                }
                if (d2 == 1 && bArr[5] > 0) {
                    return 5;
                }
                if (d2 == 1 && bArr[i8] > 0) {
                    return i8;
                }
                if (d2 == 1 && bArr[2] > 0) {
                    return 2;
                }
                if (d2 != 1 || bArr[i9] <= 0) {
                    return 1;
                }
                return i9;
            }
            char charAt = charSequence2.charAt(i11);
            i10++;
            if (f(charAt)) {
                fArr[0] = fArr[0] + 0.5f;
            } else if (g(charAt)) {
                float ceil = (float) Math.ceil((double) fArr[0]);
                fArr[0] = ceil;
                fArr[0] = ceil + f2;
            } else {
                float ceil2 = (float) Math.ceil((double) fArr[0]);
                fArr[0] = ceil2;
                fArr[0] = ceil2 + 1.0f;
            }
            if (h(charAt)) {
                fArr[1] = fArr[1] + 0.6666667f;
            } else if (g(charAt)) {
                fArr[1] = fArr[1] + 2.6666667f;
            } else {
                fArr[1] = fArr[1] + 1.3333334f;
            }
            if (j(charAt)) {
                fArr[2] = fArr[2] + 0.6666667f;
            } else if (g(charAt)) {
                fArr[2] = fArr[2] + 2.6666667f;
            } else {
                fArr[2] = fArr[2] + 1.3333334f;
            }
            if (k(charAt)) {
                fArr[3] = fArr[3] + 0.6666667f;
            } else if (g(charAt)) {
                fArr[3] = fArr[3] + 4.3333335f;
            } else {
                fArr[3] = fArr[3] + 3.3333333f;
            }
            if (i(charAt)) {
                fArr[4] = fArr[4] + 0.75f;
            } else if (g(charAt)) {
                fArr[4] = fArr[4] + 4.25f;
            } else {
                fArr[4] = fArr[4] + 3.25f;
            }
            if (l(charAt)) {
                fArr[5] = fArr[5] + 4.0f;
            } else {
                fArr[5] = fArr[5] + 1.0f;
            }
            if (i10 >= 4) {
                int[] iArr2 = new int[i7];
                byte[] bArr2 = new byte[i7];
                c(fArr, iArr2, Integer.MAX_VALUE, bArr2);
                int d3 = d(bArr2);
                int i12 = iArr2[0];
                int i13 = iArr2[5];
                if (i12 >= i13 || i12 >= iArr2[1] || i12 >= iArr2[2] || i12 >= iArr2[3] || i12 >= iArr2[4]) {
                    if (i13 < i12) {
                        break;
                    }
                    byte b2 = bArr2[1];
                    byte b3 = bArr2[2];
                    byte b4 = bArr2[3];
                    byte b5 = bArr2[4];
                    if (b2 + b3 + b4 + b5 == 0) {
                        break;
                    } else if (d3 == 1 && b5 > 0) {
                        return 4;
                    } else {
                        if (d3 == 1 && b3 > 0) {
                            return 2;
                        }
                        if (d3 == 1 && b4 > 0) {
                            return 3;
                        }
                        int i14 = iArr2[1];
                        if (i14 + 1 >= i12 || i14 + 1 >= i13) {
                            i5 = 3;
                            i4 = 4;
                            i8 = i4;
                            i7 = 6;
                            i9 = i5;
                            f2 = 2.0f;
                        } else {
                            i4 = 4;
                            if (i14 + 1 < iArr2[4] && i14 + 1 < iArr2[2]) {
                                int i15 = iArr2[3];
                                if (i14 < i15) {
                                    return 1;
                                }
                                if (i14 == i15) {
                                    int i16 = i6 + i10 + 1;
                                    while (i16 < charSequence.length()) {
                                        char charAt2 = charSequence2.charAt(i16);
                                        if (!m(charAt2)) {
                                            if (!k(charAt2)) {
                                                break;
                                            }
                                            i16++;
                                        } else {
                                            return 3;
                                        }
                                    }
                                    return 1;
                                }
                            }
                        }
                    }
                } else {
                    return 0;
                }
            } else {
                i4 = 4;
            }
            i5 = 3;
            i8 = i4;
            i7 = 6;
            i9 = i5;
            f2 = 2.0f;
        }
        return 5;
    }

    public static char o(int i2) {
        int i3 = (i2 * 149) % 253;
        int i4 = i3 + 130;
        if (i4 > 254) {
            i4 = i3 - 124;
        }
        return (char) i4;
    }
}
