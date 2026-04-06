package com.google.zxing.qrcode.encoder;

import com.google.zxing.WriterException;
import com.google.zxing.common.BitArray;
import com.google.zxing.common.CharacterSetECI;
import com.google.zxing.common.reedsolomon.GenericGF;
import com.google.zxing.common.reedsolomon.ReedSolomonEncoder;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.google.zxing.qrcode.decoder.Mode;
import com.google.zxing.qrcode.decoder.Version;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

public final class Encoder {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f32858a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, 37, 38, -1, -1, -1, -1, 39, 40, -1, 41, 42, 43, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 44, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, -1, -1, -1, -1, -1};

    /* renamed from: com.google.zxing.qrcode.encoder.Encoder$1  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f32859a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.google.zxing.qrcode.decoder.Mode[] r0 = com.google.zxing.qrcode.decoder.Mode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f32859a = r0
                com.google.zxing.qrcode.decoder.Mode r1 = com.google.zxing.qrcode.decoder.Mode.NUMERIC     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f32859a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.zxing.qrcode.decoder.Mode r1 = com.google.zxing.qrcode.decoder.Mode.ALPHANUMERIC     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f32859a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.zxing.qrcode.decoder.Mode r1 = com.google.zxing.qrcode.decoder.Mode.BYTE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f32859a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.zxing.qrcode.decoder.Mode r1 = com.google.zxing.qrcode.decoder.Mode.KANJI     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.qrcode.encoder.Encoder.AnonymousClass1.<clinit>():void");
        }
    }

    public static void a(String str, BitArray bitArray, String str2) {
        try {
            for (byte e2 : str.getBytes(str2)) {
                bitArray.e(e2, 8);
            }
        } catch (UnsupportedEncodingException e3) {
            throw new WriterException((Throwable) e3);
        }
    }

    public static void b(CharSequence charSequence, BitArray bitArray) {
        int length = charSequence.length();
        int i2 = 0;
        while (i2 < length) {
            int p2 = p(charSequence.charAt(i2));
            if (p2 != -1) {
                int i3 = i2 + 1;
                if (i3 < length) {
                    int p3 = p(charSequence.charAt(i3));
                    if (p3 != -1) {
                        bitArray.e((p2 * 45) + p3, 11);
                        i2 += 2;
                    } else {
                        throw new WriterException();
                    }
                } else {
                    bitArray.e(p2, 6);
                    i2 = i3;
                }
            } else {
                throw new WriterException();
            }
        }
    }

    public static void c(String str, Mode mode, BitArray bitArray, String str2) {
        int i2 = AnonymousClass1.f32859a[mode.ordinal()];
        if (i2 == 1) {
            h(str, bitArray);
        } else if (i2 == 2) {
            b(str, bitArray);
        } else if (i2 == 3) {
            a(str, bitArray, str2);
        } else if (i2 == 4) {
            e(str, bitArray);
        } else {
            throw new WriterException("Invalid mode: ".concat(String.valueOf(mode)));
        }
    }

    public static void d(CharacterSetECI characterSetECI, BitArray bitArray) {
        bitArray.e(Mode.ECI.d(), 4);
        bitArray.e(characterSetECI.f(), 8);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x003c A[LOOP:0: B:6:0x000f->B:19:0x003c, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x004b A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void e(java.lang.String r6, com.google.zxing.common.BitArray r7) {
        /*
            java.lang.String r0 = "Shift_JIS"
            byte[] r6 = r6.getBytes(r0)     // Catch:{ UnsupportedEncodingException -> 0x005c }
            int r0 = r6.length
            int r0 = r0 % 2
            if (r0 != 0) goto L_0x0054
            int r0 = r6.length
            int r0 = r0 + -1
            r1 = 0
        L_0x000f:
            if (r1 >= r0) goto L_0x0053
            byte r2 = r6[r1]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r3 = r1 + 1
            byte r3 = r6[r3]
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r2 = r2 << 8
            r2 = r2 | r3
            r3 = 33088(0x8140, float:4.6366E-41)
            r4 = -1
            if (r2 < r3) goto L_0x002b
            r5 = 40956(0x9ffc, float:5.7392E-41)
            if (r2 > r5) goto L_0x002b
        L_0x0029:
            int r2 = r2 - r3
            goto L_0x003a
        L_0x002b:
            r3 = 57408(0xe040, float:8.0446E-41)
            if (r2 < r3) goto L_0x0039
            r3 = 60351(0xebbf, float:8.457E-41)
            if (r2 > r3) goto L_0x0039
            r3 = 49472(0xc140, float:6.9325E-41)
            goto L_0x0029
        L_0x0039:
            r2 = r4
        L_0x003a:
            if (r2 == r4) goto L_0x004b
            int r3 = r2 >> 8
            int r3 = r3 * 192
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r3 = r3 + r2
            r2 = 13
            r7.e(r3, r2)
            int r1 = r1 + 2
            goto L_0x000f
        L_0x004b:
            com.google.zxing.WriterException r6 = new com.google.zxing.WriterException
            java.lang.String r7 = "Invalid byte sequence"
            r6.<init>((java.lang.String) r7)
            throw r6
        L_0x0053:
            return
        L_0x0054:
            com.google.zxing.WriterException r6 = new com.google.zxing.WriterException
            java.lang.String r7 = "Kanji byte size not even"
            r6.<init>((java.lang.String) r7)
            throw r6
        L_0x005c:
            r6 = move-exception
            com.google.zxing.WriterException r7 = new com.google.zxing.WriterException
            r7.<init>((java.lang.Throwable) r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.qrcode.encoder.Encoder.e(java.lang.String, com.google.zxing.common.BitArray):void");
    }

    public static void f(int i2, Version version, Mode mode, BitArray bitArray) {
        int f2 = mode.f(version);
        int i3 = 1 << f2;
        if (i2 < i3) {
            bitArray.e(i2, f2);
            return;
        }
        throw new WriterException(i2 + " is bigger than " + (i3 - 1));
    }

    public static void g(Mode mode, BitArray bitArray) {
        bitArray.e(mode.d(), 4);
    }

    public static void h(CharSequence charSequence, BitArray bitArray) {
        int length = charSequence.length();
        int i2 = 0;
        while (i2 < length) {
            int charAt = charSequence.charAt(i2) - '0';
            int i3 = i2 + 2;
            if (i3 < length) {
                bitArray.e((charAt * 100) + ((charSequence.charAt(i2 + 1) - '0') * 10) + (charSequence.charAt(i3) - '0'), 10);
                i2 += 3;
            } else {
                i2++;
                if (i2 < length) {
                    bitArray.e((charAt * 10) + (charSequence.charAt(i2) - '0'), 7);
                    i2 = i3;
                } else {
                    bitArray.e(charAt, 4);
                }
            }
        }
    }

    public static int i(Mode mode, BitArray bitArray, BitArray bitArray2, Version version) {
        return bitArray.i() + mode.f(version) + bitArray2.i();
    }

    public static int j(ByteMatrix byteMatrix) {
        return MaskUtil.a(byteMatrix) + MaskUtil.c(byteMatrix) + MaskUtil.d(byteMatrix) + MaskUtil.e(byteMatrix);
    }

    public static int k(BitArray bitArray, ErrorCorrectionLevel errorCorrectionLevel, Version version, ByteMatrix byteMatrix) {
        int i2 = Integer.MAX_VALUE;
        int i3 = -1;
        for (int i4 = 0; i4 < 8; i4++) {
            MatrixUtil.a(bitArray, errorCorrectionLevel, version, i4, byteMatrix);
            int j2 = j(byteMatrix);
            if (j2 < i2) {
                i3 = i4;
                i2 = j2;
            }
        }
        return i3;
    }

    public static Mode l(String str, String str2) {
        if ("Shift_JIS".equals(str2) && s(str)) {
            return Mode.KANJI;
        }
        boolean z2 = false;
        boolean z3 = false;
        for (int i2 = 0; i2 < str.length(); i2++) {
            char charAt = str.charAt(i2);
            if (charAt >= '0' && charAt <= '9') {
                z3 = true;
            } else if (p(charAt) == -1) {
                return Mode.BYTE;
            } else {
                z2 = true;
            }
        }
        return z2 ? Mode.ALPHANUMERIC : z3 ? Mode.NUMERIC : Mode.BYTE;
    }

    public static Version m(int i2, ErrorCorrectionLevel errorCorrectionLevel) {
        for (int i3 = 1; i3 <= 40; i3++) {
            Version e2 = Version.e(i3);
            if (v(i2, e2, errorCorrectionLevel)) {
                return e2;
            }
        }
        throw new WriterException("Data too big");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00f4, code lost:
        if (com.google.zxing.qrcode.encoder.QRCode.b(r8) != false) goto L_0x00f8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00fa  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.zxing.qrcode.encoder.QRCode n(java.lang.String r6, com.google.zxing.qrcode.decoder.ErrorCorrectionLevel r7, java.util.Map r8) {
        /*
            if (r8 == 0) goto L_0x000c
            com.google.zxing.EncodeHintType r0 = com.google.zxing.EncodeHintType.CHARACTER_SET
            boolean r0 = r8.containsKey(r0)
            if (r0 == 0) goto L_0x000c
            r0 = 1
            goto L_0x000d
        L_0x000c:
            r0 = 0
        L_0x000d:
            if (r0 == 0) goto L_0x001a
            com.google.zxing.EncodeHintType r1 = com.google.zxing.EncodeHintType.CHARACTER_SET
            java.lang.Object r1 = r8.get(r1)
            java.lang.String r1 = r1.toString()
            goto L_0x001c
        L_0x001a:
            java.lang.String r1 = "ISO-8859-1"
        L_0x001c:
            com.google.zxing.qrcode.decoder.Mode r2 = l(r6, r1)
            com.google.zxing.common.BitArray r3 = new com.google.zxing.common.BitArray
            r3.<init>()
            com.google.zxing.qrcode.decoder.Mode r4 = com.google.zxing.qrcode.decoder.Mode.BYTE
            if (r2 != r4) goto L_0x0034
            if (r0 == 0) goto L_0x0034
            com.google.zxing.common.CharacterSetECI r0 = com.google.zxing.common.CharacterSetECI.d(r1)
            if (r0 == 0) goto L_0x0034
            d(r0, r3)
        L_0x0034:
            if (r8 == 0) goto L_0x0051
            com.google.zxing.EncodeHintType r0 = com.google.zxing.EncodeHintType.GS1_FORMAT
            boolean r5 = r8.containsKey(r0)
            if (r5 == 0) goto L_0x0051
            java.lang.Object r0 = r8.get(r0)
            java.lang.String r0 = r0.toString()
            boolean r0 = java.lang.Boolean.parseBoolean(r0)
            if (r0 == 0) goto L_0x0051
            com.google.zxing.qrcode.decoder.Mode r0 = com.google.zxing.qrcode.decoder.Mode.FNC1_FIRST_POSITION
            g(r0, r3)
        L_0x0051:
            g(r2, r3)
            com.google.zxing.common.BitArray r0 = new com.google.zxing.common.BitArray
            r0.<init>()
            c(r6, r2, r0, r1)
            if (r8 == 0) goto L_0x0089
            com.google.zxing.EncodeHintType r1 = com.google.zxing.EncodeHintType.QR_VERSION
            boolean r5 = r8.containsKey(r1)
            if (r5 == 0) goto L_0x0089
            java.lang.Object r1 = r8.get(r1)
            java.lang.String r1 = r1.toString()
            int r1 = java.lang.Integer.parseInt(r1)
            com.google.zxing.qrcode.decoder.Version r1 = com.google.zxing.qrcode.decoder.Version.e(r1)
            int r5 = i(r2, r3, r0, r1)
            boolean r5 = v(r5, r1, r7)
            if (r5 == 0) goto L_0x0081
            goto L_0x008d
        L_0x0081:
            com.google.zxing.WriterException r6 = new com.google.zxing.WriterException
            java.lang.String r7 = "Data too big for requested version"
            r6.<init>((java.lang.String) r7)
            throw r6
        L_0x0089:
            com.google.zxing.qrcode.decoder.Version r1 = t(r7, r2, r3, r0)
        L_0x008d:
            com.google.zxing.common.BitArray r5 = new com.google.zxing.common.BitArray
            r5.<init>()
            r5.c(r3)
            if (r2 != r4) goto L_0x009c
            int r6 = r0.j()
            goto L_0x00a0
        L_0x009c:
            int r6 = r6.length()
        L_0x00a0:
            f(r6, r1, r2, r5)
            r5.c(r0)
            com.google.zxing.qrcode.decoder.Version$ECBlocks r6 = r1.c(r7)
            int r0 = r1.d()
            int r3 = r6.d()
            int r0 = r0 - r3
            u(r0, r5)
            int r3 = r1.d()
            int r6 = r6.c()
            com.google.zxing.common.BitArray r6 = r(r5, r3, r0, r6)
            com.google.zxing.qrcode.encoder.QRCode r0 = new com.google.zxing.qrcode.encoder.QRCode
            r0.<init>()
            r0.c(r7)
            r0.f(r2)
            r0.g(r1)
            int r2 = r1.b()
            com.google.zxing.qrcode.encoder.ByteMatrix r3 = new com.google.zxing.qrcode.encoder.ByteMatrix
            r3.<init>(r2, r2)
            r2 = -1
            if (r8 == 0) goto L_0x00f7
            com.google.zxing.EncodeHintType r4 = com.google.zxing.EncodeHintType.QR_MASK_PATTERN
            boolean r5 = r8.containsKey(r4)
            if (r5 == 0) goto L_0x00f7
            java.lang.Object r8 = r8.get(r4)
            java.lang.String r8 = r8.toString()
            int r8 = java.lang.Integer.parseInt(r8)
            boolean r4 = com.google.zxing.qrcode.encoder.QRCode.b(r8)
            if (r4 == 0) goto L_0x00f7
            goto L_0x00f8
        L_0x00f7:
            r8 = r2
        L_0x00f8:
            if (r8 != r2) goto L_0x00fe
            int r8 = k(r6, r7, r1, r3)
        L_0x00fe:
            r0.d(r8)
            com.google.zxing.qrcode.encoder.MatrixUtil.a(r6, r7, r1, r8, r3)
            r0.e(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.qrcode.encoder.Encoder.n(java.lang.String, com.google.zxing.qrcode.decoder.ErrorCorrectionLevel, java.util.Map):com.google.zxing.qrcode.encoder.QRCode");
    }

    public static byte[] o(byte[] bArr, int i2) {
        int length = bArr.length;
        int[] iArr = new int[(length + i2)];
        for (int i3 = 0; i3 < length; i3++) {
            iArr[i3] = bArr[i3] & 255;
        }
        new ReedSolomonEncoder(GenericGF.f32623l).b(iArr, i2);
        byte[] bArr2 = new byte[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            bArr2[i4] = (byte) iArr[length + i4];
        }
        return bArr2;
    }

    public static int p(int i2) {
        int[] iArr = f32858a;
        if (i2 < iArr.length) {
            return iArr[i2];
        }
        return -1;
    }

    public static void q(int i2, int i3, int i4, int i5, int[] iArr, int[] iArr2) {
        if (i5 < i4) {
            int i6 = i2 % i4;
            int i7 = i4 - i6;
            int i8 = i2 / i4;
            int i9 = i8 + 1;
            int i10 = i3 / i4;
            int i11 = i10 + 1;
            int i12 = i8 - i10;
            int i13 = i9 - i11;
            if (i12 != i13) {
                throw new WriterException("EC bytes mismatch");
            } else if (i4 != i7 + i6) {
                throw new WriterException("RS blocks mismatch");
            } else if (i2 != ((i10 + i12) * i7) + ((i11 + i13) * i6)) {
                throw new WriterException("Total bytes mismatch");
            } else if (i5 < i7) {
                iArr[0] = i10;
                iArr2[0] = i12;
            } else {
                iArr[0] = i11;
                iArr2[0] = i13;
            }
        } else {
            throw new WriterException("Block ID too large");
        }
    }

    public static BitArray r(BitArray bitArray, int i2, int i3, int i4) {
        int i5 = i2;
        int i6 = i3;
        int i7 = i4;
        if (bitArray.j() == i6) {
            ArrayList<BlockPair> arrayList = new ArrayList<>(i7);
            int i8 = 0;
            int i9 = 0;
            int i10 = 0;
            for (int i11 = 0; i11 < i7; i11++) {
                int[] iArr = new int[1];
                int[] iArr2 = new int[1];
                q(i2, i3, i4, i11, iArr, iArr2);
                int i12 = iArr[0];
                byte[] bArr = new byte[i12];
                bitArray.l(i8 << 3, bArr, 0, i12);
                byte[] o2 = o(bArr, iArr2[0]);
                arrayList.add(new BlockPair(bArr, o2));
                i9 = Math.max(i9, i12);
                i10 = Math.max(i10, o2.length);
                i8 += iArr[0];
            }
            if (i6 == i8) {
                BitArray bitArray2 = new BitArray();
                for (int i13 = 0; i13 < i9; i13++) {
                    for (BlockPair a2 : arrayList) {
                        byte[] a3 = a2.a();
                        if (i13 < a3.length) {
                            bitArray2.e(a3[i13], 8);
                        }
                    }
                }
                for (int i14 = 0; i14 < i10; i14++) {
                    for (BlockPair b2 : arrayList) {
                        byte[] b3 = b2.b();
                        if (i14 < b3.length) {
                            bitArray2.e(b3[i14], 8);
                        }
                    }
                }
                if (i5 == bitArray2.j()) {
                    return bitArray2;
                }
                throw new WriterException("Interleaving error: " + i5 + " and " + bitArray2.j() + " differ.");
            }
            throw new WriterException("Data bytes does not match offset");
        }
        throw new WriterException("Number of bits and data bytes does not match");
    }

    public static boolean s(String str) {
        try {
            byte[] bytes = str.getBytes("Shift_JIS");
            int length = bytes.length;
            if (length % 2 != 0) {
                return false;
            }
            for (int i2 = 0; i2 < length; i2 += 2) {
                byte b2 = bytes[i2] & 255;
                if ((b2 < 129 || b2 > 159) && (b2 < 224 || b2 > 235)) {
                    return false;
                }
            }
            return true;
        } catch (UnsupportedEncodingException unused) {
            return false;
        }
    }

    public static Version t(ErrorCorrectionLevel errorCorrectionLevel, Mode mode, BitArray bitArray, BitArray bitArray2) {
        return m(i(mode, bitArray, bitArray2, m(i(mode, bitArray, bitArray2, Version.e(1)), errorCorrectionLevel)), errorCorrectionLevel);
    }

    public static void u(int i2, BitArray bitArray) {
        int i3 = i2 << 3;
        if (bitArray.i() <= i3) {
            for (int i4 = 0; i4 < 4 && bitArray.i() < i3; i4++) {
                bitArray.b(false);
            }
            int i5 = bitArray.i() & 7;
            if (i5 > 0) {
                while (i5 < 8) {
                    bitArray.b(false);
                    i5++;
                }
            }
            int j2 = i2 - bitArray.j();
            for (int i6 = 0; i6 < j2; i6++) {
                bitArray.e((i6 & 1) == 0 ? 236 : 17, 8);
            }
            if (bitArray.i() != i3) {
                throw new WriterException("Bits size does not equal capacity");
            }
            return;
        }
        throw new WriterException("data bits cannot fit in the QR Code" + bitArray.i() + " > " + i3);
    }

    public static boolean v(int i2, Version version, ErrorCorrectionLevel errorCorrectionLevel) {
        return version.d() - version.c(errorCorrectionLevel).d() >= (i2 + 7) / 8;
    }
}
