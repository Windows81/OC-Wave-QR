package com.google.protobuf;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public abstract class CodedInputStream {

    /* renamed from: f  reason: collision with root package name */
    public static volatile int f31995f = 100;

    /* renamed from: a  reason: collision with root package name */
    public int f31996a;

    /* renamed from: b  reason: collision with root package name */
    public int f31997b;

    /* renamed from: c  reason: collision with root package name */
    public int f31998c;

    /* renamed from: d  reason: collision with root package name */
    public CodedInputStreamReader f31999d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f32000e;

    public static final class ArrayDecoder extends CodedInputStream {

        /* renamed from: g  reason: collision with root package name */
        public final byte[] f32001g;

        /* renamed from: h  reason: collision with root package name */
        public final boolean f32002h;

        /* renamed from: i  reason: collision with root package name */
        public int f32003i;

        /* renamed from: j  reason: collision with root package name */
        public int f32004j;

        /* renamed from: k  reason: collision with root package name */
        public int f32005k;

        /* renamed from: l  reason: collision with root package name */
        public int f32006l;

        /* renamed from: m  reason: collision with root package name */
        public int f32007m;

        /* renamed from: n  reason: collision with root package name */
        public boolean f32008n;

        /* renamed from: o  reason: collision with root package name */
        public int f32009o;

        public long A() {
            return CodedInputStream.c(M());
        }

        public String B() {
            int L = L();
            if (L > 0) {
                int i2 = this.f32003i;
                int i3 = this.f32005k;
                if (L <= i2 - i3) {
                    String str = new String(this.f32001g, i3, L, Internal.f32168b);
                    this.f32005k += L;
                    return str;
                }
            }
            if (L == 0) {
                return "";
            }
            if (L < 0) {
                throw InvalidProtocolBufferException.g();
            }
            throw InvalidProtocolBufferException.m();
        }

        public String C() {
            int L = L();
            if (L > 0) {
                int i2 = this.f32003i;
                int i3 = this.f32005k;
                if (L <= i2 - i3) {
                    String h2 = Utf8.h(this.f32001g, i3, L);
                    this.f32005k += L;
                    return h2;
                }
            }
            if (L == 0) {
                return "";
            }
            if (L <= 0) {
                throw InvalidProtocolBufferException.g();
            }
            throw InvalidProtocolBufferException.m();
        }

        public int D() {
            if (e()) {
                this.f32007m = 0;
                return 0;
            }
            int L = L();
            this.f32007m = L;
            if (WireFormat.a(L) != 0) {
                return this.f32007m;
            }
            throw InvalidProtocolBufferException.c();
        }

        public int E() {
            return L();
        }

        public long F() {
            return M();
        }

        public boolean G(int i2) {
            int b2 = WireFormat.b(i2);
            if (b2 == 0) {
                R();
                return true;
            } else if (b2 == 1) {
                Q(8);
                return true;
            } else if (b2 == 2) {
                Q(L());
                return true;
            } else if (b2 == 3) {
                P();
                a(WireFormat.c(WireFormat.a(i2), 4));
                return true;
            } else if (b2 == 4) {
                return false;
            } else {
                if (b2 == 5) {
                    Q(4);
                    return true;
                }
                throw InvalidProtocolBufferException.e();
            }
        }

        public byte H() {
            int i2 = this.f32005k;
            if (i2 != this.f32003i) {
                byte[] bArr = this.f32001g;
                this.f32005k = i2 + 1;
                return bArr[i2];
            }
            throw InvalidProtocolBufferException.m();
        }

        public byte[] I(int i2) {
            if (i2 > 0) {
                int i3 = this.f32003i;
                int i4 = this.f32005k;
                if (i2 <= i3 - i4) {
                    int i5 = i2 + i4;
                    this.f32005k = i5;
                    return Arrays.copyOfRange(this.f32001g, i4, i5);
                }
            }
            if (i2 > 0) {
                throw InvalidProtocolBufferException.m();
            } else if (i2 == 0) {
                return Internal.f32170d;
            } else {
                throw InvalidProtocolBufferException.g();
            }
        }

        public int J() {
            int i2 = this.f32005k;
            if (this.f32003i - i2 >= 4) {
                byte[] bArr = this.f32001g;
                this.f32005k = i2 + 4;
                return ((bArr[i2 + 3] & 255) << 24) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16);
            }
            throw InvalidProtocolBufferException.m();
        }

        public long K() {
            int i2 = this.f32005k;
            if (this.f32003i - i2 >= 8) {
                byte[] bArr = this.f32001g;
                this.f32005k = i2 + 8;
                return ((((long) bArr[i2 + 7]) & 255) << 56) | (((long) bArr[i2]) & 255) | ((((long) bArr[i2 + 1]) & 255) << 8) | ((((long) bArr[i2 + 2]) & 255) << 16) | ((((long) bArr[i2 + 3]) & 255) << 24) | ((((long) bArr[i2 + 4]) & 255) << 32) | ((((long) bArr[i2 + 5]) & 255) << 40) | ((((long) bArr[i2 + 6]) & 255) << 48);
            }
            throw InvalidProtocolBufferException.m();
        }

        public int L() {
            byte b2;
            byte b3;
            int i2 = this.f32005k;
            int i3 = this.f32003i;
            if (i3 != i2) {
                byte[] bArr = this.f32001g;
                int i4 = i2 + 1;
                byte b4 = bArr[i2];
                if (b4 >= 0) {
                    this.f32005k = i4;
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
                    this.f32005k = i5;
                    return b2;
                }
            }
            return (int) N();
        }

        public long M() {
            long j2;
            long j3;
            long j4;
            int i2 = this.f32005k;
            int i3 = this.f32003i;
            if (i3 != i2) {
                byte[] bArr = this.f32001g;
                int i4 = i2 + 1;
                byte b2 = bArr[i2];
                if (b2 >= 0) {
                    this.f32005k = i4;
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
                    this.f32005k = i5;
                    return j2;
                }
            }
            return N();
        }

        public long N() {
            long j2 = 0;
            for (int i2 = 0; i2 < 64; i2 += 7) {
                byte H = H();
                j2 |= ((long) (H & Byte.MAX_VALUE)) << i2;
                if ((H & 128) == 0) {
                    return j2;
                }
            }
            throw InvalidProtocolBufferException.f();
        }

        public final void O() {
            int i2 = this.f32003i + this.f32004j;
            this.f32003i = i2;
            int i3 = i2 - this.f32006l;
            int i4 = this.f32009o;
            if (i3 > i4) {
                int i5 = i3 - i4;
                this.f32004j = i5;
                this.f32003i = i2 - i5;
                return;
            }
            this.f32004j = 0;
        }

        /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: 
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        public void P() {
            /*
                r1 = this;
            L_0x0000:
                int r0 = r1.D()
                if (r0 == 0) goto L_0x000c
                boolean r0 = r1.G(r0)
                if (r0 != 0) goto L_0x0000
            L_0x000c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.CodedInputStream.ArrayDecoder.P():void");
        }

        public void Q(int i2) {
            if (i2 >= 0) {
                int i3 = this.f32003i;
                int i4 = this.f32005k;
                if (i2 <= i3 - i4) {
                    this.f32005k = i4 + i2;
                    return;
                }
            }
            if (i2 < 0) {
                throw InvalidProtocolBufferException.g();
            }
            throw InvalidProtocolBufferException.m();
        }

        public final void R() {
            if (this.f32003i - this.f32005k >= 10) {
                S();
            } else {
                T();
            }
        }

        public final void S() {
            int i2 = 0;
            while (i2 < 10) {
                byte[] bArr = this.f32001g;
                int i3 = this.f32005k;
                this.f32005k = i3 + 1;
                if (bArr[i3] < 0) {
                    i2++;
                } else {
                    return;
                }
            }
            throw InvalidProtocolBufferException.f();
        }

        public final void T() {
            int i2 = 0;
            while (i2 < 10) {
                if (H() < 0) {
                    i2++;
                } else {
                    return;
                }
            }
            throw InvalidProtocolBufferException.f();
        }

        public void a(int i2) {
            if (this.f32007m != i2) {
                throw InvalidProtocolBufferException.b();
            }
        }

        public int d() {
            return this.f32005k - this.f32006l;
        }

        public boolean e() {
            return this.f32005k == this.f32003i;
        }

        public void m(int i2) {
            this.f32009o = i2;
            O();
        }

        public int n(int i2) {
            if (i2 >= 0) {
                int d2 = i2 + d();
                if (d2 >= 0) {
                    int i3 = this.f32009o;
                    if (d2 <= i3) {
                        this.f32009o = d2;
                        O();
                        return i3;
                    }
                    throw InvalidProtocolBufferException.m();
                }
                throw InvalidProtocolBufferException.h();
            }
            throw InvalidProtocolBufferException.g();
        }

        public boolean o() {
            return M() != 0;
        }

        public ByteString p() {
            int L = L();
            if (L > 0) {
                int i2 = this.f32003i;
                int i3 = this.f32005k;
                if (L <= i2 - i3) {
                    ByteString s2 = (!this.f32002h || !this.f32008n) ? ByteString.s(this.f32001g, i3, L) : ByteString.Y(this.f32001g, i3, L);
                    this.f32005k += L;
                    return s2;
                }
            }
            return L == 0 ? ByteString.f31983A : ByteString.X(I(L));
        }

        public double q() {
            return Double.longBitsToDouble(K());
        }

        public int r() {
            return L();
        }

        public int s() {
            return J();
        }

        public long t() {
            return K();
        }

        public float u() {
            return Float.intBitsToFloat(J());
        }

        public int v() {
            return L();
        }

        public long w() {
            return M();
        }

        public int x() {
            return J();
        }

        public long y() {
            return K();
        }

        public int z() {
            return CodedInputStream.b(L());
        }

        public ArrayDecoder(byte[] bArr, int i2, int i3, boolean z2) {
            super();
            this.f32009o = Integer.MAX_VALUE;
            this.f32001g = bArr;
            this.f32003i = i3 + i2;
            this.f32005k = i2;
            this.f32006l = i2;
            this.f32002h = z2;
        }
    }

    public static final class IterableDirectByteBufferDecoder extends CodedInputStream {

        /* renamed from: g  reason: collision with root package name */
        public final Iterable f32010g;

        /* renamed from: h  reason: collision with root package name */
        public final Iterator f32011h;

        /* renamed from: i  reason: collision with root package name */
        public ByteBuffer f32012i;

        /* renamed from: j  reason: collision with root package name */
        public final boolean f32013j;

        /* renamed from: k  reason: collision with root package name */
        public boolean f32014k;

        /* renamed from: l  reason: collision with root package name */
        public int f32015l;

        /* renamed from: m  reason: collision with root package name */
        public int f32016m;

        /* renamed from: n  reason: collision with root package name */
        public int f32017n;

        /* renamed from: o  reason: collision with root package name */
        public int f32018o;

        /* renamed from: p  reason: collision with root package name */
        public int f32019p;

        /* renamed from: q  reason: collision with root package name */
        public int f32020q;

        /* renamed from: r  reason: collision with root package name */
        public long f32021r;

        /* renamed from: s  reason: collision with root package name */
        public long f32022s;

        /* renamed from: t  reason: collision with root package name */
        public long f32023t;

        /* renamed from: u  reason: collision with root package name */
        public long f32024u;

        private void Q() {
            int i2 = this.f32015l + this.f32016m;
            this.f32015l = i2;
            int i3 = i2 - this.f32020q;
            int i4 = this.f32017n;
            if (i3 > i4) {
                int i5 = i3 - i4;
                this.f32016m = i5;
                this.f32015l = i2 - i5;
                return;
            }
            this.f32016m = 0;
        }

        private void U() {
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

        public long A() {
            return CodedInputStream.c(O());
        }

        public String B() {
            int N = N();
            if (N > 0) {
                long j2 = (long) N;
                long j3 = this.f32024u;
                long j4 = this.f32021r;
                if (j2 <= j3 - j4) {
                    byte[] bArr = new byte[N];
                    UnsafeUtil.p(j4, bArr, 0, j2);
                    String str = new String(bArr, Internal.f32168b);
                    this.f32021r += j2;
                    return str;
                }
            }
            if (N > 0 && N <= R()) {
                byte[] bArr2 = new byte[N];
                K(bArr2, 0, N);
                return new String(bArr2, Internal.f32168b);
            } else if (N == 0) {
                return "";
            } else {
                if (N < 0) {
                    throw InvalidProtocolBufferException.g();
                }
                throw InvalidProtocolBufferException.m();
            }
        }

        public String C() {
            int N = N();
            if (N > 0) {
                long j2 = (long) N;
                long j3 = this.f32024u;
                long j4 = this.f32021r;
                if (j2 <= j3 - j4) {
                    String g2 = Utf8.g(this.f32012i, (int) (j4 - this.f32022s), N);
                    this.f32021r += j2;
                    return g2;
                }
            }
            if (N >= 0 && N <= R()) {
                byte[] bArr = new byte[N];
                K(bArr, 0, N);
                return Utf8.h(bArr, 0, N);
            } else if (N == 0) {
                return "";
            } else {
                if (N <= 0) {
                    throw InvalidProtocolBufferException.g();
                }
                throw InvalidProtocolBufferException.m();
            }
        }

        public int D() {
            if (e()) {
                this.f32018o = 0;
                return 0;
            }
            int N = N();
            this.f32018o = N;
            if (WireFormat.a(N) != 0) {
                return this.f32018o;
            }
            throw InvalidProtocolBufferException.c();
        }

        public int E() {
            return N();
        }

        public long F() {
            return O();
        }

        public boolean G(int i2) {
            int b2 = WireFormat.b(i2);
            if (b2 == 0) {
                U();
                return true;
            } else if (b2 == 1) {
                T(8);
                return true;
            } else if (b2 == 2) {
                T(N());
                return true;
            } else if (b2 == 3) {
                S();
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

        public final long H() {
            return this.f32024u - this.f32021r;
        }

        public final void I() {
            if (this.f32011h.hasNext()) {
                W();
                return;
            }
            throw InvalidProtocolBufferException.m();
        }

        public byte J() {
            if (H() == 0) {
                I();
            }
            long j2 = this.f32021r;
            this.f32021r = 1 + j2;
            return UnsafeUtil.x(j2);
        }

        public final void K(byte[] bArr, int i2, int i3) {
            if (i3 >= 0 && i3 <= R()) {
                int i4 = i3;
                while (i4 > 0) {
                    if (H() == 0) {
                        I();
                    }
                    int min = Math.min(i4, (int) H());
                    long j2 = (long) min;
                    UnsafeUtil.p(this.f32021r, bArr, (long) ((i3 - i4) + i2), j2);
                    i4 -= min;
                    this.f32021r += j2;
                }
            } else if (i3 > 0) {
                throw InvalidProtocolBufferException.m();
            } else if (i3 != 0) {
                throw InvalidProtocolBufferException.g();
            }
        }

        public int L() {
            if (H() < 4) {
                return (J() & 255) | ((J() & 255) << 8) | ((J() & 255) << 16) | ((J() & 255) << 24);
            }
            long j2 = this.f32021r;
            this.f32021r = 4 + j2;
            return ((UnsafeUtil.x(j2 + 3) & 255) << 24) | (UnsafeUtil.x(j2) & 255) | ((UnsafeUtil.x(1 + j2) & 255) << 8) | ((UnsafeUtil.x(2 + j2) & 255) << 16);
        }

        public long M() {
            long J;
            byte J2;
            if (H() >= 8) {
                long j2 = this.f32021r;
                this.f32021r = 8 + j2;
                J = (((long) UnsafeUtil.x(j2)) & 255) | ((((long) UnsafeUtil.x(1 + j2)) & 255) << 8) | ((((long) UnsafeUtil.x(2 + j2)) & 255) << 16) | ((((long) UnsafeUtil.x(3 + j2)) & 255) << 24) | ((((long) UnsafeUtil.x(4 + j2)) & 255) << 32) | ((((long) UnsafeUtil.x(5 + j2)) & 255) << 40) | ((((long) UnsafeUtil.x(6 + j2)) & 255) << 48);
                J2 = UnsafeUtil.x(j2 + 7);
            } else {
                J = (((long) J()) & 255) | ((((long) J()) & 255) << 8) | ((((long) J()) & 255) << 16) | ((((long) J()) & 255) << 24) | ((((long) J()) & 255) << 32) | ((((long) J()) & 255) << 40) | ((((long) J()) & 255) << 48);
                J2 = J();
            }
            return ((((long) J2) & 255) << 56) | J;
        }

        public int N() {
            byte b2;
            byte b3;
            long j2 = this.f32021r;
            if (this.f32024u != j2) {
                long j3 = j2 + 1;
                byte x2 = UnsafeUtil.x(j2);
                if (x2 >= 0) {
                    this.f32021r++;
                    return x2;
                } else if (this.f32024u - this.f32021r >= 10) {
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
                    this.f32021r = j4;
                    return b2;
                }
            }
            return (int) P();
        }

        public long O() {
            long j2;
            long j3;
            long j4;
            long j5 = this.f32021r;
            if (this.f32024u != j5) {
                long j6 = j5 + 1;
                byte x2 = UnsafeUtil.x(j5);
                if (x2 >= 0) {
                    this.f32021r++;
                    return (long) x2;
                } else if (this.f32024u - this.f32021r >= 10) {
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
                    this.f32021r = j7;
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

        public final int R() {
            return (int) ((((long) (this.f32015l - this.f32019p)) - this.f32021r) + this.f32022s);
        }

        /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: 
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        public void S() {
            /*
                r1 = this;
            L_0x0000:
                int r0 = r1.D()
                if (r0 == 0) goto L_0x000c
                boolean r0 = r1.G(r0)
                if (r0 != 0) goto L_0x0000
            L_0x000c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.CodedInputStream.IterableDirectByteBufferDecoder.S():void");
        }

        public void T(int i2) {
            if (i2 >= 0 && ((long) i2) <= (((long) (this.f32015l - this.f32019p)) - this.f32021r) + this.f32022s) {
                while (i2 > 0) {
                    if (H() == 0) {
                        I();
                    }
                    int min = Math.min(i2, (int) H());
                    i2 -= min;
                    this.f32021r += (long) min;
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
            throw com.google.protobuf.InvalidProtocolBufferException.m();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0028, code lost:
            r2.position(r0);
            r2.limit(r1);
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0023 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.nio.ByteBuffer V(int r4, int r5) {
            /*
                r3 = this;
                java.nio.ByteBuffer r0 = r3.f32012i
                int r0 = r0.position()
                java.nio.ByteBuffer r1 = r3.f32012i
                int r1 = r1.limit()
                java.nio.ByteBuffer r2 = r3.f32012i
                r2.position(r4)     // Catch:{ IllegalArgumentException -> 0x0023 }
                r2.limit(r5)     // Catch:{ IllegalArgumentException -> 0x0023 }
                java.nio.ByteBuffer r4 = r3.f32012i     // Catch:{ IllegalArgumentException -> 0x0023 }
                java.nio.ByteBuffer r4 = r4.slice()     // Catch:{ IllegalArgumentException -> 0x0023 }
                r2.position(r0)
                r2.limit(r1)
                return r4
            L_0x0021:
                r4 = move-exception
                goto L_0x0028
            L_0x0023:
                com.google.protobuf.InvalidProtocolBufferException r4 = com.google.protobuf.InvalidProtocolBufferException.m()     // Catch:{ all -> 0x0021 }
                throw r4     // Catch:{ all -> 0x0021 }
            L_0x0028:
                r2.position(r0)
                r2.limit(r1)
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.CodedInputStream.IterableDirectByteBufferDecoder.V(int, int):java.nio.ByteBuffer");
        }

        public final void W() {
            ByteBuffer byteBuffer = (ByteBuffer) this.f32011h.next();
            this.f32012i = byteBuffer;
            this.f32019p += (int) (this.f32021r - this.f32022s);
            long position = (long) byteBuffer.position();
            this.f32021r = position;
            this.f32022s = position;
            this.f32024u = (long) this.f32012i.limit();
            long k2 = UnsafeUtil.k(this.f32012i);
            this.f32023t = k2;
            this.f32021r += k2;
            this.f32022s += k2;
            this.f32024u += k2;
        }

        public void a(int i2) {
            if (this.f32018o != i2) {
                throw InvalidProtocolBufferException.b();
            }
        }

        public int d() {
            return (int) ((((long) (this.f32019p - this.f32020q)) + this.f32021r) - this.f32022s);
        }

        public boolean e() {
            return (((long) this.f32019p) + this.f32021r) - this.f32022s == ((long) this.f32015l);
        }

        public void m(int i2) {
            this.f32017n = i2;
            Q();
        }

        public int n(int i2) {
            if (i2 >= 0) {
                int d2 = i2 + d();
                int i3 = this.f32017n;
                if (d2 <= i3) {
                    this.f32017n = d2;
                    Q();
                    return i3;
                }
                throw InvalidProtocolBufferException.m();
            }
            throw InvalidProtocolBufferException.g();
        }

        public boolean o() {
            return O() != 0;
        }

        public ByteString p() {
            int N = N();
            if (N > 0) {
                long j2 = (long) N;
                long j3 = this.f32024u;
                long j4 = this.f32021r;
                if (j2 <= j3 - j4) {
                    if (!this.f32013j || !this.f32014k) {
                        byte[] bArr = new byte[N];
                        UnsafeUtil.p(j4, bArr, 0, j2);
                        this.f32021r += j2;
                        return ByteString.X(bArr);
                    }
                    int i2 = (int) (j4 - this.f32023t);
                    ByteString W = ByteString.W(V(i2, N + i2));
                    this.f32021r += j2;
                    return W;
                }
            }
            if (N <= 0 || N > R()) {
                if (N == 0) {
                    return ByteString.f31983A;
                }
                if (N < 0) {
                    throw InvalidProtocolBufferException.g();
                }
                throw InvalidProtocolBufferException.m();
            } else if (!this.f32013j || !this.f32014k) {
                byte[] bArr2 = new byte[N];
                K(bArr2, 0, N);
                return ByteString.X(bArr2);
            } else {
                ArrayList arrayList = new ArrayList();
                while (N > 0) {
                    if (H() == 0) {
                        I();
                    }
                    int min = Math.min(N, (int) H());
                    int i3 = (int) (this.f32021r - this.f32023t);
                    arrayList.add(ByteString.W(V(i3, i3 + min)));
                    N -= min;
                    this.f32021r += (long) min;
                }
                return ByteString.p(arrayList);
            }
        }

        public double q() {
            return Double.longBitsToDouble(M());
        }

        public int r() {
            return N();
        }

        public int s() {
            return L();
        }

        public long t() {
            return M();
        }

        public float u() {
            return Float.intBitsToFloat(L());
        }

        public int v() {
            return N();
        }

        public long w() {
            return O();
        }

        public int x() {
            return L();
        }

        public long y() {
            return M();
        }

        public int z() {
            return CodedInputStream.b(N());
        }

        public IterableDirectByteBufferDecoder(Iterable iterable, int i2, boolean z2) {
            super();
            this.f32017n = Integer.MAX_VALUE;
            this.f32015l = i2;
            this.f32010g = iterable;
            this.f32011h = iterable.iterator();
            this.f32013j = z2;
            this.f32019p = 0;
            this.f32020q = 0;
            if (i2 == 0) {
                this.f32012i = Internal.f32171e;
                this.f32021r = 0;
                this.f32022s = 0;
                this.f32024u = 0;
                this.f32023t = 0;
                return;
            }
            W();
        }
    }

    public static final class StreamDecoder extends CodedInputStream {

        /* renamed from: g  reason: collision with root package name */
        public final InputStream f32025g;

        /* renamed from: h  reason: collision with root package name */
        public final byte[] f32026h;

        /* renamed from: i  reason: collision with root package name */
        public int f32027i;

        /* renamed from: j  reason: collision with root package name */
        public int f32028j;

        /* renamed from: k  reason: collision with root package name */
        public int f32029k;

        /* renamed from: l  reason: collision with root package name */
        public int f32030l;

        /* renamed from: m  reason: collision with root package name */
        public int f32031m;

        /* renamed from: n  reason: collision with root package name */
        public int f32032n;

        /* renamed from: o  reason: collision with root package name */
        public RefillCallback f32033o;

        public interface RefillCallback {
            void a();
        }

        public class SkippedDataSink implements RefillCallback {

            /* renamed from: a  reason: collision with root package name */
            public int f32034a;

            /* renamed from: b  reason: collision with root package name */
            public ByteArrayOutputStream f32035b;

            /* renamed from: c  reason: collision with root package name */
            public final /* synthetic */ StreamDecoder f32036c;

            public void a() {
                if (this.f32035b == null) {
                    this.f32035b = new ByteArrayOutputStream();
                }
                this.f32035b.write(this.f32036c.f32026h, this.f32034a, this.f32036c.f32029k - this.f32034a);
                this.f32034a = 0;
            }
        }

        public static int J(InputStream inputStream) {
            try {
                return inputStream.available();
            } catch (InvalidProtocolBufferException e2) {
                e2.j();
                throw e2;
            }
        }

        public static int K(InputStream inputStream, byte[] bArr, int i2, int i3) {
            try {
                return inputStream.read(bArr, i2, i3);
            } catch (InvalidProtocolBufferException e2) {
                e2.j();
                throw e2;
            }
        }

        private void V() {
            int i2 = this.f32027i + this.f32028j;
            this.f32027i = i2;
            int i3 = this.f32031m + i2;
            int i4 = this.f32032n;
            if (i3 > i4) {
                int i5 = i3 - i4;
                this.f32028j = i5;
                this.f32027i = i2 - i5;
                return;
            }
            this.f32028j = 0;
        }

        public static long X(InputStream inputStream, long j2) {
            try {
                return inputStream.skip(j2);
            } catch (InvalidProtocolBufferException e2) {
                e2.j();
                throw e2;
            }
        }

        private void b0() {
            if (this.f32027i - this.f32029k >= 10) {
                c0();
            } else {
                d0();
            }
        }

        private void c0() {
            int i2 = 0;
            while (i2 < 10) {
                byte[] bArr = this.f32026h;
                int i3 = this.f32029k;
                this.f32029k = i3 + 1;
                if (bArr[i3] < 0) {
                    i2++;
                } else {
                    return;
                }
            }
            throw InvalidProtocolBufferException.f();
        }

        private void d0() {
            int i2 = 0;
            while (i2 < 10) {
                if (M() < 0) {
                    i2++;
                } else {
                    return;
                }
            }
            throw InvalidProtocolBufferException.f();
        }

        public long A() {
            return CodedInputStream.c(T());
        }

        public String B() {
            int S = S();
            if (S > 0) {
                int i2 = this.f32027i;
                int i3 = this.f32029k;
                if (S <= i2 - i3) {
                    String str = new String(this.f32026h, i3, S, Internal.f32168b);
                    this.f32029k += S;
                    return str;
                }
            }
            if (S == 0) {
                return "";
            }
            if (S > this.f32027i) {
                return new String(N(S, false), Internal.f32168b);
            }
            W(S);
            String str2 = new String(this.f32026h, this.f32029k, S, Internal.f32168b);
            this.f32029k += S;
            return str2;
        }

        public String C() {
            byte[] bArr;
            int S = S();
            int i2 = this.f32029k;
            int i3 = this.f32027i;
            if (S <= i3 - i2 && S > 0) {
                bArr = this.f32026h;
                this.f32029k = i2 + S;
            } else if (S == 0) {
                return "";
            } else {
                i2 = 0;
                if (S <= i3) {
                    W(S);
                    bArr = this.f32026h;
                    this.f32029k = S;
                } else {
                    bArr = N(S, false);
                }
            }
            return Utf8.h(bArr, i2, S);
        }

        public int D() {
            if (e()) {
                this.f32030l = 0;
                return 0;
            }
            int S = S();
            this.f32030l = S;
            if (WireFormat.a(S) != 0) {
                return this.f32030l;
            }
            throw InvalidProtocolBufferException.c();
        }

        public int E() {
            return S();
        }

        public long F() {
            return T();
        }

        public boolean G(int i2) {
            int b2 = WireFormat.b(i2);
            if (b2 == 0) {
                b0();
                return true;
            } else if (b2 == 1) {
                Z(8);
                return true;
            } else if (b2 == 2) {
                Z(S());
                return true;
            } else if (b2 == 3) {
                Y();
                a(WireFormat.c(WireFormat.a(i2), 4));
                return true;
            } else if (b2 == 4) {
                return false;
            } else {
                if (b2 == 5) {
                    Z(4);
                    return true;
                }
                throw InvalidProtocolBufferException.e();
            }
        }

        public final ByteString L(int i2) {
            byte[] O = O(i2);
            if (O != null) {
                return ByteString.q(O);
            }
            int i3 = this.f32029k;
            int i4 = this.f32027i;
            int i5 = i4 - i3;
            this.f32031m += i4;
            this.f32029k = 0;
            this.f32027i = 0;
            List<byte[]> P = P(i2 - i5);
            byte[] bArr = new byte[i2];
            System.arraycopy(this.f32026h, i3, bArr, 0, i5);
            for (byte[] bArr2 : P) {
                System.arraycopy(bArr2, 0, bArr, i5, bArr2.length);
                i5 += bArr2.length;
            }
            return ByteString.X(bArr);
        }

        public byte M() {
            if (this.f32029k == this.f32027i) {
                W(1);
            }
            byte[] bArr = this.f32026h;
            int i2 = this.f32029k;
            this.f32029k = i2 + 1;
            return bArr[i2];
        }

        public final byte[] N(int i2, boolean z2) {
            byte[] O = O(i2);
            if (O != null) {
                return z2 ? (byte[]) O.clone() : O;
            }
            int i3 = this.f32029k;
            int i4 = this.f32027i;
            int i5 = i4 - i3;
            this.f32031m += i4;
            this.f32029k = 0;
            this.f32027i = 0;
            List<byte[]> P = P(i2 - i5);
            byte[] bArr = new byte[i2];
            System.arraycopy(this.f32026h, i3, bArr, 0, i5);
            for (byte[] bArr2 : P) {
                System.arraycopy(bArr2, 0, bArr, i5, bArr2.length);
                i5 += bArr2.length;
            }
            return bArr;
        }

        public final byte[] O(int i2) {
            if (i2 == 0) {
                return Internal.f32170d;
            }
            if (i2 >= 0) {
                int i3 = this.f32031m;
                int i4 = this.f32029k;
                int i5 = i3 + i4 + i2;
                if (i5 - this.f31998c <= 0) {
                    int i6 = this.f32032n;
                    if (i5 <= i6) {
                        int i7 = this.f32027i - i4;
                        int i8 = i2 - i7;
                        if (i8 >= 4096 && i8 > J(this.f32025g)) {
                            return null;
                        }
                        byte[] bArr = new byte[i2];
                        System.arraycopy(this.f32026h, this.f32029k, bArr, 0, i7);
                        this.f32031m += this.f32027i;
                        this.f32029k = 0;
                        this.f32027i = 0;
                        while (i7 < i2) {
                            int K = K(this.f32025g, bArr, i7, i2 - i7);
                            if (K != -1) {
                                this.f32031m += K;
                                i7 += K;
                            } else {
                                throw InvalidProtocolBufferException.m();
                            }
                        }
                        return bArr;
                    }
                    Z((i6 - i3) - i4);
                    throw InvalidProtocolBufferException.m();
                }
                throw InvalidProtocolBufferException.l();
            }
            throw InvalidProtocolBufferException.g();
        }

        public final List P(int i2) {
            ArrayList arrayList = new ArrayList();
            while (i2 > 0) {
                int min = Math.min(i2, 4096);
                byte[] bArr = new byte[min];
                int i3 = 0;
                while (i3 < min) {
                    int read = this.f32025g.read(bArr, i3, min - i3);
                    if (read != -1) {
                        this.f32031m += read;
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

        public int Q() {
            int i2 = this.f32029k;
            if (this.f32027i - i2 < 4) {
                W(4);
                i2 = this.f32029k;
            }
            byte[] bArr = this.f32026h;
            this.f32029k = i2 + 4;
            return ((bArr[i2 + 3] & 255) << 24) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16);
        }

        public long R() {
            int i2 = this.f32029k;
            if (this.f32027i - i2 < 8) {
                W(8);
                i2 = this.f32029k;
            }
            byte[] bArr = this.f32026h;
            this.f32029k = i2 + 8;
            return ((((long) bArr[i2 + 7]) & 255) << 56) | (((long) bArr[i2]) & 255) | ((((long) bArr[i2 + 1]) & 255) << 8) | ((((long) bArr[i2 + 2]) & 255) << 16) | ((((long) bArr[i2 + 3]) & 255) << 24) | ((((long) bArr[i2 + 4]) & 255) << 32) | ((((long) bArr[i2 + 5]) & 255) << 40) | ((((long) bArr[i2 + 6]) & 255) << 48);
        }

        public int S() {
            byte b2;
            byte b3;
            int i2 = this.f32029k;
            int i3 = this.f32027i;
            if (i3 != i2) {
                byte[] bArr = this.f32026h;
                int i4 = i2 + 1;
                byte b4 = bArr[i2];
                if (b4 >= 0) {
                    this.f32029k = i4;
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
                    this.f32029k = i5;
                    return b2;
                }
            }
            return (int) U();
        }

        public long T() {
            long j2;
            long j3;
            long j4;
            int i2 = this.f32029k;
            int i3 = this.f32027i;
            if (i3 != i2) {
                byte[] bArr = this.f32026h;
                int i4 = i2 + 1;
                byte b2 = bArr[i2];
                if (b2 >= 0) {
                    this.f32029k = i4;
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
                    this.f32029k = i5;
                    return j2;
                }
            }
            return U();
        }

        public long U() {
            long j2 = 0;
            for (int i2 = 0; i2 < 64; i2 += 7) {
                byte M = M();
                j2 |= ((long) (M & Byte.MAX_VALUE)) << i2;
                if ((M & 128) == 0) {
                    return j2;
                }
            }
            throw InvalidProtocolBufferException.f();
        }

        public final void W(int i2) {
            if (e0(i2)) {
                return;
            }
            if (i2 > (this.f31998c - this.f32031m) - this.f32029k) {
                throw InvalidProtocolBufferException.l();
            }
            throw InvalidProtocolBufferException.m();
        }

        /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: 
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        public void Y() {
            /*
                r1 = this;
            L_0x0000:
                int r0 = r1.D()
                if (r0 == 0) goto L_0x000c
                boolean r0 = r1.G(r0)
                if (r0 != 0) goto L_0x0000
            L_0x000c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.CodedInputStream.StreamDecoder.Y():void");
        }

        public void Z(int i2) {
            int i3 = this.f32027i;
            int i4 = this.f32029k;
            if (i2 > i3 - i4 || i2 < 0) {
                a0(i2);
            } else {
                this.f32029k = i4 + i2;
            }
        }

        public void a(int i2) {
            if (this.f32030l != i2) {
                throw InvalidProtocolBufferException.b();
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:17:0x005c, code lost:
            throw new java.lang.IllegalStateException(r8.f32025g.getClass() + "#skip returned invalid result: " + r0 + "\nThe InputStream implementation is buggy.");
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a0(int r9) {
            /*
                r8 = this;
                if (r9 < 0) goto L_0x0097
                int r0 = r8.f32031m
                int r1 = r8.f32029k
                int r2 = r0 + r1
                int r2 = r2 + r9
                int r3 = r8.f32032n
                if (r2 > r3) goto L_0x008d
                com.google.protobuf.CodedInputStream$StreamDecoder$RefillCallback r2 = r8.f32033o
                r3 = 0
                if (r2 != 0) goto L_0x006f
                int r0 = r0 + r1
                r8.f32031m = r0
                int r0 = r8.f32027i
                int r0 = r0 - r1
                r8.f32027i = r3
                r8.f32029k = r3
                r3 = r0
            L_0x001d:
                if (r3 >= r9) goto L_0x0067
                int r0 = r9 - r3
                java.io.InputStream r1 = r8.f32025g     // Catch:{ all -> 0x005d }
                long r4 = (long) r0     // Catch:{ all -> 0x005d }
                long r0 = X(r1, r4)     // Catch:{ all -> 0x005d }
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
                java.io.InputStream r4 = r8.f32025g     // Catch:{ all -> 0x005d }
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
                int r0 = r8.f32031m
                int r0 = r0 + r3
                r8.f32031m = r0
                r8.V()
                throw r9
            L_0x0067:
                int r0 = r8.f32031m
                int r0 = r0 + r3
                r8.f32031m = r0
                r8.V()
            L_0x006f:
                if (r3 >= r9) goto L_0x008c
                int r0 = r8.f32027i
                int r1 = r8.f32029k
                int r1 = r0 - r1
                r8.f32029k = r0
                r0 = 1
                r8.W(r0)
            L_0x007d:
                int r2 = r9 - r1
                int r3 = r8.f32027i
                if (r2 <= r3) goto L_0x008a
                int r1 = r1 + r3
                r8.f32029k = r3
                r8.W(r0)
                goto L_0x007d
            L_0x008a:
                r8.f32029k = r2
            L_0x008c:
                return
            L_0x008d:
                int r3 = r3 - r0
                int r3 = r3 - r1
                r8.Z(r3)
                com.google.protobuf.InvalidProtocolBufferException r9 = com.google.protobuf.InvalidProtocolBufferException.m()
                throw r9
            L_0x0097:
                com.google.protobuf.InvalidProtocolBufferException r9 = com.google.protobuf.InvalidProtocolBufferException.g()
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.CodedInputStream.StreamDecoder.a0(int):void");
        }

        public int d() {
            return this.f32031m + this.f32029k;
        }

        public boolean e() {
            return this.f32029k == this.f32027i && !e0(1);
        }

        public final boolean e0(int i2) {
            int i3 = this.f32029k;
            if (i3 + i2 > this.f32027i) {
                int i4 = this.f31998c;
                int i5 = this.f32031m;
                if (i2 > (i4 - i5) - i3 || i5 + i3 + i2 > this.f32032n) {
                    return false;
                }
                RefillCallback refillCallback = this.f32033o;
                if (refillCallback != null) {
                    refillCallback.a();
                }
                int i6 = this.f32029k;
                if (i6 > 0) {
                    int i7 = this.f32027i;
                    if (i7 > i6) {
                        byte[] bArr = this.f32026h;
                        System.arraycopy(bArr, i6, bArr, 0, i7 - i6);
                    }
                    this.f32031m += i6;
                    this.f32027i -= i6;
                    this.f32029k = 0;
                }
                InputStream inputStream = this.f32025g;
                byte[] bArr2 = this.f32026h;
                int i8 = this.f32027i;
                int K = K(inputStream, bArr2, i8, Math.min(bArr2.length - i8, (this.f31998c - this.f32031m) - i8));
                if (K == 0 || K < -1 || K > this.f32026h.length) {
                    throw new IllegalStateException(this.f32025g.getClass() + "#read(byte[]) returned invalid result: " + K + "\nThe InputStream implementation is buggy.");
                } else if (K <= 0) {
                    return false;
                } else {
                    this.f32027i += K;
                    V();
                    if (this.f32027i >= i2) {
                        return true;
                    }
                    return e0(i2);
                }
            } else {
                throw new IllegalStateException("refillBuffer() called when " + i2 + " bytes were already available in buffer");
            }
        }

        public void m(int i2) {
            this.f32032n = i2;
            V();
        }

        public int n(int i2) {
            if (i2 >= 0) {
                int i3 = i2 + this.f32031m + this.f32029k;
                int i4 = this.f32032n;
                if (i3 <= i4) {
                    this.f32032n = i3;
                    V();
                    return i4;
                }
                throw InvalidProtocolBufferException.m();
            }
            throw InvalidProtocolBufferException.g();
        }

        public boolean o() {
            return T() != 0;
        }

        public ByteString p() {
            int S = S();
            int i2 = this.f32027i;
            int i3 = this.f32029k;
            if (S > i2 - i3 || S <= 0) {
                return S == 0 ? ByteString.f31983A : L(S);
            }
            ByteString s2 = ByteString.s(this.f32026h, i3, S);
            this.f32029k += S;
            return s2;
        }

        public double q() {
            return Double.longBitsToDouble(R());
        }

        public int r() {
            return S();
        }

        public int s() {
            return Q();
        }

        public long t() {
            return R();
        }

        public float u() {
            return Float.intBitsToFloat(Q());
        }

        public int v() {
            return S();
        }

        public long w() {
            return T();
        }

        public int x() {
            return Q();
        }

        public long y() {
            return R();
        }

        public int z() {
            return CodedInputStream.b(S());
        }

        public StreamDecoder(InputStream inputStream, int i2) {
            super();
            this.f32032n = Integer.MAX_VALUE;
            this.f32033o = null;
            Internal.b(inputStream, "input");
            this.f32025g = inputStream;
            this.f32026h = new byte[i2];
            this.f32027i = 0;
            this.f32029k = 0;
            this.f32031m = 0;
        }
    }

    public static final class UnsafeDirectNioDecoder extends CodedInputStream {

        /* renamed from: g  reason: collision with root package name */
        public final ByteBuffer f32037g;

        /* renamed from: h  reason: collision with root package name */
        public final boolean f32038h;

        /* renamed from: i  reason: collision with root package name */
        public final long f32039i;

        /* renamed from: j  reason: collision with root package name */
        public long f32040j;

        /* renamed from: k  reason: collision with root package name */
        public long f32041k;

        /* renamed from: l  reason: collision with root package name */
        public long f32042l;

        /* renamed from: m  reason: collision with root package name */
        public int f32043m;

        /* renamed from: n  reason: collision with root package name */
        public int f32044n;

        /* renamed from: o  reason: collision with root package name */
        public boolean f32045o;

        /* renamed from: p  reason: collision with root package name */
        public int f32046p;

        public static boolean I() {
            return UnsafeUtil.K();
        }

        private void P() {
            long j2 = this.f32040j + ((long) this.f32043m);
            this.f32040j = j2;
            int i2 = (int) (j2 - this.f32042l);
            int i3 = this.f32046p;
            if (i2 > i3) {
                int i4 = i2 - i3;
                this.f32043m = i4;
                this.f32040j = j2 - ((long) i4);
                return;
            }
            this.f32043m = 0;
        }

        private int Q() {
            return (int) (this.f32040j - this.f32041k);
        }

        private void T() {
            if (Q() >= 10) {
                U();
            } else {
                V();
            }
        }

        private void U() {
            int i2 = 0;
            while (i2 < 10) {
                long j2 = this.f32041k;
                this.f32041k = 1 + j2;
                if (UnsafeUtil.x(j2) < 0) {
                    i2++;
                } else {
                    return;
                }
            }
            throw InvalidProtocolBufferException.f();
        }

        private void V() {
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

        public long A() {
            return CodedInputStream.c(N());
        }

        public String B() {
            int M = M();
            if (M > 0 && M <= Q()) {
                byte[] bArr = new byte[M];
                long j2 = (long) M;
                UnsafeUtil.p(this.f32041k, bArr, 0, j2);
                String str = new String(bArr, Internal.f32168b);
                this.f32041k += j2;
                return str;
            } else if (M == 0) {
                return "";
            } else {
                if (M < 0) {
                    throw InvalidProtocolBufferException.g();
                }
                throw InvalidProtocolBufferException.m();
            }
        }

        public String C() {
            int M = M();
            if (M > 0 && M <= Q()) {
                String g2 = Utf8.g(this.f32037g, H(this.f32041k), M);
                this.f32041k += (long) M;
                return g2;
            } else if (M == 0) {
                return "";
            } else {
                if (M <= 0) {
                    throw InvalidProtocolBufferException.g();
                }
                throw InvalidProtocolBufferException.m();
            }
        }

        public int D() {
            if (e()) {
                this.f32044n = 0;
                return 0;
            }
            int M = M();
            this.f32044n = M;
            if (WireFormat.a(M) != 0) {
                return this.f32044n;
            }
            throw InvalidProtocolBufferException.c();
        }

        public int E() {
            return M();
        }

        public long F() {
            return N();
        }

        public boolean G(int i2) {
            int b2 = WireFormat.b(i2);
            if (b2 == 0) {
                T();
                return true;
            } else if (b2 == 1) {
                S(8);
                return true;
            } else if (b2 == 2) {
                S(M());
                return true;
            } else if (b2 == 3) {
                R();
                a(WireFormat.c(WireFormat.a(i2), 4));
                return true;
            } else if (b2 == 4) {
                return false;
            } else {
                if (b2 == 5) {
                    S(4);
                    return true;
                }
                throw InvalidProtocolBufferException.e();
            }
        }

        public final int H(long j2) {
            return (int) (j2 - this.f32039i);
        }

        public byte J() {
            long j2 = this.f32041k;
            if (j2 != this.f32040j) {
                this.f32041k = 1 + j2;
                return UnsafeUtil.x(j2);
            }
            throw InvalidProtocolBufferException.m();
        }

        public int K() {
            long j2 = this.f32041k;
            if (this.f32040j - j2 >= 4) {
                this.f32041k = 4 + j2;
                return ((UnsafeUtil.x(j2 + 3) & 255) << 24) | (UnsafeUtil.x(j2) & 255) | ((UnsafeUtil.x(1 + j2) & 255) << 8) | ((UnsafeUtil.x(2 + j2) & 255) << 16);
            }
            throw InvalidProtocolBufferException.m();
        }

        public long L() {
            long j2 = this.f32041k;
            if (this.f32040j - j2 >= 8) {
                this.f32041k = 8 + j2;
                return ((((long) UnsafeUtil.x(j2 + 7)) & 255) << 56) | (((long) UnsafeUtil.x(j2)) & 255) | ((((long) UnsafeUtil.x(1 + j2)) & 255) << 8) | ((((long) UnsafeUtil.x(2 + j2)) & 255) << 16) | ((((long) UnsafeUtil.x(3 + j2)) & 255) << 24) | ((((long) UnsafeUtil.x(4 + j2)) & 255) << 32) | ((((long) UnsafeUtil.x(5 + j2)) & 255) << 40) | ((((long) UnsafeUtil.x(6 + j2)) & 255) << 48);
            }
            throw InvalidProtocolBufferException.m();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:29:0x008c, code lost:
            if (com.google.protobuf.UnsafeUtil.x(r3) < 0) goto L_0x008e;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int M() {
            /*
                r9 = this;
                long r0 = r9.f32041k
                long r2 = r9.f32040j
                int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r2 != 0) goto L_0x000a
                goto L_0x008e
            L_0x000a:
                r2 = 1
                long r2 = r2 + r0
                byte r4 = com.google.protobuf.UnsafeUtil.x(r0)
                if (r4 < 0) goto L_0x0016
                r9.f32041k = r2
                return r4
            L_0x0016:
                long r5 = r9.f32040j
                long r5 = r5 - r2
                r7 = 9
                int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r5 >= 0) goto L_0x0021
                goto L_0x008e
            L_0x0021:
                r5 = 2
                long r5 = r5 + r0
                byte r2 = com.google.protobuf.UnsafeUtil.x(r2)
                int r2 = r2 << 7
                r2 = r2 ^ r4
                if (r2 >= 0) goto L_0x0031
                r0 = r2 ^ -128(0xffffffffffffff80, float:NaN)
                goto L_0x0098
            L_0x0031:
                r3 = 3
                long r3 = r3 + r0
                byte r5 = com.google.protobuf.UnsafeUtil.x(r5)
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
                byte r3 = com.google.protobuf.UnsafeUtil.x(r3)
                int r3 = r3 << 21
                r2 = r2 ^ r3
                if (r2 >= 0) goto L_0x0052
                r0 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L_0x0098
            L_0x0052:
                r3 = 5
                long r3 = r3 + r0
                byte r5 = com.google.protobuf.UnsafeUtil.x(r5)
                int r6 = r5 << 28
                r2 = r2 ^ r6
                r6 = 266354560(0xfe03f80, float:2.2112565E-29)
                r2 = r2 ^ r6
                if (r5 >= 0) goto L_0x0096
                r5 = 6
                long r5 = r5 + r0
                byte r3 = com.google.protobuf.UnsafeUtil.x(r3)
                if (r3 >= 0) goto L_0x0094
                r3 = 7
                long r3 = r3 + r0
                byte r5 = com.google.protobuf.UnsafeUtil.x(r5)
                if (r5 >= 0) goto L_0x0096
                r5 = 8
                long r5 = r5 + r0
                byte r3 = com.google.protobuf.UnsafeUtil.x(r3)
                if (r3 >= 0) goto L_0x0094
                long r3 = r0 + r7
                byte r5 = com.google.protobuf.UnsafeUtil.x(r5)
                if (r5 >= 0) goto L_0x0096
                r5 = 10
                long r5 = r5 + r0
                byte r0 = com.google.protobuf.UnsafeUtil.x(r3)
                if (r0 >= 0) goto L_0x0094
            L_0x008e:
                long r0 = r9.O()
                int r0 = (int) r0
                return r0
            L_0x0094:
                r0 = r2
                goto L_0x0098
            L_0x0096:
                r0 = r2
                goto L_0x003f
            L_0x0098:
                r9.f32041k = r5
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.CodedInputStream.UnsafeDirectNioDecoder.M():int");
        }

        public long N() {
            long j2;
            long j3;
            long j4;
            byte b2;
            long j5 = this.f32041k;
            if (this.f32040j != j5) {
                long j6 = 1 + j5;
                byte x2 = UnsafeUtil.x(j5);
                if (x2 >= 0) {
                    this.f32041k = j6;
                    return (long) x2;
                } else if (this.f32040j - j6 >= 9) {
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
                        this.f32041k = j7;
                        return j2;
                    }
                    j2 = (long) b2;
                    this.f32041k = j7;
                    return j2;
                }
            }
            return O();
        }

        public long O() {
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

        /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: 
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        public void R() {
            /*
                r1 = this;
            L_0x0000:
                int r0 = r1.D()
                if (r0 == 0) goto L_0x000c
                boolean r0 = r1.G(r0)
                if (r0 != 0) goto L_0x0000
            L_0x000c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.CodedInputStream.UnsafeDirectNioDecoder.R():void");
        }

        public void S(int i2) {
            if (i2 >= 0 && i2 <= Q()) {
                this.f32041k += (long) i2;
            } else if (i2 < 0) {
                throw InvalidProtocolBufferException.g();
            } else {
                throw InvalidProtocolBufferException.m();
            }
        }

        public final ByteBuffer W(long j2, long j3) {
            int position = this.f32037g.position();
            int limit = this.f32037g.limit();
            ByteBuffer byteBuffer = this.f32037g;
            try {
                byteBuffer.position(H(j2));
                byteBuffer.limit(H(j3));
                ByteBuffer slice = this.f32037g.slice();
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
            if (this.f32044n != i2) {
                throw InvalidProtocolBufferException.b();
            }
        }

        public int d() {
            return (int) (this.f32041k - this.f32042l);
        }

        public boolean e() {
            return this.f32041k == this.f32040j;
        }

        public void m(int i2) {
            this.f32046p = i2;
            P();
        }

        public int n(int i2) {
            if (i2 >= 0) {
                int d2 = i2 + d();
                int i3 = this.f32046p;
                if (d2 <= i3) {
                    this.f32046p = d2;
                    P();
                    return i3;
                }
                throw InvalidProtocolBufferException.m();
            }
            throw InvalidProtocolBufferException.g();
        }

        public boolean o() {
            return N() != 0;
        }

        public ByteString p() {
            int M = M();
            if (M <= 0 || M > Q()) {
                if (M == 0) {
                    return ByteString.f31983A;
                }
                if (M < 0) {
                    throw InvalidProtocolBufferException.g();
                }
                throw InvalidProtocolBufferException.m();
            } else if (!this.f32038h || !this.f32045o) {
                byte[] bArr = new byte[M];
                long j2 = (long) M;
                UnsafeUtil.p(this.f32041k, bArr, 0, j2);
                this.f32041k += j2;
                return ByteString.X(bArr);
            } else {
                long j3 = this.f32041k;
                long j4 = (long) M;
                ByteBuffer W = W(j3, j3 + j4);
                this.f32041k += j4;
                return ByteString.W(W);
            }
        }

        public double q() {
            return Double.longBitsToDouble(L());
        }

        public int r() {
            return M();
        }

        public int s() {
            return K();
        }

        public long t() {
            return L();
        }

        public float u() {
            return Float.intBitsToFloat(K());
        }

        public int v() {
            return M();
        }

        public long w() {
            return N();
        }

        public int x() {
            return K();
        }

        public long y() {
            return L();
        }

        public int z() {
            return CodedInputStream.b(M());
        }

        public UnsafeDirectNioDecoder(ByteBuffer byteBuffer, boolean z2) {
            super();
            this.f32046p = Integer.MAX_VALUE;
            this.f32037g = byteBuffer;
            long k2 = UnsafeUtil.k(byteBuffer);
            this.f32039i = k2;
            this.f32040j = ((long) byteBuffer.limit()) + k2;
            long position = k2 + ((long) byteBuffer.position());
            this.f32041k = position;
            this.f32042l = position;
            this.f32038h = z2;
        }
    }

    public static int b(int i2) {
        return (-(i2 & 1)) ^ (i2 >>> 1);
    }

    public static long c(long j2) {
        return (-(j2 & 1)) ^ (j2 >>> 1);
    }

    public static CodedInputStream f(InputStream inputStream) {
        return g(inputStream, 4096);
    }

    public static CodedInputStream g(InputStream inputStream, int i2) {
        if (i2 > 0) {
            return inputStream == null ? j(Internal.f32170d) : new StreamDecoder(inputStream, i2);
        }
        throw new IllegalArgumentException("bufferSize must be > 0");
    }

    public static CodedInputStream h(Iterable iterable, boolean z2) {
        Iterator it = iterable.iterator();
        boolean z3 = false;
        int i2 = 0;
        while (it.hasNext()) {
            ByteBuffer byteBuffer = (ByteBuffer) it.next();
            i2 += byteBuffer.remaining();
            z3 = byteBuffer.hasArray() ? z3 | true : byteBuffer.isDirect() ? z3 | true : z3 | true;
        }
        return z3 ? new IterableDirectByteBufferDecoder(iterable, i2, z2) : f(new IterableByteBufferInputStream(iterable));
    }

    public static CodedInputStream i(ByteBuffer byteBuffer, boolean z2) {
        if (byteBuffer.hasArray()) {
            return l(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining(), z2);
        }
        if (byteBuffer.isDirect() && UnsafeDirectNioDecoder.I()) {
            return new UnsafeDirectNioDecoder(byteBuffer, z2);
        }
        int remaining = byteBuffer.remaining();
        byte[] bArr = new byte[remaining];
        byteBuffer.duplicate().get(bArr);
        return l(bArr, 0, remaining, true);
    }

    public static CodedInputStream j(byte[] bArr) {
        return k(bArr, 0, bArr.length);
    }

    public static CodedInputStream k(byte[] bArr, int i2, int i3) {
        return l(bArr, i2, i3, false);
    }

    public static CodedInputStream l(byte[] bArr, int i2, int i3, boolean z2) {
        ArrayDecoder arrayDecoder = new ArrayDecoder(bArr, i2, i3, z2);
        try {
            arrayDecoder.n(i3);
            return arrayDecoder;
        } catch (InvalidProtocolBufferException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public abstract long A();

    public abstract String B();

    public abstract String C();

    public abstract int D();

    public abstract int E();

    public abstract long F();

    public abstract boolean G(int i2);

    public abstract void a(int i2);

    public abstract int d();

    public abstract boolean e();

    public abstract void m(int i2);

    public abstract int n(int i2);

    public abstract boolean o();

    public abstract ByteString p();

    public abstract double q();

    public abstract int r();

    public abstract int s();

    public abstract long t();

    public abstract float u();

    public abstract int v();

    public abstract long w();

    public abstract int x();

    public abstract long y();

    public abstract int z();

    public CodedInputStream() {
        this.f31997b = f31995f;
        this.f31998c = Integer.MAX_VALUE;
        this.f32000e = false;
    }
}
