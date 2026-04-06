package androidx.datastore.preferences.protobuf;

import java.nio.ByteBuffer;

@CheckReturnValue
abstract class AllocatedBuffer {
    public static AllocatedBuffer i(final ByteBuffer byteBuffer) {
        Internal.b(byteBuffer, "buffer");
        return new AllocatedBuffer() {
            public byte[] a() {
                return byteBuffer.array();
            }

            public int b() {
                return byteBuffer.arrayOffset();
            }

            public boolean c() {
                return byteBuffer.hasArray();
            }

            public boolean d() {
                return true;
            }

            public int e() {
                return byteBuffer.limit();
            }

            public ByteBuffer f() {
                return byteBuffer;
            }

            public int g() {
                return byteBuffer.position();
            }

            public AllocatedBuffer h(int i2) {
                Java8Compatibility.c(byteBuffer, i2);
                return this;
            }
        };
    }

    public static AllocatedBuffer j(byte[] bArr) {
        return l(bArr, 0, bArr.length);
    }

    public static AllocatedBuffer k(byte[] bArr, int i2, int i3) {
        if (i2 >= 0 && i3 >= 0 && i2 + i3 <= bArr.length) {
            return l(bArr, i2, i3);
        }
        throw new IndexOutOfBoundsException(String.format("bytes.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i2), Integer.valueOf(i3)}));
    }

    public static AllocatedBuffer l(final byte[] bArr, final int i2, final int i3) {
        return new AllocatedBuffer() {

            /* renamed from: a  reason: collision with root package name */
            public int f20720a;

            public byte[] a() {
                return bArr;
            }

            public int b() {
                return i2;
            }

            public boolean c() {
                return true;
            }

            public boolean d() {
                return false;
            }

            public int e() {
                return i3;
            }

            public ByteBuffer f() {
                throw new UnsupportedOperationException();
            }

            public int g() {
                return this.f20720a;
            }

            public AllocatedBuffer h(int i2) {
                if (i2 < 0 || i2 > i3) {
                    throw new IllegalArgumentException("Invalid position: " + i2);
                }
                this.f20720a = i2;
                return this;
            }
        };
    }

    public abstract byte[] a();

    public abstract int b();

    public abstract boolean c();

    public abstract boolean d();

    public abstract int e();

    public abstract ByteBuffer f();

    public abstract int g();

    public abstract AllocatedBuffer h(int i2);
}
