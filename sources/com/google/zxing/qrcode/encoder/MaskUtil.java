package com.google.zxing.qrcode.encoder;

final class MaskUtil {
    public static int a(ByteMatrix byteMatrix) {
        return b(byteMatrix, true) + b(byteMatrix, false);
    }

    public static int b(ByteMatrix byteMatrix, boolean z2) {
        int d2 = z2 ? byteMatrix.d() : byteMatrix.e();
        int e2 = z2 ? byteMatrix.e() : byteMatrix.d();
        byte[][] c2 = byteMatrix.c();
        int i2 = 0;
        for (int i3 = 0; i3 < d2; i3++) {
            byte b2 = -1;
            int i4 = 0;
            for (int i5 = 0; i5 < e2; i5++) {
                byte b3 = z2 ? c2[i3][i5] : c2[i5][i3];
                if (b3 == b2) {
                    i4++;
                } else {
                    if (i4 >= 5) {
                        i2 += i4 - 2;
                    }
                    i4 = 1;
                    b2 = b3;
                }
            }
            if (i4 >= 5) {
                i2 += i4 - 2;
            }
        }
        return i2;
    }

    public static int c(ByteMatrix byteMatrix) {
        byte[][] c2 = byteMatrix.c();
        int e2 = byteMatrix.e();
        int d2 = byteMatrix.d();
        int i2 = 0;
        for (int i3 = 0; i3 < d2 - 1; i3++) {
            byte[] bArr = c2[i3];
            int i4 = 0;
            while (i4 < e2 - 1) {
                byte b2 = bArr[i4];
                int i5 = i4 + 1;
                if (b2 == bArr[i5]) {
                    byte[] bArr2 = c2[i3 + 1];
                    if (b2 == bArr2[i4] && b2 == bArr2[i5]) {
                        i2++;
                    }
                }
                i4 = i5;
            }
        }
        return i2 * 3;
    }

    public static int d(ByteMatrix byteMatrix) {
        byte[][] c2 = byteMatrix.c();
        int e2 = byteMatrix.e();
        int d2 = byteMatrix.d();
        int i2 = 0;
        for (int i3 = 0; i3 < d2; i3++) {
            for (int i4 = 0; i4 < e2; i4++) {
                byte[] bArr = c2[i3];
                int i5 = i4 + 6;
                if (i5 < e2 && bArr[i4] == 1 && bArr[i4 + 1] == 0 && bArr[i4 + 2] == 1 && bArr[i4 + 3] == 1 && bArr[i4 + 4] == 1 && bArr[i4 + 5] == 0 && bArr[i5] == 1 && (g(bArr, i4 - 4, i4) || g(bArr, i4 + 7, i4 + 11))) {
                    i2++;
                }
                int i6 = i3 + 6;
                if (i6 < d2 && c2[i3][i4] == 1 && c2[i3 + 1][i4] == 0 && c2[i3 + 2][i4] == 1 && c2[i3 + 3][i4] == 1 && c2[i3 + 4][i4] == 1 && c2[i3 + 5][i4] == 0 && c2[i6][i4] == 1 && (h(c2, i4, i3 - 4, i3) || h(c2, i4, i3 + 7, i3 + 11))) {
                    i2++;
                }
            }
        }
        return i2 * 40;
    }

    public static int e(ByteMatrix byteMatrix) {
        byte[][] c2 = byteMatrix.c();
        int e2 = byteMatrix.e();
        int d2 = byteMatrix.d();
        int i2 = 0;
        for (int i3 = 0; i3 < d2; i3++) {
            byte[] bArr = c2[i3];
            for (int i4 = 0; i4 < e2; i4++) {
                if (bArr[i4] == 1) {
                    i2++;
                }
            }
        }
        int d3 = byteMatrix.d() * byteMatrix.e();
        return ((Math.abs((i2 << 1) - d3) * 10) / d3) * 10;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0031, code lost:
        r1 = r3 & 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003a, code lost:
        if (r1 != 0) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003c, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003d, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001c, code lost:
        r1 = r1 & 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0030, code lost:
        r3 = r3 + r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean f(int r1, int r2, int r3) {
        /*
            r0 = 1
            switch(r1) {
                case 0: goto L_0x0030;
                case 1: goto L_0x0031;
                case 2: goto L_0x0038;
                case 3: goto L_0x0034;
                case 4: goto L_0x002c;
                case 5: goto L_0x0025;
                case 6: goto L_0x001e;
                case 7: goto L_0x0014;
                default: goto L_0x0004;
            }
        L_0x0004:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Invalid mask pattern: "
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r1 = r3.concat(r1)
            r2.<init>(r1)
            throw r2
        L_0x0014:
            int r1 = r3 * r2
            int r1 = r1 % 3
            int r3 = r3 + r2
            r2 = r3 & 1
            int r1 = r1 + r2
        L_0x001c:
            r1 = r1 & r0
            goto L_0x003a
        L_0x001e:
            int r3 = r3 * r2
            r1 = r3 & 1
            int r3 = r3 % 3
            int r1 = r1 + r3
            goto L_0x001c
        L_0x0025:
            int r3 = r3 * r2
            r1 = r3 & 1
            int r3 = r3 % 3
            int r1 = r1 + r3
            goto L_0x003a
        L_0x002c:
            int r3 = r3 / 2
            int r2 = r2 / 3
        L_0x0030:
            int r3 = r3 + r2
        L_0x0031:
            r1 = r3 & 1
            goto L_0x003a
        L_0x0034:
            int r3 = r3 + r2
            int r1 = r3 % 3
            goto L_0x003a
        L_0x0038:
            int r1 = r2 % 3
        L_0x003a:
            if (r1 != 0) goto L_0x003d
            return r0
        L_0x003d:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.qrcode.encoder.MaskUtil.f(int, int, int):boolean");
    }

    public static boolean g(byte[] bArr, int i2, int i3) {
        int min = Math.min(i3, bArr.length);
        for (int max = Math.max(i2, 0); max < min; max++) {
            if (bArr[max] == 1) {
                return false;
            }
        }
        return true;
    }

    public static boolean h(byte[][] bArr, int i2, int i3, int i4) {
        int min = Math.min(i4, bArr.length);
        for (int max = Math.max(i3, 0); max < min; max++) {
            if (bArr[max][i2] == 1) {
                return false;
            }
        }
        return true;
    }
}
