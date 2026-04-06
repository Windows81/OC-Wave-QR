package com.google.common.primitives;

import java.util.Comparator;

@ElementTypesAreNonnullByDefault
public final class SignedBytes {

    public enum LexicographicalComparator implements Comparator<byte[]> {
        INSTANCE;

        /* renamed from: f */
        public int compare(byte[] bArr, byte[] bArr2) {
            int min = Math.min(bArr.length, bArr2.length);
            for (int i2 = 0; i2 < min; i2++) {
                int a2 = SignedBytes.a(bArr[i2], bArr2[i2]);
                if (a2 != 0) {
                    return a2;
                }
            }
            return bArr.length - bArr2.length;
        }

        public String toString() {
            return "SignedBytes.lexicographicalComparator()";
        }
    }

    public static int a(byte b2, byte b3) {
        return b2 - b3;
    }
}
