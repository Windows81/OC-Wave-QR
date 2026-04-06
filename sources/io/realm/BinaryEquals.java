package io.realm;

import java.util.Arrays;

class BinaryEquals<K> extends EqualsHelper<K, byte[]> {
    /* renamed from: c */
    public boolean a(byte[] bArr, byte[] bArr2) {
        return Arrays.equals(bArr, bArr2);
    }
}
