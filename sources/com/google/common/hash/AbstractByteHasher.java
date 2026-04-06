package com.google.common.hash;

import com.google.common.base.Preconditions;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

@ElementTypesAreNonnullByDefault
abstract class AbstractByteHasher extends AbstractHasher {

    /* renamed from: a  reason: collision with root package name */
    public final ByteBuffer f28829a = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN);

    public Hasher j(char c2) {
        this.f28829a.putChar(c2);
        return k(2);
    }

    public final Hasher k(int i2) {
        try {
            n(this.f28829a.array(), 0, i2);
            return this;
        } finally {
            Java8Compatibility.a(this.f28829a);
        }
    }

    public abstract void l(byte b2);

    public void m(byte[] bArr) {
        n(bArr, 0, bArr.length);
    }

    public void n(byte[] bArr, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            l(bArr[i4]);
        }
    }

    public Hasher a(byte[] bArr) {
        Preconditions.q(bArr);
        m(bArr);
        return this;
    }

    public Hasher b(byte b2) {
        l(b2);
        return this;
    }

    public Hasher d(byte[] bArr, int i2, int i3) {
        Preconditions.v(i2, i2 + i3, bArr.length);
        n(bArr, i2, i3);
        return this;
    }

    public Hasher e(int i2) {
        this.f28829a.putInt(i2);
        return k(4);
    }

    public Hasher g(long j2) {
        this.f28829a.putLong(j2);
        return k(8);
    }
}
