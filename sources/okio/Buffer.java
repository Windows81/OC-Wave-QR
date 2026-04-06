package okio;

import io.realm.internal.OsSharedRealm;
import java.io.Closeable;
import java.io.EOFException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

@Metadata
public final class Buffer implements BufferedSource, BufferedSink, Cloneable, ByteChannel {

    /* renamed from: A  reason: collision with root package name */
    public long f43338A;

    /* renamed from: z  reason: collision with root package name */
    public Segment f43339z;

    @Metadata
    public static final class UnsafeCursor implements Closeable {

        /* renamed from: A  reason: collision with root package name */
        public boolean f43340A;

        /* renamed from: B  reason: collision with root package name */
        public Segment f43341B;
        public long C = -1;
        public byte[] D;
        public int E = -1;
        public int F = -1;

        /* renamed from: z  reason: collision with root package name */
        public Buffer f43342z;

        public final Segment a() {
            return this.f43341B;
        }

        public final int b() {
            long j2 = this.C;
            Buffer buffer = this.f43342z;
            Intrinsics.f(buffer);
            if (j2 != buffer.n0()) {
                long j3 = this.C;
                return d(j3 == -1 ? 0 : j3 + ((long) (this.F - this.E)));
            }
            throw new IllegalStateException("no more bytes");
        }

        public final long c(long j2) {
            Buffer buffer = this.f43342z;
            if (buffer == null) {
                throw new IllegalStateException("not attached to a buffer");
            } else if (this.f43340A) {
                long n0 = buffer.n0();
                int i2 = (j2 > n0 ? 1 : (j2 == n0 ? 0 : -1));
                if (i2 <= 0) {
                    if (j2 >= 0) {
                        long j3 = n0 - j2;
                        while (true) {
                            if (j3 <= 0) {
                                break;
                            }
                            Segment segment = buffer.f43339z;
                            Intrinsics.f(segment);
                            Segment segment2 = segment.f43438g;
                            Intrinsics.f(segment2);
                            int i3 = segment2.f43434c;
                            long j4 = (long) (i3 - segment2.f43433b);
                            if (j4 > j3) {
                                segment2.f43434c = i3 - ((int) j3);
                                break;
                            }
                            buffer.f43339z = segment2.b();
                            SegmentPool.b(segment2);
                            j3 -= j4;
                        }
                        f((Segment) null);
                        this.C = j2;
                        this.D = null;
                        this.E = -1;
                        this.F = -1;
                    } else {
                        throw new IllegalArgumentException(("newSize < 0: " + j2).toString());
                    }
                } else if (i2 > 0) {
                    long j5 = j2 - n0;
                    boolean z2 = true;
                    while (j5 > 0) {
                        Segment t0 = buffer.t0(1);
                        int min = (int) Math.min(j5, (long) (8192 - t0.f43434c));
                        t0.f43434c += min;
                        j5 -= (long) min;
                        if (z2) {
                            f(t0);
                            this.C = n0;
                            this.D = t0.f43432a;
                            int i4 = t0.f43434c;
                            this.E = i4 - min;
                            this.F = i4;
                            z2 = false;
                        }
                    }
                }
                buffer.m0(j2);
                return n0;
            } else {
                throw new IllegalStateException("resizeBuffer() only permitted for read/write buffers");
            }
        }

        public void close() {
            if (this.f43342z != null) {
                this.f43342z = null;
                f((Segment) null);
                this.C = -1;
                this.D = null;
                this.E = -1;
                this.F = -1;
                return;
            }
            throw new IllegalStateException("not attached to a buffer");
        }

        public final int d(long j2) {
            Segment segment;
            Buffer buffer = this.f43342z;
            if (buffer != null) {
                int i2 = (j2 > -1 ? 1 : (j2 == -1 ? 0 : -1));
                if (i2 < 0 || j2 > buffer.n0()) {
                    throw new ArrayIndexOutOfBoundsException("offset=" + j2 + " > size=" + buffer.n0());
                } else if (i2 == 0 || j2 == buffer.n0()) {
                    f((Segment) null);
                    this.C = j2;
                    this.D = null;
                    this.E = -1;
                    this.F = -1;
                    return -1;
                } else {
                    long n0 = buffer.n0();
                    Segment segment2 = buffer.f43339z;
                    long j3 = 0;
                    if (a() != null) {
                        long j4 = this.C;
                        int i3 = this.E;
                        Segment a2 = a();
                        Intrinsics.f(a2);
                        long j5 = j4 - ((long) (i3 - a2.f43433b));
                        if (j5 > j2) {
                            segment = segment2;
                            segment2 = a();
                            n0 = j5;
                        } else {
                            segment = a();
                            j3 = j5;
                        }
                    } else {
                        segment = segment2;
                    }
                    if (n0 - j2 > j2 - j3) {
                        while (true) {
                            Intrinsics.f(segment);
                            int i4 = segment.f43434c;
                            int i5 = segment.f43433b;
                            if (j2 < ((long) (i4 - i5)) + j3) {
                                break;
                            }
                            j3 += (long) (i4 - i5);
                            segment = segment.f43437f;
                        }
                    } else {
                        while (n0 > j2) {
                            Intrinsics.f(segment2);
                            segment2 = segment2.f43438g;
                            Intrinsics.f(segment2);
                            n0 -= (long) (segment2.f43434c - segment2.f43433b);
                        }
                        j3 = n0;
                        segment = segment2;
                    }
                    if (this.f43340A) {
                        Intrinsics.f(segment);
                        if (segment.f43435d) {
                            Segment f2 = segment.f();
                            if (buffer.f43339z == segment) {
                                buffer.f43339z = f2;
                            }
                            segment = segment.c(f2);
                            Segment segment3 = segment.f43438g;
                            Intrinsics.f(segment3);
                            segment3.b();
                        }
                    }
                    f(segment);
                    this.C = j2;
                    Intrinsics.f(segment);
                    this.D = segment.f43432a;
                    int i6 = segment.f43433b + ((int) (j2 - j3));
                    this.E = i6;
                    int i7 = segment.f43434c;
                    this.F = i7;
                    return i7 - i6;
                }
            } else {
                throw new IllegalStateException("not attached to a buffer");
            }
        }

        public final void f(Segment segment) {
            this.f43341B = segment;
        }
    }

    public static /* synthetic */ UnsafeCursor T(Buffer buffer, UnsafeCursor unsafeCursor, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            unsafeCursor = SegmentedByteString.d();
        }
        return buffer.O(unsafeCursor);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0093, code lost:
        if (r8 != r9) goto L_0x009f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0095, code lost:
        r14.f43339z = r6.b();
        okio.SegmentPool.b(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x009f, code lost:
        r6.f43433b = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a1, code lost:
        if (r1 != false) goto L_0x00a7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0078 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long A1() {
        /*
            r14 = this;
            long r0 = r14.n0()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x00b1
            r0 = 0
            r1 = r0
            r4 = r2
        L_0x000d:
            okio.Segment r6 = r14.f43339z
            kotlin.jvm.internal.Intrinsics.f(r6)
            byte[] r7 = r6.f43432a
            int r8 = r6.f43433b
            int r9 = r6.f43434c
        L_0x0018:
            if (r8 >= r9) goto L_0x0093
            byte r10 = r7[r8]
            r11 = 48
            if (r10 < r11) goto L_0x0027
            r11 = 57
            if (r10 > r11) goto L_0x0027
            int r11 = r10 + -48
            goto L_0x003c
        L_0x0027:
            r11 = 97
            if (r10 < r11) goto L_0x0032
            r11 = 102(0x66, float:1.43E-43)
            if (r10 > r11) goto L_0x0032
            int r11 = r10 + -87
            goto L_0x003c
        L_0x0032:
            r11 = 65
            if (r10 < r11) goto L_0x0074
            r11 = 70
            if (r10 > r11) goto L_0x0074
            int r11 = r10 + -55
        L_0x003c:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 != 0) goto L_0x004c
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L_0x0018
        L_0x004c:
            okio.Buffer r0 = new okio.Buffer
            r0.<init>()
            okio.Buffer r0 = r0.Q0(r4)
            okio.Buffer r0 = r0.writeByte(r10)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Number too large: "
            r2.append(r3)
            java.lang.String r0 = r0.e0()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L_0x0074:
            if (r0 == 0) goto L_0x0078
            r1 = 1
            goto L_0x0093
        L_0x0078:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was 0x"
            r1.append(r2)
            java.lang.String r2 = okio.SegmentedByteString.k(r10)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0093:
            if (r8 != r9) goto L_0x009f
            okio.Segment r7 = r6.b()
            r14.f43339z = r7
            okio.SegmentPool.b(r6)
            goto L_0x00a1
        L_0x009f:
            r6.f43433b = r8
        L_0x00a1:
            if (r1 != 0) goto L_0x00a7
            okio.Segment r6 = r14.f43339z
            if (r6 != 0) goto L_0x000d
        L_0x00a7:
            long r1 = r14.n0()
            long r6 = (long) r0
            long r1 = r1 - r6
            r14.m0(r1)
            return r4
        L_0x00b1:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.Buffer.A1():long");
    }

    public InputStream B1() {
        return new Buffer$inputStream$1(this);
    }

    public int D1(Options options) {
        Intrinsics.i(options, "options");
        int f2 = okio.internal.Buffer.f(this, options, false, 2, (Object) null);
        if (f2 == -1) {
            return -1;
        }
        skip((long) options.n()[f2].N());
        return f2;
    }

    /* renamed from: E0 */
    public Buffer write(byte[] bArr) {
        Intrinsics.i(bArr, "source");
        return write(bArr, 0, bArr.length);
    }

    /* renamed from: E1 */
    public Buffer writeShort(int i2) {
        Segment t0 = t0(2);
        byte[] bArr = t0.f43432a;
        int i3 = t0.f43434c;
        bArr[i3] = (byte) ((i2 >>> 8) & 255);
        bArr[i3 + 1] = (byte) (i2 & 255);
        t0.f43434c = i3 + 2;
        m0(n0() + 2);
        return this;
    }

    public Buffer F1(String str, int i2, int i3, Charset charset) {
        Intrinsics.i(str, "string");
        Intrinsics.i(charset, "charset");
        if (i2 < 0) {
            throw new IllegalArgumentException(("beginIndex < 0: " + i2).toString());
        } else if (i3 < i2) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i3 + " < " + i2).toString());
        } else if (i3 > str.length()) {
            throw new IllegalArgumentException(("endIndex > string.length: " + i3 + " > " + str.length()).toString());
        } else if (Intrinsics.d(charset, Charsets.f41118b)) {
            return H1(str, i2, i3);
        } else {
            String substring = str.substring(i2, i3);
            Intrinsics.h(substring, "substring(...)");
            byte[] bytes = substring.getBytes(charset);
            Intrinsics.h(bytes, "getBytes(...)");
            return write(bytes, 0, bytes.length);
        }
    }

    public long G(ByteString byteString) {
        Intrinsics.i(byteString, "targetBytes");
        return H(byteString, 0);
    }

    /* renamed from: G1 */
    public Buffer K0(String str) {
        Intrinsics.i(str, "string");
        return H1(str, 0, str.length());
    }

    public long H(ByteString byteString, long j2) {
        long j3;
        int i2;
        int i3;
        int i4;
        Intrinsics.i(byteString, "targetBytes");
        long j4 = 0;
        if (j2 >= 0) {
            Segment segment = this.f43339z;
            if (segment == null) {
                return -1;
            }
            if (n0() - j2 < j2) {
                j3 = n0();
                while (j3 > j2) {
                    segment = segment.f43438g;
                    Intrinsics.f(segment);
                    j3 -= (long) (segment.f43434c - segment.f43433b);
                }
                if (byteString.N() == 2) {
                    byte k2 = byteString.k(0);
                    byte k3 = byteString.k(1);
                    while (j3 < n0()) {
                        byte[] bArr = segment.f43432a;
                        i3 = (int) ((((long) segment.f43433b) + j2) - j3);
                        int i5 = segment.f43434c;
                        while (i3 < i5) {
                            byte b2 = bArr[i3];
                            if (!(b2 == k2 || b2 == k3)) {
                                i3++;
                            }
                        }
                        j3 += (long) (segment.f43434c - segment.f43433b);
                        segment = segment.f43437f;
                        Intrinsics.f(segment);
                        j2 = j3;
                    }
                    return -1;
                }
                byte[] y2 = byteString.y();
                while (j3 < n0()) {
                    byte[] bArr2 = segment.f43432a;
                    i2 = (int) ((((long) segment.f43433b) + j2) - j3);
                    int i6 = segment.f43434c;
                    while (i2 < i6) {
                        byte b3 = bArr2[i2];
                        for (byte b4 : y2) {
                            if (b3 == b4) {
                                i4 = segment.f43433b;
                                return ((long) (i3 - i4)) + j3;
                            }
                        }
                        i2++;
                    }
                    j3 += (long) (segment.f43434c - segment.f43433b);
                    segment = segment.f43437f;
                    Intrinsics.f(segment);
                    j2 = j3;
                }
                return -1;
            }
            while (true) {
                long j5 = ((long) (segment.f43434c - segment.f43433b)) + j4;
                if (j5 > j2) {
                    break;
                }
                segment = segment.f43437f;
                Intrinsics.f(segment);
                j4 = j5;
            }
            if (byteString.N() == 2) {
                byte k4 = byteString.k(0);
                byte k5 = byteString.k(1);
                while (j3 < n0()) {
                    byte[] bArr3 = segment.f43432a;
                    int i7 = (int) ((((long) segment.f43433b) + j2) - j3);
                    int i8 = segment.f43434c;
                    while (i3 < i8) {
                        byte b5 = bArr3[i3];
                        if (!(b5 == k4 || b5 == k5)) {
                            i7 = i3 + 1;
                        }
                    }
                    j4 = j3 + ((long) (segment.f43434c - segment.f43433b));
                    segment = segment.f43437f;
                    Intrinsics.f(segment);
                    j2 = j4;
                }
                return -1;
            }
            byte[] y3 = byteString.y();
            while (j3 < n0()) {
                byte[] bArr4 = segment.f43432a;
                int i9 = (int) ((((long) segment.f43433b) + j2) - j3);
                int i10 = segment.f43434c;
                while (i2 < i10) {
                    byte b6 = bArr4[i2];
                    for (byte b7 : y3) {
                        if (b6 == b7) {
                            i4 = segment.f43433b;
                            return ((long) (i3 - i4)) + j3;
                        }
                    }
                    i9 = i2 + 1;
                }
                j4 = j3 + ((long) (segment.f43434c - segment.f43433b));
                segment = segment.f43437f;
                Intrinsics.f(segment);
                j2 = j4;
            }
            return -1;
            i4 = segment.f43433b;
            return ((long) (i3 - i4)) + j3;
        }
        throw new IllegalArgumentException(("fromIndex < 0: " + j2).toString());
    }

    /* renamed from: H0 */
    public Buffer write(byte[] bArr, int i2, int i3) {
        Intrinsics.i(bArr, "source");
        long j2 = (long) i3;
        SegmentedByteString.b((long) bArr.length, (long) i2, j2);
        int i4 = i3 + i2;
        while (i2 < i4) {
            Segment t0 = t0(1);
            int min = Math.min(i4 - i2, 8192 - t0.f43434c);
            int i5 = i2 + min;
            ArraysKt.g(bArr, t0.f43432a, t0.f43434c, i2, i5);
            t0.f43434c += min;
            i2 = i5;
        }
        m0(n0() + j2);
        return this;
    }

    public Buffer H1(String str, int i2, int i3) {
        char charAt;
        Intrinsics.i(str, "string");
        if (i2 < 0) {
            throw new IllegalArgumentException(("beginIndex < 0: " + i2).toString());
        } else if (i3 < i2) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i3 + " < " + i2).toString());
        } else if (i3 <= str.length()) {
            while (i2 < i3) {
                char charAt2 = str.charAt(i2);
                if (charAt2 < 128) {
                    Segment t0 = t0(1);
                    byte[] bArr = t0.f43432a;
                    int i4 = t0.f43434c - i2;
                    int min = Math.min(i3, 8192 - i4);
                    int i5 = i2 + 1;
                    bArr[i2 + i4] = (byte) charAt2;
                    while (true) {
                        i2 = i5;
                        if (i2 >= min || (charAt = str.charAt(i2)) >= 128) {
                            int i6 = t0.f43434c;
                            int i7 = (i4 + i2) - i6;
                            t0.f43434c = i6 + i7;
                            m0(n0() + ((long) i7));
                        } else {
                            i5 = i2 + 1;
                            bArr[i2 + i4] = (byte) charAt;
                        }
                    }
                    int i62 = t0.f43434c;
                    int i72 = (i4 + i2) - i62;
                    t0.f43434c = i62 + i72;
                    m0(n0() + ((long) i72));
                } else {
                    if (charAt2 < 2048) {
                        Segment t02 = t0(2);
                        byte[] bArr2 = t02.f43432a;
                        int i8 = t02.f43434c;
                        bArr2[i8] = (byte) ((charAt2 >> 6) | 192);
                        bArr2[i8 + 1] = (byte) ((charAt2 & '?') | 128);
                        t02.f43434c = i8 + 2;
                        m0(n0() + 2);
                    } else if (charAt2 < 55296 || charAt2 > 57343) {
                        Segment t03 = t0(3);
                        byte[] bArr3 = t03.f43432a;
                        int i9 = t03.f43434c;
                        bArr3[i9] = (byte) ((charAt2 >> 12) | 224);
                        bArr3[i9 + 1] = (byte) ((63 & (charAt2 >> 6)) | 128);
                        bArr3[i9 + 2] = (byte) ((charAt2 & '?') | 128);
                        t03.f43434c = i9 + 3;
                        m0(n0() + 3);
                    } else {
                        int i10 = i2 + 1;
                        char charAt3 = i10 < i3 ? str.charAt(i10) : 0;
                        if (charAt2 > 56319 || 56320 > charAt3 || charAt3 >= 57344) {
                            writeByte(63);
                            i2 = i10;
                        } else {
                            int i11 = (((charAt2 & 1023) << 10) | (charAt3 & 1023)) + 0;
                            Segment t04 = t0(4);
                            byte[] bArr4 = t04.f43432a;
                            int i12 = t04.f43434c;
                            bArr4[i12] = (byte) ((i11 >> 18) | 240);
                            bArr4[i12 + 1] = (byte) (((i11 >> 12) & 63) | 128);
                            bArr4[i12 + 2] = (byte) (((i11 >> 6) & 63) | 128);
                            bArr4[i12 + 3] = (byte) ((i11 & 63) | 128);
                            t04.f43434c = i12 + 4;
                            m0(n0() + 4);
                            i2 += 2;
                        }
                    }
                    i2++;
                }
            }
            return this;
        } else {
            throw new IllegalArgumentException(("endIndex > string.length: " + i3 + " > " + str.length()).toString());
        }
    }

    public boolean I(long j2, ByteString byteString) {
        Intrinsics.i(byteString, "bytes");
        return N(j2, byteString, 0, byteString.N());
    }

    public Buffer I1(int i2) {
        if (i2 < 128) {
            writeByte(i2);
        } else if (i2 < 2048) {
            Segment t0 = t0(2);
            byte[] bArr = t0.f43432a;
            int i3 = t0.f43434c;
            bArr[i3] = (byte) ((i2 >> 6) | 192);
            bArr[i3 + 1] = (byte) ((i2 & 63) | 128);
            t0.f43434c = i3 + 2;
            m0(n0() + 2);
        } else if (55296 <= i2 && i2 < 57344) {
            writeByte(63);
        } else if (i2 < 65536) {
            Segment t02 = t0(3);
            byte[] bArr2 = t02.f43432a;
            int i4 = t02.f43434c;
            bArr2[i4] = (byte) ((i2 >> 12) | 224);
            bArr2[i4 + 1] = (byte) (((i2 >> 6) & 63) | 128);
            bArr2[i4 + 2] = (byte) ((i2 & 63) | 128);
            t02.f43434c = i4 + 3;
            m0(n0() + 3);
        } else if (i2 <= 1114111) {
            Segment t03 = t0(4);
            byte[] bArr3 = t03.f43432a;
            int i5 = t03.f43434c;
            bArr3[i5] = (byte) ((i2 >> 18) | 240);
            bArr3[i5 + 1] = (byte) (((i2 >> 12) & 63) | 128);
            bArr3[i5 + 2] = (byte) (((i2 >> 6) & 63) | 128);
            bArr3[i5 + 3] = (byte) ((i2 & 63) | 128);
            t03.f43434c = i5 + 4;
            m0(n0() + 4);
        } else {
            throw new IllegalArgumentException("Unexpected code point: 0x" + SegmentedByteString.l(i2));
        }
        return this;
    }

    /* renamed from: J0 */
    public Buffer writeByte(int i2) {
        Segment t0 = t0(1);
        byte[] bArr = t0.f43432a;
        int i3 = t0.f43434c;
        t0.f43434c = i3 + 1;
        bArr[i3] = (byte) i2;
        m0(n0() + 1);
        return this;
    }

    /* renamed from: L0 */
    public Buffer x1(long j2) {
        boolean z2;
        int i2 = (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1));
        if (i2 == 0) {
            return writeByte(48);
        }
        int i3 = 1;
        if (i2 < 0) {
            j2 = -j2;
            if (j2 < 0) {
                return K0("-9223372036854775808");
            }
            z2 = true;
        } else {
            z2 = false;
        }
        if (j2 >= 100000000) {
            i3 = j2 < 1000000000000L ? j2 < 10000000000L ? j2 < 1000000000 ? 9 : 10 : j2 < 100000000000L ? 11 : 12 : j2 < 1000000000000000L ? j2 < 10000000000000L ? 13 : j2 < 100000000000000L ? 14 : 15 : j2 < 100000000000000000L ? j2 < 10000000000000000L ? 16 : 17 : j2 < 1000000000000000000L ? 18 : 19;
        } else if (j2 >= 10000) {
            i3 = j2 < 1000000 ? j2 < 100000 ? 5 : 6 : j2 < 10000000 ? 7 : 8;
        } else if (j2 >= 100) {
            i3 = j2 < 1000 ? 3 : 4;
        } else if (j2 >= 10) {
            i3 = 2;
        }
        if (z2) {
            i3++;
        }
        Segment t0 = t0(i3);
        byte[] bArr = t0.f43432a;
        int i4 = t0.f43434c + i3;
        while (j2 != 0) {
            long j3 = (long) 10;
            i4--;
            bArr[i4] = okio.internal.Buffer.b()[(int) (j2 % j3)];
            j2 /= j3;
        }
        if (z2) {
            bArr[i4 - 1] = 45;
        }
        t0.f43434c += i3;
        m0(n0() + ((long) i3));
        return this;
    }

    public String M(long j2) {
        return c0(j2, Charsets.f41118b);
    }

    public String M0(Charset charset) {
        Intrinsics.i(charset, "charset");
        return c0(this.f43338A, charset);
    }

    public boolean N(long j2, ByteString byteString, int i2, int i3) {
        Intrinsics.i(byteString, "bytes");
        if (j2 < 0 || i2 < 0 || i3 < 0 || n0() - j2 < ((long) i3) || byteString.N() - i2 < i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (r(((long) i4) + j2) != byteString.k(i2 + i4)) {
                return false;
            }
        }
        return true;
    }

    public void N0(Buffer buffer, long j2) {
        Segment segment;
        Intrinsics.i(buffer, "source");
        if (buffer != this) {
            SegmentedByteString.b(buffer.n0(), 0, j2);
            while (j2 > 0) {
                Segment segment2 = buffer.f43339z;
                Intrinsics.f(segment2);
                int i2 = segment2.f43434c;
                Segment segment3 = buffer.f43339z;
                Intrinsics.f(segment3);
                if (j2 < ((long) (i2 - segment3.f43433b))) {
                    Segment segment4 = this.f43339z;
                    if (segment4 != null) {
                        Intrinsics.f(segment4);
                        segment = segment4.f43438g;
                    } else {
                        segment = null;
                    }
                    if (segment != null && segment.f43436e) {
                        if ((((long) segment.f43434c) + j2) - ((long) (segment.f43435d ? 0 : segment.f43433b)) <= 8192) {
                            Segment segment5 = buffer.f43339z;
                            Intrinsics.f(segment5);
                            segment5.g(segment, (int) j2);
                            buffer.m0(buffer.n0() - j2);
                            m0(n0() + j2);
                            return;
                        }
                    }
                    Segment segment6 = buffer.f43339z;
                    Intrinsics.f(segment6);
                    buffer.f43339z = segment6.e((int) j2);
                }
                Segment segment7 = buffer.f43339z;
                Intrinsics.f(segment7);
                long j3 = (long) (segment7.f43434c - segment7.f43433b);
                buffer.f43339z = segment7.b();
                Segment segment8 = this.f43339z;
                if (segment8 == null) {
                    this.f43339z = segment7;
                    segment7.f43438g = segment7;
                    segment7.f43437f = segment7;
                } else {
                    Intrinsics.f(segment8);
                    Segment segment9 = segment8.f43438g;
                    Intrinsics.f(segment9);
                    segment9.c(segment7).a();
                }
                buffer.m0(buffer.n0() - j3);
                m0(n0() + j3);
                j2 -= j3;
            }
            return;
        }
        throw new IllegalArgumentException("source == this");
    }

    public final UnsafeCursor O(UnsafeCursor unsafeCursor) {
        Intrinsics.i(unsafeCursor, "unsafeCursor");
        return okio.internal.Buffer.a(this, unsafeCursor);
    }

    public long P0(Source source) {
        Intrinsics.i(source, "source");
        long j2 = 0;
        while (true) {
            long o1 = source.o1(this, 8192);
            if (o1 == -1) {
                return j2;
            }
            j2 += o1;
        }
    }

    public ByteString R(long j2) {
        if (j2 < 0 || j2 > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j2).toString());
        } else if (n0() < j2) {
            throw new EOFException();
        } else if (j2 < 4096) {
            return new ByteString(e1(j2));
        } else {
            ByteString s0 = s0((int) j2);
            skip(j2);
            return s0;
        }
    }

    /* renamed from: S0 */
    public Buffer Q0(long j2) {
        if (j2 == 0) {
            return writeByte(48);
        }
        long j3 = (j2 >>> 1) | j2;
        long j4 = j3 | (j3 >>> 2);
        long j5 = j4 | (j4 >>> 4);
        long j6 = j5 | (j5 >>> 8);
        long j7 = j6 | (j6 >>> 16);
        long j8 = j7 | (j7 >>> 32);
        long j9 = j8 - ((j8 >>> 1) & 6148914691236517205L);
        long j10 = ((j9 >>> 2) & 3689348814741910323L) + (j9 & 3689348814741910323L);
        long j11 = ((j10 >>> 4) + j10) & 1085102592571150095L;
        long j12 = j11 + (j11 >>> 8);
        long j13 = j12 + (j12 >>> 16);
        int i2 = (int) ((((j13 & 63) + ((j13 >>> 32) & 63)) + ((long) 3)) / ((long) 4));
        Segment t0 = t0(i2);
        byte[] bArr = t0.f43432a;
        int i3 = t0.f43434c;
        for (int i4 = (i3 + i2) - 1; i4 >= i3; i4--) {
            bArr[i4] = okio.internal.Buffer.b()[(int) (15 & j2)];
            j2 >>>= 4;
        }
        t0.f43434c += i2;
        m0(n0() + ((long) i2));
        return this;
    }

    public boolean V0(long j2) {
        return this.f43338A >= j2;
    }

    public ByteString X() {
        return R(n0());
    }

    public String a1() {
        return x0(Long.MAX_VALUE);
    }

    public final void b() {
        skip(n0());
    }

    /* renamed from: c */
    public Buffer clone() {
        return g();
    }

    public String c0(long j2, Charset charset) {
        Intrinsics.i(charset, "charset");
        int i2 = (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1));
        if (i2 < 0 || j2 > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j2).toString());
        } else if (this.f43338A < j2) {
            throw new EOFException();
        } else if (i2 == 0) {
            return "";
        } else {
            Segment segment = this.f43339z;
            Intrinsics.f(segment);
            int i3 = segment.f43433b;
            if (((long) i3) + j2 > ((long) segment.f43434c)) {
                return new String(e1(j2), charset);
            }
            int i4 = (int) j2;
            String str = new String(segment.f43432a, i3, i4, charset);
            int i5 = segment.f43433b + i4;
            segment.f43433b = i5;
            this.f43338A -= j2;
            if (i5 == segment.f43434c) {
                this.f43339z = segment.b();
                SegmentPool.b(segment);
            }
            return str;
        }
    }

    public int c1() {
        return SegmentedByteString.h(readInt());
    }

    public void close() {
    }

    public String e0() {
        return c0(this.f43338A, Charsets.f41118b);
    }

    public byte[] e1(long j2) {
        if (j2 < 0 || j2 > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j2).toString());
        } else if (n0() >= j2) {
            byte[] bArr = new byte[((int) j2)];
            readFully(bArr);
            return bArr;
        } else {
            throw new EOFException();
        }
    }

    /* JADX WARNING: type inference failed for: r19v0, types: [java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = 1
            if (r0 != r1) goto L_0x0009
            goto L_0x0081
        L_0x0009:
            boolean r3 = r1 instanceof okio.Buffer
            r4 = 0
            if (r3 != 0) goto L_0x0011
        L_0x000e:
            r2 = r4
            goto L_0x0081
        L_0x0011:
            long r5 = r18.n0()
            okio.Buffer r1 = (okio.Buffer) r1
            long r7 = r1.n0()
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 == 0) goto L_0x0020
            goto L_0x000e
        L_0x0020:
            long r5 = r18.n0()
            r7 = 0
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 != 0) goto L_0x002b
            goto L_0x0081
        L_0x002b:
            okio.Segment r3 = r0.f43339z
            kotlin.jvm.internal.Intrinsics.f(r3)
            okio.Segment r1 = r1.f43339z
            kotlin.jvm.internal.Intrinsics.f(r1)
            int r5 = r3.f43433b
            int r6 = r1.f43433b
            r9 = r7
        L_0x003a:
            long r11 = r18.n0()
            int r11 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r11 >= 0) goto L_0x0081
            int r11 = r3.f43434c
            int r11 = r11 - r5
            int r12 = r1.f43434c
            int r12 = r12 - r6
            int r11 = java.lang.Math.min(r11, r12)
            long r11 = (long) r11
            r13 = r7
        L_0x004e:
            int r15 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r15 >= 0) goto L_0x0069
            byte[] r15 = r3.f43432a
            int r16 = r5 + 1
            byte r5 = r15[r5]
            byte[] r15 = r1.f43432a
            int r17 = r6 + 1
            byte r6 = r15[r6]
            if (r5 == r6) goto L_0x0061
            goto L_0x000e
        L_0x0061:
            r5 = 1
            long r13 = r13 + r5
            r5 = r16
            r6 = r17
            goto L_0x004e
        L_0x0069:
            int r13 = r3.f43434c
            if (r5 != r13) goto L_0x0074
            okio.Segment r3 = r3.f43437f
            kotlin.jvm.internal.Intrinsics.f(r3)
            int r5 = r3.f43433b
        L_0x0074:
            int r13 = r1.f43434c
            if (r6 != r13) goto L_0x007f
            okio.Segment r1 = r1.f43437f
            kotlin.jvm.internal.Intrinsics.f(r1)
            int r6 = r1.f43433b
        L_0x007f:
            long r9 = r9 + r11
            goto L_0x003a
        L_0x0081:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.Buffer.equals(java.lang.Object):boolean");
    }

    public final long f() {
        long n0 = n0();
        if (n0 == 0) {
            return 0;
        }
        Segment segment = this.f43339z;
        Intrinsics.f(segment);
        Segment segment2 = segment.f43438g;
        Intrinsics.f(segment2);
        int i2 = segment2.f43434c;
        if (i2 < 8192 && segment2.f43436e) {
            n0 -= (long) (i2 - segment2.f43433b);
        }
        return n0;
    }

    public void flush() {
    }

    public final Buffer g() {
        Buffer buffer = new Buffer();
        if (n0() != 0) {
            Segment segment = this.f43339z;
            Intrinsics.f(segment);
            Segment d2 = segment.d();
            buffer.f43339z = d2;
            d2.f43438g = d2;
            d2.f43437f = d2;
            for (Segment segment2 = segment.f43437f; segment2 != segment; segment2 = segment2.f43437f) {
                Segment segment3 = d2.f43438g;
                Intrinsics.f(segment3);
                Intrinsics.f(segment2);
                segment3.c(segment2.d());
            }
            buffer.m0(n0());
        }
        return buffer;
    }

    public int g0() {
        byte b2;
        int i2;
        byte b3;
        if (n0() != 0) {
            byte r2 = r(0);
            int i3 = 1;
            if ((r2 & 128) == 0) {
                b3 = r2 & Byte.MAX_VALUE;
                b2 = 0;
                i2 = 1;
            } else if ((r2 & 224) == 192) {
                b3 = r2 & 31;
                i2 = 2;
                b2 = 128;
            } else if ((r2 & 240) == 224) {
                b3 = r2 & 15;
                i2 = 3;
                b2 = OsSharedRealm.FILE_EXCEPTION_KIND_ACCESS_ERROR;
            } else if ((r2 & 248) == 240) {
                b3 = r2 & 7;
                i2 = 4;
                b2 = OsSharedRealm.FILE_EXCEPTION_KIND_ACCESS_ERROR;
            } else {
                skip(1);
                return 65533;
            }
            long j2 = (long) i2;
            if (n0() >= j2) {
                while (i3 < i2) {
                    long j3 = (long) i3;
                    byte r3 = r(j3);
                    if ((r3 & 192) == 128) {
                        b3 = (b3 << 6) | (r3 & 63);
                        i3++;
                    } else {
                        skip(j3);
                        return 65533;
                    }
                }
                skip(j2);
                if (b3 > 1114111) {
                    return 65533;
                }
                if ((55296 > b3 || b3 >= 57344) && b3 >= b2) {
                    return b3;
                }
                return 65533;
            }
            throw new EOFException("size < " + i2 + ": " + n0() + " (to read code point prefixed 0x" + SegmentedByteString.k(r2) + ')');
        }
        throw new EOFException();
    }

    public byte[] h0() {
        return e1(n0());
    }

    public int hashCode() {
        Segment segment = this.f43339z;
        if (segment == null) {
            return 0;
        }
        int i2 = 1;
        do {
            int i3 = segment.f43434c;
            for (int i4 = segment.f43433b; i4 < i3; i4++) {
                i2 = (i2 * 31) + segment.f43432a[i4];
            }
            segment = segment.f43437f;
            Intrinsics.f(segment);
        } while (segment != this.f43339z);
        return i2;
    }

    public boolean isOpen() {
        return true;
    }

    public final Buffer j(Buffer buffer, long j2, long j3) {
        Intrinsics.i(buffer, "out");
        SegmentedByteString.b(n0(), j2, j3);
        if (j3 != 0) {
            buffer.m0(buffer.n0() + j3);
            Segment segment = this.f43339z;
            while (true) {
                Intrinsics.f(segment);
                int i2 = segment.f43434c;
                int i3 = segment.f43433b;
                if (j2 < ((long) (i2 - i3))) {
                    break;
                }
                j2 -= (long) (i2 - i3);
                segment = segment.f43437f;
            }
            while (j3 > 0) {
                Intrinsics.f(segment);
                Segment d2 = segment.d();
                int i4 = d2.f43433b + ((int) j2);
                d2.f43433b = i4;
                d2.f43434c = Math.min(i4 + ((int) j3), d2.f43434c);
                Segment segment2 = buffer.f43339z;
                if (segment2 == null) {
                    d2.f43438g = d2;
                    d2.f43437f = d2;
                    buffer.f43339z = d2;
                } else {
                    Intrinsics.f(segment2);
                    Segment segment3 = segment2.f43438g;
                    Intrinsics.f(segment3);
                    segment3.c(d2);
                }
                j3 -= (long) (d2.f43434c - d2.f43433b);
                segment = segment.f43437f;
                j2 = 0;
            }
        }
        return this;
    }

    /* renamed from: j1 */
    public Buffer writeInt(int i2) {
        Segment t0 = t0(4);
        byte[] bArr = t0.f43432a;
        int i3 = t0.f43434c;
        bArr[i3] = (byte) ((i2 >>> 24) & 255);
        bArr[i3 + 1] = (byte) ((i2 >>> 16) & 255);
        bArr[i3 + 2] = (byte) ((i2 >>> 8) & 255);
        bArr[i3 + 3] = (byte) (i2 & 255);
        t0.f43434c = i3 + 4;
        m0(n0() + 4);
        return this;
    }

    /* renamed from: k */
    public Buffer V() {
        return this;
    }

    /* renamed from: l */
    public Buffer u0() {
        return this;
    }

    public boolean l0() {
        return this.f43338A == 0;
    }

    public short l1() {
        return SegmentedByteString.j(readShort());
    }

    public final void m0(long j2) {
        this.f43338A = j2;
    }

    public final long n0() {
        return this.f43338A;
    }

    public final ByteString o0() {
        if (n0() <= 2147483647L) {
            return s0((int) n0());
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + n0()).toString());
    }

    public long o1(Buffer buffer, long j2) {
        Intrinsics.i(buffer, "sink");
        if (j2 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j2).toString());
        } else if (n0() == 0) {
            return -1;
        } else {
            if (j2 > n0()) {
                j2 = n0();
            }
            buffer.N0(this, j2);
            return j2;
        }
    }

    public long p1() {
        return SegmentedByteString.i(readLong());
    }

    public BufferedSource peek() {
        return Okio.d(new PeekSource(this));
    }

    public void q0(Buffer buffer, long j2) {
        Intrinsics.i(buffer, "sink");
        if (n0() >= j2) {
            buffer.N0(this, j2);
        } else {
            buffer.N0(this, n0());
            throw new EOFException();
        }
    }

    public Buffer q1(int i2) {
        return writeInt(SegmentedByteString.h(i2));
    }

    public final byte r(long j2) {
        SegmentedByteString.b(n0(), j2, 1);
        Segment segment = this.f43339z;
        if (segment == null) {
            Intrinsics.f((Object) null);
            throw null;
        } else if (n0() - j2 < j2) {
            long n0 = n0();
            while (n0 > j2) {
                segment = segment.f43438g;
                Intrinsics.f(segment);
                n0 -= (long) (segment.f43434c - segment.f43433b);
            }
            Intrinsics.f(segment);
            return segment.f43432a[(int) ((((long) segment.f43433b) + j2) - n0)];
        } else {
            long j3 = 0;
            while (true) {
                long j4 = ((long) (segment.f43434c - segment.f43433b)) + j3;
                if (j4 <= j2) {
                    segment = segment.f43437f;
                    Intrinsics.f(segment);
                    j3 = j4;
                } else {
                    Intrinsics.f(segment);
                    return segment.f43432a[(int) ((((long) segment.f43433b) + j2) - j3)];
                }
            }
        }
    }

    public long r1(Sink sink) {
        Intrinsics.i(sink, "sink");
        long n0 = n0();
        if (n0 > 0) {
            sink.N0(this, n0);
        }
        return n0;
    }

    public int read(ByteBuffer byteBuffer) {
        Intrinsics.i(byteBuffer, "sink");
        Segment segment = this.f43339z;
        if (segment == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), segment.f43434c - segment.f43433b);
        byteBuffer.put(segment.f43432a, segment.f43433b, min);
        int i2 = segment.f43433b + min;
        segment.f43433b = i2;
        this.f43338A -= (long) min;
        if (i2 == segment.f43434c) {
            this.f43339z = segment.b();
            SegmentPool.b(segment);
        }
        return min;
    }

    public byte readByte() {
        if (n0() != 0) {
            Segment segment = this.f43339z;
            Intrinsics.f(segment);
            int i2 = segment.f43433b;
            int i3 = segment.f43434c;
            int i4 = i2 + 1;
            byte b2 = segment.f43432a[i2];
            m0(n0() - 1);
            if (i4 == i3) {
                this.f43339z = segment.b();
                SegmentPool.b(segment);
            } else {
                segment.f43433b = i4;
            }
            return b2;
        }
        throw new EOFException();
    }

    public void readFully(byte[] bArr) {
        Intrinsics.i(bArr, "sink");
        int i2 = 0;
        while (i2 < bArr.length) {
            int read = read(bArr, i2, bArr.length - i2);
            if (read != -1) {
                i2 += read;
            } else {
                throw new EOFException();
            }
        }
    }

    public int readInt() {
        if (n0() >= 4) {
            Segment segment = this.f43339z;
            Intrinsics.f(segment);
            int i2 = segment.f43433b;
            int i3 = segment.f43434c;
            if (((long) (i3 - i2)) < 4) {
                return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
            }
            byte[] bArr = segment.f43432a;
            byte b2 = ((bArr[i2 + 1] & 255) << 16) | ((bArr[i2] & 255) << 24);
            int i4 = i2 + 3;
            int i5 = i2 + 4;
            byte b3 = (bArr[i4] & 255) | b2 | ((bArr[i2 + 2] & 255) << 8);
            m0(n0() - 4);
            if (i5 == i3) {
                this.f43339z = segment.b();
                SegmentPool.b(segment);
            } else {
                segment.f43433b = i5;
            }
            return b3;
        }
        throw new EOFException();
    }

    public long readLong() {
        if (n0() >= 8) {
            Segment segment = this.f43339z;
            Intrinsics.f(segment);
            int i2 = segment.f43433b;
            int i3 = segment.f43434c;
            if (((long) (i3 - i2)) < 8) {
                return ((((long) readInt()) & 4294967295L) << 32) | (4294967295L & ((long) readInt()));
            }
            byte[] bArr = segment.f43432a;
            long j2 = ((((long) bArr[i2]) & 255) << 56) | ((((long) bArr[i2 + 1]) & 255) << 48) | ((((long) bArr[i2 + 2]) & 255) << 40);
            int i4 = i2 + 7;
            int i5 = i2 + 8;
            long j3 = j2 | ((((long) bArr[i2 + 3]) & 255) << 32) | ((((long) bArr[i2 + 4]) & 255) << 24) | ((((long) bArr[i2 + 5]) & 255) << 16) | ((((long) bArr[i2 + 6]) & 255) << 8) | (((long) bArr[i4]) & 255);
            m0(n0() - 8);
            if (i5 == i3) {
                this.f43339z = segment.b();
                SegmentPool.b(segment);
            } else {
                segment.f43433b = i5;
            }
            return j3;
        }
        throw new EOFException();
    }

    public short readShort() {
        if (n0() >= 2) {
            Segment segment = this.f43339z;
            Intrinsics.f(segment);
            int i2 = segment.f43433b;
            int i3 = segment.f43434c;
            if (i3 - i2 < 2) {
                return (short) (((readByte() & 255) << 8) | (readByte() & 255));
            }
            byte[] bArr = segment.f43432a;
            int i4 = i2 + 1;
            int i5 = i2 + 2;
            byte b2 = (bArr[i4] & 255) | ((bArr[i2] & 255) << 8);
            m0(n0() - 2);
            if (i5 == i3) {
                this.f43339z = segment.b();
                SegmentPool.b(segment);
            } else {
                segment.f43433b = i5;
            }
            return (short) b2;
        }
        throw new EOFException();
    }

    public Buffer s() {
        return this;
    }

    public final ByteString s0(int i2) {
        if (i2 == 0) {
            return ByteString.D;
        }
        SegmentedByteString.b(n0(), 0, (long) i2);
        Segment segment = this.f43339z;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i4 < i2) {
            Intrinsics.f(segment);
            int i6 = segment.f43434c;
            int i7 = segment.f43433b;
            if (i6 != i7) {
                i4 += i6 - i7;
                i5++;
                segment = segment.f43437f;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        byte[][] bArr = new byte[i5][];
        int[] iArr = new int[(i5 * 2)];
        Segment segment2 = this.f43339z;
        int i8 = 0;
        while (i3 < i2) {
            Intrinsics.f(segment2);
            bArr[i8] = segment2.f43432a;
            i3 += segment2.f43434c - segment2.f43433b;
            iArr[i8] = Math.min(i3, i2);
            iArr[i8 + i5] = segment2.f43433b;
            segment2.f43435d = true;
            i8++;
            segment2 = segment2.f43437f;
        }
        return new C0668SegmentedByteString(bArr, iArr);
    }

    public void skip(long j2) {
        while (j2 > 0) {
            Segment segment = this.f43339z;
            if (segment != null) {
                int min = (int) Math.min(j2, (long) (segment.f43434c - segment.f43433b));
                long j3 = (long) min;
                m0(n0() - j3);
                j2 -= j3;
                int i2 = segment.f43433b + min;
                segment.f43433b = i2;
                if (i2 == segment.f43434c) {
                    this.f43339z = segment.b();
                    SegmentPool.b(segment);
                }
            } else {
                throw new EOFException();
            }
        }
    }

    public long t(byte b2, long j2, long j3) {
        Segment segment;
        long j4;
        int i2;
        long j5 = 0;
        if (0 > j2 || j2 > j3) {
            throw new IllegalArgumentException(("size=" + n0() + " fromIndex=" + j2 + " toIndex=" + j3).toString());
        }
        if (j3 > n0()) {
            j3 = n0();
        }
        if (j2 == j3 || (segment = this.f43339z) == null) {
            return -1;
        }
        if (n0() - j2 < j2) {
            j4 = n0();
            while (j4 > j2) {
                segment = segment.f43438g;
                Intrinsics.f(segment);
                j4 -= (long) (segment.f43434c - segment.f43433b);
            }
            while (j4 < j3) {
                byte[] bArr = segment.f43432a;
                int min = (int) Math.min((long) segment.f43434c, (((long) segment.f43433b) + j3) - j4);
                i2 = (int) ((((long) segment.f43433b) + j2) - j4);
                while (i2 < min) {
                    if (bArr[i2] != b2) {
                        i2++;
                    }
                }
                j4 += (long) (segment.f43434c - segment.f43433b);
                segment = segment.f43437f;
                Intrinsics.f(segment);
                j2 = j4;
            }
            return -1;
        }
        while (true) {
            long j6 = ((long) (segment.f43434c - segment.f43433b)) + j5;
            if (j6 > j2) {
                break;
            }
            segment = segment.f43437f;
            Intrinsics.f(segment);
            j5 = j6;
        }
        while (j4 < j3) {
            byte[] bArr2 = segment.f43432a;
            int min2 = (int) Math.min((long) segment.f43434c, (((long) segment.f43433b) + j3) - j4);
            int i3 = (int) ((((long) segment.f43433b) + j2) - j4);
            while (i2 < min2) {
                if (bArr2[i2] != b2) {
                    i3 = i2 + 1;
                }
            }
            j5 = j4 + ((long) (segment.f43434c - segment.f43433b));
            segment = segment.f43437f;
            Intrinsics.f(segment);
            j2 = j5;
        }
        return -1;
        return ((long) (i2 - segment.f43433b)) + j4;
    }

    public final Segment t0(int i2) {
        if (i2 < 1 || i2 > 8192) {
            throw new IllegalArgumentException("unexpected capacity");
        }
        Segment segment = this.f43339z;
        if (segment == null) {
            Segment c2 = SegmentPool.c();
            this.f43339z = c2;
            c2.f43438g = c2;
            c2.f43437f = c2;
            return c2;
        }
        Intrinsics.f(segment);
        Segment segment2 = segment.f43438g;
        Intrinsics.f(segment2);
        return (segment2.f43434c + i2 > 8192 || !segment2.f43436e) ? segment2.c(SegmentPool.c()) : segment2;
    }

    public String toString() {
        return o0().toString();
    }

    public Timeout u() {
        return Timeout.f43454f;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a4, code lost:
        if (r2 == false) goto L_0x00a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00a6, code lost:
        r14 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a8, code lost:
        r14 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00a9, code lost:
        if (r1 >= r14) goto L_0x00e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00b3, code lost:
        if (n0() == 0) goto L_0x00e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00b5, code lost:
        if (r2 == false) goto L_0x00ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00b7, code lost:
        r1 = "Expected a digit";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00ba, code lost:
        r1 = "Expected a digit or '-'";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00df, code lost:
        throw new java.lang.NumberFormatException(r1 + " but was 0x" + okio.SegmentedByteString.k(r(0)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00e5, code lost:
        throw new java.io.EOFException();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00e6, code lost:
        if (r2 == false) goto L_0x00e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:?, code lost:
        return -r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:?, code lost:
        return r8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long v0() {
        /*
            r18 = this;
            r0 = r18
            long r1 = r18.n0()
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L_0x00eb
            r1 = 0
            r5 = -7
            r2 = r1
            r8 = r3
            r6 = r5
            r5 = r2
        L_0x0013:
            okio.Segment r10 = r0.f43339z
            kotlin.jvm.internal.Intrinsics.f(r10)
            byte[] r11 = r10.f43432a
            int r12 = r10.f43433b
            int r13 = r10.f43434c
        L_0x001e:
            if (r12 >= r13) goto L_0x0082
            byte r15 = r11[r12]
            r14 = 48
            if (r15 < r14) goto L_0x0070
            r14 = 57
            if (r15 > r14) goto L_0x0070
            int r14 = 48 - r15
            r16 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            int r16 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1))
            if (r16 < 0) goto L_0x0043
            if (r16 != 0) goto L_0x003d
            long r3 = (long) r14
            int r3 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r3 >= 0) goto L_0x003d
            goto L_0x0043
        L_0x003d:
            r3 = 10
            long r8 = r8 * r3
            long r3 = (long) r14
            long r8 = r8 + r3
            goto L_0x007a
        L_0x0043:
            okio.Buffer r1 = new okio.Buffer
            r1.<init>()
            okio.Buffer r1 = r1.x1(r8)
            okio.Buffer r1 = r1.writeByte(r15)
            if (r2 != 0) goto L_0x0055
            r1.readByte()
        L_0x0055:
            java.lang.NumberFormatException r2 = new java.lang.NumberFormatException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Number too large: "
            r3.append(r4)
            java.lang.String r1 = r1.e0()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
        L_0x0070:
            r3 = 45
            if (r15 != r3) goto L_0x0081
            if (r1 != 0) goto L_0x0081
            r2 = 1
            long r6 = r6 - r2
            r2 = 1
        L_0x007a:
            int r12 = r12 + 1
            int r1 = r1 + 1
            r3 = 0
            goto L_0x001e
        L_0x0081:
            r5 = 1
        L_0x0082:
            if (r12 != r13) goto L_0x008e
            okio.Segment r3 = r10.b()
            r0.f43339z = r3
            okio.SegmentPool.b(r10)
            goto L_0x0090
        L_0x008e:
            r10.f43433b = r12
        L_0x0090:
            if (r5 != 0) goto L_0x009b
            okio.Segment r3 = r0.f43339z
            if (r3 != 0) goto L_0x0097
            goto L_0x009b
        L_0x0097:
            r3 = 0
            goto L_0x0013
        L_0x009b:
            long r3 = r18.n0()
            long r5 = (long) r1
            long r3 = r3 - r5
            r0.m0(r3)
            if (r2 == 0) goto L_0x00a8
            r14 = 2
            goto L_0x00a9
        L_0x00a8:
            r14 = 1
        L_0x00a9:
            if (r1 >= r14) goto L_0x00e6
            long r3 = r18.n0()
            r5 = 0
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L_0x00e0
            if (r2 == 0) goto L_0x00ba
            java.lang.String r1 = "Expected a digit"
            goto L_0x00bc
        L_0x00ba:
            java.lang.String r1 = "Expected a digit or '-'"
        L_0x00bc:
            java.lang.NumberFormatException r2 = new java.lang.NumberFormatException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            java.lang.String r1 = " but was 0x"
            r3.append(r1)
            r4 = 0
            byte r1 = r0.r(r4)
            java.lang.String r1 = okio.SegmentedByteString.k(r1)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
        L_0x00e0:
            java.io.EOFException r1 = new java.io.EOFException
            r1.<init>()
            throw r1
        L_0x00e6:
            if (r2 == 0) goto L_0x00e9
            goto L_0x00ea
        L_0x00e9:
            long r8 = -r8
        L_0x00ea:
            return r8
        L_0x00eb:
            java.io.EOFException r1 = new java.io.EOFException
            r1.<init>()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.Buffer.v0():long");
    }

    public void v1(long j2) {
        if (this.f43338A < j2) {
            throw new EOFException();
        }
    }

    /* renamed from: w0 */
    public Buffer k1(ByteString byteString) {
        Intrinsics.i(byteString, "byteString");
        byteString.V(this, 0, byteString.N());
        return this;
    }

    public Buffer w1(long j2) {
        Segment t0 = t0(8);
        byte[] bArr = t0.f43432a;
        int i2 = t0.f43434c;
        bArr[i2] = (byte) ((int) ((j2 >>> 56) & 255));
        bArr[i2 + 1] = (byte) ((int) ((j2 >>> 48) & 255));
        bArr[i2 + 2] = (byte) ((int) ((j2 >>> 40) & 255));
        bArr[i2 + 3] = (byte) ((int) ((j2 >>> 32) & 255));
        bArr[i2 + 4] = (byte) ((int) ((j2 >>> 24) & 255));
        bArr[i2 + 5] = (byte) ((int) ((j2 >>> 16) & 255));
        bArr[i2 + 6] = (byte) ((int) ((j2 >>> 8) & 255));
        bArr[i2 + 7] = (byte) ((int) (j2 & 255));
        t0.f43434c = i2 + 8;
        m0(n0() + 8);
        return this;
    }

    public long x(ByteString byteString) {
        Intrinsics.i(byteString, "bytes");
        return y(byteString, 0);
    }

    public String x0(long j2) {
        if (j2 >= 0) {
            long j3 = Long.MAX_VALUE;
            if (j2 != Long.MAX_VALUE) {
                j3 = j2 + 1;
            }
            long t2 = t((byte) 10, 0, j3);
            if (t2 != -1) {
                return okio.internal.Buffer.d(this, t2);
            }
            if (j3 < n0() && r(j3 - 1) == 13 && r(j3) == 10) {
                return okio.internal.Buffer.d(this, j3);
            }
            Buffer buffer = new Buffer();
            j(buffer, 0, Math.min((long) 32, n0()));
            throw new EOFException("\\n not found: limit=" + Math.min(n0(), j2) + " content=" + buffer.X().p() + 8230);
        }
        throw new IllegalArgumentException(("limit < 0: " + j2).toString());
    }

    public long y(ByteString byteString, long j2) {
        long j3;
        int i2;
        long j4 = j2;
        Intrinsics.i(byteString, "bytes");
        if (byteString.N() > 0) {
            long j5 = 0;
            if (j4 >= 0) {
                Segment segment = this.f43339z;
                if (segment != null) {
                    if (n0() - j4 < j4) {
                        j3 = n0();
                        while (j3 > j4) {
                            segment = segment.f43438g;
                            Intrinsics.f(segment);
                            j3 -= (long) (segment.f43434c - segment.f43433b);
                        }
                        byte[] y2 = byteString.y();
                        byte b2 = y2[0];
                        int N = byteString.N();
                        long n0 = (n0() - ((long) N)) + 1;
                        while (j3 < n0) {
                            byte[] bArr = segment.f43432a;
                            long j6 = n0;
                            int min = (int) Math.min((long) segment.f43434c, (((long) segment.f43433b) + n0) - j3);
                            i2 = (int) ((((long) segment.f43433b) + j4) - j3);
                            while (i2 < min) {
                                if (bArr[i2] != b2 || !okio.internal.Buffer.c(segment, i2 + 1, y2, 1, N)) {
                                    i2++;
                                }
                            }
                            j3 += (long) (segment.f43434c - segment.f43433b);
                            segment = segment.f43437f;
                            Intrinsics.f(segment);
                            j4 = j3;
                            n0 = j6;
                        }
                    } else {
                        while (true) {
                            long j7 = ((long) (segment.f43434c - segment.f43433b)) + j5;
                            if (j7 > j4) {
                                break;
                            }
                            segment = segment.f43437f;
                            Intrinsics.f(segment);
                            j5 = j7;
                        }
                        byte[] y3 = byteString.y();
                        byte b3 = y3[0];
                        int N2 = byteString.N();
                        long n02 = (n0() - ((long) N2)) + 1;
                        while (j3 < n02) {
                            byte[] bArr2 = segment.f43432a;
                            int min2 = (int) Math.min((long) segment.f43434c, (((long) segment.f43433b) + n02) - j3);
                            int i3 = (int) ((((long) segment.f43433b) + j4) - j3);
                            while (i2 < min2) {
                                if (bArr2[i2] == b3) {
                                    if (okio.internal.Buffer.c(segment, i2 + 1, y3, 1, N2)) {
                                    }
                                }
                                i3 = i2 + 1;
                            }
                            j5 = j3 + ((long) (segment.f43434c - segment.f43433b));
                            segment = segment.f43437f;
                            Intrinsics.f(segment);
                            j4 = j5;
                        }
                    }
                    return ((long) (i2 - segment.f43433b)) + j3;
                }
                return -1;
            }
            throw new IllegalArgumentException(("fromIndex < 0: " + j4).toString());
        }
        throw new IllegalArgumentException("bytes is empty");
    }

    public OutputStream y1() {
        return new Buffer$outputStream$1(this);
    }

    public int write(ByteBuffer byteBuffer) {
        Intrinsics.i(byteBuffer, "source");
        int remaining = byteBuffer.remaining();
        int i2 = remaining;
        while (i2 > 0) {
            Segment t0 = t0(1);
            int min = Math.min(i2, 8192 - t0.f43434c);
            byteBuffer.get(t0.f43432a, t0.f43434c, min);
            i2 -= min;
            t0.f43434c += min;
        }
        this.f43338A += (long) remaining;
        return remaining;
    }

    public int read(byte[] bArr, int i2, int i3) {
        Intrinsics.i(bArr, "sink");
        SegmentedByteString.b((long) bArr.length, (long) i2, (long) i3);
        Segment segment = this.f43339z;
        if (segment == null) {
            return -1;
        }
        int min = Math.min(i3, segment.f43434c - segment.f43433b);
        byte[] bArr2 = segment.f43432a;
        int i4 = segment.f43433b;
        ArraysKt.g(bArr2, bArr, i2, i4, i4 + min);
        segment.f43433b += min;
        m0(n0() - ((long) min));
        if (segment.f43433b == segment.f43434c) {
            this.f43339z = segment.b();
            SegmentPool.b(segment);
        }
        return min;
    }
}
