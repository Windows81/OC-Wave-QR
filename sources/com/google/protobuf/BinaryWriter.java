package com.google.protobuf;

import com.google.protobuf.Internal;
import com.google.protobuf.MapEntryLite;
import com.google.protobuf.Utf8;
import com.google.protobuf.WireFormat;
import com.google.protobuf.Writer;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Map;

@CheckReturnValue
abstract class BinaryWriter extends ByteOutput implements Writer {

    /* renamed from: a  reason: collision with root package name */
    public final BufferAllocator f31950a;

    /* renamed from: b  reason: collision with root package name */
    public final int f31951b;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayDeque f31952c;

    /* renamed from: d  reason: collision with root package name */
    public int f31953d;

    /* renamed from: com.google.protobuf.BinaryWriter$1  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f31954a;

        /* JADX WARNING: Can't wrap try/catch for region: R(36:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00c0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.google.protobuf.WireFormat$FieldType[] r0 = com.google.protobuf.WireFormat.FieldType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f31954a = r0
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.BOOL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f31954a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.FIXED32     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f31954a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.FIXED64     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f31954a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.INT32     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f31954a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.INT64     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f31954a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.SFIXED32     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f31954a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.SFIXED64     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f31954a     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.SINT32     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f31954a     // Catch:{ NoSuchFieldError -> 0x006c }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.SINT64     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f31954a     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.STRING     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f31954a     // Catch:{ NoSuchFieldError -> 0x0084 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.UINT32     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = f31954a     // Catch:{ NoSuchFieldError -> 0x0090 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.UINT64     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r0 = f31954a     // Catch:{ NoSuchFieldError -> 0x009c }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.FLOAT     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r0 = f31954a     // Catch:{ NoSuchFieldError -> 0x00a8 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.DOUBLE     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r0 = f31954a     // Catch:{ NoSuchFieldError -> 0x00b4 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.MESSAGE     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r0 = f31954a     // Catch:{ NoSuchFieldError -> 0x00c0 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.BYTES     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r0 = f31954a     // Catch:{ NoSuchFieldError -> 0x00cc }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.ENUM     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r2 = 17
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.BinaryWriter.AnonymousClass1.<clinit>():void");
        }
    }

    public static final class SafeDirectWriter extends BinaryWriter {

        /* renamed from: e  reason: collision with root package name */
        public ByteBuffer f31955e;

        /* renamed from: f  reason: collision with root package name */
        public int f31956f;

        /* renamed from: g  reason: collision with root package name */
        public int f31957g;

        private int G0() {
            return this.f31956f - this.f31957g;
        }

        private int L0() {
            return this.f31957g + 1;
        }

        public void A(int i2, long j2) {
            a0(15);
            F0(j2);
            z0(i2, 0);
        }

        public void B(int i2, Object obj) {
            int l2 = l();
            Protobuf.a().e(obj, this);
            a0(10);
            E0(l() - l2);
            z0(i2, 2);
        }

        public void E(int i2, boolean z2) {
            a0(6);
            M0(z2 ? (byte) 1 : 0);
            z0(i2, 0);
        }

        public void E0(int i2) {
            if ((i2 & -128) == 0) {
                Q0(i2);
            } else if ((i2 & -16384) == 0) {
                S0(i2);
            } else if ((-2097152 & i2) == 0) {
                R0(i2);
            } else if ((-268435456 & i2) == 0) {
                P0(i2);
            } else {
                O0(i2);
            }
        }

        public void F0(long j2) {
            switch (BinaryWriter.k(j2)) {
                case 1:
                    Y0(j2);
                    return;
                case 2:
                    d1(j2);
                    return;
                case 3:
                    c1(j2);
                    return;
                case 4:
                    W0(j2);
                    return;
                case 5:
                    V0(j2);
                    return;
                case 6:
                    a1(j2);
                    return;
                case 7:
                    Z0(j2);
                    return;
                case 8:
                    T0(j2);
                    return;
                case 9:
                    X0(j2);
                    return;
                case 10:
                    b1(j2);
                    return;
                default:
                    return;
            }
        }

        public void G(int i2) {
            z0(i2, 3);
        }

        public void H0() {
            if (this.f31955e != null) {
                this.f31953d += G0();
                ByteBuffer byteBuffer = (ByteBuffer) this.f31955e.position(this.f31957g + 1);
                this.f31955e = null;
                this.f31957g = 0;
                this.f31956f = 0;
            }
        }

        public final void I0() {
            K0(m());
        }

        public final void J0(int i2) {
            K0(n(i2));
        }

        public final void K0(AllocatedBuffer allocatedBuffer) {
            if (allocatedBuffer.d()) {
                ByteBuffer f2 = allocatedBuffer.f();
                if (f2.isDirect()) {
                    H0();
                    this.f31952c.addFirst(allocatedBuffer);
                    this.f31955e = f2;
                    ByteBuffer byteBuffer = (ByteBuffer) f2.limit(f2.capacity());
                    ByteBuffer byteBuffer2 = (ByteBuffer) this.f31955e.position(0);
                    this.f31955e.order(ByteOrder.LITTLE_ENDIAN);
                    int limit = this.f31955e.limit() - 1;
                    this.f31956f = limit;
                    this.f31957g = limit;
                    return;
                }
                throw new RuntimeException("Allocator returned non-direct buffer");
            }
            throw new RuntimeException("Allocated buffer does not have NIO buffer");
        }

        public void M0(byte b2) {
            ByteBuffer byteBuffer = this.f31955e;
            int i2 = this.f31957g;
            this.f31957g = i2 - 1;
            byteBuffer.put(i2, b2);
        }

        public void N0(String str) {
            int i2;
            int i3;
            int i4;
            char charAt;
            a0(str.length());
            int length = str.length() - 1;
            this.f31957g -= length;
            while (length >= 0 && (charAt = str.charAt(length)) < 128) {
                this.f31955e.put(this.f31957g + length, (byte) charAt);
                length--;
            }
            if (length == -1) {
                this.f31957g--;
                return;
            }
            this.f31957g += length;
            while (length >= 0) {
                char charAt2 = str.charAt(length);
                if (charAt2 < 128 && (i4 = this.f31957g) >= 0) {
                    ByteBuffer byteBuffer = this.f31955e;
                    this.f31957g = i4 - 1;
                    byteBuffer.put(i4, (byte) charAt2);
                } else if (charAt2 < 2048 && (i3 = this.f31957g) > 0) {
                    ByteBuffer byteBuffer2 = this.f31955e;
                    this.f31957g = i3 - 1;
                    byteBuffer2.put(i3, (byte) ((charAt2 & '?') | 128));
                    ByteBuffer byteBuffer3 = this.f31955e;
                    int i5 = this.f31957g;
                    this.f31957g = i5 - 1;
                    byteBuffer3.put(i5, (byte) ((charAt2 >>> 6) | 960));
                } else if ((charAt2 < 55296 || 57343 < charAt2) && (i2 = this.f31957g) > 1) {
                    ByteBuffer byteBuffer4 = this.f31955e;
                    this.f31957g = i2 - 1;
                    byteBuffer4.put(i2, (byte) ((charAt2 & '?') | 128));
                    ByteBuffer byteBuffer5 = this.f31955e;
                    int i6 = this.f31957g;
                    this.f31957g = i6 - 1;
                    byteBuffer5.put(i6, (byte) (((charAt2 >>> 6) & 63) | 128));
                    ByteBuffer byteBuffer6 = this.f31955e;
                    int i7 = this.f31957g;
                    this.f31957g = i7 - 1;
                    byteBuffer6.put(i7, (byte) ((charAt2 >>> 12) | 480));
                } else if (this.f31957g > 2) {
                    if (length != 0) {
                        char charAt3 = str.charAt(length - 1);
                        if (Character.isSurrogatePair(charAt3, charAt2)) {
                            length--;
                            int codePoint = Character.toCodePoint(charAt3, charAt2);
                            ByteBuffer byteBuffer7 = this.f31955e;
                            int i8 = this.f31957g;
                            this.f31957g = i8 - 1;
                            byteBuffer7.put(i8, (byte) ((codePoint & 63) | 128));
                            ByteBuffer byteBuffer8 = this.f31955e;
                            int i9 = this.f31957g;
                            this.f31957g = i9 - 1;
                            byteBuffer8.put(i9, (byte) (((codePoint >>> 6) & 63) | 128));
                            ByteBuffer byteBuffer9 = this.f31955e;
                            int i10 = this.f31957g;
                            this.f31957g = i10 - 1;
                            byteBuffer9.put(i10, (byte) (((codePoint >>> 12) & 63) | 128));
                            ByteBuffer byteBuffer10 = this.f31955e;
                            int i11 = this.f31957g;
                            this.f31957g = i11 - 1;
                            byteBuffer10.put(i11, (byte) ((codePoint >>> 18) | 240));
                        }
                    }
                    throw new Utf8.UnpairedSurrogateException(length - 1, length);
                } else {
                    a0(length);
                    length++;
                }
                length--;
            }
        }

        public void O(int i2, long j2) {
            a0(15);
            w0(j2);
            z0(i2, 0);
        }

        public final void O0(int i2) {
            ByteBuffer byteBuffer = this.f31955e;
            int i3 = this.f31957g;
            this.f31957g = i3 - 1;
            byteBuffer.put(i3, (byte) (i2 >>> 28));
            int i4 = this.f31957g;
            this.f31957g = i4 - 4;
            this.f31955e.putInt(i4 - 3, (i2 & 127) | 128 | ((((i2 >>> 21) & 127) | 128) << 24) | ((((i2 >>> 14) & 127) | 128) << 16) | ((((i2 >>> 7) & 127) | 128) << 8));
        }

        public final void P0(int i2) {
            int i3 = this.f31957g;
            this.f31957g = i3 - 4;
            this.f31955e.putInt(i3 - 3, (i2 & 127) | 128 | ((266338304 & i2) << 3) | (((2080768 & i2) | 2097152) << 2) | (((i2 & 16256) | 16384) << 1));
        }

        public void Q(int i2) {
            z0(i2, 4);
        }

        public final void Q0(int i2) {
            ByteBuffer byteBuffer = this.f31955e;
            int i3 = this.f31957g;
            this.f31957g = i3 - 1;
            byteBuffer.put(i3, (byte) i2);
        }

        public final void R0(int i2) {
            int i3 = this.f31957g - 3;
            this.f31957g = i3;
            this.f31955e.putInt(i3, (((i2 & 127) | 128) << 8) | ((2080768 & i2) << 10) | (((i2 & 16256) | 16384) << 9));
        }

        public final void S0(int i2) {
            int i3 = this.f31957g;
            this.f31957g = i3 - 2;
            this.f31955e.putShort(i3 - 1, (short) ((i2 & 127) | 128 | ((i2 & 16256) << 1)));
        }

        public final void T0(long j2) {
            int i2 = this.f31957g;
            this.f31957g = i2 - 8;
            this.f31955e.putLong(i2 - 7, (j2 & 127) | 128 | ((71494644084506624L & j2) << 7) | (((558551906910208L & j2) | 562949953421312L) << 6) | (((4363686772736L & j2) | 4398046511104L) << 5) | (((34091302912L & j2) | 34359738368L) << 4) | (((266338304 & j2) | 268435456) << 3) | (((2080768 & j2) | 2097152) << 2) | (((16256 & j2) | 16384) << 1));
        }

        public final void U0(long j2) {
            int i2 = this.f31957g;
            this.f31957g = i2 - 8;
            this.f31955e.putLong(i2 - 7, (j2 & 127) | 128 | (((71494644084506624L & j2) | 72057594037927936L) << 7) | (((558551906910208L & j2) | 562949953421312L) << 6) | (((4363686772736L & j2) | 4398046511104L) << 5) | (((34091302912L & j2) | 34359738368L) << 4) | (((266338304 & j2) | 268435456) << 3) | (((2080768 & j2) | 2097152) << 2) | (((16256 & j2) | 16384) << 1));
        }

        public final void V0(long j2) {
            int i2 = this.f31957g;
            this.f31957g = i2 - 5;
            this.f31955e.putLong(i2 - 7, (((j2 & 127) | 128) << 24) | ((34091302912L & j2) << 28) | (((266338304 & j2) | 268435456) << 27) | (((2080768 & j2) | 2097152) << 26) | (((16256 & j2) | 16384) << 25));
        }

        public void W(int i2, int i3) {
            a0(10);
            t0(i3);
            z0(i2, 0);
        }

        public final void W0(long j2) {
            P0((int) j2);
        }

        public final void X0(long j2) {
            ByteBuffer byteBuffer = this.f31955e;
            int i2 = this.f31957g;
            this.f31957g = i2 - 1;
            byteBuffer.put(i2, (byte) ((int) (j2 >>> 56)));
            U0(j2 & 72057594037927935L);
        }

        public final void Y0(long j2) {
            Q0((int) j2);
        }

        public final void Z0(long j2) {
            int i2 = this.f31957g - 7;
            this.f31957g = i2;
            this.f31955e.putLong(i2, (((j2 & 127) | 128) << 8) | ((558551906910208L & j2) << 14) | (((4363686772736L & j2) | 4398046511104L) << 13) | (((34091302912L & j2) | 34359738368L) << 12) | (((266338304 & j2) | 268435456) << 11) | (((2080768 & j2) | 2097152) << 10) | (((16256 & j2) | 16384) << 9));
        }

        public void a0(int i2) {
            if (L0() < i2) {
                J0(i2);
            }
        }

        public final void a1(long j2) {
            int i2 = this.f31957g;
            this.f31957g = i2 - 6;
            this.f31955e.putLong(i2 - 7, (((j2 & 127) | 128) << 16) | ((4363686772736L & j2) << 21) | (((34091302912L & j2) | 34359738368L) << 20) | (((266338304 & j2) | 268435456) << 19) | (((2080768 & j2) | 2097152) << 18) | (((16256 & j2) | 16384) << 17));
        }

        public void b0(boolean z2) {
            M0(z2 ? (byte) 1 : 0);
        }

        public final void b1(long j2) {
            ByteBuffer byteBuffer = this.f31955e;
            int i2 = this.f31957g;
            this.f31957g = i2 - 1;
            byteBuffer.put(i2, (byte) ((int) (j2 >>> 63)));
            ByteBuffer byteBuffer2 = this.f31955e;
            int i3 = this.f31957g;
            this.f31957g = i3 - 1;
            byteBuffer2.put(i3, (byte) ((int) (((j2 >>> 56) & 127) | 128)));
            U0(j2 & 72057594037927935L);
        }

        public void c(int i2, Object obj, Schema schema) {
            int l2 = l();
            schema.h(obj, this);
            a0(10);
            E0(l() - l2);
            z0(i2, 2);
        }

        public final void c1(long j2) {
            R0((int) j2);
        }

        public void d(int i2, Object obj, Schema schema) {
            z0(i2, 4);
            schema.h(obj, this);
            z0(i2, 3);
        }

        public final void d1(long j2) {
            S0((int) j2);
        }

        public void e(int i2, ByteString byteString) {
            try {
                byteString.a0(this);
                a0(10);
                E0(byteString.size());
                z0(i2, 2);
            } catch (IOException e2) {
                throw new RuntimeException(e2);
            }
        }

        public void g(byte[] bArr, int i2, int i3) {
            if (L0() < i3) {
                J0(i3);
            }
            int i4 = this.f31957g - i3;
            this.f31957g = i4;
            ByteBuffer byteBuffer = (ByteBuffer) this.f31955e.position(i4 + 1);
            this.f31955e.put(bArr, i2, i3);
        }

        public void g0(int i2) {
            int i3 = this.f31957g;
            this.f31957g = i3 - 4;
            this.f31955e.putInt(i3 - 3, i2);
        }

        public void h(ByteBuffer byteBuffer) {
            int remaining = byteBuffer.remaining();
            if (L0() < remaining) {
                this.f31953d += remaining;
                this.f31952c.addFirst(AllocatedBuffer.i(byteBuffer));
                I0();
                return;
            }
            int i2 = this.f31957g - remaining;
            this.f31957g = i2;
            ByteBuffer byteBuffer2 = (ByteBuffer) this.f31955e.position(i2 + 1);
            this.f31955e.put(byteBuffer);
        }

        public void i(byte[] bArr, int i2, int i3) {
            if (L0() < i3) {
                this.f31953d += i3;
                this.f31952c.addFirst(AllocatedBuffer.k(bArr, i2, i3));
                I0();
                return;
            }
            int i4 = this.f31957g - i3;
            this.f31957g = i4;
            ByteBuffer byteBuffer = (ByteBuffer) this.f31955e.position(i4 + 1);
            this.f31955e.put(bArr, i2, i3);
        }

        public void j0(long j2) {
            int i2 = this.f31957g;
            this.f31957g = i2 - 8;
            this.f31955e.putLong(i2 - 7, j2);
        }

        public int l() {
            return this.f31953d + G0();
        }

        public void o(int i2, int i3) {
            a0(15);
            o0(i3);
            z0(i2, 0);
        }

        public void o0(int i2) {
            if (i2 >= 0) {
                E0(i2);
            } else {
                F0((long) i2);
            }
        }

        public void q(int i2, int i3) {
            a0(10);
            E0(i3);
            z0(i2, 0);
        }

        public void s(int i2, int i3) {
            a0(9);
            g0(i3);
            z0(i2, 5);
        }

        public void t0(int i2) {
            E0(CodedOutputStream.Q0(i2));
        }

        public void w(int i2, long j2) {
            a0(13);
            j0(j2);
            z0(i2, 1);
        }

        public void w0(long j2) {
            F0(CodedOutputStream.R0(j2));
        }

        public void z(int i2, String str) {
            int l2 = l();
            N0(str);
            a0(10);
            E0(l() - l2);
            z0(i2, 2);
        }

        public void z0(int i2, int i3) {
            E0(WireFormat.c(i2, i3));
        }
    }

    public static final class SafeHeapWriter extends BinaryWriter {

        /* renamed from: e  reason: collision with root package name */
        public AllocatedBuffer f31958e;

        /* renamed from: f  reason: collision with root package name */
        public byte[] f31959f;

        /* renamed from: g  reason: collision with root package name */
        public int f31960g;

        /* renamed from: h  reason: collision with root package name */
        public int f31961h;

        /* renamed from: i  reason: collision with root package name */
        public int f31962i;

        /* renamed from: j  reason: collision with root package name */
        public int f31963j;

        /* renamed from: k  reason: collision with root package name */
        public int f31964k;

        private void I0() {
            K0(Y());
        }

        private void J0(int i2) {
            K0(Z(i2));
        }

        private void K0(AllocatedBuffer allocatedBuffer) {
            if (allocatedBuffer.c()) {
                H0();
                this.f31952c.addFirst(allocatedBuffer);
                this.f31958e = allocatedBuffer;
                this.f31959f = allocatedBuffer.a();
                int b2 = allocatedBuffer.b();
                this.f31961h = allocatedBuffer.e() + b2;
                int g2 = b2 + allocatedBuffer.g();
                this.f31960g = g2;
                this.f31962i = g2 - 1;
                int i2 = this.f31961h - 1;
                this.f31963j = i2;
                this.f31964k = i2;
                return;
            }
            throw new RuntimeException("Allocator returned non-heap buffer");
        }

        private void O0(int i2) {
            byte[] bArr = this.f31959f;
            int i3 = this.f31964k;
            int i4 = i3 - 1;
            this.f31964k = i4;
            bArr[i3] = (byte) (i2 >>> 28);
            int i5 = i3 - 2;
            this.f31964k = i5;
            bArr[i4] = (byte) (((i2 >>> 21) & 127) | 128);
            int i6 = i3 - 3;
            this.f31964k = i6;
            bArr[i5] = (byte) (((i2 >>> 14) & 127) | 128);
            int i7 = i3 - 4;
            this.f31964k = i7;
            bArr[i6] = (byte) (((i2 >>> 7) & 127) | 128);
            this.f31964k = i3 - 5;
            bArr[i7] = (byte) ((i2 & 127) | 128);
        }

        private void P0(int i2) {
            byte[] bArr = this.f31959f;
            int i3 = this.f31964k;
            int i4 = i3 - 1;
            this.f31964k = i4;
            bArr[i3] = (byte) (i2 >>> 21);
            int i5 = i3 - 2;
            this.f31964k = i5;
            bArr[i4] = (byte) (((i2 >>> 14) & 127) | 128);
            int i6 = i3 - 3;
            this.f31964k = i6;
            bArr[i5] = (byte) (((i2 >>> 7) & 127) | 128);
            this.f31964k = i3 - 4;
            bArr[i6] = (byte) ((i2 & 127) | 128);
        }

        private void Q0(int i2) {
            byte[] bArr = this.f31959f;
            int i3 = this.f31964k;
            this.f31964k = i3 - 1;
            bArr[i3] = (byte) i2;
        }

        private void R0(int i2) {
            byte[] bArr = this.f31959f;
            int i3 = this.f31964k;
            int i4 = i3 - 1;
            this.f31964k = i4;
            bArr[i3] = (byte) (i2 >>> 14);
            int i5 = i3 - 2;
            this.f31964k = i5;
            bArr[i4] = (byte) (((i2 >>> 7) & 127) | 128);
            this.f31964k = i3 - 3;
            bArr[i5] = (byte) ((i2 & 127) | 128);
        }

        private void S0(int i2) {
            byte[] bArr = this.f31959f;
            int i3 = this.f31964k;
            int i4 = i3 - 1;
            this.f31964k = i4;
            bArr[i3] = (byte) (i2 >>> 7);
            this.f31964k = i3 - 2;
            bArr[i4] = (byte) ((i2 & 127) | 128);
        }

        private void T0(long j2) {
            byte[] bArr = this.f31959f;
            int i2 = this.f31964k;
            int i3 = i2 - 1;
            this.f31964k = i3;
            bArr[i2] = (byte) ((int) (j2 >>> 49));
            int i4 = i2 - 2;
            this.f31964k = i4;
            bArr[i3] = (byte) ((int) (((j2 >>> 42) & 127) | 128));
            int i5 = i2 - 3;
            this.f31964k = i5;
            bArr[i4] = (byte) ((int) (((j2 >>> 35) & 127) | 128));
            int i6 = i2 - 4;
            this.f31964k = i6;
            bArr[i5] = (byte) ((int) (((j2 >>> 28) & 127) | 128));
            int i7 = i2 - 5;
            this.f31964k = i7;
            bArr[i6] = (byte) ((int) (((j2 >>> 21) & 127) | 128));
            int i8 = i2 - 6;
            this.f31964k = i8;
            bArr[i7] = (byte) ((int) (((j2 >>> 14) & 127) | 128));
            int i9 = i2 - 7;
            this.f31964k = i9;
            bArr[i8] = (byte) ((int) (((j2 >>> 7) & 127) | 128));
            this.f31964k = i2 - 8;
            bArr[i9] = (byte) ((int) ((j2 & 127) | 128));
        }

        private void U0(long j2) {
            byte[] bArr = this.f31959f;
            int i2 = this.f31964k;
            int i3 = i2 - 1;
            this.f31964k = i3;
            bArr[i2] = (byte) ((int) (j2 >>> 28));
            int i4 = i2 - 2;
            this.f31964k = i4;
            bArr[i3] = (byte) ((int) (((j2 >>> 21) & 127) | 128));
            int i5 = i2 - 3;
            this.f31964k = i5;
            bArr[i4] = (byte) ((int) (((j2 >>> 14) & 127) | 128));
            int i6 = i2 - 4;
            this.f31964k = i6;
            bArr[i5] = (byte) ((int) (((j2 >>> 7) & 127) | 128));
            this.f31964k = i2 - 5;
            bArr[i6] = (byte) ((int) ((j2 & 127) | 128));
        }

        private void V0(long j2) {
            byte[] bArr = this.f31959f;
            int i2 = this.f31964k;
            int i3 = i2 - 1;
            this.f31964k = i3;
            bArr[i2] = (byte) ((int) (j2 >>> 21));
            int i4 = i2 - 2;
            this.f31964k = i4;
            bArr[i3] = (byte) ((int) (((j2 >>> 14) & 127) | 128));
            int i5 = i2 - 3;
            this.f31964k = i5;
            bArr[i4] = (byte) ((int) (((j2 >>> 7) & 127) | 128));
            this.f31964k = i2 - 4;
            bArr[i5] = (byte) ((int) ((j2 & 127) | 128));
        }

        private void W0(long j2) {
            byte[] bArr = this.f31959f;
            int i2 = this.f31964k;
            int i3 = i2 - 1;
            this.f31964k = i3;
            bArr[i2] = (byte) ((int) (j2 >>> 56));
            int i4 = i2 - 2;
            this.f31964k = i4;
            bArr[i3] = (byte) ((int) (((j2 >>> 49) & 127) | 128));
            int i5 = i2 - 3;
            this.f31964k = i5;
            bArr[i4] = (byte) ((int) (((j2 >>> 42) & 127) | 128));
            int i6 = i2 - 4;
            this.f31964k = i6;
            bArr[i5] = (byte) ((int) (((j2 >>> 35) & 127) | 128));
            int i7 = i2 - 5;
            this.f31964k = i7;
            bArr[i6] = (byte) ((int) (((j2 >>> 28) & 127) | 128));
            int i8 = i2 - 6;
            this.f31964k = i8;
            bArr[i7] = (byte) ((int) (((j2 >>> 21) & 127) | 128));
            int i9 = i2 - 7;
            this.f31964k = i9;
            bArr[i8] = (byte) ((int) (((j2 >>> 14) & 127) | 128));
            int i10 = i2 - 8;
            this.f31964k = i10;
            bArr[i9] = (byte) ((int) (((j2 >>> 7) & 127) | 128));
            this.f31964k = i2 - 9;
            bArr[i10] = (byte) ((int) ((j2 & 127) | 128));
        }

        private void X0(long j2) {
            byte[] bArr = this.f31959f;
            int i2 = this.f31964k;
            this.f31964k = i2 - 1;
            bArr[i2] = (byte) ((int) j2);
        }

        private void Y0(long j2) {
            byte[] bArr = this.f31959f;
            int i2 = this.f31964k;
            int i3 = i2 - 1;
            this.f31964k = i3;
            bArr[i2] = (byte) ((int) (j2 >>> 42));
            int i4 = i2 - 2;
            this.f31964k = i4;
            bArr[i3] = (byte) ((int) (((j2 >>> 35) & 127) | 128));
            int i5 = i2 - 3;
            this.f31964k = i5;
            bArr[i4] = (byte) ((int) (((j2 >>> 28) & 127) | 128));
            int i6 = i2 - 4;
            this.f31964k = i6;
            bArr[i5] = (byte) ((int) (((j2 >>> 21) & 127) | 128));
            int i7 = i2 - 5;
            this.f31964k = i7;
            bArr[i6] = (byte) ((int) (((j2 >>> 14) & 127) | 128));
            int i8 = i2 - 6;
            this.f31964k = i8;
            bArr[i7] = (byte) ((int) (((j2 >>> 7) & 127) | 128));
            this.f31964k = i2 - 7;
            bArr[i8] = (byte) ((int) ((j2 & 127) | 128));
        }

        private void Z0(long j2) {
            byte[] bArr = this.f31959f;
            int i2 = this.f31964k;
            int i3 = i2 - 1;
            this.f31964k = i3;
            bArr[i2] = (byte) ((int) (j2 >>> 35));
            int i4 = i2 - 2;
            this.f31964k = i4;
            bArr[i3] = (byte) ((int) (((j2 >>> 28) & 127) | 128));
            int i5 = i2 - 3;
            this.f31964k = i5;
            bArr[i4] = (byte) ((int) (((j2 >>> 21) & 127) | 128));
            int i6 = i2 - 4;
            this.f31964k = i6;
            bArr[i5] = (byte) ((int) (((j2 >>> 14) & 127) | 128));
            int i7 = i2 - 5;
            this.f31964k = i7;
            bArr[i6] = (byte) ((int) (((j2 >>> 7) & 127) | 128));
            this.f31964k = i2 - 6;
            bArr[i7] = (byte) ((int) ((j2 & 127) | 128));
        }

        private void a1(long j2) {
            byte[] bArr = this.f31959f;
            int i2 = this.f31964k;
            int i3 = i2 - 1;
            this.f31964k = i3;
            bArr[i2] = (byte) ((int) (j2 >>> 63));
            int i4 = i2 - 2;
            this.f31964k = i4;
            bArr[i3] = (byte) ((int) (((j2 >>> 56) & 127) | 128));
            int i5 = i2 - 3;
            this.f31964k = i5;
            bArr[i4] = (byte) ((int) (((j2 >>> 49) & 127) | 128));
            int i6 = i2 - 4;
            this.f31964k = i6;
            bArr[i5] = (byte) ((int) (((j2 >>> 42) & 127) | 128));
            int i7 = i2 - 5;
            this.f31964k = i7;
            bArr[i6] = (byte) ((int) (((j2 >>> 35) & 127) | 128));
            int i8 = i2 - 6;
            this.f31964k = i8;
            bArr[i7] = (byte) ((int) (((j2 >>> 28) & 127) | 128));
            int i9 = i2 - 7;
            this.f31964k = i9;
            bArr[i8] = (byte) ((int) (((j2 >>> 21) & 127) | 128));
            int i10 = i2 - 8;
            this.f31964k = i10;
            bArr[i9] = (byte) ((int) (((j2 >>> 14) & 127) | 128));
            int i11 = i2 - 9;
            this.f31964k = i11;
            bArr[i10] = (byte) ((int) (((j2 >>> 7) & 127) | 128));
            this.f31964k = i2 - 10;
            bArr[i11] = (byte) ((int) ((j2 & 127) | 128));
        }

        private void b1(long j2) {
            byte[] bArr = this.f31959f;
            int i2 = this.f31964k;
            int i3 = i2 - 1;
            this.f31964k = i3;
            bArr[i2] = (byte) (((int) j2) >>> 14);
            int i4 = i2 - 2;
            this.f31964k = i4;
            bArr[i3] = (byte) ((int) (((j2 >>> 7) & 127) | 128));
            this.f31964k = i2 - 3;
            bArr[i4] = (byte) ((int) ((j2 & 127) | 128));
        }

        private void c1(long j2) {
            byte[] bArr = this.f31959f;
            int i2 = this.f31964k;
            int i3 = i2 - 1;
            this.f31964k = i3;
            bArr[i2] = (byte) ((int) (j2 >>> 7));
            this.f31964k = i2 - 2;
            bArr[i3] = (byte) ((((int) j2) & 127) | 128);
        }

        public void A(int i2, long j2) {
            a0(15);
            F0(j2);
            z0(i2, 0);
        }

        public void B(int i2, Object obj) {
            int l2 = l();
            Protobuf.a().e(obj, this);
            a0(10);
            E0(l() - l2);
            z0(i2, 2);
        }

        public void E(int i2, boolean z2) {
            a0(6);
            M0(z2 ? (byte) 1 : 0);
            z0(i2, 0);
        }

        public void E0(int i2) {
            if ((i2 & -128) == 0) {
                Q0(i2);
            } else if ((i2 & -16384) == 0) {
                S0(i2);
            } else if ((-2097152 & i2) == 0) {
                R0(i2);
            } else if ((-268435456 & i2) == 0) {
                P0(i2);
            } else {
                O0(i2);
            }
        }

        public void F0(long j2) {
            switch (BinaryWriter.k(j2)) {
                case 1:
                    X0(j2);
                    return;
                case 2:
                    c1(j2);
                    return;
                case 3:
                    b1(j2);
                    return;
                case 4:
                    V0(j2);
                    return;
                case 5:
                    U0(j2);
                    return;
                case 6:
                    Z0(j2);
                    return;
                case 7:
                    Y0(j2);
                    return;
                case 8:
                    T0(j2);
                    return;
                case 9:
                    W0(j2);
                    return;
                case 10:
                    a1(j2);
                    return;
                default:
                    return;
            }
        }

        public void G(int i2) {
            z0(i2, 3);
        }

        public int G0() {
            return this.f31963j - this.f31964k;
        }

        public void H0() {
            if (this.f31958e != null) {
                this.f31953d += G0();
                AllocatedBuffer allocatedBuffer = this.f31958e;
                allocatedBuffer.h((this.f31964k - allocatedBuffer.b()) + 1);
                this.f31958e = null;
                this.f31964k = 0;
                this.f31963j = 0;
            }
        }

        public int L0() {
            return this.f31964k - this.f31962i;
        }

        public void M0(byte b2) {
            byte[] bArr = this.f31959f;
            int i2 = this.f31964k;
            this.f31964k = i2 - 1;
            bArr[i2] = b2;
        }

        public void N0(String str) {
            int i2;
            int i3;
            int i4;
            char charAt;
            a0(str.length());
            int length = str.length() - 1;
            this.f31964k -= length;
            while (length >= 0 && (charAt = str.charAt(length)) < 128) {
                this.f31959f[this.f31964k + length] = (byte) charAt;
                length--;
            }
            if (length == -1) {
                this.f31964k--;
                return;
            }
            this.f31964k += length;
            while (length >= 0) {
                char charAt2 = str.charAt(length);
                if (charAt2 < 128 && (i4 = this.f31964k) > this.f31962i) {
                    byte[] bArr = this.f31959f;
                    this.f31964k = i4 - 1;
                    bArr[i4] = (byte) charAt2;
                } else if (charAt2 < 2048 && (i3 = this.f31964k) > this.f31960g) {
                    byte[] bArr2 = this.f31959f;
                    int i5 = i3 - 1;
                    this.f31964k = i5;
                    bArr2[i3] = (byte) ((charAt2 & '?') | 128);
                    this.f31964k = i3 - 2;
                    bArr2[i5] = (byte) ((charAt2 >>> 6) | 960);
                } else if ((charAt2 < 55296 || 57343 < charAt2) && (i2 = this.f31964k) > this.f31960g + 1) {
                    byte[] bArr3 = this.f31959f;
                    int i6 = i2 - 1;
                    this.f31964k = i6;
                    bArr3[i2] = (byte) ((charAt2 & '?') | 128);
                    int i7 = i2 - 2;
                    this.f31964k = i7;
                    bArr3[i6] = (byte) (((charAt2 >>> 6) & 63) | 128);
                    this.f31964k = i2 - 3;
                    bArr3[i7] = (byte) ((charAt2 >>> 12) | 480);
                } else if (this.f31964k > this.f31960g + 2) {
                    if (length != 0) {
                        char charAt3 = str.charAt(length - 1);
                        if (Character.isSurrogatePair(charAt3, charAt2)) {
                            length--;
                            int codePoint = Character.toCodePoint(charAt3, charAt2);
                            byte[] bArr4 = this.f31959f;
                            int i8 = this.f31964k;
                            int i9 = i8 - 1;
                            this.f31964k = i9;
                            bArr4[i8] = (byte) ((codePoint & 63) | 128);
                            int i10 = i8 - 2;
                            this.f31964k = i10;
                            bArr4[i9] = (byte) (((codePoint >>> 6) & 63) | 128);
                            int i11 = i8 - 3;
                            this.f31964k = i11;
                            bArr4[i10] = (byte) (((codePoint >>> 12) & 63) | 128);
                            this.f31964k = i8 - 4;
                            bArr4[i11] = (byte) ((codePoint >>> 18) | 240);
                        }
                    }
                    throw new Utf8.UnpairedSurrogateException(length - 1, length);
                } else {
                    a0(length);
                    length++;
                }
                length--;
            }
        }

        public void O(int i2, long j2) {
            a0(15);
            w0(j2);
            z0(i2, 0);
        }

        public void Q(int i2) {
            z0(i2, 4);
        }

        public void W(int i2, int i3) {
            a0(10);
            t0(i3);
            z0(i2, 0);
        }

        public void a0(int i2) {
            if (L0() < i2) {
                J0(i2);
            }
        }

        public void b0(boolean z2) {
            M0(z2 ? (byte) 1 : 0);
        }

        public void c(int i2, Object obj, Schema schema) {
            int l2 = l();
            schema.h(obj, this);
            a0(10);
            E0(l() - l2);
            z0(i2, 2);
        }

        public void d(int i2, Object obj, Schema schema) {
            z0(i2, 4);
            schema.h(obj, this);
            z0(i2, 3);
        }

        public void e(int i2, ByteString byteString) {
            try {
                byteString.a0(this);
                a0(10);
                E0(byteString.size());
                z0(i2, 2);
            } catch (IOException e2) {
                throw new RuntimeException(e2);
            }
        }

        public void g(byte[] bArr, int i2, int i3) {
            if (L0() < i3) {
                J0(i3);
            }
            int i4 = this.f31964k - i3;
            this.f31964k = i4;
            System.arraycopy(bArr, i2, this.f31959f, i4 + 1, i3);
        }

        public void g0(int i2) {
            byte[] bArr = this.f31959f;
            int i3 = this.f31964k;
            int i4 = i3 - 1;
            this.f31964k = i4;
            bArr[i3] = (byte) ((i2 >> 24) & 255);
            int i5 = i3 - 2;
            this.f31964k = i5;
            bArr[i4] = (byte) ((i2 >> 16) & 255);
            int i6 = i3 - 3;
            this.f31964k = i6;
            bArr[i5] = (byte) ((i2 >> 8) & 255);
            this.f31964k = i3 - 4;
            bArr[i6] = (byte) (i2 & 255);
        }

        public void h(ByteBuffer byteBuffer) {
            int remaining = byteBuffer.remaining();
            if (L0() < remaining) {
                this.f31953d += remaining;
                this.f31952c.addFirst(AllocatedBuffer.i(byteBuffer));
                I0();
            }
            int i2 = this.f31964k - remaining;
            this.f31964k = i2;
            byteBuffer.get(this.f31959f, i2 + 1, remaining);
        }

        public void i(byte[] bArr, int i2, int i3) {
            if (L0() < i3) {
                this.f31953d += i3;
                this.f31952c.addFirst(AllocatedBuffer.k(bArr, i2, i3));
                I0();
                return;
            }
            int i4 = this.f31964k - i3;
            this.f31964k = i4;
            System.arraycopy(bArr, i2, this.f31959f, i4 + 1, i3);
        }

        public void j0(long j2) {
            byte[] bArr = this.f31959f;
            int i2 = this.f31964k;
            int i3 = i2 - 1;
            this.f31964k = i3;
            bArr[i2] = (byte) (((int) (j2 >> 56)) & 255);
            int i4 = i2 - 2;
            this.f31964k = i4;
            bArr[i3] = (byte) (((int) (j2 >> 48)) & 255);
            int i5 = i2 - 3;
            this.f31964k = i5;
            bArr[i4] = (byte) (((int) (j2 >> 40)) & 255);
            int i6 = i2 - 4;
            this.f31964k = i6;
            bArr[i5] = (byte) (((int) (j2 >> 32)) & 255);
            int i7 = i2 - 5;
            this.f31964k = i7;
            bArr[i6] = (byte) (((int) (j2 >> 24)) & 255);
            int i8 = i2 - 6;
            this.f31964k = i8;
            bArr[i7] = (byte) (((int) (j2 >> 16)) & 255);
            int i9 = i2 - 7;
            this.f31964k = i9;
            bArr[i8] = (byte) (((int) (j2 >> 8)) & 255);
            this.f31964k = i2 - 8;
            bArr[i9] = (byte) (((int) j2) & 255);
        }

        public int l() {
            return this.f31953d + G0();
        }

        public void o(int i2, int i3) {
            a0(15);
            o0(i3);
            z0(i2, 0);
        }

        public void o0(int i2) {
            if (i2 >= 0) {
                E0(i2);
            } else {
                F0((long) i2);
            }
        }

        public void q(int i2, int i3) {
            a0(10);
            E0(i3);
            z0(i2, 0);
        }

        public void s(int i2, int i3) {
            a0(9);
            g0(i3);
            z0(i2, 5);
        }

        public void t0(int i2) {
            E0(CodedOutputStream.Q0(i2));
        }

        public void w(int i2, long j2) {
            a0(13);
            j0(j2);
            z0(i2, 1);
        }

        public void w0(long j2) {
            F0(CodedOutputStream.R0(j2));
        }

        public void z(int i2, String str) {
            int l2 = l();
            N0(str);
            a0(10);
            E0(l() - l2);
            z0(i2, 2);
        }

        public void z0(int i2, int i3) {
            E0(WireFormat.c(i2, i3));
        }
    }

    public static final class UnsafeDirectWriter extends BinaryWriter {

        /* renamed from: e  reason: collision with root package name */
        public ByteBuffer f31965e;

        /* renamed from: f  reason: collision with root package name */
        public long f31966f;

        /* renamed from: g  reason: collision with root package name */
        public long f31967g;

        /* renamed from: h  reason: collision with root package name */
        public long f31968h;

        private int H0() {
            return (int) (this.f31967g - this.f31968h);
        }

        private void J0() {
            L0(m());
        }

        private void K0(int i2) {
            L0(n(i2));
        }

        private void L0(AllocatedBuffer allocatedBuffer) {
            if (allocatedBuffer.d()) {
                ByteBuffer f2 = allocatedBuffer.f();
                if (f2.isDirect()) {
                    I0();
                    this.f31952c.addFirst(allocatedBuffer);
                    this.f31965e = f2;
                    ByteBuffer byteBuffer = (ByteBuffer) f2.limit(f2.capacity());
                    ByteBuffer byteBuffer2 = (ByteBuffer) this.f31965e.position(0);
                    long k2 = UnsafeUtil.k(this.f31965e);
                    this.f31966f = k2;
                    long limit = k2 + ((long) (this.f31965e.limit() - 1));
                    this.f31967g = limit;
                    this.f31968h = limit;
                    return;
                }
                throw new RuntimeException("Allocator returned non-direct buffer");
            }
            throw new RuntimeException("Allocated buffer does not have NIO buffer");
        }

        private int M0() {
            return G0() + 1;
        }

        private void P0(int i2) {
            long j2 = this.f31968h;
            this.f31968h = j2 - 1;
            UnsafeUtil.Q(j2, (byte) (i2 >>> 28));
            long j3 = this.f31968h;
            this.f31968h = j3 - 1;
            UnsafeUtil.Q(j3, (byte) (((i2 >>> 21) & 127) | 128));
            long j4 = this.f31968h;
            this.f31968h = j4 - 1;
            UnsafeUtil.Q(j4, (byte) (((i2 >>> 14) & 127) | 128));
            long j5 = this.f31968h;
            this.f31968h = j5 - 1;
            UnsafeUtil.Q(j5, (byte) (((i2 >>> 7) & 127) | 128));
            long j6 = this.f31968h;
            this.f31968h = j6 - 1;
            UnsafeUtil.Q(j6, (byte) ((i2 & 127) | 128));
        }

        private void Q0(int i2) {
            long j2 = this.f31968h;
            this.f31968h = j2 - 1;
            UnsafeUtil.Q(j2, (byte) (i2 >>> 21));
            long j3 = this.f31968h;
            this.f31968h = j3 - 1;
            UnsafeUtil.Q(j3, (byte) (((i2 >>> 14) & 127) | 128));
            long j4 = this.f31968h;
            this.f31968h = j4 - 1;
            UnsafeUtil.Q(j4, (byte) (((i2 >>> 7) & 127) | 128));
            long j5 = this.f31968h;
            this.f31968h = j5 - 1;
            UnsafeUtil.Q(j5, (byte) ((i2 & 127) | 128));
        }

        private void R0(int i2) {
            long j2 = this.f31968h;
            this.f31968h = j2 - 1;
            UnsafeUtil.Q(j2, (byte) i2);
        }

        private void S0(int i2) {
            long j2 = this.f31968h;
            this.f31968h = j2 - 1;
            UnsafeUtil.Q(j2, (byte) (i2 >>> 14));
            long j3 = this.f31968h;
            this.f31968h = j3 - 1;
            UnsafeUtil.Q(j3, (byte) (((i2 >>> 7) & 127) | 128));
            long j4 = this.f31968h;
            this.f31968h = j4 - 1;
            UnsafeUtil.Q(j4, (byte) ((i2 & 127) | 128));
        }

        private void T0(int i2) {
            long j2 = this.f31968h;
            this.f31968h = j2 - 1;
            UnsafeUtil.Q(j2, (byte) (i2 >>> 7));
            long j3 = this.f31968h;
            this.f31968h = j3 - 1;
            UnsafeUtil.Q(j3, (byte) ((i2 & 127) | 128));
        }

        private void U0(long j2) {
            long j3 = this.f31968h;
            this.f31968h = j3 - 1;
            UnsafeUtil.Q(j3, (byte) ((int) (j2 >>> 49)));
            long j4 = this.f31968h;
            this.f31968h = j4 - 1;
            UnsafeUtil.Q(j4, (byte) ((int) (((j2 >>> 42) & 127) | 128)));
            long j5 = this.f31968h;
            this.f31968h = j5 - 1;
            UnsafeUtil.Q(j5, (byte) ((int) (((j2 >>> 35) & 127) | 128)));
            long j6 = this.f31968h;
            this.f31968h = j6 - 1;
            UnsafeUtil.Q(j6, (byte) ((int) (((j2 >>> 28) & 127) | 128)));
            long j7 = this.f31968h;
            this.f31968h = j7 - 1;
            UnsafeUtil.Q(j7, (byte) ((int) (((j2 >>> 21) & 127) | 128)));
            long j8 = this.f31968h;
            this.f31968h = j8 - 1;
            UnsafeUtil.Q(j8, (byte) ((int) (((j2 >>> 14) & 127) | 128)));
            long j9 = this.f31968h;
            this.f31968h = j9 - 1;
            UnsafeUtil.Q(j9, (byte) ((int) (((j2 >>> 7) & 127) | 128)));
            long j10 = this.f31968h;
            this.f31968h = j10 - 1;
            UnsafeUtil.Q(j10, (byte) ((int) ((j2 & 127) | 128)));
        }

        private void V0(long j2) {
            long j3 = this.f31968h;
            this.f31968h = j3 - 1;
            UnsafeUtil.Q(j3, (byte) ((int) (j2 >>> 28)));
            long j4 = this.f31968h;
            this.f31968h = j4 - 1;
            UnsafeUtil.Q(j4, (byte) ((int) (((j2 >>> 21) & 127) | 128)));
            long j5 = this.f31968h;
            this.f31968h = j5 - 1;
            UnsafeUtil.Q(j5, (byte) ((int) (((j2 >>> 14) & 127) | 128)));
            long j6 = this.f31968h;
            this.f31968h = j6 - 1;
            UnsafeUtil.Q(j6, (byte) ((int) (((j2 >>> 7) & 127) | 128)));
            long j7 = this.f31968h;
            this.f31968h = j7 - 1;
            UnsafeUtil.Q(j7, (byte) ((int) ((j2 & 127) | 128)));
        }

        private void W0(long j2) {
            long j3 = this.f31968h;
            this.f31968h = j3 - 1;
            UnsafeUtil.Q(j3, (byte) ((int) (j2 >>> 21)));
            long j4 = this.f31968h;
            this.f31968h = j4 - 1;
            UnsafeUtil.Q(j4, (byte) ((int) (((j2 >>> 14) & 127) | 128)));
            long j5 = this.f31968h;
            this.f31968h = j5 - 1;
            UnsafeUtil.Q(j5, (byte) ((int) (((j2 >>> 7) & 127) | 128)));
            long j6 = this.f31968h;
            this.f31968h = j6 - 1;
            UnsafeUtil.Q(j6, (byte) ((int) ((j2 & 127) | 128)));
        }

        private void X0(long j2) {
            long j3 = this.f31968h;
            this.f31968h = j3 - 1;
            UnsafeUtil.Q(j3, (byte) ((int) (j2 >>> 56)));
            long j4 = this.f31968h;
            this.f31968h = j4 - 1;
            UnsafeUtil.Q(j4, (byte) ((int) (((j2 >>> 49) & 127) | 128)));
            long j5 = this.f31968h;
            this.f31968h = j5 - 1;
            UnsafeUtil.Q(j5, (byte) ((int) (((j2 >>> 42) & 127) | 128)));
            long j6 = this.f31968h;
            this.f31968h = j6 - 1;
            UnsafeUtil.Q(j6, (byte) ((int) (((j2 >>> 35) & 127) | 128)));
            long j7 = this.f31968h;
            this.f31968h = j7 - 1;
            UnsafeUtil.Q(j7, (byte) ((int) (((j2 >>> 28) & 127) | 128)));
            long j8 = this.f31968h;
            this.f31968h = j8 - 1;
            UnsafeUtil.Q(j8, (byte) ((int) (((j2 >>> 21) & 127) | 128)));
            long j9 = this.f31968h;
            this.f31968h = j9 - 1;
            UnsafeUtil.Q(j9, (byte) ((int) (((j2 >>> 14) & 127) | 128)));
            long j10 = this.f31968h;
            this.f31968h = j10 - 1;
            UnsafeUtil.Q(j10, (byte) ((int) (((j2 >>> 7) & 127) | 128)));
            long j11 = this.f31968h;
            this.f31968h = j11 - 1;
            UnsafeUtil.Q(j11, (byte) ((int) ((j2 & 127) | 128)));
        }

        private void Y0(long j2) {
            long j3 = this.f31968h;
            this.f31968h = j3 - 1;
            UnsafeUtil.Q(j3, (byte) ((int) j2));
        }

        private void Z0(long j2) {
            long j3 = this.f31968h;
            this.f31968h = j3 - 1;
            UnsafeUtil.Q(j3, (byte) ((int) (j2 >>> 42)));
            long j4 = this.f31968h;
            this.f31968h = j4 - 1;
            UnsafeUtil.Q(j4, (byte) ((int) (((j2 >>> 35) & 127) | 128)));
            long j5 = this.f31968h;
            this.f31968h = j5 - 1;
            UnsafeUtil.Q(j5, (byte) ((int) (((j2 >>> 28) & 127) | 128)));
            long j6 = this.f31968h;
            this.f31968h = j6 - 1;
            UnsafeUtil.Q(j6, (byte) ((int) (((j2 >>> 21) & 127) | 128)));
            long j7 = this.f31968h;
            this.f31968h = j7 - 1;
            UnsafeUtil.Q(j7, (byte) ((int) (((j2 >>> 14) & 127) | 128)));
            long j8 = this.f31968h;
            this.f31968h = j8 - 1;
            UnsafeUtil.Q(j8, (byte) ((int) (((j2 >>> 7) & 127) | 128)));
            long j9 = this.f31968h;
            this.f31968h = j9 - 1;
            UnsafeUtil.Q(j9, (byte) ((int) ((j2 & 127) | 128)));
        }

        private void a1(long j2) {
            long j3 = this.f31968h;
            this.f31968h = j3 - 1;
            UnsafeUtil.Q(j3, (byte) ((int) (j2 >>> 35)));
            long j4 = this.f31968h;
            this.f31968h = j4 - 1;
            UnsafeUtil.Q(j4, (byte) ((int) (((j2 >>> 28) & 127) | 128)));
            long j5 = this.f31968h;
            this.f31968h = j5 - 1;
            UnsafeUtil.Q(j5, (byte) ((int) (((j2 >>> 21) & 127) | 128)));
            long j6 = this.f31968h;
            this.f31968h = j6 - 1;
            UnsafeUtil.Q(j6, (byte) ((int) (((j2 >>> 14) & 127) | 128)));
            long j7 = this.f31968h;
            this.f31968h = j7 - 1;
            UnsafeUtil.Q(j7, (byte) ((int) (((j2 >>> 7) & 127) | 128)));
            long j8 = this.f31968h;
            this.f31968h = j8 - 1;
            UnsafeUtil.Q(j8, (byte) ((int) ((j2 & 127) | 128)));
        }

        private void b1(long j2) {
            long j3 = this.f31968h;
            this.f31968h = j3 - 1;
            UnsafeUtil.Q(j3, (byte) ((int) (j2 >>> 63)));
            long j4 = this.f31968h;
            this.f31968h = j4 - 1;
            UnsafeUtil.Q(j4, (byte) ((int) (((j2 >>> 56) & 127) | 128)));
            long j5 = this.f31968h;
            this.f31968h = j5 - 1;
            UnsafeUtil.Q(j5, (byte) ((int) (((j2 >>> 49) & 127) | 128)));
            long j6 = this.f31968h;
            this.f31968h = j6 - 1;
            UnsafeUtil.Q(j6, (byte) ((int) (((j2 >>> 42) & 127) | 128)));
            long j7 = this.f31968h;
            this.f31968h = j7 - 1;
            UnsafeUtil.Q(j7, (byte) ((int) (((j2 >>> 35) & 127) | 128)));
            long j8 = this.f31968h;
            this.f31968h = j8 - 1;
            UnsafeUtil.Q(j8, (byte) ((int) (((j2 >>> 28) & 127) | 128)));
            long j9 = this.f31968h;
            this.f31968h = j9 - 1;
            UnsafeUtil.Q(j9, (byte) ((int) (((j2 >>> 21) & 127) | 128)));
            long j10 = this.f31968h;
            this.f31968h = j10 - 1;
            UnsafeUtil.Q(j10, (byte) ((int) (((j2 >>> 14) & 127) | 128)));
            long j11 = this.f31968h;
            this.f31968h = j11 - 1;
            UnsafeUtil.Q(j11, (byte) ((int) (((j2 >>> 7) & 127) | 128)));
            long j12 = this.f31968h;
            this.f31968h = j12 - 1;
            UnsafeUtil.Q(j12, (byte) ((int) ((j2 & 127) | 128)));
        }

        private void c1(long j2) {
            long j3 = this.f31968h;
            this.f31968h = j3 - 1;
            UnsafeUtil.Q(j3, (byte) (((int) j2) >>> 14));
            long j4 = this.f31968h;
            this.f31968h = j4 - 1;
            UnsafeUtil.Q(j4, (byte) ((int) (((j2 >>> 7) & 127) | 128)));
            long j5 = this.f31968h;
            this.f31968h = j5 - 1;
            UnsafeUtil.Q(j5, (byte) ((int) ((j2 & 127) | 128)));
        }

        private void d1(long j2) {
            long j3 = this.f31968h;
            this.f31968h = j3 - 1;
            UnsafeUtil.Q(j3, (byte) ((int) (j2 >>> 7)));
            long j4 = this.f31968h;
            this.f31968h = j4 - 1;
            UnsafeUtil.Q(j4, (byte) ((((int) j2) & 127) | 128));
        }

        public void A(int i2, long j2) {
            a0(15);
            F0(j2);
            z0(i2, 0);
        }

        public void B(int i2, Object obj) {
            int l2 = l();
            Protobuf.a().e(obj, this);
            a0(10);
            E0(l() - l2);
            z0(i2, 2);
        }

        public void E(int i2, boolean z2) {
            a0(6);
            N0(z2 ? (byte) 1 : 0);
            z0(i2, 0);
        }

        public void E0(int i2) {
            if ((i2 & -128) == 0) {
                R0(i2);
            } else if ((i2 & -16384) == 0) {
                T0(i2);
            } else if ((-2097152 & i2) == 0) {
                S0(i2);
            } else if ((-268435456 & i2) == 0) {
                Q0(i2);
            } else {
                P0(i2);
            }
        }

        public void F0(long j2) {
            switch (BinaryWriter.k(j2)) {
                case 1:
                    Y0(j2);
                    return;
                case 2:
                    d1(j2);
                    return;
                case 3:
                    c1(j2);
                    return;
                case 4:
                    W0(j2);
                    return;
                case 5:
                    V0(j2);
                    return;
                case 6:
                    a1(j2);
                    return;
                case 7:
                    Z0(j2);
                    return;
                case 8:
                    U0(j2);
                    return;
                case 9:
                    X0(j2);
                    return;
                case 10:
                    b1(j2);
                    return;
                default:
                    return;
            }
        }

        public void G(int i2) {
            z0(i2, 3);
        }

        public final int G0() {
            return (int) (this.f31968h - this.f31966f);
        }

        public void I0() {
            if (this.f31965e != null) {
                this.f31953d += H0();
                ByteBuffer byteBuffer = (ByteBuffer) this.f31965e.position(G0() + 1);
                this.f31965e = null;
                this.f31968h = 0;
                this.f31967g = 0;
            }
        }

        public void N0(byte b2) {
            long j2 = this.f31968h;
            this.f31968h = j2 - 1;
            UnsafeUtil.Q(j2, b2);
        }

        public void O(int i2, long j2) {
            a0(15);
            w0(j2);
            z0(i2, 0);
        }

        public void O0(String str) {
            char charAt;
            a0(str.length());
            int length = str.length();
            while (true) {
                length--;
                if (length >= 0 && (charAt = str.charAt(length)) < 128) {
                    long j2 = this.f31968h;
                    this.f31968h = j2 - 1;
                    UnsafeUtil.Q(j2, (byte) charAt);
                }
            }
            if (length != -1) {
                while (length >= 0) {
                    char charAt2 = str.charAt(length);
                    if (charAt2 < 128) {
                        long j3 = this.f31968h;
                        if (j3 >= this.f31966f) {
                            this.f31968h = j3 - 1;
                            UnsafeUtil.Q(j3, (byte) charAt2);
                            length--;
                        }
                    }
                    if (charAt2 < 2048) {
                        long j4 = this.f31968h;
                        if (j4 > this.f31966f) {
                            this.f31968h = j4 - 1;
                            UnsafeUtil.Q(j4, (byte) ((charAt2 & '?') | 128));
                            long j5 = this.f31968h;
                            this.f31968h = j5 - 1;
                            UnsafeUtil.Q(j5, (byte) ((charAt2 >>> 6) | 960));
                            length--;
                        }
                    }
                    if (charAt2 < 55296 || 57343 < charAt2) {
                        long j6 = this.f31968h;
                        if (j6 > this.f31966f + 1) {
                            this.f31968h = j6 - 1;
                            UnsafeUtil.Q(j6, (byte) ((charAt2 & '?') | 128));
                            long j7 = this.f31968h;
                            this.f31968h = j7 - 1;
                            UnsafeUtil.Q(j7, (byte) (((charAt2 >>> 6) & 63) | 128));
                            long j8 = this.f31968h;
                            this.f31968h = j8 - 1;
                            UnsafeUtil.Q(j8, (byte) ((charAt2 >>> 12) | 480));
                            length--;
                        }
                    }
                    if (this.f31968h > this.f31966f + 2) {
                        if (length != 0) {
                            char charAt3 = str.charAt(length - 1);
                            if (Character.isSurrogatePair(charAt3, charAt2)) {
                                length--;
                                int codePoint = Character.toCodePoint(charAt3, charAt2);
                                long j9 = this.f31968h;
                                this.f31968h = j9 - 1;
                                UnsafeUtil.Q(j9, (byte) ((codePoint & 63) | 128));
                                long j10 = this.f31968h;
                                this.f31968h = j10 - 1;
                                UnsafeUtil.Q(j10, (byte) (((codePoint >>> 6) & 63) | 128));
                                long j11 = this.f31968h;
                                this.f31968h = j11 - 1;
                                UnsafeUtil.Q(j11, (byte) (((codePoint >>> 12) & 63) | 128));
                                long j12 = this.f31968h;
                                this.f31968h = j12 - 1;
                                UnsafeUtil.Q(j12, (byte) ((codePoint >>> 18) | 240));
                            }
                        }
                        throw new Utf8.UnpairedSurrogateException(length - 1, length);
                    }
                    a0(length);
                    length++;
                    length--;
                }
            }
        }

        public void Q(int i2) {
            z0(i2, 4);
        }

        public void W(int i2, int i3) {
            a0(10);
            t0(i3);
            z0(i2, 0);
        }

        public void a0(int i2) {
            if (M0() < i2) {
                K0(i2);
            }
        }

        public void b0(boolean z2) {
            N0(z2 ? (byte) 1 : 0);
        }

        public void c(int i2, Object obj, Schema schema) {
            int l2 = l();
            schema.h(obj, this);
            a0(10);
            E0(l() - l2);
            z0(i2, 2);
        }

        public void d(int i2, Object obj, Schema schema) {
            z0(i2, 4);
            schema.h(obj, this);
            z0(i2, 3);
        }

        public void e(int i2, ByteString byteString) {
            try {
                byteString.a0(this);
                a0(10);
                E0(byteString.size());
                z0(i2, 2);
            } catch (IOException e2) {
                throw new RuntimeException(e2);
            }
        }

        public void g(byte[] bArr, int i2, int i3) {
            if (M0() < i3) {
                K0(i3);
            }
            this.f31968h -= (long) i3;
            ByteBuffer byteBuffer = (ByteBuffer) this.f31965e.position(G0() + 1);
            this.f31965e.put(bArr, i2, i3);
        }

        public void g0(int i2) {
            long j2 = this.f31968h;
            this.f31968h = j2 - 1;
            UnsafeUtil.Q(j2, (byte) ((i2 >> 24) & 255));
            long j3 = this.f31968h;
            this.f31968h = j3 - 1;
            UnsafeUtil.Q(j3, (byte) ((i2 >> 16) & 255));
            long j4 = this.f31968h;
            this.f31968h = j4 - 1;
            UnsafeUtil.Q(j4, (byte) ((i2 >> 8) & 255));
            long j5 = this.f31968h;
            this.f31968h = j5 - 1;
            UnsafeUtil.Q(j5, (byte) (i2 & 255));
        }

        public void h(ByteBuffer byteBuffer) {
            int remaining = byteBuffer.remaining();
            if (M0() < remaining) {
                this.f31953d += remaining;
                this.f31952c.addFirst(AllocatedBuffer.i(byteBuffer));
                J0();
                return;
            }
            this.f31968h -= (long) remaining;
            ByteBuffer byteBuffer2 = (ByteBuffer) this.f31965e.position(G0() + 1);
            this.f31965e.put(byteBuffer);
        }

        public void i(byte[] bArr, int i2, int i3) {
            if (M0() < i3) {
                this.f31953d += i3;
                this.f31952c.addFirst(AllocatedBuffer.k(bArr, i2, i3));
                J0();
                return;
            }
            this.f31968h -= (long) i3;
            ByteBuffer byteBuffer = (ByteBuffer) this.f31965e.position(G0() + 1);
            this.f31965e.put(bArr, i2, i3);
        }

        public void j0(long j2) {
            long j3 = this.f31968h;
            this.f31968h = j3 - 1;
            UnsafeUtil.Q(j3, (byte) (((int) (j2 >> 56)) & 255));
            long j4 = this.f31968h;
            this.f31968h = j4 - 1;
            UnsafeUtil.Q(j4, (byte) (((int) (j2 >> 48)) & 255));
            long j5 = this.f31968h;
            this.f31968h = j5 - 1;
            UnsafeUtil.Q(j5, (byte) (((int) (j2 >> 40)) & 255));
            long j6 = this.f31968h;
            this.f31968h = j6 - 1;
            UnsafeUtil.Q(j6, (byte) (((int) (j2 >> 32)) & 255));
            long j7 = this.f31968h;
            this.f31968h = j7 - 1;
            UnsafeUtil.Q(j7, (byte) (((int) (j2 >> 24)) & 255));
            long j8 = this.f31968h;
            this.f31968h = j8 - 1;
            UnsafeUtil.Q(j8, (byte) (((int) (j2 >> 16)) & 255));
            long j9 = this.f31968h;
            this.f31968h = j9 - 1;
            UnsafeUtil.Q(j9, (byte) (((int) (j2 >> 8)) & 255));
            long j10 = this.f31968h;
            this.f31968h = j10 - 1;
            UnsafeUtil.Q(j10, (byte) (((int) j2) & 255));
        }

        public int l() {
            return this.f31953d + H0();
        }

        public void o(int i2, int i3) {
            a0(15);
            o0(i3);
            z0(i2, 0);
        }

        public void o0(int i2) {
            if (i2 >= 0) {
                E0(i2);
            } else {
                F0((long) i2);
            }
        }

        public void q(int i2, int i3) {
            a0(10);
            E0(i3);
            z0(i2, 0);
        }

        public void s(int i2, int i3) {
            a0(9);
            g0(i3);
            z0(i2, 5);
        }

        public void t0(int i2) {
            E0(CodedOutputStream.Q0(i2));
        }

        public void w(int i2, long j2) {
            a0(13);
            j0(j2);
            z0(i2, 1);
        }

        public void w0(long j2) {
            F0(CodedOutputStream.R0(j2));
        }

        public void z(int i2, String str) {
            int l2 = l();
            O0(str);
            a0(10);
            E0(l() - l2);
            z0(i2, 2);
        }

        public void z0(int i2, int i3) {
            E0(WireFormat.c(i2, i3));
        }
    }

    public static final class UnsafeHeapWriter extends BinaryWriter {

        /* renamed from: e  reason: collision with root package name */
        public AllocatedBuffer f31969e;

        /* renamed from: f  reason: collision with root package name */
        public byte[] f31970f;

        /* renamed from: g  reason: collision with root package name */
        public long f31971g;

        /* renamed from: h  reason: collision with root package name */
        public long f31972h;

        /* renamed from: i  reason: collision with root package name */
        public long f31973i;

        /* renamed from: j  reason: collision with root package name */
        public long f31974j;

        /* renamed from: k  reason: collision with root package name */
        public long f31975k;

        private void J0() {
            L0(Y());
        }

        private void K0(int i2) {
            L0(Z(i2));
        }

        private void L0(AllocatedBuffer allocatedBuffer) {
            if (allocatedBuffer.c()) {
                I0();
                this.f31952c.addFirst(allocatedBuffer);
                this.f31969e = allocatedBuffer;
                this.f31970f = allocatedBuffer.a();
                long b2 = (long) allocatedBuffer.b();
                this.f31972h = ((long) allocatedBuffer.e()) + b2;
                long g2 = b2 + ((long) allocatedBuffer.g());
                this.f31971g = g2;
                this.f31973i = g2 - 1;
                long j2 = this.f31972h - 1;
                this.f31974j = j2;
                this.f31975k = j2;
                return;
            }
            throw new RuntimeException("Allocator returned non-heap buffer");
        }

        private void P0(int i2) {
            byte[] bArr = this.f31970f;
            long j2 = this.f31975k;
            this.f31975k = j2 - 1;
            UnsafeUtil.R(bArr, j2, (byte) (i2 >>> 28));
            byte[] bArr2 = this.f31970f;
            long j3 = this.f31975k;
            this.f31975k = j3 - 1;
            UnsafeUtil.R(bArr2, j3, (byte) (((i2 >>> 21) & 127) | 128));
            byte[] bArr3 = this.f31970f;
            long j4 = this.f31975k;
            this.f31975k = j4 - 1;
            UnsafeUtil.R(bArr3, j4, (byte) (((i2 >>> 14) & 127) | 128));
            byte[] bArr4 = this.f31970f;
            long j5 = this.f31975k;
            this.f31975k = j5 - 1;
            UnsafeUtil.R(bArr4, j5, (byte) (((i2 >>> 7) & 127) | 128));
            byte[] bArr5 = this.f31970f;
            long j6 = this.f31975k;
            this.f31975k = j6 - 1;
            UnsafeUtil.R(bArr5, j6, (byte) ((i2 & 127) | 128));
        }

        private void Q0(int i2) {
            byte[] bArr = this.f31970f;
            long j2 = this.f31975k;
            this.f31975k = j2 - 1;
            UnsafeUtil.R(bArr, j2, (byte) (i2 >>> 21));
            byte[] bArr2 = this.f31970f;
            long j3 = this.f31975k;
            this.f31975k = j3 - 1;
            UnsafeUtil.R(bArr2, j3, (byte) (((i2 >>> 14) & 127) | 128));
            byte[] bArr3 = this.f31970f;
            long j4 = this.f31975k;
            this.f31975k = j4 - 1;
            UnsafeUtil.R(bArr3, j4, (byte) (((i2 >>> 7) & 127) | 128));
            byte[] bArr4 = this.f31970f;
            long j5 = this.f31975k;
            this.f31975k = j5 - 1;
            UnsafeUtil.R(bArr4, j5, (byte) ((i2 & 127) | 128));
        }

        private void R0(int i2) {
            byte[] bArr = this.f31970f;
            long j2 = this.f31975k;
            this.f31975k = j2 - 1;
            UnsafeUtil.R(bArr, j2, (byte) i2);
        }

        private void S0(int i2) {
            byte[] bArr = this.f31970f;
            long j2 = this.f31975k;
            this.f31975k = j2 - 1;
            UnsafeUtil.R(bArr, j2, (byte) (i2 >>> 14));
            byte[] bArr2 = this.f31970f;
            long j3 = this.f31975k;
            this.f31975k = j3 - 1;
            UnsafeUtil.R(bArr2, j3, (byte) (((i2 >>> 7) & 127) | 128));
            byte[] bArr3 = this.f31970f;
            long j4 = this.f31975k;
            this.f31975k = j4 - 1;
            UnsafeUtil.R(bArr3, j4, (byte) ((i2 & 127) | 128));
        }

        private void T0(int i2) {
            byte[] bArr = this.f31970f;
            long j2 = this.f31975k;
            this.f31975k = j2 - 1;
            UnsafeUtil.R(bArr, j2, (byte) (i2 >>> 7));
            byte[] bArr2 = this.f31970f;
            long j3 = this.f31975k;
            this.f31975k = j3 - 1;
            UnsafeUtil.R(bArr2, j3, (byte) ((i2 & 127) | 128));
        }

        private void U0(long j2) {
            byte[] bArr = this.f31970f;
            long j3 = this.f31975k;
            this.f31975k = j3 - 1;
            UnsafeUtil.R(bArr, j3, (byte) ((int) (j2 >>> 49)));
            byte[] bArr2 = this.f31970f;
            long j4 = this.f31975k;
            this.f31975k = j4 - 1;
            UnsafeUtil.R(bArr2, j4, (byte) ((int) (((j2 >>> 42) & 127) | 128)));
            byte[] bArr3 = this.f31970f;
            long j5 = this.f31975k;
            this.f31975k = j5 - 1;
            UnsafeUtil.R(bArr3, j5, (byte) ((int) (((j2 >>> 35) & 127) | 128)));
            byte[] bArr4 = this.f31970f;
            long j6 = this.f31975k;
            this.f31975k = j6 - 1;
            UnsafeUtil.R(bArr4, j6, (byte) ((int) (((j2 >>> 28) & 127) | 128)));
            byte[] bArr5 = this.f31970f;
            long j7 = this.f31975k;
            this.f31975k = j7 - 1;
            UnsafeUtil.R(bArr5, j7, (byte) ((int) (((j2 >>> 21) & 127) | 128)));
            byte[] bArr6 = this.f31970f;
            long j8 = this.f31975k;
            this.f31975k = j8 - 1;
            UnsafeUtil.R(bArr6, j8, (byte) ((int) (((j2 >>> 14) & 127) | 128)));
            byte[] bArr7 = this.f31970f;
            long j9 = this.f31975k;
            this.f31975k = j9 - 1;
            UnsafeUtil.R(bArr7, j9, (byte) ((int) (((j2 >>> 7) & 127) | 128)));
            byte[] bArr8 = this.f31970f;
            long j10 = this.f31975k;
            this.f31975k = j10 - 1;
            UnsafeUtil.R(bArr8, j10, (byte) ((int) ((j2 & 127) | 128)));
        }

        private void V0(long j2) {
            byte[] bArr = this.f31970f;
            long j3 = this.f31975k;
            this.f31975k = j3 - 1;
            UnsafeUtil.R(bArr, j3, (byte) ((int) (j2 >>> 28)));
            byte[] bArr2 = this.f31970f;
            long j4 = this.f31975k;
            this.f31975k = j4 - 1;
            UnsafeUtil.R(bArr2, j4, (byte) ((int) (((j2 >>> 21) & 127) | 128)));
            byte[] bArr3 = this.f31970f;
            long j5 = this.f31975k;
            this.f31975k = j5 - 1;
            UnsafeUtil.R(bArr3, j5, (byte) ((int) (((j2 >>> 14) & 127) | 128)));
            byte[] bArr4 = this.f31970f;
            long j6 = this.f31975k;
            this.f31975k = j6 - 1;
            UnsafeUtil.R(bArr4, j6, (byte) ((int) (((j2 >>> 7) & 127) | 128)));
            byte[] bArr5 = this.f31970f;
            long j7 = this.f31975k;
            this.f31975k = j7 - 1;
            UnsafeUtil.R(bArr5, j7, (byte) ((int) ((j2 & 127) | 128)));
        }

        private void W0(long j2) {
            byte[] bArr = this.f31970f;
            long j3 = this.f31975k;
            this.f31975k = j3 - 1;
            UnsafeUtil.R(bArr, j3, (byte) ((int) (j2 >>> 21)));
            byte[] bArr2 = this.f31970f;
            long j4 = this.f31975k;
            this.f31975k = j4 - 1;
            UnsafeUtil.R(bArr2, j4, (byte) ((int) (((j2 >>> 14) & 127) | 128)));
            byte[] bArr3 = this.f31970f;
            long j5 = this.f31975k;
            this.f31975k = j5 - 1;
            UnsafeUtil.R(bArr3, j5, (byte) ((int) (((j2 >>> 7) & 127) | 128)));
            byte[] bArr4 = this.f31970f;
            long j6 = this.f31975k;
            this.f31975k = j6 - 1;
            UnsafeUtil.R(bArr4, j6, (byte) ((int) ((j2 & 127) | 128)));
        }

        private void X0(long j2) {
            byte[] bArr = this.f31970f;
            long j3 = this.f31975k;
            this.f31975k = j3 - 1;
            UnsafeUtil.R(bArr, j3, (byte) ((int) (j2 >>> 56)));
            byte[] bArr2 = this.f31970f;
            long j4 = this.f31975k;
            this.f31975k = j4 - 1;
            UnsafeUtil.R(bArr2, j4, (byte) ((int) (((j2 >>> 49) & 127) | 128)));
            byte[] bArr3 = this.f31970f;
            long j5 = this.f31975k;
            this.f31975k = j5 - 1;
            UnsafeUtil.R(bArr3, j5, (byte) ((int) (((j2 >>> 42) & 127) | 128)));
            byte[] bArr4 = this.f31970f;
            long j6 = this.f31975k;
            this.f31975k = j6 - 1;
            UnsafeUtil.R(bArr4, j6, (byte) ((int) (((j2 >>> 35) & 127) | 128)));
            byte[] bArr5 = this.f31970f;
            long j7 = this.f31975k;
            this.f31975k = j7 - 1;
            UnsafeUtil.R(bArr5, j7, (byte) ((int) (((j2 >>> 28) & 127) | 128)));
            byte[] bArr6 = this.f31970f;
            long j8 = this.f31975k;
            this.f31975k = j8 - 1;
            UnsafeUtil.R(bArr6, j8, (byte) ((int) (((j2 >>> 21) & 127) | 128)));
            byte[] bArr7 = this.f31970f;
            long j9 = this.f31975k;
            this.f31975k = j9 - 1;
            UnsafeUtil.R(bArr7, j9, (byte) ((int) (((j2 >>> 14) & 127) | 128)));
            byte[] bArr8 = this.f31970f;
            long j10 = this.f31975k;
            this.f31975k = j10 - 1;
            UnsafeUtil.R(bArr8, j10, (byte) ((int) (((j2 >>> 7) & 127) | 128)));
            byte[] bArr9 = this.f31970f;
            long j11 = this.f31975k;
            this.f31975k = j11 - 1;
            UnsafeUtil.R(bArr9, j11, (byte) ((int) ((j2 & 127) | 128)));
        }

        private void Y0(long j2) {
            byte[] bArr = this.f31970f;
            long j3 = this.f31975k;
            this.f31975k = j3 - 1;
            UnsafeUtil.R(bArr, j3, (byte) ((int) j2));
        }

        private void Z0(long j2) {
            byte[] bArr = this.f31970f;
            long j3 = this.f31975k;
            this.f31975k = j3 - 1;
            UnsafeUtil.R(bArr, j3, (byte) ((int) (j2 >>> 42)));
            byte[] bArr2 = this.f31970f;
            long j4 = this.f31975k;
            this.f31975k = j4 - 1;
            UnsafeUtil.R(bArr2, j4, (byte) ((int) (((j2 >>> 35) & 127) | 128)));
            byte[] bArr3 = this.f31970f;
            long j5 = this.f31975k;
            this.f31975k = j5 - 1;
            UnsafeUtil.R(bArr3, j5, (byte) ((int) (((j2 >>> 28) & 127) | 128)));
            byte[] bArr4 = this.f31970f;
            long j6 = this.f31975k;
            this.f31975k = j6 - 1;
            UnsafeUtil.R(bArr4, j6, (byte) ((int) (((j2 >>> 21) & 127) | 128)));
            byte[] bArr5 = this.f31970f;
            long j7 = this.f31975k;
            this.f31975k = j7 - 1;
            UnsafeUtil.R(bArr5, j7, (byte) ((int) (((j2 >>> 14) & 127) | 128)));
            byte[] bArr6 = this.f31970f;
            long j8 = this.f31975k;
            this.f31975k = j8 - 1;
            UnsafeUtil.R(bArr6, j8, (byte) ((int) (((j2 >>> 7) & 127) | 128)));
            byte[] bArr7 = this.f31970f;
            long j9 = this.f31975k;
            this.f31975k = j9 - 1;
            UnsafeUtil.R(bArr7, j9, (byte) ((int) ((j2 & 127) | 128)));
        }

        private void a1(long j2) {
            byte[] bArr = this.f31970f;
            long j3 = this.f31975k;
            this.f31975k = j3 - 1;
            UnsafeUtil.R(bArr, j3, (byte) ((int) (j2 >>> 35)));
            byte[] bArr2 = this.f31970f;
            long j4 = this.f31975k;
            this.f31975k = j4 - 1;
            UnsafeUtil.R(bArr2, j4, (byte) ((int) (((j2 >>> 28) & 127) | 128)));
            byte[] bArr3 = this.f31970f;
            long j5 = this.f31975k;
            this.f31975k = j5 - 1;
            UnsafeUtil.R(bArr3, j5, (byte) ((int) (((j2 >>> 21) & 127) | 128)));
            byte[] bArr4 = this.f31970f;
            long j6 = this.f31975k;
            this.f31975k = j6 - 1;
            UnsafeUtil.R(bArr4, j6, (byte) ((int) (((j2 >>> 14) & 127) | 128)));
            byte[] bArr5 = this.f31970f;
            long j7 = this.f31975k;
            this.f31975k = j7 - 1;
            UnsafeUtil.R(bArr5, j7, (byte) ((int) (((j2 >>> 7) & 127) | 128)));
            byte[] bArr6 = this.f31970f;
            long j8 = this.f31975k;
            this.f31975k = j8 - 1;
            UnsafeUtil.R(bArr6, j8, (byte) ((int) ((j2 & 127) | 128)));
        }

        private void b1(long j2) {
            byte[] bArr = this.f31970f;
            long j3 = this.f31975k;
            this.f31975k = j3 - 1;
            UnsafeUtil.R(bArr, j3, (byte) ((int) (j2 >>> 63)));
            byte[] bArr2 = this.f31970f;
            long j4 = this.f31975k;
            this.f31975k = j4 - 1;
            UnsafeUtil.R(bArr2, j4, (byte) ((int) (((j2 >>> 56) & 127) | 128)));
            byte[] bArr3 = this.f31970f;
            long j5 = this.f31975k;
            this.f31975k = j5 - 1;
            UnsafeUtil.R(bArr3, j5, (byte) ((int) (((j2 >>> 49) & 127) | 128)));
            byte[] bArr4 = this.f31970f;
            long j6 = this.f31975k;
            this.f31975k = j6 - 1;
            UnsafeUtil.R(bArr4, j6, (byte) ((int) (((j2 >>> 42) & 127) | 128)));
            byte[] bArr5 = this.f31970f;
            long j7 = this.f31975k;
            this.f31975k = j7 - 1;
            UnsafeUtil.R(bArr5, j7, (byte) ((int) (((j2 >>> 35) & 127) | 128)));
            byte[] bArr6 = this.f31970f;
            long j8 = this.f31975k;
            this.f31975k = j8 - 1;
            UnsafeUtil.R(bArr6, j8, (byte) ((int) (((j2 >>> 28) & 127) | 128)));
            byte[] bArr7 = this.f31970f;
            long j9 = this.f31975k;
            this.f31975k = j9 - 1;
            UnsafeUtil.R(bArr7, j9, (byte) ((int) (((j2 >>> 21) & 127) | 128)));
            byte[] bArr8 = this.f31970f;
            long j10 = this.f31975k;
            this.f31975k = j10 - 1;
            UnsafeUtil.R(bArr8, j10, (byte) ((int) (((j2 >>> 14) & 127) | 128)));
            byte[] bArr9 = this.f31970f;
            long j11 = this.f31975k;
            this.f31975k = j11 - 1;
            UnsafeUtil.R(bArr9, j11, (byte) ((int) (((j2 >>> 7) & 127) | 128)));
            byte[] bArr10 = this.f31970f;
            long j12 = this.f31975k;
            this.f31975k = j12 - 1;
            UnsafeUtil.R(bArr10, j12, (byte) ((int) ((j2 & 127) | 128)));
        }

        private void c1(long j2) {
            byte[] bArr = this.f31970f;
            long j3 = this.f31975k;
            this.f31975k = j3 - 1;
            UnsafeUtil.R(bArr, j3, (byte) (((int) j2) >>> 14));
            byte[] bArr2 = this.f31970f;
            long j4 = this.f31975k;
            this.f31975k = j4 - 1;
            UnsafeUtil.R(bArr2, j4, (byte) ((int) (((j2 >>> 7) & 127) | 128)));
            byte[] bArr3 = this.f31970f;
            long j5 = this.f31975k;
            this.f31975k = j5 - 1;
            UnsafeUtil.R(bArr3, j5, (byte) ((int) ((j2 & 127) | 128)));
        }

        private void d1(long j2) {
            byte[] bArr = this.f31970f;
            long j3 = this.f31975k;
            this.f31975k = j3 - 1;
            UnsafeUtil.R(bArr, j3, (byte) ((int) (j2 >>> 7)));
            byte[] bArr2 = this.f31970f;
            long j4 = this.f31975k;
            this.f31975k = j4 - 1;
            UnsafeUtil.R(bArr2, j4, (byte) ((((int) j2) & 127) | 128));
        }

        public void A(int i2, long j2) {
            a0(15);
            F0(j2);
            z0(i2, 0);
        }

        public void B(int i2, Object obj) {
            int l2 = l();
            Protobuf.a().e(obj, this);
            a0(10);
            E0(l() - l2);
            z0(i2, 2);
        }

        public void E(int i2, boolean z2) {
            a0(6);
            N0(z2 ? (byte) 1 : 0);
            z0(i2, 0);
        }

        public void E0(int i2) {
            if ((i2 & -128) == 0) {
                R0(i2);
            } else if ((i2 & -16384) == 0) {
                T0(i2);
            } else if ((-2097152 & i2) == 0) {
                S0(i2);
            } else if ((-268435456 & i2) == 0) {
                Q0(i2);
            } else {
                P0(i2);
            }
        }

        public void F0(long j2) {
            switch (BinaryWriter.k(j2)) {
                case 1:
                    Y0(j2);
                    return;
                case 2:
                    d1(j2);
                    return;
                case 3:
                    c1(j2);
                    return;
                case 4:
                    W0(j2);
                    return;
                case 5:
                    V0(j2);
                    return;
                case 6:
                    a1(j2);
                    return;
                case 7:
                    Z0(j2);
                    return;
                case 8:
                    U0(j2);
                    return;
                case 9:
                    X0(j2);
                    return;
                case 10:
                    b1(j2);
                    return;
                default:
                    return;
            }
        }

        public void G(int i2) {
            z0(i2, 3);
        }

        public final int G0() {
            return (int) this.f31975k;
        }

        public int H0() {
            return (int) (this.f31974j - this.f31975k);
        }

        public void I0() {
            if (this.f31969e != null) {
                this.f31953d += H0();
                this.f31969e.h((G0() - this.f31969e.b()) + 1);
                this.f31969e = null;
                this.f31975k = 0;
                this.f31974j = 0;
            }
        }

        public int M0() {
            return (int) (this.f31975k - this.f31973i);
        }

        public void N0(byte b2) {
            byte[] bArr = this.f31970f;
            long j2 = this.f31975k;
            this.f31975k = j2 - 1;
            UnsafeUtil.R(bArr, j2, b2);
        }

        public void O(int i2, long j2) {
            a0(15);
            w0(j2);
            z0(i2, 0);
        }

        public void O0(String str) {
            char charAt;
            a0(str.length());
            int length = str.length();
            while (true) {
                length--;
                if (length >= 0 && (charAt = str.charAt(length)) < 128) {
                    byte[] bArr = this.f31970f;
                    long j2 = this.f31975k;
                    this.f31975k = j2 - 1;
                    UnsafeUtil.R(bArr, j2, (byte) charAt);
                }
            }
            if (length != -1) {
                while (length >= 0) {
                    char charAt2 = str.charAt(length);
                    if (charAt2 < 128) {
                        long j3 = this.f31975k;
                        if (j3 > this.f31973i) {
                            byte[] bArr2 = this.f31970f;
                            this.f31975k = j3 - 1;
                            UnsafeUtil.R(bArr2, j3, (byte) charAt2);
                            length--;
                        }
                    }
                    if (charAt2 < 2048) {
                        long j4 = this.f31975k;
                        if (j4 > this.f31971g) {
                            byte[] bArr3 = this.f31970f;
                            this.f31975k = j4 - 1;
                            UnsafeUtil.R(bArr3, j4, (byte) ((charAt2 & '?') | 128));
                            byte[] bArr4 = this.f31970f;
                            long j5 = this.f31975k;
                            this.f31975k = j5 - 1;
                            UnsafeUtil.R(bArr4, j5, (byte) ((charAt2 >>> 6) | 960));
                            length--;
                        }
                    }
                    if (charAt2 < 55296 || 57343 < charAt2) {
                        long j6 = this.f31975k;
                        if (j6 > this.f31971g + 1) {
                            byte[] bArr5 = this.f31970f;
                            this.f31975k = j6 - 1;
                            UnsafeUtil.R(bArr5, j6, (byte) ((charAt2 & '?') | 128));
                            byte[] bArr6 = this.f31970f;
                            long j7 = this.f31975k;
                            this.f31975k = j7 - 1;
                            UnsafeUtil.R(bArr6, j7, (byte) (((charAt2 >>> 6) & 63) | 128));
                            byte[] bArr7 = this.f31970f;
                            long j8 = this.f31975k;
                            this.f31975k = j8 - 1;
                            UnsafeUtil.R(bArr7, j8, (byte) ((charAt2 >>> 12) | 480));
                            length--;
                        }
                    }
                    if (this.f31975k > this.f31971g + 2) {
                        if (length != 0) {
                            char charAt3 = str.charAt(length - 1);
                            if (Character.isSurrogatePair(charAt3, charAt2)) {
                                length--;
                                int codePoint = Character.toCodePoint(charAt3, charAt2);
                                byte[] bArr8 = this.f31970f;
                                long j9 = this.f31975k;
                                this.f31975k = j9 - 1;
                                UnsafeUtil.R(bArr8, j9, (byte) ((codePoint & 63) | 128));
                                byte[] bArr9 = this.f31970f;
                                long j10 = this.f31975k;
                                this.f31975k = j10 - 1;
                                UnsafeUtil.R(bArr9, j10, (byte) (((codePoint >>> 6) & 63) | 128));
                                byte[] bArr10 = this.f31970f;
                                long j11 = this.f31975k;
                                this.f31975k = j11 - 1;
                                UnsafeUtil.R(bArr10, j11, (byte) (((codePoint >>> 12) & 63) | 128));
                                byte[] bArr11 = this.f31970f;
                                long j12 = this.f31975k;
                                this.f31975k = j12 - 1;
                                UnsafeUtil.R(bArr11, j12, (byte) ((codePoint >>> 18) | 240));
                            }
                        }
                        throw new Utf8.UnpairedSurrogateException(length - 1, length);
                    }
                    a0(length);
                    length++;
                    length--;
                }
            }
        }

        public void Q(int i2) {
            z0(i2, 4);
        }

        public void W(int i2, int i3) {
            a0(10);
            t0(i3);
            z0(i2, 0);
        }

        public void a0(int i2) {
            if (M0() < i2) {
                K0(i2);
            }
        }

        public void b0(boolean z2) {
            N0(z2 ? (byte) 1 : 0);
        }

        public void c(int i2, Object obj, Schema schema) {
            int l2 = l();
            schema.h(obj, this);
            a0(10);
            E0(l() - l2);
            z0(i2, 2);
        }

        public void d(int i2, Object obj, Schema schema) {
            z0(i2, 4);
            schema.h(obj, this);
            z0(i2, 3);
        }

        public void e(int i2, ByteString byteString) {
            try {
                byteString.a0(this);
                a0(10);
                E0(byteString.size());
                z0(i2, 2);
            } catch (IOException e2) {
                throw new RuntimeException(e2);
            }
        }

        public void g(byte[] bArr, int i2, int i3) {
            if (i2 < 0 || i2 + i3 > bArr.length) {
                throw new ArrayIndexOutOfBoundsException(String.format("value.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i2), Integer.valueOf(i3)}));
            }
            a0(i3);
            this.f31975k -= (long) i3;
            System.arraycopy(bArr, i2, this.f31970f, G0() + 1, i3);
        }

        public void g0(int i2) {
            byte[] bArr = this.f31970f;
            long j2 = this.f31975k;
            this.f31975k = j2 - 1;
            UnsafeUtil.R(bArr, j2, (byte) ((i2 >> 24) & 255));
            byte[] bArr2 = this.f31970f;
            long j3 = this.f31975k;
            this.f31975k = j3 - 1;
            UnsafeUtil.R(bArr2, j3, (byte) ((i2 >> 16) & 255));
            byte[] bArr3 = this.f31970f;
            long j4 = this.f31975k;
            this.f31975k = j4 - 1;
            UnsafeUtil.R(bArr3, j4, (byte) ((i2 >> 8) & 255));
            byte[] bArr4 = this.f31970f;
            long j5 = this.f31975k;
            this.f31975k = j5 - 1;
            UnsafeUtil.R(bArr4, j5, (byte) (i2 & 255));
        }

        public void h(ByteBuffer byteBuffer) {
            int remaining = byteBuffer.remaining();
            if (M0() < remaining) {
                this.f31953d += remaining;
                this.f31952c.addFirst(AllocatedBuffer.i(byteBuffer));
                J0();
            }
            this.f31975k -= (long) remaining;
            byteBuffer.get(this.f31970f, G0() + 1, remaining);
        }

        public void i(byte[] bArr, int i2, int i3) {
            if (i2 < 0 || i2 + i3 > bArr.length) {
                throw new ArrayIndexOutOfBoundsException(String.format("value.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i2), Integer.valueOf(i3)}));
            } else if (M0() < i3) {
                this.f31953d += i3;
                this.f31952c.addFirst(AllocatedBuffer.k(bArr, i2, i3));
                J0();
            } else {
                this.f31975k -= (long) i3;
                System.arraycopy(bArr, i2, this.f31970f, G0() + 1, i3);
            }
        }

        public void j0(long j2) {
            byte[] bArr = this.f31970f;
            long j3 = this.f31975k;
            this.f31975k = j3 - 1;
            UnsafeUtil.R(bArr, j3, (byte) (((int) (j2 >> 56)) & 255));
            byte[] bArr2 = this.f31970f;
            long j4 = this.f31975k;
            this.f31975k = j4 - 1;
            UnsafeUtil.R(bArr2, j4, (byte) (((int) (j2 >> 48)) & 255));
            byte[] bArr3 = this.f31970f;
            long j5 = this.f31975k;
            this.f31975k = j5 - 1;
            UnsafeUtil.R(bArr3, j5, (byte) (((int) (j2 >> 40)) & 255));
            byte[] bArr4 = this.f31970f;
            long j6 = this.f31975k;
            this.f31975k = j6 - 1;
            UnsafeUtil.R(bArr4, j6, (byte) (((int) (j2 >> 32)) & 255));
            byte[] bArr5 = this.f31970f;
            long j7 = this.f31975k;
            this.f31975k = j7 - 1;
            UnsafeUtil.R(bArr5, j7, (byte) (((int) (j2 >> 24)) & 255));
            byte[] bArr6 = this.f31970f;
            long j8 = this.f31975k;
            this.f31975k = j8 - 1;
            UnsafeUtil.R(bArr6, j8, (byte) (((int) (j2 >> 16)) & 255));
            byte[] bArr7 = this.f31970f;
            long j9 = this.f31975k;
            this.f31975k = j9 - 1;
            UnsafeUtil.R(bArr7, j9, (byte) (((int) (j2 >> 8)) & 255));
            byte[] bArr8 = this.f31970f;
            long j10 = this.f31975k;
            this.f31975k = j10 - 1;
            UnsafeUtil.R(bArr8, j10, (byte) (((int) j2) & 255));
        }

        public int l() {
            return this.f31953d + H0();
        }

        public void o(int i2, int i3) {
            a0(15);
            o0(i3);
            z0(i2, 0);
        }

        public void o0(int i2) {
            if (i2 >= 0) {
                E0(i2);
            } else {
                F0((long) i2);
            }
        }

        public void q(int i2, int i3) {
            a0(10);
            E0(i3);
            z0(i2, 0);
        }

        public void s(int i2, int i3) {
            a0(9);
            g0(i3);
            z0(i2, 5);
        }

        public void t0(int i2) {
            E0(CodedOutputStream.Q0(i2));
        }

        public void w(int i2, long j2) {
            a0(13);
            j0(j2);
            z0(i2, 1);
        }

        public void w0(long j2) {
            F0(CodedOutputStream.R0(j2));
        }

        public void z(int i2, String str) {
            int l2 = l();
            O0(str);
            a0(10);
            E0(l() - l2);
            z0(i2, 2);
        }

        public void z0(int i2, int i3) {
            E0(WireFormat.c(i2, i3));
        }
    }

    public static byte k(long j2) {
        byte b2;
        if ((-128 & j2) == 0) {
            return 1;
        }
        if (j2 < 0) {
            return 10;
        }
        if ((-34359738368L & j2) != 0) {
            b2 = (byte) 6;
            j2 >>>= 28;
        } else {
            b2 = 2;
        }
        if ((-2097152 & j2) != 0) {
            b2 = (byte) (b2 + 2);
            j2 >>>= 14;
        }
        return (j2 & -16384) != 0 ? (byte) (b2 + 1) : b2;
    }

    public static final void s0(Writer writer, int i2, WireFormat.FieldType fieldType, Object obj) {
        switch (AnonymousClass1.f31954a[fieldType.ordinal()]) {
            case 1:
                writer.E(i2, ((Boolean) obj).booleanValue());
                return;
            case 2:
                writer.s(i2, ((Integer) obj).intValue());
                return;
            case 3:
                writer.w(i2, ((Long) obj).longValue());
                return;
            case 4:
                writer.o(i2, ((Integer) obj).intValue());
                return;
            case 5:
                writer.D(i2, ((Long) obj).longValue());
                return;
            case 6:
                writer.F(i2, ((Integer) obj).intValue());
                return;
            case 7:
                writer.J(i2, ((Long) obj).longValue());
                return;
            case 8:
                writer.W(i2, ((Integer) obj).intValue());
                return;
            case 9:
                writer.O(i2, ((Long) obj).longValue());
                return;
            case 10:
                writer.z(i2, (String) obj);
                return;
            case 11:
                writer.q(i2, ((Integer) obj).intValue());
                return;
            case 12:
                writer.A(i2, ((Long) obj).longValue());
                return;
            case 13:
                writer.P(i2, ((Float) obj).floatValue());
                return;
            case 14:
                writer.t(i2, ((Double) obj).doubleValue());
                return;
            case 15:
                writer.B(i2, obj);
                return;
            case 16:
                writer.e(i2, (ByteString) obj);
                return;
            case 17:
                if (obj instanceof Internal.EnumLite) {
                    writer.S(i2, ((Internal.EnumLite) obj).i());
                    return;
                } else if (obj instanceof Integer) {
                    writer.S(i2, ((Integer) obj).intValue());
                    return;
                } else {
                    throw new IllegalArgumentException("Unexpected type for enum in map.");
                }
            default:
                throw new IllegalArgumentException("Unsupported map value type for: " + fieldType);
        }
    }

    public final void A0(int i2, IntArrayList intArrayList, boolean z2) {
        if (z2) {
            a0((intArrayList.size() * 5) + 10);
            int l2 = l();
            for (int size = intArrayList.size() - 1; size >= 0; size--) {
                E0(intArrayList.getInt(size));
            }
            E0(l() - l2);
            z0(i2, 2);
            return;
        }
        for (int size2 = intArrayList.size() - 1; size2 >= 0; size2--) {
            q(i2, intArrayList.getInt(size2));
        }
    }

    public final void B0(int i2, List list, boolean z2) {
        if (z2) {
            a0((list.size() * 5) + 10);
            int l2 = l();
            for (int size = list.size() - 1; size >= 0; size--) {
                E0(((Integer) list.get(size)).intValue());
            }
            E0(l() - l2);
            z0(i2, 2);
            return;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            q(i2, ((Integer) list.get(size2)).intValue());
        }
    }

    public final void C(int i2, List list, boolean z2) {
        if (list instanceof IntArrayList) {
            p0(i2, (IntArrayList) list, z2);
        } else {
            q0(i2, list, z2);
        }
    }

    public final void C0(int i2, LongArrayList longArrayList, boolean z2) {
        if (z2) {
            a0((longArrayList.size() * 10) + 10);
            int l2 = l();
            for (int size = longArrayList.size() - 1; size >= 0; size--) {
                F0(longArrayList.q(size));
            }
            E0(l() - l2);
            z0(i2, 2);
            return;
        }
        for (int size2 = longArrayList.size() - 1; size2 >= 0; size2--) {
            A(i2, longArrayList.q(size2));
        }
    }

    public final void D(int i2, long j2) {
        A(i2, j2);
    }

    public final void D0(int i2, List list, boolean z2) {
        if (z2) {
            a0((list.size() * 10) + 10);
            int l2 = l();
            for (int size = list.size() - 1; size >= 0; size--) {
                F0(((Long) list.get(size)).longValue());
            }
            E0(l() - l2);
            z0(i2, 2);
            return;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            A(i2, ((Long) list.get(size2)).longValue());
        }
    }

    public abstract void E0(int i2);

    public final void F(int i2, int i3) {
        s(i2, i3);
    }

    public abstract void F0(long j2);

    public final void H(int i2, List list, boolean z2) {
        if (list instanceof LongArrayList) {
            k0(i2, (LongArrayList) list, z2);
        } else {
            l0(i2, list, z2);
        }
    }

    public final void I(int i2, List list, boolean z2) {
        K(i2, list, z2);
    }

    public final void J(int i2, long j2) {
        w(i2, j2);
    }

    public final void K(int i2, List list, boolean z2) {
        if (list instanceof IntArrayList) {
            h0(i2, (IntArrayList) list, z2);
        } else {
            i0(i2, list, z2);
        }
    }

    public final void L(int i2, List list, boolean z2) {
        if (list instanceof BooleanArrayList) {
            c0(i2, (BooleanArrayList) list, z2);
        } else {
            d0(i2, list, z2);
        }
    }

    public final void M(int i2, List list, boolean z2) {
        if (list instanceof IntArrayList) {
            A0(i2, (IntArrayList) list, z2);
        } else {
            B0(i2, list, z2);
        }
    }

    public final void N(int i2, List list, boolean z2) {
        if (list instanceof LongArrayList) {
            x0(i2, (LongArrayList) list, z2);
        } else {
            y0(i2, list, z2);
        }
    }

    public final void P(int i2, float f2) {
        s(i2, Float.floatToRawIntBits(f2));
    }

    public final void R(int i2, List list, boolean z2) {
        if (list instanceof IntArrayList) {
            u0(i2, (IntArrayList) list, z2);
        } else {
            v0(i2, list, z2);
        }
    }

    public final void S(int i2, int i3) {
        o(i2, i3);
    }

    public final void T(int i2, List list, boolean z2) {
        v(i2, list, z2);
    }

    public final void U(int i2, List list, boolean z2) {
        C(i2, list, z2);
    }

    public final void V(int i2, List list, boolean z2) {
        if (list instanceof DoubleArrayList) {
            e0(i2, (DoubleArrayList) list, z2);
        } else {
            f0(i2, list, z2);
        }
    }

    public final void X(int i2, List list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            e(i2, (ByteString) list.get(size));
        }
    }

    public final AllocatedBuffer Y() {
        return this.f31950a.b(this.f31951b);
    }

    public final AllocatedBuffer Z(int i2) {
        return this.f31950a.b(Math.max(i2, this.f31951b));
    }

    public final void a(int i2, List list, Schema schema) {
        for (int size = list.size() - 1; size >= 0; size--) {
            c(i2, list.get(size), schema);
        }
    }

    public abstract void a0(int i2);

    public final void b(int i2, List list, Schema schema) {
        for (int size = list.size() - 1; size >= 0; size--) {
            d(i2, list.get(size), schema);
        }
    }

    public abstract void b0(boolean z2);

    public final void c0(int i2, BooleanArrayList booleanArrayList, boolean z2) {
        if (z2) {
            a0(booleanArrayList.size() + 10);
            int l2 = l();
            for (int size = booleanArrayList.size() - 1; size >= 0; size--) {
                b0(booleanArrayList.p(size));
            }
            E0(l() - l2);
            z0(i2, 2);
            return;
        }
        for (int size2 = booleanArrayList.size() - 1; size2 >= 0; size2--) {
            E(i2, booleanArrayList.p(size2));
        }
    }

    public final void d0(int i2, List list, boolean z2) {
        if (z2) {
            a0(list.size() + 10);
            int l2 = l();
            for (int size = list.size() - 1; size >= 0; size--) {
                b0(((Boolean) list.get(size)).booleanValue());
            }
            E0(l() - l2);
            z0(i2, 2);
            return;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            E(i2, ((Boolean) list.get(size2)).booleanValue());
        }
    }

    public final void e0(int i2, DoubleArrayList doubleArrayList, boolean z2) {
        if (z2) {
            a0((doubleArrayList.size() * 8) + 10);
            int l2 = l();
            for (int size = doubleArrayList.size() - 1; size >= 0; size--) {
                j0(Double.doubleToRawLongBits(doubleArrayList.q(size)));
            }
            E0(l() - l2);
            z0(i2, 2);
            return;
        }
        for (int size2 = doubleArrayList.size() - 1; size2 >= 0; size2--) {
            t(i2, doubleArrayList.q(size2));
        }
    }

    public void f(int i2, MapEntryLite.Metadata metadata, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            int l2 = l();
            s0(this, 2, metadata.f32220c, entry.getValue());
            s0(this, 1, metadata.f32218a, entry.getKey());
            E0(l() - l2);
            z0(i2, 2);
        }
    }

    public final void f0(int i2, List list, boolean z2) {
        if (z2) {
            a0((list.size() * 8) + 10);
            int l2 = l();
            for (int size = list.size() - 1; size >= 0; size--) {
                j0(Double.doubleToRawLongBits(((Double) list.get(size)).doubleValue()));
            }
            E0(l() - l2);
            z0(i2, 2);
            return;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            t(i2, ((Double) list.get(size2)).doubleValue());
        }
    }

    public abstract void g0(int i2);

    public final void h0(int i2, IntArrayList intArrayList, boolean z2) {
        if (z2) {
            a0((intArrayList.size() * 4) + 10);
            int l2 = l();
            for (int size = intArrayList.size() - 1; size >= 0; size--) {
                g0(intArrayList.getInt(size));
            }
            E0(l() - l2);
            z0(i2, 2);
            return;
        }
        for (int size2 = intArrayList.size() - 1; size2 >= 0; size2--) {
            s(i2, intArrayList.getInt(size2));
        }
    }

    public final void i0(int i2, List list, boolean z2) {
        if (z2) {
            a0((list.size() * 4) + 10);
            int l2 = l();
            for (int size = list.size() - 1; size >= 0; size--) {
                g0(((Integer) list.get(size)).intValue());
            }
            E0(l() - l2);
            z0(i2, 2);
            return;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            s(i2, ((Integer) list.get(size2)).intValue());
        }
    }

    public abstract void j0(long j2);

    public final void k0(int i2, LongArrayList longArrayList, boolean z2) {
        if (z2) {
            a0((longArrayList.size() * 8) + 10);
            int l2 = l();
            for (int size = longArrayList.size() - 1; size >= 0; size--) {
                j0(longArrayList.q(size));
            }
            E0(l() - l2);
            z0(i2, 2);
            return;
        }
        for (int size2 = longArrayList.size() - 1; size2 >= 0; size2--) {
            w(i2, longArrayList.q(size2));
        }
    }

    public abstract int l();

    public final void l0(int i2, List list, boolean z2) {
        if (z2) {
            a0((list.size() * 8) + 10);
            int l2 = l();
            for (int size = list.size() - 1; size >= 0; size--) {
                j0(((Long) list.get(size)).longValue());
            }
            E0(l() - l2);
            z0(i2, 2);
            return;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            w(i2, ((Long) list.get(size2)).longValue());
        }
    }

    public final AllocatedBuffer m() {
        return this.f31950a.a(this.f31951b);
    }

    public final void m0(int i2, FloatArrayList floatArrayList, boolean z2) {
        if (z2) {
            a0((floatArrayList.size() * 4) + 10);
            int l2 = l();
            for (int size = floatArrayList.size() - 1; size >= 0; size--) {
                g0(Float.floatToRawIntBits(floatArrayList.p(size)));
            }
            E0(l() - l2);
            z0(i2, 2);
            return;
        }
        for (int size2 = floatArrayList.size() - 1; size2 >= 0; size2--) {
            P(i2, floatArrayList.p(size2));
        }
    }

    public final AllocatedBuffer n(int i2) {
        return this.f31950a.a(Math.max(i2, this.f31951b));
    }

    public final void n0(int i2, List list, boolean z2) {
        if (z2) {
            a0((list.size() * 4) + 10);
            int l2 = l();
            for (int size = list.size() - 1; size >= 0; size--) {
                g0(Float.floatToRawIntBits(((Float) list.get(size)).floatValue()));
            }
            E0(l() - l2);
            z0(i2, 2);
            return;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            P(i2, ((Float) list.get(size2)).floatValue());
        }
    }

    public abstract void o0(int i2);

    public final void p(int i2, List list, boolean z2) {
        if (list instanceof FloatArrayList) {
            m0(i2, (FloatArrayList) list, z2);
        } else {
            n0(i2, list, z2);
        }
    }

    public final void p0(int i2, IntArrayList intArrayList, boolean z2) {
        if (z2) {
            a0((intArrayList.size() * 10) + 10);
            int l2 = l();
            for (int size = intArrayList.size() - 1; size >= 0; size--) {
                o0(intArrayList.getInt(size));
            }
            E0(l() - l2);
            z0(i2, 2);
            return;
        }
        for (int size2 = intArrayList.size() - 1; size2 >= 0; size2--) {
            o(i2, intArrayList.getInt(size2));
        }
    }

    public final void q0(int i2, List list, boolean z2) {
        if (z2) {
            a0((list.size() * 10) + 10);
            int l2 = l();
            for (int size = list.size() - 1; size >= 0; size--) {
                o0(((Integer) list.get(size)).intValue());
            }
            E0(l() - l2);
            z0(i2, 2);
            return;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            o(i2, ((Integer) list.get(size2)).intValue());
        }
    }

    public final void r(int i2, Object obj) {
        z0(1, 4);
        if (obj instanceof ByteString) {
            e(3, (ByteString) obj);
        } else {
            B(3, obj);
        }
        q(2, i2);
        z0(1, 3);
    }

    public final void r0(int i2, Object obj) {
        if (obj instanceof String) {
            z(i2, (String) obj);
        } else {
            e(i2, (ByteString) obj);
        }
    }

    public final void t(int i2, double d2) {
        w(i2, Double.doubleToRawLongBits(d2));
    }

    public abstract void t0(int i2);

    public final void u(int i2, List list, boolean z2) {
        H(i2, list, z2);
    }

    public final void u0(int i2, IntArrayList intArrayList, boolean z2) {
        if (z2) {
            a0((intArrayList.size() * 5) + 10);
            int l2 = l();
            for (int size = intArrayList.size() - 1; size >= 0; size--) {
                t0(intArrayList.getInt(size));
            }
            E0(l() - l2);
            z0(i2, 2);
            return;
        }
        for (int size2 = intArrayList.size() - 1; size2 >= 0; size2--) {
            W(i2, intArrayList.getInt(size2));
        }
    }

    public final void v(int i2, List list, boolean z2) {
        if (list instanceof LongArrayList) {
            C0(i2, (LongArrayList) list, z2);
        } else {
            D0(i2, list, z2);
        }
    }

    public final void v0(int i2, List list, boolean z2) {
        if (z2) {
            a0((list.size() * 5) + 10);
            int l2 = l();
            for (int size = list.size() - 1; size >= 0; size--) {
                t0(((Integer) list.get(size)).intValue());
            }
            E0(l() - l2);
            z0(i2, 2);
            return;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            W(i2, ((Integer) list.get(size2)).intValue());
        }
    }

    public abstract void w0(long j2);

    public final Writer.FieldOrder x() {
        return Writer.FieldOrder.DESCENDING;
    }

    public final void x0(int i2, LongArrayList longArrayList, boolean z2) {
        if (z2) {
            a0((longArrayList.size() * 10) + 10);
            int l2 = l();
            for (int size = longArrayList.size() - 1; size >= 0; size--) {
                w0(longArrayList.q(size));
            }
            E0(l() - l2);
            z0(i2, 2);
            return;
        }
        for (int size2 = longArrayList.size() - 1; size2 >= 0; size2--) {
            O(i2, longArrayList.q(size2));
        }
    }

    public final void y(int i2, List list) {
        if (list instanceof LazyStringList) {
            LazyStringList lazyStringList = (LazyStringList) list;
            for (int size = list.size() - 1; size >= 0; size--) {
                r0(i2, lazyStringList.G(size));
            }
            return;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            z(i2, (String) list.get(size2));
        }
    }

    public final void y0(int i2, List list, boolean z2) {
        if (z2) {
            a0((list.size() * 10) + 10);
            int l2 = l();
            for (int size = list.size() - 1; size >= 0; size--) {
                w0(((Long) list.get(size)).longValue());
            }
            E0(l() - l2);
            z0(i2, 2);
            return;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            O(i2, ((Long) list.get(size2)).longValue());
        }
    }

    public abstract void z0(int i2, int i3);
}
