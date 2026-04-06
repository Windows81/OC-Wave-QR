package androidx.compose.material3;

import androidx.compose.material3.ListItemType;
import androidx.compose.material3.internal.LayoutUtilKt;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.MultiContentMeasurePolicy;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

@Metadata
final class ListItemMeasurePolicy implements MultiContentMeasurePolicy {
    public final int a(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2, Function2 function2) {
        int i3;
        int i4;
        IntrinsicMeasureScope intrinsicMeasureScope2 = intrinsicMeasureScope;
        List list2 = list;
        Function2 function22 = function2;
        boolean z2 = false;
        List list3 = (List) list2.get(0);
        List list4 = (List) list2.get(1);
        List list5 = (List) list2.get(2);
        List list6 = (List) list2.get(4);
        int d2 = LayoutUtilKt.d(i2, intrinsicMeasureScope2.P1(Dp.m(ListItemKt.s() + ListItemKt.r())));
        IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) CollectionsKt.g0((List) list2.get(3));
        if (intrinsicMeasurable != null) {
            i3 = ((Number) function22.m(intrinsicMeasurable, Integer.valueOf(d2))).intValue();
            d2 = LayoutUtilKt.d(d2, intrinsicMeasurable.a0(Integer.MAX_VALUE));
        } else {
            i3 = 0;
        }
        IntrinsicMeasurable intrinsicMeasurable2 = (IntrinsicMeasurable) CollectionsKt.g0(list6);
        if (intrinsicMeasurable2 != null) {
            i4 = ((Number) function22.m(intrinsicMeasurable2, Integer.valueOf(d2))).intValue();
            d2 = LayoutUtilKt.d(d2, intrinsicMeasurable2.a0(Integer.MAX_VALUE));
        } else {
            i4 = 0;
        }
        IntrinsicMeasurable intrinsicMeasurable3 = (IntrinsicMeasurable) CollectionsKt.g0(list4);
        int intValue = intrinsicMeasurable3 != null ? ((Number) function22.m(intrinsicMeasurable3, Integer.valueOf(d2))).intValue() : 0;
        IntrinsicMeasurable intrinsicMeasurable4 = (IntrinsicMeasurable) CollectionsKt.g0(list3);
        int intValue2 = intrinsicMeasurable4 != null ? ((Number) function22.m(intrinsicMeasurable4, Integer.valueOf(d2))).intValue() : 0;
        IntrinsicMeasurable intrinsicMeasurable5 = (IntrinsicMeasurable) CollectionsKt.g0(list5);
        int intValue3 = intrinsicMeasurable5 != null ? ((Number) function22.m(intrinsicMeasurable5, Integer.valueOf(d2))).intValue() : 0;
        boolean l2 = ListItemKt.u(intrinsicMeasureScope2, intValue3);
        ListItemType.Companion companion = ListItemType.f10250A;
        boolean z3 = intValue > 0;
        if (intValue3 > 0) {
            z2 = true;
        }
        int d3 = companion.d(z3, z2, l2);
        return ListItemKt.o(intrinsicMeasureScope, i3, i4, intValue2, intValue, intValue3, d3, intrinsicMeasureScope2.P1(Dp.m(ListItemKt.x(d3) * ((float) 2))), ConstraintsKt.b(0, 0, 0, 0, 15, (Object) null));
    }

    public MeasureResult b(MeasureScope measureScope, List list, long j2) {
        Placeable placeable;
        List list2;
        MeasureScope measureScope2 = measureScope;
        List list3 = list;
        List list4 = (List) list3.get(0);
        boolean z2 = true;
        List list5 = (List) list3.get(1);
        List list6 = (List) list3.get(2);
        List list7 = (List) list3.get(3);
        List list8 = (List) list3.get(4);
        long d2 = Constraints.d(j2, 0, 0, 0, 0, 10, (Object) null);
        float s2 = ListItemKt.s();
        float r2 = ListItemKt.r();
        int P1 = measureScope2.P1(Dp.m(s2 + r2));
        Measurable measurable = (Measurable) CollectionsKt.g0(list7);
        int Z = measurable != null ? measurable.Z(Constraints.k(j2)) : 0;
        Measurable measurable2 = (Measurable) CollectionsKt.g0(list8);
        int d3 = LayoutUtilKt.d(Constraints.l(d2), Z + (measurable2 != null ? measurable2.Z(Constraints.k(j2)) : 0) + P1);
        Measurable measurable3 = (Measurable) CollectionsKt.g0(list6);
        boolean l2 = ListItemKt.u(measureScope2, measurable3 != null ? measurable3.q0(d3) : 0);
        ListItemType.Companion companion = ListItemType.f10250A;
        boolean z3 = CollectionsKt.g0(list5) != null;
        if (CollectionsKt.g0(list6) == null) {
            z2 = false;
        }
        float f2 = (float) 2;
        long i2 = ConstraintsKt.i(d2, -P1, -measureScope2.P1(Dp.m(ListItemKt.x(companion.d(z3, z2, l2)) * f2)));
        Measurable measurable4 = (Measurable) CollectionsKt.g0(list7);
        Placeable c0 = measurable4 != null ? measurable4.c0(i2) : null;
        int c2 = LayoutUtilKt.c(c0);
        Measurable measurable5 = (Measurable) CollectionsKt.g0(list8);
        if (measurable5 != null) {
            list2 = list6;
            placeable = measurable5.c0(ConstraintsKt.j(i2, -c2, 0, 2, (Object) null));
        } else {
            list2 = list6;
            placeable = null;
        }
        int c3 = c2 + LayoutUtilKt.c(placeable);
        Measurable measurable6 = (Measurable) CollectionsKt.g0(list4);
        Placeable c02 = measurable6 != null ? measurable6.c0(ConstraintsKt.j(i2, -c3, 0, 2, (Object) null)) : null;
        int a2 = LayoutUtilKt.a(c02);
        Measurable measurable7 = (Measurable) CollectionsKt.g0(list2);
        Placeable c03 = measurable7 != null ? measurable7.c0(ConstraintsKt.i(i2, -c3, -a2)) : null;
        int a3 = a2 + LayoutUtilKt.a(c03);
        boolean z4 = (c03 == null || c03.f0(AlignmentLineKt.a()) == c03.f0(AlignmentLineKt.b())) ? false : true;
        Measurable measurable8 = (Measurable) CollectionsKt.g0(list5);
        Placeable c04 = measurable8 != null ? measurable8.c0(ConstraintsKt.i(i2, -c3, -a3)) : null;
        int d4 = companion.d(c04 != null, c03 != null, z4);
        float n2 = ListItemKt.x(d4);
        MeasureScope measureScope3 = measureScope;
        int i3 = P1;
        Placeable placeable2 = c03;
        return ListItemKt.v(measureScope, ListItemKt.p(measureScope3, LayoutUtilKt.c(c0), LayoutUtilKt.c(placeable), LayoutUtilKt.c(c02), LayoutUtilKt.c(c04), LayoutUtilKt.c(c03), i3, j2), ListItemKt.o(measureScope3, LayoutUtilKt.a(c0), LayoutUtilKt.a(placeable), LayoutUtilKt.a(c02), LayoutUtilKt.a(c04), LayoutUtilKt.a(placeable2), d4, measureScope2.P1(Dp.m(f2 * n2)), j2), c0, placeable, c02, c04, placeable2, ListItemType.n(d4, companion.b()), measureScope2.P1(s2), measureScope2.P1(r2), measureScope2.P1(n2));
    }

    public int c(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
        return d(intrinsicMeasureScope, list, i2, ListItemMeasurePolicy$maxIntrinsicWidth$1.I);
    }

    public final int d(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2, Function2 function2) {
        List list2 = list;
        Function2 function22 = function2;
        int i3 = 0;
        List list3 = (List) list2.get(0);
        List list4 = (List) list2.get(1);
        List list5 = (List) list2.get(2);
        List list6 = (List) list2.get(4);
        IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) CollectionsKt.g0((List) list2.get(3));
        int intValue = intrinsicMeasurable != null ? ((Number) function22.m(intrinsicMeasurable, Integer.valueOf(i2))).intValue() : 0;
        IntrinsicMeasurable intrinsicMeasurable2 = (IntrinsicMeasurable) CollectionsKt.g0(list6);
        int intValue2 = intrinsicMeasurable2 != null ? ((Number) function22.m(intrinsicMeasurable2, Integer.valueOf(i2))).intValue() : 0;
        IntrinsicMeasurable intrinsicMeasurable3 = (IntrinsicMeasurable) CollectionsKt.g0(list3);
        int intValue3 = intrinsicMeasurable3 != null ? ((Number) function22.m(intrinsicMeasurable3, Integer.valueOf(i2))).intValue() : 0;
        IntrinsicMeasurable intrinsicMeasurable4 = (IntrinsicMeasurable) CollectionsKt.g0(list4);
        int intValue4 = intrinsicMeasurable4 != null ? ((Number) function22.m(intrinsicMeasurable4, Integer.valueOf(i2))).intValue() : 0;
        IntrinsicMeasurable intrinsicMeasurable5 = (IntrinsicMeasurable) CollectionsKt.g0(list5);
        if (intrinsicMeasurable5 != null) {
            i3 = ((Number) function22.m(intrinsicMeasurable5, Integer.valueOf(i2))).intValue();
        }
        return ListItemKt.p(intrinsicMeasureScope, intValue, intValue2, intValue3, intValue4, i3, intrinsicMeasureScope.P1(Dp.m(ListItemKt.s() + ListItemKt.r())), ConstraintsKt.b(0, 0, 0, 0, 15, (Object) null));
    }

    public int f(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
        return a(intrinsicMeasureScope, list, i2, ListItemMeasurePolicy$minIntrinsicHeight$1.I);
    }

    public int h(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
        return d(intrinsicMeasureScope, list, i2, ListItemMeasurePolicy$minIntrinsicWidth$1.I);
    }

    public int i(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
        return a(intrinsicMeasureScope, list, i2, ListItemMeasurePolicy$maxIntrinsicHeight$1.I);
    }
}
