package com.google.common.hash;

import com.google.common.base.Preconditions;

@ElementTypesAreNonnullByDefault
final class Fingerprint2011 extends AbstractNonStreamingHashFunction {

    /* renamed from: z  reason: collision with root package name */
    public static final HashFunction f28860z = new Fingerprint2011();

    public static long f(byte[] bArr, int i2, int i3) {
        long j2 = i3 <= 32 ? j(bArr, i2, i3, -1397348546323613475L) : i3 <= 64 ? i(bArr, i2, i3) : g(bArr, i2, i3);
        long j3 = -6505348102511208375L;
        long b2 = i3 >= 8 ? LittleEndianByteArray.b(bArr, i2) : -6505348102511208375L;
        if (i3 >= 9) {
            j3 = LittleEndianByteArray.b(bArr, (i2 + i3) - 8);
        }
        long h2 = h(j2 + j3, b2);
        return (h2 == 0 || h2 == 1) ? h2 - 2 : h2;
    }

    public static long g(byte[] bArr, int i2, int i3) {
        byte[] bArr2 = bArr;
        int i4 = i3;
        long b2 = LittleEndianByteArray.b(bArr, i2);
        int i5 = i2 + i4;
        long b3 = LittleEndianByteArray.b(bArr2, i5 - 16) ^ -8261664234251669945L;
        long b4 = LittleEndianByteArray.b(bArr2, i5 - 56) ^ -6505348102511208375L;
        long[] jArr = new long[2];
        long j2 = (long) i4;
        byte[] bArr3 = bArr;
        long[] jArr2 = new long[2];
        long[] jArr3 = jArr;
        l(bArr3, i5 - 64, j2, b3, jArr);
        l(bArr3, i5 - 32, j2 * -8261664234251669945L, -6505348102511208375L, jArr2);
        long k2 = b4 + (k(jArr3[1]) * -8261664234251669945L);
        long rotateRight = Long.rotateRight(k2 + b2, 39) * -8261664234251669945L;
        long rotateRight2 = Long.rotateRight(b3, 33) * -8261664234251669945L;
        int i6 = i2;
        int i7 = (i4 - 1) & -64;
        while (true) {
            long rotateRight3 = (Long.rotateRight(((rotateRight + rotateRight2) + jArr3[0]) + LittleEndianByteArray.b(bArr2, i6 + 16), 37) * -8261664234251669945L) ^ jArr2[1];
            long rotateRight4 = (Long.rotateRight((rotateRight2 + jArr3[1]) + LittleEndianByteArray.b(bArr2, i6 + 48), 42) * -8261664234251669945L) ^ jArr3[0];
            long rotateRight5 = Long.rotateRight(k2 ^ jArr2[0], 33);
            byte[] bArr4 = bArr;
            l(bArr4, i6, jArr3[1] * -8261664234251669945L, rotateRight3 + jArr2[0], jArr3);
            l(bArr4, i6 + 32, jArr2[1] + rotateRight5, rotateRight4, jArr2);
            i6 += 64;
            i7 -= 64;
            if (i7 == 0) {
                return h(h(jArr3[0], jArr2[0]) + (k(rotateRight4) * -8261664234251669945L) + rotateRight3, h(jArr3[1], jArr2[1]) + rotateRight5);
            }
            rotateRight = rotateRight5;
            k2 = rotateRight3;
            rotateRight2 = rotateRight4;
        }
    }

    public static long h(long j2, long j3) {
        long j4 = (j3 ^ j2) * -4132994306676758123L;
        long j5 = (j2 ^ (j4 ^ (j4 >>> 47))) * -4132994306676758123L;
        return (j5 ^ (j5 >>> 47)) * -4132994306676758123L;
    }

    private static long i(byte[] bArr, int i2, int i3) {
        byte[] bArr2 = bArr;
        int i4 = i3;
        long b2 = LittleEndianByteArray.b(bArr2, i2 + 24);
        long j2 = (long) i4;
        int i5 = i2 + i4;
        int i6 = i5 - 16;
        long b3 = LittleEndianByteArray.b(bArr, i2) + ((j2 + LittleEndianByteArray.b(bArr2, i6)) * -6505348102511208375L);
        long rotateRight = Long.rotateRight(b3 + b2, 52);
        long rotateRight2 = Long.rotateRight(b3, 37);
        long b4 = b3 + LittleEndianByteArray.b(bArr2, i2 + 8);
        int i7 = i2 + 16;
        long b5 = b4 + LittleEndianByteArray.b(bArr2, i7);
        long j3 = b2 + b5;
        long rotateRight3 = rotateRight + Long.rotateRight(b5, 31) + rotateRight2 + Long.rotateRight(b4, 7);
        long b6 = LittleEndianByteArray.b(bArr2, i7) + LittleEndianByteArray.b(bArr2, i5 - 32);
        long b7 = LittleEndianByteArray.b(bArr2, i5 - 8);
        long j4 = rotateRight3;
        long rotateRight4 = Long.rotateRight(b6 + b7, 52);
        long rotateRight5 = Long.rotateRight(b6, 37);
        long b8 = b6 + LittleEndianByteArray.b(bArr2, i5 - 24);
        long b9 = b8 + LittleEndianByteArray.b(bArr2, i6);
        long rotateRight6 = rotateRight4 + Long.rotateRight(b9, 31);
        long j5 = j4;
        return k((k(((j3 + rotateRight6 + rotateRight5 + Long.rotateRight(b8, 7)) * -4288712594273399085L) + ((b7 + b9 + j5) * -6505348102511208375L)) * -6505348102511208375L) + j5) * -4288712594273399085L;
    }

    public static long j(byte[] bArr, int i2, int i3, long j2) {
        int i4 = i3 & -8;
        int i5 = i3 & 7;
        long j3 = j2 ^ (((long) i3) * -4132994306676758123L);
        for (int i6 = 0; i6 < i4; i6 += 8) {
            j3 = (j3 ^ (k(LittleEndianByteArray.b(bArr, i2 + i6) * -4132994306676758123L) * -4132994306676758123L)) * -4132994306676758123L;
        }
        if (i5 != 0) {
            j3 = (LittleEndianByteArray.c(bArr, i2 + i4, i5) ^ j3) * -4132994306676758123L;
        }
        return k(k(j3) * -4132994306676758123L);
    }

    private static long k(long j2) {
        return j2 ^ (j2 >>> 47);
    }

    private static void l(byte[] bArr, int i2, long j2, long j3, long[] jArr) {
        long b2 = LittleEndianByteArray.b(bArr, i2);
        long b3 = LittleEndianByteArray.b(bArr, i2 + 8);
        long b4 = LittleEndianByteArray.b(bArr, i2 + 16);
        long b5 = LittleEndianByteArray.b(bArr, i2 + 24);
        long j4 = j2 + b2;
        long j5 = b3 + j4 + b4;
        jArr[0] = j5 + b5;
        jArr[1] = Long.rotateRight(j3 + j4 + b5, 51) + Long.rotateRight(j5, 23) + j4;
    }

    public int c() {
        return 64;
    }

    public HashCode d(byte[] bArr, int i2, int i3) {
        Preconditions.v(i2, i2 + i3, bArr.length);
        return HashCode.h(f(bArr, i2, i3));
    }

    public String toString() {
        return "Hashing.fingerprint2011()";
    }
}
