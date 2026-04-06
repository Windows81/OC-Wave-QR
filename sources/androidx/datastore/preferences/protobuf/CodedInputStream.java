package androidx.datastore.preferences.protobuf;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public abstract class CodedInputStream {

    /* renamed from: f  reason: collision with root package name */
    public static volatile int f20783f = 100;

    /* renamed from: a  reason: collision with root package name */
    public int f20784a;

    /* renamed from: b  reason: collision with root package name */
    public int f20785b;

    /* renamed from: c  reason: collision with root package name */
    public int f20786c;

    /* renamed from: d  reason: collision with root package name */
    public CodedInputStreamReader f20787d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f20788e;

    public static final class ArrayDecoder extends CodedInputStream {

        /* renamed from: g  reason: collision with root package name */
        public final byte[] f20789g;

        /* renamed from: h  reason: collision with root package name */
        public final boolean f20790h;

        /* renamed from: i  reason: collision with root package name */
        public int f20791i;

        /* renamed from: j  reason: collision with root package name */
        public int f20792j;

        /* renamed from: k  reason: collision with root package name */
        public int f20793k;

        /* renamed from: l  reason: collision with root package name */
        public int f20794l;

        /* renamed from: m  reason: collision with root package name */
        public int f20795m;

        /* renamed from: n  reason: collision with root package name */
        public boolean f20796n;

        /* renamed from: o  reason: collision with root package name */
        public int f20797o;

        public int A() {
            return CodedInputStream.c(N());
        }

        public long B() {
            return CodedInputStream.d(O());
        }

        public String C() {
            int N = N();
            if (N > 0) {
                int i2 = this.f20791i;
                int i3 = this.f20793k;
                if (N <= i2 - i3) {
                    String str = new String(this.f20789g, i3, N, Internal.f21003b);
                    this.f20793k += N;
                    return str;
                }
            }
            if (N == 0) {
                return "";
            }
            if (N < 0) {
                throw InvalidProtocolBufferException.g();
            }
            throw InvalidProtocolBufferException.m();
        }

        public String D() {
            int N = N();
            if (N > 0) {
                int i2 = this.f20791i;
                int i3 = this.f20793k;
                if (N <= i2 - i3) {
                    String h2 = Utf8.h(this.f20789g, i3, N);
                    this.f20793k += N;
                    return h2;
                }
            }
            if (N == 0) {
                return "";
            }
            if (N <= 0) {
                throw InvalidProtocolBufferException.g();
            }
            throw InvalidProtocolBufferException.m();
        }

        public int E() {
            if (f()) {
                this.f20795m = 0;
                return 0;
            }
            int N = N();
            this.f20795m = N;
            if (WireFormat.a(N) != 0) {
                return this.f20795m;
            }
            throw InvalidProtocolBufferException.c();
        }

        public int F() {
            return N();
        }

        public long G() {
            return O();
        }

        public boolean H(int i2) {
            int b2 = WireFormat.b(i2);
            if (b2 == 0) {
                S();
                return true;
            } else if (b2 == 1) {
                R(8);
                return true;
            } else if (b2 == 2) {
                R(N());
                return true;
            } else if (b2 == 3) {
                I();
                a(WireFormat.c(WireFormat.a(i2), 4));
                return true;
            } else if (b2 == 4) {
                return false;
            } else {
                if (b2 == 5) {
                    R(4);
                    return true;
                }
                throw InvalidProtocolBufferException.e();
            }
        }

        public byte J() {
            int i2 = this.f20793k;
            if (i2 != this.f20791i) {
                byte[] bArr = this.f20789g;
                this.f20793k = i2 + 1;
                return bArr[i2];
            }
            throw InvalidProtocolBufferException.m();
        }

        public byte[] K(int i2) {
            if (i2 > 0) {
                int i3 = this.f20791i;
                int i4 = this.f20793k;
                if (i2 <= i3 - i4) {
                    int i5 = i2 + i4;
                    this.f20793k = i5;
                    return Arrays.copyOfRange(this.f20789g, i4, i5);
                }
            }
            if (i2 > 0) {
                throw InvalidProtocolBufferException.m();
            } else if (i2 == 0) {
                return Internal.f21005d;
            } else {
                throw InvalidProtocolBufferException.g();
            }
        }

        public int L() {
            int i2 = this.f20793k;
            if (this.f20791i - i2 >= 4) {
                byte[] bArr = this.f20789g;
                this.f20793k = i2 + 4;
                return ((bArr[i2 + 3] & 255) << 24) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16);
            }
            throw InvalidProtocolBufferException.m();
        }

        public long M() {
            int i2 = this.f20793k;
            if (this.f20791i - i2 >= 8) {
                byte[] bArr = this.f20789g;
                this.f20793k = i2 + 8;
                return ((((long) bArr[i2 + 7]) & 255) << 56) | (((long) bArr[i2]) & 255) | ((((long) bArr[i2 + 1]) & 255) << 8) | ((((long) bArr[i2 + 2]) & 255) << 16) | ((((long) bArr[i2 + 3]) & 255) << 24) | ((((long) bArr[i2 + 4]) & 255) << 32) | ((((long) bArr[i2 + 5]) & 255) << 40) | ((((long) bArr[i2 + 6]) & 255) << 48);
            }
            throw InvalidProtocolBufferException.m();
        }

        public int N() {
            byte b2;
            byte b3;
            int i2 = this.f20793k;
            int i3 = this.f20791i;
            if (i3 != i2) {
                byte[] bArr = this.f20789g;
                int i4 = i2 + 1;
                byte b4 = bArr[i2];
                if (b4 >= 0) {
                    this.f20793k = i4;
                    return b4;
                } else if (i3 - i4 >= 9) {
                    int i5 = i2 + 2;
                    byte b5 = (bArr[i4] << 7) ^ b4;
                    if (b5 < 0) {
                        b2 = b5 ^ Byte.MIN_VALUE;
                    } else {
                        int i6 = i2 + 3;
                        byte b6 = (bArr[i5] << 14) ^ b5;
                        if (b6 >= 0) {
                            b3 = b6 ^ 16256;
                        } else {
                            int i7 = i2 + 4;
                            byte b7 = b6 ^ (bArr[i6] << 21);
                            if (b7 < 0) {
                                b2 = -2080896 ^ b7;
                            } else {
                                i6 = i2 + 5;
                                byte b8 = bArr[i7];
                                byte b9 = (b7 ^ (b8 << 28)) ^ 266354560;
                                if (b8 < 0) {
                                    i7 = i2 + 6;
                                    if (bArr[i6] < 0) {
                                        i6 = i2 + 7;
                                        if (bArr[i7] < 0) {
                                            i7 = i2 + 8;
                                            if (bArr[i6] < 0) {
                                                i6 = i2 + 9;
                                                if (bArr[i7] < 0) {
                                                    int i8 = i2 + 10;
                                                    if (bArr[i6] >= 0) {
                                                        byte b10 = b9;
                                                        i5 = i8;
                                                        b2 = b10;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    b2 = b9;
                                }
                                b3 = b9;
                            }
                            i5 = i7;
                        }
                        i5 = i6;
                    }
                    this.f20793k = i5;
                    return b2;
                }
            }
            return (int) P();
        }

        public long O() {
            long j2;
            long j3;
            long j4;
            int i2 = this.f20793k;
            int i3 = this.f20791i;
            if (i3 != i2) {
                byte[] bArr = this.f20789g;
                int i4 = i2 + 1;
                byte b2 = bArr[i2];
                if (b2 >= 0) {
                    this.f20793k = i4;
                    return (long) b2;
                } else if (i3 - i4 >= 9) {
                    int i5 = i2 + 2;
                    byte b3 = (bArr[i4] << 7) ^ b2;
                    if (b3 < 0) {
                        j2 = (long) (b3 ^ Byte.MIN_VALUE);
                    } else {
                        int i6 = i2 + 3;
                        byte b4 = (bArr[i5] << 14) ^ b3;
                        if (b4 >= 0) {
                            j2 = (long) (b4 ^ 16256);
                            i5 = i6;
                        } else {
                            int i7 = i2 + 4;
                            byte b5 = b4 ^ (bArr[i6] << 21);
                            if (b5 < 0) {
                                i5 = i7;
                                j2 = (long) (-2080896 ^ b5);
                            } else {
                                long j5 = (long) b5;
                                int i8 = i2 + 5;
                                long j6 = j5 ^ (((long) bArr[i7]) << 28);
                                if (j6 >= 0) {
                                    j4 = 266354560;
                                } else {
                                    int i9 = i2 + 6;
                                    long j7 = j6 ^ (((long) bArr[i8]) << 35);
                                    if (j7 < 0) {
                                        j3 = -34093383808L;
                                    } else {
                                        i8 = i2 + 7;
                                        j6 = j7 ^ (((long) bArr[i9]) << 42);
                                        if (j6 >= 0) {
                                            j4 = 4363953127296L;
                                        } else {
                                            i9 = i2 + 8;
                                            j7 = j6 ^ (((long) bArr[i8]) << 49);
                                            if (j7 < 0) {
                                                j3 = -558586000294016L;
                                            } else {
                                                i5 = i2 + 9;
                                                long j8 = (j7 ^ (((long) bArr[i9]) << 56)) ^ 71499008037633920L;
                                                if (j8 < 0) {
                                                    int i10 = i2 + 10;
                                                    if (((long) bArr[i5]) >= 0) {
                                                        i5 = i10;
                                                    }
                                                }
                                                j2 = j8;
                                            }
                                        }
                                    }
                                    j2 = j7 ^ j3;
                                    i5 = i9;
                                }
                                j2 = j6 ^ j4;
                            }
                        }
                    }
                    this.f20793k = i5;
                    return j2;
                }
            }
            return P();
        }

        public long P() {
            long j2 = 0;
            for (int i2 = 0; i2 < 64; i2 += 7) {
                byte J = J();
                j2 |= ((long) (J & Byte.MAX_VALUE)) << i2;
                if ((J & 128) == 0) {
                    return j2;
                }
            }
            throw InvalidProtocolBufferException.f();
        }

        public final void Q() {
            int i2 = this.f20791i + this.f20792j;
            this.f20791i = i2;
            int i3 = i2 - this.f20794l;
            int i4 = this.f20797o;
            if (i3 > i4) {
                int i5 = i3 - i4;
                this.f20792j = i5;
                this.f20791i = i2 - i5;
                return;
            }
            this.f20792j = 0;
        }

        public void R(int i2) {
            if (i2 >= 0) {
                int i3 = this.f20791i;
                int i4 = this.f20793k;
                if (i2 <= i3 - i4) {
                    this.f20793k = i4 + i2;
                    return;
                }
            }
            if (i2 < 0) {
                throw InvalidProtocolBufferException.g();
            }
            throw InvalidProtocolBufferException.m();
        }

        public final void S() {
            if (this.f20791i - this.f20793k >= 10) {
                T();
            } else {
                U();
            }
        }

        public final void T() {
            int i2 = 0;
            while (i2 < 10) {
                byte[] bArr = this.f20789g;
                int i3 = this.f20793k;
                this.f20793k = i3 + 1;
                if (bArr[i3] < 0) {
                    i2++;
                } else {
                    return;
                }
            }
            throw InvalidProtocolBufferException.f();
        }

        public final void U() {
            int i2 = 0;
            while (i2 < 10) {
                if (J() < 0) {
                    i2++;
                } else {
                    return;
                }
            }
            throw InvalidProtocolBufferException.f();
        }

        public void a(int i2) {
            if (this.f20795m != i2) {
                throw InvalidProtocolBufferException.b();
            }
        }

        public int e() {
            return this.f20793k - this.f20794l;
        }

        public boolean f() {
            return this.f20793k == this.f20791i;
        }

        public void n(int i2) {
            this.f20797o = i2;
            Q();
        }

        public int o(int i2) {
            if (i2 >= 0) {
                int e2 = i2 + e();
                if (e2 >= 0) {
                    int i3 = this.f20797o;
                    if (e2 <= i3) {
                        this.f20797o = e2;
                        Q();
                        return i3;
                    }
                    throw InvalidProtocolBufferException.m();
                }
                throw InvalidProtocolBufferException.h();
            }
            throw InvalidProtocolBufferException.g();
        }

        public boolean p() {
            return O() != 0;
        }

        public ByteString q() {
            int N = N();
            if (N > 0) {
                int i2 = this.f20791i;
                int i3 = this.f20793k;
                if (N <= i2 - i3) {
                    ByteString s2 = (!this.f20790h || !this.f20796n) ? ByteString.s(this.f20789g, i3, N) : ByteString.Y(this.f20789g, i3, N);
                    this.f20793k += N;
                    return s2;
                }
            }
            return N == 0 ? ByteString.f20770A : ByteString.X(K(N));
        }

        public double r() {
            return Double.longBitsToDouble(M());
        }

        public int s() {
            return N();
        }

        public int t() {
            return L();
        }

        public long u() {
            return M();
        }

        public float v() {
            return Float.intBitsToFloat(L());
        }

        public int w() {
            return N();
        }

        public long x() {
            return O();
        }

        public int y() {
            return L();
        }

        public long z() {
            return M();
        }

        public ArrayDecoder(byte[] bArr, int i2, int i3, boolean z2) {
            super();
            this.f20797o = Integer.MAX_VALUE;
            this.f20789g = bArr;
            this.f20791i = i3 + i2;
            this.f20793k = i2;
            this.f20794l = i2;
            this.f20790h = z2;
        }
    }

    public static final class IterableDirectByteBufferDecoder extends CodedInputStream {

        /* renamed from: g  reason: collision with root package name */
        public final Iterable f20798g;

        /* renamed from: h  reason: collision with root package name */
        public final Iterator f20799h;

        /* renamed from: i  reason: collision with root package name */
        public ByteBuffer f20800i;

        /* renamed from: j  reason: collision with root package name */
        public final boolean f20801j;

        /* renamed from: k  reason: collision with root package name */
        public boolean f20802k;

        /* renamed from: l  reason: collision with root package name */
        public int f20803l;

        /* renamed from: m  reason: collision with root package name */
        public int f20804m;

        /* renamed from: n  reason: collision with root package name */
        public int f20805n;

        /* renamed from: o  reason: collision with root package name */
        public int f20806o;

        /* renamed from: p  reason: collision with root package name */
        public int f20807p;

        /* renamed from: q  reason: collision with root package name */
        public int f20808q;

        /* renamed from: r  reason: collision with root package name */
        public long f20809r;

        /* renamed from: s  reason: collision with root package name */
        public long f20810s;

        /* renamed from: t  reason: collision with root package name */
        public long f20811t;

        /* renamed from: u  reason: collision with root package name */
        public long f20812u;

        private void S() {
            int i2 = this.f20803l + this.f20804m;
            this.f20803l = i2;
            int i3 = i2 - this.f20808q;
            int i4 = this.f20805n;
            if (i3 > i4) {
                int i5 = i3 - i4;
                this.f20804m = i5;
                this.f20803l = i2 - i5;
                return;
            }
            this.f20804m = 0;
        }

        private void V() {
            int i2 = 0;
            while (i2 < 10) {
                if (L() < 0) {
                    i2++;
                } else {
                    return;
                }
            }
            throw InvalidProtocolBufferException.f();
        }

        public int A() {
            return CodedInputStream.c(P());
        }

        public long B() {
            return CodedInputStream.d(Q());
        }

        public String C() {
            int P = P();
            if (P > 0) {
                long j2 = (long) P;
                long j3 = this.f20812u;
                long j4 = this.f20809r;
                if (j2 <= j3 - j4) {
                    byte[] bArr = new byte[P];
                    UnsafeUtil.p(j4, bArr, 0, j2);
                    String str = new String(bArr, Internal.f21003b);
                    this.f20809r += j2;
                    return str;
                }
            }
            if (P > 0 && P <= T()) {
                byte[] bArr2 = new byte[P];
                M(bArr2, 0, P);
                return new String(bArr2, Internal.f21003b);
            } else if (P == 0) {
                return "";
            } else {
                if (P < 0) {
                    throw InvalidProtocolBufferException.g();
                }
                throw InvalidProtocolBufferException.m();
            }
        }

        public String D() {
            int P = P();
            if (P > 0) {
                long j2 = (long) P;
                long j3 = this.f20812u;
                long j4 = this.f20809r;
                if (j2 <= j3 - j4) {
                    String g2 = Utf8.g(this.f20800i, (int) (j4 - this.f20810s), P);
                    this.f20809r += j2;
                    return g2;
                }
            }
            if (P >= 0 && P <= T()) {
                byte[] bArr = new byte[P];
                M(bArr, 0, P);
                return Utf8.h(bArr, 0, P);
            } else if (P == 0) {
                return "";
            } else {
                if (P <= 0) {
                    throw InvalidProtocolBufferException.g();
                }
                throw InvalidProtocolBufferException.m();
            }
        }

        public int E() {
            if (f()) {
                this.f20806o = 0;
                return 0;
            }
            int P = P();
            this.f20806o = P;
            if (WireFormat.a(P) != 0) {
                return this.f20806o;
            }
            throw InvalidProtocolBufferException.c();
        }

        public int F() {
            return P();
        }

        public long G() {
            return Q();
        }

        public boolean H(int i2) {
            int b2 = WireFormat.b(i2);
            if (b2 == 0) {
                V();
                return true;
            } else if (b2 == 1) {
                U(8);
                return true;
            } else if (b2 == 2) {
                U(P());
                return true;
            } else if (b2 == 3) {
                I();
                a(WireFormat.c(WireFormat.a(i2), 4));
                return true;
            } else if (b2 == 4) {
                return false;
            } else {
                if (b2 == 5) {
                    U(4);
                    return true;
                }
                throw InvalidProtocolBufferException.e();
            }
        }

        public final long J() {
            return this.f20812u - this.f20809r;
        }

        public final void K() {
            if (this.f20799h.hasNext()) {
                X();
                return;
            }
            throw InvalidProtocolBufferException.m();
        }

        public byte L() {
            if (J() == 0) {
                K();
            }
            long j2 = this.f20809r;
            this.f20809r = 1 + j2;
            return UnsafeUtil.x(j2);
        }

        public final void M(byte[] bArr, int i2, int i3) {
            if (i3 >= 0 && i3 <= T()) {
                int i4 = i3;
                while (i4 > 0) {
                    if (J() == 0) {
                        K();
                    }
                    int min = Math.min(i4, (int) J());
                    long j2 = (long) min;
                    UnsafeUtil.p(this.f20809r, bArr, (long) ((i3 - i4) + i2), j2);
                    i4 -= min;
                    this.f20809r += j2;
                }
            } else if (i3 > 0) {
                throw InvalidProtocolBufferException.m();
            } else if (i3 != 0) {
                throw InvalidProtocolBufferException.g();
            }
        }

        public int N() {
            if (J() < 4) {
                return (L() & 255) | ((L() & 255) << 8) | ((L() & 255) << 16) | ((L() & 255) << 24);
            }
            long j2 = this.f20809r;
            this.f20809r = 4 + j2;
            return ((UnsafeUtil.x(j2 + 3) & 255) << 24) | (UnsafeUtil.x(j2) & 255) | ((UnsafeUtil.x(1 + j2) & 255) << 8) | ((UnsafeUtil.x(2 + j2) & 255) << 16);
        }

        public long O() {
            long L;
            byte L2;
            if (J() >= 8) {
                long j2 = this.f20809r;
                this.f20809r = 8 + j2;
                L = (((long) UnsafeUtil.x(j2)) & 255) | ((((long) UnsafeUtil.x(1 + j2)) & 255) << 8) | ((((long) UnsafeUtil.x(2 + j2)) & 255) << 16) | ((((long) UnsafeUtil.x(3 + j2)) & 255) << 24) | ((((long) UnsafeUtil.x(4 + j2)) & 255) << 32) | ((((long) UnsafeUtil.x(5 + j2)) & 255) << 40) | ((((long) UnsafeUtil.x(6 + j2)) & 255) << 48);
                L2 = UnsafeUtil.x(j2 + 7);
            } else {
                L = (((long) L()) & 255) | ((((long) L()) & 255) << 8) | ((((long) L()) & 255) << 16) | ((((long) L()) & 255) << 24) | ((((long) L()) & 255) << 32) | ((((long) L()) & 255) << 40) | ((((long) L()) & 255) << 48);
                L2 = L();
            }
            return ((((long) L2) & 255) << 56) | L;
        }

        public int P() {
            byte b2;
            byte b3;
            long j2 = this.f20809r;
            if (this.f20812u != j2) {
                long j3 = j2 + 1;
                byte x2 = UnsafeUtil.x(j2);
                if (x2 >= 0) {
                    this.f20809r++;
                    return x2;
                } else if (this.f20812u - this.f20809r >= 10) {
                    long j4 = 2 + j2;
                    byte x3 = (UnsafeUtil.x(j3) << 7) ^ x2;
                    if (x3 < 0) {
                        b2 = x3 ^ Byte.MIN_VALUE;
                    } else {
                        long j5 = 3 + j2;
                        byte x4 = (UnsafeUtil.x(j4) << 14) ^ x3;
                        if (x4 >= 0) {
                            b3 = x4 ^ 16256;
                        } else {
                            long j6 = 4 + j2;
                            byte x5 = x4 ^ (UnsafeUtil.x(j5) << 21);
                            if (x5 < 0) {
                                b2 = -2080896 ^ x5;
                            } else {
                                j5 = 5 + j2;
                                byte x6 = UnsafeUtil.x(j6);
                                byte b4 = (x5 ^ (x6 << 28)) ^ 266354560;
                                if (x6 < 0) {
                                    j6 = 6 + j2;
                                    if (UnsafeUtil.x(j5) < 0) {
                                        j5 = 7 + j2;
                                        if (UnsafeUtil.x(j6) < 0) {
                                            j6 = 8 + j2;
                                            if (UnsafeUtil.x(j5) < 0) {
                                                j5 = 9 + j2;
                                                if (UnsafeUtil.x(j6) < 0) {
                                                    long j7 = j2 + 10;
                                                    if (UnsafeUtil.x(j5) >= 0) {
                                                        long j8 = j7;
                                                        b2 = b4;
                                                        j4 = j8;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    b2 = b4;
                                }
                                b3 = b4;
                            }
                            j4 = j6;
                        }
                        j4 = j5;
                    }
                    this.f20809r = j4;
                    return b2;
                }
            }
            return (int) R();
        }

        public long Q() {
            long j2;
            long j3;
            long j4;
            long j5 = this.f20809r;
            if (this.f20812u != j5) {
                long j6 = j5 + 1;
                byte x2 = UnsafeUtil.x(j5);
                if (x2 >= 0) {
                    this.f20809r++;
                    return (long) x2;
                } else if (this.f20812u - this.f20809r >= 10) {
                    long j7 = 2 + j5;
                    byte x3 = (UnsafeUtil.x(j6) << 7) ^ x2;
                    if (x3 < 0) {
                        j2 = (long) (x3 ^ Byte.MIN_VALUE);
                    } else {
                        long j8 = 3 + j5;
                        byte x4 = (UnsafeUtil.x(j7) << 14) ^ x3;
                        if (x4 >= 0) {
                            j2 = (long) (x4 ^ 16256);
                            j7 = j8;
                        } else {
                            long j9 = 4 + j5;
                            byte x5 = x4 ^ (UnsafeUtil.x(j8) << 21);
                            if (x5 < 0) {
                                j2 = (long) (-2080896 ^ x5);
                                j7 = j9;
                            } else {
                                long j10 = 5 + j5;
                                long x6 = (((long) UnsafeUtil.x(j9)) << 28) ^ ((long) x5);
                                if (x6 >= 0) {
                                    j4 = 266354560;
                                } else {
                                    long j11 = 6 + j5;
                                    long x7 = x6 ^ (((long) UnsafeUtil.x(j10)) << 35);
                                    if (x7 < 0) {
                                        j3 = -34093383808L;
                                    } else {
                                        j10 = 7 + j5;
                                        x6 = x7 ^ (((long) UnsafeUtil.x(j11)) << 42);
                                        if (x6 >= 0) {
                                            j4 = 4363953127296L;
                                        } else {
                                            j11 = 8 + j5;
                                            x7 = x6 ^ (((long) UnsafeUtil.x(j10)) << 49);
                                            if (x7 < 0) {
                                                j3 = -558586000294016L;
                                            } else {
                                                j10 = 9 + j5;
                                                long x8 = (x7 ^ (((long) UnsafeUtil.x(j11)) << 56)) ^ 71499008037633920L;
                                                if (x8 < 0) {
                                                    long j12 = j5 + 10;
                                                    if (((long) UnsafeUtil.x(j10)) >= 0) {
                                                        long j13 = j12;
                                                        j2 = x8;
                                                        j7 = j13;
                                                    }
                                                } else {
                                                    j2 = x8;
                                                    j7 = j10;
                                                }
                                            }
                                        }
                                    }
                                    j2 = j3 ^ x7;
                                    j7 = j11;
                                }
                                j2 = j4 ^ x6;
                                j7 = j10;
                            }
                        }
                    }
                    this.f20809r = j7;
                    return j2;
                }
            }
            return R();
        }

        public long R() {
            long j2 = 0;
            for (int i2 = 0; i2 < 64; i2 += 7) {
                byte L = L();
                j2 |= ((long) (L & Byte.MAX_VALUE)) << i2;
                if ((L & 128) == 0) {
                    return j2;
                }
            }
            throw InvalidProtocolBufferException.f();
        }

        public final int T() {
            return (int) ((((long) (this.f20803l - this.f20807p)) - this.f20809r) + this.f20810s);
        }

        public void U(int i2) {
            if (i2 >= 0 && ((long) i2) <= (((long) (this.f20803l - this.f20807p)) - this.f20809r) + this.f20810s) {
                while (i2 > 0) {
                    if (J() == 0) {
                        K();
                    }
                    int min = Math.min(i2, (int) J());
                    i2 -= min;
                    this.f20809r += (long) min;
                }
            } else if (i2 < 0) {
                throw InvalidProtocolBufferException.g();
            } else {
                throw InvalidProtocolBufferException.m();
            }
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(3:6|7|8) */
        /* JADX WARNING: Code restructure failed: missing block: B:10:0x002e, code lost:
            throw r4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:5:0x0021, code lost:
            r4 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0027, code lost:
            throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.m();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0028, code lost:
            r2.position(r0);
            r2.limit(r1);
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0023 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.nio.ByteBuffer W(int r4, int r5) {
            /*
                r3 = this;
                java.nio.ByteBuffer r0 = r3.f20800i
                int r0 = r0.position()
                java.nio.ByteBuffer r1 = r3.f20800i
                int r1 = r1.limit()
                java.nio.ByteBuffer r2 = r3.f20800i
                r2.position(r4)     // Catch:{ IllegalArgumentException -> 0x0023 }
                r2.limit(r5)     // Catch:{ IllegalArgumentException -> 0x0023 }
                java.nio.ByteBuffer r4 = r3.f20800i     // Catch:{ IllegalArgumentException -> 0x0023 }
                java.nio.ByteBuffer r4 = r4.slice()     // Catch:{ IllegalArgumentException -> 0x0023 }
                r2.position(r0)
                r2.limit(r1)
                return r4
            L_0x0021:
                r4 = move-exception
                goto L_0x0028
            L_0x0023:
                androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r4 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.m()     // Catch:{ all -> 0x0021 }
                throw r4     // Catch:{ all -> 0x0021 }
            L_0x0028:
                r2.position(r0)
                r2.limit(r1)
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.CodedInputStream.IterableDirectByteBufferDecoder.W(int, int):java.nio.ByteBuffer");
        }

        public final void X() {
            ByteBuffer byteBuffer = (ByteBuffer) this.f20799h.next();
            this.f20800i = byteBuffer;
            this.f20807p += (int) (this.f20809r - this.f20810s);
            long position = (long) byteBuffer.position();
            this.f20809r = position;
            this.f20810s = position;
            this.f20812u = (long) this.f20800i.limit();
            long k2 = UnsafeUtil.k(this.f20800i);
            this.f20811t = k2;
            this.f20809r += k2;
            this.f20810s += k2;
            this.f20812u += k2;
        }

        public void a(int i2) {
            if (this.f20806o != i2) {
                throw InvalidProtocolBufferException.b();
            }
        }

        public int e() {
            return (int) ((((long) (this.f20807p - this.f20808q)) + this.f20809r) - this.f20810s);
        }

        public boolean f() {
            return (((long) this.f20807p) + this.f20809r) - this.f20810s == ((long) this.f20803l);
        }

        public void n(int i2) {
            this.f20805n = i2;
            S();
        }

        public int o(int i2) {
            if (i2 >= 0) {
                int e2 = i2 + e();
                int i3 = this.f20805n;
                if (e2 <= i3) {
                    this.f20805n = e2;
                    S();
                    return i3;
                }
                throw InvalidProtocolBufferException.m();
            }
            throw InvalidProtocolBufferException.g();
        }

        public boolean p() {
            return Q() != 0;
        }

        public ByteString q() {
            int P = P();
            if (P > 0) {
                long j2 = (long) P;
                long j3 = this.f20812u;
                long j4 = this.f20809r;
                if (j2 <= j3 - j4) {
                    if (!this.f20801j || !this.f20802k) {
                        byte[] bArr = new byte[P];
                        UnsafeUtil.p(j4, bArr, 0, j2);
                        this.f20809r += j2;
                        return ByteString.X(bArr);
                    }
                    int i2 = (int) (j4 - this.f20811t);
                    ByteString W = ByteString.W(W(i2, P + i2));
                    this.f20809r += j2;
                    return W;
                }
            }
            if (P <= 0 || P > T()) {
                if (P == 0) {
                    return ByteString.f20770A;
                }
                if (P < 0) {
                    throw InvalidProtocolBufferException.g();
                }
                throw InvalidProtocolBufferException.m();
            } else if (!this.f20801j || !this.f20802k) {
                byte[] bArr2 = new byte[P];
                M(bArr2, 0, P);
                return ByteString.X(bArr2);
            } else {
                ArrayList arrayList = new ArrayList();
                while (P > 0) {
                    if (J() == 0) {
                        K();
                    }
                    int min = Math.min(P, (int) J());
                    int i3 = (int) (this.f20809r - this.f20811t);
                    arrayList.add(ByteString.W(W(i3, i3 + min)));
                    P -= min;
                    this.f20809r += (long) min;
                }
                return ByteString.p(arrayList);
            }
        }

        public double r() {
            return Double.longBitsToDouble(O());
        }

        public int s() {
            return P();
        }

        public int t() {
            return N();
        }

        public long u() {
            return O();
        }

        public float v() {
            return Float.intBitsToFloat(N());
        }

        public int w() {
            return P();
        }

        public long x() {
            return Q();
        }

        public int y() {
            return N();
        }

        public long z() {
            return O();
        }

        public IterableDirectByteBufferDecoder(Iterable iterable, int i2, boolean z2) {
            super();
            this.f20805n = Integer.MAX_VALUE;
            this.f20803l = i2;
            this.f20798g = iterable;
            this.f20799h = iterable.iterator();
            this.f20801j = z2;
            this.f20807p = 0;
            this.f20808q = 0;
            if (i2 == 0) {
                this.f20800i = Internal.f21006e;
                this.f20809r = 0;
                this.f20810s = 0;
                this.f20812u = 0;
                this.f20811t = 0;
                return;
            }
            X();
        }
    }

    public static final class StreamDecoder extends CodedInputStream {

        /* renamed from: g  reason: collision with root package name */
        public final InputStream f20813g;

        /* renamed from: h  reason: collision with root package name */
        public final byte[] f20814h;

        /* renamed from: i  reason: collision with root package name */
        public int f20815i;

        /* renamed from: j  reason: collision with root package name */
        public int f20816j;

        /* renamed from: k  reason: collision with root package name */
        public int f20817k;

        /* renamed from: l  reason: collision with root package name */
        public int f20818l;

        /* renamed from: m  reason: collision with root package name */
        public int f20819m;

        /* renamed from: n  reason: collision with root package name */
        public int f20820n;

        /* renamed from: o  reason: collision with root package name */
        public RefillCallback f20821o;

        public interface RefillCallback {
            void a();
        }

        public class SkippedDataSink implements RefillCallback {

            /* renamed from: a  reason: collision with root package name */
            public int f20822a;

            /* renamed from: b  reason: collision with root package name */
            public ByteArrayOutputStream f20823b;

            /* renamed from: c  reason: collision with root package name */
            public final /* synthetic */ StreamDecoder f20824c;

            public void a() {
                if (this.f20823b == null) {
                    this.f20823b = new ByteArrayOutputStream();
                }
                this.f20823b.write(this.f20824c.f20814h, this.f20822a, this.f20824c.f20817k - this.f20822a);
                this.f20822a = 0;
            }
        }

        public static int L(InputStream inputStream) {
            try {
                return inputStream.available();
            } catch (InvalidProtocolBufferException e2) {
                e2.j();
                throw e2;
            }
        }

        public static int M(InputStream inputStream, byte[] bArr, int i2, int i3) {
            try {
                return inputStream.read(bArr, i2, i3);
            } catch (InvalidProtocolBufferException e2) {
                e2.j();
                throw e2;
            }
        }

        private void X() {
            int i2 = this.f20815i + this.f20816j;
            this.f20815i = i2;
            int i3 = this.f20819m + i2;
            int i4 = this.f20820n;
            if (i3 > i4) {
                int i5 = i3 - i4;
                this.f20816j = i5;
                this.f20815i = i2 - i5;
                return;
            }
            this.f20816j = 0;
        }

        public static long Z(InputStream inputStream, long j2) {
            try {
                return inputStream.skip(j2);
            } catch (InvalidProtocolBufferException e2) {
                e2.j();
                throw e2;
            }
        }

        private void c0() {
            if (this.f20815i - this.f20817k >= 10) {
                d0();
            } else {
                e0();
            }
        }

        private void d0() {
            int i2 = 0;
            while (i2 < 10) {
                byte[] bArr = this.f20814h;
                int i3 = this.f20817k;
                this.f20817k = i3 + 1;
                if (bArr[i3] < 0) {
                    i2++;
                } else {
                    return;
                }
            }
            throw InvalidProtocolBufferException.f();
        }

        private void e0() {
            int i2 = 0;
            while (i2 < 10) {
                if (O() < 0) {
                    i2++;
                } else {
                    return;
                }
            }
            throw InvalidProtocolBufferException.f();
        }

        public int A() {
            return CodedInputStream.c(U());
        }

        public long B() {
            return CodedInputStream.d(V());
        }

        public String C() {
            int U = U();
            if (U > 0) {
                int i2 = this.f20815i;
                int i3 = this.f20817k;
                if (U <= i2 - i3) {
                    String str = new String(this.f20814h, i3, U, Internal.f21003b);
                    this.f20817k += U;
                    return str;
                }
            }
            if (U == 0) {
                return "";
            }
            if (U < 0) {
                throw InvalidProtocolBufferException.g();
            } else if (U > this.f20815i) {
                return new String(P(U, false), Internal.f21003b);
            } else {
                Y(U);
                String str2 = new String(this.f20814h, this.f20817k, U, Internal.f21003b);
                this.f20817k += U;
                return str2;
            }
        }

        public String D() {
            byte[] bArr;
            int U = U();
            int i2 = this.f20817k;
            int i3 = this.f20815i;
            if (U <= i3 - i2 && U > 0) {
                bArr = this.f20814h;
                this.f20817k = i2 + U;
            } else if (U == 0) {
                return "";
            } else {
                if (U >= 0) {
                    i2 = 0;
                    if (U <= i3) {
                        Y(U);
                        bArr = this.f20814h;
                        this.f20817k = U;
                    } else {
                        bArr = P(U, false);
                    }
                } else {
                    throw InvalidProtocolBufferException.g();
                }
            }
            return Utf8.h(bArr, i2, U);
        }

        public int E() {
            if (f()) {
                this.f20818l = 0;
                return 0;
            }
            int U = U();
            this.f20818l = U;
            if (WireFormat.a(U) != 0) {
                return this.f20818l;
            }
            throw InvalidProtocolBufferException.c();
        }

        public int F() {
            return U();
        }

        public long G() {
            return V();
        }

        public boolean H(int i2) {
            int b2 = WireFormat.b(i2);
            if (b2 == 0) {
                c0();
                return true;
            } else if (b2 == 1) {
                a0(8);
                return true;
            } else if (b2 == 2) {
                a0(U());
                return true;
            } else if (b2 == 3) {
                I();
                a(WireFormat.c(WireFormat.a(i2), 4));
                return true;
            } else if (b2 == 4) {
                return false;
            } else {
                if (b2 == 5) {
                    a0(4);
                    return true;
                }
                throw InvalidProtocolBufferException.e();
            }
        }

        public final ByteString N(int i2) {
            byte[] Q = Q(i2);
            if (Q != null) {
                return ByteString.q(Q);
            }
            int i3 = this.f20817k;
            int i4 = this.f20815i;
            int i5 = i4 - i3;
            this.f20819m += i4;
            this.f20817k = 0;
            this.f20815i = 0;
            List<byte[]> R = R(i2 - i5);
            byte[] bArr = new byte[i2];
            System.arraycopy(this.f20814h, i3, bArr, 0, i5);
            for (byte[] bArr2 : R) {
                System.arraycopy(bArr2, 0, bArr, i5, bArr2.length);
                i5 += bArr2.length;
            }
            return ByteString.X(bArr);
        }

        public byte O() {
            if (this.f20817k == this.f20815i) {
                Y(1);
            }
            byte[] bArr = this.f20814h;
            int i2 = this.f20817k;
            this.f20817k = i2 + 1;
            return bArr[i2];
        }

        public final byte[] P(int i2, boolean z2) {
            byte[] Q = Q(i2);
            if (Q != null) {
                return z2 ? (byte[]) Q.clone() : Q;
            }
            int i3 = this.f20817k;
            int i4 = this.f20815i;
            int i5 = i4 - i3;
            this.f20819m += i4;
            this.f20817k = 0;
            this.f20815i = 0;
            List<byte[]> R = R(i2 - i5);
            byte[] bArr = new byte[i2];
            System.arraycopy(this.f20814h, i3, bArr, 0, i5);
            for (byte[] bArr2 : R) {
                System.arraycopy(bArr2, 0, bArr, i5, bArr2.length);
                i5 += bArr2.length;
            }
            return bArr;
        }

        public final byte[] Q(int i2) {
            if (i2 == 0) {
                return Internal.f21005d;
            }
            if (i2 >= 0) {
                int i3 = this.f20819m;
                int i4 = this.f20817k;
                int i5 = i3 + i4 + i2;
                if (i5 - this.f20786c <= 0) {
                    int i6 = this.f20820n;
                    if (i5 <= i6) {
                        int i7 = this.f20815i - i4;
                        int i8 = i2 - i7;
                        if (i8 >= 4096 && i8 > L(this.f20813g)) {
                            return null;
                        }
                        byte[] bArr = new byte[i2];
                        System.arraycopy(this.f20814h, this.f20817k, bArr, 0, i7);
                        this.f20819m += this.f20815i;
                        this.f20817k = 0;
                        this.f20815i = 0;
                        while (i7 < i2) {
                            int M = M(this.f20813g, bArr, i7, i2 - i7);
                            if (M != -1) {
                                this.f20819m += M;
                                i7 += M;
                            } else {
                                throw InvalidProtocolBufferException.m();
                            }
                        }
                        return bArr;
                    }
                    a0((i6 - i3) - i4);
                    throw InvalidProtocolBufferException.m();
                }
                throw InvalidProtocolBufferException.l();
            }
            throw InvalidProtocolBufferException.g();
        }

        public final List R(int i2) {
            ArrayList arrayList = new ArrayList();
            while (i2 > 0) {
                int min = Math.min(i2, 4096);
                byte[] bArr = new byte[min];
                int i3 = 0;
                while (i3 < min) {
                    int read = this.f20813g.read(bArr, i3, min - i3);
                    if (read != -1) {
                        this.f20819m += read;
                        i3 += read;
                    } else {
                        throw InvalidProtocolBufferException.m();
                    }
                }
                i2 -= min;
                arrayList.add(bArr);
            }
            return arrayList;
        }

        public int S() {
            int i2 = this.f20817k;
            if (this.f20815i - i2 < 4) {
                Y(4);
                i2 = this.f20817k;
            }
            byte[] bArr = this.f20814h;
            this.f20817k = i2 + 4;
            return ((bArr[i2 + 3] & 255) << 24) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16);
        }

        public long T() {
            int i2 = this.f20817k;
            if (this.f20815i - i2 < 8) {
                Y(8);
                i2 = this.f20817k;
            }
            byte[] bArr = this.f20814h;
            this.f20817k = i2 + 8;
            return ((((long) bArr[i2 + 7]) & 255) << 56) | (((long) bArr[i2]) & 255) | ((((long) bArr[i2 + 1]) & 255) << 8) | ((((long) bArr[i2 + 2]) & 255) << 16) | ((((long) bArr[i2 + 3]) & 255) << 24) | ((((long) bArr[i2 + 4]) & 255) << 32) | ((((long) bArr[i2 + 5]) & 255) << 40) | ((((long) bArr[i2 + 6]) & 255) << 48);
        }

        public int U() {
            byte b2;
            byte b3;
            int i2 = this.f20817k;
            int i3 = this.f20815i;
            if (i3 != i2) {
                byte[] bArr = this.f20814h;
                int i4 = i2 + 1;
                byte b4 = bArr[i2];
                if (b4 >= 0) {
                    this.f20817k = i4;
                    return b4;
                } else if (i3 - i4 >= 9) {
                    int i5 = i2 + 2;
                    byte b5 = (bArr[i4] << 7) ^ b4;
                    if (b5 < 0) {
                        b2 = b5 ^ Byte.MIN_VALUE;
                    } else {
                        int i6 = i2 + 3;
                        byte b6 = (bArr[i5] << 14) ^ b5;
                        if (b6 >= 0) {
                            b3 = b6 ^ 16256;
                        } else {
                            int i7 = i2 + 4;
                            byte b7 = b6 ^ (bArr[i6] << 21);
                            if (b7 < 0) {
                                b2 = -2080896 ^ b7;
                            } else {
                                i6 = i2 + 5;
                                byte b8 = bArr[i7];
                                byte b9 = (b7 ^ (b8 << 28)) ^ 266354560;
                                if (b8 < 0) {
                                    i7 = i2 + 6;
                                    if (bArr[i6] < 0) {
                                        i6 = i2 + 7;
                                        if (bArr[i7] < 0) {
                                            i7 = i2 + 8;
                                            if (bArr[i6] < 0) {
                                                i6 = i2 + 9;
                                                if (bArr[i7] < 0) {
                                                    int i8 = i2 + 10;
                                                    if (bArr[i6] >= 0) {
                                                        byte b10 = b9;
                                                        i5 = i8;
                                                        b2 = b10;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    b2 = b9;
                                }
                                b3 = b9;
                            }
                            i5 = i7;
                        }
                        i5 = i6;
                    }
                    this.f20817k = i5;
                    return b2;
                }
            }
            return (int) W();
        }

        public long V() {
            long j2;
            long j3;
            long j4;
            int i2 = this.f20817k;
            int i3 = this.f20815i;
            if (i3 != i2) {
                byte[] bArr = this.f20814h;
                int i4 = i2 + 1;
                byte b2 = bArr[i2];
                if (b2 >= 0) {
                    this.f20817k = i4;
                    return (long) b2;
                } else if (i3 - i4 >= 9) {
                    int i5 = i2 + 2;
                    byte b3 = (bArr[i4] << 7) ^ b2;
                    if (b3 < 0) {
                        j2 = (long) (b3 ^ Byte.MIN_VALUE);
                    } else {
                        int i6 = i2 + 3;
                        byte b4 = (bArr[i5] << 14) ^ b3;
                        if (b4 >= 0) {
                            j2 = (long) (b4 ^ 16256);
                            i5 = i6;
                        } else {
                            int i7 = i2 + 4;
                            byte b5 = b4 ^ (bArr[i6] << 21);
                            if (b5 < 0) {
                                i5 = i7;
                                j2 = (long) (-2080896 ^ b5);
                            } else {
                                long j5 = (long) b5;
                                int i8 = i2 + 5;
                                long j6 = j5 ^ (((long) bArr[i7]) << 28);
                                if (j6 >= 0) {
                                    j4 = 266354560;
                                } else {
                                    int i9 = i2 + 6;
                                    long j7 = j6 ^ (((long) bArr[i8]) << 35);
                                    if (j7 < 0) {
                                        j3 = -34093383808L;
                                    } else {
                                        i8 = i2 + 7;
                                        j6 = j7 ^ (((long) bArr[i9]) << 42);
                                        if (j6 >= 0) {
                                            j4 = 4363953127296L;
                                        } else {
                                            i9 = i2 + 8;
                                            j7 = j6 ^ (((long) bArr[i8]) << 49);
                                            if (j7 < 0) {
                                                j3 = -558586000294016L;
                                            } else {
                                                i5 = i2 + 9;
                                                long j8 = (j7 ^ (((long) bArr[i9]) << 56)) ^ 71499008037633920L;
                                                if (j8 < 0) {
                                                    int i10 = i2 + 10;
                                                    if (((long) bArr[i5]) >= 0) {
                                                        i5 = i10;
                                                    }
                                                }
                                                j2 = j8;
                                            }
                                        }
                                    }
                                    j2 = j7 ^ j3;
                                    i5 = i9;
                                }
                                j2 = j6 ^ j4;
                            }
                        }
                    }
                    this.f20817k = i5;
                    return j2;
                }
            }
            return W();
        }

        public long W() {
            long j2 = 0;
            for (int i2 = 0; i2 < 64; i2 += 7) {
                byte O = O();
                j2 |= ((long) (O & Byte.MAX_VALUE)) << i2;
                if ((O & 128) == 0) {
                    return j2;
                }
            }
            throw InvalidProtocolBufferException.f();
        }

        public final void Y(int i2) {
            if (f0(i2)) {
                return;
            }
            if (i2 > (this.f20786c - this.f20819m) - this.f20817k) {
                throw InvalidProtocolBufferException.l();
            }
            throw InvalidProtocolBufferException.m();
        }

        public void a(int i2) {
            if (this.f20818l != i2) {
                throw InvalidProtocolBufferException.b();
            }
        }

        public void a0(int i2) {
            int i3 = this.f20815i;
            int i4 = this.f20817k;
            if (i2 > i3 - i4 || i2 < 0) {
                b0(i2);
            } else {
                this.f20817k = i4 + i2;
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:17:0x005c, code lost:
            throw new java.lang.IllegalStateException(r8.f20813g.getClass() + "#skip returned invalid result: " + r0 + "\nThe InputStream implementation is buggy.");
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b0(int r9) {
            /*
                r8 = this;
                if (r9 < 0) goto L_0x0097
                int r0 = r8.f20819m
                int r1 = r8.f20817k
                int r2 = r0 + r1
                int r2 = r2 + r9
                int r3 = r8.f20820n
                if (r2 > r3) goto L_0x008d
                androidx.datastore.preferences.protobuf.CodedInputStream$StreamDecoder$RefillCallback r2 = r8.f20821o
                r3 = 0
                if (r2 != 0) goto L_0x006f
                int r0 = r0 + r1
                r8.f20819m = r0
                int r0 = r8.f20815i
                int r0 = r0 - r1
                r8.f20815i = r3
                r8.f20817k = r3
                r3 = r0
            L_0x001d:
                if (r3 >= r9) goto L_0x0067
                int r0 = r9 - r3
                java.io.InputStream r1 = r8.f20813g     // Catch:{ all -> 0x005d }
                long r4 = (long) r0     // Catch:{ all -> 0x005d }
                long r0 = Z(r1, r4)     // Catch:{ all -> 0x005d }
                r6 = 0
                int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
                if (r2 < 0) goto L_0x0038
                int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
                if (r4 > 0) goto L_0x0038
                if (r2 != 0) goto L_0x0035
                goto L_0x0067
            L_0x0035:
                int r0 = (int) r0     // Catch:{ all -> 0x005d }
                int r3 = r3 + r0
                goto L_0x001d
            L_0x0038:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch:{ all -> 0x005d }
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x005d }
                r2.<init>()     // Catch:{ all -> 0x005d }
                java.io.InputStream r4 = r8.f20813g     // Catch:{ all -> 0x005d }
                java.lang.Class r4 = r4.getClass()     // Catch:{ all -> 0x005d }
                r2.append(r4)     // Catch:{ all -> 0x005d }
                java.lang.String r4 = "#skip returned invalid result: "
                r2.append(r4)     // Catch:{ all -> 0x005d }
                r2.append(r0)     // Catch:{ all -> 0x005d }
                java.lang.String r0 = "\nThe InputStream implementation is buggy."
                r2.append(r0)     // Catch:{ all -> 0x005d }
                java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x005d }
                r9.<init>(r0)     // Catch:{ all -> 0x005d }
                throw r9     // Catch:{ all -> 0x005d }
            L_0x005d:
                r9 = move-exception
                int r0 = r8.f20819m
                int r0 = r0 + r3
                r8.f20819m = r0
                r8.X()
                throw r9
            L_0x0067:
                int r0 = r8.f20819m
                int r0 = r0 + r3
                r8.f20819m = r0
                r8.X()
            L_0x006f:
                if (r3 >= r9) goto L_0x008c
                int r0 = r8.f20815i
                int r1 = r8.f20817k
                int r1 = r0 - r1
                r8.f20817k = r0
                r0 = 1
                r8.Y(r0)
            L_0x007d:
                int r2 = r9 - r1
                int r3 = r8.f20815i
                if (r2 <= r3) goto L_0x008a
                int r1 = r1 + r3
                r8.f20817k = r3
                r8.Y(r0)
                goto L_0x007d
            L_0x008a:
                r8.f20817k = r2
            L_0x008c:
                return
            L_0x008d:
                int r3 = r3 - r0
                int r3 = r3 - r1
                r8.a0(r3)
                androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r9 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.m()
                throw r9
            L_0x0097:
                androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r9 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.g()
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.CodedInputStream.StreamDecoder.b0(int):void");
        }

        public int e() {
            return this.f20819m + this.f20817k;
        }

        public boolean f() {
            return this.f20817k == this.f20815i && !f0(1);
        }

        public final boolean f0(int i2) {
            int i3 = this.f20817k;
            if (i3 + i2 > this.f20815i) {
                int i4 = this.f20786c;
                int i5 = this.f20819m;
                if (i2 > (i4 - i5) - i3 || i5 + i3 + i2 > this.f20820n) {
                    return false;
                }
                RefillCallback refillCallback = this.f20821o;
                if (refillCallback != null) {
                    refillCallback.a();
                }
                int i6 = this.f20817k;
                if (i6 > 0) {
                    int i7 = this.f20815i;
                    if (i7 > i6) {
                        byte[] bArr = this.f20814h;
                        System.arraycopy(bArr, i6, bArr, 0, i7 - i6);
                    }
                    this.f20819m += i6;
                    this.f20815i -= i6;
                    this.f20817k = 0;
                }
                InputStream inputStream = this.f20813g;
                byte[] bArr2 = this.f20814h;
                int i8 = this.f20815i;
                int M = M(inputStream, bArr2, i8, Math.min(bArr2.length - i8, (this.f20786c - this.f20819m) - i8));
                if (M == 0 || M < -1 || M > this.f20814h.length) {
                    throw new IllegalStateException(this.f20813g.getClass() + "#read(byte[]) returned invalid result: " + M + "\nThe InputStream implementation is buggy.");
                } else if (M <= 0) {
                    return false;
                } else {
                    this.f20815i += M;
                    X();
                    if (this.f20815i >= i2) {
                        return true;
                    }
                    return f0(i2);
                }
            } else {
                throw new IllegalStateException("refillBuffer() called when " + i2 + " bytes were already available in buffer");
            }
        }

        public void n(int i2) {
            this.f20820n = i2;
            X();
        }

        public int o(int i2) {
            if (i2 >= 0) {
                int i3 = i2 + this.f20819m + this.f20817k;
                if (i3 >= 0) {
                    int i4 = this.f20820n;
                    if (i3 <= i4) {
                        this.f20820n = i3;
                        X();
                        return i4;
                    }
                    throw InvalidProtocolBufferException.m();
                }
                throw InvalidProtocolBufferException.h();
            }
            throw InvalidProtocolBufferException.g();
        }

        public boolean p() {
            return V() != 0;
        }

        public ByteString q() {
            int U = U();
            int i2 = this.f20815i;
            int i3 = this.f20817k;
            if (U <= i2 - i3 && U > 0) {
                ByteString s2 = ByteString.s(this.f20814h, i3, U);
                this.f20817k += U;
                return s2;
            } else if (U == 0) {
                return ByteString.f20770A;
            } else {
                if (U >= 0) {
                    return N(U);
                }
                throw InvalidProtocolBufferException.g();
            }
        }

        public double r() {
            return Double.longBitsToDouble(T());
        }

        public int s() {
            return U();
        }

        public int t() {
            return S();
        }

        public long u() {
            return T();
        }

        public float v() {
            return Float.intBitsToFloat(S());
        }

        public int w() {
            return U();
        }

        public long x() {
            return V();
        }

        public int y() {
            return S();
        }

        public long z() {
            return T();
        }

        public StreamDecoder(InputStream inputStream, int i2) {
            super();
            this.f20820n = Integer.MAX_VALUE;
            this.f20821o = null;
            Internal.b(inputStream, "input");
            this.f20813g = inputStream;
            this.f20814h = new byte[i2];
            this.f20815i = 0;
            this.f20817k = 0;
            this.f20819m = 0;
        }
    }

    public static final class UnsafeDirectNioDecoder extends CodedInputStream {

        /* renamed from: g  reason: collision with root package name */
        public final ByteBuffer f20825g;

        /* renamed from: h  reason: collision with root package name */
        public final boolean f20826h;

        /* renamed from: i  reason: collision with root package name */
        public final long f20827i;

        /* renamed from: j  reason: collision with root package name */
        public long f20828j;

        /* renamed from: k  reason: collision with root package name */
        public long f20829k;

        /* renamed from: l  reason: collision with root package name */
        public long f20830l;

        /* renamed from: m  reason: collision with root package name */
        public int f20831m;

        /* renamed from: n  reason: collision with root package name */
        public int f20832n;

        /* renamed from: o  reason: collision with root package name */
        public boolean f20833o;

        /* renamed from: p  reason: collision with root package name */
        public int f20834p;

        public static boolean K() {
            return UnsafeUtil.K();
        }

        private void R() {
            long j2 = this.f20828j + ((long) this.f20831m);
            this.f20828j = j2;
            int i2 = (int) (j2 - this.f20830l);
            int i3 = this.f20834p;
            if (i2 > i3) {
                int i4 = i2 - i3;
                this.f20831m = i4;
                this.f20828j = j2 - ((long) i4);
                return;
            }
            this.f20831m = 0;
        }

        private int S() {
            return (int) (this.f20828j - this.f20829k);
        }

        private void U() {
            if (S() >= 10) {
                V();
            } else {
                W();
            }
        }

        private void V() {
            int i2 = 0;
            while (i2 < 10) {
                long j2 = this.f20829k;
                this.f20829k = 1 + j2;
                if (UnsafeUtil.x(j2) < 0) {
                    i2++;
                } else {
                    return;
                }
            }
            throw InvalidProtocolBufferException.f();
        }

        private void W() {
            int i2 = 0;
            while (i2 < 10) {
                if (L() < 0) {
                    i2++;
                } else {
                    return;
                }
            }
            throw InvalidProtocolBufferException.f();
        }

        public int A() {
            return CodedInputStream.c(O());
        }

        public long B() {
            return CodedInputStream.d(P());
        }

        public String C() {
            int O = O();
            if (O > 0 && O <= S()) {
                byte[] bArr = new byte[O];
                long j2 = (long) O;
                UnsafeUtil.p(this.f20829k, bArr, 0, j2);
                String str = new String(bArr, Internal.f21003b);
                this.f20829k += j2;
                return str;
            } else if (O == 0) {
                return "";
            } else {
                if (O < 0) {
                    throw InvalidProtocolBufferException.g();
                }
                throw InvalidProtocolBufferException.m();
            }
        }

        public String D() {
            int O = O();
            if (O > 0 && O <= S()) {
                String g2 = Utf8.g(this.f20825g, J(this.f20829k), O);
                this.f20829k += (long) O;
                return g2;
            } else if (O == 0) {
                return "";
            } else {
                if (O <= 0) {
                    throw InvalidProtocolBufferException.g();
                }
                throw InvalidProtocolBufferException.m();
            }
        }

        public int E() {
            if (f()) {
                this.f20832n = 0;
                return 0;
            }
            int O = O();
            this.f20832n = O;
            if (WireFormat.a(O) != 0) {
                return this.f20832n;
            }
            throw InvalidProtocolBufferException.c();
        }

        public int F() {
            return O();
        }

        public long G() {
            return P();
        }

        public boolean H(int i2) {
            int b2 = WireFormat.b(i2);
            if (b2 == 0) {
                U();
                return true;
            } else if (b2 == 1) {
                T(8);
                return true;
            } else if (b2 == 2) {
                T(O());
                return true;
            } else if (b2 == 3) {
                I();
                a(WireFormat.c(WireFormat.a(i2), 4));
                return true;
            } else if (b2 == 4) {
                return false;
            } else {
                if (b2 == 5) {
                    T(4);
                    return true;
                }
                throw InvalidProtocolBufferException.e();
            }
        }

        public final int J(long j2) {
            return (int) (j2 - this.f20827i);
        }

        public byte L() {
            long j2 = this.f20829k;
            if (j2 != this.f20828j) {
                this.f20829k = 1 + j2;
                return UnsafeUtil.x(j2);
            }
            throw InvalidProtocolBufferException.m();
        }

        public int M() {
            long j2 = this.f20829k;
            if (this.f20828j - j2 >= 4) {
                this.f20829k = 4 + j2;
                return ((UnsafeUtil.x(j2 + 3) & 255) << 24) | (UnsafeUtil.x(j2) & 255) | ((UnsafeUtil.x(1 + j2) & 255) << 8) | ((UnsafeUtil.x(2 + j2) & 255) << 16);
            }
            throw InvalidProtocolBufferException.m();
        }

        public long N() {
            long j2 = this.f20829k;
            if (this.f20828j - j2 >= 8) {
                this.f20829k = 8 + j2;
                return ((((long) UnsafeUtil.x(j2 + 7)) & 255) << 56) | (((long) UnsafeUtil.x(j2)) & 255) | ((((long) UnsafeUtil.x(1 + j2)) & 255) << 8) | ((((long) UnsafeUtil.x(2 + j2)) & 255) << 16) | ((((long) UnsafeUtil.x(3 + j2)) & 255) << 24) | ((((long) UnsafeUtil.x(4 + j2)) & 255) << 32) | ((((long) UnsafeUtil.x(5 + j2)) & 255) << 40) | ((((long) UnsafeUtil.x(6 + j2)) & 255) << 48);
            }
            throw InvalidProtocolBufferException.m();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:29:0x008c, code lost:
            if (androidx.datastore.preferences.protobuf.UnsafeUtil.x(r3) < 0) goto L_0x008e;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int O() {
            /*
                r9 = this;
                long r0 = r9.f20829k
                long r2 = r9.f20828j
                int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r2 != 0) goto L_0x000a
                goto L_0x008e
            L_0x000a:
                r2 = 1
                long r2 = r2 + r0
                byte r4 = androidx.datastore.preferences.protobuf.UnsafeUtil.x(r0)
                if (r4 < 0) goto L_0x0016
                r9.f20829k = r2
                return r4
            L_0x0016:
                long r5 = r9.f20828j
                long r5 = r5 - r2
                r7 = 9
                int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r5 >= 0) goto L_0x0021
                goto L_0x008e
            L_0x0021:
                r5 = 2
                long r5 = r5 + r0
                byte r2 = androidx.datastore.preferences.protobuf.UnsafeUtil.x(r2)
                int r2 = r2 << 7
                r2 = r2 ^ r4
                if (r2 >= 0) goto L_0x0031
                r0 = r2 ^ -128(0xffffffffffffff80, float:NaN)
                goto L_0x0098
            L_0x0031:
                r3 = 3
                long r3 = r3 + r0
                byte r5 = androidx.datastore.preferences.protobuf.UnsafeUtil.x(r5)
                int r5 = r5 << 14
                r2 = r2 ^ r5
                if (r2 < 0) goto L_0x0041
                r0 = r2 ^ 16256(0x3f80, float:2.278E-41)
            L_0x003f:
                r5 = r3
                goto L_0x0098
            L_0x0041:
                r5 = 4
                long r5 = r5 + r0
                byte r3 = androidx.datastore.preferences.protobuf.UnsafeUtil.x(r3)
                int r3 = r3 << 21
                r2 = r2 ^ r3
                if (r2 >= 0) goto L_0x0052
                r0 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L_0x0098
            L_0x0052:
                r3 = 5
                long r3 = r3 + r0
                byte r5 = androidx.datastore.preferences.protobuf.UnsafeUtil.x(r5)
                int r6 = r5 << 28
                r2 = r2 ^ r6
                r6 = 266354560(0xfe03f80, float:2.2112565E-29)
                r2 = r2 ^ r6
                if (r5 >= 0) goto L_0x0096
                r5 = 6
                long r5 = r5 + r0
                byte r3 = androidx.datastore.preferences.protobuf.UnsafeUtil.x(r3)
                if (r3 >= 0) goto L_0x0094
                r3 = 7
                long r3 = r3 + r0
                byte r5 = androidx.datastore.preferences.protobuf.UnsafeUtil.x(r5)
                if (r5 >= 0) goto L_0x0096
                r5 = 8
                long r5 = r5 + r0
                byte r3 = androidx.datastore.preferences.protobuf.UnsafeUtil.x(r3)
                if (r3 >= 0) goto L_0x0094
                long r3 = r0 + r7
                byte r5 = androidx.datastore.preferences.protobuf.UnsafeUtil.x(r5)
                if (r5 >= 0) goto L_0x0096
                r5 = 10
                long r5 = r5 + r0
                byte r0 = androidx.datastore.preferences.protobuf.UnsafeUtil.x(r3)
                if (r0 >= 0) goto L_0x0094
            L_0x008e:
                long r0 = r9.Q()
                int r0 = (int) r0
                return r0
            L_0x0094:
                r0 = r2
                goto L_0x0098
            L_0x0096:
                r0 = r2
                goto L_0x003f
            L_0x0098:
                r9.f20829k = r5
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.CodedInputStream.UnsafeDirectNioDecoder.O():int");
        }

        public long P() {
            long j2;
            long j3;
            long j4;
            byte b2;
            long j5 = this.f20829k;
            if (this.f20828j != j5) {
                long j6 = 1 + j5;
                byte x2 = UnsafeUtil.x(j5);
                if (x2 >= 0) {
                    this.f20829k = j6;
                    return (long) x2;
                } else if (this.f20828j - j6 >= 9) {
                    long j7 = 2 + j5;
                    byte x3 = (UnsafeUtil.x(j6) << 7) ^ x2;
                    if (x3 < 0) {
                        b2 = x3 ^ Byte.MIN_VALUE;
                    } else {
                        long j8 = 3 + j5;
                        byte x4 = x3 ^ (UnsafeUtil.x(j7) << 14);
                        if (x4 >= 0) {
                            j2 = (long) (x4 ^ 16256);
                            j7 = j8;
                        } else {
                            j7 = 4 + j5;
                            byte x5 = x4 ^ (UnsafeUtil.x(j8) << 21);
                            if (x5 < 0) {
                                b2 = -2080896 ^ x5;
                            } else {
                                long j9 = 5 + j5;
                                long x6 = ((long) x5) ^ (((long) UnsafeUtil.x(j7)) << 28);
                                if (x6 >= 0) {
                                    j4 = 266354560;
                                } else {
                                    long j10 = 6 + j5;
                                    long x7 = x6 ^ (((long) UnsafeUtil.x(j9)) << 35);
                                    if (x7 < 0) {
                                        j3 = -34093383808L;
                                    } else {
                                        j9 = 7 + j5;
                                        x6 = x7 ^ (((long) UnsafeUtil.x(j10)) << 42);
                                        if (x6 >= 0) {
                                            j4 = 4363953127296L;
                                        } else {
                                            j10 = 8 + j5;
                                            x7 = x6 ^ (((long) UnsafeUtil.x(j9)) << 49);
                                            if (x7 < 0) {
                                                j3 = -558586000294016L;
                                            } else {
                                                long j11 = j5 + 9;
                                                long x8 = (x7 ^ (((long) UnsafeUtil.x(j10)) << 56)) ^ 71499008037633920L;
                                                if (x8 < 0) {
                                                    long j12 = j5 + 10;
                                                    if (((long) UnsafeUtil.x(j11)) >= 0) {
                                                        j7 = j12;
                                                        j2 = x8;
                                                    }
                                                } else {
                                                    j2 = x8;
                                                    j7 = j11;
                                                }
                                            }
                                        }
                                    }
                                    j2 = j3 ^ x7;
                                    j7 = j10;
                                }
                                j2 = j4 ^ x6;
                                j7 = j9;
                            }
                        }
                        this.f20829k = j7;
                        return j2;
                    }
                    j2 = (long) b2;
                    this.f20829k = j7;
                    return j2;
                }
            }
            return Q();
        }

        public long Q() {
            long j2 = 0;
            for (int i2 = 0; i2 < 64; i2 += 7) {
                byte L = L();
                j2 |= ((long) (L & Byte.MAX_VALUE)) << i2;
                if ((L & 128) == 0) {
                    return j2;
                }
            }
            throw InvalidProtocolBufferException.f();
        }

        public void T(int i2) {
            if (i2 >= 0 && i2 <= S()) {
                this.f20829k += (long) i2;
            } else if (i2 < 0) {
                throw InvalidProtocolBufferException.g();
            } else {
                throw InvalidProtocolBufferException.m();
            }
        }

        public final ByteBuffer X(long j2, long j3) {
            int position = this.f20825g.position();
            int limit = this.f20825g.limit();
            ByteBuffer byteBuffer = this.f20825g;
            try {
                byteBuffer.position(J(j2));
                byteBuffer.limit(J(j3));
                ByteBuffer slice = this.f20825g.slice();
                byteBuffer.position(position);
                byteBuffer.limit(limit);
                return slice;
            } catch (IllegalArgumentException e2) {
                InvalidProtocolBufferException m2 = InvalidProtocolBufferException.m();
                m2.initCause(e2);
                throw m2;
            } catch (Throwable th) {
                byteBuffer.position(position);
                byteBuffer.limit(limit);
                throw th;
            }
        }

        public void a(int i2) {
            if (this.f20832n != i2) {
                throw InvalidProtocolBufferException.b();
            }
        }

        public int e() {
            return (int) (this.f20829k - this.f20830l);
        }

        public boolean f() {
            return this.f20829k == this.f20828j;
        }

        public void n(int i2) {
            this.f20834p = i2;
            R();
        }

        public int o(int i2) {
            if (i2 >= 0) {
                int e2 = i2 + e();
                int i3 = this.f20834p;
                if (e2 <= i3) {
                    this.f20834p = e2;
                    R();
                    return i3;
                }
                throw InvalidProtocolBufferException.m();
            }
            throw InvalidProtocolBufferException.g();
        }

        public boolean p() {
            return P() != 0;
        }

        public ByteString q() {
            int O = O();
            if (O <= 0 || O > S()) {
                if (O == 0) {
                    return ByteString.f20770A;
                }
                if (O < 0) {
                    throw InvalidProtocolBufferException.g();
                }
                throw InvalidProtocolBufferException.m();
            } else if (!this.f20826h || !this.f20833o) {
                byte[] bArr = new byte[O];
                long j2 = (long) O;
                UnsafeUtil.p(this.f20829k, bArr, 0, j2);
                this.f20829k += j2;
                return ByteString.X(bArr);
            } else {
                long j3 = this.f20829k;
                long j4 = (long) O;
                ByteBuffer X = X(j3, j3 + j4);
                this.f20829k += j4;
                return ByteString.W(X);
            }
        }

        public double r() {
            return Double.longBitsToDouble(N());
        }

        public int s() {
            return O();
        }

        public int t() {
            return M();
        }

        public long u() {
            return N();
        }

        public float v() {
            return Float.intBitsToFloat(M());
        }

        public int w() {
            return O();
        }

        public long x() {
            return P();
        }

        public int y() {
            return M();
        }

        public long z() {
            return N();
        }

        public UnsafeDirectNioDecoder(ByteBuffer byteBuffer, boolean z2) {
            super();
            this.f20834p = Integer.MAX_VALUE;
            this.f20825g = byteBuffer;
            long k2 = UnsafeUtil.k(byteBuffer);
            this.f20827i = k2;
            this.f20828j = ((long) byteBuffer.limit()) + k2;
            long position = k2 + ((long) byteBuffer.position());
            this.f20829k = position;
            this.f20830l = position;
            this.f20826h = z2;
        }
    }

    public static int c(int i2) {
        return (-(i2 & 1)) ^ (i2 >>> 1);
    }

    public static long d(long j2) {
        return (-(j2 & 1)) ^ (j2 >>> 1);
    }

    public static CodedInputStream g(InputStream inputStream) {
        return h(inputStream, 4096);
    }

    public static CodedInputStream h(InputStream inputStream, int i2) {
        if (i2 > 0) {
            return inputStream == null ? k(Internal.f21005d) : new StreamDecoder(inputStream, i2);
        }
        throw new IllegalArgumentException("bufferSize must be > 0");
    }

    public static CodedInputStream i(Iterable iterable, boolean z2) {
        Iterator it = iterable.iterator();
        boolean z3 = false;
        int i2 = 0;
        while (it.hasNext()) {
            ByteBuffer byteBuffer = (ByteBuffer) it.next();
            i2 += byteBuffer.remaining();
            z3 = byteBuffer.hasArray() ? z3 | true : byteBuffer.isDirect() ? z3 | true : z3 | true;
        }
        return z3 ? new IterableDirectByteBufferDecoder(iterable, i2, z2) : g(new IterableByteBufferInputStream(iterable));
    }

    public static CodedInputStream j(ByteBuffer byteBuffer, boolean z2) {
        if (byteBuffer.hasArray()) {
            return m(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining(), z2);
        }
        if (byteBuffer.isDirect() && UnsafeDirectNioDecoder.K()) {
            return new UnsafeDirectNioDecoder(byteBuffer, z2);
        }
        int remaining = byteBuffer.remaining();
        byte[] bArr = new byte[remaining];
        byteBuffer.duplicate().get(bArr);
        return m(bArr, 0, remaining, true);
    }

    public static CodedInputStream k(byte[] bArr) {
        return l(bArr, 0, bArr.length);
    }

    public static CodedInputStream l(byte[] bArr, int i2, int i3) {
        return m(bArr, i2, i3, false);
    }

    public static CodedInputStream m(byte[] bArr, int i2, int i3, boolean z2) {
        ArrayDecoder arrayDecoder = new ArrayDecoder(bArr, i2, i3, z2);
        try {
            arrayDecoder.o(i3);
            return arrayDecoder;
        } catch (InvalidProtocolBufferException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public abstract int A();

    public abstract long B();

    public abstract String C();

    public abstract String D();

    public abstract int E();

    public abstract int F();

    public abstract long G();

    public abstract boolean H(int i2);

    public void I() {
        int E;
        do {
            E = E();
            if (E != 0) {
                b();
                this.f20784a++;
                this.f20784a--;
            } else {
                return;
            }
        } while (H(E));
    }

    public abstract void a(int i2);

    public void b() {
        if (this.f20784a >= this.f20785b) {
            throw InvalidProtocolBufferException.i();
        }
    }

    public abstract int e();

    public abstract boolean f();

    public abstract void n(int i2);

    public abstract int o(int i2);

    public abstract boolean p();

    public abstract ByteString q();

    public abstract double r();

    public abstract int s();

    public abstract int t();

    public abstract long u();

    public abstract float v();

    public abstract int w();

    public abstract long x();

    public abstract int y();

    public abstract long z();

    public CodedInputStream() {
        this.f20785b = f20783f;
        this.f20786c = Integer.MAX_VALUE;
        this.f20788e = false;
    }
}
