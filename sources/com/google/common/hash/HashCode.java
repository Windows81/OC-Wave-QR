package com.google.common.hash;

import com.google.common.base.Preconditions;
import com.google.common.primitives.Ints;
import java.io.Serializable;

@ElementTypesAreNonnullByDefault
public abstract class HashCode {

    /* renamed from: z  reason: collision with root package name */
    public static final char[] f28872z = "0123456789abcdef".toCharArray();

    public static final class BytesHashCode extends HashCode implements Serializable {

        /* renamed from: A  reason: collision with root package name */
        public final byte[] f28873A;

        public BytesHashCode(byte[] bArr) {
            this.f28873A = (byte[]) Preconditions.q(bArr);
        }

        public byte[] a() {
            return (byte[]) this.f28873A.clone();
        }

        public int b() {
            byte[] bArr = this.f28873A;
            Preconditions.y(bArr.length >= 4, "HashCode#asInt() requires >= 4 bytes (it only has %s bytes).", bArr.length);
            byte[] bArr2 = this.f28873A;
            return ((bArr2[3] & 255) << 24) | (bArr2[0] & 255) | ((bArr2[1] & 255) << 8) | ((bArr2[2] & 255) << 16);
        }

        public long c() {
            byte[] bArr = this.f28873A;
            Preconditions.y(bArr.length >= 8, "HashCode#asLong() requires >= 8 bytes (it only has %s bytes).", bArr.length);
            return l();
        }

        public int d() {
            return this.f28873A.length * 8;
        }

        public boolean e(HashCode hashCode) {
            if (this.f28873A.length != hashCode.i().length) {
                return false;
            }
            boolean z2 = true;
            int i2 = 0;
            while (true) {
                byte[] bArr = this.f28873A;
                if (i2 >= bArr.length) {
                    return z2;
                }
                z2 &= bArr[i2] == hashCode.i()[i2];
                i2++;
            }
        }

        public byte[] i() {
            return this.f28873A;
        }

        public void k(byte[] bArr, int i2, int i3) {
            System.arraycopy(this.f28873A, 0, bArr, i2, i3);
        }

        public long l() {
            long j2 = (long) (this.f28873A[0] & 255);
            for (int i2 = 1; i2 < Math.min(this.f28873A.length, 8); i2++) {
                j2 |= (((long) this.f28873A[i2]) & 255) << (i2 * 8);
            }
            return j2;
        }
    }

    public static final class IntHashCode extends HashCode implements Serializable {

        /* renamed from: A  reason: collision with root package name */
        public final int f28874A;

        public IntHashCode(int i2) {
            this.f28874A = i2;
        }

        public byte[] a() {
            int i2 = this.f28874A;
            return new byte[]{(byte) i2, (byte) (i2 >> 8), (byte) (i2 >> 16), (byte) (i2 >> 24)};
        }

        public int b() {
            return this.f28874A;
        }

        public long c() {
            throw new IllegalStateException("this HashCode only has 32 bits; cannot create a long");
        }

        public int d() {
            return 32;
        }

        public boolean e(HashCode hashCode) {
            return this.f28874A == hashCode.b();
        }

        public void k(byte[] bArr, int i2, int i3) {
            for (int i4 = 0; i4 < i3; i4++) {
                bArr[i2 + i4] = (byte) (this.f28874A >> (i4 * 8));
            }
        }
    }

    public static final class LongHashCode extends HashCode implements Serializable {

        /* renamed from: A  reason: collision with root package name */
        public final long f28875A;

        public LongHashCode(long j2) {
            this.f28875A = j2;
        }

        public byte[] a() {
            long j2 = this.f28875A;
            return new byte[]{(byte) ((int) j2), (byte) ((int) (j2 >> 8)), (byte) ((int) (j2 >> 16)), (byte) ((int) (j2 >> 24)), (byte) ((int) (j2 >> 32)), (byte) ((int) (j2 >> 40)), (byte) ((int) (j2 >> 48)), (byte) ((int) (j2 >> 56))};
        }

        public int b() {
            return (int) this.f28875A;
        }

        public long c() {
            return this.f28875A;
        }

        public int d() {
            return 64;
        }

        public boolean e(HashCode hashCode) {
            return this.f28875A == hashCode.c();
        }

        public void k(byte[] bArr, int i2, int i3) {
            for (int i4 = 0; i4 < i3; i4++) {
                bArr[i2 + i4] = (byte) ((int) (this.f28875A >> (i4 * 8)));
            }
        }
    }

    public static HashCode f(byte[] bArr) {
        return new BytesHashCode(bArr);
    }

    public static HashCode g(int i2) {
        return new IntHashCode(i2);
    }

    public static HashCode h(long j2) {
        return new LongHashCode(j2);
    }

    public abstract byte[] a();

    public abstract int b();

    public abstract long c();

    public abstract int d();

    public abstract boolean e(HashCode hashCode);

    public final boolean equals(Object obj) {
        if (!(obj instanceof HashCode)) {
            return false;
        }
        HashCode hashCode = (HashCode) obj;
        return d() == hashCode.d() && e(hashCode);
    }

    public final int hashCode() {
        if (d() >= 32) {
            return b();
        }
        byte[] i2 = i();
        byte b2 = i2[0] & 255;
        for (int i3 = 1; i3 < i2.length; i3++) {
            b2 |= (i2[i3] & 255) << (i3 * 8);
        }
        return b2;
    }

    public byte[] i() {
        return a();
    }

    public int j(byte[] bArr, int i2, int i3) {
        int j2 = Ints.j(i3, d() / 8);
        Preconditions.v(i2, i2 + j2, bArr.length);
        k(bArr, i2, j2);
        return j2;
    }

    public abstract void k(byte[] bArr, int i2, int i3);

    public final String toString() {
        byte[] i2 = i();
        StringBuilder sb = new StringBuilder(i2.length * 2);
        for (byte b2 : i2) {
            char[] cArr = f28872z;
            sb.append(cArr[(b2 >> 4) & 15]);
            sb.append(cArr[b2 & 15]);
        }
        return sb.toString();
    }
}
