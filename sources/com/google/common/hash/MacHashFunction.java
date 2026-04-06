package com.google.common.hash;

import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.Immutable;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;

@ElementTypesAreNonnullByDefault
@Immutable
final class MacHashFunction extends AbstractHashFunction {

    /* renamed from: A  reason: collision with root package name */
    public final Key f28894A;

    /* renamed from: B  reason: collision with root package name */
    public final String f28895B;
    public final int C;
    public final boolean D;

    /* renamed from: z  reason: collision with root package name */
    public final Mac f28896z;

    public static final class MacHasher extends AbstractByteHasher {

        /* renamed from: b  reason: collision with root package name */
        public final Mac f28897b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f28898c;

        public HashCode i() {
            o();
            this.f28898c = true;
            return HashCode.f(this.f28897b.doFinal());
        }

        public void l(byte b2) {
            o();
            this.f28897b.update(b2);
        }

        public void m(byte[] bArr) {
            o();
            this.f28897b.update(bArr);
        }

        public void n(byte[] bArr, int i2, int i3) {
            o();
            this.f28897b.update(bArr, i2, i3);
        }

        public final void o() {
            Preconditions.x(!this.f28898c, "Cannot re-use a Hasher after calling hash() on it");
        }

        public MacHasher(Mac mac) {
            this.f28897b = mac;
        }
    }

    public static Mac d(String str, Key key) {
        try {
            Mac instance = Mac.getInstance(str);
            instance.init(key);
            return instance;
        } catch (NoSuchAlgorithmException e2) {
            throw new IllegalStateException(e2);
        } catch (InvalidKeyException e3) {
            throw new IllegalArgumentException(e3);
        }
    }

    public Hasher a() {
        if (this.D) {
            try {
                return new MacHasher((Mac) this.f28896z.clone());
            } catch (CloneNotSupportedException unused) {
            }
        }
        return new MacHasher(d(this.f28896z.getAlgorithm(), this.f28894A));
    }

    public int c() {
        return this.C;
    }

    public String toString() {
        return this.f28895B;
    }
}
