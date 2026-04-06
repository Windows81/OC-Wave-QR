package com.google.common.hash;

import com.google.common.hash.BloomFilter;
import com.google.common.primitives.Longs;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLongArray;

@ElementTypesAreNonnullByDefault
enum BloomFilterStrategies implements BloomFilter.Strategy {
    MURMUR128_MITZ_32 {
        public boolean O(Object obj, Funnel funnel, int i2, LockFreeBitArray lockFreeBitArray) {
            long a2 = lockFreeBitArray.a();
            long c2 = Hashing.a().b(obj, funnel).c();
            int i3 = (int) c2;
            int i4 = (int) (c2 >>> 32);
            for (int i5 = 1; i5 <= i2; i5++) {
                int i6 = (i5 * i4) + i3;
                if (i6 < 0) {
                    i6 = ~i6;
                }
                if (!lockFreeBitArray.b(((long) i6) % a2)) {
                    return false;
                }
            }
            return true;
        }
    },
    MURMUR128_MITZ_64 {
        public boolean O(Object obj, Funnel funnel, int i2, LockFreeBitArray lockFreeBitArray) {
            long a2 = lockFreeBitArray.a();
            byte[] i3 = Hashing.a().b(obj, funnel).i();
            long f2 = f(i3);
            long h2 = h(i3);
            for (int i4 = 0; i4 < i2; i4++) {
                if (!lockFreeBitArray.b((Long.MAX_VALUE & f2) % a2)) {
                    return false;
                }
                f2 += h2;
            }
            return true;
        }

        public final long f(byte[] bArr) {
            return Longs.d(bArr[7], bArr[6], bArr[5], bArr[4], bArr[3], bArr[2], bArr[1], bArr[0]);
        }

        public final long h(byte[] bArr) {
            return Longs.d(bArr[15], bArr[14], bArr[13], bArr[12], bArr[11], bArr[10], bArr[9], bArr[8]);
        }
    };

    public static final class LockFreeBitArray {

        /* renamed from: a  reason: collision with root package name */
        public final AtomicLongArray f28844a;

        public static long[] c(AtomicLongArray atomicLongArray) {
            int length = atomicLongArray.length();
            long[] jArr = new long[length];
            for (int i2 = 0; i2 < length; i2++) {
                jArr[i2] = atomicLongArray.get(i2);
            }
            return jArr;
        }

        public long a() {
            return ((long) this.f28844a.length()) * 64;
        }

        public boolean b(long j2) {
            return ((1 << ((int) j2)) & this.f28844a.get((int) (j2 >>> 6))) != 0;
        }

        public boolean equals(Object obj) {
            if (obj instanceof LockFreeBitArray) {
                return Arrays.equals(c(this.f28844a), c(((LockFreeBitArray) obj).f28844a));
            }
            return false;
        }

        public int hashCode() {
            return Arrays.hashCode(c(this.f28844a));
        }
    }
}
