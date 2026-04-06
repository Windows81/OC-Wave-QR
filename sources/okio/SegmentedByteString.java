package okio;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okio.Buffer;
import okio.internal.ByteString;

@Metadata
/* renamed from: okio.-SegmentedByteString  reason: invalid class name */
public final class SegmentedByteString {

    /* renamed from: a  reason: collision with root package name */
    public static final Buffer.UnsafeCursor f43323a = new Buffer.UnsafeCursor();

    /* renamed from: b  reason: collision with root package name */
    public static final int f43324b = -1234567890;

    public static final boolean a(byte[] bArr, int i2, byte[] bArr2, int i3, int i4) {
        Intrinsics.i(bArr, "a");
        Intrinsics.i(bArr2, "b");
        for (int i5 = 0; i5 < i4; i5++) {
            if (bArr[i5 + i2] != bArr2[i5 + i3]) {
                return false;
            }
        }
        return true;
    }

    public static final void b(long j2, long j3, long j4) {
        if ((j3 | j4) < 0 || j3 > j2 || j2 - j3 < j4) {
            throw new ArrayIndexOutOfBoundsException("size=" + j2 + " offset=" + j3 + " byteCount=" + j4);
        }
    }

    public static final int c() {
        return f43324b;
    }

    public static final Buffer.UnsafeCursor d() {
        return f43323a;
    }

    public static final int e(ByteString byteString, int i2) {
        Intrinsics.i(byteString, "<this>");
        return i2 == f43324b ? byteString.N() : i2;
    }

    public static final int f(byte[] bArr, int i2) {
        Intrinsics.i(bArr, "<this>");
        return i2 == f43324b ? bArr.length : i2;
    }

    public static final Buffer.UnsafeCursor g(Buffer.UnsafeCursor unsafeCursor) {
        Intrinsics.i(unsafeCursor, "unsafeCursor");
        return unsafeCursor == f43323a ? new Buffer.UnsafeCursor() : unsafeCursor;
    }

    public static final int h(int i2) {
        return ((i2 & 255) << 24) | ((-16777216 & i2) >>> 24) | ((16711680 & i2) >>> 8) | ((65280 & i2) << 8);
    }

    public static final long i(long j2) {
        return ((j2 & 255) << 56) | ((-72057594037927936L & j2) >>> 56) | ((71776119061217280L & j2) >>> 40) | ((280375465082880L & j2) >>> 24) | ((1095216660480L & j2) >>> 8) | ((4278190080L & j2) << 8) | ((16711680 & j2) << 24) | ((65280 & j2) << 40);
    }

    public static final short j(short s2) {
        return (short) (((s2 & 255) << 8) | ((65280 & s2) >>> 8));
    }

    public static final String k(byte b2) {
        return StringsKt.u(new char[]{ByteString.f()[(b2 >> 4) & 15], ByteString.f()[b2 & 15]});
    }

    public static final String l(int i2) {
        int i3 = 0;
        if (i2 == 0) {
            return "0";
        }
        char[] cArr = {ByteString.f()[(i2 >> 28) & 15], ByteString.f()[(i2 >> 24) & 15], ByteString.f()[(i2 >> 20) & 15], ByteString.f()[(i2 >> 16) & 15], ByteString.f()[(i2 >> 12) & 15], ByteString.f()[(i2 >> 8) & 15], ByteString.f()[(i2 >> 4) & 15], ByteString.f()[i2 & 15]};
        while (i3 < 8 && cArr[i3] == '0') {
            i3++;
        }
        return StringsKt.v(cArr, i3, 8);
    }
}
