package com.google.common.hash;

import com.google.errorprone.annotations.Immutable;
import java.util.Arrays;
import java.util.zip.Adler32;
import java.util.zip.CRC32;
import java.util.zip.Checksum;

@ElementTypesAreNonnullByDefault
public final class Hashing {

    /* renamed from: a  reason: collision with root package name */
    public static final int f28876a = ((int) System.currentTimeMillis());

    @Immutable
    public enum ChecksumType implements ImmutableSupplier<Checksum> {
        CRC_32("Hashing.crc32()") {
            /* renamed from: f */
            public Checksum get() {
                return new CRC32();
            }
        },
        ADLER_32("Hashing.adler32()") {
            /* renamed from: f */
            public Checksum get() {
                return new Adler32();
            }
        };
        

        /* renamed from: z  reason: collision with root package name */
        public final HashFunction f28879z;

        /* access modifiers changed from: public */
        ChecksumType(String str) {
            this.f28879z = new ChecksumHashFunction(this, 32, str);
        }
    }

    public static final class ConcatenatedHashFunction extends AbstractCompositeHashFunction {
        public int c() {
            int i2 = 0;
            for (HashFunction c2 : this.f28830z) {
                i2 += c2.c();
            }
            return i2;
        }

        public HashCode e(Hasher[] hasherArr) {
            byte[] bArr = new byte[(c() / 8)];
            int i2 = 0;
            for (Hasher i3 : hasherArr) {
                HashCode i4 = i3.i();
                i2 += i4.j(bArr, i2, i4.d() / 8);
            }
            return HashCode.f(bArr);
        }

        public boolean equals(Object obj) {
            if (obj instanceof ConcatenatedHashFunction) {
                return Arrays.equals(this.f28830z, ((ConcatenatedHashFunction) obj).f28830z);
            }
            return false;
        }

        public int hashCode() {
            return Arrays.hashCode(this.f28830z);
        }
    }

    public static final class LinearCongruentialGenerator {
    }

    public static class Md5Holder {

        /* renamed from: a  reason: collision with root package name */
        public static final HashFunction f28880a = new MessageDigestHashFunction("MD5", "Hashing.md5()");
    }

    public static class Sha1Holder {

        /* renamed from: a  reason: collision with root package name */
        public static final HashFunction f28881a = new MessageDigestHashFunction("SHA-1", "Hashing.sha1()");
    }

    public static class Sha256Holder {

        /* renamed from: a  reason: collision with root package name */
        public static final HashFunction f28882a = new MessageDigestHashFunction("SHA-256", "Hashing.sha256()");
    }

    public static class Sha384Holder {

        /* renamed from: a  reason: collision with root package name */
        public static final HashFunction f28883a = new MessageDigestHashFunction("SHA-384", "Hashing.sha384()");
    }

    public static class Sha512Holder {

        /* renamed from: a  reason: collision with root package name */
        public static final HashFunction f28884a = new MessageDigestHashFunction("SHA-512", "Hashing.sha512()");
    }

    public static HashFunction a() {
        return Murmur3_128HashFunction.f28905A;
    }
}
