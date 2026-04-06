package com.google.common.hash;

import com.google.common.base.Charsets;
import com.google.common.base.Preconditions;
import com.google.common.primitives.Ints;
import com.google.errorprone.annotations.Immutable;
import java.io.Serializable;
import java.nio.charset.Charset;

@ElementTypesAreNonnullByDefault
@Immutable
final class Murmur3_32HashFunction extends AbstractHashFunction implements Serializable {

    /* renamed from: B  reason: collision with root package name */
    public static final HashFunction f28911B = new Murmur3_32HashFunction(0, false);
    public static final HashFunction C = new Murmur3_32HashFunction(0, true);
    public static final HashFunction D = new Murmur3_32HashFunction(Hashing.f28876a, true);

    /* renamed from: A  reason: collision with root package name */
    public final boolean f28912A;

    /* renamed from: z  reason: collision with root package name */
    public final int f28913z;

    public static final class Murmur3_32Hasher extends AbstractHasher {

        /* renamed from: a  reason: collision with root package name */
        public int f28914a;

        /* renamed from: b  reason: collision with root package name */
        public long f28915b;

        /* renamed from: c  reason: collision with root package name */
        public int f28916c;

        /* renamed from: d  reason: collision with root package name */
        public int f28917d = 0;

        /* renamed from: e  reason: collision with root package name */
        public boolean f28918e = false;

        public Murmur3_32Hasher(int i2) {
            this.f28914a = i2;
        }

        public HashCode i() {
            Preconditions.w(!this.f28918e);
            this.f28918e = true;
            int d2 = this.f28914a ^ Murmur3_32HashFunction.q((int) this.f28915b);
            this.f28914a = d2;
            return Murmur3_32HashFunction.n(d2, this.f28917d);
        }

        public Hasher j(char c2) {
            k(2, (long) c2);
            return this;
        }

        public final void k(int i2, long j2) {
            long j3 = this.f28915b;
            int i3 = this.f28916c;
            long j4 = ((j2 & 4294967295L) << i3) | j3;
            this.f28915b = j4;
            int i4 = i3 + (i2 * 8);
            this.f28916c = i4;
            this.f28917d += i2;
            if (i4 >= 32) {
                this.f28914a = Murmur3_32HashFunction.p(this.f28914a, Murmur3_32HashFunction.q((int) j4));
                this.f28915b >>>= 32;
                this.f28916c -= 32;
            }
        }

        public Hasher b(byte b2) {
            k(1, (long) (b2 & 255));
            return this;
        }

        public Hasher d(byte[] bArr, int i2, int i3) {
            Preconditions.v(i2, i2 + i3, bArr.length);
            int i4 = 0;
            while (true) {
                int i5 = i4 + 4;
                if (i5 > i3) {
                    break;
                }
                k(4, (long) Murmur3_32HashFunction.o(bArr, i4 + i2));
                i4 = i5;
            }
            while (i4 < i3) {
                b(bArr[i2 + i4]);
                i4++;
            }
            return this;
        }

        public Hasher e(int i2) {
            k(4, (long) i2);
            return this;
        }

        public Hasher f(CharSequence charSequence, Charset charset) {
            if (!Charsets.f27683c.equals(charset)) {
                return super.f(charSequence, charset);
            }
            int length = charSequence.length();
            int i2 = 0;
            while (true) {
                int i3 = i2 + 4;
                if (i3 > length) {
                    break;
                }
                char charAt = charSequence.charAt(i2);
                char charAt2 = charSequence.charAt(i2 + 1);
                char charAt3 = charSequence.charAt(i2 + 2);
                char charAt4 = charSequence.charAt(i2 + 3);
                if (charAt >= 128 || charAt2 >= 128 || charAt3 >= 128 || charAt4 >= 128) {
                    break;
                }
                k(4, (long) ((charAt2 << 8) | charAt | (charAt3 << 16) | (charAt4 << 24)));
                i2 = i3;
            }
            while (i2 < length) {
                char charAt5 = charSequence.charAt(i2);
                if (charAt5 < 128) {
                    k(1, (long) charAt5);
                } else if (charAt5 < 2048) {
                    k(2, Murmur3_32HashFunction.l(charAt5));
                } else if (charAt5 < 55296 || charAt5 > 57343) {
                    k(3, Murmur3_32HashFunction.k(charAt5));
                } else {
                    int codePointAt = Character.codePointAt(charSequence, i2);
                    if (codePointAt == charAt5) {
                        a(charSequence.subSequence(i2, length).toString().getBytes(charset));
                        return this;
                    }
                    i2++;
                    k(4, Murmur3_32HashFunction.m(codePointAt));
                }
                i2++;
            }
            return this;
        }

        public Hasher g(long j2) {
            k(4, (long) ((int) j2));
            k(4, j2 >>> 32);
            return this;
        }
    }

    public Murmur3_32HashFunction(int i2, boolean z2) {
        this.f28913z = i2;
        this.f28912A = z2;
    }

    public static long k(char c2) {
        return ((long) (c2 >>> 12)) | 224 | ((long) ((((c2 >>> 6) & 63) | 128) << 8)) | ((long) (((c2 & '?') | 128) << 16));
    }

    public static long l(char c2) {
        return ((long) (c2 >>> 6)) | 192 | ((long) (((c2 & '?') | 128) << 8));
    }

    public static long m(int i2) {
        return ((long) (i2 >>> 18)) | 240 | ((((long) ((i2 >>> 12) & 63)) | 128) << 8) | ((((long) ((i2 >>> 6) & 63)) | 128) << 16) | ((((long) (i2 & 63)) | 128) << 24);
    }

    public static HashCode n(int i2, int i3) {
        int i4 = i2 ^ i3;
        int i5 = (i4 ^ (i4 >>> 16)) * -2048144789;
        int i6 = (i5 ^ (i5 >>> 13)) * -1028477387;
        return HashCode.g(i6 ^ (i6 >>> 16));
    }

    public static int o(byte[] bArr, int i2) {
        return Ints.f(bArr[i2 + 3], bArr[i2 + 2], bArr[i2 + 1], bArr[i2]);
    }

    public static int p(int i2, int i3) {
        return (Integer.rotateLeft(i2 ^ i3, 13) * 5) - 430675100;
    }

    public static int q(int i2) {
        return Integer.rotateLeft(i2 * -862048943, 15) * 461845907;
    }

    public Hasher a() {
        return new Murmur3_32Hasher(this.f28913z);
    }

    public int c() {
        return 32;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Murmur3_32HashFunction)) {
            return false;
        }
        Murmur3_32HashFunction murmur3_32HashFunction = (Murmur3_32HashFunction) obj;
        return this.f28913z == murmur3_32HashFunction.f28913z && this.f28912A == murmur3_32HashFunction.f28912A;
    }

    public int hashCode() {
        return Murmur3_32HashFunction.class.hashCode() ^ this.f28913z;
    }

    public String toString() {
        int i2 = this.f28913z;
        StringBuilder sb = new StringBuilder(31);
        sb.append("Hashing.murmur3_32(");
        sb.append(i2);
        sb.append(")");
        return sb.toString();
    }
}
