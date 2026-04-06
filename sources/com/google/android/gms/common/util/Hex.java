package com.google.android.gms.common.util;

public class Hex {

    /* renamed from: a  reason: collision with root package name */
    public static final char[] f25117a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: b  reason: collision with root package name */
    public static final char[] f25118b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static String a(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[(length + length)];
        int i2 = 0;
        for (byte b2 : bArr) {
            char[] cArr2 = f25118b;
            cArr[i2] = cArr2[(b2 & 255) >>> 4];
            cArr[i2 + 1] = cArr2[b2 & 15];
            i2 += 2;
        }
        return new String(cArr);
    }

    public static String b(byte[] bArr, boolean z2) {
        int length = bArr.length;
        StringBuilder sb = new StringBuilder(length + length);
        int i2 = 0;
        while (i2 < length && (!z2 || i2 != length - 1 || (bArr[i2] & 255) != 0)) {
            char[] cArr = f25117a;
            sb.append(cArr[(bArr[i2] & 240) >>> 4]);
            sb.append(cArr[bArr[i2] & 15]);
            i2++;
        }
        return sb.toString();
    }
}
