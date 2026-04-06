package com.google.common.hash;

import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.Immutable;
import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

@ElementTypesAreNonnullByDefault
@Immutable
final class MessageDigestHashFunction extends AbstractHashFunction implements Serializable {

    /* renamed from: A  reason: collision with root package name */
    public final int f28899A;

    /* renamed from: B  reason: collision with root package name */
    public final boolean f28900B;
    public final String C;

    /* renamed from: z  reason: collision with root package name */
    public final MessageDigest f28901z;

    public static final class MessageDigestHasher extends AbstractByteHasher {

        /* renamed from: b  reason: collision with root package name */
        public final MessageDigest f28902b;

        /* renamed from: c  reason: collision with root package name */
        public final int f28903c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f28904d;

        private void o() {
            Preconditions.x(!this.f28904d, "Cannot re-use a Hasher after calling hash() on it");
        }

        public HashCode i() {
            o();
            this.f28904d = true;
            return this.f28903c == this.f28902b.getDigestLength() ? HashCode.f(this.f28902b.digest()) : HashCode.f(Arrays.copyOf(this.f28902b.digest(), this.f28903c));
        }

        public void l(byte b2) {
            o();
            this.f28902b.update(b2);
        }

        public void n(byte[] bArr, int i2, int i3) {
            o();
            this.f28902b.update(bArr, i2, i3);
        }

        public MessageDigestHasher(MessageDigest messageDigest, int i2) {
            this.f28902b = messageDigest;
            this.f28903c = i2;
        }
    }

    public static final class SerializedForm implements Serializable {
    }

    public MessageDigestHashFunction(String str, String str2) {
        MessageDigest d2 = d(str);
        this.f28901z = d2;
        this.f28899A = d2.getDigestLength();
        this.C = (String) Preconditions.q(str2);
        this.f28900B = e(d2);
    }

    public static MessageDigest d(String str) {
        try {
            return MessageDigest.getInstance(str);
        } catch (NoSuchAlgorithmException e2) {
            throw new AssertionError(e2);
        }
    }

    public static boolean e(MessageDigest messageDigest) {
        try {
            messageDigest.clone();
            return true;
        } catch (CloneNotSupportedException unused) {
            return false;
        }
    }

    public Hasher a() {
        if (this.f28900B) {
            try {
                return new MessageDigestHasher((MessageDigest) this.f28901z.clone(), this.f28899A);
            } catch (CloneNotSupportedException unused) {
            }
        }
        return new MessageDigestHasher(d(this.f28901z.getAlgorithm()), this.f28899A);
    }

    public int c() {
        return this.f28899A * 8;
    }

    public String toString() {
        return this.C;
    }
}
