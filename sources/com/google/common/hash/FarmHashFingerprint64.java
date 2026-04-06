package com.google.common.hash;

import com.google.common.base.Preconditions;

@ElementTypesAreNonnullByDefault
final class FarmHashFingerprint64 extends AbstractNonStreamingHashFunction {

    /* renamed from: z  reason: collision with root package name */
    public static final HashFunction f28859z = new FarmHashFingerprint64();

    public static long f(byte[] bArr, int i2, int i3) {
        return i3 <= 32 ? i3 <= 16 ? g(bArr, i2, i3) : i(bArr, i2, i3) : i3 <= 64 ? j(bArr, i2, i3) : k(bArr, i2, i3);
    }

    public static long g(byte[] bArr, int i2, int i3) {
        if (i3 >= 8) {
            long j2 = ((long) (i3 * 2)) - 7286425919675154353L;
            long b2 = LittleEndianByteArray.b(bArr, i2) - 7286425919675154353L;
            long b3 = LittleEndianByteArray.b(bArr, (i2 + i3) - 8);
            return h((Long.rotateRight(b3, 37) * j2) + b2, (Long.rotateRight(b2, 25) + b3) * j2, j2);
        } else if (i3 >= 4) {
            return h(((long) i3) + ((((long) LittleEndianByteArray.a(bArr, i2)) & 4294967295L) << 3), ((long) LittleEndianByteArray.a(bArr, (i2 + i3) - 4)) & 4294967295L, ((long) (i3 * 2)) - 7286425919675154353L);
        } else if (i3 <= 0) {
            return -7286425919675154353L;
        } else {
            return l((((long) ((bArr[i2] & 255) + ((bArr[(i3 >> 1) + i2] & 255) << 8))) * -7286425919675154353L) ^ (((long) (i3 + ((bArr[i2 + (i3 - 1)] & 255) << 2))) * -4348849565147123417L)) * -7286425919675154353L;
        }
    }

    public static long h(long j2, long j3, long j4) {
        long j5 = (j2 ^ j3) * j4;
        long j6 = ((j5 ^ (j5 >>> 47)) ^ j3) * j4;
        return (j6 ^ (j6 >>> 47)) * j4;
    }

    public static long i(byte[] bArr, int i2, int i3) {
        byte[] bArr2 = bArr;
        long j2 = ((long) (i3 * 2)) - 7286425919675154353L;
        long b2 = LittleEndianByteArray.b(bArr, i2) * -5435081209227447693L;
        long b3 = LittleEndianByteArray.b(bArr2, i2 + 8);
        int i4 = i2 + i3;
        long b4 = LittleEndianByteArray.b(bArr2, i4 - 8) * j2;
        return h((LittleEndianByteArray.b(bArr2, i4 - 16) * -7286425919675154353L) + Long.rotateRight(b2 + b3, 43) + Long.rotateRight(b4, 30), b2 + Long.rotateRight(b3 - 7286425919675154353L, 18) + b4, j2);
    }

    public static long j(byte[] bArr, int i2, int i3) {
        byte[] bArr2 = bArr;
        long j2 = ((long) (i3 * 2)) - 7286425919675154353L;
        long b2 = LittleEndianByteArray.b(bArr, i2) * -7286425919675154353L;
        long b3 = LittleEndianByteArray.b(bArr2, i2 + 8);
        int i4 = i2 + i3;
        long b4 = LittleEndianByteArray.b(bArr2, i4 - 8) * j2;
        long rotateRight = Long.rotateRight(b2 + b3, 43) + Long.rotateRight(b4, 30) + (LittleEndianByteArray.b(bArr2, i4 - 16) * -7286425919675154353L);
        long h2 = h(rotateRight, b4 + Long.rotateRight(b3 - 7286425919675154353L, 18) + b2, j2);
        long b5 = LittleEndianByteArray.b(bArr2, i2 + 16) * j2;
        long b6 = LittleEndianByteArray.b(bArr2, i2 + 24);
        long b7 = (rotateRight + LittleEndianByteArray.b(bArr2, i4 - 32)) * j2;
        return h(((h2 + LittleEndianByteArray.b(bArr2, i4 - 24)) * j2) + Long.rotateRight(b5 + b6, 43) + Long.rotateRight(b7, 30), b5 + Long.rotateRight(b6 + b2, 18) + b7, j2);
    }

    public static long k(byte[] bArr, int i2, int i3) {
        byte[] bArr2 = bArr;
        long j2 = (long) 81;
        long j3 = (j2 * -5435081209227447693L) + 113;
        long l2 = l((j3 * -7286425919675154353L) + 113) * -7286425919675154353L;
        long[] jArr = new long[2];
        long[] jArr2 = new long[2];
        long b2 = (j2 * -7286425919675154353L) + LittleEndianByteArray.b(bArr, i2);
        int i4 = i3 - 1;
        int i5 = i2 + ((i4 / 64) * 64);
        int i6 = i4 & 63;
        int i7 = i5 + i6;
        int i8 = i7 - 63;
        int i9 = i2;
        while (true) {
            long rotateRight = (Long.rotateRight(((b2 + j3) + jArr[0]) + LittleEndianByteArray.b(bArr2, i9 + 8), 37) * -5435081209227447693L) ^ jArr2[1];
            long rotateRight2 = (Long.rotateRight(j3 + jArr[1] + LittleEndianByteArray.b(bArr2, i9 + 48), 42) * -5435081209227447693L) + jArr[0] + LittleEndianByteArray.b(bArr2, i9 + 40);
            long rotateRight3 = Long.rotateRight(l2 + jArr2[0], 33) * -5435081209227447693L;
            m(bArr, i9, jArr[1] * -5435081209227447693L, rotateRight + jArr2[0], jArr);
            m(bArr, i9 + 32, rotateRight3 + jArr2[1], rotateRight2 + LittleEndianByteArray.b(bArr2, i9 + 16), jArr2);
            int i10 = i9 + 64;
            if (i10 == i5) {
                long j4 = -5435081209227447693L + ((rotateRight & 255) << 1);
                long j5 = jArr2[0] + ((long) i6);
                jArr2[0] = j5;
                long j6 = jArr[0] + j5;
                jArr[0] = j6;
                jArr2[0] = jArr2[0] + j6;
                long rotateRight4 = (Long.rotateRight(((rotateRight3 + rotateRight2) + jArr[0]) + LittleEndianByteArray.b(bArr2, i7 - 55), 37) * j4) ^ (jArr2[1] * 9);
                long rotateRight5 = (Long.rotateRight(rotateRight2 + jArr[1] + LittleEndianByteArray.b(bArr2, i7 - 15), 42) * j4) + (jArr[0] * 9) + LittleEndianByteArray.b(bArr2, i7 - 23);
                long rotateRight6 = Long.rotateRight(rotateRight + jArr2[0], 33) * j4;
                byte[] bArr3 = bArr;
                m(bArr3, i8, jArr[1] * j4, rotateRight4 + jArr2[0], jArr);
                m(bArr3, i7 - 31, rotateRight6 + jArr2[1], rotateRight5 + LittleEndianByteArray.b(bArr2, i7 - 47), jArr2);
                long j7 = j4;
                return h(h(jArr[0], jArr2[0], j7) + (l(rotateRight5) * -4348849565147123417L) + rotateRight4, h(jArr[1], jArr2[1], j7) + rotateRight6, j7);
            }
            i9 = i10;
            l2 = rotateRight;
            j3 = rotateRight2;
            b2 = rotateRight3;
        }
    }

    public static long l(long j2) {
        return j2 ^ (j2 >>> 47);
    }

    public static void m(byte[] bArr, int i2, long j2, long j3, long[] jArr) {
        long b2 = LittleEndianByteArray.b(bArr, i2);
        long b3 = LittleEndianByteArray.b(bArr, i2 + 8);
        long b4 = LittleEndianByteArray.b(bArr, i2 + 16);
        long b5 = LittleEndianByteArray.b(bArr, i2 + 24);
        long j4 = j2 + b2;
        long j5 = b3 + j4 + b4;
        jArr[0] = j5 + b5;
        jArr[1] = Long.rotateRight(j3 + j4 + b5, 21) + Long.rotateRight(j5, 44) + j4;
    }

    public int c() {
        return 64;
    }

    public HashCode d(byte[] bArr, int i2, int i3) {
        Preconditions.v(i2, i2 + i3, bArr.length);
        return HashCode.h(f(bArr, i2, i3));
    }

    public String toString() {
        return "Hashing.farmHashFingerprint64()";
    }
}
