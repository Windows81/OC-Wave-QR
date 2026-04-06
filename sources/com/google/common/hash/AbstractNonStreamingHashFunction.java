package com.google.common.hash;

import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.Immutable;
import java.io.ByteArrayOutputStream;

@ElementTypesAreNonnullByDefault
@Immutable
abstract class AbstractNonStreamingHashFunction extends AbstractHashFunction {

    public final class BufferingHasher extends AbstractHasher {

        /* renamed from: a  reason: collision with root package name */
        public final ExposedByteArrayOutputStream f28833a;

        public BufferingHasher(int i2) {
            this.f28833a = new ExposedByteArrayOutputStream(i2);
        }

        public HashCode i() {
            return AbstractNonStreamingHashFunction.this.d(this.f28833a.a(), 0, this.f28833a.b());
        }

        public Hasher b(byte b2) {
            this.f28833a.write(b2);
            return this;
        }

        public Hasher d(byte[] bArr, int i2, int i3) {
            this.f28833a.write(bArr, i2, i3);
            return this;
        }
    }

    public static final class ExposedByteArrayOutputStream extends ByteArrayOutputStream {
        public ExposedByteArrayOutputStream(int i2) {
            super(i2);
        }

        public byte[] a() {
            return this.buf;
        }

        public int b() {
            return this.count;
        }
    }

    public Hasher a() {
        return e(32);
    }

    public abstract HashCode d(byte[] bArr, int i2, int i3);

    public Hasher e(int i2) {
        Preconditions.d(i2 >= 0);
        return new BufferingHasher(i2);
    }
}
