package androidx.compose.material;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.util.MathHelpersKt;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class OutlinedTextFieldMeasurePolicy implements MeasurePolicy {

    /* renamed from: a  reason: collision with root package name */
    public final Function1 f8150a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f8151b;

    /* renamed from: c  reason: collision with root package name */
    public final float f8152c;

    /* renamed from: d  reason: collision with root package name */
    public final PaddingValues f8153d;

    public OutlinedTextFieldMeasurePolicy(Function1 function1, boolean z2, float f2, PaddingValues paddingValues) {
        this.f8150a = function1;
        this.f8151b = z2;
        this.f8152c = f2;
        this.f8153d = paddingValues;
    }

    public MeasureResult b(MeasureScope measureScope, List list, long j2) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        MeasureScope measureScope2 = measureScope;
        List list2 = list;
        int P1 = measureScope2.P1(this.f8153d.a());
        long d2 = Constraints.d(j2, 0, 0, 0, 0, 10, (Object) null);
        int size = list.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                obj = null;
                break;
            }
            obj = list2.get(i2);
            if (Intrinsics.d(LayoutIdKt.a((Measurable) obj), "Leading")) {
                break;
            }
            i2++;
        }
        Measurable measurable = (Measurable) obj;
        Placeable c0 = measurable != null ? measurable.c0(d2) : null;
        int h2 = TextFieldImplKt.h(c0);
        int size2 = list.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list2.get(i3);
            if (Intrinsics.d(LayoutIdKt.a((Measurable) obj2), "Trailing")) {
                break;
            }
            i3++;
        }
        Measurable measurable2 = (Measurable) obj2;
        Placeable c02 = measurable2 != null ? measurable2.c0(ConstraintsKt.j(d2, -h2, 0, 2, (Object) null)) : null;
        int h3 = h2 + TextFieldImplKt.h(c02);
        int P12 = measureScope2.P1(this.f8153d.b(measureScope.getLayoutDirection())) + measureScope2.P1(this.f8153d.c(measureScope.getLayoutDirection()));
        int i4 = -h3;
        int i5 = -P1;
        long i6 = ConstraintsKt.i(d2, MathHelpersKt.c(i4 - P12, -P12, this.f8152c), i5);
        int size3 = list.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size3) {
                obj3 = null;
                break;
            }
            obj3 = list2.get(i7);
            if (Intrinsics.d(LayoutIdKt.a((Measurable) obj3), "Label")) {
                break;
            }
            i7++;
        }
        Measurable measurable3 = (Measurable) obj3;
        Placeable c03 = measurable3 != null ? measurable3.c0(i6) : null;
        this.f8150a.invoke(Size.c(c03 != null ? SizeKt.a((float) c03.L0(), (float) c03.C0()) : Size.f15876b.b()));
        long d3 = Constraints.d(ConstraintsKt.i(j2, i4, i5 - Math.max(TextFieldImplKt.g(c03) / 2, measureScope2.P1(this.f8153d.d()))), 0, 0, 0, 0, 11, (Object) null);
        int size4 = list.size();
        int i8 = 0;
        while (i8 < size4) {
            Measurable measurable4 = (Measurable) list2.get(i8);
            if (Intrinsics.d(LayoutIdKt.a(measurable4), "TextField")) {
                Placeable c04 = measurable4.c0(d3);
                long d4 = Constraints.d(d3, 0, 0, 0, 0, 14, (Object) null);
                int size5 = list.size();
                int i9 = 0;
                while (true) {
                    if (i9 >= size5) {
                        obj4 = null;
                        break;
                    }
                    obj4 = list2.get(i9);
                    int i10 = size5;
                    if (Intrinsics.d(LayoutIdKt.a((Measurable) obj4), "Hint")) {
                        break;
                    }
                    i9++;
                    size5 = i10;
                }
                Measurable measurable5 = (Measurable) obj4;
                Placeable c05 = measurable5 != null ? measurable5.c0(d4) : null;
                long j3 = j2;
                int h4 = OutlinedTextFieldKt.m(TextFieldImplKt.h(c0), TextFieldImplKt.h(c02), c04.L0(), TextFieldImplKt.h(c03), TextFieldImplKt.h(c05), this.f8152c, j3, measureScope.getDensity(), this.f8153d);
                int g2 = OutlinedTextFieldKt.l(TextFieldImplKt.g(c0), TextFieldImplKt.g(c02), c04.C0(), TextFieldImplKt.g(c03), TextFieldImplKt.g(c05), this.f8152c, j3, measureScope.getDensity(), this.f8153d);
                int size6 = list.size();
                for (int i11 = 0; i11 < size6; i11++) {
                    Measurable measurable6 = (Measurable) list2.get(i11);
                    if (Intrinsics.d(LayoutIdKt.a(measurable6), "border")) {
                        return MeasureScope.R1(measureScope, h4, g2, (Map) null, new OutlinedTextFieldMeasurePolicy$measure$1(g2, h4, c0, c02, c04, c03, c05, measurable6.c0(ConstraintsKt.a(h4 != Integer.MAX_VALUE ? h4 : 0, h4, g2 != Integer.MAX_VALUE ? g2 : 0, g2)), this, measureScope), 4, (Object) null);
                    }
                    int i12 = h4;
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            i8++;
            long j4 = j2;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public int c(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
        return j(intrinsicMeasureScope, list, i2, OutlinedTextFieldMeasurePolicy$maxIntrinsicWidth$1.f8155z);
    }

    public int f(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
        return g(intrinsicMeasureScope, list, i2, OutlinedTextFieldMeasurePolicy$minIntrinsicHeight$1.f8159z);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: androidx.compose.ui.layout.IntrinsicMeasurable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: androidx.compose.ui.layout.IntrinsicMeasurable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v2, resolved type: androidx.compose.ui.layout.IntrinsicMeasurable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: androidx.compose.ui.layout.IntrinsicMeasurable} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int g(androidx.compose.ui.layout.IntrinsicMeasureScope r19, java.util.List r20, int r21, kotlin.jvm.functions.Function2 r22) {
        /*
            r18 = this;
            r0 = r18
            r1 = r20
            r2 = r21
            r3 = r22
            int r4 = r20.size()
            r5 = 0
            r6 = r5
        L_0x000e:
            r7 = 0
            if (r6 >= r4) goto L_0x0028
            java.lang.Object r8 = r1.get(r6)
            r9 = r8
            androidx.compose.ui.layout.IntrinsicMeasurable r9 = (androidx.compose.ui.layout.IntrinsicMeasurable) r9
            java.lang.Object r9 = androidx.compose.material.TextFieldImplKt.e(r9)
            java.lang.String r10 = "Leading"
            boolean r9 = kotlin.jvm.internal.Intrinsics.d(r9, r10)
            if (r9 == 0) goto L_0x0025
            goto L_0x0029
        L_0x0025:
            int r6 = r6 + 1
            goto L_0x000e
        L_0x0028:
            r8 = r7
        L_0x0029:
            androidx.compose.ui.layout.IntrinsicMeasurable r8 = (androidx.compose.ui.layout.IntrinsicMeasurable) r8
            r4 = 2147483647(0x7fffffff, float:NaN)
            if (r8 == 0) goto L_0x0047
            int r6 = r8.a0(r4)
            int r6 = androidx.compose.material.OutlinedTextFieldKt.q(r2, r6)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r21)
            java.lang.Object r8 = r3.m(r8, r9)
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            goto L_0x0049
        L_0x0047:
            r6 = r2
            r8 = r5
        L_0x0049:
            int r9 = r20.size()
            r10 = r5
        L_0x004e:
            if (r10 >= r9) goto L_0x0067
            java.lang.Object r11 = r1.get(r10)
            r12 = r11
            androidx.compose.ui.layout.IntrinsicMeasurable r12 = (androidx.compose.ui.layout.IntrinsicMeasurable) r12
            java.lang.Object r12 = androidx.compose.material.TextFieldImplKt.e(r12)
            java.lang.String r13 = "Trailing"
            boolean r12 = kotlin.jvm.internal.Intrinsics.d(r12, r13)
            if (r12 == 0) goto L_0x0064
            goto L_0x0068
        L_0x0064:
            int r10 = r10 + 1
            goto L_0x004e
        L_0x0067:
            r11 = r7
        L_0x0068:
            androidx.compose.ui.layout.IntrinsicMeasurable r11 = (androidx.compose.ui.layout.IntrinsicMeasurable) r11
            if (r11 == 0) goto L_0x0084
            int r4 = r11.a0(r4)
            int r6 = androidx.compose.material.OutlinedTextFieldKt.q(r6, r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r21)
            java.lang.Object r4 = r3.m(r11, r4)
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            r9 = r4
            goto L_0x0085
        L_0x0084:
            r9 = r5
        L_0x0085:
            int r4 = r20.size()
            r10 = r5
        L_0x008a:
            if (r10 >= r4) goto L_0x00a3
            java.lang.Object r11 = r1.get(r10)
            r12 = r11
            androidx.compose.ui.layout.IntrinsicMeasurable r12 = (androidx.compose.ui.layout.IntrinsicMeasurable) r12
            java.lang.Object r12 = androidx.compose.material.TextFieldImplKt.e(r12)
            java.lang.String r13 = "Label"
            boolean r12 = kotlin.jvm.internal.Intrinsics.d(r12, r13)
            if (r12 == 0) goto L_0x00a0
            goto L_0x00a4
        L_0x00a0:
            int r10 = r10 + 1
            goto L_0x008a
        L_0x00a3:
            r11 = r7
        L_0x00a4:
            androidx.compose.ui.layout.IntrinsicMeasurable r11 = (androidx.compose.ui.layout.IntrinsicMeasurable) r11
            if (r11 == 0) goto L_0x00be
            float r4 = r0.f8152c
            int r2 = androidx.compose.ui.util.MathHelpersKt.c(r6, r2, r4)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r2 = r3.m(r11, r2)
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            r11 = r2
            goto L_0x00bf
        L_0x00be:
            r11 = r5
        L_0x00bf:
            int r2 = r20.size()
            r4 = r5
        L_0x00c4:
            if (r4 >= r2) goto L_0x0136
            java.lang.Object r10 = r1.get(r4)
            r12 = r10
            androidx.compose.ui.layout.IntrinsicMeasurable r12 = (androidx.compose.ui.layout.IntrinsicMeasurable) r12
            java.lang.Object r12 = androidx.compose.material.TextFieldImplKt.e(r12)
            java.lang.String r13 = "TextField"
            boolean r12 = kotlin.jvm.internal.Intrinsics.d(r12, r13)
            if (r12 == 0) goto L_0x0133
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)
            java.lang.Object r2 = r3.m(r10, r2)
            java.lang.Number r2 = (java.lang.Number) r2
            int r10 = r2.intValue()
            int r2 = r20.size()
            r4 = r5
        L_0x00ec:
            if (r4 >= r2) goto L_0x0106
            java.lang.Object r12 = r1.get(r4)
            r13 = r12
            androidx.compose.ui.layout.IntrinsicMeasurable r13 = (androidx.compose.ui.layout.IntrinsicMeasurable) r13
            java.lang.Object r13 = androidx.compose.material.TextFieldImplKt.e(r13)
            java.lang.String r14 = "Hint"
            boolean r13 = kotlin.jvm.internal.Intrinsics.d(r13, r14)
            if (r13 == 0) goto L_0x0103
            r7 = r12
            goto L_0x0106
        L_0x0103:
            int r4 = r4 + 1
            goto L_0x00ec
        L_0x0106:
            androidx.compose.ui.layout.IntrinsicMeasurable r7 = (androidx.compose.ui.layout.IntrinsicMeasurable) r7
            if (r7 == 0) goto L_0x0118
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
            java.lang.Object r1 = r3.m(r7, r1)
            java.lang.Number r1 = (java.lang.Number) r1
            int r5 = r1.intValue()
        L_0x0118:
            r12 = r5
            float r13 = r0.f8152c
            r5 = 15
            r6 = 0
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            long r14 = androidx.compose.ui.unit.ConstraintsKt.b(r1, r2, r3, r4, r5, r6)
            float r16 = r19.getDensity()
            androidx.compose.foundation.layout.PaddingValues r1 = r0.f8153d
            r17 = r1
            int r1 = androidx.compose.material.OutlinedTextFieldKt.l(r8, r9, r10, r11, r12, r13, r14, r16, r17)
            return r1
        L_0x0133:
            int r4 = r4 + 1
            goto L_0x00c4
        L_0x0136:
            java.util.NoSuchElementException r1 = new java.util.NoSuchElementException
            java.lang.String r2 = "Collection contains no element matching the predicate."
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.OutlinedTextFieldMeasurePolicy.g(androidx.compose.ui.layout.IntrinsicMeasureScope, java.util.List, int, kotlin.jvm.functions.Function2):int");
    }

    public int h(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
        return j(intrinsicMeasureScope, list, i2, OutlinedTextFieldMeasurePolicy$minIntrinsicWidth$1.f8160z);
    }

    public int i(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
        return g(intrinsicMeasureScope, list, i2, OutlinedTextFieldMeasurePolicy$maxIntrinsicHeight$1.f8154z);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: androidx.compose.ui.layout.IntrinsicMeasurable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: androidx.compose.ui.layout.IntrinsicMeasurable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v1, resolved type: androidx.compose.ui.layout.IntrinsicMeasurable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: androidx.compose.ui.layout.IntrinsicMeasurable} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int j(androidx.compose.ui.layout.IntrinsicMeasureScope r18, java.util.List r19, int r20, kotlin.jvm.functions.Function2 r21) {
        /*
            r17 = this;
            r0 = r17
            r1 = r19
            r2 = r21
            int r3 = r19.size()
            r4 = 0
            r5 = r4
        L_0x000c:
            if (r5 >= r3) goto L_0x011a
            java.lang.Object r6 = r1.get(r5)
            r7 = r6
            androidx.compose.ui.layout.IntrinsicMeasurable r7 = (androidx.compose.ui.layout.IntrinsicMeasurable) r7
            java.lang.Object r7 = androidx.compose.material.TextFieldImplKt.e(r7)
            java.lang.String r8 = "TextField"
            boolean r7 = kotlin.jvm.internal.Intrinsics.d(r7, r8)
            if (r7 == 0) goto L_0x0116
            java.lang.Integer r3 = java.lang.Integer.valueOf(r20)
            java.lang.Object r3 = r2.m(r6, r3)
            java.lang.Number r3 = (java.lang.Number) r3
            int r7 = r3.intValue()
            int r3 = r19.size()
            r5 = r4
        L_0x0034:
            r6 = 0
            if (r5 >= r3) goto L_0x004e
            java.lang.Object r8 = r1.get(r5)
            r9 = r8
            androidx.compose.ui.layout.IntrinsicMeasurable r9 = (androidx.compose.ui.layout.IntrinsicMeasurable) r9
            java.lang.Object r9 = androidx.compose.material.TextFieldImplKt.e(r9)
            java.lang.String r10 = "Label"
            boolean r9 = kotlin.jvm.internal.Intrinsics.d(r9, r10)
            if (r9 == 0) goto L_0x004b
            goto L_0x004f
        L_0x004b:
            int r5 = r5 + 1
            goto L_0x0034
        L_0x004e:
            r8 = r6
        L_0x004f:
            androidx.compose.ui.layout.IntrinsicMeasurable r8 = (androidx.compose.ui.layout.IntrinsicMeasurable) r8
            if (r8 == 0) goto L_0x0063
            java.lang.Integer r3 = java.lang.Integer.valueOf(r20)
            java.lang.Object r3 = r2.m(r8, r3)
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            r8 = r3
            goto L_0x0064
        L_0x0063:
            r8 = r4
        L_0x0064:
            int r3 = r19.size()
            r5 = r4
        L_0x0069:
            if (r5 >= r3) goto L_0x0082
            java.lang.Object r9 = r1.get(r5)
            r10 = r9
            androidx.compose.ui.layout.IntrinsicMeasurable r10 = (androidx.compose.ui.layout.IntrinsicMeasurable) r10
            java.lang.Object r10 = androidx.compose.material.TextFieldImplKt.e(r10)
            java.lang.String r11 = "Trailing"
            boolean r10 = kotlin.jvm.internal.Intrinsics.d(r10, r11)
            if (r10 == 0) goto L_0x007f
            goto L_0x0083
        L_0x007f:
            int r5 = r5 + 1
            goto L_0x0069
        L_0x0082:
            r9 = r6
        L_0x0083:
            androidx.compose.ui.layout.IntrinsicMeasurable r9 = (androidx.compose.ui.layout.IntrinsicMeasurable) r9
            if (r9 == 0) goto L_0x0096
            java.lang.Integer r3 = java.lang.Integer.valueOf(r20)
            java.lang.Object r3 = r2.m(r9, r3)
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            goto L_0x0097
        L_0x0096:
            r3 = r4
        L_0x0097:
            int r5 = r19.size()
            r9 = r4
        L_0x009c:
            if (r9 >= r5) goto L_0x00b5
            java.lang.Object r10 = r1.get(r9)
            r11 = r10
            androidx.compose.ui.layout.IntrinsicMeasurable r11 = (androidx.compose.ui.layout.IntrinsicMeasurable) r11
            java.lang.Object r11 = androidx.compose.material.TextFieldImplKt.e(r11)
            java.lang.String r12 = "Leading"
            boolean r11 = kotlin.jvm.internal.Intrinsics.d(r11, r12)
            if (r11 == 0) goto L_0x00b2
            goto L_0x00b6
        L_0x00b2:
            int r9 = r9 + 1
            goto L_0x009c
        L_0x00b5:
            r10 = r6
        L_0x00b6:
            androidx.compose.ui.layout.IntrinsicMeasurable r10 = (androidx.compose.ui.layout.IntrinsicMeasurable) r10
            if (r10 == 0) goto L_0x00c9
            java.lang.Integer r5 = java.lang.Integer.valueOf(r20)
            java.lang.Object r5 = r2.m(r10, r5)
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            goto L_0x00ca
        L_0x00c9:
            r5 = r4
        L_0x00ca:
            int r9 = r19.size()
            r10 = r4
        L_0x00cf:
            if (r10 >= r9) goto L_0x00e9
            java.lang.Object r11 = r1.get(r10)
            r12 = r11
            androidx.compose.ui.layout.IntrinsicMeasurable r12 = (androidx.compose.ui.layout.IntrinsicMeasurable) r12
            java.lang.Object r12 = androidx.compose.material.TextFieldImplKt.e(r12)
            java.lang.String r13 = "Hint"
            boolean r12 = kotlin.jvm.internal.Intrinsics.d(r12, r13)
            if (r12 == 0) goto L_0x00e6
            r6 = r11
            goto L_0x00e9
        L_0x00e6:
            int r10 = r10 + 1
            goto L_0x00cf
        L_0x00e9:
            androidx.compose.ui.layout.IntrinsicMeasurable r6 = (androidx.compose.ui.layout.IntrinsicMeasurable) r6
            if (r6 == 0) goto L_0x00fb
            java.lang.Integer r1 = java.lang.Integer.valueOf(r20)
            java.lang.Object r1 = r2.m(r6, r1)
            java.lang.Number r1 = (java.lang.Number) r1
            int r4 = r1.intValue()
        L_0x00fb:
            r9 = r4
            float r10 = r0.f8152c
            r15 = 15
            r16 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            long r11 = androidx.compose.ui.unit.ConstraintsKt.b(r11, r12, r13, r14, r15, r16)
            float r13 = r18.getDensity()
            androidx.compose.foundation.layout.PaddingValues r14 = r0.f8153d
            r6 = r3
            int r1 = androidx.compose.material.OutlinedTextFieldKt.m(r5, r6, r7, r8, r9, r10, r11, r13, r14)
            return r1
        L_0x0116:
            int r5 = r5 + 1
            goto L_0x000c
        L_0x011a:
            java.util.NoSuchElementException r1 = new java.util.NoSuchElementException
            java.lang.String r2 = "Collection contains no element matching the predicate."
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.OutlinedTextFieldMeasurePolicy.j(androidx.compose.ui.layout.IntrinsicMeasureScope, java.util.List, int, kotlin.jvm.functions.Function2):int");
    }
}
