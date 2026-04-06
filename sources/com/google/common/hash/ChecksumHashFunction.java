package com.google.common.hash;

import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.Immutable;
import java.io.Serializable;
import java.util.zip.Checksum;

@ElementTypesAreNonnullByDefault
@Immutable
final class ChecksumHashFunction extends AbstractHashFunction implements Serializable {

    /* renamed from: A  reason: collision with root package name */
    public final int f28845A;

    /* renamed from: B  reason: collision with root package name */
    public final String f28846B;

    /* renamed from: z  reason: collision with root package name */
    public final ImmutableSupplier f28847z;

    public final class ChecksumHasher extends AbstractByteHasher {

        /* renamed from: b  reason: collision with root package name */
        public final Checksum f28848b;

        public HashCode i() {
            long value = this.f28848b.getValue();
            return ChecksumHashFunction.this.f28845A == 32 ? HashCode.g((int) value) : HashCode.h(value);
        }

        public void l(byte b2) {
            this.f28848b.update(b2);
        }

        public void n(byte[] bArr, int i2, int i3) {
            this.f28848b.update(bArr, i2, i3);
        }

        public ChecksumHasher(Checksum checksum) {
            this.f28848b = (Checksum) Preconditions.q(checksum);
        }
    }

    public ChecksumHashFunction(ImmutableSupplier immutableSupplier, int i2, String str) {
        this.f28847z = (ImmutableSupplier) Preconditions.q(immutableSupplier);
        Preconditions.g(i2 == 32 || i2 == 64, "bits (%s) must be either 32 or 64", i2);
        this.f28845A = i2;
        this.f28846B = (String) Preconditions.q(str);
    }

    public Hasher a() {
        return new ChecksumHasher((Checksum) this.f28847z.get());
    }

    public int c() {
        return this.f28845A;
    }

    public String toString() {
        return this.f28846B;
    }
}
