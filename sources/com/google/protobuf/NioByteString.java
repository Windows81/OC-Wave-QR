package com.google.protobuf;

import com.google.protobuf.ByteString;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.InvalidMarkException;
import java.nio.charset.Charset;

final class NioByteString extends ByteString.LeafByteString {
    public final ByteBuffer D;

    public NioByteString(ByteBuffer byteBuffer) {
        Internal.b(byteBuffer, "buffer");
        this.D = byteBuffer.slice().order(ByteOrder.nativeOrder());
    }

    public byte A(int i2) {
        return i(i2);
    }

    public boolean C() {
        return Utf8.s(this.D);
    }

    public CodedInputStream F() {
        return CodedInputStream.i(this.D, true);
    }

    public int H(int i2, int i3, int i4) {
        for (int i5 = i3; i5 < i3 + i4; i5++) {
            i2 = (i2 * 31) + this.D.get(i5);
        }
        return i2;
    }

    public int J(int i2, int i3, int i4) {
        return Utf8.v(i2, this.D, i3, i4 + i3);
    }

    public ByteString M(int i2, int i3) {
        try {
            return new NioByteString(d0(i2, i3));
        } catch (ArrayIndexOutOfBoundsException e2) {
            throw e2;
        } catch (IndexOutOfBoundsException e3) {
            throw new ArrayIndexOutOfBoundsException(e3.getMessage());
        }
    }

    public String S(Charset charset) {
        int i2;
        int i3;
        byte[] bArr;
        if (this.D.hasArray()) {
            bArr = this.D.array();
            i3 = this.D.arrayOffset() + this.D.position();
            i2 = this.D.remaining();
        } else {
            bArr = P();
            i2 = bArr.length;
            i3 = 0;
        }
        return new String(bArr, i3, i2, charset);
    }

    public void Z(ByteOutput byteOutput) {
        byteOutput.h(this.D.slice());
    }

    public boolean b0(ByteString byteString, int i2, int i3) {
        return M(0, i3).equals(byteString.M(i2, i3 + i2));
    }

    public final ByteBuffer d0(int i2, int i3) {
        if (i2 < this.D.position() || i3 > this.D.limit() || i2 > i3) {
            throw new IllegalArgumentException(String.format("Invalid indices [%d, %d]", new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}));
        }
        ByteBuffer slice = this.D.slice();
        slice.position(i2 - this.D.position());
        slice.limit(i3 - this.D.position());
        return slice;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ByteString)) {
            return false;
        }
        ByteString byteString = (ByteString) obj;
        if (size() != byteString.size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        return obj instanceof NioByteString ? this.D.equals(((NioByteString) obj).D) : obj instanceof RopeByteString ? obj.equals(this) : this.D.equals(byteString.g());
    }

    public ByteBuffer g() {
        return this.D.asReadOnlyBuffer();
    }

    public byte i(int i2) {
        try {
            return this.D.get(i2);
        } catch (ArrayIndexOutOfBoundsException e2) {
            throw e2;
        } catch (IndexOutOfBoundsException e3) {
            throw new ArrayIndexOutOfBoundsException(e3.getMessage());
        }
    }

    public int size() {
        return this.D.remaining();
    }

    public void w(byte[] bArr, int i2, int i3, int i4) {
        ByteBuffer slice = this.D.slice();
        slice.position(i2);
        slice.get(bArr, i3, i4);
    }

    /* renamed from: com.google.protobuf.NioByteString$1  reason: invalid class name */
    class AnonymousClass1 extends InputStream {

        /* renamed from: z  reason: collision with root package name */
        public final ByteBuffer f32255z;

        public int available() {
            return this.f32255z.remaining();
        }

        public void mark(int i2) {
            ByteBuffer byteBuffer = (ByteBuffer) this.f32255z.mark();
        }

        public boolean markSupported() {
            return true;
        }

        public int read() {
            if (!this.f32255z.hasRemaining()) {
                return -1;
            }
            return this.f32255z.get() & 255;
        }

        public void reset() {
            try {
                ByteBuffer byteBuffer = (ByteBuffer) this.f32255z.reset();
            } catch (InvalidMarkException e2) {
                throw new IOException(e2);
            }
        }

        public int read(byte[] bArr, int i2, int i3) {
            if (!this.f32255z.hasRemaining()) {
                return -1;
            }
            int min = Math.min(i3, this.f32255z.remaining());
            this.f32255z.get(bArr, i2, min);
            return min;
        }
    }
}
