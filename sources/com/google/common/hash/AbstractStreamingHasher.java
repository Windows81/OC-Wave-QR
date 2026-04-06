package com.google.common.hash;

import com.google.common.base.Preconditions;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

@ElementTypesAreNonnullByDefault
abstract class AbstractStreamingHasher extends AbstractHasher {

    /* renamed from: a  reason: collision with root package name */
    public final ByteBuffer f28835a;

    /* renamed from: b  reason: collision with root package name */
    public final int f28836b;

    /* renamed from: c  reason: collision with root package name */
    public final int f28837c;

    public AbstractStreamingHasher(int i2) {
        this(i2, i2);
    }

    public final HashCode i() {
        l();
        Java8Compatibility.b(this.f28835a);
        if (this.f28835a.remaining() > 0) {
            o(this.f28835a);
            ByteBuffer byteBuffer = this.f28835a;
            Java8Compatibility.d(byteBuffer, byteBuffer.limit());
        }
        return k();
    }

    public final Hasher j(char c2) {
        this.f28835a.putChar(c2);
        m();
        return this;
    }

    public abstract HashCode k();

    public final void l() {
        Java8Compatibility.b(this.f28835a);
        while (this.f28835a.remaining() >= this.f28837c) {
            n(this.f28835a);
        }
        this.f28835a.compact();
    }

    public final void m() {
        if (this.f28835a.remaining() < 8) {
            l();
        }
    }

    public abstract void n(ByteBuffer byteBuffer);

    public void o(ByteBuffer byteBuffer) {
        Java8Compatibility.d(byteBuffer, byteBuffer.limit());
        Java8Compatibility.c(byteBuffer, this.f28837c + 7);
        while (true) {
            int position = byteBuffer.position();
            int i2 = this.f28837c;
            if (position < i2) {
                byteBuffer.putLong(0);
            } else {
                Java8Compatibility.c(byteBuffer, i2);
                Java8Compatibility.b(byteBuffer);
                n(byteBuffer);
                return;
            }
        }
    }

    public final Hasher p(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() <= this.f28835a.remaining()) {
            this.f28835a.put(byteBuffer);
            m();
            return this;
        }
        int position = this.f28836b - this.f28835a.position();
        for (int i2 = 0; i2 < position; i2++) {
            this.f28835a.put(byteBuffer.get());
        }
        l();
        while (byteBuffer.remaining() >= this.f28837c) {
            n(byteBuffer);
        }
        this.f28835a.put(byteBuffer);
        return this;
    }

    public AbstractStreamingHasher(int i2, int i3) {
        Preconditions.d(i3 % i2 == 0);
        this.f28835a = ByteBuffer.allocate(i3 + 7).order(ByteOrder.LITTLE_ENDIAN);
        this.f28836b = i3;
        this.f28837c = i2;
    }

    public final Hasher b(byte b2) {
        this.f28835a.put(b2);
        m();
        return this;
    }

    public final Hasher d(byte[] bArr, int i2, int i3) {
        return p(ByteBuffer.wrap(bArr, i2, i3).order(ByteOrder.LITTLE_ENDIAN));
    }

    public final Hasher e(int i2) {
        this.f28835a.putInt(i2);
        m();
        return this;
    }

    public final Hasher g(long j2) {
        this.f28835a.putLong(j2);
        m();
        return this;
    }
}
