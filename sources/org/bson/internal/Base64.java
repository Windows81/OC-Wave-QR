package org.bson.internal;

public final class Base64 {

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f43883a = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f43884b = new int[128];

    static {
        int i2 = 0;
        while (true) {
            byte[] bArr = f43883a;
            if (i2 < bArr.length) {
                f43884b[bArr[i2]] = i2;
                i2++;
            } else {
                return;
            }
        }
    }

    public static String a(byte[] bArr) {
        return new String(bArr, 0, 0, bArr.length);
    }

    public static byte[] b(String str) {
        int length = ((str.length() * 3) / 4) - (str.endsWith("==") ? 2 : str.endsWith("=") ? 1 : 0);
        byte[] bArr = new byte[length];
        int i2 = 0;
        for (int i3 = 0; i3 < str.length(); i3 += 4) {
            int[] iArr = f43884b;
            int i4 = iArr[str.charAt(i3)];
            int i5 = iArr[str.charAt(i3 + 1)];
            int i6 = i2 + 1;
            bArr[i2] = (byte) (((i4 << 2) | (i5 >> 4)) & 255);
            if (i6 >= length) {
                return bArr;
            }
            int i7 = iArr[str.charAt(i3 + 2)];
            int i8 = i2 + 2;
            bArr[i6] = (byte) (((i5 << 4) | (i7 >> 2)) & 255);
            if (i8 >= length) {
                return bArr;
            }
            i2 += 3;
            bArr[i8] = (byte) ((iArr[str.charAt(i3 + 3)] | (i7 << 6)) & 255);
        }
        return bArr;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v9, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String c(byte[] r11) {
        /*
            int r0 = r11.length
            int r0 = r0 / 3
            r1 = 4
            int r0 = r0 * r1
            int r2 = r11.length
            int r2 = r2 % 3
            r3 = 0
            if (r2 != 0) goto L_0x000d
            r2 = r3
            goto L_0x000e
        L_0x000d:
            r2 = r1
        L_0x000e:
            int r0 = r0 + r2
            byte[] r0 = new byte[r0]
            int r2 = r11.length
            r4 = r3
            r5 = r4
            r6 = r5
        L_0x0015:
            if (r3 >= r2) goto L_0x0051
            byte r7 = r11[r3]
            int r4 = r4 + 1
            int r4 = r4 % 3
            if (r7 >= 0) goto L_0x0021
            int r7 = r7 + 256
        L_0x0021:
            int r6 = r6 << 8
            int r6 = r6 + r7
            if (r4 != 0) goto L_0x004e
            int r7 = r5 + 1
            byte[] r8 = f43883a
            int r9 = r6 >> 18
            r9 = r9 & 63
            byte r9 = r8[r9]
            r0[r5] = r9
            int r9 = r5 + 2
            int r10 = r6 >> 12
            r10 = r10 & 63
            byte r10 = r8[r10]
            r0[r7] = r10
            int r7 = r5 + 3
            int r10 = r6 >> 6
            r10 = r10 & 63
            byte r10 = r8[r10]
            r0[r9] = r10
            int r5 = r5 + 4
            r9 = r6 & 63
            byte r8 = r8[r9]
            r0[r7] = r8
        L_0x004e:
            int r3 = r3 + 1
            goto L_0x0015
        L_0x0051:
            r11 = 61
            r2 = 1
            if (r4 == r2) goto L_0x007d
            r1 = 2
            if (r4 == r1) goto L_0x005a
            goto L_0x0099
        L_0x005a:
            int r2 = r5 + 1
            byte[] r3 = f43883a
            int r4 = r6 >> 10
            r4 = r4 & 63
            byte r4 = r3[r4]
            r0[r5] = r4
            int r4 = r5 + 2
            int r7 = r6 >> 4
            r7 = r7 & 63
            byte r7 = r3[r7]
            r0[r2] = r7
            int r5 = r5 + 3
            int r1 = r6 << 2
            r1 = r1 & 63
            byte r1 = r3[r1]
            r0[r4] = r1
            r0[r5] = r11
            goto L_0x0099
        L_0x007d:
            int r2 = r5 + 1
            byte[] r3 = f43883a
            int r4 = r6 >> 2
            r4 = r4 & 63
            byte r4 = r3[r4]
            r0[r5] = r4
            int r4 = r5 + 2
            int r1 = r6 << 4
            r1 = r1 & 63
            byte r1 = r3[r1]
            r0[r2] = r1
            int r5 = r5 + 3
            r0[r4] = r11
            r0[r5] = r11
        L_0x0099:
            java.lang.String r11 = a(r0)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bson.internal.Base64.c(byte[]):java.lang.String");
    }
}
