package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;

public class ByteBufferReadWriteBuf implements ReadWriteBuf {

    /* renamed from: a  reason: collision with root package name */
    public final ByteBuffer f21364a;

    public String a(int i2, int i3) {
        return Utf8Safe.c(this.f21364a, i2, i3);
    }

    public byte get(int i2) {
        return this.f21364a.get(i2);
    }

    public double getDouble(int i2) {
        return this.f21364a.getDouble(i2);
    }

    public float getFloat(int i2) {
        return this.f21364a.getFloat(i2);
    }

    public int getInt(int i2) {
        return this.f21364a.getInt(i2);
    }

    public long getLong(int i2) {
        return this.f21364a.getLong(i2);
    }

    public short getShort(int i2) {
        return this.f21364a.getShort(i2);
    }
}
