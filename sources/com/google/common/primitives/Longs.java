package com.google.common.primitives;

import com.google.common.base.Converter;
import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;

@ElementTypesAreNonnullByDefault
public final class Longs {

    public static final class AsciiDigits {

        /* renamed from: a  reason: collision with root package name */
        public static final byte[] f29168a;

        static {
            byte[] bArr = new byte[128];
            Arrays.fill(bArr, (byte) -1);
            for (int i2 = 0; i2 < 10; i2++) {
                bArr[i2 + 48] = (byte) i2;
            }
            for (int i3 = 0; i3 < 26; i3++) {
                byte b2 = (byte) (i3 + 10);
                bArr[i3 + 65] = b2;
                bArr[i3 + 97] = b2;
            }
            f29168a = bArr;
        }
    }

    public enum LexicographicalComparator implements Comparator<long[]> {
        INSTANCE;

        /* renamed from: f */
        public int compare(long[] jArr, long[] jArr2) {
            int min = Math.min(jArr.length, jArr2.length);
            for (int i2 = 0; i2 < min; i2++) {
                int c2 = Longs.c(jArr[i2], jArr2[i2]);
                if (c2 != 0) {
                    return c2;
                }
            }
            return jArr.length - jArr2.length;
        }

        public String toString() {
            return "Longs.lexicographicalComparator()";
        }
    }

    public static class LongArrayAsList extends AbstractList<Long> implements RandomAccess, Serializable {

        /* renamed from: A  reason: collision with root package name */
        public final int f29171A;

        /* renamed from: B  reason: collision with root package name */
        public final int f29172B;

        /* renamed from: z  reason: collision with root package name */
        public final long[] f29173z;

        public LongArrayAsList(long[] jArr, int i2, int i3) {
            this.f29173z = jArr;
            this.f29171A = i2;
            this.f29172B = i3;
        }

        public boolean contains(Object obj) {
            return (obj instanceof Long) && Longs.f(this.f29173z, ((Long) obj).longValue(), this.f29171A, this.f29172B) != -1;
        }

        /* renamed from: e */
        public Long get(int i2) {
            Preconditions.o(i2, size());
            return Long.valueOf(this.f29173z[this.f29171A + i2]);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof LongArrayAsList)) {
                return super.equals(obj);
            }
            LongArrayAsList longArrayAsList = (LongArrayAsList) obj;
            int size = size();
            if (longArrayAsList.size() != size) {
                return false;
            }
            for (int i2 = 0; i2 < size; i2++) {
                if (this.f29173z[this.f29171A + i2] != longArrayAsList.f29173z[longArrayAsList.f29171A + i2]) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: g */
        public Long set(int i2, Long l2) {
            Preconditions.o(i2, size());
            long[] jArr = this.f29173z;
            int i3 = this.f29171A;
            long j2 = jArr[i3 + i2];
            jArr[i3 + i2] = ((Long) Preconditions.q(l2)).longValue();
            return Long.valueOf(j2);
        }

        public int hashCode() {
            int i2 = 1;
            for (int i3 = this.f29171A; i3 < this.f29172B; i3++) {
                i2 = (i2 * 31) + Longs.e(this.f29173z[i3]);
            }
            return i2;
        }

        public int indexOf(Object obj) {
            int a2;
            if (!(obj instanceof Long) || (a2 = Longs.f(this.f29173z, ((Long) obj).longValue(), this.f29171A, this.f29172B)) < 0) {
                return -1;
            }
            return a2 - this.f29171A;
        }

        public boolean isEmpty() {
            return false;
        }

        public int lastIndexOf(Object obj) {
            int b2;
            if (!(obj instanceof Long) || (b2 = Longs.g(this.f29173z, ((Long) obj).longValue(), this.f29171A, this.f29172B)) < 0) {
                return -1;
            }
            return b2 - this.f29171A;
        }

        public int size() {
            return this.f29172B - this.f29171A;
        }

        public List subList(int i2, int i3) {
            Preconditions.v(i2, i3, size());
            if (i2 == i3) {
                return Collections.emptyList();
            }
            long[] jArr = this.f29173z;
            int i4 = this.f29171A;
            return new LongArrayAsList(jArr, i2 + i4, i4 + i3);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(size() * 10);
            sb.append('[');
            sb.append(this.f29173z[this.f29171A]);
            int i2 = this.f29171A;
            while (true) {
                i2++;
                if (i2 < this.f29172B) {
                    sb.append(", ");
                    sb.append(this.f29173z[i2]);
                } else {
                    sb.append(']');
                    return sb.toString();
                }
            }
        }
    }

    public static final class LongConverter extends Converter<String, Long> implements Serializable {

        /* renamed from: A  reason: collision with root package name */
        public static final LongConverter f29174A = new LongConverter();

        /* renamed from: h */
        public String d(Long l2) {
            return l2.toString();
        }

        /* renamed from: i */
        public Long e(String str) {
            return Long.decode(str);
        }

        public String toString() {
            return "Longs.stringConverter()";
        }
    }

    public static int c(long j2, long j3) {
        int i2 = (j2 > j3 ? 1 : (j2 == j3 ? 0 : -1));
        if (i2 < 0) {
            return -1;
        }
        return i2 > 0 ? 1 : 0;
    }

    public static long d(byte b2, byte b3, byte b4, byte b5, byte b6, byte b7, byte b8, byte b9) {
        return ((((long) b3) & 255) << 48) | ((((long) b2) & 255) << 56) | ((((long) b4) & 255) << 40) | ((((long) b5) & 255) << 32) | ((((long) b6) & 255) << 24) | ((((long) b7) & 255) << 16) | ((((long) b8) & 255) << 8) | (((long) b9) & 255);
    }

    public static int e(long j2) {
        return (int) (j2 ^ (j2 >>> 32));
    }

    public static int f(long[] jArr, long j2, int i2, int i3) {
        while (i2 < i3) {
            if (jArr[i2] == j2) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public static int g(long[] jArr, long j2, int i2, int i3) {
        for (int i4 = i3 - 1; i4 >= i2; i4--) {
            if (jArr[i4] == j2) {
                return i4;
            }
        }
        return -1;
    }

    public static byte[] h(long j2) {
        byte[] bArr = new byte[8];
        for (int i2 = 7; i2 >= 0; i2--) {
            bArr[i2] = (byte) ((int) (255 & j2));
            j2 >>= 8;
        }
        return bArr;
    }
}
