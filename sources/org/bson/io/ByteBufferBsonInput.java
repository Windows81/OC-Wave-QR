package org.bson.io;

import java.nio.ByteOrder;
import java.nio.charset.Charset;
import org.bson.BsonSerializationException;
import org.bson.ByteBuf;
import org.bson.types.ObjectId;

public class ByteBufferBsonInput implements BsonInput {

    /* renamed from: B  reason: collision with root package name */
    public static final Charset f43905B = Charset.forName("UTF-8");
    public static final String[] C = new String[128];

    /* renamed from: A  reason: collision with root package name */
    public int f43906A = -1;

    /* renamed from: z  reason: collision with root package name */
    public ByteBuf f43907z;

    static {
        int i2 = 0;
        while (true) {
            String[] strArr = C;
            if (i2 < strArr.length) {
                strArr[i2] = String.valueOf((char) i2);
                i2++;
            } else {
                return;
            }
        }
    }

    public ByteBufferBsonInput(ByteBuf byteBuf) {
        if (byteBuf != null) {
            this.f43907z = byteBuf;
            byteBuf.e(ByteOrder.LITTLE_ENDIAN);
            return;
        }
        throw new IllegalArgumentException("buffer can not be null");
    }

    public void B(int i2) {
        d();
        ByteBuf byteBuf = this.f43907z;
        byteBuf.i(byteBuf.c() + i2);
    }

    public void O0() {
        d();
        g();
    }

    public final void c(int i2) {
        if (this.f43907z.h() < i2) {
            throw new BsonSerializationException(String.format("While decoding a BSON document %d bytes were required, but only %d remain", new Object[]{Integer.valueOf(i2), Integer.valueOf(this.f43907z.h())}));
        }
    }

    public void close() {
        this.f43907z.g();
        this.f43907z = null;
    }

    public final void d() {
        if (this.f43907z == null) {
            throw new IllegalStateException("Stream is closed");
        }
    }

    public BsonInputMark d1(int i2) {
        return new BsonInputMark() {

            /* renamed from: a  reason: collision with root package name */
            public int f43908a;

            {
                this.f43908a = ByteBufferBsonInput.this.f43907z.c();
            }

            public void b() {
                ByteBufferBsonInput.this.d();
                ByteBufferBsonInput.this.f43907z.i(this.f43908a);
            }
        };
    }

    public final String f(int i2) {
        if (i2 == 2) {
            byte readByte = readByte();
            if (readByte() == 0) {
                return readByte < 0 ? f43905B.newDecoder().replacement() : C[readByte];
            }
            throw new BsonSerializationException("Found a BSON string that is not null-terminated");
        }
        byte[] bArr = new byte[(i2 - 1)];
        z0(bArr);
        if (readByte() == 0) {
            return new String(bArr, f43905B);
        }
        throw new BsonSerializationException("Found a BSON string that is not null-terminated");
    }

    public final void g() {
        do {
        } while (readByte() != 0);
    }

    public int getPosition() {
        d();
        return this.f43907z.c();
    }

    public String h() {
        d();
        int i2 = i();
        if (i2 > 0) {
            return f(i2);
        }
        throw new BsonSerializationException(String.format("While decoding a BSON string found a size that is not a positive number: %d", new Object[]{Integer.valueOf(i2)}));
    }

    public int i() {
        d();
        c(4);
        return this.f43907z.f();
    }

    public String k0() {
        d();
        int c2 = this.f43907z.c();
        g();
        this.f43907z.i(c2);
        return f(this.f43907z.c() - c2);
    }

    public long n() {
        d();
        c(8);
        return this.f43907z.b();
    }

    public byte readByte() {
        d();
        c(1);
        return this.f43907z.get();
    }

    public double readDouble() {
        d();
        c(8);
        return this.f43907z.a();
    }

    public ObjectId w() {
        d();
        byte[] bArr = new byte[12];
        z0(bArr);
        return new ObjectId(bArr);
    }

    public void z0(byte[] bArr) {
        d();
        c(bArr.length);
        this.f43907z.d(bArr);
    }
}
