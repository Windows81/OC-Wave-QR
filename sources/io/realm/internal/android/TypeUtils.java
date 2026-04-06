package io.realm.internal.android;

public class TypeUtils {
    public static byte[] a(Byte[] bArr) {
        byte[] bArr2 = new byte[bArr.length];
        int i2 = 0;
        while (i2 < bArr.length) {
            Byte b2 = bArr[i2];
            if (b2 != null) {
                bArr2[i2] = b2.byteValue();
                i2++;
            } else {
                throw new IllegalArgumentException("Byte arrays cannot contain null values.");
            }
        }
        return bArr2;
    }
}
