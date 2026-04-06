package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.Utf8;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class CodedOutputStream extends ByteOutput {

    /* renamed from: c  reason: collision with root package name */
    public static final Logger f20840c = Logger.getLogger(CodedOutputStream.class.getName());

    /* renamed from: d  reason: collision with root package name */
    public static final boolean f20841d = UnsafeUtil.J();

    /* renamed from: a  reason: collision with root package name */
    public CodedOutputStreamWriter f20842a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f20843b;

    public static abstract class AbstractBufferedEncoder extends CodedOutputStream {

        /* renamed from: e  reason: collision with root package name */
        public final byte[] f20844e;

        /* renamed from: f  reason: collision with root package name */
        public final int f20845f;

        /* renamed from: g  reason: collision with root package name */
        public int f20846g;

        /* renamed from: h  reason: collision with root package name */
        public int f20847h;

        public AbstractBufferedEncoder(int i2) {
            super();
            if (i2 >= 0) {
                byte[] bArr = new byte[Math.max(i2, 20)];
                this.f20844e = bArr;
                this.f20845f = bArr.length;
                return;
            }
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }

        public final void D1(byte b2) {
            byte[] bArr = this.f20844e;
            int i2 = this.f20846g;
            this.f20846g = i2 + 1;
            bArr[i2] = b2;
            this.f20847h++;
        }

        public final void E1(int i2) {
            byte[] bArr = this.f20844e;
            int i3 = this.f20846g;
            int i4 = i3 + 1;
            this.f20846g = i4;
            bArr[i3] = (byte) (i2 & 255);
            int i5 = i3 + 2;
            this.f20846g = i5;
            bArr[i4] = (byte) ((i2 >> 8) & 255);
            int i6 = i3 + 3;
            this.f20846g = i6;
            bArr[i5] = (byte) ((i2 >> 16) & 255);
            this.f20846g = i3 + 4;
            bArr[i6] = (byte) ((i2 >> 24) & 255);
            this.f20847h += 4;
        }

        public final void F1(long j2) {
            byte[] bArr = this.f20844e;
            int i2 = this.f20846g;
            int i3 = i2 + 1;
            this.f20846g = i3;
            bArr[i2] = (byte) ((int) (j2 & 255));
            int i4 = i2 + 2;
            this.f20846g = i4;
            bArr[i3] = (byte) ((int) ((j2 >> 8) & 255));
            int i5 = i2 + 3;
            this.f20846g = i5;
            bArr[i4] = (byte) ((int) ((j2 >> 16) & 255));
            int i6 = i2 + 4;
            this.f20846g = i6;
            bArr[i5] = (byte) ((int) (255 & (j2 >> 24)));
            int i7 = i2 + 5;
            this.f20846g = i7;
            bArr[i6] = (byte) (((int) (j2 >> 32)) & 255);
            int i8 = i2 + 6;
            this.f20846g = i8;
            bArr[i7] = (byte) (((int) (j2 >> 40)) & 255);
            int i9 = i2 + 7;
            this.f20846g = i9;
            bArr[i8] = (byte) (((int) (j2 >> 48)) & 255);
            this.f20846g = i2 + 8;
            bArr[i9] = (byte) (((int) (j2 >> 56)) & 255);
            this.f20847h += 8;
        }

        public final void G1(int i2) {
            if (i2 >= 0) {
                I1(i2);
            } else {
                J1((long) i2);
            }
        }

        public final void H1(int i2, int i3) {
            I1(WireFormat.c(i2, i3));
        }

        public final void I1(int i2) {
            if (CodedOutputStream.f20841d) {
                long j2 = (long) this.f20846g;
                while ((i2 & -128) != 0) {
                    byte[] bArr = this.f20844e;
                    int i3 = this.f20846g;
                    this.f20846g = i3 + 1;
                    UnsafeUtil.R(bArr, (long) i3, (byte) ((i2 | 128) & 255));
                    i2 >>>= 7;
                }
                byte[] bArr2 = this.f20844e;
                int i4 = this.f20846g;
                this.f20846g = i4 + 1;
                UnsafeUtil.R(bArr2, (long) i4, (byte) i2);
                this.f20847h += (int) (((long) this.f20846g) - j2);
                return;
            }
            while ((i2 & -128) != 0) {
                byte[] bArr3 = this.f20844e;
                int i5 = this.f20846g;
                this.f20846g = i5 + 1;
                bArr3[i5] = (byte) ((i2 | 128) & 255);
                this.f20847h++;
                i2 >>>= 7;
            }
            byte[] bArr4 = this.f20844e;
            int i6 = this.f20846g;
            this.f20846g = i6 + 1;
            bArr4[i6] = (byte) i2;
            this.f20847h++;
        }

        public final void J1(long j2) {
            if (CodedOutputStream.f20841d) {
                long j3 = (long) this.f20846g;
                while ((j2 & -128) != 0) {
                    byte[] bArr = this.f20844e;
                    int i2 = this.f20846g;
                    this.f20846g = i2 + 1;
                    UnsafeUtil.R(bArr, (long) i2, (byte) ((((int) j2) | 128) & 255));
                    j2 >>>= 7;
                }
                byte[] bArr2 = this.f20844e;
                int i3 = this.f20846g;
                this.f20846g = i3 + 1;
                UnsafeUtil.R(bArr2, (long) i3, (byte) ((int) j2));
                this.f20847h += (int) (((long) this.f20846g) - j3);
                return;
            }
            while ((j2 & -128) != 0) {
                byte[] bArr3 = this.f20844e;
                int i4 = this.f20846g;
                this.f20846g = i4 + 1;
                bArr3[i4] = (byte) ((((int) j2) | 128) & 255);
                this.f20847h++;
                j2 >>>= 7;
            }
            byte[] bArr4 = this.f20844e;
            int i5 = this.f20846g;
            this.f20846g = i5 + 1;
            bArr4[i5] = (byte) ((int) j2);
            this.f20847h++;
        }

        public final int Z0() {
            throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
        }
    }

    public static class ArrayEncoder extends CodedOutputStream {

        /* renamed from: e  reason: collision with root package name */
        public final byte[] f20848e;

        /* renamed from: f  reason: collision with root package name */
        public final int f20849f;

        /* renamed from: g  reason: collision with root package name */
        public final int f20850g;

        /* renamed from: h  reason: collision with root package name */
        public int f20851h;

        public ArrayEncoder(byte[] bArr, int i2, int i3) {
            super();
            if (bArr != null) {
                int i4 = i2 + i3;
                if ((i2 | i3 | (bArr.length - i4)) >= 0) {
                    this.f20848e = bArr;
                    this.f20849f = i2;
                    this.f20851h = i2;
                    this.f20850g = i4;
                    return;
                }
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i2), Integer.valueOf(i3)}));
            }
            throw new NullPointerException("buffer");
        }

        public final void A(int i2, long j2) {
            A1(i2, 0);
            C1(j2);
        }

        public final void A1(int i2, int i3) {
            B1(WireFormat.c(i2, i3));
        }

        public final void B1(int i2) {
            while ((i2 & -128) != 0) {
                byte[] bArr = this.f20848e;
                int i3 = this.f20851h;
                this.f20851h = i3 + 1;
                bArr[i3] = (byte) ((i2 | 128) & 255);
                i2 >>>= 7;
            }
            try {
                byte[] bArr2 = this.f20848e;
                int i4 = this.f20851h;
                this.f20851h = i4 + 1;
                bArr2[i4] = (byte) i2;
            } catch (IndexOutOfBoundsException e2) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f20851h), Integer.valueOf(this.f20850g), 1}), e2);
            }
        }

        public final void C1(long j2) {
            if (!CodedOutputStream.f20841d || Z0() < 10) {
                while ((j2 & -128) != 0) {
                    byte[] bArr = this.f20848e;
                    int i2 = this.f20851h;
                    this.f20851h = i2 + 1;
                    bArr[i2] = (byte) ((((int) j2) | 128) & 255);
                    j2 >>>= 7;
                }
                try {
                    byte[] bArr2 = this.f20848e;
                    int i3 = this.f20851h;
                    this.f20851h = i3 + 1;
                    bArr2[i3] = (byte) ((int) j2);
                } catch (IndexOutOfBoundsException e2) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f20851h), Integer.valueOf(this.f20850g), 1}), e2);
                }
            } else {
                while ((j2 & -128) != 0) {
                    byte[] bArr3 = this.f20848e;
                    int i4 = this.f20851h;
                    this.f20851h = i4 + 1;
                    UnsafeUtil.R(bArr3, (long) i4, (byte) ((((int) j2) | 128) & 255));
                    j2 >>>= 7;
                }
                byte[] bArr4 = this.f20848e;
                int i5 = this.f20851h;
                this.f20851h = i5 + 1;
                UnsafeUtil.R(bArr4, (long) i5, (byte) ((int) j2));
            }
        }

        public final int D1() {
            return this.f20851h - this.f20849f;
        }

        public final void E(int i2, boolean z2) {
            A1(i2, 0);
            a1(z2 ? (byte) 1 : 0);
        }

        public final void E1(ByteBuffer byteBuffer) {
            int remaining = byteBuffer.remaining();
            try {
                byteBuffer.get(this.f20848e, this.f20851h, remaining);
                this.f20851h += remaining;
            } catch (IndexOutOfBoundsException e2) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f20851h), Integer.valueOf(this.f20850g), Integer.valueOf(remaining)}), e2);
            }
        }

        public void T0() {
        }

        public final int Z0() {
            return this.f20850g - this.f20851h;
        }

        public final void a(byte[] bArr, int i2, int i3) {
            try {
                System.arraycopy(bArr, i2, this.f20848e, this.f20851h, i3);
                this.f20851h += i3;
            } catch (IndexOutOfBoundsException e2) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f20851h), Integer.valueOf(this.f20850g), Integer.valueOf(i3)}), e2);
            }
        }

        public final void a0(int i2, ByteString byteString) {
            A1(i2, 2);
            e1(byteString);
        }

        public final void a1(byte b2) {
            try {
                byte[] bArr = this.f20848e;
                int i2 = this.f20851h;
                this.f20851h = i2 + 1;
                bArr[i2] = b2;
            } catch (IndexOutOfBoundsException e2) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f20851h), Integer.valueOf(this.f20850g), 1}), e2);
            }
        }

        public final void b(ByteBuffer byteBuffer) {
            E1(byteBuffer);
        }

        public final void c(byte[] bArr, int i2, int i3) {
            a(bArr, i2, i3);
        }

        public final void d1(byte[] bArr, int i2, int i3) {
            B1(i3);
            a(bArr, i2, i3);
        }

        public final void e1(ByteString byteString) {
            B1(byteString.size());
            byteString.Z(this);
        }

        public final void h1(int i2) {
            try {
                byte[] bArr = this.f20848e;
                int i3 = this.f20851h;
                int i4 = i3 + 1;
                this.f20851h = i4;
                bArr[i3] = (byte) (i2 & 255);
                int i5 = i3 + 2;
                this.f20851h = i5;
                bArr[i4] = (byte) ((i2 >> 8) & 255);
                int i6 = i3 + 3;
                this.f20851h = i6;
                bArr[i5] = (byte) ((i2 >> 16) & 255);
                this.f20851h = i3 + 4;
                bArr[i6] = (byte) ((i2 >> 24) & 255);
            } catch (IndexOutOfBoundsException e2) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f20851h), Integer.valueOf(this.f20850g), 1}), e2);
            }
        }

        public final void i1(long j2) {
            try {
                byte[] bArr = this.f20848e;
                int i2 = this.f20851h;
                int i3 = i2 + 1;
                this.f20851h = i3;
                bArr[i2] = (byte) (((int) j2) & 255);
                int i4 = i2 + 2;
                this.f20851h = i4;
                bArr[i3] = (byte) (((int) (j2 >> 8)) & 255);
                int i5 = i2 + 3;
                this.f20851h = i5;
                bArr[i4] = (byte) (((int) (j2 >> 16)) & 255);
                int i6 = i2 + 4;
                this.f20851h = i6;
                bArr[i5] = (byte) (((int) (j2 >> 24)) & 255);
                int i7 = i2 + 5;
                this.f20851h = i7;
                bArr[i6] = (byte) (((int) (j2 >> 32)) & 255);
                int i8 = i2 + 6;
                this.f20851h = i8;
                bArr[i7] = (byte) (((int) (j2 >> 40)) & 255);
                int i9 = i2 + 7;
                this.f20851h = i9;
                bArr[i8] = (byte) (((int) (j2 >> 48)) & 255);
                this.f20851h = i2 + 8;
                bArr[i9] = (byte) (((int) (j2 >> 56)) & 255);
            } catch (IndexOutOfBoundsException e2) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f20851h), Integer.valueOf(this.f20850g), 1}), e2);
            }
        }

        public final void o(int i2, int i3) {
            A1(i2, 0);
            o1(i3);
        }

        public final void o1(int i2) {
            if (i2 >= 0) {
                B1(i2);
            } else {
                C1((long) i2);
            }
        }

        public final void q(int i2, int i3) {
            A1(i2, 0);
            B1(i3);
        }

        public final void q1(int i2, MessageLite messageLite) {
            A1(i2, 2);
            s1(messageLite);
        }

        public final void r1(int i2, MessageLite messageLite, Schema schema) {
            A1(i2, 2);
            B1(((AbstractMessageLite) messageLite).l(schema));
            schema.i(messageLite, this.f20842a);
        }

        public final void s(int i2, int i3) {
            A1(i2, 5);
            h1(i3);
        }

        public final void s1(MessageLite messageLite) {
            B1(messageLite.g());
            messageLite.j(this);
        }

        public final void t1(int i2, MessageLite messageLite) {
            A1(1, 3);
            q(2, i2);
            q1(3, messageLite);
            A1(1, 4);
        }

        public final void u1(int i2, ByteString byteString) {
            A1(1, 3);
            q(2, i2);
            a0(3, byteString);
            A1(1, 4);
        }

        public final void w(int i2, long j2) {
            A1(i2, 1);
            i1(j2);
        }

        public final void z(int i2, String str) {
            A1(i2, 2);
            z1(str);
        }

        public final void z1(String str) {
            int i2 = this.f20851h;
            try {
                int O0 = CodedOutputStream.O0(str.length() * 3);
                int O02 = CodedOutputStream.O0(str.length());
                if (O02 == O0) {
                    int i3 = i2 + O02;
                    this.f20851h = i3;
                    int i4 = Utf8.i(str, this.f20848e, i3, Z0());
                    this.f20851h = i2;
                    B1((i4 - i2) - O02);
                    this.f20851h = i4;
                    return;
                }
                B1(Utf8.k(str));
                this.f20851h = Utf8.i(str, this.f20848e, this.f20851h, Z0());
            } catch (Utf8.UnpairedSurrogateException e2) {
                this.f20851h = i2;
                U0(str, e2);
            } catch (IndexOutOfBoundsException e3) {
                throw new OutOfSpaceException((Throwable) e3);
            }
        }
    }

    public static final class ByteOutputEncoder extends AbstractBufferedEncoder {

        /* renamed from: i  reason: collision with root package name */
        public final ByteOutput f20852i;

        public void A(int i2, long j2) {
            L1(20);
            H1(i2, 0);
            J1(j2);
        }

        public void A1(int i2, int i3) {
            B1(WireFormat.c(i2, i3));
        }

        public void B1(int i2) {
            L1(5);
            I1(i2);
        }

        public void C1(long j2) {
            L1(10);
            J1(j2);
        }

        public void E(int i2, boolean z2) {
            L1(11);
            H1(i2, 0);
            D1(z2 ? (byte) 1 : 0);
        }

        public final void K1() {
            this.f20852i.a(this.f20844e, 0, this.f20846g);
            this.f20846g = 0;
        }

        public final void L1(int i2) {
            if (this.f20845f - this.f20846g < i2) {
                K1();
            }
        }

        public void M1(MessageLite messageLite, Schema schema) {
            B1(((AbstractMessageLite) messageLite).l(schema));
            schema.i(messageLite, this.f20842a);
        }

        public void T0() {
            if (this.f20846g > 0) {
                K1();
            }
        }

        public void a(byte[] bArr, int i2, int i3) {
            T0();
            this.f20852i.a(bArr, i2, i3);
            this.f20847h += i3;
        }

        public void a0(int i2, ByteString byteString) {
            A1(i2, 2);
            e1(byteString);
        }

        public void a1(byte b2) {
            if (this.f20846g == this.f20845f) {
                K1();
            }
            D1(b2);
        }

        public void b(ByteBuffer byteBuffer) {
            T0();
            int remaining = byteBuffer.remaining();
            this.f20852i.b(byteBuffer);
            this.f20847h += remaining;
        }

        public void c(byte[] bArr, int i2, int i3) {
            T0();
            this.f20852i.c(bArr, i2, i3);
            this.f20847h += i3;
        }

        public void d1(byte[] bArr, int i2, int i3) {
            B1(i3);
            a(bArr, i2, i3);
        }

        public void e1(ByteString byteString) {
            B1(byteString.size());
            byteString.Z(this);
        }

        public void h1(int i2) {
            L1(4);
            E1(i2);
        }

        public void i1(long j2) {
            L1(8);
            F1(j2);
        }

        public void o(int i2, int i3) {
            L1(20);
            H1(i2, 0);
            G1(i3);
        }

        public void o1(int i2) {
            if (i2 >= 0) {
                B1(i2);
            } else {
                C1((long) i2);
            }
        }

        public void q(int i2, int i3) {
            L1(20);
            H1(i2, 0);
            I1(i3);
        }

        public void q1(int i2, MessageLite messageLite) {
            A1(i2, 2);
            s1(messageLite);
        }

        public void r1(int i2, MessageLite messageLite, Schema schema) {
            A1(i2, 2);
            M1(messageLite, schema);
        }

        public void s(int i2, int i3) {
            L1(14);
            H1(i2, 5);
            E1(i3);
        }

        public void s1(MessageLite messageLite) {
            B1(messageLite.g());
            messageLite.j(this);
        }

        public void t1(int i2, MessageLite messageLite) {
            A1(1, 3);
            q(2, i2);
            q1(3, messageLite);
            A1(1, 4);
        }

        public void u1(int i2, ByteString byteString) {
            A1(1, 3);
            q(2, i2);
            a0(3, byteString);
            A1(1, 4);
        }

        public void w(int i2, long j2) {
            L1(18);
            H1(i2, 1);
            F1(j2);
        }

        public void z(int i2, String str) {
            A1(i2, 2);
            z1(str);
        }

        public void z1(String str) {
            int length = str.length() * 3;
            int O0 = CodedOutputStream.O0(length);
            int i2 = O0 + length;
            int i3 = this.f20845f;
            if (i2 > i3) {
                byte[] bArr = new byte[length];
                int i4 = Utf8.i(str, bArr, 0, length);
                B1(i4);
                c(bArr, 0, i4);
                return;
            }
            if (i2 > i3 - this.f20846g) {
                K1();
            }
            int i5 = this.f20846g;
            try {
                int O02 = CodedOutputStream.O0(str.length());
                if (O02 == O0) {
                    int i6 = i5 + O02;
                    this.f20846g = i6;
                    int i7 = Utf8.i(str, this.f20844e, i6, this.f20845f - i6);
                    this.f20846g = i5;
                    int i8 = (i7 - i5) - O02;
                    I1(i8);
                    this.f20846g = i7;
                    this.f20847h += i8;
                    return;
                }
                int k2 = Utf8.k(str);
                I1(k2);
                this.f20846g = Utf8.i(str, this.f20844e, this.f20846g, k2);
                this.f20847h += k2;
            } catch (Utf8.UnpairedSurrogateException e2) {
                this.f20847h -= this.f20846g - i5;
                this.f20846g = i5;
                U0(str, e2);
            } catch (IndexOutOfBoundsException e3) {
                throw new OutOfSpaceException((Throwable) e3);
            }
        }
    }

    public static final class HeapNioEncoder extends ArrayEncoder {

        /* renamed from: i  reason: collision with root package name */
        public final ByteBuffer f20853i;

        /* renamed from: j  reason: collision with root package name */
        public int f20854j;

        public void T0() {
            Java8Compatibility.c(this.f20853i, this.f20854j + D1());
        }
    }

    public static class OutOfSpaceException extends IOException {
        public OutOfSpaceException(String str) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + str);
        }

        public OutOfSpaceException(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }

        public OutOfSpaceException(String str, Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + str, th);
        }
    }

    public static final class OutputStreamEncoder extends AbstractBufferedEncoder {

        /* renamed from: i  reason: collision with root package name */
        public final OutputStream f20855i;

        public OutputStreamEncoder(OutputStream outputStream, int i2) {
            super(i2);
            if (outputStream != null) {
                this.f20855i = outputStream;
                return;
            }
            throw new NullPointerException("out");
        }

        private void K1() {
            this.f20855i.write(this.f20844e, 0, this.f20846g);
            this.f20846g = 0;
        }

        private void L1(int i2) {
            if (this.f20845f - this.f20846g < i2) {
                K1();
            }
        }

        public void A(int i2, long j2) {
            L1(20);
            H1(i2, 0);
            J1(j2);
        }

        public void A1(int i2, int i3) {
            B1(WireFormat.c(i2, i3));
        }

        public void B1(int i2) {
            L1(5);
            I1(i2);
        }

        public void C1(long j2) {
            L1(10);
            J1(j2);
        }

        public void E(int i2, boolean z2) {
            L1(11);
            H1(i2, 0);
            D1(z2 ? (byte) 1 : 0);
        }

        public void M1(ByteBuffer byteBuffer) {
            int remaining = byteBuffer.remaining();
            int i2 = this.f20845f;
            int i3 = this.f20846g;
            if (i2 - i3 >= remaining) {
                byteBuffer.get(this.f20844e, i3, remaining);
                this.f20846g += remaining;
                this.f20847h += remaining;
                return;
            }
            int i4 = i2 - i3;
            byteBuffer.get(this.f20844e, i3, i4);
            int i5 = remaining - i4;
            this.f20846g = this.f20845f;
            this.f20847h += i4;
            K1();
            while (true) {
                int i6 = this.f20845f;
                if (i5 > i6) {
                    byteBuffer.get(this.f20844e, 0, i6);
                    this.f20855i.write(this.f20844e, 0, this.f20845f);
                    int i7 = this.f20845f;
                    i5 -= i7;
                    this.f20847h += i7;
                } else {
                    byteBuffer.get(this.f20844e, 0, i5);
                    this.f20846g = i5;
                    this.f20847h += i5;
                    return;
                }
            }
        }

        public void N1(MessageLite messageLite, Schema schema) {
            B1(((AbstractMessageLite) messageLite).l(schema));
            schema.i(messageLite, this.f20842a);
        }

        public void T0() {
            if (this.f20846g > 0) {
                K1();
            }
        }

        public void a(byte[] bArr, int i2, int i3) {
            int i4 = this.f20845f;
            int i5 = this.f20846g;
            if (i4 - i5 >= i3) {
                System.arraycopy(bArr, i2, this.f20844e, i5, i3);
                this.f20846g += i3;
                this.f20847h += i3;
                return;
            }
            int i6 = i4 - i5;
            System.arraycopy(bArr, i2, this.f20844e, i5, i6);
            int i7 = i2 + i6;
            int i8 = i3 - i6;
            this.f20846g = this.f20845f;
            this.f20847h += i6;
            K1();
            if (i8 <= this.f20845f) {
                System.arraycopy(bArr, i7, this.f20844e, 0, i8);
                this.f20846g = i8;
            } else {
                this.f20855i.write(bArr, i7, i8);
            }
            this.f20847h += i8;
        }

        public void a0(int i2, ByteString byteString) {
            A1(i2, 2);
            e1(byteString);
        }

        public void a1(byte b2) {
            if (this.f20846g == this.f20845f) {
                K1();
            }
            D1(b2);
        }

        public void b(ByteBuffer byteBuffer) {
            M1(byteBuffer);
        }

        public void c(byte[] bArr, int i2, int i3) {
            a(bArr, i2, i3);
        }

        public void d1(byte[] bArr, int i2, int i3) {
            B1(i3);
            a(bArr, i2, i3);
        }

        public void e1(ByteString byteString) {
            B1(byteString.size());
            byteString.Z(this);
        }

        public void h1(int i2) {
            L1(4);
            E1(i2);
        }

        public void i1(long j2) {
            L1(8);
            F1(j2);
        }

        public void o(int i2, int i3) {
            L1(20);
            H1(i2, 0);
            G1(i3);
        }

        public void o1(int i2) {
            if (i2 >= 0) {
                B1(i2);
            } else {
                C1((long) i2);
            }
        }

        public void q(int i2, int i3) {
            L1(20);
            H1(i2, 0);
            I1(i3);
        }

        public void q1(int i2, MessageLite messageLite) {
            A1(i2, 2);
            s1(messageLite);
        }

        public void r1(int i2, MessageLite messageLite, Schema schema) {
            A1(i2, 2);
            N1(messageLite, schema);
        }

        public void s(int i2, int i3) {
            L1(14);
            H1(i2, 5);
            E1(i3);
        }

        public void s1(MessageLite messageLite) {
            B1(messageLite.g());
            messageLite.j(this);
        }

        public void t1(int i2, MessageLite messageLite) {
            A1(1, 3);
            q(2, i2);
            q1(3, messageLite);
            A1(1, 4);
        }

        public void u1(int i2, ByteString byteString) {
            A1(1, 3);
            q(2, i2);
            a0(3, byteString);
            A1(1, 4);
        }

        public void w(int i2, long j2) {
            L1(18);
            H1(i2, 1);
            F1(j2);
        }

        public void z(int i2, String str) {
            A1(i2, 2);
            z1(str);
        }

        public void z1(String str) {
            int i2;
            int i3;
            try {
                int length = str.length() * 3;
                int O0 = CodedOutputStream.O0(length);
                int i4 = O0 + length;
                int i5 = this.f20845f;
                if (i4 > i5) {
                    byte[] bArr = new byte[length];
                    int i6 = Utf8.i(str, bArr, 0, length);
                    B1(i6);
                    c(bArr, 0, i6);
                    return;
                }
                if (i4 > i5 - this.f20846g) {
                    K1();
                }
                int O02 = CodedOutputStream.O0(str.length());
                i2 = this.f20846g;
                if (O02 == O0) {
                    int i7 = i2 + O02;
                    this.f20846g = i7;
                    int i8 = Utf8.i(str, this.f20844e, i7, this.f20845f - i7);
                    this.f20846g = i2;
                    i3 = (i8 - i2) - O02;
                    I1(i3);
                    this.f20846g = i8;
                } else {
                    i3 = Utf8.k(str);
                    I1(i3);
                    this.f20846g = Utf8.i(str, this.f20844e, this.f20846g, i3);
                }
                this.f20847h += i3;
            } catch (Utf8.UnpairedSurrogateException e2) {
                this.f20847h -= this.f20846g - i2;
                this.f20846g = i2;
                throw e2;
            } catch (ArrayIndexOutOfBoundsException e3) {
                throw new OutOfSpaceException((Throwable) e3);
            } catch (Utf8.UnpairedSurrogateException e4) {
                U0(str, e4);
            }
        }
    }

    public static final class SafeDirectNioEncoder extends CodedOutputStream {

        /* renamed from: e  reason: collision with root package name */
        public final ByteBuffer f20856e;

        /* renamed from: f  reason: collision with root package name */
        public final ByteBuffer f20857f;

        public void A(int i2, long j2) {
            A1(i2, 0);
            C1(j2);
        }

        public void A1(int i2, int i3) {
            B1(WireFormat.c(i2, i3));
        }

        public void B1(int i2) {
            while ((i2 & -128) != 0) {
                this.f20857f.put((byte) ((i2 | 128) & 255));
                i2 >>>= 7;
            }
            try {
                this.f20857f.put((byte) i2);
            } catch (BufferOverflowException e2) {
                throw new OutOfSpaceException((Throwable) e2);
            }
        }

        public void C1(long j2) {
            while ((-128 & j2) != 0) {
                this.f20857f.put((byte) ((((int) j2) | 128) & 255));
                j2 >>>= 7;
            }
            try {
                this.f20857f.put((byte) ((int) j2));
            } catch (BufferOverflowException e2) {
                throw new OutOfSpaceException((Throwable) e2);
            }
        }

        public final void D1(String str) {
            try {
                Utf8.j(str, this.f20857f);
            } catch (IndexOutOfBoundsException e2) {
                throw new OutOfSpaceException((Throwable) e2);
            }
        }

        public void E(int i2, boolean z2) {
            A1(i2, 0);
            a1(z2 ? (byte) 1 : 0);
        }

        public void E1(ByteBuffer byteBuffer) {
            try {
                this.f20857f.put(byteBuffer);
            } catch (BufferOverflowException e2) {
                throw new OutOfSpaceException((Throwable) e2);
            }
        }

        public void F1(MessageLite messageLite, Schema schema) {
            B1(((AbstractMessageLite) messageLite).l(schema));
            schema.i(messageLite, this.f20842a);
        }

        public void T0() {
            Java8Compatibility.c(this.f20856e, this.f20857f.position());
        }

        public int Z0() {
            return this.f20857f.remaining();
        }

        public void a(byte[] bArr, int i2, int i3) {
            try {
                this.f20857f.put(bArr, i2, i3);
            } catch (IndexOutOfBoundsException e2) {
                throw new OutOfSpaceException((Throwable) e2);
            } catch (BufferOverflowException e3) {
                throw new OutOfSpaceException((Throwable) e3);
            }
        }

        public void a0(int i2, ByteString byteString) {
            A1(i2, 2);
            e1(byteString);
        }

        public void a1(byte b2) {
            try {
                this.f20857f.put(b2);
            } catch (BufferOverflowException e2) {
                throw new OutOfSpaceException((Throwable) e2);
            }
        }

        public void b(ByteBuffer byteBuffer) {
            E1(byteBuffer);
        }

        public void c(byte[] bArr, int i2, int i3) {
            a(bArr, i2, i3);
        }

        public void d1(byte[] bArr, int i2, int i3) {
            B1(i3);
            a(bArr, i2, i3);
        }

        public void e1(ByteString byteString) {
            B1(byteString.size());
            byteString.Z(this);
        }

        public void h1(int i2) {
            try {
                this.f20857f.putInt(i2);
            } catch (BufferOverflowException e2) {
                throw new OutOfSpaceException((Throwable) e2);
            }
        }

        public void i1(long j2) {
            try {
                this.f20857f.putLong(j2);
            } catch (BufferOverflowException e2) {
                throw new OutOfSpaceException((Throwable) e2);
            }
        }

        public void o(int i2, int i3) {
            A1(i2, 0);
            o1(i3);
        }

        public void o1(int i2) {
            if (i2 >= 0) {
                B1(i2);
            } else {
                C1((long) i2);
            }
        }

        public void q(int i2, int i3) {
            A1(i2, 0);
            B1(i3);
        }

        public void q1(int i2, MessageLite messageLite) {
            A1(i2, 2);
            s1(messageLite);
        }

        public void r1(int i2, MessageLite messageLite, Schema schema) {
            A1(i2, 2);
            F1(messageLite, schema);
        }

        public void s(int i2, int i3) {
            A1(i2, 5);
            h1(i3);
        }

        public void s1(MessageLite messageLite) {
            B1(messageLite.g());
            messageLite.j(this);
        }

        public void t1(int i2, MessageLite messageLite) {
            A1(1, 3);
            q(2, i2);
            q1(3, messageLite);
            A1(1, 4);
        }

        public void u1(int i2, ByteString byteString) {
            A1(1, 3);
            q(2, i2);
            a0(3, byteString);
            A1(1, 4);
        }

        public void w(int i2, long j2) {
            A1(i2, 1);
            i1(j2);
        }

        public void z(int i2, String str) {
            A1(i2, 2);
            z1(str);
        }

        public void z1(String str) {
            int position = this.f20857f.position();
            try {
                int O0 = CodedOutputStream.O0(str.length() * 3);
                int O02 = CodedOutputStream.O0(str.length());
                if (O02 == O0) {
                    int position2 = this.f20857f.position() + O02;
                    Java8Compatibility.c(this.f20857f, position2);
                    D1(str);
                    int position3 = this.f20857f.position();
                    Java8Compatibility.c(this.f20857f, position);
                    B1(position3 - position2);
                    Java8Compatibility.c(this.f20857f, position3);
                    return;
                }
                B1(Utf8.k(str));
                D1(str);
            } catch (Utf8.UnpairedSurrogateException e2) {
                Java8Compatibility.c(this.f20857f, position);
                U0(str, e2);
            } catch (IllegalArgumentException e3) {
                throw new OutOfSpaceException((Throwable) e3);
            }
        }
    }

    public static final class UnsafeDirectNioEncoder extends CodedOutputStream {

        /* renamed from: e  reason: collision with root package name */
        public final ByteBuffer f20858e;

        /* renamed from: f  reason: collision with root package name */
        public final ByteBuffer f20859f;

        /* renamed from: g  reason: collision with root package name */
        public final long f20860g;

        /* renamed from: h  reason: collision with root package name */
        public final long f20861h;

        /* renamed from: i  reason: collision with root package name */
        public final long f20862i;

        /* renamed from: j  reason: collision with root package name */
        public long f20863j;

        public void A(int i2, long j2) {
            A1(i2, 0);
            C1(j2);
        }

        public void A1(int i2, int i3) {
            B1(WireFormat.c(i2, i3));
        }

        public void B1(int i2) {
            if (this.f20863j <= this.f20862i) {
                while ((i2 & -128) != 0) {
                    long j2 = this.f20863j;
                    this.f20863j = j2 + 1;
                    UnsafeUtil.Q(j2, (byte) ((i2 | 128) & 255));
                    i2 >>>= 7;
                }
                long j3 = this.f20863j;
                this.f20863j = 1 + j3;
                UnsafeUtil.Q(j3, (byte) i2);
                return;
            }
            while (true) {
                long j4 = this.f20863j;
                if (j4 >= this.f20861h) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Long.valueOf(this.f20863j), Long.valueOf(this.f20861h), 1}));
                } else if ((i2 & -128) == 0) {
                    this.f20863j = 1 + j4;
                    UnsafeUtil.Q(j4, (byte) i2);
                    return;
                } else {
                    this.f20863j = j4 + 1;
                    UnsafeUtil.Q(j4, (byte) ((i2 | 128) & 255));
                    i2 >>>= 7;
                }
            }
        }

        public void C1(long j2) {
            if (this.f20863j <= this.f20862i) {
                while ((j2 & -128) != 0) {
                    long j3 = this.f20863j;
                    this.f20863j = j3 + 1;
                    UnsafeUtil.Q(j3, (byte) ((((int) j2) | 128) & 255));
                    j2 >>>= 7;
                }
                long j4 = this.f20863j;
                this.f20863j = 1 + j4;
                UnsafeUtil.Q(j4, (byte) ((int) j2));
                return;
            }
            while (true) {
                long j5 = this.f20863j;
                if (j5 >= this.f20861h) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Long.valueOf(this.f20863j), Long.valueOf(this.f20861h), 1}));
                } else if ((j2 & -128) == 0) {
                    this.f20863j = 1 + j5;
                    UnsafeUtil.Q(j5, (byte) ((int) j2));
                    return;
                } else {
                    this.f20863j = j5 + 1;
                    UnsafeUtil.Q(j5, (byte) ((((int) j2) | 128) & 255));
                    j2 >>>= 7;
                }
            }
        }

        public final int D1(long j2) {
            return (int) (j2 - this.f20860g);
        }

        public void E(int i2, boolean z2) {
            A1(i2, 0);
            a1(z2 ? (byte) 1 : 0);
        }

        public final void E1(long j2) {
            Java8Compatibility.c(this.f20859f, D1(j2));
        }

        public void F1(ByteBuffer byteBuffer) {
            try {
                int remaining = byteBuffer.remaining();
                E1(this.f20863j);
                this.f20859f.put(byteBuffer);
                this.f20863j += (long) remaining;
            } catch (BufferOverflowException e2) {
                throw new OutOfSpaceException((Throwable) e2);
            }
        }

        public void G1(MessageLite messageLite, Schema schema) {
            B1(((AbstractMessageLite) messageLite).l(schema));
            schema.i(messageLite, this.f20842a);
        }

        public void T0() {
            Java8Compatibility.c(this.f20858e, D1(this.f20863j));
        }

        public int Z0() {
            return (int) (this.f20861h - this.f20863j);
        }

        public void a(byte[] bArr, int i2, int i3) {
            if (bArr != null && i2 >= 0 && i3 >= 0 && bArr.length - i3 >= i2) {
                long j2 = (long) i3;
                long j3 = this.f20863j;
                if (this.f20861h - j2 >= j3) {
                    UnsafeUtil.q(bArr, (long) i2, j3, j2);
                    this.f20863j += j2;
                    return;
                }
            }
            if (bArr == null) {
                throw new NullPointerException("value");
            }
            throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Long.valueOf(this.f20863j), Long.valueOf(this.f20861h), Integer.valueOf(i3)}));
        }

        public void a0(int i2, ByteString byteString) {
            A1(i2, 2);
            e1(byteString);
        }

        public void a1(byte b2) {
            long j2 = this.f20863j;
            if (j2 < this.f20861h) {
                this.f20863j = 1 + j2;
                UnsafeUtil.Q(j2, b2);
                return;
            }
            throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Long.valueOf(this.f20863j), Long.valueOf(this.f20861h), 1}));
        }

        public void b(ByteBuffer byteBuffer) {
            F1(byteBuffer);
        }

        public void c(byte[] bArr, int i2, int i3) {
            a(bArr, i2, i3);
        }

        public void d1(byte[] bArr, int i2, int i3) {
            B1(i3);
            a(bArr, i2, i3);
        }

        public void e1(ByteString byteString) {
            B1(byteString.size());
            byteString.Z(this);
        }

        public void h1(int i2) {
            this.f20859f.putInt(D1(this.f20863j), i2);
            this.f20863j += 4;
        }

        public void i1(long j2) {
            this.f20859f.putLong(D1(this.f20863j), j2);
            this.f20863j += 8;
        }

        public void o(int i2, int i3) {
            A1(i2, 0);
            o1(i3);
        }

        public void o1(int i2) {
            if (i2 >= 0) {
                B1(i2);
            } else {
                C1((long) i2);
            }
        }

        public void q(int i2, int i3) {
            A1(i2, 0);
            B1(i3);
        }

        public void q1(int i2, MessageLite messageLite) {
            A1(i2, 2);
            s1(messageLite);
        }

        public void r1(int i2, MessageLite messageLite, Schema schema) {
            A1(i2, 2);
            G1(messageLite, schema);
        }

        public void s(int i2, int i3) {
            A1(i2, 5);
            h1(i3);
        }

        public void s1(MessageLite messageLite) {
            B1(messageLite.g());
            messageLite.j(this);
        }

        public void t1(int i2, MessageLite messageLite) {
            A1(1, 3);
            q(2, i2);
            q1(3, messageLite);
            A1(1, 4);
        }

        public void u1(int i2, ByteString byteString) {
            A1(1, 3);
            q(2, i2);
            a0(3, byteString);
            A1(1, 4);
        }

        public void w(int i2, long j2) {
            A1(i2, 1);
            i1(j2);
        }

        public void z(int i2, String str) {
            A1(i2, 2);
            z1(str);
        }

        public void z1(String str) {
            long j2 = this.f20863j;
            try {
                int O0 = CodedOutputStream.O0(str.length() * 3);
                int O02 = CodedOutputStream.O0(str.length());
                if (O02 == O0) {
                    int D1 = D1(this.f20863j) + O02;
                    Java8Compatibility.c(this.f20859f, D1);
                    Utf8.j(str, this.f20859f);
                    int position = this.f20859f.position() - D1;
                    B1(position);
                    this.f20863j += (long) position;
                    return;
                }
                int k2 = Utf8.k(str);
                B1(k2);
                E1(this.f20863j);
                Utf8.j(str, this.f20859f);
                this.f20863j += (long) k2;
            } catch (Utf8.UnpairedSurrogateException e2) {
                this.f20863j = j2;
                E1(j2);
                U0(str, e2);
            } catch (IllegalArgumentException e3) {
                throw new OutOfSpaceException((Throwable) e3);
            } catch (IndexOutOfBoundsException e4) {
                throw new OutOfSpaceException((Throwable) e4);
            }
        }
    }

    public static int A0(int i2) {
        if (i2 > 4096) {
            return 4096;
        }
        return i2;
    }

    public static int B0(int i2, ByteString byteString) {
        return (M0(1) * 2) + N0(2, i2) + i(3, byteString);
    }

    public static int C0(int i2, int i3) {
        return M0(i2) + D0(i3);
    }

    public static int D0(int i2) {
        return 4;
    }

    public static int E0(int i2, long j2) {
        return M0(i2) + F0(j2);
    }

    public static int F0(long j2) {
        return 8;
    }

    public static int G0(int i2, int i3) {
        return M0(i2) + H0(i3);
    }

    public static int H0(int i2) {
        return O0(R0(i2));
    }

    public static int I0(int i2, long j2) {
        return M0(i2) + J0(j2);
    }

    public static int J0(long j2) {
        return Q0(S0(j2));
    }

    public static int K0(int i2, String str) {
        return M0(i2) + L0(str);
    }

    public static int L0(String str) {
        int i2;
        try {
            i2 = Utf8.k(str);
        } catch (Utf8.UnpairedSurrogateException unused) {
            i2 = str.getBytes(Internal.f21003b).length;
        }
        return u0(i2);
    }

    public static int M0(int i2) {
        return O0(WireFormat.c(i2, 0));
    }

    public static int N0(int i2, int i3) {
        return M0(i2) + O0(i3);
    }

    public static int O0(int i2) {
        return (352 - (Integer.numberOfLeadingZeros(i2) * 9)) >>> 6;
    }

    public static int P0(int i2, long j2) {
        return M0(i2) + Q0(j2);
    }

    public static int Q0(long j2) {
        return (640 - (Long.numberOfLeadingZeros(j2) * 9)) >>> 6;
    }

    public static int R0(int i2) {
        return (i2 >> 31) ^ (i2 << 1);
    }

    public static long S0(long j2) {
        return (j2 >> 63) ^ (j2 << 1);
    }

    public static CodedOutputStream W0(OutputStream outputStream, int i2) {
        return new OutputStreamEncoder(outputStream, i2);
    }

    public static CodedOutputStream X0(byte[] bArr) {
        return Y0(bArr, 0, bArr.length);
    }

    public static CodedOutputStream Y0(byte[] bArr, int i2, int i3) {
        return new ArrayEncoder(bArr, i2, i3);
    }

    public static int e0(int i2, int i3) {
        return M0(i2) + f0(i3);
    }

    public static int f(int i2, boolean z2) {
        return M0(i2) + g(z2);
    }

    public static int f0(int i2) {
        return 4;
    }

    public static int g(boolean z2) {
        return 1;
    }

    public static int g0(int i2, long j2) {
        return M0(i2) + h0(j2);
    }

    public static int h(byte[] bArr) {
        return u0(bArr.length);
    }

    public static int h0(long j2) {
        return 8;
    }

    public static int i(int i2, ByteString byteString) {
        return M0(i2) + j(byteString);
    }

    public static int i0(int i2, float f2) {
        return M0(i2) + j0(f2);
    }

    public static int j(ByteString byteString) {
        return u0(byteString.size());
    }

    public static int j0(float f2) {
        return 4;
    }

    public static int k(int i2, double d2) {
        return M0(i2) + l(d2);
    }

    public static int k0(int i2, MessageLite messageLite, Schema schema) {
        return (M0(i2) * 2) + m0(messageLite, schema);
    }

    public static int l(double d2) {
        return 8;
    }

    public static int l0(MessageLite messageLite) {
        return messageLite.g();
    }

    public static int m(int i2, int i3) {
        return M0(i2) + n(i3);
    }

    public static int m0(MessageLite messageLite, Schema schema) {
        return ((AbstractMessageLite) messageLite).l(schema);
    }

    public static int n(int i2) {
        return o0(i2);
    }

    public static int n0(int i2, int i3) {
        return M0(i2) + o0(i3);
    }

    public static int o0(int i2) {
        return Q0((long) i2);
    }

    public static int p0(int i2, long j2) {
        return M0(i2) + q0(j2);
    }

    public static int q0(long j2) {
        return Q0(j2);
    }

    public static int r0(int i2, LazyFieldLite lazyFieldLite) {
        return (M0(1) * 2) + N0(2, i2) + s0(3, lazyFieldLite);
    }

    public static int s0(int i2, LazyFieldLite lazyFieldLite) {
        return M0(i2) + t0(lazyFieldLite);
    }

    public static int t0(LazyFieldLite lazyFieldLite) {
        return u0(lazyFieldLite.b());
    }

    public static int u0(int i2) {
        return O0(i2) + i2;
    }

    public static int v0(int i2, MessageLite messageLite) {
        return (M0(1) * 2) + N0(2, i2) + w0(3, messageLite);
    }

    public static int w0(int i2, MessageLite messageLite) {
        return M0(i2) + y0(messageLite);
    }

    public static int x0(int i2, MessageLite messageLite, Schema schema) {
        return M0(i2) + z0(messageLite, schema);
    }

    public static int y0(MessageLite messageLite) {
        return u0(messageLite.g());
    }

    public static int z0(MessageLite messageLite, Schema schema) {
        return u0(((AbstractMessageLite) messageLite).l(schema));
    }

    public abstract void A(int i2, long j2);

    public abstract void A1(int i2, int i3);

    public abstract void B1(int i2);

    public abstract void C1(long j2);

    public final void D(int i2, long j2) {
        A(i2, j2);
    }

    public abstract void E(int i2, boolean z2);

    public final void F(int i2, int i3) {
        s(i2, i3);
    }

    public final void J(int i2, long j2) {
        w(i2, j2);
    }

    public final void O(int i2, long j2) {
        A(i2, S0(j2));
    }

    public final void P(int i2, float f2) {
        s(i2, Float.floatToRawIntBits(f2));
    }

    public final void S(int i2, int i3) {
        o(i2, i3);
    }

    public abstract void T0();

    public final void U0(String str, Utf8.UnpairedSurrogateException unpairedSurrogateException) {
        f20840c.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", unpairedSurrogateException);
        byte[] bytes = str.getBytes(Internal.f21003b);
        try {
            B1(bytes.length);
            c(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e2) {
            throw new OutOfSpaceException((Throwable) e2);
        }
    }

    public boolean V0() {
        return this.f20843b;
    }

    public final void W(int i2, int i3) {
        q(i2, R0(i3));
    }

    public abstract int Z0();

    public abstract void a0(int i2, ByteString byteString);

    public abstract void a1(byte b2);

    public final void b1(boolean z2) {
        a1(z2 ? (byte) 1 : 0);
    }

    public abstract void c(byte[] bArr, int i2, int i3);

    public final void c1(byte[] bArr) {
        d1(bArr, 0, bArr.length);
    }

    public abstract void d1(byte[] bArr, int i2, int i3);

    public final void e() {
        if (Z0() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public abstract void e1(ByteString byteString);

    public final void f1(double d2) {
        i1(Double.doubleToRawLongBits(d2));
    }

    public final void g1(int i2) {
        o1(i2);
    }

    public abstract void h1(int i2);

    public abstract void i1(long j2);

    public final void j1(float f2) {
        h1(Float.floatToRawIntBits(f2));
    }

    public final void k1(int i2, MessageLite messageLite) {
        A1(i2, 3);
        m1(messageLite);
        A1(i2, 4);
    }

    public final void l1(int i2, MessageLite messageLite, Schema schema) {
        A1(i2, 3);
        n1(messageLite, schema);
        A1(i2, 4);
    }

    public final void m1(MessageLite messageLite) {
        messageLite.j(this);
    }

    public final void n1(MessageLite messageLite, Schema schema) {
        schema.i(messageLite, this.f20842a);
    }

    public abstract void o(int i2, int i3);

    public abstract void o1(int i2);

    public final void p1(long j2) {
        C1(j2);
    }

    public abstract void q(int i2, int i3);

    public abstract void q1(int i2, MessageLite messageLite);

    public abstract void r1(int i2, MessageLite messageLite, Schema schema);

    public abstract void s(int i2, int i3);

    public abstract void s1(MessageLite messageLite);

    public final void t(int i2, double d2) {
        w(i2, Double.doubleToRawLongBits(d2));
    }

    public abstract void t1(int i2, MessageLite messageLite);

    public abstract void u1(int i2, ByteString byteString);

    public final void v1(int i2) {
        h1(i2);
    }

    public abstract void w(int i2, long j2);

    public final void w1(long j2) {
        i1(j2);
    }

    public final void x1(int i2) {
        B1(R0(i2));
    }

    public final void y1(long j2) {
        C1(S0(j2));
    }

    public abstract void z(int i2, String str);

    public abstract void z1(String str);

    public CodedOutputStream() {
    }
}
