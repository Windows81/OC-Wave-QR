package com.google.protobuf;

import com.google.protobuf.ByteString;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

final class RopeByteString extends ByteString {
    public static final int[] I = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};
    public final int D;
    public final ByteString E;
    public final ByteString F;
    public final int G;
    public final int H;

    public static class Balancer {

        /* renamed from: a  reason: collision with root package name */
        public final ArrayDeque f32278a;

        public Balancer() {
            this.f32278a = new ArrayDeque();
        }

        public final ByteString b(ByteString byteString, ByteString byteString2) {
            c(byteString);
            c(byteString2);
            ByteString byteString3 = (ByteString) this.f32278a.pop();
            while (!this.f32278a.isEmpty()) {
                byteString3 = new RopeByteString((ByteString) this.f32278a.pop(), byteString3);
            }
            return byteString3;
        }

        public final void c(ByteString byteString) {
            if (byteString.B()) {
                e(byteString);
            } else if (byteString instanceof RopeByteString) {
                RopeByteString ropeByteString = (RopeByteString) byteString;
                c(ropeByteString.E);
                c(ropeByteString.F);
            } else {
                throw new IllegalArgumentException("Has a new type of ByteString been created? Found " + byteString.getClass());
            }
        }

        public final int d(int i2) {
            int binarySearch = Arrays.binarySearch(RopeByteString.I, i2);
            return binarySearch < 0 ? (-(binarySearch + 1)) - 1 : binarySearch;
        }

        public final void e(ByteString byteString) {
            int d2 = d(byteString.size());
            int k0 = RopeByteString.k0(d2 + 1);
            if (this.f32278a.isEmpty() || ((ByteString) this.f32278a.peek()).size() >= k0) {
                this.f32278a.push(byteString);
                return;
            }
            int k02 = RopeByteString.k0(d2);
            ByteString byteString2 = (ByteString) this.f32278a.pop();
            while (!this.f32278a.isEmpty() && ((ByteString) this.f32278a.peek()).size() < k02) {
                byteString2 = new RopeByteString((ByteString) this.f32278a.pop(), byteString2);
            }
            RopeByteString ropeByteString = new RopeByteString(byteString2, byteString);
            while (!this.f32278a.isEmpty() && ((ByteString) this.f32278a.peek()).size() < RopeByteString.k0(d(ropeByteString.size()) + 1)) {
                ropeByteString = new RopeByteString((ByteString) this.f32278a.pop(), ropeByteString);
            }
            this.f32278a.push(ropeByteString);
        }
    }

    public static final class PieceIterator implements Iterator<ByteString.LeafByteString> {

        /* renamed from: A  reason: collision with root package name */
        public ByteString.LeafByteString f32279A;

        /* renamed from: z  reason: collision with root package name */
        public final ArrayDeque f32280z;

        public final ByteString.LeafByteString b(ByteString byteString) {
            while (byteString instanceof RopeByteString) {
                RopeByteString ropeByteString = (RopeByteString) byteString;
                this.f32280z.push(ropeByteString);
                byteString = ropeByteString.E;
            }
            return (ByteString.LeafByteString) byteString;
        }

        public final ByteString.LeafByteString c() {
            ByteString.LeafByteString b2;
            do {
                ArrayDeque arrayDeque = this.f32280z;
                if (arrayDeque == null || arrayDeque.isEmpty()) {
                    return null;
                }
                b2 = b(((RopeByteString) this.f32280z.pop()).F);
            } while (b2.isEmpty());
            return b2;
        }

        /* renamed from: d */
        public ByteString.LeafByteString next() {
            ByteString.LeafByteString leafByteString = this.f32279A;
            if (leafByteString != null) {
                this.f32279A = c();
                return leafByteString;
            }
            throw new NoSuchElementException();
        }

        public boolean hasNext() {
            return this.f32279A != null;
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }

        public PieceIterator(ByteString byteString) {
            if (byteString instanceof RopeByteString) {
                RopeByteString ropeByteString = (RopeByteString) byteString;
                ArrayDeque arrayDeque = new ArrayDeque(ropeByteString.z());
                this.f32280z = arrayDeque;
                arrayDeque.push(ropeByteString);
                this.f32279A = b(ropeByteString.E);
                return;
            }
            this.f32280z = null;
            this.f32279A = (ByteString.LeafByteString) byteString;
        }
    }

    public static ByteString h0(ByteString byteString, ByteString byteString2) {
        if (byteString2.size() == 0) {
            return byteString;
        }
        if (byteString.size() == 0) {
            return byteString2;
        }
        int size = byteString.size() + byteString2.size();
        if (size < 128) {
            return i0(byteString, byteString2);
        }
        if (byteString instanceof RopeByteString) {
            RopeByteString ropeByteString = (RopeByteString) byteString;
            if (ropeByteString.F.size() + byteString2.size() < 128) {
                return new RopeByteString(ropeByteString.E, i0(ropeByteString.F, byteString2));
            } else if (ropeByteString.E.z() > ropeByteString.F.z() && ropeByteString.z() > byteString2.z()) {
                return new RopeByteString(ropeByteString.E, new RopeByteString(ropeByteString.F, byteString2));
            }
        }
        return size >= k0(Math.max(byteString.z(), byteString2.z()) + 1) ? new RopeByteString(byteString, byteString2) : new Balancer().b(byteString, byteString2);
    }

    public static ByteString i0(ByteString byteString, ByteString byteString2) {
        int size = byteString.size();
        int size2 = byteString2.size();
        byte[] bArr = new byte[(size + size2)];
        byteString.v(bArr, 0, 0, size);
        byteString2.v(bArr, 0, size, size2);
        return ByteString.X(bArr);
    }

    public static int k0(int i2) {
        int[] iArr = I;
        if (i2 >= iArr.length) {
            return Integer.MAX_VALUE;
        }
        return iArr[i2];
    }

    public byte A(int i2) {
        int i3 = this.G;
        return i2 < i3 ? this.E.A(i2) : this.F.A(i2 - i3);
    }

    public boolean B() {
        return this.D >= k0(this.H);
    }

    public boolean C() {
        int J = this.E.J(0, 0, this.G);
        ByteString byteString = this.F;
        return byteString.J(J, 0, byteString.size()) == 0;
    }

    /* renamed from: D */
    public ByteString.ByteIterator iterator() {
        return new ByteString.AbstractByteIterator() {

            /* renamed from: A  reason: collision with root package name */
            public ByteString.ByteIterator f32275A = c();

            /* renamed from: z  reason: collision with root package name */
            public final PieceIterator f32277z;

            {
                this.f32277z = new PieceIterator(RopeByteString.this);
            }

            public final ByteString.ByteIterator c() {
                if (this.f32277z.hasNext()) {
                    return this.f32277z.next().iterator();
                }
                return null;
            }

            public boolean hasNext() {
                return this.f32275A != null;
            }

            public byte p() {
                ByteString.ByteIterator byteIterator = this.f32275A;
                if (byteIterator != null) {
                    byte p2 = byteIterator.p();
                    if (!this.f32275A.hasNext()) {
                        this.f32275A = c();
                    }
                    return p2;
                }
                throw new NoSuchElementException();
            }
        };
    }

    public CodedInputStream F() {
        return CodedInputStream.h(f0(), true);
    }

    public int H(int i2, int i3, int i4) {
        int i5 = i3 + i4;
        int i6 = this.G;
        if (i5 <= i6) {
            return this.E.H(i2, i3, i4);
        }
        if (i3 >= i6) {
            return this.F.H(i2, i3 - i6, i4);
        }
        int i7 = i6 - i3;
        return this.F.H(this.E.H(i2, i3, i7), 0, i4 - i7);
    }

    public int J(int i2, int i3, int i4) {
        int i5 = i3 + i4;
        int i6 = this.G;
        if (i5 <= i6) {
            return this.E.J(i2, i3, i4);
        }
        if (i3 >= i6) {
            return this.F.J(i2, i3 - i6, i4);
        }
        int i7 = i6 - i3;
        return this.F.J(this.E.J(i2, i3, i7), 0, i4 - i7);
    }

    public ByteString M(int i2, int i3) {
        int n2 = ByteString.n(i2, i3, this.D);
        if (n2 == 0) {
            return ByteString.f31983A;
        }
        if (n2 == this.D) {
            return this;
        }
        int i4 = this.G;
        return i3 <= i4 ? this.E.M(i2, i3) : i2 >= i4 ? this.F.M(i2 - i4, i3 - i4) : new RopeByteString(this.E.L(i2), this.F.M(0, i3 - this.G));
    }

    public String S(Charset charset) {
        return new String(P(), charset);
    }

    public void Z(ByteOutput byteOutput) {
        this.E.Z(byteOutput);
        this.F.Z(byteOutput);
    }

    public void a0(ByteOutput byteOutput) {
        this.F.a0(byteOutput);
        this.E.a0(byteOutput);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ByteString)) {
            return false;
        }
        ByteString byteString = (ByteString) obj;
        if (this.D != byteString.size()) {
            return false;
        }
        if (this.D == 0) {
            return true;
        }
        int K = K();
        int K2 = byteString.K();
        if (K == 0 || K2 == 0 || K == K2) {
            return j0(byteString);
        }
        return false;
    }

    public List f0() {
        ArrayList arrayList = new ArrayList();
        PieceIterator pieceIterator = new PieceIterator(this);
        while (pieceIterator.hasNext()) {
            arrayList.add(pieceIterator.next().g());
        }
        return arrayList;
    }

    public ByteBuffer g() {
        return ByteBuffer.wrap(P()).asReadOnlyBuffer();
    }

    public byte i(int i2) {
        ByteString.m(i2, this.D);
        return A(i2);
    }

    public final boolean j0(ByteString byteString) {
        PieceIterator pieceIterator = new PieceIterator(this);
        ByteString.LeafByteString leafByteString = (ByteString.LeafByteString) pieceIterator.next();
        PieceIterator pieceIterator2 = new PieceIterator(byteString);
        ByteString.LeafByteString leafByteString2 = (ByteString.LeafByteString) pieceIterator2.next();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int size = leafByteString.size() - i2;
            int size2 = leafByteString2.size() - i3;
            int min = Math.min(size, size2);
            if (!(i2 == 0 ? leafByteString.b0(leafByteString2, i3, min) : leafByteString2.b0(leafByteString, i2, min))) {
                return false;
            }
            i4 += min;
            int i5 = this.D;
            if (i4 < i5) {
                if (min == size) {
                    leafByteString = (ByteString.LeafByteString) pieceIterator.next();
                    i2 = 0;
                } else {
                    i2 += min;
                }
                if (min == size2) {
                    leafByteString2 = (ByteString.LeafByteString) pieceIterator2.next();
                    i3 = 0;
                } else {
                    i3 += min;
                }
            } else if (i4 == i5) {
                return true;
            } else {
                throw new IllegalStateException();
            }
        }
    }

    public int size() {
        return this.D;
    }

    public void w(byte[] bArr, int i2, int i3, int i4) {
        int i5 = i2 + i4;
        int i6 = this.G;
        if (i5 <= i6) {
            this.E.w(bArr, i2, i3, i4);
        } else if (i2 >= i6) {
            this.F.w(bArr, i2 - i6, i3, i4);
        } else {
            int i7 = i6 - i2;
            this.E.w(bArr, i2, i3, i7);
            this.F.w(bArr, 0, i3 + i7, i4 - i7);
        }
    }

    public int z() {
        return this.H;
    }

    public RopeByteString(ByteString byteString, ByteString byteString2) {
        this.E = byteString;
        this.F = byteString2;
        int size = byteString.size();
        this.G = size;
        this.D = size + byteString2.size();
        this.H = Math.max(byteString.z(), byteString2.z()) + 1;
    }

    public class RopeInputStream extends InputStream {

        /* renamed from: A  reason: collision with root package name */
        public ByteString.LeafByteString f32281A;

        /* renamed from: B  reason: collision with root package name */
        public int f32282B;
        public int C;
        public int D;
        public int E;
        public final /* synthetic */ RopeByteString F;

        /* renamed from: z  reason: collision with root package name */
        public PieceIterator f32283z;

        public final void a() {
            int i2;
            if (this.f32281A != null && this.C == (i2 = this.f32282B)) {
                this.D += i2;
                this.C = 0;
                if (this.f32283z.hasNext()) {
                    ByteString.LeafByteString d2 = this.f32283z.next();
                    this.f32281A = d2;
                    this.f32282B = d2.size();
                    return;
                }
                this.f32281A = null;
                this.f32282B = 0;
            }
        }

        public int available() {
            return b();
        }

        public final int b() {
            return this.F.size() - (this.D + this.C);
        }

        public final void c() {
            PieceIterator pieceIterator = new PieceIterator(this.F);
            this.f32283z = pieceIterator;
            ByteString.LeafByteString d2 = pieceIterator.next();
            this.f32281A = d2;
            this.f32282B = d2.size();
            this.C = 0;
            this.D = 0;
        }

        public final int d(byte[] bArr, int i2, int i3) {
            int i4 = i3;
            while (i4 > 0) {
                a();
                if (this.f32281A == null) {
                    break;
                }
                int min = Math.min(this.f32282B - this.C, i4);
                if (bArr != null) {
                    this.f32281A.v(bArr, this.C, i2, min);
                    i2 += min;
                }
                this.C += min;
                i4 -= min;
            }
            return i3 - i4;
        }

        public void mark(int i2) {
            this.E = this.D + this.C;
        }

        public boolean markSupported() {
            return true;
        }

        public int read(byte[] bArr, int i2, int i3) {
            bArr.getClass();
            if (i2 < 0 || i3 < 0 || i3 > bArr.length - i2) {
                throw new IndexOutOfBoundsException();
            }
            int d2 = d(bArr, i2, i3);
            if (d2 != 0) {
                return d2;
            }
            if (i3 > 0 || b() == 0) {
                return -1;
            }
            return d2;
        }

        public synchronized void reset() {
            c();
            d((byte[]) null, 0, this.E);
        }

        public long skip(long j2) {
            if (j2 >= 0) {
                if (j2 > 2147483647L) {
                    j2 = 2147483647L;
                }
                return (long) d((byte[]) null, 0, (int) j2);
            }
            throw new IndexOutOfBoundsException();
        }

        public int read() {
            a();
            ByteString.LeafByteString leafByteString = this.f32281A;
            if (leafByteString == null) {
                return -1;
            }
            int i2 = this.C;
            this.C = i2 + 1;
            return leafByteString.i(i2) & 255;
        }
    }
}
