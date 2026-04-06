package kotlin.uuid;

import kotlin.Metadata;
import kotlin.text.HexExtensionsKt;

@Metadata
class UuidKt__UuidKt extends UuidKt__UuidJVMKt {
    public static final void c(String str, int i2) {
        if (str.charAt(i2) != '-') {
            throw new IllegalArgumentException(("Expected '-' (hyphen) at index " + i2 + ", but was '" + str.charAt(i2) + '\'').toString());
        }
    }

    public static final void d(long j2, byte[] bArr, int i2, int i3) {
        int i4 = i2 + (i3 * 2);
        for (int i5 = 0; i5 < i3; i5++) {
            int i6 = HexExtensionsKt.d()[(int) (255 & j2)];
            bArr[i4 - 1] = (byte) i6;
            i4 -= 2;
            bArr[i4] = (byte) (i6 >> 8);
            j2 >>= 8;
        }
    }
}
