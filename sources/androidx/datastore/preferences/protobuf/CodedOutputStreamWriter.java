package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.MapEntryLite;
import androidx.datastore.preferences.protobuf.Writer;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

@CheckReturnValue
final class CodedOutputStreamWriter implements Writer {

    /* renamed from: a  reason: collision with root package name */
    public final CodedOutputStream f20864a;

    /* renamed from: androidx.datastore.preferences.protobuf.CodedOutputStreamWriter$1  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f20865a;

        /* JADX WARNING: Can't wrap try/catch for region: R(26:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|26) */
        /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
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
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                androidx.datastore.preferences.protobuf.WireFormat$FieldType[] r0 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f20865a = r0
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.BOOL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f20865a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.FIXED32     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f20865a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.INT32     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f20865a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.SFIXED32     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f20865a     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.SINT32     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f20865a     // Catch:{ NoSuchFieldError -> 0x0049 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.UINT32     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f20865a     // Catch:{ NoSuchFieldError -> 0x0054 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.FIXED64     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f20865a     // Catch:{ NoSuchFieldError -> 0x0060 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.INT64     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f20865a     // Catch:{ NoSuchFieldError -> 0x006c }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.SFIXED64     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f20865a     // Catch:{ NoSuchFieldError -> 0x0078 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.SINT64     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f20865a     // Catch:{ NoSuchFieldError -> 0x0084 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.UINT64     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = f20865a     // Catch:{ NoSuchFieldError -> 0x0090 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.STRING     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.CodedOutputStreamWriter.AnonymousClass1.<clinit>():void");
        }
    }

    public CodedOutputStreamWriter(CodedOutputStream codedOutputStream) {
        CodedOutputStream codedOutputStream2 = (CodedOutputStream) Internal.b(codedOutputStream, "output");
        this.f20864a = codedOutputStream2;
        codedOutputStream2.f20842a = this;
    }

    public static CodedOutputStreamWriter a(CodedOutputStream codedOutputStream) {
        CodedOutputStreamWriter codedOutputStreamWriter = codedOutputStream.f20842a;
        return codedOutputStreamWriter != null ? codedOutputStreamWriter : new CodedOutputStreamWriter(codedOutputStream);
    }

    private void m0(int i2, Object obj) {
        if (obj instanceof String) {
            this.f20864a.z(i2, (String) obj);
        } else {
            this.f20864a.a0(i2, (ByteString) obj);
        }
    }

    public void A(int i2, long j2) {
        this.f20864a.A(i2, j2);
    }

    public void B(int i2, Object obj) {
        this.f20864a.q1(i2, (MessageLite) obj);
    }

    public void C(int i2, List list, boolean z2) {
        if (list instanceof IntArrayList) {
            i0(i2, (IntArrayList) list, z2);
        } else {
            j0(i2, list, z2);
        }
    }

    public void D(int i2, long j2) {
        this.f20864a.D(i2, j2);
    }

    public void E(int i2, boolean z2) {
        this.f20864a.E(i2, z2);
    }

    public void F(int i2, int i3) {
        this.f20864a.F(i2, i3);
    }

    public void G(int i2) {
        this.f20864a.A1(i2, 3);
    }

    public void H(int i2, List list, boolean z2) {
        if (list instanceof LongArrayList) {
            e0(i2, (LongArrayList) list, z2);
        } else {
            f0(i2, list, z2);
        }
    }

    public void I(int i2, List list, boolean z2) {
        if (list instanceof IntArrayList) {
            n0(i2, (IntArrayList) list, z2);
        } else {
            o0(i2, list, z2);
        }
    }

    public void J(int i2, long j2) {
        this.f20864a.J(i2, j2);
    }

    public void K(int i2, List list, boolean z2) {
        if (list instanceof IntArrayList) {
            m(i2, (IntArrayList) list, z2);
        } else {
            n(i2, list, z2);
        }
    }

    public void L(int i2, List list, boolean z2) {
        if (list instanceof BooleanArrayList) {
            b(i2, (BooleanArrayList) list, z2);
        } else {
            c(i2, list, z2);
        }
    }

    public void M(int i2, List list, boolean z2) {
        if (list instanceof IntArrayList) {
            v0(i2, (IntArrayList) list, z2);
        } else {
            w0(i2, list, z2);
        }
    }

    public void N(int i2, List list, boolean z2) {
        if (list instanceof LongArrayList) {
            t0(i2, (LongArrayList) list, z2);
        } else {
            u0(i2, list, z2);
        }
    }

    public void O(int i2, long j2) {
        this.f20864a.O(i2, j2);
    }

    public void P(int i2, float f2) {
        this.f20864a.P(i2, f2);
    }

    public void Q(int i2) {
        this.f20864a.A1(i2, 4);
    }

    public void R(int i2, List list, boolean z2) {
        if (list instanceof IntArrayList) {
            r0(i2, (IntArrayList) list, z2);
        } else {
            s0(i2, list, z2);
        }
    }

    public void S(int i2, int i3) {
        this.f20864a.S(i2, i3);
    }

    public void T(int i2, List list, boolean z2) {
        if (list instanceof LongArrayList) {
            k0(i2, (LongArrayList) list, z2);
        } else {
            l0(i2, list, z2);
        }
    }

    public void U(int i2, List list, boolean z2) {
        if (list instanceof IntArrayList) {
            k(i2, (IntArrayList) list, z2);
        } else {
            l(i2, list, z2);
        }
    }

    public void V(int i2, List list, boolean z2) {
        if (list instanceof DoubleArrayList) {
            i(i2, (DoubleArrayList) list, z2);
        } else {
            j(i2, list, z2);
        }
    }

    public void W(int i2, int i3) {
        this.f20864a.W(i2, i3);
    }

    public void X(int i2, List list) {
        for (int i3 = 0; i3 < list.size(); i3++) {
            this.f20864a.a0(i2, (ByteString) list.get(i3));
        }
    }

    public void Y(int i2, List list, Schema schema) {
        for (int i3 = 0; i3 < list.size(); i3++) {
            b0(i2, list.get(i3), schema);
        }
    }

    public void Z(int i2, List list, Schema schema) {
        for (int i3 = 0; i3 < list.size(); i3++) {
            d0(i2, list.get(i3), schema);
        }
    }

    public void a0(int i2, ByteString byteString) {
        this.f20864a.a0(i2, byteString);
    }

    public final void b(int i2, BooleanArrayList booleanArrayList, boolean z2) {
        int i3 = 0;
        if (z2) {
            this.f20864a.A1(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < booleanArrayList.size(); i5++) {
                i4 += CodedOutputStream.g(booleanArrayList.p(i5));
            }
            this.f20864a.B1(i4);
            while (i3 < booleanArrayList.size()) {
                this.f20864a.b1(booleanArrayList.p(i3));
                i3++;
            }
            return;
        }
        while (i3 < booleanArrayList.size()) {
            this.f20864a.E(i2, booleanArrayList.p(i3));
            i3++;
        }
    }

    public void b0(int i2, Object obj, Schema schema) {
        this.f20864a.r1(i2, (MessageLite) obj, schema);
    }

    public final void c(int i2, List list, boolean z2) {
        int i3 = 0;
        if (z2) {
            this.f20864a.A1(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                i4 += CodedOutputStream.g(((Boolean) list.get(i5)).booleanValue());
            }
            this.f20864a.B1(i4);
            while (i3 < list.size()) {
                this.f20864a.b1(((Boolean) list.get(i3)).booleanValue());
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            this.f20864a.E(i2, ((Boolean) list.get(i3)).booleanValue());
            i3++;
        }
    }

    public void c0(int i2, MapEntryLite.Metadata metadata, Map map) {
        if (this.f20864a.V0()) {
            g(i2, metadata, map);
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            this.f20864a.A1(i2, 2);
            this.f20864a.B1(MapEntryLite.b(metadata, entry.getKey(), entry.getValue()));
            MapEntryLite.e(this.f20864a, metadata, entry.getKey(), entry.getValue());
        }
    }

    public final void d(int i2, boolean z2, Object obj, MapEntryLite.Metadata metadata) {
        this.f20864a.A1(i2, 2);
        this.f20864a.B1(MapEntryLite.b(metadata, Boolean.valueOf(z2), obj));
        MapEntryLite.e(this.f20864a, metadata, Boolean.valueOf(z2), obj);
    }

    public void d0(int i2, Object obj, Schema schema) {
        this.f20864a.l1(i2, (MessageLite) obj, schema);
    }

    public final void e(int i2, MapEntryLite.Metadata metadata, Map map) {
        int size = map.size();
        int[] iArr = new int[size];
        int i3 = 0;
        for (Integer intValue : map.keySet()) {
            iArr[i3] = intValue.intValue();
            i3++;
        }
        Arrays.sort(iArr);
        for (int i4 = 0; i4 < size; i4++) {
            int i5 = iArr[i4];
            Object obj = map.get(Integer.valueOf(i5));
            this.f20864a.A1(i2, 2);
            this.f20864a.B1(MapEntryLite.b(metadata, Integer.valueOf(i5), obj));
            MapEntryLite.e(this.f20864a, metadata, Integer.valueOf(i5), obj);
        }
    }

    public final void e0(int i2, LongArrayList longArrayList, boolean z2) {
        int i3 = 0;
        if (z2) {
            this.f20864a.A1(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < longArrayList.size(); i5++) {
                i4 += CodedOutputStream.h0(longArrayList.p(i5));
            }
            this.f20864a.B1(i4);
            while (i3 < longArrayList.size()) {
                this.f20864a.i1(longArrayList.p(i3));
                i3++;
            }
            return;
        }
        while (i3 < longArrayList.size()) {
            this.f20864a.w(i2, longArrayList.p(i3));
            i3++;
        }
    }

    public final void f(int i2, MapEntryLite.Metadata metadata, Map map) {
        int size = map.size();
        long[] jArr = new long[size];
        int i3 = 0;
        for (Long longValue : map.keySet()) {
            jArr[i3] = longValue.longValue();
            i3++;
        }
        Arrays.sort(jArr);
        for (int i4 = 0; i4 < size; i4++) {
            long j2 = jArr[i4];
            Object obj = map.get(Long.valueOf(j2));
            this.f20864a.A1(i2, 2);
            this.f20864a.B1(MapEntryLite.b(metadata, Long.valueOf(j2), obj));
            MapEntryLite.e(this.f20864a, metadata, Long.valueOf(j2), obj);
        }
    }

    public final void f0(int i2, List list, boolean z2) {
        int i3 = 0;
        if (z2) {
            this.f20864a.A1(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                i4 += CodedOutputStream.h0(((Long) list.get(i5)).longValue());
            }
            this.f20864a.B1(i4);
            while (i3 < list.size()) {
                this.f20864a.i1(((Long) list.get(i3)).longValue());
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            this.f20864a.w(i2, ((Long) list.get(i3)).longValue());
            i3++;
        }
    }

    public final void g(int i2, MapEntryLite.Metadata metadata, Map map) {
        switch (AnonymousClass1.f20865a[metadata.f21060a.ordinal()]) {
            case 1:
                Object obj = map.get(Boolean.FALSE);
                if (obj != null) {
                    d(i2, false, obj, metadata);
                }
                Object obj2 = map.get(Boolean.TRUE);
                if (obj2 != null) {
                    d(i2, true, obj2, metadata);
                    return;
                }
                return;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                e(i2, metadata, map);
                return;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                f(i2, metadata, map);
                return;
            case 12:
                h(i2, metadata, map);
                return;
            default:
                throw new IllegalArgumentException("does not support key type: " + metadata.f21060a);
        }
    }

    public final void g0(int i2, FloatArrayList floatArrayList, boolean z2) {
        int i3 = 0;
        if (z2) {
            this.f20864a.A1(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < floatArrayList.size(); i5++) {
                i4 += CodedOutputStream.j0(floatArrayList.p(i5));
            }
            this.f20864a.B1(i4);
            while (i3 < floatArrayList.size()) {
                this.f20864a.j1(floatArrayList.p(i3));
                i3++;
            }
            return;
        }
        while (i3 < floatArrayList.size()) {
            this.f20864a.P(i2, floatArrayList.p(i3));
            i3++;
        }
    }

    public final void h(int i2, MapEntryLite.Metadata metadata, Map map) {
        int size = map.size();
        String[] strArr = new String[size];
        int i3 = 0;
        for (String str : map.keySet()) {
            strArr[i3] = str;
            i3++;
        }
        Arrays.sort(strArr);
        for (int i4 = 0; i4 < size; i4++) {
            String str2 = strArr[i4];
            Object obj = map.get(str2);
            this.f20864a.A1(i2, 2);
            this.f20864a.B1(MapEntryLite.b(metadata, str2, obj));
            MapEntryLite.e(this.f20864a, metadata, str2, obj);
        }
    }

    public final void h0(int i2, List list, boolean z2) {
        int i3 = 0;
        if (z2) {
            this.f20864a.A1(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                i4 += CodedOutputStream.j0(((Float) list.get(i5)).floatValue());
            }
            this.f20864a.B1(i4);
            while (i3 < list.size()) {
                this.f20864a.j1(((Float) list.get(i3)).floatValue());
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            this.f20864a.P(i2, ((Float) list.get(i3)).floatValue());
            i3++;
        }
    }

    public final void i(int i2, DoubleArrayList doubleArrayList, boolean z2) {
        int i3 = 0;
        if (z2) {
            this.f20864a.A1(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < doubleArrayList.size(); i5++) {
                i4 += CodedOutputStream.l(doubleArrayList.p(i5));
            }
            this.f20864a.B1(i4);
            while (i3 < doubleArrayList.size()) {
                this.f20864a.f1(doubleArrayList.p(i3));
                i3++;
            }
            return;
        }
        while (i3 < doubleArrayList.size()) {
            this.f20864a.t(i2, doubleArrayList.p(i3));
            i3++;
        }
    }

    public final void i0(int i2, IntArrayList intArrayList, boolean z2) {
        int i3 = 0;
        if (z2) {
            this.f20864a.A1(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < intArrayList.size(); i5++) {
                i4 += CodedOutputStream.o0(intArrayList.getInt(i5));
            }
            this.f20864a.B1(i4);
            while (i3 < intArrayList.size()) {
                this.f20864a.o1(intArrayList.getInt(i3));
                i3++;
            }
            return;
        }
        while (i3 < intArrayList.size()) {
            this.f20864a.o(i2, intArrayList.getInt(i3));
            i3++;
        }
    }

    public final void j(int i2, List list, boolean z2) {
        int i3 = 0;
        if (z2) {
            this.f20864a.A1(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                i4 += CodedOutputStream.l(((Double) list.get(i5)).doubleValue());
            }
            this.f20864a.B1(i4);
            while (i3 < list.size()) {
                this.f20864a.f1(((Double) list.get(i3)).doubleValue());
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            this.f20864a.t(i2, ((Double) list.get(i3)).doubleValue());
            i3++;
        }
    }

    public final void j0(int i2, List list, boolean z2) {
        int i3 = 0;
        if (z2) {
            this.f20864a.A1(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                i4 += CodedOutputStream.o0(((Integer) list.get(i5)).intValue());
            }
            this.f20864a.B1(i4);
            while (i3 < list.size()) {
                this.f20864a.o1(((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            this.f20864a.o(i2, ((Integer) list.get(i3)).intValue());
            i3++;
        }
    }

    public final void k(int i2, IntArrayList intArrayList, boolean z2) {
        int i3 = 0;
        if (z2) {
            this.f20864a.A1(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < intArrayList.size(); i5++) {
                i4 += CodedOutputStream.n(intArrayList.getInt(i5));
            }
            this.f20864a.B1(i4);
            while (i3 < intArrayList.size()) {
                this.f20864a.g1(intArrayList.getInt(i3));
                i3++;
            }
            return;
        }
        while (i3 < intArrayList.size()) {
            this.f20864a.S(i2, intArrayList.getInt(i3));
            i3++;
        }
    }

    public final void k0(int i2, LongArrayList longArrayList, boolean z2) {
        int i3 = 0;
        if (z2) {
            this.f20864a.A1(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < longArrayList.size(); i5++) {
                i4 += CodedOutputStream.q0(longArrayList.p(i5));
            }
            this.f20864a.B1(i4);
            while (i3 < longArrayList.size()) {
                this.f20864a.p1(longArrayList.p(i3));
                i3++;
            }
            return;
        }
        while (i3 < longArrayList.size()) {
            this.f20864a.D(i2, longArrayList.p(i3));
            i3++;
        }
    }

    public final void l(int i2, List list, boolean z2) {
        int i3 = 0;
        if (z2) {
            this.f20864a.A1(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                i4 += CodedOutputStream.n(((Integer) list.get(i5)).intValue());
            }
            this.f20864a.B1(i4);
            while (i3 < list.size()) {
                this.f20864a.g1(((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            this.f20864a.S(i2, ((Integer) list.get(i3)).intValue());
            i3++;
        }
    }

    public final void l0(int i2, List list, boolean z2) {
        int i3 = 0;
        if (z2) {
            this.f20864a.A1(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                i4 += CodedOutputStream.q0(((Long) list.get(i5)).longValue());
            }
            this.f20864a.B1(i4);
            while (i3 < list.size()) {
                this.f20864a.p1(((Long) list.get(i3)).longValue());
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            this.f20864a.D(i2, ((Long) list.get(i3)).longValue());
            i3++;
        }
    }

    public final void m(int i2, IntArrayList intArrayList, boolean z2) {
        int i3 = 0;
        if (z2) {
            this.f20864a.A1(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < intArrayList.size(); i5++) {
                i4 += CodedOutputStream.f0(intArrayList.getInt(i5));
            }
            this.f20864a.B1(i4);
            while (i3 < intArrayList.size()) {
                this.f20864a.h1(intArrayList.getInt(i3));
                i3++;
            }
            return;
        }
        while (i3 < intArrayList.size()) {
            this.f20864a.s(i2, intArrayList.getInt(i3));
            i3++;
        }
    }

    public final void n(int i2, List list, boolean z2) {
        int i3 = 0;
        if (z2) {
            this.f20864a.A1(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                i4 += CodedOutputStream.f0(((Integer) list.get(i5)).intValue());
            }
            this.f20864a.B1(i4);
            while (i3 < list.size()) {
                this.f20864a.h1(((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            this.f20864a.s(i2, ((Integer) list.get(i3)).intValue());
            i3++;
        }
    }

    public final void n0(int i2, IntArrayList intArrayList, boolean z2) {
        int i3 = 0;
        if (z2) {
            this.f20864a.A1(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < intArrayList.size(); i5++) {
                i4 += CodedOutputStream.D0(intArrayList.getInt(i5));
            }
            this.f20864a.B1(i4);
            while (i3 < intArrayList.size()) {
                this.f20864a.v1(intArrayList.getInt(i3));
                i3++;
            }
            return;
        }
        while (i3 < intArrayList.size()) {
            this.f20864a.F(i2, intArrayList.getInt(i3));
            i3++;
        }
    }

    public void o(int i2, int i3) {
        this.f20864a.o(i2, i3);
    }

    public final void o0(int i2, List list, boolean z2) {
        int i3 = 0;
        if (z2) {
            this.f20864a.A1(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                i4 += CodedOutputStream.D0(((Integer) list.get(i5)).intValue());
            }
            this.f20864a.B1(i4);
            while (i3 < list.size()) {
                this.f20864a.v1(((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            this.f20864a.F(i2, ((Integer) list.get(i3)).intValue());
            i3++;
        }
    }

    public void p(int i2, List list, boolean z2) {
        if (list instanceof FloatArrayList) {
            g0(i2, (FloatArrayList) list, z2);
        } else {
            h0(i2, list, z2);
        }
    }

    public final void p0(int i2, LongArrayList longArrayList, boolean z2) {
        int i3 = 0;
        if (z2) {
            this.f20864a.A1(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < longArrayList.size(); i5++) {
                i4 += CodedOutputStream.F0(longArrayList.p(i5));
            }
            this.f20864a.B1(i4);
            while (i3 < longArrayList.size()) {
                this.f20864a.w1(longArrayList.p(i3));
                i3++;
            }
            return;
        }
        while (i3 < longArrayList.size()) {
            this.f20864a.J(i2, longArrayList.p(i3));
            i3++;
        }
    }

    public void q(int i2, int i3) {
        this.f20864a.q(i2, i3);
    }

    public final void q0(int i2, List list, boolean z2) {
        int i3 = 0;
        if (z2) {
            this.f20864a.A1(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                i4 += CodedOutputStream.F0(((Long) list.get(i5)).longValue());
            }
            this.f20864a.B1(i4);
            while (i3 < list.size()) {
                this.f20864a.w1(((Long) list.get(i3)).longValue());
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            this.f20864a.J(i2, ((Long) list.get(i3)).longValue());
            i3++;
        }
    }

    public final void r(int i2, Object obj) {
        if (obj instanceof ByteString) {
            this.f20864a.u1(i2, (ByteString) obj);
        } else {
            this.f20864a.t1(i2, (MessageLite) obj);
        }
    }

    public final void r0(int i2, IntArrayList intArrayList, boolean z2) {
        int i3 = 0;
        if (z2) {
            this.f20864a.A1(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < intArrayList.size(); i5++) {
                i4 += CodedOutputStream.H0(intArrayList.getInt(i5));
            }
            this.f20864a.B1(i4);
            while (i3 < intArrayList.size()) {
                this.f20864a.x1(intArrayList.getInt(i3));
                i3++;
            }
            return;
        }
        while (i3 < intArrayList.size()) {
            this.f20864a.W(i2, intArrayList.getInt(i3));
            i3++;
        }
    }

    public void s(int i2, int i3) {
        this.f20864a.s(i2, i3);
    }

    public void s0(int i2, List list, boolean z2) {
        int i3 = 0;
        if (z2) {
            this.f20864a.A1(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                i4 += CodedOutputStream.H0(((Integer) list.get(i5)).intValue());
            }
            this.f20864a.B1(i4);
            while (i3 < list.size()) {
                this.f20864a.x1(((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            this.f20864a.W(i2, ((Integer) list.get(i3)).intValue());
            i3++;
        }
    }

    public void t(int i2, double d2) {
        this.f20864a.t(i2, d2);
    }

    public final void t0(int i2, LongArrayList longArrayList, boolean z2) {
        int i3 = 0;
        if (z2) {
            this.f20864a.A1(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < longArrayList.size(); i5++) {
                i4 += CodedOutputStream.J0(longArrayList.p(i5));
            }
            this.f20864a.B1(i4);
            while (i3 < longArrayList.size()) {
                this.f20864a.y1(longArrayList.p(i3));
                i3++;
            }
            return;
        }
        while (i3 < longArrayList.size()) {
            this.f20864a.O(i2, longArrayList.p(i3));
            i3++;
        }
    }

    public void u(int i2, List list, boolean z2) {
        if (list instanceof LongArrayList) {
            p0(i2, (LongArrayList) list, z2);
        } else {
            q0(i2, list, z2);
        }
    }

    public final void u0(int i2, List list, boolean z2) {
        int i3 = 0;
        if (z2) {
            this.f20864a.A1(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                i4 += CodedOutputStream.J0(((Long) list.get(i5)).longValue());
            }
            this.f20864a.B1(i4);
            while (i3 < list.size()) {
                this.f20864a.y1(((Long) list.get(i3)).longValue());
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            this.f20864a.O(i2, ((Long) list.get(i3)).longValue());
            i3++;
        }
    }

    public void v(int i2, List list, boolean z2) {
        if (list instanceof LongArrayList) {
            x0(i2, (LongArrayList) list, z2);
        } else {
            y0(i2, list, z2);
        }
    }

    public final void v0(int i2, IntArrayList intArrayList, boolean z2) {
        int i3 = 0;
        if (z2) {
            this.f20864a.A1(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < intArrayList.size(); i5++) {
                i4 += CodedOutputStream.O0(intArrayList.getInt(i5));
            }
            this.f20864a.B1(i4);
            while (i3 < intArrayList.size()) {
                this.f20864a.B1(intArrayList.getInt(i3));
                i3++;
            }
            return;
        }
        while (i3 < intArrayList.size()) {
            this.f20864a.q(i2, intArrayList.getInt(i3));
            i3++;
        }
    }

    public void w(int i2, long j2) {
        this.f20864a.w(i2, j2);
    }

    public void w0(int i2, List list, boolean z2) {
        int i3 = 0;
        if (z2) {
            this.f20864a.A1(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                i4 += CodedOutputStream.O0(((Integer) list.get(i5)).intValue());
            }
            this.f20864a.B1(i4);
            while (i3 < list.size()) {
                this.f20864a.B1(((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            this.f20864a.q(i2, ((Integer) list.get(i3)).intValue());
            i3++;
        }
    }

    public Writer.FieldOrder x() {
        return Writer.FieldOrder.ASCENDING;
    }

    public final void x0(int i2, LongArrayList longArrayList, boolean z2) {
        int i3 = 0;
        if (z2) {
            this.f20864a.A1(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < longArrayList.size(); i5++) {
                i4 += CodedOutputStream.Q0(longArrayList.p(i5));
            }
            this.f20864a.B1(i4);
            while (i3 < longArrayList.size()) {
                this.f20864a.C1(longArrayList.p(i3));
                i3++;
            }
            return;
        }
        while (i3 < longArrayList.size()) {
            this.f20864a.A(i2, longArrayList.p(i3));
            i3++;
        }
    }

    public void y(int i2, List list) {
        int i3 = 0;
        if (list instanceof LazyStringList) {
            LazyStringList lazyStringList = (LazyStringList) list;
            while (i3 < list.size()) {
                m0(i2, lazyStringList.G(i3));
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            this.f20864a.z(i2, (String) list.get(i3));
            i3++;
        }
    }

    public final void y0(int i2, List list, boolean z2) {
        int i3 = 0;
        if (z2) {
            this.f20864a.A1(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                i4 += CodedOutputStream.Q0(((Long) list.get(i5)).longValue());
            }
            this.f20864a.B1(i4);
            while (i3 < list.size()) {
                this.f20864a.C1(((Long) list.get(i3)).longValue());
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            this.f20864a.A(i2, ((Long) list.get(i3)).longValue());
            i3++;
        }
    }

    public void z(int i2, String str) {
        this.f20864a.z(i2, str);
    }
}
