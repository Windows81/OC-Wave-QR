package com.google.zxing.pdf417.encoder;

import com.google.zxing.WriterException;
import com.google.zxing.common.CharacterSetECI;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

final class PDF417HighLevelEncoder {

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f32820a = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 38, 13, 9, 44, 58, 35, 45, 46, 36, 47, 43, 37, 42, 61, 94, 0, 32, 0, 0, 0};

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f32821b = {59, 60, 62, 64, 91, 92, 93, 95, 96, 126, 33, 13, 9, 44, 58, 10, 45, 46, 36, 47, 34, 124, 42, 40, 41, 63, 123, 125, 39, 0};

    /* renamed from: c  reason: collision with root package name */
    public static final byte[] f32822c;

    /* renamed from: d  reason: collision with root package name */
    public static final byte[] f32823d = new byte[128];

    /* renamed from: e  reason: collision with root package name */
    public static final Charset f32824e = StandardCharsets.ISO_8859_1;

    /* renamed from: com.google.zxing.pdf417.encoder.PDF417HighLevelEncoder$1  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f32825a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.google.zxing.pdf417.encoder.Compaction[] r0 = com.google.zxing.pdf417.encoder.Compaction.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f32825a = r0
                com.google.zxing.pdf417.encoder.Compaction r1 = com.google.zxing.pdf417.encoder.Compaction.TEXT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f32825a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.zxing.pdf417.encoder.Compaction r1 = com.google.zxing.pdf417.encoder.Compaction.BYTE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f32825a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.zxing.pdf417.encoder.Compaction r1 = com.google.zxing.pdf417.encoder.Compaction.NUMERIC     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.pdf417.encoder.PDF417HighLevelEncoder.AnonymousClass1.<clinit>():void");
        }
    }

    static {
        int i2 = 0;
        byte[] bArr = new byte[128];
        f32822c = bArr;
        Arrays.fill(bArr, (byte) -1);
        int i3 = 0;
        while (true) {
            byte[] bArr2 = f32820a;
            if (i3 >= bArr2.length) {
                break;
            }
            byte b2 = bArr2[i3];
            if (b2 > 0) {
                f32822c[b2] = (byte) i3;
            }
            i3++;
        }
        Arrays.fill(f32823d, (byte) -1);
        while (true) {
            byte[] bArr3 = f32821b;
            if (i2 < bArr3.length) {
                byte b3 = bArr3[i2];
                if (b3 > 0) {
                    f32823d[b3] = (byte) i2;
                }
                i2++;
            } else {
                return;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001a, code lost:
        r3 = r3 + 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int a(java.lang.String r5, int r6, java.nio.charset.Charset r7) {
        /*
            java.nio.charset.CharsetEncoder r7 = r7.newEncoder()
            int r0 = r5.length()
            r1 = r6
        L_0x0009:
            if (r1 >= r0) goto L_0x0057
            char r2 = r5.charAt(r1)
            r3 = 0
        L_0x0010:
            r4 = 13
            if (r3 >= r4) goto L_0x0025
            boolean r2 = k(r2)
            if (r2 == 0) goto L_0x0025
            int r3 = r3 + 1
            int r2 = r1 + r3
            if (r2 >= r0) goto L_0x0025
            char r2 = r5.charAt(r2)
            goto L_0x0010
        L_0x0025:
            if (r3 < r4) goto L_0x0029
            int r1 = r1 - r6
            return r1
        L_0x0029:
            char r2 = r5.charAt(r1)
            boolean r3 = r7.canEncode(r2)
            if (r3 == 0) goto L_0x0036
            int r1 = r1 + 1
            goto L_0x0009
        L_0x0036:
            com.google.zxing.WriterException r5 = new com.google.zxing.WriterException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Non-encodable character detected: "
            r6.<init>(r7)
            r6.append(r2)
            java.lang.String r7 = " (Unicode: "
            r6.append(r7)
            r6.append(r2)
            r7 = 41
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            r5.<init>((java.lang.String) r6)
            throw r5
        L_0x0057:
            int r1 = r1 - r6
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.pdf417.encoder.PDF417HighLevelEncoder.a(java.lang.String, int, java.nio.charset.Charset):int");
    }

    public static int b(CharSequence charSequence, int i2) {
        int length = charSequence.length();
        int i3 = 0;
        if (i2 < length) {
            char charAt = charSequence.charAt(i2);
            while (k(charAt) && i2 < length) {
                i3++;
                i2++;
                if (i2 < length) {
                    charAt = charSequence.charAt(i2);
                }
            }
        }
        return i3;
    }

    public static int c(CharSequence charSequence, int i2) {
        int length = charSequence.length();
        int i3 = i2;
        while (i3 < length) {
            char charAt = charSequence.charAt(i3);
            int i4 = 0;
            while (i4 < 13 && k(charAt) && i3 < length) {
                i4++;
                i3++;
                if (i3 < length) {
                    charAt = charSequence.charAt(i3);
                }
            }
            if (i4 < 13) {
                if (i4 <= 0) {
                    if (!n(charSequence.charAt(i3))) {
                        break;
                    }
                    i3++;
                }
            } else {
                return (i3 - i2) - i4;
            }
        }
        return i3 - i2;
    }

    public static void d(byte[] bArr, int i2, int i3, int i4, StringBuilder sb) {
        int i5;
        if (i3 == 1 && i4 == 0) {
            sb.append(913);
        } else if (i3 % 6 == 0) {
            sb.append(924);
        } else {
            sb.append(901);
        }
        if (i3 >= 6) {
            char[] cArr = new char[5];
            i5 = i2;
            while ((i2 + i3) - i5 >= 6) {
                long j2 = 0;
                for (int i6 = 0; i6 < 6; i6++) {
                    j2 = (j2 << 8) + ((long) (bArr[i5 + i6] & 255));
                }
                for (int i7 = 0; i7 < 5; i7++) {
                    cArr[i7] = (char) ((int) (j2 % 900));
                    j2 /= 900;
                }
                for (int i8 = 4; i8 >= 0; i8--) {
                    sb.append(cArr[i8]);
                }
                i5 += 6;
            }
        } else {
            i5 = i2;
        }
        while (i5 < i2 + i3) {
            sb.append((char) (bArr[i5] & 255));
            i5++;
        }
    }

    public static String e(String str, Compaction compaction, Charset charset) {
        CharacterSetECI d2;
        StringBuilder sb = new StringBuilder(str.length());
        if (charset == null) {
            charset = f32824e;
        } else if (!f32824e.equals(charset) && (d2 = CharacterSetECI.d(charset.name())) != null) {
            h(d2.f(), sb);
        }
        int length = str.length();
        int i2 = AnonymousClass1.f32825a[compaction.ordinal()];
        if (i2 == 1) {
            g(str, 0, length, sb, 0);
        } else if (i2 == 2) {
            byte[] bytes = str.getBytes(charset);
            d(bytes, 0, bytes.length, 1, sb);
        } else if (i2 != 3) {
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            while (i3 < length) {
                int b2 = b(str, i3);
                if (b2 >= 13) {
                    sb.append(902);
                    f(str, i3, b2, sb);
                    i3 += b2;
                    i4 = 0;
                    i5 = 2;
                } else {
                    int c2 = c(str, i3);
                    if (c2 >= 5 || b2 == length) {
                        if (i5 != 0) {
                            sb.append(900);
                            i4 = 0;
                            i5 = 0;
                        }
                        i4 = g(str, i3, c2, sb, i4);
                        i3 += c2;
                    } else {
                        int a2 = a(str, i3, charset);
                        if (a2 == 0) {
                            a2 = 1;
                        }
                        int i6 = a2 + i3;
                        byte[] bytes2 = str.substring(i3, i6).getBytes(charset);
                        if (bytes2.length == 1 && i5 == 0) {
                            d(bytes2, 0, 1, 0, sb);
                        } else {
                            d(bytes2, 0, bytes2.length, i5, sb);
                            i5 = 1;
                            i4 = 0;
                        }
                        i3 = i6;
                    }
                }
            }
        } else {
            sb.append(902);
            f(str, 0, length, sb);
        }
        return sb.toString();
    }

    public static void f(String str, int i2, int i3, StringBuilder sb) {
        StringBuilder sb2 = new StringBuilder((i3 / 3) + 1);
        BigInteger valueOf = BigInteger.valueOf(900);
        BigInteger valueOf2 = BigInteger.valueOf(0);
        int i4 = 0;
        while (i4 < i3) {
            sb2.setLength(0);
            int min = Math.min(44, i3 - i4);
            StringBuilder sb3 = new StringBuilder("1");
            int i5 = i2 + i4;
            sb3.append(str.substring(i5, i5 + min));
            BigInteger bigInteger = new BigInteger(sb3.toString());
            do {
                sb2.append((char) bigInteger.mod(valueOf).intValue());
                bigInteger = bigInteger.divide(valueOf);
            } while (!bigInteger.equals(valueOf2));
            for (int length = sb2.length() - 1; length >= 0; length--) {
                sb.append(sb2.charAt(length));
            }
            i4 += min;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:65:0x00f4 A[EDGE_INSN: B:65:0x00f4->B:53:0x00f4 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x000f A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int g(java.lang.CharSequence r16, int r17, int r18, java.lang.StringBuilder r19, int r20) {
        /*
            r0 = r16
            r1 = r18
            r2 = r19
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r1)
            r4 = 0
            r5 = r20
            r6 = r4
        L_0x000f:
            int r7 = r17 + r6
            char r8 = r0.charAt(r7)
            r9 = 26
            r10 = 32
            r11 = 27
            r12 = 28
            r13 = 29
            r14 = 2
            r15 = 1
            if (r5 == 0) goto L_0x00be
            if (r5 == r15) goto L_0x0083
            if (r5 == r14) goto L_0x003c
            boolean r7 = m(r8)
            if (r7 == 0) goto L_0x0037
            byte[] r7 = f32823d
            byte r7 = r7[r8]
            char r7 = (char) r7
            r3.append(r7)
            goto L_0x00f0
        L_0x0037:
            r3.append(r13)
        L_0x003a:
            r5 = r4
            goto L_0x000f
        L_0x003c:
            boolean r9 = l(r8)
            if (r9 == 0) goto L_0x004c
            byte[] r7 = f32822c
            byte r7 = r7[r8]
            char r7 = (char) r7
            r3.append(r7)
            goto L_0x00f0
        L_0x004c:
            boolean r9 = j(r8)
            if (r9 == 0) goto L_0x0056
            r3.append(r12)
            goto L_0x003a
        L_0x0056:
            boolean r9 = i(r8)
            if (r9 == 0) goto L_0x0061
            r3.append(r11)
        L_0x005f:
            r5 = r15
            goto L_0x000f
        L_0x0061:
            int r7 = r7 + 1
            if (r7 >= r1) goto L_0x0076
            char r7 = r0.charAt(r7)
            boolean r7 = m(r7)
            if (r7 == 0) goto L_0x0076
            r5 = 25
            r3.append(r5)
            r5 = 3
            goto L_0x000f
        L_0x0076:
            r3.append(r13)
            byte[] r7 = f32823d
            byte r7 = r7[r8]
            char r7 = (char) r7
            r3.append(r7)
            goto L_0x00f0
        L_0x0083:
            boolean r7 = i(r8)
            if (r7 == 0) goto L_0x0096
            if (r8 != r10) goto L_0x008f
            r3.append(r9)
            goto L_0x00f0
        L_0x008f:
            int r8 = r8 + -97
            char r7 = (char) r8
            r3.append(r7)
            goto L_0x00f0
        L_0x0096:
            boolean r7 = j(r8)
            if (r7 == 0) goto L_0x00a6
            r3.append(r11)
            int r8 = r8 + -65
            char r7 = (char) r8
            r3.append(r7)
            goto L_0x00f0
        L_0x00a6:
            boolean r7 = l(r8)
            if (r7 == 0) goto L_0x00b2
            r3.append(r12)
        L_0x00af:
            r5 = r14
            goto L_0x000f
        L_0x00b2:
            r3.append(r13)
            byte[] r7 = f32823d
            byte r7 = r7[r8]
            char r7 = (char) r7
            r3.append(r7)
            goto L_0x00f0
        L_0x00be:
            boolean r7 = j(r8)
            if (r7 == 0) goto L_0x00d1
            if (r8 != r10) goto L_0x00ca
            r3.append(r9)
            goto L_0x00f0
        L_0x00ca:
            int r8 = r8 + -65
            char r7 = (char) r8
            r3.append(r7)
            goto L_0x00f0
        L_0x00d1:
            boolean r7 = i(r8)
            if (r7 == 0) goto L_0x00db
            r3.append(r11)
            goto L_0x005f
        L_0x00db:
            boolean r7 = l(r8)
            if (r7 == 0) goto L_0x00e5
            r3.append(r12)
            goto L_0x00af
        L_0x00e5:
            r3.append(r13)
            byte[] r7 = f32823d
            byte r7 = r7[r8]
            char r7 = (char) r7
            r3.append(r7)
        L_0x00f0:
            int r6 = r6 + 1
            if (r6 < r1) goto L_0x000f
            int r0 = r3.length()
            r1 = r4
        L_0x00f9:
            if (r4 >= r0) goto L_0x0112
            int r6 = r4 % 2
            if (r6 == 0) goto L_0x010b
            int r1 = r1 * 30
            char r6 = r3.charAt(r4)
            int r1 = r1 + r6
            char r1 = (char) r1
            r2.append(r1)
            goto L_0x010f
        L_0x010b:
            char r1 = r3.charAt(r4)
        L_0x010f:
            int r4 = r4 + 1
            goto L_0x00f9
        L_0x0112:
            int r0 = r0 % r14
            if (r0 == 0) goto L_0x011c
            int r1 = r1 * 30
            int r1 = r1 + r13
            char r0 = (char) r1
            r2.append(r0)
        L_0x011c:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.pdf417.encoder.PDF417HighLevelEncoder.g(java.lang.CharSequence, int, int, java.lang.StringBuilder, int):int");
    }

    public static void h(int i2, StringBuilder sb) {
        if (i2 >= 0 && i2 < 900) {
            sb.append(927);
            sb.append((char) i2);
        } else if (i2 < 810900) {
            sb.append(926);
            sb.append((char) ((i2 / 900) - 1));
            sb.append((char) (i2 % 900));
        } else if (i2 < 811800) {
            sb.append(925);
            sb.append((char) (810900 - i2));
        } else {
            throw new WriterException("ECI number not in valid range from 0..811799, but was ".concat(String.valueOf(i2)));
        }
    }

    public static boolean i(char c2) {
        if (c2 != ' ') {
            return c2 >= 'a' && c2 <= 'z';
        }
        return true;
    }

    public static boolean j(char c2) {
        if (c2 != ' ') {
            return c2 >= 'A' && c2 <= 'Z';
        }
        return true;
    }

    public static boolean k(char c2) {
        return c2 >= '0' && c2 <= '9';
    }

    public static boolean l(char c2) {
        return f32822c[c2] != -1;
    }

    public static boolean m(char c2) {
        return f32823d[c2] != -1;
    }

    public static boolean n(char c2) {
        if (c2 == 9 || c2 == 10 || c2 == 13) {
            return true;
        }
        return c2 >= ' ' && c2 <= '~';
    }
}
