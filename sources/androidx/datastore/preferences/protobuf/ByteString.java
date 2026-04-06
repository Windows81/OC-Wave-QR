package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.InvalidMarkException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;

@CheckReturnValue
public abstract class ByteString implements Iterable<Byte>, Serializable {

    /* renamed from: A  reason: collision with root package name */
    public static final ByteString f20770A = new LiteralByteString(Internal.f21005d);

    /* renamed from: B  reason: collision with root package name */
    public static final ByteArrayCopier f20771B = (Android.c() ? new SystemByteArrayCopier() : new ArraysByteArrayCopier());
    public static final Comparator C = new Comparator<ByteString>() {
        /* renamed from: a */
        public int compare(ByteString byteString, ByteString byteString2) {
            ByteIterator D = byteString.iterator();
            ByteIterator D2 = byteString2.iterator();
            while (D.hasNext() && D2.hasNext()) {
                int compareTo = Integer.valueOf(ByteString.Q(D.p())).compareTo(Integer.valueOf(ByteString.Q(D2.p())));
                if (compareTo != 0) {
                    return compareTo;
                }
            }
            return Integer.valueOf(byteString.size()).compareTo(Integer.valueOf(byteString2.size()));
        }
    };

    /* renamed from: z  reason: collision with root package name */
    public int f20772z = 0;

    public static abstract class AbstractByteIterator implements ByteIterator {
        /* renamed from: b */
        public final Byte next() {
            return Byte.valueOf(p());
        }

        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public static final class ArraysByteArrayCopier implements ByteArrayCopier {
        public ArraysByteArrayCopier() {
        }

        public byte[] a(byte[] bArr, int i2, int i3) {
            return Arrays.copyOfRange(bArr, i2, i3 + i2);
        }
    }

    public static final class BoundedByteString extends LiteralByteString {
        public final int E;
        public final int F;

        public BoundedByteString(byte[] bArr, int i2, int i3) {
            super(bArr);
            ByteString.n(i2, i2 + i3, bArr.length);
            this.E = i2;
            this.F = i3;
        }

        public byte A(int i2) {
            return this.D[this.E + i2];
        }

        public int d0() {
            return this.E;
        }

        public byte i(int i2) {
            ByteString.m(i2, size());
            return this.D[this.E + i2];
        }

        public int size() {
            return this.F;
        }

        public void w(byte[] bArr, int i2, int i3, int i4) {
            System.arraycopy(this.D, d0() + i2, bArr, i3, i4);
        }
    }

    public interface ByteArrayCopier {
        byte[] a(byte[] bArr, int i2, int i3);
    }

    public interface ByteIterator extends Iterator<Byte> {
        byte p();
    }

    public static final class CodedBuilder {

        /* renamed from: a  reason: collision with root package name */
        public final CodedOutputStream f20776a;

        /* renamed from: b  reason: collision with root package name */
        public final byte[] f20777b;

        public ByteString a() {
            this.f20776a.e();
            return new LiteralByteString(this.f20777b);
        }

        public CodedOutputStream b() {
            return this.f20776a;
        }

        public CodedBuilder(int i2) {
            byte[] bArr = new byte[i2];
            this.f20777b = bArr;
            this.f20776a = CodedOutputStream.X0(bArr);
        }
    }

    public static abstract class LeafByteString extends ByteString {
        public final boolean B() {
            return true;
        }

        public void a0(ByteOutput byteOutput) {
            Z(byteOutput);
        }

        public abstract boolean b0(ByteString byteString, int i2, int i3);

        public /* bridge */ /* synthetic */ Iterator iterator() {
            return ByteString.super.iterator();
        }

        public final int z() {
            return 0;
        }

        public LeafByteString() {
        }
    }

    public static class LiteralByteString extends LeafByteString {
        public final byte[] D;

        public LiteralByteString(byte[] bArr) {
            super();
            bArr.getClass();
            this.D = bArr;
        }

        public byte A(int i2) {
            return this.D[i2];
        }

        public final boolean C() {
            int d0 = d0();
            return Utf8.u(this.D, d0, size() + d0);
        }

        public final CodedInputStream F() {
            return CodedInputStream.m(this.D, d0(), size(), true);
        }

        public final int H(int i2, int i3, int i4) {
            return Internal.i(i2, this.D, d0() + i3, i4);
        }

        public final int J(int i2, int i3, int i4) {
            int d0 = d0() + i3;
            return Utf8.w(i2, this.D, d0, i4 + d0);
        }

        public final ByteString M(int i2, int i3) {
            int n2 = ByteString.n(i2, i3, size());
            return n2 == 0 ? ByteString.f20770A : new BoundedByteString(this.D, d0() + i2, n2);
        }

        public final String S(Charset charset) {
            return new String(this.D, d0(), size(), charset);
        }

        public final void Z(ByteOutput byteOutput) {
            byteOutput.c(this.D, d0(), size());
        }

        public final boolean b0(ByteString byteString, int i2, int i3) {
            if (i3 <= byteString.size()) {
                int i4 = i2 + i3;
                if (i4 > byteString.size()) {
                    throw new IllegalArgumentException("Ran off end of other: " + i2 + ", " + i3 + ", " + byteString.size());
                } else if (!(byteString instanceof LiteralByteString)) {
                    return byteString.M(i2, i4).equals(M(0, i3));
                } else {
                    LiteralByteString literalByteString = (LiteralByteString) byteString;
                    byte[] bArr = this.D;
                    byte[] bArr2 = literalByteString.D;
                    int d0 = d0() + i3;
                    int d02 = d0();
                    int d03 = literalByteString.d0() + i2;
                    while (d02 < d0) {
                        if (bArr[d02] != bArr2[d03]) {
                            return false;
                        }
                        d02++;
                        d03++;
                    }
                    return true;
                }
            } else {
                throw new IllegalArgumentException("Length too large: " + i3 + size());
            }
        }

        public int d0() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ByteString) || size() != ((ByteString) obj).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof LiteralByteString)) {
                return obj.equals(this);
            }
            LiteralByteString literalByteString = (LiteralByteString) obj;
            int K = K();
            int K2 = literalByteString.K();
            if (K == 0 || K2 == 0 || K == K2) {
                return b0(literalByteString, 0, size());
            }
            return false;
        }

        public final ByteBuffer g() {
            return ByteBuffer.wrap(this.D, d0(), size()).asReadOnlyBuffer();
        }

        public byte i(int i2) {
            return this.D[i2];
        }

        public int size() {
            return this.D.length;
        }

        public void w(byte[] bArr, int i2, int i3, int i4) {
            System.arraycopy(this.D, i2, bArr, i3, i4);
        }
    }

    public static final class NioByteString extends LeafByteString {
        public final ByteBuffer D;

        public NioByteString(ByteBuffer byteBuffer) {
            super();
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
            return CodedInputStream.j(this.D, true);
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
            byteOutput.b(this.D.slice());
        }

        public boolean b0(ByteString byteString, int i2, int i3) {
            return M(0, i3).equals(byteString.M(i2, i3 + i2));
        }

        public final ByteBuffer d0(int i2, int i3) {
            if (i2 < this.D.position() || i3 > this.D.limit() || i2 > i3) {
                throw new IllegalArgumentException(String.format("Invalid indices [%d, %d]", new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}));
            }
            ByteBuffer slice = this.D.slice();
            Java8Compatibility.c(slice, i2 - this.D.position());
            Java8Compatibility.a(slice, i3 - this.D.position());
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
            Java8Compatibility.c(slice, i2);
            slice.get(bArr, i3, i4);
        }

        /* renamed from: androidx.datastore.preferences.protobuf.ByteString$NioByteString$1  reason: invalid class name */
        class AnonymousClass1 extends InputStream {

            /* renamed from: z  reason: collision with root package name */
            public final ByteBuffer f20778z;

            public int available() {
                return this.f20778z.remaining();
            }

            public void mark(int i2) {
                Java8Compatibility.b(this.f20778z);
            }

            public boolean markSupported() {
                return true;
            }

            public int read() {
                if (!this.f20778z.hasRemaining()) {
                    return -1;
                }
                return this.f20778z.get() & 255;
            }

            public void reset() {
                try {
                    Java8Compatibility.d(this.f20778z);
                } catch (InvalidMarkException e2) {
                    throw new IOException(e2);
                }
            }

            public int read(byte[] bArr, int i2, int i3) {
                if (!this.f20778z.hasRemaining()) {
                    return -1;
                }
                int min = Math.min(i3, this.f20778z.remaining());
                this.f20778z.get(bArr, i2, min);
                return min;
            }
        }
    }

    public static final class SystemByteArrayCopier implements ByteArrayCopier {
        public SystemByteArrayCopier() {
        }

        public byte[] a(byte[] bArr, int i2, int i3) {
            byte[] bArr2 = new byte[i3];
            System.arraycopy(bArr, i2, bArr2, 0, i3);
            return bArr2;
        }
    }

    public static CodedBuilder E(int i2) {
        return new CodedBuilder(i2);
    }

    public static int Q(byte b2) {
        return b2 & 255;
    }

    public static ByteString W(ByteBuffer byteBuffer) {
        if (!byteBuffer.hasArray()) {
            return new NioByteString(byteBuffer);
        }
        return Y(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
    }

    public static ByteString X(byte[] bArr) {
        return new LiteralByteString(bArr);
    }

    public static ByteString Y(byte[] bArr, int i2, int i3) {
        return new BoundedByteString(bArr, i2, i3);
    }

    public static ByteString h(Iterator it, int i2) {
        if (i2 < 1) {
            throw new IllegalArgumentException(String.format("length (%s) must be >= 1", new Object[]{Integer.valueOf(i2)}));
        } else if (i2 == 1) {
            return (ByteString) it.next();
        } else {
            int i3 = i2 >>> 1;
            return h(it, i3).o(h(it, i2 - i3));
        }
    }

    public static void m(int i2, int i3) {
        if (((i3 - (i2 + 1)) | i2) >= 0) {
            return;
        }
        if (i2 < 0) {
            throw new ArrayIndexOutOfBoundsException("Index < 0: " + i2);
        }
        throw new ArrayIndexOutOfBoundsException("Index > length: " + i2 + ", " + i3);
    }

    public static int n(int i2, int i3, int i4) {
        int i5 = i3 - i2;
        if ((i2 | i3 | i5 | (i4 - i3)) >= 0) {
            return i5;
        }
        if (i2 < 0) {
            throw new IndexOutOfBoundsException("Beginning index: " + i2 + " < 0");
        } else if (i3 < i2) {
            throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i2 + ", " + i3);
        } else {
            throw new IndexOutOfBoundsException("End index: " + i3 + " >= " + i4);
        }
    }

    public static ByteString p(Iterable iterable) {
        int i2;
        if (!(iterable instanceof Collection)) {
            Iterator it = iterable.iterator();
            i2 = 0;
            while (it.hasNext()) {
                it.next();
                i2++;
            }
        } else {
            i2 = ((Collection) iterable).size();
        }
        return i2 == 0 ? f20770A : h(iterable.iterator(), i2);
    }

    public static ByteString q(byte[] bArr) {
        return s(bArr, 0, bArr.length);
    }

    public static ByteString s(byte[] bArr, int i2, int i3) {
        n(i2, i2 + i3, bArr.length);
        return new LiteralByteString(f20771B.a(bArr, i2, i3));
    }

    public static ByteString u(String str) {
        return new LiteralByteString(str.getBytes(Internal.f21003b));
    }

    public abstract byte A(int i2);

    public abstract boolean B();

    public abstract boolean C();

    /* renamed from: D */
    public ByteIterator iterator() {
        return new AbstractByteIterator() {

            /* renamed from: A  reason: collision with root package name */
            public final int f20773A;

            /* renamed from: z  reason: collision with root package name */
            public int f20775z = 0;

            {
                this.f20773A = ByteString.this.size();
            }

            public boolean hasNext() {
                return this.f20775z < this.f20773A;
            }

            public byte p() {
                int i2 = this.f20775z;
                if (i2 < this.f20773A) {
                    this.f20775z = i2 + 1;
                    return ByteString.this.A(i2);
                }
                throw new NoSuchElementException();
            }
        };
    }

    public abstract CodedInputStream F();

    public abstract int H(int i2, int i3, int i4);

    public abstract int J(int i2, int i3, int i4);

    public final int K() {
        return this.f20772z;
    }

    public final ByteString L(int i2) {
        return M(i2, size());
    }

    public abstract ByteString M(int i2, int i3);

    public final byte[] P() {
        int size = size();
        if (size == 0) {
            return Internal.f21005d;
        }
        byte[] bArr = new byte[size];
        w(bArr, 0, 0, size);
        return bArr;
    }

    public final String R(Charset charset) {
        return size() == 0 ? "" : S(charset);
    }

    public abstract String S(Charset charset);

    public final String U() {
        return R(Internal.f21003b);
    }

    public final String V() {
        if (size() <= 50) {
            return TextFormatEscaper.a(this);
        }
        return TextFormatEscaper.a(M(0, 47)) + "...";
    }

    public abstract void Z(ByteOutput byteOutput);

    public abstract void a0(ByteOutput byteOutput);

    public abstract boolean equals(Object obj);

    public abstract ByteBuffer g();

    public final int hashCode() {
        int i2 = this.f20772z;
        if (i2 == 0) {
            int size = size();
            i2 = H(size, 0, size);
            if (i2 == 0) {
                i2 = 1;
            }
            this.f20772z = i2;
        }
        return i2;
    }

    public abstract byte i(int i2);

    public final boolean isEmpty() {
        return size() == 0;
    }

    public final ByteString o(ByteString byteString) {
        if (Integer.MAX_VALUE - size() >= byteString.size()) {
            return RopeByteString.h0(this, byteString);
        }
        throw new IllegalArgumentException("ByteString would be too long: " + size() + "+" + byteString.size());
    }

    public abstract int size();

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", new Object[]{Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()), V()});
    }

    public final void v(byte[] bArr, int i2, int i3, int i4) {
        n(i2, i2 + i4, size());
        n(i3, i3 + i4, bArr.length);
        if (i4 > 0) {
            w(bArr, i2, i3, i4);
        }
    }

    public abstract void w(byte[] bArr, int i2, int i3, int i4);

    public abstract int z();

    public static final class Output extends OutputStream {
        public static final byte[] E = new byte[0];

        /* renamed from: A  reason: collision with root package name */
        public final ArrayList f20779A;

        /* renamed from: B  reason: collision with root package name */
        public int f20780B;
        public byte[] C;
        public int D;

        /* renamed from: z  reason: collision with root package name */
        public final int f20781z;

        public final void a(int i2) {
            this.f20779A.add(new LiteralByteString(this.C));
            int length = this.f20780B + this.C.length;
            this.f20780B = length;
            this.C = new byte[Math.max(this.f20781z, Math.max(i2, length >>> 1))];
            this.D = 0;
        }

        public synchronized int b() {
            return this.f20780B + this.D;
        }

        public String toString() {
            return String.format("<ByteString.Output@%s size=%d>", new Object[]{Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(b())});
        }

        public synchronized void write(int i2) {
            try {
                if (this.D == this.C.length) {
                    a(1);
                }
                byte[] bArr = this.C;
                int i3 = this.D;
                this.D = i3 + 1;
                bArr[i3] = (byte) i2;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }

        public synchronized void write(byte[] bArr, int i2, int i3) {
            try {
                byte[] bArr2 = this.C;
                int length = bArr2.length;
                int i4 = this.D;
                if (i3 <= length - i4) {
                    System.arraycopy(bArr, i2, bArr2, i4, i3);
                    this.D += i3;
                } else {
                    int length2 = bArr2.length - i4;
                    System.arraycopy(bArr, i2, bArr2, i4, length2);
                    int i5 = i3 - length2;
                    a(i5);
                    System.arraycopy(bArr, i2 + length2, this.C, 0, i5);
                    this.D = i5;
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
    }
}
