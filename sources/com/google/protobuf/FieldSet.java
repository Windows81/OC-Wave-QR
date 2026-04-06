package com.google.protobuf;

import com.google.protobuf.FieldSet.FieldDescriptorLite;
import com.google.protobuf.Internal;
import com.google.protobuf.LazyField;
import com.google.protobuf.MessageLite;
import com.google.protobuf.WireFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class FieldSet<T extends FieldDescriptorLite<T>> {

    /* renamed from: d  reason: collision with root package name */
    public static final FieldSet f32131d = new FieldSet(true);

    /* renamed from: a  reason: collision with root package name */
    public final SmallSortedMap f32132a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f32133b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f32134c;

    /* renamed from: com.google.protobuf.FieldSet$1  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f32135a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f32136b;

        /* JADX WARNING: Can't wrap try/catch for region: R(55:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|21|22|23|(2:25|26)|27|(2:29|30)|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|(3:71|72|74)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(56:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|21|22|23|(2:25|26)|27|(2:29|30)|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|(3:71|72|74)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(58:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|21|22|23|(2:25|26)|27|(2:29|30)|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|74) */
        /* JADX WARNING: Can't wrap try/catch for region: R(59:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|17|18|19|21|22|23|(2:25|26)|27|(2:29|30)|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|74) */
        /* JADX WARNING: Can't wrap try/catch for region: R(60:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|21|22|23|(2:25|26)|27|(2:29|30)|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|74) */
        /* JADX WARNING: Can't wrap try/catch for region: R(62:0|(2:1|2)|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|(2:25|26)|27|29|30|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|74) */
        /* JADX WARNING: Can't wrap try/catch for region: R(65:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|25|26|27|29|30|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|74) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x00c0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x00cc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:57:0x00e9 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:59:0x00f3 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:61:0x00fd */
        /* JADX WARNING: Missing exception handler attribute for start block: B:63:0x0107 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:65:0x0111 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:67:0x011b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:69:0x0125 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:71:0x012f */
        static {
            /*
                com.google.protobuf.WireFormat$FieldType[] r0 = com.google.protobuf.WireFormat.FieldType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f32136b = r0
                r1 = 1
                com.google.protobuf.WireFormat$FieldType r2 = com.google.protobuf.WireFormat.FieldType.DOUBLE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f32136b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.WireFormat$FieldType r3 = com.google.protobuf.WireFormat.FieldType.FLOAT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f32136b     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.WireFormat$FieldType r4 = com.google.protobuf.WireFormat.FieldType.INT64     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = f32136b     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.WireFormat$FieldType r5 = com.google.protobuf.WireFormat.FieldType.UINT64     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                r4 = 5
                int[] r5 = f32136b     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.WireFormat$FieldType r6 = com.google.protobuf.WireFormat.FieldType.INT32     // Catch:{ NoSuchFieldError -> 0x003e }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r5[r6] = r4     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                r5 = 6
                int[] r6 = f32136b     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.WireFormat$FieldType r7 = com.google.protobuf.WireFormat.FieldType.FIXED64     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r6[r7] = r5     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                r6 = 7
                int[] r7 = f32136b     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.WireFormat$FieldType r8 = com.google.protobuf.WireFormat.FieldType.FIXED32     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r7[r8] = r6     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                r7 = 8
                int[] r8 = f32136b     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.google.protobuf.WireFormat$FieldType r9 = com.google.protobuf.WireFormat.FieldType.BOOL     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r8[r9] = r7     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                r8 = 9
                int[] r9 = f32136b     // Catch:{ NoSuchFieldError -> 0x006c }
                com.google.protobuf.WireFormat$FieldType r10 = com.google.protobuf.WireFormat.FieldType.GROUP     // Catch:{ NoSuchFieldError -> 0x006c }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r9[r10] = r8     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r9 = f32136b     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.google.protobuf.WireFormat$FieldType r10 = com.google.protobuf.WireFormat.FieldType.MESSAGE     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r11 = 10
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r9 = f32136b     // Catch:{ NoSuchFieldError -> 0x0084 }
                com.google.protobuf.WireFormat$FieldType r10 = com.google.protobuf.WireFormat.FieldType.STRING     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r11 = 11
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r9 = f32136b     // Catch:{ NoSuchFieldError -> 0x0090 }
                com.google.protobuf.WireFormat$FieldType r10 = com.google.protobuf.WireFormat.FieldType.BYTES     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r11 = 12
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r9 = f32136b     // Catch:{ NoSuchFieldError -> 0x009c }
                com.google.protobuf.WireFormat$FieldType r10 = com.google.protobuf.WireFormat.FieldType.UINT32     // Catch:{ NoSuchFieldError -> 0x009c }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r11 = 13
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r9 = f32136b     // Catch:{ NoSuchFieldError -> 0x00a8 }
                com.google.protobuf.WireFormat$FieldType r10 = com.google.protobuf.WireFormat.FieldType.SFIXED32     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r11 = 14
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r9 = f32136b     // Catch:{ NoSuchFieldError -> 0x00b4 }
                com.google.protobuf.WireFormat$FieldType r10 = com.google.protobuf.WireFormat.FieldType.SFIXED64     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r11 = 15
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r9 = f32136b     // Catch:{ NoSuchFieldError -> 0x00c0 }
                com.google.protobuf.WireFormat$FieldType r10 = com.google.protobuf.WireFormat.FieldType.SINT32     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r11 = 16
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r9 = f32136b     // Catch:{ NoSuchFieldError -> 0x00cc }
                com.google.protobuf.WireFormat$FieldType r10 = com.google.protobuf.WireFormat.FieldType.SINT64     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r11 = 17
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                int[] r9 = f32136b     // Catch:{ NoSuchFieldError -> 0x00d8 }
                com.google.protobuf.WireFormat$FieldType r10 = com.google.protobuf.WireFormat.FieldType.ENUM     // Catch:{ NoSuchFieldError -> 0x00d8 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d8 }
                r11 = 18
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x00d8 }
            L_0x00d8:
                com.google.protobuf.WireFormat$JavaType[] r9 = com.google.protobuf.WireFormat.JavaType.values()
                int r9 = r9.length
                int[] r9 = new int[r9]
                f32135a = r9
                com.google.protobuf.WireFormat$JavaType r10 = com.google.protobuf.WireFormat.JavaType.INT     // Catch:{ NoSuchFieldError -> 0x00e9 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00e9 }
                r9[r10] = r1     // Catch:{ NoSuchFieldError -> 0x00e9 }
            L_0x00e9:
                int[] r1 = f32135a     // Catch:{ NoSuchFieldError -> 0x00f3 }
                com.google.protobuf.WireFormat$JavaType r9 = com.google.protobuf.WireFormat.JavaType.LONG     // Catch:{ NoSuchFieldError -> 0x00f3 }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x00f3 }
                r1[r9] = r0     // Catch:{ NoSuchFieldError -> 0x00f3 }
            L_0x00f3:
                int[] r0 = f32135a     // Catch:{ NoSuchFieldError -> 0x00fd }
                com.google.protobuf.WireFormat$JavaType r1 = com.google.protobuf.WireFormat.JavaType.FLOAT     // Catch:{ NoSuchFieldError -> 0x00fd }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00fd }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00fd }
            L_0x00fd:
                int[] r0 = f32135a     // Catch:{ NoSuchFieldError -> 0x0107 }
                com.google.protobuf.WireFormat$JavaType r1 = com.google.protobuf.WireFormat.JavaType.DOUBLE     // Catch:{ NoSuchFieldError -> 0x0107 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0107 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0107 }
            L_0x0107:
                int[] r0 = f32135a     // Catch:{ NoSuchFieldError -> 0x0111 }
                com.google.protobuf.WireFormat$JavaType r1 = com.google.protobuf.WireFormat.JavaType.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x0111 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0111 }
                r0[r1] = r4     // Catch:{ NoSuchFieldError -> 0x0111 }
            L_0x0111:
                int[] r0 = f32135a     // Catch:{ NoSuchFieldError -> 0x011b }
                com.google.protobuf.WireFormat$JavaType r1 = com.google.protobuf.WireFormat.JavaType.STRING     // Catch:{ NoSuchFieldError -> 0x011b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x011b }
                r0[r1] = r5     // Catch:{ NoSuchFieldError -> 0x011b }
            L_0x011b:
                int[] r0 = f32135a     // Catch:{ NoSuchFieldError -> 0x0125 }
                com.google.protobuf.WireFormat$JavaType r1 = com.google.protobuf.WireFormat.JavaType.BYTE_STRING     // Catch:{ NoSuchFieldError -> 0x0125 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0125 }
                r0[r1] = r6     // Catch:{ NoSuchFieldError -> 0x0125 }
            L_0x0125:
                int[] r0 = f32135a     // Catch:{ NoSuchFieldError -> 0x012f }
                com.google.protobuf.WireFormat$JavaType r1 = com.google.protobuf.WireFormat.JavaType.ENUM     // Catch:{ NoSuchFieldError -> 0x012f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x012f }
                r0[r1] = r7     // Catch:{ NoSuchFieldError -> 0x012f }
            L_0x012f:
                int[] r0 = f32135a     // Catch:{ NoSuchFieldError -> 0x0139 }
                com.google.protobuf.WireFormat$JavaType r1 = com.google.protobuf.WireFormat.JavaType.MESSAGE     // Catch:{ NoSuchFieldError -> 0x0139 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0139 }
                r0[r1] = r8     // Catch:{ NoSuchFieldError -> 0x0139 }
            L_0x0139:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.FieldSet.AnonymousClass1.<clinit>():void");
        }
    }

    public static final class Builder<T extends FieldDescriptorLite<T>> {
    }

    public interface FieldDescriptorLite<T extends FieldDescriptorLite<T>> extends Comparable<T> {
        MessageLite.Builder J(MessageLite.Builder builder, MessageLite messageLite);

        int i();

        boolean q();

        WireFormat.FieldType s();

        WireFormat.JavaType u();

        boolean v();
    }

    public FieldSet() {
        this.f32132a = SmallSortedMap.s(16);
    }

    public static void A(CodedOutputStream codedOutputStream, WireFormat.FieldType fieldType, int i2, Object obj) {
        if (fieldType == WireFormat.FieldType.GROUP) {
            codedOutputStream.h1(i2, (MessageLite) obj);
            return;
        }
        codedOutputStream.x1(i2, m(fieldType, false));
        B(codedOutputStream, fieldType, obj);
    }

    public static void B(CodedOutputStream codedOutputStream, WireFormat.FieldType fieldType, Object obj) {
        switch (AnonymousClass1.f32136b[fieldType.ordinal()]) {
            case 1:
                codedOutputStream.c1(((Double) obj).doubleValue());
                return;
            case 2:
                codedOutputStream.g1(((Float) obj).floatValue());
                return;
            case 3:
                codedOutputStream.m1(((Long) obj).longValue());
                return;
            case 4:
                codedOutputStream.z1(((Long) obj).longValue());
                return;
            case 5:
                codedOutputStream.l1(((Integer) obj).intValue());
                return;
            case 6:
                codedOutputStream.f1(((Long) obj).longValue());
                return;
            case 7:
                codedOutputStream.e1(((Integer) obj).intValue());
                return;
            case 8:
                codedOutputStream.Y0(((Boolean) obj).booleanValue());
                return;
            case 9:
                codedOutputStream.j1((MessageLite) obj);
                return;
            case 10:
                codedOutputStream.p1((MessageLite) obj);
                return;
            case 11:
                if (obj instanceof ByteString) {
                    codedOutputStream.b1((ByteString) obj);
                    return;
                } else {
                    codedOutputStream.w1((String) obj);
                    return;
                }
            case 12:
                if (obj instanceof ByteString) {
                    codedOutputStream.b1((ByteString) obj);
                    return;
                } else {
                    codedOutputStream.Z0((byte[]) obj);
                    return;
                }
            case 13:
                codedOutputStream.y1(((Integer) obj).intValue());
                return;
            case 14:
                codedOutputStream.s1(((Integer) obj).intValue());
                return;
            case 15:
                codedOutputStream.t1(((Long) obj).longValue());
                return;
            case 16:
                codedOutputStream.u1(((Integer) obj).intValue());
                return;
            case 17:
                codedOutputStream.v1(((Long) obj).longValue());
                return;
            case 18:
                if (obj instanceof Internal.EnumLite) {
                    codedOutputStream.d1(((Internal.EnumLite) obj).i());
                    return;
                } else {
                    codedOutputStream.d1(((Integer) obj).intValue());
                    return;
                }
            default:
                return;
        }
    }

    public static Object c(Object obj) {
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public static int d(WireFormat.FieldType fieldType, int i2, Object obj) {
        int L0 = CodedOutputStream.L0(i2);
        if (fieldType == WireFormat.FieldType.GROUP) {
            L0 *= 2;
        }
        return L0 + e(fieldType, obj);
    }

    public static int e(WireFormat.FieldType fieldType, Object obj) {
        switch (AnonymousClass1.f32136b[fieldType.ordinal()]) {
            case 1:
                return CodedOutputStream.b0(((Double) obj).doubleValue());
            case 2:
                return CodedOutputStream.j0(((Float) obj).floatValue());
            case 3:
                return CodedOutputStream.q0(((Long) obj).longValue());
            case 4:
                return CodedOutputStream.P0(((Long) obj).longValue());
            case 5:
                return CodedOutputStream.o0(((Integer) obj).intValue());
            case 6:
                return CodedOutputStream.h0(((Long) obj).longValue());
            case 7:
                return CodedOutputStream.f0(((Integer) obj).intValue());
            case 8:
                return CodedOutputStream.m(((Boolean) obj).booleanValue());
            case 9:
                return CodedOutputStream.l0((MessageLite) obj);
            case 10:
                return obj instanceof LazyField ? CodedOutputStream.t0((LazyField) obj) : CodedOutputStream.y0((MessageLite) obj);
            case 11:
                return obj instanceof ByteString ? CodedOutputStream.Z((ByteString) obj) : CodedOutputStream.K0((String) obj);
            case 12:
                return obj instanceof ByteString ? CodedOutputStream.Z((ByteString) obj) : CodedOutputStream.n((byte[]) obj);
            case 13:
                return CodedOutputStream.N0(((Integer) obj).intValue());
            case 14:
                return CodedOutputStream.C0(((Integer) obj).intValue());
            case 15:
                return CodedOutputStream.E0(((Long) obj).longValue());
            case 16:
                return CodedOutputStream.G0(((Integer) obj).intValue());
            case 17:
                return CodedOutputStream.I0(((Long) obj).longValue());
            case 18:
                return obj instanceof Internal.EnumLite ? CodedOutputStream.d0(((Internal.EnumLite) obj).i()) : CodedOutputStream.d0(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int f(FieldDescriptorLite fieldDescriptorLite, Object obj) {
        WireFormat.FieldType s2 = fieldDescriptorLite.s();
        int i2 = fieldDescriptorLite.i();
        if (!fieldDescriptorLite.q()) {
            return d(s2, i2, obj);
        }
        int i3 = 0;
        if (fieldDescriptorLite.v()) {
            for (Object e2 : (List) obj) {
                i3 += e(s2, e2);
            }
            return CodedOutputStream.L0(i2) + i3 + CodedOutputStream.N0(i3);
        }
        for (Object d2 : (List) obj) {
            i3 += d(s2, i2, d2);
        }
        return i3;
    }

    public static FieldSet h() {
        return f32131d;
    }

    public static int m(WireFormat.FieldType fieldType, boolean z2) {
        if (z2) {
            return 2;
        }
        return fieldType.h();
    }

    public static boolean q(Map.Entry entry) {
        FieldDescriptorLite fieldDescriptorLite = (FieldDescriptorLite) entry.getKey();
        if (fieldDescriptorLite.u() != WireFormat.JavaType.MESSAGE) {
            return true;
        }
        if (!fieldDescriptorLite.q()) {
            return r(entry.getValue());
        }
        for (Object r2 : (List) entry.getValue()) {
            if (!r(r2)) {
                return false;
            }
        }
        return true;
    }

    public static boolean r(Object obj) {
        if (obj instanceof MessageLiteOrBuilder) {
            return ((MessageLiteOrBuilder) obj).b();
        }
        if (obj instanceof LazyField) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    public static boolean s(WireFormat.FieldType fieldType, Object obj) {
        Internal.a(obj);
        switch (AnonymousClass1.f32135a[fieldType.f().ordinal()]) {
            case 1:
                return obj instanceof Integer;
            case 2:
                return obj instanceof Long;
            case 3:
                return obj instanceof Float;
            case 4:
                return obj instanceof Double;
            case 5:
                return obj instanceof Boolean;
            case 6:
                return obj instanceof String;
            case 7:
                return (obj instanceof ByteString) || (obj instanceof byte[]);
            case 8:
                return (obj instanceof Integer) || (obj instanceof Internal.EnumLite);
            case 9:
                return (obj instanceof MessageLite) || (obj instanceof LazyField);
            default:
                return false;
        }
    }

    public static FieldSet x() {
        return new FieldSet();
    }

    public void a(FieldDescriptorLite fieldDescriptorLite, Object obj) {
        List list;
        if (fieldDescriptorLite.q()) {
            z(fieldDescriptorLite, obj);
            Object i2 = i(fieldDescriptorLite);
            if (i2 == null) {
                list = new ArrayList();
                this.f32132a.put(fieldDescriptorLite, list);
            } else {
                list = (List) i2;
            }
            list.add(obj);
            return;
        }
        throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
    }

    /* renamed from: b */
    public FieldSet clone() {
        FieldSet x2 = x();
        for (int i2 = 0; i2 < this.f32132a.m(); i2++) {
            Map.Entry k2 = this.f32132a.k(i2);
            x2.y((FieldDescriptorLite) k2.getKey(), k2.getValue());
        }
        for (Map.Entry entry : this.f32132a.o()) {
            x2.y((FieldDescriptorLite) entry.getKey(), entry.getValue());
        }
        x2.f32134c = this.f32134c;
        return x2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FieldSet)) {
            return false;
        }
        return this.f32132a.equals(((FieldSet) obj).f32132a);
    }

    public Iterator g() {
        return this.f32134c ? new LazyField.LazyIterator(this.f32132a.i().iterator()) : this.f32132a.i().iterator();
    }

    public int hashCode() {
        return this.f32132a.hashCode();
    }

    public Object i(FieldDescriptorLite fieldDescriptorLite) {
        Object obj = this.f32132a.get(fieldDescriptorLite);
        return obj instanceof LazyField ? ((LazyField) obj).f() : obj;
    }

    public int j() {
        int i2 = 0;
        for (int i3 = 0; i3 < this.f32132a.m(); i3++) {
            i2 += k(this.f32132a.k(i3));
        }
        for (Map.Entry k2 : this.f32132a.o()) {
            i2 += k(k2);
        }
        return i2;
    }

    public final int k(Map.Entry entry) {
        FieldDescriptorLite fieldDescriptorLite = (FieldDescriptorLite) entry.getKey();
        Object value = entry.getValue();
        return (fieldDescriptorLite.u() != WireFormat.JavaType.MESSAGE || fieldDescriptorLite.q() || fieldDescriptorLite.v()) ? f(fieldDescriptorLite, value) : value instanceof LazyField ? CodedOutputStream.r0(((FieldDescriptorLite) entry.getKey()).i(), (LazyField) value) : CodedOutputStream.v0(((FieldDescriptorLite) entry.getKey()).i(), (MessageLite) value);
    }

    public int l() {
        int i2 = 0;
        for (int i3 = 0; i3 < this.f32132a.m(); i3++) {
            Map.Entry k2 = this.f32132a.k(i3);
            i2 += f((FieldDescriptorLite) k2.getKey(), k2.getValue());
        }
        for (Map.Entry entry : this.f32132a.o()) {
            i2 += f((FieldDescriptorLite) entry.getKey(), entry.getValue());
        }
        return i2;
    }

    public boolean n() {
        return this.f32132a.isEmpty();
    }

    public boolean o() {
        return this.f32133b;
    }

    public boolean p() {
        for (int i2 = 0; i2 < this.f32132a.m(); i2++) {
            if (!q(this.f32132a.k(i2))) {
                return false;
            }
        }
        for (Map.Entry q2 : this.f32132a.o()) {
            if (!q(q2)) {
                return false;
            }
        }
        return true;
    }

    public Iterator t() {
        return this.f32134c ? new LazyField.LazyIterator(this.f32132a.entrySet().iterator()) : this.f32132a.entrySet().iterator();
    }

    public void u() {
        if (!this.f32133b) {
            for (int i2 = 0; i2 < this.f32132a.m(); i2++) {
                Map.Entry k2 = this.f32132a.k(i2);
                if (k2.getValue() instanceof GeneratedMessageLite) {
                    ((GeneratedMessageLite) k2.getValue()).R();
                }
            }
            this.f32132a.r();
            this.f32133b = true;
        }
    }

    public void v(FieldSet fieldSet) {
        for (int i2 = 0; i2 < fieldSet.f32132a.m(); i2++) {
            w(fieldSet.f32132a.k(i2));
        }
        for (Map.Entry w2 : fieldSet.f32132a.o()) {
            w(w2);
        }
    }

    public final void w(Map.Entry entry) {
        FieldDescriptorLite fieldDescriptorLite = (FieldDescriptorLite) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof LazyField) {
            value = ((LazyField) value).f();
        }
        if (fieldDescriptorLite.q()) {
            Object i2 = i(fieldDescriptorLite);
            if (i2 == null) {
                i2 = new ArrayList();
            }
            for (Object c2 : (List) value) {
                ((List) i2).add(c(c2));
            }
            this.f32132a.put(fieldDescriptorLite, i2);
        } else if (fieldDescriptorLite.u() == WireFormat.JavaType.MESSAGE) {
            Object i3 = i(fieldDescriptorLite);
            if (i3 == null) {
                this.f32132a.put(fieldDescriptorLite, c(value));
                return;
            }
            this.f32132a.put(fieldDescriptorLite, fieldDescriptorLite.J(((MessageLite) i3).e(), (MessageLite) value).d());
        } else {
            this.f32132a.put(fieldDescriptorLite, c(value));
        }
    }

    public void y(FieldDescriptorLite fieldDescriptorLite, Object obj) {
        if (!fieldDescriptorLite.q()) {
            z(fieldDescriptorLite, obj);
        } else if (obj instanceof List) {
            ArrayList<Object> arrayList = new ArrayList<>();
            arrayList.addAll((List) obj);
            for (Object z2 : arrayList) {
                z(fieldDescriptorLite, z2);
            }
            obj = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        if (obj instanceof LazyField) {
            this.f32134c = true;
        }
        this.f32132a.put(fieldDescriptorLite, obj);
    }

    public final void z(FieldDescriptorLite fieldDescriptorLite, Object obj) {
        if (!s(fieldDescriptorLite.s(), obj)) {
            throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(fieldDescriptorLite.i()), fieldDescriptorLite.s().f(), obj.getClass().getName()}));
        }
    }

    public FieldSet(boolean z2) {
        this(SmallSortedMap.s(0));
        u();
    }

    public FieldSet(SmallSortedMap smallSortedMap) {
        this.f32132a = smallSortedMap;
        u();
    }
}
