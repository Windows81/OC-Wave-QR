package com.google.protobuf;

import com.google.protobuf.Utf8;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class CodedOutputStream extends ByteOutput {

    /* renamed from: c  reason: collision with root package name */
    public static final Logger f32052c = Logger.getLogger(CodedOutputStream.class.getName());

    /* renamed from: d  reason: collision with root package name */
    public static final boolean f32053d = UnsafeUtil.J();

    /* renamed from: a  reason: collision with root package name */
    public CodedOutputStreamWriter f32054a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f32055b;

    public static abstract class AbstractBufferedEncoder extends CodedOutputStream {

        /* renamed from: e  reason: collision with root package name */
        public final byte[] f32056e;

        /* renamed from: f  reason: collision with root package name */
        public final int f32057f;

        /* renamed from: g  reason: collision with root package name */
        public int f32058g;

        /* renamed from: h  reason: collision with root package name */
        public int f32059h;

        public final void A1(byte b2) {
            byte[] bArr = this.f32056e;
            int i2 = this.f32058g;
            this.f32058g = i2 + 1;
            bArr[i2] = b2;
            this.f32059h++;
        }

        public final void B1(int i2) {
            byte[] bArr = this.f32056e;
            int i3 = this.f32058g;
            int i4 = i3 + 1;
            this.f32058g = i4;
            bArr[i3] = (byte) (i2 & 255);
            int i5 = i3 + 2;
            this.f32058g = i5;
            bArr[i4] = (byte) ((i2 >> 8) & 255);
            int i6 = i3 + 3;
            this.f32058g = i6;
            bArr[i5] = (byte) ((i2 >> 16) & 255);
            this.f32058g = i3 + 4;
            bArr[i6] = (byte) ((i2 >> 24) & 255);
            this.f32059h += 4;
        }

        public final void C1(long j2) {
            byte[] bArr = this.f32056e;
            int i2 = this.f32058g;
            int i3 = i2 + 1;
            this.f32058g = i3;
            bArr[i2] = (byte) ((int) (j2 & 255));
            int i4 = i2 + 2;
            this.f32058g = i4;
            bArr[i3] = (byte) ((int) ((j2 >> 8) & 255));
            int i5 = i2 + 3;
            this.f32058g = i5;
            bArr[i4] = (byte) ((int) ((j2 >> 16) & 255));
            int i6 = i2 + 4;
            this.f32058g = i6;
            bArr[i5] = (byte) ((int) (255 & (j2 >> 24)));
            int i7 = i2 + 5;
            this.f32058g = i7;
            bArr[i6] = (byte) (((int) (j2 >> 32)) & 255);
            int i8 = i2 + 6;
            this.f32058g = i8;
            bArr[i7] = (byte) (((int) (j2 >> 40)) & 255);
            int i9 = i2 + 7;
            this.f32058g = i9;
            bArr[i8] = (byte) (((int) (j2 >> 48)) & 255);
            this.f32058g = i2 + 8;
            bArr[i9] = (byte) (((int) (j2 >> 56)) & 255);
            this.f32059h += 8;
        }

        public final void D1(int i2) {
            if (i2 >= 0) {
                F1(i2);
            } else {
                G1((long) i2);
            }
        }

        public final void E1(int i2, int i3) {
            F1(WireFormat.c(i2, i3));
        }

        public final void F1(int i2) {
            if (CodedOutputStream.f32053d) {
                long j2 = (long) this.f32058g;
                while ((i2 & -128) != 0) {
                    byte[] bArr = this.f32056e;
                    int i3 = this.f32058g;
                    this.f32058g = i3 + 1;
                    UnsafeUtil.R(bArr, (long) i3, (byte) ((i2 & 127) | 128));
                    i2 >>>= 7;
                }
                byte[] bArr2 = this.f32056e;
                int i4 = this.f32058g;
                this.f32058g = i4 + 1;
                UnsafeUtil.R(bArr2, (long) i4, (byte) i2);
                this.f32059h += (int) (((long) this.f32058g) - j2);
                return;
            }
            while ((i2 & -128) != 0) {
                byte[] bArr3 = this.f32056e;
                int i5 = this.f32058g;
                this.f32058g = i5 + 1;
                bArr3[i5] = (byte) ((i2 & 127) | 128);
                this.f32059h++;
                i2 >>>= 7;
            }
            byte[] bArr4 = this.f32056e;
            int i6 = this.f32058g;
            this.f32058g = i6 + 1;
            bArr4[i6] = (byte) i2;
            this.f32059h++;
        }

        public final void G1(long j2) {
            if (CodedOutputStream.f32053d) {
                long j3 = (long) this.f32058g;
                while ((j2 & -128) != 0) {
                    byte[] bArr = this.f32056e;
                    int i2 = this.f32058g;
                    this.f32058g = i2 + 1;
                    UnsafeUtil.R(bArr, (long) i2, (byte) ((((int) j2) & 127) | 128));
                    j2 >>>= 7;
                }
                byte[] bArr2 = this.f32056e;
                int i3 = this.f32058g;
                this.f32058g = i3 + 1;
                UnsafeUtil.R(bArr2, (long) i3, (byte) ((int) j2));
                this.f32059h += (int) (((long) this.f32058g) - j3);
                return;
            }
            while ((j2 & -128) != 0) {
                byte[] bArr3 = this.f32056e;
                int i4 = this.f32058g;
                this.f32058g = i4 + 1;
                bArr3[i4] = (byte) ((((int) j2) & 127) | 128);
                this.f32059h++;
                j2 >>>= 7;
            }
            byte[] bArr4 = this.f32056e;
            int i5 = this.f32058g;
            this.f32058g = i5 + 1;
            bArr4[i5] = (byte) ((int) j2);
            this.f32059h++;
        }

        public final int W0() {
            throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
        }
    }

    public static class ArrayEncoder extends CodedOutputStream {

        /* renamed from: e  reason: collision with root package name */
        public final byte[] f32060e;

        /* renamed from: f  reason: collision with root package name */
        public final int f32061f;

        /* renamed from: g  reason: collision with root package name */
        public final int f32062g;

        /* renamed from: h  reason: collision with root package name */
        public int f32063h;

        public ArrayEncoder(byte[] bArr, int i2, int i3) {
            super();
            if (bArr != null) {
                int i4 = i2 + i3;
                if ((i2 | i3 | (bArr.length - i4)) >= 0) {
                    this.f32060e = bArr;
                    this.f32061f = i2;
                    this.f32063h = i2;
                    this.f32062g = i4;
                    return;
                }
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i2), Integer.valueOf(i3)}));
            }
            throw new NullPointerException("buffer");
        }

        public final void A(int i2, long j2) {
            x1(i2, 0);
            z1(j2);
        }

        public final void A1(ByteBuffer byteBuffer) {
            int remaining = byteBuffer.remaining();
            try {
                byteBuffer.get(this.f32060e, this.f32063h, remaining);
                this.f32063h += remaining;
            } catch (IndexOutOfBoundsException e2) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f32063h), Integer.valueOf(this.f32062g), Integer.valueOf(remaining)}), e2);
            }
        }

        public final void E(int i2, boolean z2) {
            x1(i2, 0);
            X0(z2 ? (byte) 1 : 0);
        }

        public final int W0() {
            return this.f32062g - this.f32063h;
        }

        public final void X0(byte b2) {
            try {
                byte[] bArr = this.f32060e;
                int i2 = this.f32063h;
                this.f32063h = i2 + 1;
                bArr[i2] = b2;
            } catch (IndexOutOfBoundsException e2) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f32063h), Integer.valueOf(this.f32062g), 1}), e2);
            }
        }

        public final void a1(byte[] bArr, int i2, int i3) {
            y1(i3);
            g(bArr, i2, i3);
        }

        public final void b1(ByteString byteString) {
            y1(byteString.size());
            byteString.Z(this);
        }

        public final void e(int i2, ByteString byteString) {
            x1(i2, 2);
            b1(byteString);
        }

        public final void e1(int i2) {
            try {
                byte[] bArr = this.f32060e;
                int i3 = this.f32063h;
                int i4 = i3 + 1;
                this.f32063h = i4;
                bArr[i3] = (byte) (i2 & 255);
                int i5 = i3 + 2;
                this.f32063h = i5;
                bArr[i4] = (byte) ((i2 >> 8) & 255);
                int i6 = i3 + 3;
                this.f32063h = i6;
                bArr[i5] = (byte) ((i2 >> 16) & 255);
                this.f32063h = i3 + 4;
                bArr[i6] = (byte) ((i2 >> 24) & 255);
            } catch (IndexOutOfBoundsException e2) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f32063h), Integer.valueOf(this.f32062g), 1}), e2);
            }
        }

        public final void f1(long j2) {
            try {
                byte[] bArr = this.f32060e;
                int i2 = this.f32063h;
                int i3 = i2 + 1;
                this.f32063h = i3;
                bArr[i2] = (byte) (((int) j2) & 255);
                int i4 = i2 + 2;
                this.f32063h = i4;
                bArr[i3] = (byte) (((int) (j2 >> 8)) & 255);
                int i5 = i2 + 3;
                this.f32063h = i5;
                bArr[i4] = (byte) (((int) (j2 >> 16)) & 255);
                int i6 = i2 + 4;
                this.f32063h = i6;
                bArr[i5] = (byte) (((int) (j2 >> 24)) & 255);
                int i7 = i2 + 5;
                this.f32063h = i7;
                bArr[i6] = (byte) (((int) (j2 >> 32)) & 255);
                int i8 = i2 + 6;
                this.f32063h = i8;
                bArr[i7] = (byte) (((int) (j2 >> 40)) & 255);
                int i9 = i2 + 7;
                this.f32063h = i9;
                bArr[i8] = (byte) (((int) (j2 >> 48)) & 255);
                this.f32063h = i2 + 8;
                bArr[i9] = (byte) (((int) (j2 >> 56)) & 255);
            } catch (IndexOutOfBoundsException e2) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f32063h), Integer.valueOf(this.f32062g), 1}), e2);
            }
        }

        public final void g(byte[] bArr, int i2, int i3) {
            try {
                System.arraycopy(bArr, i2, this.f32060e, this.f32063h, i3);
                this.f32063h += i3;
            } catch (IndexOutOfBoundsException e2) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f32063h), Integer.valueOf(this.f32062g), Integer.valueOf(i3)}), e2);
            }
        }

        public final void h(ByteBuffer byteBuffer) {
            A1(byteBuffer);
        }

        public final void i(byte[] bArr, int i2, int i3) {
            g(bArr, i2, i3);
        }

        public final void l1(int i2) {
            if (i2 >= 0) {
                y1(i2);
            } else {
                z1((long) i2);
            }
        }

        public final void n1(int i2, MessageLite messageLite) {
            x1(i2, 2);
            p1(messageLite);
        }

        public final void o(int i2, int i3) {
            x1(i2, 0);
            l1(i3);
        }

        public final void o1(int i2, MessageLite messageLite, Schema schema) {
            x1(i2, 2);
            y1(((AbstractMessageLite) messageLite).r(schema));
            schema.h(messageLite, this.f32054a);
        }

        public final void p1(MessageLite messageLite) {
            y1(messageLite.g());
            messageLite.k(this);
        }

        public final void q(int i2, int i3) {
            x1(i2, 0);
            y1(i3);
        }

        public final void q1(int i2, MessageLite messageLite) {
            x1(1, 3);
            q(2, i2);
            n1(3, messageLite);
            x1(1, 4);
        }

        public final void r1(int i2, ByteString byteString) {
            x1(1, 3);
            q(2, i2);
            e(3, byteString);
            x1(1, 4);
        }

        public final void s(int i2, int i3) {
            x1(i2, 5);
            e1(i3);
        }

        public final void w(int i2, long j2) {
            x1(i2, 1);
            f1(j2);
        }

        public final void w1(String str) {
            int i2 = this.f32063h;
            try {
                int N0 = CodedOutputStream.N0(str.length() * 3);
                int N02 = CodedOutputStream.N0(str.length());
                if (N02 == N0) {
                    int i3 = i2 + N02;
                    this.f32063h = i3;
                    int i4 = Utf8.i(str, this.f32060e, i3, W0());
                    this.f32063h = i2;
                    y1((i4 - i2) - N02);
                    this.f32063h = i4;
                    return;
                }
                y1(Utf8.k(str));
                this.f32063h = Utf8.i(str, this.f32060e, this.f32063h, W0());
            } catch (Utf8.UnpairedSurrogateException e2) {
                this.f32063h = i2;
                S0(str, e2);
            } catch (IndexOutOfBoundsException e3) {
                throw new OutOfSpaceException((Throwable) e3);
            }
        }

        public final void x1(int i2, int i3) {
            y1(WireFormat.c(i2, i3));
        }

        public final void y1(int i2) {
            while ((i2 & -128) != 0) {
                byte[] bArr = this.f32060e;
                int i3 = this.f32063h;
                this.f32063h = i3 + 1;
                bArr[i3] = (byte) ((i2 & 127) | 128);
                i2 >>>= 7;
            }
            try {
                byte[] bArr2 = this.f32060e;
                int i4 = this.f32063h;
                this.f32063h = i4 + 1;
                bArr2[i4] = (byte) i2;
            } catch (IndexOutOfBoundsException e2) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f32063h), Integer.valueOf(this.f32062g), 1}), e2);
            }
        }

        public final void z(int i2, String str) {
            x1(i2, 2);
            w1(str);
        }

        public final void z1(long j2) {
            if (!CodedOutputStream.f32053d || W0() < 10) {
                while ((j2 & -128) != 0) {
                    byte[] bArr = this.f32060e;
                    int i2 = this.f32063h;
                    this.f32063h = i2 + 1;
                    bArr[i2] = (byte) ((((int) j2) & 127) | 128);
                    j2 >>>= 7;
                }
                try {
                    byte[] bArr2 = this.f32060e;
                    int i3 = this.f32063h;
                    this.f32063h = i3 + 1;
                    bArr2[i3] = (byte) ((int) j2);
                } catch (IndexOutOfBoundsException e2) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f32063h), Integer.valueOf(this.f32062g), 1}), e2);
                }
            } else {
                while ((j2 & -128) != 0) {
                    byte[] bArr3 = this.f32060e;
                    int i4 = this.f32063h;
                    this.f32063h = i4 + 1;
                    UnsafeUtil.R(bArr3, (long) i4, (byte) ((((int) j2) & 127) | 128));
                    j2 >>>= 7;
                }
                byte[] bArr4 = this.f32060e;
                int i5 = this.f32063h;
                this.f32063h = i5 + 1;
                UnsafeUtil.R(bArr4, (long) i5, (byte) ((int) j2));
            }
        }
    }

    public static final class ByteOutputEncoder extends AbstractBufferedEncoder {

        /* renamed from: i  reason: collision with root package name */
        public final ByteOutput f32064i;

        public void A(int i2, long j2) {
            J1(20);
            E1(i2, 0);
            G1(j2);
        }

        public void E(int i2, boolean z2) {
            J1(11);
            E1(i2, 0);
            A1(z2 ? (byte) 1 : 0);
        }

        public final void H1() {
            this.f32064i.g(this.f32056e, 0, this.f32058g);
            this.f32058g = 0;
        }

        public void I1() {
            if (this.f32058g > 0) {
                H1();
            }
        }

        public final void J1(int i2) {
            if (this.f32057f - this.f32058g < i2) {
                H1();
            }
        }

        public void K1(MessageLite messageLite, Schema schema) {
            y1(((AbstractMessageLite) messageLite).r(schema));
            schema.h(messageLite, this.f32054a);
        }

        public void X0(byte b2) {
            if (this.f32058g == this.f32057f) {
                H1();
            }
            A1(b2);
        }

        public void a1(byte[] bArr, int i2, int i3) {
            y1(i3);
            g(bArr, i2, i3);
        }

        public void b1(ByteString byteString) {
            y1(byteString.size());
            byteString.Z(this);
        }

        public void e(int i2, ByteString byteString) {
            x1(i2, 2);
            b1(byteString);
        }

        public void e1(int i2) {
            J1(4);
            B1(i2);
        }

        public void f1(long j2) {
            J1(8);
            C1(j2);
        }

        public void g(byte[] bArr, int i2, int i3) {
            I1();
            this.f32064i.g(bArr, i2, i3);
            this.f32059h += i3;
        }

        public void h(ByteBuffer byteBuffer) {
            I1();
            int remaining = byteBuffer.remaining();
            this.f32064i.h(byteBuffer);
            this.f32059h += remaining;
        }

        public void i(byte[] bArr, int i2, int i3) {
            I1();
            this.f32064i.i(bArr, i2, i3);
            this.f32059h += i3;
        }

        public void l1(int i2) {
            if (i2 >= 0) {
                y1(i2);
            } else {
                z1((long) i2);
            }
        }

        public void n1(int i2, MessageLite messageLite) {
            x1(i2, 2);
            p1(messageLite);
        }

        public void o(int i2, int i3) {
            J1(20);
            E1(i2, 0);
            D1(i3);
        }

        public void o1(int i2, MessageLite messageLite, Schema schema) {
            x1(i2, 2);
            K1(messageLite, schema);
        }

        public void p1(MessageLite messageLite) {
            y1(messageLite.g());
            messageLite.k(this);
        }

        public void q(int i2, int i3) {
            J1(20);
            E1(i2, 0);
            F1(i3);
        }

        public void q1(int i2, MessageLite messageLite) {
            x1(1, 3);
            q(2, i2);
            n1(3, messageLite);
            x1(1, 4);
        }

        public void r1(int i2, ByteString byteString) {
            x1(1, 3);
            q(2, i2);
            e(3, byteString);
            x1(1, 4);
        }

        public void s(int i2, int i3) {
            J1(14);
            E1(i2, 5);
            B1(i3);
        }

        public void w(int i2, long j2) {
            J1(18);
            E1(i2, 1);
            C1(j2);
        }

        public void w1(String str) {
            int length = str.length() * 3;
            int N0 = CodedOutputStream.N0(length);
            int i2 = N0 + length;
            int i3 = this.f32057f;
            if (i2 > i3) {
                byte[] bArr = new byte[length];
                int i4 = Utf8.i(str, bArr, 0, length);
                y1(i4);
                i(bArr, 0, i4);
                return;
            }
            if (i2 > i3 - this.f32058g) {
                H1();
            }
            int i5 = this.f32058g;
            try {
                int N02 = CodedOutputStream.N0(str.length());
                if (N02 == N0) {
                    int i6 = i5 + N02;
                    this.f32058g = i6;
                    int i7 = Utf8.i(str, this.f32056e, i6, this.f32057f - i6);
                    this.f32058g = i5;
                    int i8 = (i7 - i5) - N02;
                    F1(i8);
                    this.f32058g = i7;
                    this.f32059h += i8;
                    return;
                }
                int k2 = Utf8.k(str);
                F1(k2);
                this.f32058g = Utf8.i(str, this.f32056e, this.f32058g, k2);
                this.f32059h += k2;
            } catch (Utf8.UnpairedSurrogateException e2) {
                this.f32059h -= this.f32058g - i5;
                this.f32058g = i5;
                S0(str, e2);
            } catch (IndexOutOfBoundsException e3) {
                throw new OutOfSpaceException((Throwable) e3);
            }
        }

        public void x1(int i2, int i3) {
            y1(WireFormat.c(i2, i3));
        }

        public void y1(int i2) {
            J1(5);
            F1(i2);
        }

        public void z(int i2, String str) {
            x1(i2, 2);
            w1(str);
        }

        public void z1(long j2) {
            J1(10);
            G1(j2);
        }
    }

    public static final class HeapNioEncoder extends ArrayEncoder {
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
        public final OutputStream f32065i;

        private void H1() {
            this.f32065i.write(this.f32056e, 0, this.f32058g);
            this.f32058g = 0;
        }

        private void I1(int i2) {
            if (this.f32057f - this.f32058g < i2) {
                H1();
            }
        }

        public void A(int i2, long j2) {
            I1(20);
            E1(i2, 0);
            G1(j2);
        }

        public void E(int i2, boolean z2) {
            I1(11);
            E1(i2, 0);
            A1(z2 ? (byte) 1 : 0);
        }

        public void J1(ByteBuffer byteBuffer) {
            int remaining = byteBuffer.remaining();
            int i2 = this.f32057f;
            int i3 = this.f32058g;
            if (i2 - i3 >= remaining) {
                byteBuffer.get(this.f32056e, i3, remaining);
                this.f32058g += remaining;
                this.f32059h += remaining;
                return;
            }
            int i4 = i2 - i3;
            byteBuffer.get(this.f32056e, i3, i4);
            int i5 = remaining - i4;
            this.f32058g = this.f32057f;
            this.f32059h += i4;
            H1();
            while (true) {
                int i6 = this.f32057f;
                if (i5 > i6) {
                    byteBuffer.get(this.f32056e, 0, i6);
                    this.f32065i.write(this.f32056e, 0, this.f32057f);
                    int i7 = this.f32057f;
                    i5 -= i7;
                    this.f32059h += i7;
                } else {
                    byteBuffer.get(this.f32056e, 0, i5);
                    this.f32058g = i5;
                    this.f32059h += i5;
                    return;
                }
            }
        }

        public void K1(MessageLite messageLite, Schema schema) {
            y1(((AbstractMessageLite) messageLite).r(schema));
            schema.h(messageLite, this.f32054a);
        }

        public void X0(byte b2) {
            if (this.f32058g == this.f32057f) {
                H1();
            }
            A1(b2);
        }

        public void a1(byte[] bArr, int i2, int i3) {
            y1(i3);
            g(bArr, i2, i3);
        }

        public void b1(ByteString byteString) {
            y1(byteString.size());
            byteString.Z(this);
        }

        public void e(int i2, ByteString byteString) {
            x1(i2, 2);
            b1(byteString);
        }

        public void e1(int i2) {
            I1(4);
            B1(i2);
        }

        public void f1(long j2) {
            I1(8);
            C1(j2);
        }

        public void g(byte[] bArr, int i2, int i3) {
            int i4 = this.f32057f;
            int i5 = this.f32058g;
            if (i4 - i5 >= i3) {
                System.arraycopy(bArr, i2, this.f32056e, i5, i3);
                this.f32058g += i3;
                this.f32059h += i3;
                return;
            }
            int i6 = i4 - i5;
            System.arraycopy(bArr, i2, this.f32056e, i5, i6);
            int i7 = i2 + i6;
            int i8 = i3 - i6;
            this.f32058g = this.f32057f;
            this.f32059h += i6;
            H1();
            if (i8 <= this.f32057f) {
                System.arraycopy(bArr, i7, this.f32056e, 0, i8);
                this.f32058g = i8;
            } else {
                this.f32065i.write(bArr, i7, i8);
            }
            this.f32059h += i8;
        }

        public void h(ByteBuffer byteBuffer) {
            J1(byteBuffer);
        }

        public void i(byte[] bArr, int i2, int i3) {
            g(bArr, i2, i3);
        }

        public void l1(int i2) {
            if (i2 >= 0) {
                y1(i2);
            } else {
                z1((long) i2);
            }
        }

        public void n1(int i2, MessageLite messageLite) {
            x1(i2, 2);
            p1(messageLite);
        }

        public void o(int i2, int i3) {
            I1(20);
            E1(i2, 0);
            D1(i3);
        }

        public void o1(int i2, MessageLite messageLite, Schema schema) {
            x1(i2, 2);
            K1(messageLite, schema);
        }

        public void p1(MessageLite messageLite) {
            y1(messageLite.g());
            messageLite.k(this);
        }

        public void q(int i2, int i3) {
            I1(20);
            E1(i2, 0);
            F1(i3);
        }

        public void q1(int i2, MessageLite messageLite) {
            x1(1, 3);
            q(2, i2);
            n1(3, messageLite);
            x1(1, 4);
        }

        public void r1(int i2, ByteString byteString) {
            x1(1, 3);
            q(2, i2);
            e(3, byteString);
            x1(1, 4);
        }

        public void s(int i2, int i3) {
            I1(14);
            E1(i2, 5);
            B1(i3);
        }

        public void w(int i2, long j2) {
            I1(18);
            E1(i2, 1);
            C1(j2);
        }

        public void w1(String str) {
            int i2;
            int i3;
            try {
                int length = str.length() * 3;
                int N0 = CodedOutputStream.N0(length);
                int i4 = N0 + length;
                int i5 = this.f32057f;
                if (i4 > i5) {
                    byte[] bArr = new byte[length];
                    int i6 = Utf8.i(str, bArr, 0, length);
                    y1(i6);
                    i(bArr, 0, i6);
                    return;
                }
                if (i4 > i5 - this.f32058g) {
                    H1();
                }
                int N02 = CodedOutputStream.N0(str.length());
                i2 = this.f32058g;
                if (N02 == N0) {
                    int i7 = i2 + N02;
                    this.f32058g = i7;
                    int i8 = Utf8.i(str, this.f32056e, i7, this.f32057f - i7);
                    this.f32058g = i2;
                    i3 = (i8 - i2) - N02;
                    F1(i3);
                    this.f32058g = i8;
                } else {
                    i3 = Utf8.k(str);
                    F1(i3);
                    this.f32058g = Utf8.i(str, this.f32056e, this.f32058g, i3);
                }
                this.f32059h += i3;
            } catch (Utf8.UnpairedSurrogateException e2) {
                this.f32059h -= this.f32058g - i2;
                this.f32058g = i2;
                throw e2;
            } catch (ArrayIndexOutOfBoundsException e3) {
                throw new OutOfSpaceException((Throwable) e3);
            } catch (Utf8.UnpairedSurrogateException e4) {
                S0(str, e4);
            }
        }

        public void x1(int i2, int i3) {
            y1(WireFormat.c(i2, i3));
        }

        public void y1(int i2) {
            I1(5);
            F1(i2);
        }

        public void z(int i2, String str) {
            x1(i2, 2);
            w1(str);
        }

        public void z1(long j2) {
            I1(10);
            G1(j2);
        }
    }

    public static final class SafeDirectNioEncoder extends CodedOutputStream {

        /* renamed from: e  reason: collision with root package name */
        public final ByteBuffer f32066e;

        public void A(int i2, long j2) {
            x1(i2, 0);
            z1(j2);
        }

        public final void A1(String str) {
            try {
                Utf8.j(str, this.f32066e);
            } catch (IndexOutOfBoundsException e2) {
                throw new OutOfSpaceException((Throwable) e2);
            }
        }

        public void B1(ByteBuffer byteBuffer) {
            try {
                this.f32066e.put(byteBuffer);
            } catch (BufferOverflowException e2) {
                throw new OutOfSpaceException((Throwable) e2);
            }
        }

        public void C1(MessageLite messageLite, Schema schema) {
            y1(((AbstractMessageLite) messageLite).r(schema));
            schema.h(messageLite, this.f32054a);
        }

        public void E(int i2, boolean z2) {
            x1(i2, 0);
            X0(z2 ? (byte) 1 : 0);
        }

        public int W0() {
            return this.f32066e.remaining();
        }

        public void X0(byte b2) {
            try {
                this.f32066e.put(b2);
            } catch (BufferOverflowException e2) {
                throw new OutOfSpaceException((Throwable) e2);
            }
        }

        public void a1(byte[] bArr, int i2, int i3) {
            y1(i3);
            g(bArr, i2, i3);
        }

        public void b1(ByteString byteString) {
            y1(byteString.size());
            byteString.Z(this);
        }

        public void e(int i2, ByteString byteString) {
            x1(i2, 2);
            b1(byteString);
        }

        public void e1(int i2) {
            try {
                this.f32066e.putInt(i2);
            } catch (BufferOverflowException e2) {
                throw new OutOfSpaceException((Throwable) e2);
            }
        }

        public void f1(long j2) {
            try {
                this.f32066e.putLong(j2);
            } catch (BufferOverflowException e2) {
                throw new OutOfSpaceException((Throwable) e2);
            }
        }

        public void g(byte[] bArr, int i2, int i3) {
            try {
                this.f32066e.put(bArr, i2, i3);
            } catch (IndexOutOfBoundsException e2) {
                throw new OutOfSpaceException((Throwable) e2);
            } catch (BufferOverflowException e3) {
                throw new OutOfSpaceException((Throwable) e3);
            }
        }

        public void h(ByteBuffer byteBuffer) {
            B1(byteBuffer);
        }

        public void i(byte[] bArr, int i2, int i3) {
            g(bArr, i2, i3);
        }

        public void l1(int i2) {
            if (i2 >= 0) {
                y1(i2);
            } else {
                z1((long) i2);
            }
        }

        public void n1(int i2, MessageLite messageLite) {
            x1(i2, 2);
            p1(messageLite);
        }

        public void o(int i2, int i3) {
            x1(i2, 0);
            l1(i3);
        }

        public void o1(int i2, MessageLite messageLite, Schema schema) {
            x1(i2, 2);
            C1(messageLite, schema);
        }

        public void p1(MessageLite messageLite) {
            y1(messageLite.g());
            messageLite.k(this);
        }

        public void q(int i2, int i3) {
            x1(i2, 0);
            y1(i3);
        }

        public void q1(int i2, MessageLite messageLite) {
            x1(1, 3);
            q(2, i2);
            n1(3, messageLite);
            x1(1, 4);
        }

        public void r1(int i2, ByteString byteString) {
            x1(1, 3);
            q(2, i2);
            e(3, byteString);
            x1(1, 4);
        }

        public void s(int i2, int i3) {
            x1(i2, 5);
            e1(i3);
        }

        public void w(int i2, long j2) {
            x1(i2, 1);
            f1(j2);
        }

        public void w1(String str) {
            int position = this.f32066e.position();
            try {
                int N0 = CodedOutputStream.N0(str.length() * 3);
                int N02 = CodedOutputStream.N0(str.length());
                if (N02 == N0) {
                    int position2 = this.f32066e.position() + N02;
                    ByteBuffer byteBuffer = (ByteBuffer) this.f32066e.position(position2);
                    A1(str);
                    int position3 = this.f32066e.position();
                    ByteBuffer byteBuffer2 = (ByteBuffer) this.f32066e.position(position);
                    y1(position3 - position2);
                    ByteBuffer byteBuffer3 = (ByteBuffer) this.f32066e.position(position3);
                    return;
                }
                y1(Utf8.k(str));
                A1(str);
            } catch (Utf8.UnpairedSurrogateException e2) {
                ByteBuffer byteBuffer4 = (ByteBuffer) this.f32066e.position(position);
                S0(str, e2);
            } catch (IllegalArgumentException e3) {
                throw new OutOfSpaceException((Throwable) e3);
            }
        }

        public void x1(int i2, int i3) {
            y1(WireFormat.c(i2, i3));
        }

        public void y1(int i2) {
            while ((i2 & -128) != 0) {
                this.f32066e.put((byte) ((i2 & 127) | 128));
                i2 >>>= 7;
            }
            try {
                this.f32066e.put((byte) i2);
            } catch (BufferOverflowException e2) {
                throw new OutOfSpaceException((Throwable) e2);
            }
        }

        public void z(int i2, String str) {
            x1(i2, 2);
            w1(str);
        }

        public void z1(long j2) {
            while ((-128 & j2) != 0) {
                this.f32066e.put((byte) ((((int) j2) & 127) | 128));
                j2 >>>= 7;
            }
            try {
                this.f32066e.put((byte) ((int) j2));
            } catch (BufferOverflowException e2) {
                throw new OutOfSpaceException((Throwable) e2);
            }
        }
    }

    public static final class UnsafeDirectNioEncoder extends CodedOutputStream {

        /* renamed from: e  reason: collision with root package name */
        public final ByteBuffer f32067e;

        /* renamed from: f  reason: collision with root package name */
        public final long f32068f;

        /* renamed from: g  reason: collision with root package name */
        public final long f32069g;

        /* renamed from: h  reason: collision with root package name */
        public final long f32070h;

        /* renamed from: i  reason: collision with root package name */
        public long f32071i;

        public void A(int i2, long j2) {
            x1(i2, 0);
            z1(j2);
        }

        public final int A1(long j2) {
            return (int) (j2 - this.f32068f);
        }

        public final void B1(long j2) {
            ByteBuffer byteBuffer = (ByteBuffer) this.f32067e.position(A1(j2));
        }

        public void C1(ByteBuffer byteBuffer) {
            try {
                int remaining = byteBuffer.remaining();
                B1(this.f32071i);
                this.f32067e.put(byteBuffer);
                this.f32071i += (long) remaining;
            } catch (BufferOverflowException e2) {
                throw new OutOfSpaceException((Throwable) e2);
            }
        }

        public void D1(MessageLite messageLite, Schema schema) {
            y1(((AbstractMessageLite) messageLite).r(schema));
            schema.h(messageLite, this.f32054a);
        }

        public void E(int i2, boolean z2) {
            x1(i2, 0);
            X0(z2 ? (byte) 1 : 0);
        }

        public int W0() {
            return (int) (this.f32069g - this.f32071i);
        }

        public void X0(byte b2) {
            long j2 = this.f32071i;
            if (j2 < this.f32069g) {
                this.f32071i = 1 + j2;
                UnsafeUtil.Q(j2, b2);
                return;
            }
            throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Long.valueOf(this.f32071i), Long.valueOf(this.f32069g), 1}));
        }

        public void a1(byte[] bArr, int i2, int i3) {
            y1(i3);
            g(bArr, i2, i3);
        }

        public void b1(ByteString byteString) {
            y1(byteString.size());
            byteString.Z(this);
        }

        public void e(int i2, ByteString byteString) {
            x1(i2, 2);
            b1(byteString);
        }

        public void e1(int i2) {
            this.f32067e.putInt(A1(this.f32071i), i2);
            this.f32071i += 4;
        }

        public void f1(long j2) {
            this.f32067e.putLong(A1(this.f32071i), j2);
            this.f32071i += 8;
        }

        public void g(byte[] bArr, int i2, int i3) {
            if (bArr != null && i2 >= 0 && i3 >= 0 && bArr.length - i3 >= i2) {
                long j2 = (long) i3;
                long j3 = this.f32071i;
                if (this.f32069g - j2 >= j3) {
                    UnsafeUtil.q(bArr, (long) i2, j3, j2);
                    this.f32071i += j2;
                    return;
                }
            }
            if (bArr == null) {
                throw new NullPointerException("value");
            }
            throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Long.valueOf(this.f32071i), Long.valueOf(this.f32069g), Integer.valueOf(i3)}));
        }

        public void h(ByteBuffer byteBuffer) {
            C1(byteBuffer);
        }

        public void i(byte[] bArr, int i2, int i3) {
            g(bArr, i2, i3);
        }

        public void l1(int i2) {
            if (i2 >= 0) {
                y1(i2);
            } else {
                z1((long) i2);
            }
        }

        public void n1(int i2, MessageLite messageLite) {
            x1(i2, 2);
            p1(messageLite);
        }

        public void o(int i2, int i3) {
            x1(i2, 0);
            l1(i3);
        }

        public void o1(int i2, MessageLite messageLite, Schema schema) {
            x1(i2, 2);
            D1(messageLite, schema);
        }

        public void p1(MessageLite messageLite) {
            y1(messageLite.g());
            messageLite.k(this);
        }

        public void q(int i2, int i3) {
            x1(i2, 0);
            y1(i3);
        }

        public void q1(int i2, MessageLite messageLite) {
            x1(1, 3);
            q(2, i2);
            n1(3, messageLite);
            x1(1, 4);
        }

        public void r1(int i2, ByteString byteString) {
            x1(1, 3);
            q(2, i2);
            e(3, byteString);
            x1(1, 4);
        }

        public void s(int i2, int i3) {
            x1(i2, 5);
            e1(i3);
        }

        public void w(int i2, long j2) {
            x1(i2, 1);
            f1(j2);
        }

        public void w1(String str) {
            long j2 = this.f32071i;
            try {
                int N0 = CodedOutputStream.N0(str.length() * 3);
                int N02 = CodedOutputStream.N0(str.length());
                if (N02 == N0) {
                    int A1 = A1(this.f32071i) + N02;
                    ByteBuffer byteBuffer = (ByteBuffer) this.f32067e.position(A1);
                    Utf8.j(str, this.f32067e);
                    int position = this.f32067e.position() - A1;
                    y1(position);
                    this.f32071i += (long) position;
                    return;
                }
                int k2 = Utf8.k(str);
                y1(k2);
                B1(this.f32071i);
                Utf8.j(str, this.f32067e);
                this.f32071i += (long) k2;
            } catch (Utf8.UnpairedSurrogateException e2) {
                this.f32071i = j2;
                B1(j2);
                S0(str, e2);
            } catch (IllegalArgumentException e3) {
                throw new OutOfSpaceException((Throwable) e3);
            } catch (IndexOutOfBoundsException e4) {
                throw new OutOfSpaceException((Throwable) e4);
            }
        }

        public void x1(int i2, int i3) {
            y1(WireFormat.c(i2, i3));
        }

        public void y1(int i2) {
            if (this.f32071i <= this.f32070h) {
                while ((i2 & -128) != 0) {
                    long j2 = this.f32071i;
                    this.f32071i = j2 + 1;
                    UnsafeUtil.Q(j2, (byte) ((i2 & 127) | 128));
                    i2 >>>= 7;
                }
                long j3 = this.f32071i;
                this.f32071i = 1 + j3;
                UnsafeUtil.Q(j3, (byte) i2);
                return;
            }
            while (true) {
                long j4 = this.f32071i;
                if (j4 >= this.f32069g) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Long.valueOf(this.f32071i), Long.valueOf(this.f32069g), 1}));
                } else if ((i2 & -128) == 0) {
                    this.f32071i = 1 + j4;
                    UnsafeUtil.Q(j4, (byte) i2);
                    return;
                } else {
                    this.f32071i = j4 + 1;
                    UnsafeUtil.Q(j4, (byte) ((i2 & 127) | 128));
                    i2 >>>= 7;
                }
            }
        }

        public void z(int i2, String str) {
            x1(i2, 2);
            w1(str);
        }

        public void z1(long j2) {
            if (this.f32071i <= this.f32070h) {
                while ((j2 & -128) != 0) {
                    long j3 = this.f32071i;
                    this.f32071i = j3 + 1;
                    UnsafeUtil.Q(j3, (byte) ((((int) j2) & 127) | 128));
                    j2 >>>= 7;
                }
                long j4 = this.f32071i;
                this.f32071i = 1 + j4;
                UnsafeUtil.Q(j4, (byte) ((int) j2));
                return;
            }
            while (true) {
                long j5 = this.f32071i;
                if (j5 >= this.f32069g) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Long.valueOf(this.f32071i), Long.valueOf(this.f32069g), 1}));
                } else if ((j2 & -128) == 0) {
                    this.f32071i = 1 + j5;
                    UnsafeUtil.Q(j5, (byte) ((int) j2));
                    return;
                } else {
                    this.f32071i = j5 + 1;
                    UnsafeUtil.Q(j5, (byte) ((((int) j2) & 127) | 128));
                    j2 >>>= 7;
                }
            }
        }
    }

    public static int A0(int i2, ByteString byteString) {
        return (L0(1) * 2) + M0(2, i2) + Y(3, byteString);
    }

    public static int B0(int i2, int i3) {
        return L0(i2) + C0(i3);
    }

    public static int C0(int i2) {
        return 4;
    }

    public static int D0(int i2, long j2) {
        return L0(i2) + E0(j2);
    }

    public static int E0(long j2) {
        return 8;
    }

    public static int F0(int i2, int i3) {
        return L0(i2) + G0(i3);
    }

    public static int G0(int i2) {
        return N0(Q0(i2));
    }

    public static int H0(int i2, long j2) {
        return L0(i2) + I0(j2);
    }

    public static int I0(long j2) {
        return P0(R0(j2));
    }

    public static int J0(int i2, String str) {
        return L0(i2) + K0(str);
    }

    public static int K0(String str) {
        int i2;
        try {
            i2 = Utf8.k(str);
        } catch (Utf8.UnpairedSurrogateException unused) {
            i2 = str.getBytes(Internal.f32168b).length;
        }
        return u0(i2);
    }

    public static int L0(int i2) {
        return N0(WireFormat.c(i2, 0));
    }

    public static int M0(int i2, int i3) {
        return L0(i2) + N0(i3);
    }

    public static int N0(int i2) {
        if ((i2 & -128) == 0) {
            return 1;
        }
        if ((i2 & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & i2) == 0) {
            return 3;
        }
        return (i2 & -268435456) == 0 ? 4 : 5;
    }

    public static int O0(int i2, long j2) {
        return L0(i2) + P0(j2);
    }

    public static int P0(long j2) {
        int i2;
        if ((-128 & j2) == 0) {
            return 1;
        }
        if (j2 < 0) {
            return 10;
        }
        if ((-34359738368L & j2) != 0) {
            j2 >>>= 28;
            i2 = 6;
        } else {
            i2 = 2;
        }
        if ((-2097152 & j2) != 0) {
            i2 += 2;
            j2 >>>= 14;
        }
        return (j2 & -16384) != 0 ? i2 + 1 : i2;
    }

    public static int Q0(int i2) {
        return (i2 >> 31) ^ (i2 << 1);
    }

    public static long R0(long j2) {
        return (j2 >> 63) ^ (j2 << 1);
    }

    public static CodedOutputStream U0(byte[] bArr) {
        return V0(bArr, 0, bArr.length);
    }

    public static CodedOutputStream V0(byte[] bArr, int i2, int i3) {
        return new ArrayEncoder(bArr, i2, i3);
    }

    public static int Y(int i2, ByteString byteString) {
        return L0(i2) + Z(byteString);
    }

    public static int Z(ByteString byteString) {
        return u0(byteString.size());
    }

    public static int a0(int i2, double d2) {
        return L0(i2) + b0(d2);
    }

    public static int b0(double d2) {
        return 8;
    }

    public static int c0(int i2, int i3) {
        return L0(i2) + d0(i3);
    }

    public static int d0(int i2) {
        return o0(i2);
    }

    public static int e0(int i2, int i3) {
        return L0(i2) + f0(i3);
    }

    public static int f0(int i2) {
        return 4;
    }

    public static int g0(int i2, long j2) {
        return L0(i2) + h0(j2);
    }

    public static int h0(long j2) {
        return 8;
    }

    public static int i0(int i2, float f2) {
        return L0(i2) + j0(f2);
    }

    public static int j0(float f2) {
        return 4;
    }

    public static int k0(int i2, MessageLite messageLite, Schema schema) {
        return (L0(i2) * 2) + m0(messageLite, schema);
    }

    public static int l(int i2, boolean z2) {
        return L0(i2) + m(z2);
    }

    public static int l0(MessageLite messageLite) {
        return messageLite.g();
    }

    public static int m(boolean z2) {
        return 1;
    }

    public static int m0(MessageLite messageLite, Schema schema) {
        return ((AbstractMessageLite) messageLite).r(schema);
    }

    public static int n(byte[] bArr) {
        return u0(bArr.length);
    }

    public static int n0(int i2, int i3) {
        return L0(i2) + o0(i3);
    }

    public static int o0(int i2) {
        if (i2 >= 0) {
            return N0(i2);
        }
        return 10;
    }

    public static int p0(int i2, long j2) {
        return L0(i2) + q0(j2);
    }

    public static int q0(long j2) {
        return P0(j2);
    }

    public static int r0(int i2, LazyFieldLite lazyFieldLite) {
        return (L0(1) * 2) + M0(2, i2) + s0(3, lazyFieldLite);
    }

    public static int s0(int i2, LazyFieldLite lazyFieldLite) {
        return L0(i2) + t0(lazyFieldLite);
    }

    public static int t0(LazyFieldLite lazyFieldLite) {
        return u0(lazyFieldLite.b());
    }

    public static int u0(int i2) {
        return N0(i2) + i2;
    }

    public static int v0(int i2, MessageLite messageLite) {
        return (L0(1) * 2) + M0(2, i2) + w0(3, messageLite);
    }

    public static int w0(int i2, MessageLite messageLite) {
        return L0(i2) + y0(messageLite);
    }

    public static int x0(int i2, MessageLite messageLite, Schema schema) {
        return L0(i2) + z0(messageLite, schema);
    }

    public static int y0(MessageLite messageLite) {
        return u0(messageLite.g());
    }

    public static int z0(MessageLite messageLite, Schema schema) {
        return u0(((AbstractMessageLite) messageLite).r(schema));
    }

    public abstract void A(int i2, long j2);

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
        A(i2, R0(j2));
    }

    public final void P(int i2, float f2) {
        s(i2, Float.floatToRawIntBits(f2));
    }

    public final void S(int i2, int i3) {
        o(i2, i3);
    }

    public final void S0(String str, Utf8.UnpairedSurrogateException unpairedSurrogateException) {
        f32052c.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", unpairedSurrogateException);
        byte[] bytes = str.getBytes(Internal.f32168b);
        try {
            y1(bytes.length);
            i(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e2) {
            throw new OutOfSpaceException((Throwable) e2);
        }
    }

    public boolean T0() {
        return this.f32055b;
    }

    public final void W(int i2, int i3) {
        q(i2, Q0(i3));
    }

    public abstract int W0();

    public abstract void X0(byte b2);

    public final void Y0(boolean z2) {
        X0(z2 ? (byte) 1 : 0);
    }

    public final void Z0(byte[] bArr) {
        a1(bArr, 0, bArr.length);
    }

    public abstract void a1(byte[] bArr, int i2, int i3);

    public abstract void b1(ByteString byteString);

    public final void c1(double d2) {
        f1(Double.doubleToRawLongBits(d2));
    }

    public final void d1(int i2) {
        l1(i2);
    }

    public abstract void e(int i2, ByteString byteString);

    public abstract void e1(int i2);

    public abstract void f1(long j2);

    public final void g1(float f2) {
        e1(Float.floatToRawIntBits(f2));
    }

    public final void h1(int i2, MessageLite messageLite) {
        x1(i2, 3);
        j1(messageLite);
        x1(i2, 4);
    }

    public abstract void i(byte[] bArr, int i2, int i3);

    public final void i1(int i2, MessageLite messageLite, Schema schema) {
        x1(i2, 3);
        k1(messageLite, schema);
        x1(i2, 4);
    }

    public final void j1(MessageLite messageLite) {
        messageLite.k(this);
    }

    public final void k() {
        if (W0() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public final void k1(MessageLite messageLite, Schema schema) {
        schema.h(messageLite, this.f32054a);
    }

    public abstract void l1(int i2);

    public final void m1(long j2) {
        z1(j2);
    }

    public abstract void n1(int i2, MessageLite messageLite);

    public abstract void o(int i2, int i3);

    public abstract void o1(int i2, MessageLite messageLite, Schema schema);

    public abstract void p1(MessageLite messageLite);

    public abstract void q(int i2, int i3);

    public abstract void q1(int i2, MessageLite messageLite);

    public abstract void r1(int i2, ByteString byteString);

    public abstract void s(int i2, int i3);

    public final void s1(int i2) {
        e1(i2);
    }

    public final void t(int i2, double d2) {
        w(i2, Double.doubleToRawLongBits(d2));
    }

    public final void t1(long j2) {
        f1(j2);
    }

    public final void u1(int i2) {
        y1(Q0(i2));
    }

    public final void v1(long j2) {
        z1(R0(j2));
    }

    public abstract void w(int i2, long j2);

    public abstract void w1(String str);

    public abstract void x1(int i2, int i3);

    public abstract void y1(int i2);

    public abstract void z(int i2, String str);

    public abstract void z1(long j2);

    public CodedOutputStream() {
    }
}
