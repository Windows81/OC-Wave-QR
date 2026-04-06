package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.Internal;
import androidx.datastore.preferences.protobuf.MapEntryLite;
import androidx.datastore.preferences.protobuf.Utf8;
import androidx.datastore.preferences.protobuf.WireFormat;
import androidx.datastore.preferences.protobuf.Writer;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Map;

@CheckReturnValue
abstract class BinaryWriter extends ByteOutput implements Writer {

    /* renamed from: a  reason: collision with root package name */
    public final BufferAllocator f20737a;

    /* renamed from: b  reason: collision with root package name */
    public final int f20738b;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayDeque f20739c;

    /* renamed from: d  reason: collision with root package name */
    public int f20740d;

    /* renamed from: androidx.datastore.preferences.protobuf.BinaryWriter$1  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f20741a;

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
                androidx.datastore.preferences.protobuf.WireFormat$FieldType[] r0 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f20741a = r0
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.BOOL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f20741a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.FIXED32     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f20741a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.FIXED64     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f20741a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.INT32     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f20741a     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.INT64     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f20741a     // Catch:{ NoSuchFieldError -> 0x0049 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.SFIXED32     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f20741a     // Catch:{ NoSuchFieldError -> 0x0054 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.SFIXED64     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f20741a     // Catch:{ NoSuchFieldError -> 0x0060 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.SINT32     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f20741a     // Catch:{ NoSuchFieldError -> 0x006c }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.SINT64     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f20741a     // Catch:{ NoSuchFieldError -> 0x0078 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.STRING     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f20741a     // Catch:{ NoSuchFieldError -> 0x0084 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.UINT32     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = f20741a     // Catch:{ NoSuchFieldError -> 0x0090 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.UINT64     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r0 = f20741a     // Catch:{ NoSuchFieldError -> 0x009c }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.FLOAT     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r0 = f20741a     // Catch:{ NoSuchFieldError -> 0x00a8 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.DOUBLE     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r0 = f20741a     // Catch:{ NoSuchFieldError -> 0x00b4 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.MESSAGE     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r0 = f20741a     // Catch:{ NoSuchFieldError -> 0x00c0 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.BYTES     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r0 = f20741a     // Catch:{ NoSuchFieldError -> 0x00cc }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.ENUM     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r2 = 17
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.BinaryWriter.AnonymousClass1.<clinit>():void");
        }
    }

    public static final class SafeDirectWriter extends BinaryWriter {

        /* renamed from: e  reason: collision with root package name */
        public ByteBuffer f20742e;

        /* renamed from: f  reason: collision with root package name */
        public int f20743f;

        /* renamed from: g  reason: collision with root package name */
        public int f20744g;

        private int G0() {
            return this.f20743f - this.f20744g;
        }

        private int L0() {
            return this.f20744g + 1;
        }

        public void A(int i2, long j2) {
            k(15);
            F0(j2);
            z0(i2, 0);
        }

        public void B(int i2, Object obj) {
            int f2 = f();
            Protobuf.a().e(obj, this);
            k(10);
            E0(f() - f2);
            z0(i2, 2);
        }

        public void E(int i2, boolean z2) {
            k(6);
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
            switch (BinaryWriter.e(j2)) {
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
            if (this.f20742e != null) {
                this.f20740d += G0();
                Java8Compatibility.c(this.f20742e, this.f20744g + 1);
                this.f20742e = null;
                this.f20744g = 0;
                this.f20743f = 0;
            }
        }

        public final void I0() {
            K0(g());
        }

        public final void J0(int i2) {
            K0(h(i2));
        }

        public final void K0(AllocatedBuffer allocatedBuffer) {
            if (allocatedBuffer.d()) {
                ByteBuffer f2 = allocatedBuffer.f();
                if (f2.isDirect()) {
                    H0();
                    this.f20739c.addFirst(allocatedBuffer);
                    this.f20742e = f2;
                    Java8Compatibility.a(f2, f2.capacity());
                    Java8Compatibility.c(this.f20742e, 0);
                    this.f20742e.order(ByteOrder.LITTLE_ENDIAN);
                    int limit = this.f20742e.limit() - 1;
                    this.f20743f = limit;
                    this.f20744g = limit;
                    return;
                }
                throw new RuntimeException("Allocator returned non-direct buffer");
            }
            throw new RuntimeException("Allocated buffer does not have NIO buffer");
        }

        public void M0(byte b2) {
            ByteBuffer byteBuffer = this.f20742e;
            int i2 = this.f20744g;
            this.f20744g = i2 - 1;
            byteBuffer.put(i2, b2);
        }

        public void N0(String str) {
            int i2;
            int i3;
            int i4;
            char charAt;
            k(str.length());
            int length = str.length() - 1;
            this.f20744g -= length;
            while (length >= 0 && (charAt = str.charAt(length)) < 128) {
                this.f20742e.put(this.f20744g + length, (byte) charAt);
                length--;
            }
            if (length == -1) {
                this.f20744g--;
                return;
            }
            this.f20744g += length;
            while (length >= 0) {
                char charAt2 = str.charAt(length);
                if (charAt2 < 128 && (i4 = this.f20744g) >= 0) {
                    ByteBuffer byteBuffer = this.f20742e;
                    this.f20744g = i4 - 1;
                    byteBuffer.put(i4, (byte) charAt2);
                } else if (charAt2 < 2048 && (i3 = this.f20744g) > 0) {
                    ByteBuffer byteBuffer2 = this.f20742e;
                    this.f20744g = i3 - 1;
                    byteBuffer2.put(i3, (byte) ((charAt2 & '?') | 128));
                    ByteBuffer byteBuffer3 = this.f20742e;
                    int i5 = this.f20744g;
                    this.f20744g = i5 - 1;
                    byteBuffer3.put(i5, (byte) ((charAt2 >>> 6) | 960));
                } else if ((charAt2 < 55296 || 57343 < charAt2) && (i2 = this.f20744g) > 1) {
                    ByteBuffer byteBuffer4 = this.f20742e;
                    this.f20744g = i2 - 1;
                    byteBuffer4.put(i2, (byte) ((charAt2 & '?') | 128));
                    ByteBuffer byteBuffer5 = this.f20742e;
                    int i6 = this.f20744g;
                    this.f20744g = i6 - 1;
                    byteBuffer5.put(i6, (byte) (((charAt2 >>> 6) & 63) | 128));
                    ByteBuffer byteBuffer6 = this.f20742e;
                    int i7 = this.f20744g;
                    this.f20744g = i7 - 1;
                    byteBuffer6.put(i7, (byte) ((charAt2 >>> 12) | 480));
                } else if (this.f20744g > 2) {
                    if (length != 0) {
                        char charAt3 = str.charAt(length - 1);
                        if (Character.isSurrogatePair(charAt3, charAt2)) {
                            length--;
                            int codePoint = Character.toCodePoint(charAt3, charAt2);
                            ByteBuffer byteBuffer7 = this.f20742e;
                            int i8 = this.f20744g;
                            this.f20744g = i8 - 1;
                            byteBuffer7.put(i8, (byte) ((codePoint & 63) | 128));
                            ByteBuffer byteBuffer8 = this.f20742e;
                            int i9 = this.f20744g;
                            this.f20744g = i9 - 1;
                            byteBuffer8.put(i9, (byte) (((codePoint >>> 6) & 63) | 128));
                            ByteBuffer byteBuffer9 = this.f20742e;
                            int i10 = this.f20744g;
                            this.f20744g = i10 - 1;
                            byteBuffer9.put(i10, (byte) (((codePoint >>> 12) & 63) | 128));
                            ByteBuffer byteBuffer10 = this.f20742e;
                            int i11 = this.f20744g;
                            this.f20744g = i11 - 1;
                            byteBuffer10.put(i11, (byte) ((codePoint >>> 18) | 240));
                        }
                    }
                    throw new Utf8.UnpairedSurrogateException(length - 1, length);
                } else {
                    k(length);
                    length++;
                }
                length--;
            }
        }

        public void O(int i2, long j2) {
            k(15);
            w0(j2);
            z0(i2, 0);
        }

        public final void O0(int i2) {
            ByteBuffer byteBuffer = this.f20742e;
            int i3 = this.f20744g;
            this.f20744g = i3 - 1;
            byteBuffer.put(i3, (byte) (i2 >>> 28));
            int i4 = this.f20744g;
            this.f20744g = i4 - 4;
            this.f20742e.putInt(i4 - 3, (i2 & 127) | 128 | ((((i2 >>> 21) & 127) | 128) << 24) | ((((i2 >>> 14) & 127) | 128) << 16) | ((((i2 >>> 7) & 127) | 128) << 8));
        }

        public final void P0(int i2) {
            int i3 = this.f20744g;
            this.f20744g = i3 - 4;
            this.f20742e.putInt(i3 - 3, (i2 & 127) | 128 | ((266338304 & i2) << 3) | (((2080768 & i2) | 2097152) << 2) | (((i2 & 16256) | 16384) << 1));
        }

        public void Q(int i2) {
            z0(i2, 4);
        }

        public final void Q0(int i2) {
            ByteBuffer byteBuffer = this.f20742e;
            int i3 = this.f20744g;
            this.f20744g = i3 - 1;
            byteBuffer.put(i3, (byte) i2);
        }

        public final void R0(int i2) {
            int i3 = this.f20744g - 3;
            this.f20744g = i3;
            this.f20742e.putInt(i3, (((i2 & 127) | 128) << 8) | ((2080768 & i2) << 10) | (((i2 & 16256) | 16384) << 9));
        }

        public final void S0(int i2) {
            int i3 = this.f20744g;
            this.f20744g = i3 - 2;
            this.f20742e.putShort(i3 - 1, (short) ((i2 & 127) | 128 | ((i2 & 16256) << 1)));
        }

        public final void T0(long j2) {
            int i2 = this.f20744g;
            this.f20744g = i2 - 8;
            this.f20742e.putLong(i2 - 7, (j2 & 127) | 128 | ((71494644084506624L & j2) << 7) | (((558551906910208L & j2) | 562949953421312L) << 6) | (((4363686772736L & j2) | 4398046511104L) << 5) | (((34091302912L & j2) | 34359738368L) << 4) | (((266338304 & j2) | 268435456) << 3) | (((2080768 & j2) | 2097152) << 2) | (((16256 & j2) | 16384) << 1));
        }

        public final void U0(long j2) {
            int i2 = this.f20744g;
            this.f20744g = i2 - 8;
            this.f20742e.putLong(i2 - 7, (j2 & 127) | 128 | (((71494644084506624L & j2) | 72057594037927936L) << 7) | (((558551906910208L & j2) | 562949953421312L) << 6) | (((4363686772736L & j2) | 4398046511104L) << 5) | (((34091302912L & j2) | 34359738368L) << 4) | (((266338304 & j2) | 268435456) << 3) | (((2080768 & j2) | 2097152) << 2) | (((16256 & j2) | 16384) << 1));
        }

        public final void V0(long j2) {
            int i2 = this.f20744g;
            this.f20744g = i2 - 5;
            this.f20742e.putLong(i2 - 7, (((j2 & 127) | 128) << 24) | ((34091302912L & j2) << 28) | (((266338304 & j2) | 268435456) << 27) | (((2080768 & j2) | 2097152) << 26) | (((16256 & j2) | 16384) << 25));
        }

        public void W(int i2, int i3) {
            k(10);
            t0(i3);
            z0(i2, 0);
        }

        public final void W0(long j2) {
            P0((int) j2);
        }

        public final void X0(long j2) {
            ByteBuffer byteBuffer = this.f20742e;
            int i2 = this.f20744g;
            this.f20744g = i2 - 1;
            byteBuffer.put(i2, (byte) ((int) (j2 >>> 56)));
            U0(j2 & 72057594037927935L);
        }

        public final void Y0(long j2) {
            Q0((int) j2);
        }

        public final void Z0(long j2) {
            int i2 = this.f20744g - 7;
            this.f20744g = i2;
            this.f20742e.putLong(i2, (((j2 & 127) | 128) << 8) | ((558551906910208L & j2) << 14) | (((4363686772736L & j2) | 4398046511104L) << 13) | (((34091302912L & j2) | 34359738368L) << 12) | (((266338304 & j2) | 268435456) << 11) | (((2080768 & j2) | 2097152) << 10) | (((16256 & j2) | 16384) << 9));
        }

        public void a(byte[] bArr, int i2, int i3) {
            if (L0() < i3) {
                J0(i3);
            }
            int i4 = this.f20744g - i3;
            this.f20744g = i4;
            Java8Compatibility.c(this.f20742e, i4 + 1);
            this.f20742e.put(bArr, i2, i3);
        }

        public void a0(int i2, ByteString byteString) {
            try {
                byteString.a0(this);
                k(10);
                E0(byteString.size());
                z0(i2, 2);
            } catch (IOException e2) {
                throw new RuntimeException(e2);
            }
        }

        public final void a1(long j2) {
            int i2 = this.f20744g;
            this.f20744g = i2 - 6;
            this.f20742e.putLong(i2 - 7, (((j2 & 127) | 128) << 16) | ((4363686772736L & j2) << 21) | (((34091302912L & j2) | 34359738368L) << 20) | (((266338304 & j2) | 268435456) << 19) | (((2080768 & j2) | 2097152) << 18) | (((16256 & j2) | 16384) << 17));
        }

        public void b(ByteBuffer byteBuffer) {
            int remaining = byteBuffer.remaining();
            if (L0() < remaining) {
                this.f20740d += remaining;
                this.f20739c.addFirst(AllocatedBuffer.i(byteBuffer));
                I0();
                return;
            }
            int i2 = this.f20744g - remaining;
            this.f20744g = i2;
            Java8Compatibility.c(this.f20742e, i2 + 1);
            this.f20742e.put(byteBuffer);
        }

        public void b0(int i2, Object obj, Schema schema) {
            int f2 = f();
            schema.i(obj, this);
            k(10);
            E0(f() - f2);
            z0(i2, 2);
        }

        public final void b1(long j2) {
            ByteBuffer byteBuffer = this.f20742e;
            int i2 = this.f20744g;
            this.f20744g = i2 - 1;
            byteBuffer.put(i2, (byte) ((int) (j2 >>> 63)));
            ByteBuffer byteBuffer2 = this.f20742e;
            int i3 = this.f20744g;
            this.f20744g = i3 - 1;
            byteBuffer2.put(i3, (byte) ((int) (((j2 >>> 56) & 127) | 128)));
            U0(j2 & 72057594037927935L);
        }

        public void c(byte[] bArr, int i2, int i3) {
            if (L0() < i3) {
                this.f20740d += i3;
                this.f20739c.addFirst(AllocatedBuffer.k(bArr, i2, i3));
                I0();
                return;
            }
            int i4 = this.f20744g - i3;
            this.f20744g = i4;
            Java8Compatibility.c(this.f20742e, i4 + 1);
            this.f20742e.put(bArr, i2, i3);
        }

        public final void c1(long j2) {
            R0((int) j2);
        }

        public void d0(int i2, Object obj, Schema schema) {
            z0(i2, 4);
            schema.i(obj, this);
            z0(i2, 3);
        }

        public final void d1(long j2) {
            S0((int) j2);
        }

        public int f() {
            return this.f20740d + G0();
        }

        public void g0(int i2) {
            int i3 = this.f20744g;
            this.f20744g = i3 - 4;
            this.f20742e.putInt(i3 - 3, i2);
        }

        public void j0(long j2) {
            int i2 = this.f20744g;
            this.f20744g = i2 - 8;
            this.f20742e.putLong(i2 - 7, j2);
        }

        public void k(int i2) {
            if (L0() < i2) {
                J0(i2);
            }
        }

        public void l(boolean z2) {
            M0(z2 ? (byte) 1 : 0);
        }

        public void o(int i2, int i3) {
            k(15);
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
            k(10);
            E0(i3);
            z0(i2, 0);
        }

        public void s(int i2, int i3) {
            k(9);
            g0(i3);
            z0(i2, 5);
        }

        public void t0(int i2) {
            E0(CodedOutputStream.R0(i2));
        }

        public void w(int i2, long j2) {
            k(13);
            j0(j2);
            z0(i2, 1);
        }

        public void w0(long j2) {
            F0(CodedOutputStream.S0(j2));
        }

        public void z(int i2, String str) {
            int f2 = f();
            N0(str);
            k(10);
            E0(f() - f2);
            z0(i2, 2);
        }

        public void z0(int i2, int i3) {
            E0(WireFormat.c(i2, i3));
        }
    }

    public static final class SafeHeapWriter extends BinaryWriter {

        /* renamed from: e  reason: collision with root package name */
        public AllocatedBuffer f20745e;

        /* renamed from: f  reason: collision with root package name */
        public byte[] f20746f;

        /* renamed from: g  reason: collision with root package name */
        public int f20747g;

        /* renamed from: h  reason: collision with root package name */
        public int f20748h;

        /* renamed from: i  reason: collision with root package name */
        public int f20749i;

        /* renamed from: j  reason: collision with root package name */
        public int f20750j;

        /* renamed from: k  reason: collision with root package name */
        public int f20751k;

        private void I0() {
            K0(i());
        }

        private void J0(int i2) {
            K0(j(i2));
        }

        private void K0(AllocatedBuffer allocatedBuffer) {
            if (allocatedBuffer.c()) {
                H0();
                this.f20739c.addFirst(allocatedBuffer);
                this.f20745e = allocatedBuffer;
                this.f20746f = allocatedBuffer.a();
                int b2 = allocatedBuffer.b();
                this.f20748h = allocatedBuffer.e() + b2;
                int g2 = b2 + allocatedBuffer.g();
                this.f20747g = g2;
                this.f20749i = g2 - 1;
                int i2 = this.f20748h - 1;
                this.f20750j = i2;
                this.f20751k = i2;
                return;
            }
            throw new RuntimeException("Allocator returned non-heap buffer");
        }

        private void O0(int i2) {
            byte[] bArr = this.f20746f;
            int i3 = this.f20751k;
            int i4 = i3 - 1;
            this.f20751k = i4;
            bArr[i3] = (byte) (i2 >>> 28);
            int i5 = i3 - 2;
            this.f20751k = i5;
            bArr[i4] = (byte) (((i2 >>> 21) & 127) | 128);
            int i6 = i3 - 3;
            this.f20751k = i6;
            bArr[i5] = (byte) (((i2 >>> 14) & 127) | 128);
            int i7 = i3 - 4;
            this.f20751k = i7;
            bArr[i6] = (byte) (((i2 >>> 7) & 127) | 128);
            this.f20751k = i3 - 5;
            bArr[i7] = (byte) ((i2 & 127) | 128);
        }

        private void P0(int i2) {
            byte[] bArr = this.f20746f;
            int i3 = this.f20751k;
            int i4 = i3 - 1;
            this.f20751k = i4;
            bArr[i3] = (byte) (i2 >>> 21);
            int i5 = i3 - 2;
            this.f20751k = i5;
            bArr[i4] = (byte) (((i2 >>> 14) & 127) | 128);
            int i6 = i3 - 3;
            this.f20751k = i6;
            bArr[i5] = (byte) (((i2 >>> 7) & 127) | 128);
            this.f20751k = i3 - 4;
            bArr[i6] = (byte) ((i2 & 127) | 128);
        }

        private void Q0(int i2) {
            byte[] bArr = this.f20746f;
            int i3 = this.f20751k;
            this.f20751k = i3 - 1;
            bArr[i3] = (byte) i2;
        }

        private void R0(int i2) {
            byte[] bArr = this.f20746f;
            int i3 = this.f20751k;
            int i4 = i3 - 1;
            this.f20751k = i4;
            bArr[i3] = (byte) (i2 >>> 14);
            int i5 = i3 - 2;
            this.f20751k = i5;
            bArr[i4] = (byte) (((i2 >>> 7) & 127) | 128);
            this.f20751k = i3 - 3;
            bArr[i5] = (byte) ((i2 & 127) | 128);
        }

        private void S0(int i2) {
            byte[] bArr = this.f20746f;
            int i3 = this.f20751k;
            int i4 = i3 - 1;
            this.f20751k = i4;
            bArr[i3] = (byte) (i2 >>> 7);
            this.f20751k = i3 - 2;
            bArr[i4] = (byte) ((i2 & 127) | 128);
        }

        private void T0(long j2) {
            byte[] bArr = this.f20746f;
            int i2 = this.f20751k;
            int i3 = i2 - 1;
            this.f20751k = i3;
            bArr[i2] = (byte) ((int) (j2 >>> 49));
            int i4 = i2 - 2;
            this.f20751k = i4;
            bArr[i3] = (byte) ((int) (((j2 >>> 42) & 127) | 128));
            int i5 = i2 - 3;
            this.f20751k = i5;
            bArr[i4] = (byte) ((int) (((j2 >>> 35) & 127) | 128));
            int i6 = i2 - 4;
            this.f20751k = i6;
            bArr[i5] = (byte) ((int) (((j2 >>> 28) & 127) | 128));
            int i7 = i2 - 5;
            this.f20751k = i7;
            bArr[i6] = (byte) ((int) (((j2 >>> 21) & 127) | 128));
            int i8 = i2 - 6;
            this.f20751k = i8;
            bArr[i7] = (byte) ((int) (((j2 >>> 14) & 127) | 128));
            int i9 = i2 - 7;
            this.f20751k = i9;
            bArr[i8] = (byte) ((int) (((j2 >>> 7) & 127) | 128));
            this.f20751k = i2 - 8;
            bArr[i9] = (byte) ((int) ((j2 & 127) | 128));
        }

        private void U0(long j2) {
            byte[] bArr = this.f20746f;
            int i2 = this.f20751k;
            int i3 = i2 - 1;
            this.f20751k = i3;
            bArr[i2] = (byte) ((int) (j2 >>> 28));
            int i4 = i2 - 2;
            this.f20751k = i4;
            bArr[i3] = (byte) ((int) (((j2 >>> 21) & 127) | 128));
            int i5 = i2 - 3;
            this.f20751k = i5;
            bArr[i4] = (byte) ((int) (((j2 >>> 14) & 127) | 128));
            int i6 = i2 - 4;
            this.f20751k = i6;
            bArr[i5] = (byte) ((int) (((j2 >>> 7) & 127) | 128));
            this.f20751k = i2 - 5;
            bArr[i6] = (byte) ((int) ((j2 & 127) | 128));
        }

        private void V0(long j2) {
            byte[] bArr = this.f20746f;
            int i2 = this.f20751k;
            int i3 = i2 - 1;
            this.f20751k = i3;
            bArr[i2] = (byte) ((int) (j2 >>> 21));
            int i4 = i2 - 2;
            this.f20751k = i4;
            bArr[i3] = (byte) ((int) (((j2 >>> 14) & 127) | 128));
            int i5 = i2 - 3;
            this.f20751k = i5;
            bArr[i4] = (byte) ((int) (((j2 >>> 7) & 127) | 128));
            this.f20751k = i2 - 4;
            bArr[i5] = (byte) ((int) ((j2 & 127) | 128));
        }

        private void W0(long j2) {
            byte[] bArr = this.f20746f;
            int i2 = this.f20751k;
            int i3 = i2 - 1;
            this.f20751k = i3;
            bArr[i2] = (byte) ((int) (j2 >>> 56));
            int i4 = i2 - 2;
            this.f20751k = i4;
            bArr[i3] = (byte) ((int) (((j2 >>> 49) & 127) | 128));
            int i5 = i2 - 3;
            this.f20751k = i5;
            bArr[i4] = (byte) ((int) (((j2 >>> 42) & 127) | 128));
            int i6 = i2 - 4;
            this.f20751k = i6;
            bArr[i5] = (byte) ((int) (((j2 >>> 35) & 127) | 128));
            int i7 = i2 - 5;
            this.f20751k = i7;
            bArr[i6] = (byte) ((int) (((j2 >>> 28) & 127) | 128));
            int i8 = i2 - 6;
            this.f20751k = i8;
            bArr[i7] = (byte) ((int) (((j2 >>> 21) & 127) | 128));
            int i9 = i2 - 7;
            this.f20751k = i9;
            bArr[i8] = (byte) ((int) (((j2 >>> 14) & 127) | 128));
            int i10 = i2 - 8;
            this.f20751k = i10;
            bArr[i9] = (byte) ((int) (((j2 >>> 7) & 127) | 128));
            this.f20751k = i2 - 9;
            bArr[i10] = (byte) ((int) ((j2 & 127) | 128));
        }

        private void X0(long j2) {
            byte[] bArr = this.f20746f;
            int i2 = this.f20751k;
            this.f20751k = i2 - 1;
            bArr[i2] = (byte) ((int) j2);
        }

        private void Y0(long j2) {
            byte[] bArr = this.f20746f;
            int i2 = this.f20751k;
            int i3 = i2 - 1;
            this.f20751k = i3;
            bArr[i2] = (byte) ((int) (j2 >>> 42));
            int i4 = i2 - 2;
            this.f20751k = i4;
            bArr[i3] = (byte) ((int) (((j2 >>> 35) & 127) | 128));
            int i5 = i2 - 3;
            this.f20751k = i5;
            bArr[i4] = (byte) ((int) (((j2 >>> 28) & 127) | 128));
            int i6 = i2 - 4;
            this.f20751k = i6;
            bArr[i5] = (byte) ((int) (((j2 >>> 21) & 127) | 128));
            int i7 = i2 - 5;
            this.f20751k = i7;
            bArr[i6] = (byte) ((int) (((j2 >>> 14) & 127) | 128));
            int i8 = i2 - 6;
            this.f20751k = i8;
            bArr[i7] = (byte) ((int) (((j2 >>> 7) & 127) | 128));
            this.f20751k = i2 - 7;
            bArr[i8] = (byte) ((int) ((j2 & 127) | 128));
        }

        private void Z0(long j2) {
            byte[] bArr = this.f20746f;
            int i2 = this.f20751k;
            int i3 = i2 - 1;
            this.f20751k = i3;
            bArr[i2] = (byte) ((int) (j2 >>> 35));
            int i4 = i2 - 2;
            this.f20751k = i4;
            bArr[i3] = (byte) ((int) (((j2 >>> 28) & 127) | 128));
            int i5 = i2 - 3;
            this.f20751k = i5;
            bArr[i4] = (byte) ((int) (((j2 >>> 21) & 127) | 128));
            int i6 = i2 - 4;
            this.f20751k = i6;
            bArr[i5] = (byte) ((int) (((j2 >>> 14) & 127) | 128));
            int i7 = i2 - 5;
            this.f20751k = i7;
            bArr[i6] = (byte) ((int) (((j2 >>> 7) & 127) | 128));
            this.f20751k = i2 - 6;
            bArr[i7] = (byte) ((int) ((j2 & 127) | 128));
        }

        private void a1(long j2) {
            byte[] bArr = this.f20746f;
            int i2 = this.f20751k;
            int i3 = i2 - 1;
            this.f20751k = i3;
            bArr[i2] = (byte) ((int) (j2 >>> 63));
            int i4 = i2 - 2;
            this.f20751k = i4;
            bArr[i3] = (byte) ((int) (((j2 >>> 56) & 127) | 128));
            int i5 = i2 - 3;
            this.f20751k = i5;
            bArr[i4] = (byte) ((int) (((j2 >>> 49) & 127) | 128));
            int i6 = i2 - 4;
            this.f20751k = i6;
            bArr[i5] = (byte) ((int) (((j2 >>> 42) & 127) | 128));
            int i7 = i2 - 5;
            this.f20751k = i7;
            bArr[i6] = (byte) ((int) (((j2 >>> 35) & 127) | 128));
            int i8 = i2 - 6;
            this.f20751k = i8;
            bArr[i7] = (byte) ((int) (((j2 >>> 28) & 127) | 128));
            int i9 = i2 - 7;
            this.f20751k = i9;
            bArr[i8] = (byte) ((int) (((j2 >>> 21) & 127) | 128));
            int i10 = i2 - 8;
            this.f20751k = i10;
            bArr[i9] = (byte) ((int) (((j2 >>> 14) & 127) | 128));
            int i11 = i2 - 9;
            this.f20751k = i11;
            bArr[i10] = (byte) ((int) (((j2 >>> 7) & 127) | 128));
            this.f20751k = i2 - 10;
            bArr[i11] = (byte) ((int) ((j2 & 127) | 128));
        }

        private void b1(long j2) {
            byte[] bArr = this.f20746f;
            int i2 = this.f20751k;
            int i3 = i2 - 1;
            this.f20751k = i3;
            bArr[i2] = (byte) (((int) j2) >>> 14);
            int i4 = i2 - 2;
            this.f20751k = i4;
            bArr[i3] = (byte) ((int) (((j2 >>> 7) & 127) | 128));
            this.f20751k = i2 - 3;
            bArr[i4] = (byte) ((int) ((j2 & 127) | 128));
        }

        private void c1(long j2) {
            byte[] bArr = this.f20746f;
            int i2 = this.f20751k;
            int i3 = i2 - 1;
            this.f20751k = i3;
            bArr[i2] = (byte) ((int) (j2 >>> 7));
            this.f20751k = i2 - 2;
            bArr[i3] = (byte) ((((int) j2) & 127) | 128);
        }

        public void A(int i2, long j2) {
            k(15);
            F0(j2);
            z0(i2, 0);
        }

        public void B(int i2, Object obj) {
            int f2 = f();
            Protobuf.a().e(obj, this);
            k(10);
            E0(f() - f2);
            z0(i2, 2);
        }

        public void E(int i2, boolean z2) {
            k(6);
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
            switch (BinaryWriter.e(j2)) {
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
            return this.f20750j - this.f20751k;
        }

        public void H0() {
            if (this.f20745e != null) {
                this.f20740d += G0();
                AllocatedBuffer allocatedBuffer = this.f20745e;
                allocatedBuffer.h((this.f20751k - allocatedBuffer.b()) + 1);
                this.f20745e = null;
                this.f20751k = 0;
                this.f20750j = 0;
            }
        }

        public int L0() {
            return this.f20751k - this.f20749i;
        }

        public void M0(byte b2) {
            byte[] bArr = this.f20746f;
            int i2 = this.f20751k;
            this.f20751k = i2 - 1;
            bArr[i2] = b2;
        }

        public void N0(String str) {
            int i2;
            int i3;
            int i4;
            char charAt;
            k(str.length());
            int length = str.length() - 1;
            this.f20751k -= length;
            while (length >= 0 && (charAt = str.charAt(length)) < 128) {
                this.f20746f[this.f20751k + length] = (byte) charAt;
                length--;
            }
            if (length == -1) {
                this.f20751k--;
                return;
            }
            this.f20751k += length;
            while (length >= 0) {
                char charAt2 = str.charAt(length);
                if (charAt2 < 128 && (i4 = this.f20751k) > this.f20749i) {
                    byte[] bArr = this.f20746f;
                    this.f20751k = i4 - 1;
                    bArr[i4] = (byte) charAt2;
                } else if (charAt2 < 2048 && (i3 = this.f20751k) > this.f20747g) {
                    byte[] bArr2 = this.f20746f;
                    int i5 = i3 - 1;
                    this.f20751k = i5;
                    bArr2[i3] = (byte) ((charAt2 & '?') | 128);
                    this.f20751k = i3 - 2;
                    bArr2[i5] = (byte) ((charAt2 >>> 6) | 960);
                } else if ((charAt2 < 55296 || 57343 < charAt2) && (i2 = this.f20751k) > this.f20747g + 1) {
                    byte[] bArr3 = this.f20746f;
                    int i6 = i2 - 1;
                    this.f20751k = i6;
                    bArr3[i2] = (byte) ((charAt2 & '?') | 128);
                    int i7 = i2 - 2;
                    this.f20751k = i7;
                    bArr3[i6] = (byte) (((charAt2 >>> 6) & 63) | 128);
                    this.f20751k = i2 - 3;
                    bArr3[i7] = (byte) ((charAt2 >>> 12) | 480);
                } else if (this.f20751k > this.f20747g + 2) {
                    if (length != 0) {
                        char charAt3 = str.charAt(length - 1);
                        if (Character.isSurrogatePair(charAt3, charAt2)) {
                            length--;
                            int codePoint = Character.toCodePoint(charAt3, charAt2);
                            byte[] bArr4 = this.f20746f;
                            int i8 = this.f20751k;
                            int i9 = i8 - 1;
                            this.f20751k = i9;
                            bArr4[i8] = (byte) ((codePoint & 63) | 128);
                            int i10 = i8 - 2;
                            this.f20751k = i10;
                            bArr4[i9] = (byte) (((codePoint >>> 6) & 63) | 128);
                            int i11 = i8 - 3;
                            this.f20751k = i11;
                            bArr4[i10] = (byte) (((codePoint >>> 12) & 63) | 128);
                            this.f20751k = i8 - 4;
                            bArr4[i11] = (byte) ((codePoint >>> 18) | 240);
                        }
                    }
                    throw new Utf8.UnpairedSurrogateException(length - 1, length);
                } else {
                    k(length);
                    length++;
                }
                length--;
            }
        }

        public void O(int i2, long j2) {
            k(15);
            w0(j2);
            z0(i2, 0);
        }

        public void Q(int i2) {
            z0(i2, 4);
        }

        public void W(int i2, int i3) {
            k(10);
            t0(i3);
            z0(i2, 0);
        }

        public void a(byte[] bArr, int i2, int i3) {
            if (L0() < i3) {
                J0(i3);
            }
            int i4 = this.f20751k - i3;
            this.f20751k = i4;
            System.arraycopy(bArr, i2, this.f20746f, i4 + 1, i3);
        }

        public void a0(int i2, ByteString byteString) {
            try {
                byteString.a0(this);
                k(10);
                E0(byteString.size());
                z0(i2, 2);
            } catch (IOException e2) {
                throw new RuntimeException(e2);
            }
        }

        public void b(ByteBuffer byteBuffer) {
            int remaining = byteBuffer.remaining();
            if (L0() < remaining) {
                this.f20740d += remaining;
                this.f20739c.addFirst(AllocatedBuffer.i(byteBuffer));
                I0();
            }
            int i2 = this.f20751k - remaining;
            this.f20751k = i2;
            byteBuffer.get(this.f20746f, i2 + 1, remaining);
        }

        public void b0(int i2, Object obj, Schema schema) {
            int f2 = f();
            schema.i(obj, this);
            k(10);
            E0(f() - f2);
            z0(i2, 2);
        }

        public void c(byte[] bArr, int i2, int i3) {
            if (L0() < i3) {
                this.f20740d += i3;
                this.f20739c.addFirst(AllocatedBuffer.k(bArr, i2, i3));
                I0();
                return;
            }
            int i4 = this.f20751k - i3;
            this.f20751k = i4;
            System.arraycopy(bArr, i2, this.f20746f, i4 + 1, i3);
        }

        public void d0(int i2, Object obj, Schema schema) {
            z0(i2, 4);
            schema.i(obj, this);
            z0(i2, 3);
        }

        public int f() {
            return this.f20740d + G0();
        }

        public void g0(int i2) {
            byte[] bArr = this.f20746f;
            int i3 = this.f20751k;
            int i4 = i3 - 1;
            this.f20751k = i4;
            bArr[i3] = (byte) ((i2 >> 24) & 255);
            int i5 = i3 - 2;
            this.f20751k = i5;
            bArr[i4] = (byte) ((i2 >> 16) & 255);
            int i6 = i3 - 3;
            this.f20751k = i6;
            bArr[i5] = (byte) ((i2 >> 8) & 255);
            this.f20751k = i3 - 4;
            bArr[i6] = (byte) (i2 & 255);
        }

        public void j0(long j2) {
            byte[] bArr = this.f20746f;
            int i2 = this.f20751k;
            int i3 = i2 - 1;
            this.f20751k = i3;
            bArr[i2] = (byte) (((int) (j2 >> 56)) & 255);
            int i4 = i2 - 2;
            this.f20751k = i4;
            bArr[i3] = (byte) (((int) (j2 >> 48)) & 255);
            int i5 = i2 - 3;
            this.f20751k = i5;
            bArr[i4] = (byte) (((int) (j2 >> 40)) & 255);
            int i6 = i2 - 4;
            this.f20751k = i6;
            bArr[i5] = (byte) (((int) (j2 >> 32)) & 255);
            int i7 = i2 - 5;
            this.f20751k = i7;
            bArr[i6] = (byte) (((int) (j2 >> 24)) & 255);
            int i8 = i2 - 6;
            this.f20751k = i8;
            bArr[i7] = (byte) (((int) (j2 >> 16)) & 255);
            int i9 = i2 - 7;
            this.f20751k = i9;
            bArr[i8] = (byte) (((int) (j2 >> 8)) & 255);
            this.f20751k = i2 - 8;
            bArr[i9] = (byte) (((int) j2) & 255);
        }

        public void k(int i2) {
            if (L0() < i2) {
                J0(i2);
            }
        }

        public void l(boolean z2) {
            M0(z2 ? (byte) 1 : 0);
        }

        public void o(int i2, int i3) {
            k(15);
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
            k(10);
            E0(i3);
            z0(i2, 0);
        }

        public void s(int i2, int i3) {
            k(9);
            g0(i3);
            z0(i2, 5);
        }

        public void t0(int i2) {
            E0(CodedOutputStream.R0(i2));
        }

        public void w(int i2, long j2) {
            k(13);
            j0(j2);
            z0(i2, 1);
        }

        public void w0(long j2) {
            F0(CodedOutputStream.S0(j2));
        }

        public void z(int i2, String str) {
            int f2 = f();
            N0(str);
            k(10);
            E0(f() - f2);
            z0(i2, 2);
        }

        public void z0(int i2, int i3) {
            E0(WireFormat.c(i2, i3));
        }
    }

    public static final class UnsafeDirectWriter extends BinaryWriter {

        /* renamed from: e  reason: collision with root package name */
        public ByteBuffer f20752e;

        /* renamed from: f  reason: collision with root package name */
        public long f20753f;

        /* renamed from: g  reason: collision with root package name */
        public long f20754g;

        /* renamed from: h  reason: collision with root package name */
        public long f20755h;

        private int H0() {
            return (int) (this.f20754g - this.f20755h);
        }

        private void J0() {
            L0(g());
        }

        private void K0(int i2) {
            L0(h(i2));
        }

        private void L0(AllocatedBuffer allocatedBuffer) {
            if (allocatedBuffer.d()) {
                ByteBuffer f2 = allocatedBuffer.f();
                if (f2.isDirect()) {
                    I0();
                    this.f20739c.addFirst(allocatedBuffer);
                    this.f20752e = f2;
                    Java8Compatibility.a(f2, f2.capacity());
                    Java8Compatibility.c(this.f20752e, 0);
                    long k2 = UnsafeUtil.k(this.f20752e);
                    this.f20753f = k2;
                    long limit = k2 + ((long) (this.f20752e.limit() - 1));
                    this.f20754g = limit;
                    this.f20755h = limit;
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
            long j2 = this.f20755h;
            this.f20755h = j2 - 1;
            UnsafeUtil.Q(j2, (byte) (i2 >>> 28));
            long j3 = this.f20755h;
            this.f20755h = j3 - 1;
            UnsafeUtil.Q(j3, (byte) (((i2 >>> 21) & 127) | 128));
            long j4 = this.f20755h;
            this.f20755h = j4 - 1;
            UnsafeUtil.Q(j4, (byte) (((i2 >>> 14) & 127) | 128));
            long j5 = this.f20755h;
            this.f20755h = j5 - 1;
            UnsafeUtil.Q(j5, (byte) (((i2 >>> 7) & 127) | 128));
            long j6 = this.f20755h;
            this.f20755h = j6 - 1;
            UnsafeUtil.Q(j6, (byte) ((i2 & 127) | 128));
        }

        private void Q0(int i2) {
            long j2 = this.f20755h;
            this.f20755h = j2 - 1;
            UnsafeUtil.Q(j2, (byte) (i2 >>> 21));
            long j3 = this.f20755h;
            this.f20755h = j3 - 1;
            UnsafeUtil.Q(j3, (byte) (((i2 >>> 14) & 127) | 128));
            long j4 = this.f20755h;
            this.f20755h = j4 - 1;
            UnsafeUtil.Q(j4, (byte) (((i2 >>> 7) & 127) | 128));
            long j5 = this.f20755h;
            this.f20755h = j5 - 1;
            UnsafeUtil.Q(j5, (byte) ((i2 & 127) | 128));
        }

        private void R0(int i2) {
            long j2 = this.f20755h;
            this.f20755h = j2 - 1;
            UnsafeUtil.Q(j2, (byte) i2);
        }

        private void S0(int i2) {
            long j2 = this.f20755h;
            this.f20755h = j2 - 1;
            UnsafeUtil.Q(j2, (byte) (i2 >>> 14));
            long j3 = this.f20755h;
            this.f20755h = j3 - 1;
            UnsafeUtil.Q(j3, (byte) (((i2 >>> 7) & 127) | 128));
            long j4 = this.f20755h;
            this.f20755h = j4 - 1;
            UnsafeUtil.Q(j4, (byte) ((i2 & 127) | 128));
        }

        private void T0(int i2) {
            long j2 = this.f20755h;
            this.f20755h = j2 - 1;
            UnsafeUtil.Q(j2, (byte) (i2 >>> 7));
            long j3 = this.f20755h;
            this.f20755h = j3 - 1;
            UnsafeUtil.Q(j3, (byte) ((i2 & 127) | 128));
        }

        private void U0(long j2) {
            long j3 = this.f20755h;
            this.f20755h = j3 - 1;
            UnsafeUtil.Q(j3, (byte) ((int) (j2 >>> 49)));
            long j4 = this.f20755h;
            this.f20755h = j4 - 1;
            UnsafeUtil.Q(j4, (byte) ((int) (((j2 >>> 42) & 127) | 128)));
            long j5 = this.f20755h;
            this.f20755h = j5 - 1;
            UnsafeUtil.Q(j5, (byte) ((int) (((j2 >>> 35) & 127) | 128)));
            long j6 = this.f20755h;
            this.f20755h = j6 - 1;
            UnsafeUtil.Q(j6, (byte) ((int) (((j2 >>> 28) & 127) | 128)));
            long j7 = this.f20755h;
            this.f20755h = j7 - 1;
            UnsafeUtil.Q(j7, (byte) ((int) (((j2 >>> 21) & 127) | 128)));
            long j8 = this.f20755h;
            this.f20755h = j8 - 1;
            UnsafeUtil.Q(j8, (byte) ((int) (((j2 >>> 14) & 127) | 128)));
            long j9 = this.f20755h;
            this.f20755h = j9 - 1;
            UnsafeUtil.Q(j9, (byte) ((int) (((j2 >>> 7) & 127) | 128)));
            long j10 = this.f20755h;
            this.f20755h = j10 - 1;
            UnsafeUtil.Q(j10, (byte) ((int) ((j2 & 127) | 128)));
        }

        private void V0(long j2) {
            long j3 = this.f20755h;
            this.f20755h = j3 - 1;
            UnsafeUtil.Q(j3, (byte) ((int) (j2 >>> 28)));
            long j4 = this.f20755h;
            this.f20755h = j4 - 1;
            UnsafeUtil.Q(j4, (byte) ((int) (((j2 >>> 21) & 127) | 128)));
            long j5 = this.f20755h;
            this.f20755h = j5 - 1;
            UnsafeUtil.Q(j5, (byte) ((int) (((j2 >>> 14) & 127) | 128)));
            long j6 = this.f20755h;
            this.f20755h = j6 - 1;
            UnsafeUtil.Q(j6, (byte) ((int) (((j2 >>> 7) & 127) | 128)));
            long j7 = this.f20755h;
            this.f20755h = j7 - 1;
            UnsafeUtil.Q(j7, (byte) ((int) ((j2 & 127) | 128)));
        }

        private void W0(long j2) {
            long j3 = this.f20755h;
            this.f20755h = j3 - 1;
            UnsafeUtil.Q(j3, (byte) ((int) (j2 >>> 21)));
            long j4 = this.f20755h;
            this.f20755h = j4 - 1;
            UnsafeUtil.Q(j4, (byte) ((int) (((j2 >>> 14) & 127) | 128)));
            long j5 = this.f20755h;
            this.f20755h = j5 - 1;
            UnsafeUtil.Q(j5, (byte) ((int) (((j2 >>> 7) & 127) | 128)));
            long j6 = this.f20755h;
            this.f20755h = j6 - 1;
            UnsafeUtil.Q(j6, (byte) ((int) ((j2 & 127) | 128)));
        }

        private void X0(long j2) {
            long j3 = this.f20755h;
            this.f20755h = j3 - 1;
            UnsafeUtil.Q(j3, (byte) ((int) (j2 >>> 56)));
            long j4 = this.f20755h;
            this.f20755h = j4 - 1;
            UnsafeUtil.Q(j4, (byte) ((int) (((j2 >>> 49) & 127) | 128)));
            long j5 = this.f20755h;
            this.f20755h = j5 - 1;
            UnsafeUtil.Q(j5, (byte) ((int) (((j2 >>> 42) & 127) | 128)));
            long j6 = this.f20755h;
            this.f20755h = j6 - 1;
            UnsafeUtil.Q(j6, (byte) ((int) (((j2 >>> 35) & 127) | 128)));
            long j7 = this.f20755h;
            this.f20755h = j7 - 1;
            UnsafeUtil.Q(j7, (byte) ((int) (((j2 >>> 28) & 127) | 128)));
            long j8 = this.f20755h;
            this.f20755h = j8 - 1;
            UnsafeUtil.Q(j8, (byte) ((int) (((j2 >>> 21) & 127) | 128)));
            long j9 = this.f20755h;
            this.f20755h = j9 - 1;
            UnsafeUtil.Q(j9, (byte) ((int) (((j2 >>> 14) & 127) | 128)));
            long j10 = this.f20755h;
            this.f20755h = j10 - 1;
            UnsafeUtil.Q(j10, (byte) ((int) (((j2 >>> 7) & 127) | 128)));
            long j11 = this.f20755h;
            this.f20755h = j11 - 1;
            UnsafeUtil.Q(j11, (byte) ((int) ((j2 & 127) | 128)));
        }

        private void Y0(long j2) {
            long j3 = this.f20755h;
            this.f20755h = j3 - 1;
            UnsafeUtil.Q(j3, (byte) ((int) j2));
        }

        private void Z0(long j2) {
            long j3 = this.f20755h;
            this.f20755h = j3 - 1;
            UnsafeUtil.Q(j3, (byte) ((int) (j2 >>> 42)));
            long j4 = this.f20755h;
            this.f20755h = j4 - 1;
            UnsafeUtil.Q(j4, (byte) ((int) (((j2 >>> 35) & 127) | 128)));
            long j5 = this.f20755h;
            this.f20755h = j5 - 1;
            UnsafeUtil.Q(j5, (byte) ((int) (((j2 >>> 28) & 127) | 128)));
            long j6 = this.f20755h;
            this.f20755h = j6 - 1;
            UnsafeUtil.Q(j6, (byte) ((int) (((j2 >>> 21) & 127) | 128)));
            long j7 = this.f20755h;
            this.f20755h = j7 - 1;
            UnsafeUtil.Q(j7, (byte) ((int) (((j2 >>> 14) & 127) | 128)));
            long j8 = this.f20755h;
            this.f20755h = j8 - 1;
            UnsafeUtil.Q(j8, (byte) ((int) (((j2 >>> 7) & 127) | 128)));
            long j9 = this.f20755h;
            this.f20755h = j9 - 1;
            UnsafeUtil.Q(j9, (byte) ((int) ((j2 & 127) | 128)));
        }

        private void a1(long j2) {
            long j3 = this.f20755h;
            this.f20755h = j3 - 1;
            UnsafeUtil.Q(j3, (byte) ((int) (j2 >>> 35)));
            long j4 = this.f20755h;
            this.f20755h = j4 - 1;
            UnsafeUtil.Q(j4, (byte) ((int) (((j2 >>> 28) & 127) | 128)));
            long j5 = this.f20755h;
            this.f20755h = j5 - 1;
            UnsafeUtil.Q(j5, (byte) ((int) (((j2 >>> 21) & 127) | 128)));
            long j6 = this.f20755h;
            this.f20755h = j6 - 1;
            UnsafeUtil.Q(j6, (byte) ((int) (((j2 >>> 14) & 127) | 128)));
            long j7 = this.f20755h;
            this.f20755h = j7 - 1;
            UnsafeUtil.Q(j7, (byte) ((int) (((j2 >>> 7) & 127) | 128)));
            long j8 = this.f20755h;
            this.f20755h = j8 - 1;
            UnsafeUtil.Q(j8, (byte) ((int) ((j2 & 127) | 128)));
        }

        private void b1(long j2) {
            long j3 = this.f20755h;
            this.f20755h = j3 - 1;
            UnsafeUtil.Q(j3, (byte) ((int) (j2 >>> 63)));
            long j4 = this.f20755h;
            this.f20755h = j4 - 1;
            UnsafeUtil.Q(j4, (byte) ((int) (((j2 >>> 56) & 127) | 128)));
            long j5 = this.f20755h;
            this.f20755h = j5 - 1;
            UnsafeUtil.Q(j5, (byte) ((int) (((j2 >>> 49) & 127) | 128)));
            long j6 = this.f20755h;
            this.f20755h = j6 - 1;
            UnsafeUtil.Q(j6, (byte) ((int) (((j2 >>> 42) & 127) | 128)));
            long j7 = this.f20755h;
            this.f20755h = j7 - 1;
            UnsafeUtil.Q(j7, (byte) ((int) (((j2 >>> 35) & 127) | 128)));
            long j8 = this.f20755h;
            this.f20755h = j8 - 1;
            UnsafeUtil.Q(j8, (byte) ((int) (((j2 >>> 28) & 127) | 128)));
            long j9 = this.f20755h;
            this.f20755h = j9 - 1;
            UnsafeUtil.Q(j9, (byte) ((int) (((j2 >>> 21) & 127) | 128)));
            long j10 = this.f20755h;
            this.f20755h = j10 - 1;
            UnsafeUtil.Q(j10, (byte) ((int) (((j2 >>> 14) & 127) | 128)));
            long j11 = this.f20755h;
            this.f20755h = j11 - 1;
            UnsafeUtil.Q(j11, (byte) ((int) (((j2 >>> 7) & 127) | 128)));
            long j12 = this.f20755h;
            this.f20755h = j12 - 1;
            UnsafeUtil.Q(j12, (byte) ((int) ((j2 & 127) | 128)));
        }

        private void c1(long j2) {
            long j3 = this.f20755h;
            this.f20755h = j3 - 1;
            UnsafeUtil.Q(j3, (byte) (((int) j2) >>> 14));
            long j4 = this.f20755h;
            this.f20755h = j4 - 1;
            UnsafeUtil.Q(j4, (byte) ((int) (((j2 >>> 7) & 127) | 128)));
            long j5 = this.f20755h;
            this.f20755h = j5 - 1;
            UnsafeUtil.Q(j5, (byte) ((int) ((j2 & 127) | 128)));
        }

        private void d1(long j2) {
            long j3 = this.f20755h;
            this.f20755h = j3 - 1;
            UnsafeUtil.Q(j3, (byte) ((int) (j2 >>> 7)));
            long j4 = this.f20755h;
            this.f20755h = j4 - 1;
            UnsafeUtil.Q(j4, (byte) ((((int) j2) & 127) | 128));
        }

        public void A(int i2, long j2) {
            k(15);
            F0(j2);
            z0(i2, 0);
        }

        public void B(int i2, Object obj) {
            int f2 = f();
            Protobuf.a().e(obj, this);
            k(10);
            E0(f() - f2);
            z0(i2, 2);
        }

        public void E(int i2, boolean z2) {
            k(6);
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
            switch (BinaryWriter.e(j2)) {
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
            return (int) (this.f20755h - this.f20753f);
        }

        public void I0() {
            if (this.f20752e != null) {
                this.f20740d += H0();
                Java8Compatibility.c(this.f20752e, G0() + 1);
                this.f20752e = null;
                this.f20755h = 0;
                this.f20754g = 0;
            }
        }

        public void N0(byte b2) {
            long j2 = this.f20755h;
            this.f20755h = j2 - 1;
            UnsafeUtil.Q(j2, b2);
        }

        public void O(int i2, long j2) {
            k(15);
            w0(j2);
            z0(i2, 0);
        }

        public void O0(String str) {
            char charAt;
            k(str.length());
            int length = str.length();
            while (true) {
                length--;
                if (length >= 0 && (charAt = str.charAt(length)) < 128) {
                    long j2 = this.f20755h;
                    this.f20755h = j2 - 1;
                    UnsafeUtil.Q(j2, (byte) charAt);
                }
            }
            if (length != -1) {
                while (length >= 0) {
                    char charAt2 = str.charAt(length);
                    if (charAt2 < 128) {
                        long j3 = this.f20755h;
                        if (j3 >= this.f20753f) {
                            this.f20755h = j3 - 1;
                            UnsafeUtil.Q(j3, (byte) charAt2);
                            length--;
                        }
                    }
                    if (charAt2 < 2048) {
                        long j4 = this.f20755h;
                        if (j4 > this.f20753f) {
                            this.f20755h = j4 - 1;
                            UnsafeUtil.Q(j4, (byte) ((charAt2 & '?') | 128));
                            long j5 = this.f20755h;
                            this.f20755h = j5 - 1;
                            UnsafeUtil.Q(j5, (byte) ((charAt2 >>> 6) | 960));
                            length--;
                        }
                    }
                    if (charAt2 < 55296 || 57343 < charAt2) {
                        long j6 = this.f20755h;
                        if (j6 > this.f20753f + 1) {
                            this.f20755h = j6 - 1;
                            UnsafeUtil.Q(j6, (byte) ((charAt2 & '?') | 128));
                            long j7 = this.f20755h;
                            this.f20755h = j7 - 1;
                            UnsafeUtil.Q(j7, (byte) (((charAt2 >>> 6) & 63) | 128));
                            long j8 = this.f20755h;
                            this.f20755h = j8 - 1;
                            UnsafeUtil.Q(j8, (byte) ((charAt2 >>> 12) | 480));
                            length--;
                        }
                    }
                    if (this.f20755h > this.f20753f + 2) {
                        if (length != 0) {
                            char charAt3 = str.charAt(length - 1);
                            if (Character.isSurrogatePair(charAt3, charAt2)) {
                                length--;
                                int codePoint = Character.toCodePoint(charAt3, charAt2);
                                long j9 = this.f20755h;
                                this.f20755h = j9 - 1;
                                UnsafeUtil.Q(j9, (byte) ((codePoint & 63) | 128));
                                long j10 = this.f20755h;
                                this.f20755h = j10 - 1;
                                UnsafeUtil.Q(j10, (byte) (((codePoint >>> 6) & 63) | 128));
                                long j11 = this.f20755h;
                                this.f20755h = j11 - 1;
                                UnsafeUtil.Q(j11, (byte) (((codePoint >>> 12) & 63) | 128));
                                long j12 = this.f20755h;
                                this.f20755h = j12 - 1;
                                UnsafeUtil.Q(j12, (byte) ((codePoint >>> 18) | 240));
                            }
                        }
                        throw new Utf8.UnpairedSurrogateException(length - 1, length);
                    }
                    k(length);
                    length++;
                    length--;
                }
            }
        }

        public void Q(int i2) {
            z0(i2, 4);
        }

        public void W(int i2, int i3) {
            k(10);
            t0(i3);
            z0(i2, 0);
        }

        public void a(byte[] bArr, int i2, int i3) {
            if (M0() < i3) {
                K0(i3);
            }
            this.f20755h -= (long) i3;
            Java8Compatibility.c(this.f20752e, G0() + 1);
            this.f20752e.put(bArr, i2, i3);
        }

        public void a0(int i2, ByteString byteString) {
            try {
                byteString.a0(this);
                k(10);
                E0(byteString.size());
                z0(i2, 2);
            } catch (IOException e2) {
                throw new RuntimeException(e2);
            }
        }

        public void b(ByteBuffer byteBuffer) {
            int remaining = byteBuffer.remaining();
            if (M0() < remaining) {
                this.f20740d += remaining;
                this.f20739c.addFirst(AllocatedBuffer.i(byteBuffer));
                J0();
                return;
            }
            this.f20755h -= (long) remaining;
            Java8Compatibility.c(this.f20752e, G0() + 1);
            this.f20752e.put(byteBuffer);
        }

        public void b0(int i2, Object obj, Schema schema) {
            int f2 = f();
            schema.i(obj, this);
            k(10);
            E0(f() - f2);
            z0(i2, 2);
        }

        public void c(byte[] bArr, int i2, int i3) {
            if (M0() < i3) {
                this.f20740d += i3;
                this.f20739c.addFirst(AllocatedBuffer.k(bArr, i2, i3));
                J0();
                return;
            }
            this.f20755h -= (long) i3;
            Java8Compatibility.c(this.f20752e, G0() + 1);
            this.f20752e.put(bArr, i2, i3);
        }

        public void d0(int i2, Object obj, Schema schema) {
            z0(i2, 4);
            schema.i(obj, this);
            z0(i2, 3);
        }

        public int f() {
            return this.f20740d + H0();
        }

        public void g0(int i2) {
            long j2 = this.f20755h;
            this.f20755h = j2 - 1;
            UnsafeUtil.Q(j2, (byte) ((i2 >> 24) & 255));
            long j3 = this.f20755h;
            this.f20755h = j3 - 1;
            UnsafeUtil.Q(j3, (byte) ((i2 >> 16) & 255));
            long j4 = this.f20755h;
            this.f20755h = j4 - 1;
            UnsafeUtil.Q(j4, (byte) ((i2 >> 8) & 255));
            long j5 = this.f20755h;
            this.f20755h = j5 - 1;
            UnsafeUtil.Q(j5, (byte) (i2 & 255));
        }

        public void j0(long j2) {
            long j3 = this.f20755h;
            this.f20755h = j3 - 1;
            UnsafeUtil.Q(j3, (byte) (((int) (j2 >> 56)) & 255));
            long j4 = this.f20755h;
            this.f20755h = j4 - 1;
            UnsafeUtil.Q(j4, (byte) (((int) (j2 >> 48)) & 255));
            long j5 = this.f20755h;
            this.f20755h = j5 - 1;
            UnsafeUtil.Q(j5, (byte) (((int) (j2 >> 40)) & 255));
            long j6 = this.f20755h;
            this.f20755h = j6 - 1;
            UnsafeUtil.Q(j6, (byte) (((int) (j2 >> 32)) & 255));
            long j7 = this.f20755h;
            this.f20755h = j7 - 1;
            UnsafeUtil.Q(j7, (byte) (((int) (j2 >> 24)) & 255));
            long j8 = this.f20755h;
            this.f20755h = j8 - 1;
            UnsafeUtil.Q(j8, (byte) (((int) (j2 >> 16)) & 255));
            long j9 = this.f20755h;
            this.f20755h = j9 - 1;
            UnsafeUtil.Q(j9, (byte) (((int) (j2 >> 8)) & 255));
            long j10 = this.f20755h;
            this.f20755h = j10 - 1;
            UnsafeUtil.Q(j10, (byte) (((int) j2) & 255));
        }

        public void k(int i2) {
            if (M0() < i2) {
                K0(i2);
            }
        }

        public void l(boolean z2) {
            N0(z2 ? (byte) 1 : 0);
        }

        public void o(int i2, int i3) {
            k(15);
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
            k(10);
            E0(i3);
            z0(i2, 0);
        }

        public void s(int i2, int i3) {
            k(9);
            g0(i3);
            z0(i2, 5);
        }

        public void t0(int i2) {
            E0(CodedOutputStream.R0(i2));
        }

        public void w(int i2, long j2) {
            k(13);
            j0(j2);
            z0(i2, 1);
        }

        public void w0(long j2) {
            F0(CodedOutputStream.S0(j2));
        }

        public void z(int i2, String str) {
            int f2 = f();
            O0(str);
            k(10);
            E0(f() - f2);
            z0(i2, 2);
        }

        public void z0(int i2, int i3) {
            E0(WireFormat.c(i2, i3));
        }
    }

    public static final class UnsafeHeapWriter extends BinaryWriter {

        /* renamed from: e  reason: collision with root package name */
        public AllocatedBuffer f20756e;

        /* renamed from: f  reason: collision with root package name */
        public byte[] f20757f;

        /* renamed from: g  reason: collision with root package name */
        public long f20758g;

        /* renamed from: h  reason: collision with root package name */
        public long f20759h;

        /* renamed from: i  reason: collision with root package name */
        public long f20760i;

        /* renamed from: j  reason: collision with root package name */
        public long f20761j;

        /* renamed from: k  reason: collision with root package name */
        public long f20762k;

        private void J0() {
            L0(i());
        }

        private void K0(int i2) {
            L0(j(i2));
        }

        private void L0(AllocatedBuffer allocatedBuffer) {
            if (allocatedBuffer.c()) {
                I0();
                this.f20739c.addFirst(allocatedBuffer);
                this.f20756e = allocatedBuffer;
                this.f20757f = allocatedBuffer.a();
                long b2 = (long) allocatedBuffer.b();
                this.f20759h = ((long) allocatedBuffer.e()) + b2;
                long g2 = b2 + ((long) allocatedBuffer.g());
                this.f20758g = g2;
                this.f20760i = g2 - 1;
                long j2 = this.f20759h - 1;
                this.f20761j = j2;
                this.f20762k = j2;
                return;
            }
            throw new RuntimeException("Allocator returned non-heap buffer");
        }

        private void P0(int i2) {
            byte[] bArr = this.f20757f;
            long j2 = this.f20762k;
            this.f20762k = j2 - 1;
            UnsafeUtil.R(bArr, j2, (byte) (i2 >>> 28));
            byte[] bArr2 = this.f20757f;
            long j3 = this.f20762k;
            this.f20762k = j3 - 1;
            UnsafeUtil.R(bArr2, j3, (byte) (((i2 >>> 21) & 127) | 128));
            byte[] bArr3 = this.f20757f;
            long j4 = this.f20762k;
            this.f20762k = j4 - 1;
            UnsafeUtil.R(bArr3, j4, (byte) (((i2 >>> 14) & 127) | 128));
            byte[] bArr4 = this.f20757f;
            long j5 = this.f20762k;
            this.f20762k = j5 - 1;
            UnsafeUtil.R(bArr4, j5, (byte) (((i2 >>> 7) & 127) | 128));
            byte[] bArr5 = this.f20757f;
            long j6 = this.f20762k;
            this.f20762k = j6 - 1;
            UnsafeUtil.R(bArr5, j6, (byte) ((i2 & 127) | 128));
        }

        private void Q0(int i2) {
            byte[] bArr = this.f20757f;
            long j2 = this.f20762k;
            this.f20762k = j2 - 1;
            UnsafeUtil.R(bArr, j2, (byte) (i2 >>> 21));
            byte[] bArr2 = this.f20757f;
            long j3 = this.f20762k;
            this.f20762k = j3 - 1;
            UnsafeUtil.R(bArr2, j3, (byte) (((i2 >>> 14) & 127) | 128));
            byte[] bArr3 = this.f20757f;
            long j4 = this.f20762k;
            this.f20762k = j4 - 1;
            UnsafeUtil.R(bArr3, j4, (byte) (((i2 >>> 7) & 127) | 128));
            byte[] bArr4 = this.f20757f;
            long j5 = this.f20762k;
            this.f20762k = j5 - 1;
            UnsafeUtil.R(bArr4, j5, (byte) ((i2 & 127) | 128));
        }

        private void R0(int i2) {
            byte[] bArr = this.f20757f;
            long j2 = this.f20762k;
            this.f20762k = j2 - 1;
            UnsafeUtil.R(bArr, j2, (byte) i2);
        }

        private void S0(int i2) {
            byte[] bArr = this.f20757f;
            long j2 = this.f20762k;
            this.f20762k = j2 - 1;
            UnsafeUtil.R(bArr, j2, (byte) (i2 >>> 14));
            byte[] bArr2 = this.f20757f;
            long j3 = this.f20762k;
            this.f20762k = j3 - 1;
            UnsafeUtil.R(bArr2, j3, (byte) (((i2 >>> 7) & 127) | 128));
            byte[] bArr3 = this.f20757f;
            long j4 = this.f20762k;
            this.f20762k = j4 - 1;
            UnsafeUtil.R(bArr3, j4, (byte) ((i2 & 127) | 128));
        }

        private void T0(int i2) {
            byte[] bArr = this.f20757f;
            long j2 = this.f20762k;
            this.f20762k = j2 - 1;
            UnsafeUtil.R(bArr, j2, (byte) (i2 >>> 7));
            byte[] bArr2 = this.f20757f;
            long j3 = this.f20762k;
            this.f20762k = j3 - 1;
            UnsafeUtil.R(bArr2, j3, (byte) ((i2 & 127) | 128));
        }

        private void U0(long j2) {
            byte[] bArr = this.f20757f;
            long j3 = this.f20762k;
            this.f20762k = j3 - 1;
            UnsafeUtil.R(bArr, j3, (byte) ((int) (j2 >>> 49)));
            byte[] bArr2 = this.f20757f;
            long j4 = this.f20762k;
            this.f20762k = j4 - 1;
            UnsafeUtil.R(bArr2, j4, (byte) ((int) (((j2 >>> 42) & 127) | 128)));
            byte[] bArr3 = this.f20757f;
            long j5 = this.f20762k;
            this.f20762k = j5 - 1;
            UnsafeUtil.R(bArr3, j5, (byte) ((int) (((j2 >>> 35) & 127) | 128)));
            byte[] bArr4 = this.f20757f;
            long j6 = this.f20762k;
            this.f20762k = j6 - 1;
            UnsafeUtil.R(bArr4, j6, (byte) ((int) (((j2 >>> 28) & 127) | 128)));
            byte[] bArr5 = this.f20757f;
            long j7 = this.f20762k;
            this.f20762k = j7 - 1;
            UnsafeUtil.R(bArr5, j7, (byte) ((int) (((j2 >>> 21) & 127) | 128)));
            byte[] bArr6 = this.f20757f;
            long j8 = this.f20762k;
            this.f20762k = j8 - 1;
            UnsafeUtil.R(bArr6, j8, (byte) ((int) (((j2 >>> 14) & 127) | 128)));
            byte[] bArr7 = this.f20757f;
            long j9 = this.f20762k;
            this.f20762k = j9 - 1;
            UnsafeUtil.R(bArr7, j9, (byte) ((int) (((j2 >>> 7) & 127) | 128)));
            byte[] bArr8 = this.f20757f;
            long j10 = this.f20762k;
            this.f20762k = j10 - 1;
            UnsafeUtil.R(bArr8, j10, (byte) ((int) ((j2 & 127) | 128)));
        }

        private void V0(long j2) {
            byte[] bArr = this.f20757f;
            long j3 = this.f20762k;
            this.f20762k = j3 - 1;
            UnsafeUtil.R(bArr, j3, (byte) ((int) (j2 >>> 28)));
            byte[] bArr2 = this.f20757f;
            long j4 = this.f20762k;
            this.f20762k = j4 - 1;
            UnsafeUtil.R(bArr2, j4, (byte) ((int) (((j2 >>> 21) & 127) | 128)));
            byte[] bArr3 = this.f20757f;
            long j5 = this.f20762k;
            this.f20762k = j5 - 1;
            UnsafeUtil.R(bArr3, j5, (byte) ((int) (((j2 >>> 14) & 127) | 128)));
            byte[] bArr4 = this.f20757f;
            long j6 = this.f20762k;
            this.f20762k = j6 - 1;
            UnsafeUtil.R(bArr4, j6, (byte) ((int) (((j2 >>> 7) & 127) | 128)));
            byte[] bArr5 = this.f20757f;
            long j7 = this.f20762k;
            this.f20762k = j7 - 1;
            UnsafeUtil.R(bArr5, j7, (byte) ((int) ((j2 & 127) | 128)));
        }

        private void W0(long j2) {
            byte[] bArr = this.f20757f;
            long j3 = this.f20762k;
            this.f20762k = j3 - 1;
            UnsafeUtil.R(bArr, j3, (byte) ((int) (j2 >>> 21)));
            byte[] bArr2 = this.f20757f;
            long j4 = this.f20762k;
            this.f20762k = j4 - 1;
            UnsafeUtil.R(bArr2, j4, (byte) ((int) (((j2 >>> 14) & 127) | 128)));
            byte[] bArr3 = this.f20757f;
            long j5 = this.f20762k;
            this.f20762k = j5 - 1;
            UnsafeUtil.R(bArr3, j5, (byte) ((int) (((j2 >>> 7) & 127) | 128)));
            byte[] bArr4 = this.f20757f;
            long j6 = this.f20762k;
            this.f20762k = j6 - 1;
            UnsafeUtil.R(bArr4, j6, (byte) ((int) ((j2 & 127) | 128)));
        }

        private void X0(long j2) {
            byte[] bArr = this.f20757f;
            long j3 = this.f20762k;
            this.f20762k = j3 - 1;
            UnsafeUtil.R(bArr, j3, (byte) ((int) (j2 >>> 56)));
            byte[] bArr2 = this.f20757f;
            long j4 = this.f20762k;
            this.f20762k = j4 - 1;
            UnsafeUtil.R(bArr2, j4, (byte) ((int) (((j2 >>> 49) & 127) | 128)));
            byte[] bArr3 = this.f20757f;
            long j5 = this.f20762k;
            this.f20762k = j5 - 1;
            UnsafeUtil.R(bArr3, j5, (byte) ((int) (((j2 >>> 42) & 127) | 128)));
            byte[] bArr4 = this.f20757f;
            long j6 = this.f20762k;
            this.f20762k = j6 - 1;
            UnsafeUtil.R(bArr4, j6, (byte) ((int) (((j2 >>> 35) & 127) | 128)));
            byte[] bArr5 = this.f20757f;
            long j7 = this.f20762k;
            this.f20762k = j7 - 1;
            UnsafeUtil.R(bArr5, j7, (byte) ((int) (((j2 >>> 28) & 127) | 128)));
            byte[] bArr6 = this.f20757f;
            long j8 = this.f20762k;
            this.f20762k = j8 - 1;
            UnsafeUtil.R(bArr6, j8, (byte) ((int) (((j2 >>> 21) & 127) | 128)));
            byte[] bArr7 = this.f20757f;
            long j9 = this.f20762k;
            this.f20762k = j9 - 1;
            UnsafeUtil.R(bArr7, j9, (byte) ((int) (((j2 >>> 14) & 127) | 128)));
            byte[] bArr8 = this.f20757f;
            long j10 = this.f20762k;
            this.f20762k = j10 - 1;
            UnsafeUtil.R(bArr8, j10, (byte) ((int) (((j2 >>> 7) & 127) | 128)));
            byte[] bArr9 = this.f20757f;
            long j11 = this.f20762k;
            this.f20762k = j11 - 1;
            UnsafeUtil.R(bArr9, j11, (byte) ((int) ((j2 & 127) | 128)));
        }

        private void Y0(long j2) {
            byte[] bArr = this.f20757f;
            long j3 = this.f20762k;
            this.f20762k = j3 - 1;
            UnsafeUtil.R(bArr, j3, (byte) ((int) j2));
        }

        private void Z0(long j2) {
            byte[] bArr = this.f20757f;
            long j3 = this.f20762k;
            this.f20762k = j3 - 1;
            UnsafeUtil.R(bArr, j3, (byte) ((int) (j2 >>> 42)));
            byte[] bArr2 = this.f20757f;
            long j4 = this.f20762k;
            this.f20762k = j4 - 1;
            UnsafeUtil.R(bArr2, j4, (byte) ((int) (((j2 >>> 35) & 127) | 128)));
            byte[] bArr3 = this.f20757f;
            long j5 = this.f20762k;
            this.f20762k = j5 - 1;
            UnsafeUtil.R(bArr3, j5, (byte) ((int) (((j2 >>> 28) & 127) | 128)));
            byte[] bArr4 = this.f20757f;
            long j6 = this.f20762k;
            this.f20762k = j6 - 1;
            UnsafeUtil.R(bArr4, j6, (byte) ((int) (((j2 >>> 21) & 127) | 128)));
            byte[] bArr5 = this.f20757f;
            long j7 = this.f20762k;
            this.f20762k = j7 - 1;
            UnsafeUtil.R(bArr5, j7, (byte) ((int) (((j2 >>> 14) & 127) | 128)));
            byte[] bArr6 = this.f20757f;
            long j8 = this.f20762k;
            this.f20762k = j8 - 1;
            UnsafeUtil.R(bArr6, j8, (byte) ((int) (((j2 >>> 7) & 127) | 128)));
            byte[] bArr7 = this.f20757f;
            long j9 = this.f20762k;
            this.f20762k = j9 - 1;
            UnsafeUtil.R(bArr7, j9, (byte) ((int) ((j2 & 127) | 128)));
        }

        private void a1(long j2) {
            byte[] bArr = this.f20757f;
            long j3 = this.f20762k;
            this.f20762k = j3 - 1;
            UnsafeUtil.R(bArr, j3, (byte) ((int) (j2 >>> 35)));
            byte[] bArr2 = this.f20757f;
            long j4 = this.f20762k;
            this.f20762k = j4 - 1;
            UnsafeUtil.R(bArr2, j4, (byte) ((int) (((j2 >>> 28) & 127) | 128)));
            byte[] bArr3 = this.f20757f;
            long j5 = this.f20762k;
            this.f20762k = j5 - 1;
            UnsafeUtil.R(bArr3, j5, (byte) ((int) (((j2 >>> 21) & 127) | 128)));
            byte[] bArr4 = this.f20757f;
            long j6 = this.f20762k;
            this.f20762k = j6 - 1;
            UnsafeUtil.R(bArr4, j6, (byte) ((int) (((j2 >>> 14) & 127) | 128)));
            byte[] bArr5 = this.f20757f;
            long j7 = this.f20762k;
            this.f20762k = j7 - 1;
            UnsafeUtil.R(bArr5, j7, (byte) ((int) (((j2 >>> 7) & 127) | 128)));
            byte[] bArr6 = this.f20757f;
            long j8 = this.f20762k;
            this.f20762k = j8 - 1;
            UnsafeUtil.R(bArr6, j8, (byte) ((int) ((j2 & 127) | 128)));
        }

        private void b1(long j2) {
            byte[] bArr = this.f20757f;
            long j3 = this.f20762k;
            this.f20762k = j3 - 1;
            UnsafeUtil.R(bArr, j3, (byte) ((int) (j2 >>> 63)));
            byte[] bArr2 = this.f20757f;
            long j4 = this.f20762k;
            this.f20762k = j4 - 1;
            UnsafeUtil.R(bArr2, j4, (byte) ((int) (((j2 >>> 56) & 127) | 128)));
            byte[] bArr3 = this.f20757f;
            long j5 = this.f20762k;
            this.f20762k = j5 - 1;
            UnsafeUtil.R(bArr3, j5, (byte) ((int) (((j2 >>> 49) & 127) | 128)));
            byte[] bArr4 = this.f20757f;
            long j6 = this.f20762k;
            this.f20762k = j6 - 1;
            UnsafeUtil.R(bArr4, j6, (byte) ((int) (((j2 >>> 42) & 127) | 128)));
            byte[] bArr5 = this.f20757f;
            long j7 = this.f20762k;
            this.f20762k = j7 - 1;
            UnsafeUtil.R(bArr5, j7, (byte) ((int) (((j2 >>> 35) & 127) | 128)));
            byte[] bArr6 = this.f20757f;
            long j8 = this.f20762k;
            this.f20762k = j8 - 1;
            UnsafeUtil.R(bArr6, j8, (byte) ((int) (((j2 >>> 28) & 127) | 128)));
            byte[] bArr7 = this.f20757f;
            long j9 = this.f20762k;
            this.f20762k = j9 - 1;
            UnsafeUtil.R(bArr7, j9, (byte) ((int) (((j2 >>> 21) & 127) | 128)));
            byte[] bArr8 = this.f20757f;
            long j10 = this.f20762k;
            this.f20762k = j10 - 1;
            UnsafeUtil.R(bArr8, j10, (byte) ((int) (((j2 >>> 14) & 127) | 128)));
            byte[] bArr9 = this.f20757f;
            long j11 = this.f20762k;
            this.f20762k = j11 - 1;
            UnsafeUtil.R(bArr9, j11, (byte) ((int) (((j2 >>> 7) & 127) | 128)));
            byte[] bArr10 = this.f20757f;
            long j12 = this.f20762k;
            this.f20762k = j12 - 1;
            UnsafeUtil.R(bArr10, j12, (byte) ((int) ((j2 & 127) | 128)));
        }

        private void c1(long j2) {
            byte[] bArr = this.f20757f;
            long j3 = this.f20762k;
            this.f20762k = j3 - 1;
            UnsafeUtil.R(bArr, j3, (byte) (((int) j2) >>> 14));
            byte[] bArr2 = this.f20757f;
            long j4 = this.f20762k;
            this.f20762k = j4 - 1;
            UnsafeUtil.R(bArr2, j4, (byte) ((int) (((j2 >>> 7) & 127) | 128)));
            byte[] bArr3 = this.f20757f;
            long j5 = this.f20762k;
            this.f20762k = j5 - 1;
            UnsafeUtil.R(bArr3, j5, (byte) ((int) ((j2 & 127) | 128)));
        }

        private void d1(long j2) {
            byte[] bArr = this.f20757f;
            long j3 = this.f20762k;
            this.f20762k = j3 - 1;
            UnsafeUtil.R(bArr, j3, (byte) ((int) (j2 >>> 7)));
            byte[] bArr2 = this.f20757f;
            long j4 = this.f20762k;
            this.f20762k = j4 - 1;
            UnsafeUtil.R(bArr2, j4, (byte) ((((int) j2) & 127) | 128));
        }

        public void A(int i2, long j2) {
            k(15);
            F0(j2);
            z0(i2, 0);
        }

        public void B(int i2, Object obj) {
            int f2 = f();
            Protobuf.a().e(obj, this);
            k(10);
            E0(f() - f2);
            z0(i2, 2);
        }

        public void E(int i2, boolean z2) {
            k(6);
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
            switch (BinaryWriter.e(j2)) {
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
            return (int) this.f20762k;
        }

        public int H0() {
            return (int) (this.f20761j - this.f20762k);
        }

        public void I0() {
            if (this.f20756e != null) {
                this.f20740d += H0();
                this.f20756e.h((G0() - this.f20756e.b()) + 1);
                this.f20756e = null;
                this.f20762k = 0;
                this.f20761j = 0;
            }
        }

        public int M0() {
            return (int) (this.f20762k - this.f20760i);
        }

        public void N0(byte b2) {
            byte[] bArr = this.f20757f;
            long j2 = this.f20762k;
            this.f20762k = j2 - 1;
            UnsafeUtil.R(bArr, j2, b2);
        }

        public void O(int i2, long j2) {
            k(15);
            w0(j2);
            z0(i2, 0);
        }

        public void O0(String str) {
            char charAt;
            k(str.length());
            int length = str.length();
            while (true) {
                length--;
                if (length >= 0 && (charAt = str.charAt(length)) < 128) {
                    byte[] bArr = this.f20757f;
                    long j2 = this.f20762k;
                    this.f20762k = j2 - 1;
                    UnsafeUtil.R(bArr, j2, (byte) charAt);
                }
            }
            if (length != -1) {
                while (length >= 0) {
                    char charAt2 = str.charAt(length);
                    if (charAt2 < 128) {
                        long j3 = this.f20762k;
                        if (j3 > this.f20760i) {
                            byte[] bArr2 = this.f20757f;
                            this.f20762k = j3 - 1;
                            UnsafeUtil.R(bArr2, j3, (byte) charAt2);
                            length--;
                        }
                    }
                    if (charAt2 < 2048) {
                        long j4 = this.f20762k;
                        if (j4 > this.f20758g) {
                            byte[] bArr3 = this.f20757f;
                            this.f20762k = j4 - 1;
                            UnsafeUtil.R(bArr3, j4, (byte) ((charAt2 & '?') | 128));
                            byte[] bArr4 = this.f20757f;
                            long j5 = this.f20762k;
                            this.f20762k = j5 - 1;
                            UnsafeUtil.R(bArr4, j5, (byte) ((charAt2 >>> 6) | 960));
                            length--;
                        }
                    }
                    if (charAt2 < 55296 || 57343 < charAt2) {
                        long j6 = this.f20762k;
                        if (j6 > this.f20758g + 1) {
                            byte[] bArr5 = this.f20757f;
                            this.f20762k = j6 - 1;
                            UnsafeUtil.R(bArr5, j6, (byte) ((charAt2 & '?') | 128));
                            byte[] bArr6 = this.f20757f;
                            long j7 = this.f20762k;
                            this.f20762k = j7 - 1;
                            UnsafeUtil.R(bArr6, j7, (byte) (((charAt2 >>> 6) & 63) | 128));
                            byte[] bArr7 = this.f20757f;
                            long j8 = this.f20762k;
                            this.f20762k = j8 - 1;
                            UnsafeUtil.R(bArr7, j8, (byte) ((charAt2 >>> 12) | 480));
                            length--;
                        }
                    }
                    if (this.f20762k > this.f20758g + 2) {
                        if (length != 0) {
                            char charAt3 = str.charAt(length - 1);
                            if (Character.isSurrogatePair(charAt3, charAt2)) {
                                length--;
                                int codePoint = Character.toCodePoint(charAt3, charAt2);
                                byte[] bArr8 = this.f20757f;
                                long j9 = this.f20762k;
                                this.f20762k = j9 - 1;
                                UnsafeUtil.R(bArr8, j9, (byte) ((codePoint & 63) | 128));
                                byte[] bArr9 = this.f20757f;
                                long j10 = this.f20762k;
                                this.f20762k = j10 - 1;
                                UnsafeUtil.R(bArr9, j10, (byte) (((codePoint >>> 6) & 63) | 128));
                                byte[] bArr10 = this.f20757f;
                                long j11 = this.f20762k;
                                this.f20762k = j11 - 1;
                                UnsafeUtil.R(bArr10, j11, (byte) (((codePoint >>> 12) & 63) | 128));
                                byte[] bArr11 = this.f20757f;
                                long j12 = this.f20762k;
                                this.f20762k = j12 - 1;
                                UnsafeUtil.R(bArr11, j12, (byte) ((codePoint >>> 18) | 240));
                            }
                        }
                        throw new Utf8.UnpairedSurrogateException(length - 1, length);
                    }
                    k(length);
                    length++;
                    length--;
                }
            }
        }

        public void Q(int i2) {
            z0(i2, 4);
        }

        public void W(int i2, int i3) {
            k(10);
            t0(i3);
            z0(i2, 0);
        }

        public void a(byte[] bArr, int i2, int i3) {
            if (i2 < 0 || i2 + i3 > bArr.length) {
                throw new ArrayIndexOutOfBoundsException(String.format("value.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i2), Integer.valueOf(i3)}));
            }
            k(i3);
            this.f20762k -= (long) i3;
            System.arraycopy(bArr, i2, this.f20757f, G0() + 1, i3);
        }

        public void a0(int i2, ByteString byteString) {
            try {
                byteString.a0(this);
                k(10);
                E0(byteString.size());
                z0(i2, 2);
            } catch (IOException e2) {
                throw new RuntimeException(e2);
            }
        }

        public void b(ByteBuffer byteBuffer) {
            int remaining = byteBuffer.remaining();
            if (M0() < remaining) {
                this.f20740d += remaining;
                this.f20739c.addFirst(AllocatedBuffer.i(byteBuffer));
                J0();
            }
            this.f20762k -= (long) remaining;
            byteBuffer.get(this.f20757f, G0() + 1, remaining);
        }

        public void b0(int i2, Object obj, Schema schema) {
            int f2 = f();
            schema.i(obj, this);
            k(10);
            E0(f() - f2);
            z0(i2, 2);
        }

        public void c(byte[] bArr, int i2, int i3) {
            if (i2 < 0 || i2 + i3 > bArr.length) {
                throw new ArrayIndexOutOfBoundsException(String.format("value.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i2), Integer.valueOf(i3)}));
            } else if (M0() < i3) {
                this.f20740d += i3;
                this.f20739c.addFirst(AllocatedBuffer.k(bArr, i2, i3));
                J0();
            } else {
                this.f20762k -= (long) i3;
                System.arraycopy(bArr, i2, this.f20757f, G0() + 1, i3);
            }
        }

        public void d0(int i2, Object obj, Schema schema) {
            z0(i2, 4);
            schema.i(obj, this);
            z0(i2, 3);
        }

        public int f() {
            return this.f20740d + H0();
        }

        public void g0(int i2) {
            byte[] bArr = this.f20757f;
            long j2 = this.f20762k;
            this.f20762k = j2 - 1;
            UnsafeUtil.R(bArr, j2, (byte) ((i2 >> 24) & 255));
            byte[] bArr2 = this.f20757f;
            long j3 = this.f20762k;
            this.f20762k = j3 - 1;
            UnsafeUtil.R(bArr2, j3, (byte) ((i2 >> 16) & 255));
            byte[] bArr3 = this.f20757f;
            long j4 = this.f20762k;
            this.f20762k = j4 - 1;
            UnsafeUtil.R(bArr3, j4, (byte) ((i2 >> 8) & 255));
            byte[] bArr4 = this.f20757f;
            long j5 = this.f20762k;
            this.f20762k = j5 - 1;
            UnsafeUtil.R(bArr4, j5, (byte) (i2 & 255));
        }

        public void j0(long j2) {
            byte[] bArr = this.f20757f;
            long j3 = this.f20762k;
            this.f20762k = j3 - 1;
            UnsafeUtil.R(bArr, j3, (byte) (((int) (j2 >> 56)) & 255));
            byte[] bArr2 = this.f20757f;
            long j4 = this.f20762k;
            this.f20762k = j4 - 1;
            UnsafeUtil.R(bArr2, j4, (byte) (((int) (j2 >> 48)) & 255));
            byte[] bArr3 = this.f20757f;
            long j5 = this.f20762k;
            this.f20762k = j5 - 1;
            UnsafeUtil.R(bArr3, j5, (byte) (((int) (j2 >> 40)) & 255));
            byte[] bArr4 = this.f20757f;
            long j6 = this.f20762k;
            this.f20762k = j6 - 1;
            UnsafeUtil.R(bArr4, j6, (byte) (((int) (j2 >> 32)) & 255));
            byte[] bArr5 = this.f20757f;
            long j7 = this.f20762k;
            this.f20762k = j7 - 1;
            UnsafeUtil.R(bArr5, j7, (byte) (((int) (j2 >> 24)) & 255));
            byte[] bArr6 = this.f20757f;
            long j8 = this.f20762k;
            this.f20762k = j8 - 1;
            UnsafeUtil.R(bArr6, j8, (byte) (((int) (j2 >> 16)) & 255));
            byte[] bArr7 = this.f20757f;
            long j9 = this.f20762k;
            this.f20762k = j9 - 1;
            UnsafeUtil.R(bArr7, j9, (byte) (((int) (j2 >> 8)) & 255));
            byte[] bArr8 = this.f20757f;
            long j10 = this.f20762k;
            this.f20762k = j10 - 1;
            UnsafeUtil.R(bArr8, j10, (byte) (((int) j2) & 255));
        }

        public void k(int i2) {
            if (M0() < i2) {
                K0(i2);
            }
        }

        public void l(boolean z2) {
            N0(z2 ? (byte) 1 : 0);
        }

        public void o(int i2, int i3) {
            k(15);
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
            k(10);
            E0(i3);
            z0(i2, 0);
        }

        public void s(int i2, int i3) {
            k(9);
            g0(i3);
            z0(i2, 5);
        }

        public void t0(int i2) {
            E0(CodedOutputStream.R0(i2));
        }

        public void w(int i2, long j2) {
            k(13);
            j0(j2);
            z0(i2, 1);
        }

        public void w0(long j2) {
            F0(CodedOutputStream.S0(j2));
        }

        public void z(int i2, String str) {
            int f2 = f();
            O0(str);
            k(10);
            E0(f() - f2);
            z0(i2, 2);
        }

        public void z0(int i2, int i3) {
            E0(WireFormat.c(i2, i3));
        }
    }

    public static byte e(long j2) {
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
        switch (AnonymousClass1.f20741a[fieldType.ordinal()]) {
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
                writer.a0(i2, (ByteString) obj);
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
            k((intArrayList.size() * 5) + 10);
            int f2 = f();
            for (int size = intArrayList.size() - 1; size >= 0; size--) {
                E0(intArrayList.getInt(size));
            }
            E0(f() - f2);
            z0(i2, 2);
            return;
        }
        for (int size2 = intArrayList.size() - 1; size2 >= 0; size2--) {
            q(i2, intArrayList.getInt(size2));
        }
    }

    public final void B0(int i2, List list, boolean z2) {
        if (z2) {
            k((list.size() * 5) + 10);
            int f2 = f();
            for (int size = list.size() - 1; size >= 0; size--) {
                E0(((Integer) list.get(size)).intValue());
            }
            E0(f() - f2);
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
            k((longArrayList.size() * 10) + 10);
            int f2 = f();
            for (int size = longArrayList.size() - 1; size >= 0; size--) {
                F0(longArrayList.p(size));
            }
            E0(f() - f2);
            z0(i2, 2);
            return;
        }
        for (int size2 = longArrayList.size() - 1; size2 >= 0; size2--) {
            A(i2, longArrayList.p(size2));
        }
    }

    public final void D(int i2, long j2) {
        A(i2, j2);
    }

    public final void D0(int i2, List list, boolean z2) {
        if (z2) {
            k((list.size() * 10) + 10);
            int f2 = f();
            for (int size = list.size() - 1; size >= 0; size--) {
                F0(((Long) list.get(size)).longValue());
            }
            E0(f() - f2);
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
            m(i2, (BooleanArrayList) list, z2);
        } else {
            n(i2, list, z2);
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
            a0(i2, (ByteString) list.get(size));
        }
    }

    public final void Y(int i2, List list, Schema schema) {
        for (int size = list.size() - 1; size >= 0; size--) {
            b0(i2, list.get(size), schema);
        }
    }

    public final void Z(int i2, List list, Schema schema) {
        for (int size = list.size() - 1; size >= 0; size--) {
            d0(i2, list.get(size), schema);
        }
    }

    public void c0(int i2, MapEntryLite.Metadata metadata, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            int f2 = f();
            s0(this, 2, metadata.f21062c, entry.getValue());
            s0(this, 1, metadata.f21060a, entry.getKey());
            E0(f() - f2);
            z0(i2, 2);
        }
    }

    public final void e0(int i2, DoubleArrayList doubleArrayList, boolean z2) {
        if (z2) {
            k((doubleArrayList.size() * 8) + 10);
            int f2 = f();
            for (int size = doubleArrayList.size() - 1; size >= 0; size--) {
                j0(Double.doubleToRawLongBits(doubleArrayList.p(size)));
            }
            E0(f() - f2);
            z0(i2, 2);
            return;
        }
        for (int size2 = doubleArrayList.size() - 1; size2 >= 0; size2--) {
            t(i2, doubleArrayList.p(size2));
        }
    }

    public abstract int f();

    public final void f0(int i2, List list, boolean z2) {
        if (z2) {
            k((list.size() * 8) + 10);
            int f2 = f();
            for (int size = list.size() - 1; size >= 0; size--) {
                j0(Double.doubleToRawLongBits(((Double) list.get(size)).doubleValue()));
            }
            E0(f() - f2);
            z0(i2, 2);
            return;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            t(i2, ((Double) list.get(size2)).doubleValue());
        }
    }

    public final AllocatedBuffer g() {
        return this.f20737a.a(this.f20738b);
    }

    public abstract void g0(int i2);

    public final AllocatedBuffer h(int i2) {
        return this.f20737a.a(Math.max(i2, this.f20738b));
    }

    public final void h0(int i2, IntArrayList intArrayList, boolean z2) {
        if (z2) {
            k((intArrayList.size() * 4) + 10);
            int f2 = f();
            for (int size = intArrayList.size() - 1; size >= 0; size--) {
                g0(intArrayList.getInt(size));
            }
            E0(f() - f2);
            z0(i2, 2);
            return;
        }
        for (int size2 = intArrayList.size() - 1; size2 >= 0; size2--) {
            s(i2, intArrayList.getInt(size2));
        }
    }

    public final AllocatedBuffer i() {
        return this.f20737a.b(this.f20738b);
    }

    public final void i0(int i2, List list, boolean z2) {
        if (z2) {
            k((list.size() * 4) + 10);
            int f2 = f();
            for (int size = list.size() - 1; size >= 0; size--) {
                g0(((Integer) list.get(size)).intValue());
            }
            E0(f() - f2);
            z0(i2, 2);
            return;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            s(i2, ((Integer) list.get(size2)).intValue());
        }
    }

    public final AllocatedBuffer j(int i2) {
        return this.f20737a.b(Math.max(i2, this.f20738b));
    }

    public abstract void j0(long j2);

    public abstract void k(int i2);

    public final void k0(int i2, LongArrayList longArrayList, boolean z2) {
        if (z2) {
            k((longArrayList.size() * 8) + 10);
            int f2 = f();
            for (int size = longArrayList.size() - 1; size >= 0; size--) {
                j0(longArrayList.p(size));
            }
            E0(f() - f2);
            z0(i2, 2);
            return;
        }
        for (int size2 = longArrayList.size() - 1; size2 >= 0; size2--) {
            w(i2, longArrayList.p(size2));
        }
    }

    public abstract void l(boolean z2);

    public final void l0(int i2, List list, boolean z2) {
        if (z2) {
            k((list.size() * 8) + 10);
            int f2 = f();
            for (int size = list.size() - 1; size >= 0; size--) {
                j0(((Long) list.get(size)).longValue());
            }
            E0(f() - f2);
            z0(i2, 2);
            return;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            w(i2, ((Long) list.get(size2)).longValue());
        }
    }

    public final void m(int i2, BooleanArrayList booleanArrayList, boolean z2) {
        if (z2) {
            k(booleanArrayList.size() + 10);
            int f2 = f();
            for (int size = booleanArrayList.size() - 1; size >= 0; size--) {
                l(booleanArrayList.p(size));
            }
            E0(f() - f2);
            z0(i2, 2);
            return;
        }
        for (int size2 = booleanArrayList.size() - 1; size2 >= 0; size2--) {
            E(i2, booleanArrayList.p(size2));
        }
    }

    public final void m0(int i2, FloatArrayList floatArrayList, boolean z2) {
        if (z2) {
            k((floatArrayList.size() * 4) + 10);
            int f2 = f();
            for (int size = floatArrayList.size() - 1; size >= 0; size--) {
                g0(Float.floatToRawIntBits(floatArrayList.p(size)));
            }
            E0(f() - f2);
            z0(i2, 2);
            return;
        }
        for (int size2 = floatArrayList.size() - 1; size2 >= 0; size2--) {
            P(i2, floatArrayList.p(size2));
        }
    }

    public final void n(int i2, List list, boolean z2) {
        if (z2) {
            k(list.size() + 10);
            int f2 = f();
            for (int size = list.size() - 1; size >= 0; size--) {
                l(((Boolean) list.get(size)).booleanValue());
            }
            E0(f() - f2);
            z0(i2, 2);
            return;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            E(i2, ((Boolean) list.get(size2)).booleanValue());
        }
    }

    public final void n0(int i2, List list, boolean z2) {
        if (z2) {
            k((list.size() * 4) + 10);
            int f2 = f();
            for (int size = list.size() - 1; size >= 0; size--) {
                g0(Float.floatToRawIntBits(((Float) list.get(size)).floatValue()));
            }
            E0(f() - f2);
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
            k((intArrayList.size() * 10) + 10);
            int f2 = f();
            for (int size = intArrayList.size() - 1; size >= 0; size--) {
                o0(intArrayList.getInt(size));
            }
            E0(f() - f2);
            z0(i2, 2);
            return;
        }
        for (int size2 = intArrayList.size() - 1; size2 >= 0; size2--) {
            o(i2, intArrayList.getInt(size2));
        }
    }

    public final void q0(int i2, List list, boolean z2) {
        if (z2) {
            k((list.size() * 10) + 10);
            int f2 = f();
            for (int size = list.size() - 1; size >= 0; size--) {
                o0(((Integer) list.get(size)).intValue());
            }
            E0(f() - f2);
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
            a0(3, (ByteString) obj);
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
            a0(i2, (ByteString) obj);
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
            k((intArrayList.size() * 5) + 10);
            int f2 = f();
            for (int size = intArrayList.size() - 1; size >= 0; size--) {
                t0(intArrayList.getInt(size));
            }
            E0(f() - f2);
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
            k((list.size() * 5) + 10);
            int f2 = f();
            for (int size = list.size() - 1; size >= 0; size--) {
                t0(((Integer) list.get(size)).intValue());
            }
            E0(f() - f2);
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
            k((longArrayList.size() * 10) + 10);
            int f2 = f();
            for (int size = longArrayList.size() - 1; size >= 0; size--) {
                w0(longArrayList.p(size));
            }
            E0(f() - f2);
            z0(i2, 2);
            return;
        }
        for (int size2 = longArrayList.size() - 1; size2 >= 0; size2--) {
            O(i2, longArrayList.p(size2));
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
            k((list.size() * 10) + 10);
            int f2 = f();
            for (int size = list.size() - 1; size >= 0; size--) {
                w0(((Long) list.get(size)).longValue());
            }
            E0(f() - f2);
            z0(i2, 2);
            return;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            O(i2, ((Long) list.get(size2)).longValue());
        }
    }

    public abstract void z0(int i2, int i3);
}
