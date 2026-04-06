package okio;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;

@Metadata
/* renamed from: okio.-Base64  reason: invalid class name */
public final class Base64 {

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f43317a;

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f43318b;

    static {
        ByteString.Companion companion = ByteString.C;
        f43317a = companion.d("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/").l();
        f43318b = companion.d("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_").l();
    }

    public static final byte[] a(String str) {
        int i2;
        Intrinsics.i(str, "<this>");
        int length = str.length();
        while (length > 0 && ((r5 = str.charAt(length - 1)) == '=' || r5 == 10 || r5 == 13 || r5 == ' ' || r5 == 9)) {
            length--;
        }
        int i3 = (int) ((((long) length) * 6) / 8);
        byte[] bArr = new byte[i3];
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < length; i7++) {
            char charAt = str.charAt(i7);
            if ('A' <= charAt && charAt < '[') {
                i2 = charAt - 'A';
            } else if ('a' <= charAt && charAt < '{') {
                i2 = charAt - 'G';
            } else if ('0' <= charAt && charAt < ':') {
                i2 = charAt + 4;
            } else if (charAt == '+' || charAt == '-') {
                i2 = 62;
            } else if (charAt == '/' || charAt == '_') {
                i2 = 63;
            } else {
                if (!(charAt == 10 || charAt == 13 || charAt == ' ' || charAt == 9)) {
                    return null;
                }
            }
            i5 = (i5 << 6) | i2;
            i4++;
            if (i4 % 4 == 0) {
                bArr[i6] = (byte) (i5 >> 16);
                int i8 = i6 + 2;
                bArr[i6 + 1] = (byte) (i5 >> 8);
                i6 += 3;
                bArr[i8] = (byte) i5;
            }
        }
        int i9 = i4 % 4;
        if (i9 == 1) {
            return null;
        }
        if (i9 == 2) {
            bArr[i6] = (byte) ((i5 << 12) >> 16);
            i6++;
        } else if (i9 == 3) {
            int i10 = i5 << 6;
            int i11 = i6 + 1;
            bArr[i6] = (byte) (i10 >> 16);
            i6 += 2;
            bArr[i11] = (byte) (i10 >> 8);
        }
        if (i6 == i3) {
            return bArr;
        }
        byte[] copyOf = Arrays.copyOf(bArr, i6);
        Intrinsics.h(copyOf, "copyOf(...)");
        return copyOf;
    }

    public static final String b(byte[] bArr, byte[] bArr2) {
        Intrinsics.i(bArr, "<this>");
        Intrinsics.i(bArr2, "map");
        byte[] bArr3 = new byte[(((bArr.length + 2) / 3) * 4)];
        int length = bArr.length - (bArr.length % 3);
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            byte b2 = bArr[i2];
            int i4 = i2 + 2;
            byte b3 = bArr[i2 + 1];
            i2 += 3;
            byte b4 = bArr[i4];
            bArr3[i3] = bArr2[(b2 & 255) >> 2];
            bArr3[i3 + 1] = bArr2[((b2 & 3) << 4) | ((b3 & 255) >> 4)];
            int i5 = i3 + 3;
            bArr3[i3 + 2] = bArr2[((b3 & 15) << 2) | ((b4 & 255) >> 6)];
            i3 += 4;
            bArr3[i5] = bArr2[b4 & 63];
        }
        int length2 = bArr.length - length;
        if (length2 == 1) {
            byte b5 = bArr[i2];
            bArr3[i3] = bArr2[(b5 & 255) >> 2];
            bArr3[i3 + 1] = bArr2[(b5 & 3) << 4];
            bArr3[i3 + 2] = 61;
            bArr3[i3 + 3] = 61;
        } else if (length2 == 2) {
            int i6 = i2 + 1;
            byte b6 = bArr[i2];
            byte b7 = bArr[i6];
            bArr3[i3] = bArr2[(b6 & 255) >> 2];
            bArr3[i3 + 1] = bArr2[((b6 & 3) << 4) | ((b7 & 255) >> 4)];
            bArr3[i3 + 2] = bArr2[(b7 & 15) << 2];
            bArr3[i3 + 3] = 61;
        }
        return _JvmPlatformKt.c(bArr3);
    }

    public static /* synthetic */ String c(byte[] bArr, byte[] bArr2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            bArr2 = f43317a;
        }
        return b(bArr, bArr2);
    }
}
