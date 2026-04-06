package org.bson;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.concurrent.atomic.AtomicInteger;

public class ByteBufNIO implements ByteBuf {

    /* renamed from: a  reason: collision with root package name */
    public ByteBuffer f43674a;

    /* renamed from: b  reason: collision with root package name */
    public final AtomicInteger f43675b = new AtomicInteger(1);

    public ByteBufNIO(ByteBuffer byteBuffer) {
        this.f43674a = byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
    }

    public double a() {
        return this.f43674a.getDouble();
    }

    public long b() {
        return this.f43674a.getLong();
    }

    public int c() {
        return this.f43674a.position();
    }

    public ByteBuf d(byte[] bArr) {
        this.f43674a.get(bArr);
        return this;
    }

    public ByteBuf e(ByteOrder byteOrder) {
        this.f43674a.order(byteOrder);
        return this;
    }

    public int f() {
        return this.f43674a.getInt();
    }

    public void g() {
        if (this.f43675b.decrementAndGet() < 0) {
            this.f43675b.incrementAndGet();
            throw new IllegalStateException("Attempted to decrement the reference count below 0");
        } else if (this.f43675b.get() == 0) {
            this.f43674a = null;
        }
    }

    public byte get() {
        return this.f43674a.get();
    }

    public int h() {
        return this.f43674a.remaining();
    }

    public ByteBuf i(int i2) {
        this.f43674a.position(i2);
        return this;
    }
}
