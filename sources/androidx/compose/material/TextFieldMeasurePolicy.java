package androidx.compose.material;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class TextFieldMeasurePolicy implements MeasurePolicy {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f8840a;

    /* renamed from: b  reason: collision with root package name */
    public final float f8841b;

    /* renamed from: c  reason: collision with root package name */
    public final PaddingValues f8842c;

    public TextFieldMeasurePolicy(boolean z2, float f2, PaddingValues paddingValues) {
        this.f8840a = z2;
        this.f8841b = f2;
        this.f8842c = paddingValues;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: androidx.compose.ui.layout.IntrinsicMeasurable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: androidx.compose.ui.layout.IntrinsicMeasurable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v2, resolved type: androidx.compose.ui.layout.IntrinsicMeasurable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: androidx.compose.ui.layout.IntrinsicMeasurable} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int g(androidx.compose.ui.layout.IntrinsicMeasureScope r17, java.util.List r18, int r19, kotlin.jvm.functions.Function2 r20) {
        /*
            r16 = this;
            r0 = r18
            r1 = r20
            int r2 = r18.size()
            r3 = 0
            r4 = r3
        L_0x000a:
            r5 = 0
            if (r4 >= r2) goto L_0x0024
            java.lang.Object r6 = r0.get(r4)
            r7 = r6
            androidx.compose.ui.layout.IntrinsicMeasurable r7 = (androidx.compose.ui.layout.IntrinsicMeasurable) r7
            java.lang.Object r7 = androidx.compose.material.TextFieldImplKt.e(r7)
            java.lang.String r8 = "Leading"
            boolean r7 = kotlin.jvm.internal.Intrinsics.d(r7, r8)
            if (r7 == 0) goto L_0x0021
            goto L_0x0025
        L_0x0021:
            int r4 = r4 + 1
            goto L_0x000a
        L_0x0024:
            r6 = r5
        L_0x0025:
            androidx.compose.ui.layout.IntrinsicMeasurable r6 = (androidx.compose.ui.layout.IntrinsicMeasurable) r6
            r2 = 2147483647(0x7fffffff, float:NaN)
            if (r6 == 0) goto L_0x0046
            int r4 = r6.a0(r2)
            r7 = r19
            int r4 = androidx.compose.material.TextFieldKt.t(r7, r4)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r19)
            java.lang.Object r6 = r1.m(r6, r8)
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            r9 = r6
            goto L_0x004a
        L_0x0046:
            r7 = r19
            r9 = r3
            r4 = r7
        L_0x004a:
            int r6 = r18.size()
            r8 = r3
        L_0x004f:
            if (r8 >= r6) goto L_0x0068
            java.lang.Object r10 = r0.get(r8)
            r11 = r10
            androidx.compose.ui.layout.IntrinsicMeasurable r11 = (androidx.compose.ui.layout.IntrinsicMeasurable) r11
            java.lang.Object r11 = androidx.compose.material.TextFieldImplKt.e(r11)
            java.lang.String r12 = "Trailing"
            boolean r11 = kotlin.jvm.internal.Intrinsics.d(r11, r12)
            if (r11 == 0) goto L_0x0065
            goto L_0x0069
        L_0x0065:
            int r8 = r8 + 1
            goto L_0x004f
        L_0x0068:
            r10 = r5
        L_0x0069:
            androidx.compose.ui.layout.IntrinsicMeasurable r10 = (androidx.compose.ui.layout.IntrinsicMeasurable) r10
            if (r10 == 0) goto L_0x0085
            int r2 = r10.a0(r2)
            int r4 = androidx.compose.material.TextFieldKt.t(r4, r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r19)
            java.lang.Object r2 = r1.m(r10, r2)
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            r10 = r2
            goto L_0x0086
        L_0x0085:
            r10 = r3
        L_0x0086:
            int r2 = r18.size()
            r6 = r3
        L_0x008b:
            if (r6 >= r2) goto L_0x00a4
            java.lang.Object r7 = r0.get(r6)
            r8 = r7
            androidx.compose.ui.layout.IntrinsicMeasurable r8 = (androidx.compose.ui.layout.IntrinsicMeasurable) r8
            java.lang.Object r8 = androidx.compose.material.TextFieldImplKt.e(r8)
            java.lang.String r11 = "Label"
            boolean r8 = kotlin.jvm.internal.Intrinsics.d(r8, r11)
            if (r8 == 0) goto L_0x00a1
            goto L_0x00a5
        L_0x00a1:
            int r6 = r6 + 1
            goto L_0x008b
        L_0x00a4:
            r7 = r5
        L_0x00a5:
            androidx.compose.ui.layout.IntrinsicMeasurable r7 = (androidx.compose.ui.layout.IntrinsicMeasurable) r7
            if (r7 == 0) goto L_0x00b9
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            java.lang.Object r2 = r1.m(r7, r2)
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            r8 = r2
            goto L_0x00ba
        L_0x00b9:
            r8 = r3
        L_0x00ba:
            int r2 = r18.size()
            r6 = r3
        L_0x00bf:
            if (r6 >= r2) goto L_0x0135
            java.lang.Object r7 = r0.get(r6)
            r11 = r7
            androidx.compose.ui.layout.IntrinsicMeasurable r11 = (androidx.compose.ui.layout.IntrinsicMeasurable) r11
            java.lang.Object r11 = androidx.compose.material.TextFieldImplKt.e(r11)
            java.lang.String r12 = "TextField"
            boolean r11 = kotlin.jvm.internal.Intrinsics.d(r11, r12)
            if (r11 == 0) goto L_0x0132
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            java.lang.Object r2 = r1.m(r7, r2)
            java.lang.Number r2 = (java.lang.Number) r2
            int r6 = r2.intValue()
            int r2 = r18.size()
            r7 = r3
        L_0x00e7:
            if (r7 >= r2) goto L_0x0101
            java.lang.Object r11 = r0.get(r7)
            r12 = r11
            androidx.compose.ui.layout.IntrinsicMeasurable r12 = (androidx.compose.ui.layout.IntrinsicMeasurable) r12
            java.lang.Object r12 = androidx.compose.material.TextFieldImplKt.e(r12)
            java.lang.String r13 = "Hint"
            boolean r12 = kotlin.jvm.internal.Intrinsics.d(r12, r13)
            if (r12 == 0) goto L_0x00fe
            r5 = r11
            goto L_0x0101
        L_0x00fe:
            int r7 = r7 + 1
            goto L_0x00e7
        L_0x0101:
            androidx.compose.ui.layout.IntrinsicMeasurable r5 = (androidx.compose.ui.layout.IntrinsicMeasurable) r5
            if (r5 == 0) goto L_0x0115
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            java.lang.Object r0 = r1.m(r5, r0)
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r11 = r0
            goto L_0x0116
        L_0x0115:
            r11 = r3
        L_0x0116:
            if (r8 <= 0) goto L_0x0119
            r3 = 1
        L_0x0119:
            r7 = r3
            r4 = 15
            r5 = 0
            r0 = 0
            r1 = 0
            r2 = 0
            r3 = 0
            long r12 = androidx.compose.ui.unit.ConstraintsKt.b(r0, r1, r2, r3, r4, r5)
            float r14 = r17.getDensity()
            r0 = r16
            androidx.compose.foundation.layout.PaddingValues r15 = r0.f8842c
            int r1 = androidx.compose.material.TextFieldKt.l(r6, r7, r8, r9, r10, r11, r12, r14, r15)
            return r1
        L_0x0132:
            int r6 = r6 + 1
            goto L_0x00bf
        L_0x0135:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            java.lang.String r1 = "Collection contains no element matching the predicate."
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextFieldMeasurePolicy.g(androidx.compose.ui.layout.IntrinsicMeasureScope, java.util.List, int, kotlin.jvm.functions.Function2):int");
    }

    public MeasureResult b(MeasureScope measureScope, List list, long j2) {
        Object obj;
        Object obj2;
        Object obj3;
        int i2;
        Object obj4;
        MeasureScope measureScope2 = measureScope;
        List list2 = list;
        int P1 = measureScope2.P1(this.f8842c.d());
        int P12 = measureScope2.P1(this.f8842c.a());
        int P13 = measureScope2.P1(TextFieldKt.q());
        long d2 = Constraints.d(j2, 0, 0, 0, 0, 10, (Object) null);
        int size = list.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                obj = null;
                break;
            }
            obj = list2.get(i3);
            if (Intrinsics.d(LayoutIdKt.a((Measurable) obj), "Leading")) {
                break;
            }
            i3++;
        }
        Measurable measurable = (Measurable) obj;
        Placeable c0 = measurable != null ? measurable.c0(d2) : null;
        int h2 = TextFieldImplKt.h(c0);
        int size2 = list.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list2.get(i4);
            if (Intrinsics.d(LayoutIdKt.a((Measurable) obj2), "Trailing")) {
                break;
            }
            i4++;
        }
        Measurable measurable2 = (Measurable) obj2;
        Placeable c02 = measurable2 != null ? measurable2.c0(ConstraintsKt.j(d2, -h2, 0, 2, (Object) null)) : null;
        int i5 = -P12;
        int i6 = -(h2 + TextFieldImplKt.h(c02));
        long i7 = ConstraintsKt.i(d2, i6, i5);
        int size3 = list.size();
        int i8 = 0;
        while (true) {
            if (i8 >= size3) {
                obj3 = null;
                break;
            }
            obj3 = list2.get(i8);
            int i9 = size3;
            if (Intrinsics.d(LayoutIdKt.a((Measurable) obj3), "Label")) {
                break;
            }
            i8++;
            size3 = i9;
        }
        Measurable measurable3 = (Measurable) obj3;
        Placeable c03 = measurable3 != null ? measurable3.c0(i7) : null;
        if (c03 != null) {
            i2 = c03.f0(AlignmentLineKt.b());
            if (i2 == Integer.MIN_VALUE) {
                i2 = c03.C0();
            }
        } else {
            i2 = 0;
        }
        int max = Math.max(i2, P1);
        long i10 = ConstraintsKt.i(Constraints.d(j2, 0, 0, 0, 0, 11, (Object) null), i6, c03 != null ? (i5 - P13) - max : (-P1) - P12);
        int size4 = list.size();
        int i11 = 0;
        while (i11 < size4) {
            Measurable measurable4 = (Measurable) list2.get(i11);
            int i12 = size4;
            if (Intrinsics.d(LayoutIdKt.a(measurable4), "TextField")) {
                Placeable c04 = measurable4.c0(i10);
                long d3 = Constraints.d(i10, 0, 0, 0, 0, 14, (Object) null);
                int size5 = list.size();
                int i13 = 0;
                while (true) {
                    if (i13 >= size5) {
                        obj4 = null;
                        break;
                    }
                    obj4 = list2.get(i13);
                    int i14 = size5;
                    if (Intrinsics.d(LayoutIdKt.a((Measurable) obj4), "Hint")) {
                        break;
                    }
                    i13++;
                    list2 = list;
                    size5 = i14;
                }
                Measurable measurable5 = (Measurable) obj4;
                Placeable c05 = measurable5 != null ? measurable5.c0(d3) : null;
                int h3 = TextFieldKt.m(TextFieldImplKt.h(c0), TextFieldImplKt.h(c02), c04.L0(), TextFieldImplKt.h(c03), TextFieldImplKt.h(c05), j2);
                int g2 = TextFieldKt.l(c04.C0(), c03 != null, max, TextFieldImplKt.g(c0), TextFieldImplKt.g(c02), TextFieldImplKt.g(c05), j2, measureScope.getDensity(), this.f8842c);
                return MeasureScope.R1(measureScope, h3, g2, (Map) null, new TextFieldMeasurePolicy$measure$1(c03, P1, i2, h3, g2, c04, c05, c0, c02, this, max, P13, measureScope), 4, (Object) null);
            }
            i11++;
            list2 = list;
            size4 = i12;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public int c(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
        return j(list, i2, TextFieldMeasurePolicy$maxIntrinsicWidth$1.f8844z);
    }

    public int f(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
        return g(intrinsicMeasureScope, list, i2, TextFieldMeasurePolicy$minIntrinsicHeight$1.f8848z);
    }

    public int h(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
        return j(list, i2, TextFieldMeasurePolicy$minIntrinsicWidth$1.f8849z);
    }

    public int i(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
        return g(intrinsicMeasureScope, list, i2, TextFieldMeasurePolicy$maxIntrinsicHeight$1.f8843z);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: androidx.compose.ui.layout.IntrinsicMeasurable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: androidx.compose.ui.layout.IntrinsicMeasurable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: androidx.compose.ui.layout.IntrinsicMeasurable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: androidx.compose.ui.layout.IntrinsicMeasurable} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int j(java.util.List r16, int r17, kotlin.jvm.functions.Function2 r18) {
        /*
            r15 = this;
            r0 = r16
            r1 = r18
            int r2 = r16.size()
            r3 = 0
            r4 = r3
        L_0x000a:
            if (r4 >= r2) goto L_0x010f
            java.lang.Object r5 = r0.get(r4)
            r6 = r5
            androidx.compose.ui.layout.IntrinsicMeasurable r6 = (androidx.compose.ui.layout.IntrinsicMeasurable) r6
            java.lang.Object r6 = androidx.compose.material.TextFieldImplKt.e(r6)
            java.lang.String r7 = "TextField"
            boolean r6 = kotlin.jvm.internal.Intrinsics.d(r6, r7)
            if (r6 == 0) goto L_0x010b
            java.lang.Integer r2 = java.lang.Integer.valueOf(r17)
            java.lang.Object r2 = r1.m(r5, r2)
            java.lang.Number r2 = (java.lang.Number) r2
            int r6 = r2.intValue()
            int r2 = r16.size()
            r4 = r3
        L_0x0032:
            r5 = 0
            if (r4 >= r2) goto L_0x004c
            java.lang.Object r7 = r0.get(r4)
            r8 = r7
            androidx.compose.ui.layout.IntrinsicMeasurable r8 = (androidx.compose.ui.layout.IntrinsicMeasurable) r8
            java.lang.Object r8 = androidx.compose.material.TextFieldImplKt.e(r8)
            java.lang.String r9 = "Label"
            boolean r8 = kotlin.jvm.internal.Intrinsics.d(r8, r9)
            if (r8 == 0) goto L_0x0049
            goto L_0x004d
        L_0x0049:
            int r4 = r4 + 1
            goto L_0x0032
        L_0x004c:
            r7 = r5
        L_0x004d:
            androidx.compose.ui.layout.IntrinsicMeasurable r7 = (androidx.compose.ui.layout.IntrinsicMeasurable) r7
            if (r7 == 0) goto L_0x0061
            java.lang.Integer r2 = java.lang.Integer.valueOf(r17)
            java.lang.Object r2 = r1.m(r7, r2)
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            r7 = r2
            goto L_0x0062
        L_0x0061:
            r7 = r3
        L_0x0062:
            int r2 = r16.size()
            r4 = r3
        L_0x0067:
            if (r4 >= r2) goto L_0x0080
            java.lang.Object r8 = r0.get(r4)
            r9 = r8
            androidx.compose.ui.layout.IntrinsicMeasurable r9 = (androidx.compose.ui.layout.IntrinsicMeasurable) r9
            java.lang.Object r9 = androidx.compose.material.TextFieldImplKt.e(r9)
            java.lang.String r10 = "Trailing"
            boolean r9 = kotlin.jvm.internal.Intrinsics.d(r9, r10)
            if (r9 == 0) goto L_0x007d
            goto L_0x0081
        L_0x007d:
            int r4 = r4 + 1
            goto L_0x0067
        L_0x0080:
            r8 = r5
        L_0x0081:
            androidx.compose.ui.layout.IntrinsicMeasurable r8 = (androidx.compose.ui.layout.IntrinsicMeasurable) r8
            if (r8 == 0) goto L_0x0094
            java.lang.Integer r2 = java.lang.Integer.valueOf(r17)
            java.lang.Object r2 = r1.m(r8, r2)
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            goto L_0x0095
        L_0x0094:
            r2 = r3
        L_0x0095:
            int r4 = r16.size()
            r8 = r3
        L_0x009a:
            if (r8 >= r4) goto L_0x00b3
            java.lang.Object r9 = r0.get(r8)
            r10 = r9
            androidx.compose.ui.layout.IntrinsicMeasurable r10 = (androidx.compose.ui.layout.IntrinsicMeasurable) r10
            java.lang.Object r10 = androidx.compose.material.TextFieldImplKt.e(r10)
            java.lang.String r11 = "Leading"
            boolean r10 = kotlin.jvm.internal.Intrinsics.d(r10, r11)
            if (r10 == 0) goto L_0x00b0
            goto L_0x00b4
        L_0x00b0:
            int r8 = r8 + 1
            goto L_0x009a
        L_0x00b3:
            r9 = r5
        L_0x00b4:
            androidx.compose.ui.layout.IntrinsicMeasurable r9 = (androidx.compose.ui.layout.IntrinsicMeasurable) r9
            if (r9 == 0) goto L_0x00c7
            java.lang.Integer r4 = java.lang.Integer.valueOf(r17)
            java.lang.Object r4 = r1.m(r9, r4)
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            goto L_0x00c8
        L_0x00c7:
            r4 = r3
        L_0x00c8:
            int r8 = r16.size()
            r9 = r3
        L_0x00cd:
            if (r9 >= r8) goto L_0x00e7
            java.lang.Object r10 = r0.get(r9)
            r11 = r10
            androidx.compose.ui.layout.IntrinsicMeasurable r11 = (androidx.compose.ui.layout.IntrinsicMeasurable) r11
            java.lang.Object r11 = androidx.compose.material.TextFieldImplKt.e(r11)
            java.lang.String r12 = "Hint"
            boolean r11 = kotlin.jvm.internal.Intrinsics.d(r11, r12)
            if (r11 == 0) goto L_0x00e4
            r5 = r10
            goto L_0x00e7
        L_0x00e4:
            int r9 = r9 + 1
            goto L_0x00cd
        L_0x00e7:
            androidx.compose.ui.layout.IntrinsicMeasurable r5 = (androidx.compose.ui.layout.IntrinsicMeasurable) r5
            if (r5 == 0) goto L_0x00f9
            java.lang.Integer r0 = java.lang.Integer.valueOf(r17)
            java.lang.Object r0 = r1.m(r5, r0)
            java.lang.Number r0 = (java.lang.Number) r0
            int r3 = r0.intValue()
        L_0x00f9:
            r8 = r3
            r13 = 15
            r14 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            long r9 = androidx.compose.ui.unit.ConstraintsKt.b(r9, r10, r11, r12, r13, r14)
            r5 = r2
            int r0 = androidx.compose.material.TextFieldKt.m(r4, r5, r6, r7, r8, r9)
            return r0
        L_0x010b:
            int r4 = r4 + 1
            goto L_0x000a
        L_0x010f:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            java.lang.String r1 = "Collection contains no element matching the predicate."
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextFieldMeasurePolicy.j(java.util.List, int, kotlin.jvm.functions.Function2):int");
    }
}
