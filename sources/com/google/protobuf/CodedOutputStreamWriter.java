package com.google.protobuf;

import com.google.protobuf.MapEntryLite;
import com.google.protobuf.Writer;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

@CheckReturnValue
final class CodedOutputStreamWriter implements Writer {

    /* renamed from: a  reason: collision with root package name */
    public final CodedOutputStream f32072a;

    /* renamed from: com.google.protobuf.CodedOutputStreamWriter$1  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f32073a;

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
                com.google.protobuf.WireFormat$FieldType[] r0 = com.google.protobuf.WireFormat.FieldType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f32073a = r0
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.BOOL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f32073a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.FIXED32     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f32073a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.INT32     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f32073a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.SFIXED32     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f32073a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.SINT32     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f32073a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.UINT32     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f32073a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.FIXED64     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f32073a     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.INT64     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f32073a     // Catch:{ NoSuchFieldError -> 0x006c }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.SFIXED64     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f32073a     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.SINT64     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f32073a     // Catch:{ NoSuchFieldError -> 0x0084 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.UINT64     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = f32073a     // Catch:{ NoSuchFieldError -> 0x0090 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.STRING     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.CodedOutputStreamWriter.AnonymousClass1.<clinit>():void");
        }
    }

    public CodedOutputStreamWriter(CodedOutputStream codedOutputStream) {
        CodedOutputStream codedOutputStream2 = (CodedOutputStream) Internal.b(codedOutputStream, "output");
        this.f32072a = codedOutputStream2;
        codedOutputStream2.f32054a = this;
    }

    public static CodedOutputStreamWriter g(CodedOutputStream codedOutputStream) {
        CodedOutputStreamWriter codedOutputStreamWriter = codedOutputStream.f32054a;
        return codedOutputStreamWriter != null ? codedOutputStreamWriter : new CodedOutputStreamWriter(codedOutputStream);
    }

    private void m(int i2, Object obj) {
        if (obj instanceof String) {
            this.f32072a.z(i2, (String) obj);
        } else {
            this.f32072a.e(i2, (ByteString) obj);
        }
    }

    public void A(int i2, long j2) {
        this.f32072a.A(i2, j2);
    }

    public void B(int i2, Object obj) {
        this.f32072a.n1(i2, (MessageLite) obj);
    }

    public void C(int i2, List list, boolean z2) {
        int i3 = 0;
        if (z2) {
            this.f32072a.x1(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                i4 += CodedOutputStream.o0(((Integer) list.get(i5)).intValue());
            }
            this.f32072a.y1(i4);
            while (i3 < list.size()) {
                this.f32072a.l1(((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            this.f32072a.o(i2, ((Integer) list.get(i3)).intValue());
            i3++;
        }
    }

    public void D(int i2, long j2) {
        this.f32072a.D(i2, j2);
    }

    public void E(int i2, boolean z2) {
        this.f32072a.E(i2, z2);
    }

    public void F(int i2, int i3) {
        this.f32072a.F(i2, i3);
    }

    public void G(int i2) {
        this.f32072a.x1(i2, 3);
    }

    public void H(int i2, List list, boolean z2) {
        int i3 = 0;
        if (z2) {
            this.f32072a.x1(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                i4 += CodedOutputStream.h0(((Long) list.get(i5)).longValue());
            }
            this.f32072a.y1(i4);
            while (i3 < list.size()) {
                this.f32072a.f1(((Long) list.get(i3)).longValue());
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            this.f32072a.w(i2, ((Long) list.get(i3)).longValue());
            i3++;
        }
    }

    public void I(int i2, List list, boolean z2) {
        int i3 = 0;
        if (z2) {
            this.f32072a.x1(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                i4 += CodedOutputStream.C0(((Integer) list.get(i5)).intValue());
            }
            this.f32072a.y1(i4);
            while (i3 < list.size()) {
                this.f32072a.s1(((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            this.f32072a.F(i2, ((Integer) list.get(i3)).intValue());
            i3++;
        }
    }

    public void J(int i2, long j2) {
        this.f32072a.J(i2, j2);
    }

    public void K(int i2, List list, boolean z2) {
        int i3 = 0;
        if (z2) {
            this.f32072a.x1(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                i4 += CodedOutputStream.f0(((Integer) list.get(i5)).intValue());
            }
            this.f32072a.y1(i4);
            while (i3 < list.size()) {
                this.f32072a.e1(((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            this.f32072a.s(i2, ((Integer) list.get(i3)).intValue());
            i3++;
        }
    }

    public void L(int i2, List list, boolean z2) {
        int i3 = 0;
        if (z2) {
            this.f32072a.x1(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                i4 += CodedOutputStream.m(((Boolean) list.get(i5)).booleanValue());
            }
            this.f32072a.y1(i4);
            while (i3 < list.size()) {
                this.f32072a.Y0(((Boolean) list.get(i3)).booleanValue());
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            this.f32072a.E(i2, ((Boolean) list.get(i3)).booleanValue());
            i3++;
        }
    }

    public void M(int i2, List list, boolean z2) {
        int i3 = 0;
        if (z2) {
            this.f32072a.x1(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                i4 += CodedOutputStream.N0(((Integer) list.get(i5)).intValue());
            }
            this.f32072a.y1(i4);
            while (i3 < list.size()) {
                this.f32072a.y1(((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            this.f32072a.q(i2, ((Integer) list.get(i3)).intValue());
            i3++;
        }
    }

    public void N(int i2, List list, boolean z2) {
        int i3 = 0;
        if (z2) {
            this.f32072a.x1(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                i4 += CodedOutputStream.I0(((Long) list.get(i5)).longValue());
            }
            this.f32072a.y1(i4);
            while (i3 < list.size()) {
                this.f32072a.v1(((Long) list.get(i3)).longValue());
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            this.f32072a.O(i2, ((Long) list.get(i3)).longValue());
            i3++;
        }
    }

    public void O(int i2, long j2) {
        this.f32072a.O(i2, j2);
    }

    public void P(int i2, float f2) {
        this.f32072a.P(i2, f2);
    }

    public void Q(int i2) {
        this.f32072a.x1(i2, 4);
    }

    public void R(int i2, List list, boolean z2) {
        int i3 = 0;
        if (z2) {
            this.f32072a.x1(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                i4 += CodedOutputStream.G0(((Integer) list.get(i5)).intValue());
            }
            this.f32072a.y1(i4);
            while (i3 < list.size()) {
                this.f32072a.u1(((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            this.f32072a.W(i2, ((Integer) list.get(i3)).intValue());
            i3++;
        }
    }

    public void S(int i2, int i3) {
        this.f32072a.S(i2, i3);
    }

    public void T(int i2, List list, boolean z2) {
        int i3 = 0;
        if (z2) {
            this.f32072a.x1(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                i4 += CodedOutputStream.q0(((Long) list.get(i5)).longValue());
            }
            this.f32072a.y1(i4);
            while (i3 < list.size()) {
                this.f32072a.m1(((Long) list.get(i3)).longValue());
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            this.f32072a.D(i2, ((Long) list.get(i3)).longValue());
            i3++;
        }
    }

    public void U(int i2, List list, boolean z2) {
        int i3 = 0;
        if (z2) {
            this.f32072a.x1(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                i4 += CodedOutputStream.d0(((Integer) list.get(i5)).intValue());
            }
            this.f32072a.y1(i4);
            while (i3 < list.size()) {
                this.f32072a.d1(((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            this.f32072a.S(i2, ((Integer) list.get(i3)).intValue());
            i3++;
        }
    }

    public void V(int i2, List list, boolean z2) {
        int i3 = 0;
        if (z2) {
            this.f32072a.x1(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                i4 += CodedOutputStream.b0(((Double) list.get(i5)).doubleValue());
            }
            this.f32072a.y1(i4);
            while (i3 < list.size()) {
                this.f32072a.c1(((Double) list.get(i3)).doubleValue());
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            this.f32072a.t(i2, ((Double) list.get(i3)).doubleValue());
            i3++;
        }
    }

    public void W(int i2, int i3) {
        this.f32072a.W(i2, i3);
    }

    public void X(int i2, List list) {
        for (int i3 = 0; i3 < list.size(); i3++) {
            this.f32072a.e(i2, (ByteString) list.get(i3));
        }
    }

    public void a(int i2, List list, Schema schema) {
        for (int i3 = 0; i3 < list.size(); i3++) {
            c(i2, list.get(i3), schema);
        }
    }

    public void b(int i2, List list, Schema schema) {
        for (int i3 = 0; i3 < list.size(); i3++) {
            d(i2, list.get(i3), schema);
        }
    }

    public void c(int i2, Object obj, Schema schema) {
        this.f32072a.o1(i2, (MessageLite) obj, schema);
    }

    public void d(int i2, Object obj, Schema schema) {
        this.f32072a.i1(i2, (MessageLite) obj, schema);
    }

    public void e(int i2, ByteString byteString) {
        this.f32072a.e(i2, byteString);
    }

    public void f(int i2, MapEntryLite.Metadata metadata, Map map) {
        if (this.f32072a.T0()) {
            k(i2, metadata, map);
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            this.f32072a.x1(i2, 2);
            this.f32072a.y1(MapEntryLite.b(metadata, entry.getKey(), entry.getValue()));
            MapEntryLite.e(this.f32072a, metadata, entry.getKey(), entry.getValue());
        }
    }

    public final void h(int i2, boolean z2, Object obj, MapEntryLite.Metadata metadata) {
        this.f32072a.x1(i2, 2);
        this.f32072a.y1(MapEntryLite.b(metadata, Boolean.valueOf(z2), obj));
        MapEntryLite.e(this.f32072a, metadata, Boolean.valueOf(z2), obj);
    }

    public final void i(int i2, MapEntryLite.Metadata metadata, Map map) {
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
            this.f32072a.x1(i2, 2);
            this.f32072a.y1(MapEntryLite.b(metadata, Integer.valueOf(i5), obj));
            MapEntryLite.e(this.f32072a, metadata, Integer.valueOf(i5), obj);
        }
    }

    public final void j(int i2, MapEntryLite.Metadata metadata, Map map) {
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
            this.f32072a.x1(i2, 2);
            this.f32072a.y1(MapEntryLite.b(metadata, Long.valueOf(j2), obj));
            MapEntryLite.e(this.f32072a, metadata, Long.valueOf(j2), obj);
        }
    }

    public final void k(int i2, MapEntryLite.Metadata metadata, Map map) {
        switch (AnonymousClass1.f32073a[metadata.f32218a.ordinal()]) {
            case 1:
                Object obj = map.get(Boolean.FALSE);
                if (obj != null) {
                    h(i2, false, obj, metadata);
                }
                Object obj2 = map.get(Boolean.TRUE);
                if (obj2 != null) {
                    h(i2, true, obj2, metadata);
                    return;
                }
                return;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                i(i2, metadata, map);
                return;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                j(i2, metadata, map);
                return;
            case 12:
                l(i2, metadata, map);
                return;
            default:
                throw new IllegalArgumentException("does not support key type: " + metadata.f32218a);
        }
    }

    public final void l(int i2, MapEntryLite.Metadata metadata, Map map) {
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
            this.f32072a.x1(i2, 2);
            this.f32072a.y1(MapEntryLite.b(metadata, str2, obj));
            MapEntryLite.e(this.f32072a, metadata, str2, obj);
        }
    }

    public void o(int i2, int i3) {
        this.f32072a.o(i2, i3);
    }

    public void p(int i2, List list, boolean z2) {
        int i3 = 0;
        if (z2) {
            this.f32072a.x1(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                i4 += CodedOutputStream.j0(((Float) list.get(i5)).floatValue());
            }
            this.f32072a.y1(i4);
            while (i3 < list.size()) {
                this.f32072a.g1(((Float) list.get(i3)).floatValue());
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            this.f32072a.P(i2, ((Float) list.get(i3)).floatValue());
            i3++;
        }
    }

    public void q(int i2, int i3) {
        this.f32072a.q(i2, i3);
    }

    public final void r(int i2, Object obj) {
        if (obj instanceof ByteString) {
            this.f32072a.r1(i2, (ByteString) obj);
        } else {
            this.f32072a.q1(i2, (MessageLite) obj);
        }
    }

    public void s(int i2, int i3) {
        this.f32072a.s(i2, i3);
    }

    public void t(int i2, double d2) {
        this.f32072a.t(i2, d2);
    }

    public void u(int i2, List list, boolean z2) {
        int i3 = 0;
        if (z2) {
            this.f32072a.x1(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                i4 += CodedOutputStream.E0(((Long) list.get(i5)).longValue());
            }
            this.f32072a.y1(i4);
            while (i3 < list.size()) {
                this.f32072a.t1(((Long) list.get(i3)).longValue());
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            this.f32072a.J(i2, ((Long) list.get(i3)).longValue());
            i3++;
        }
    }

    public void v(int i2, List list, boolean z2) {
        int i3 = 0;
        if (z2) {
            this.f32072a.x1(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                i4 += CodedOutputStream.P0(((Long) list.get(i5)).longValue());
            }
            this.f32072a.y1(i4);
            while (i3 < list.size()) {
                this.f32072a.z1(((Long) list.get(i3)).longValue());
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            this.f32072a.A(i2, ((Long) list.get(i3)).longValue());
            i3++;
        }
    }

    public void w(int i2, long j2) {
        this.f32072a.w(i2, j2);
    }

    public Writer.FieldOrder x() {
        return Writer.FieldOrder.ASCENDING;
    }

    public void y(int i2, List list) {
        int i3 = 0;
        if (list instanceof LazyStringList) {
            LazyStringList lazyStringList = (LazyStringList) list;
            while (i3 < list.size()) {
                m(i2, lazyStringList.G(i3));
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            this.f32072a.z(i2, (String) list.get(i3));
            i3++;
        }
    }

    public void z(int i2, String str) {
        this.f32072a.z(i2, str);
    }
}
