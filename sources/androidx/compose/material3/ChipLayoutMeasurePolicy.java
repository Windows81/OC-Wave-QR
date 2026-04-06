package androidx.compose.material3;

import androidx.compose.material3.internal.LayoutUtilKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.util.ListUtilsKt;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class ChipLayoutMeasurePolicy implements MeasurePolicy {
    public static final Unit d(Placeable placeable, int i2, int i3, Placeable placeable2, int i4, Placeable placeable3, int i5, Placeable.PlacementScope placementScope) {
        int i6 = i3;
        if (placeable != null) {
            Placeable.PlacementScope.n(placementScope, placeable, 0, Alignment.f15444a.i().a(i2, i6), 0.0f, 4, (Object) null);
        }
        Placeable.PlacementScope.n(placementScope, placeable2, i4, 0, 0.0f, 4, (Object) null);
        if (placeable3 != null) {
            Placeable.PlacementScope.n(placementScope, placeable3, i4 + placeable2.L0(), Alignment.f15444a.i().a(i5, i6), 0.0f, 4, (Object) null);
        }
        return Unit.f40552a;
    }

    public MeasureResult b(MeasureScope measureScope, List list, long j2) {
        Placeable placeable;
        Object obj;
        Object obj2;
        List list2 = list;
        Collection collection = list2;
        int size = collection.size();
        int i2 = 0;
        while (true) {
            placeable = null;
            if (i2 >= size) {
                obj = null;
                break;
            }
            obj = list2.get(i2);
            if (Intrinsics.d(LayoutIdKt.a((Measurable) obj), "leadingIcon")) {
                break;
            }
            i2++;
        }
        Measurable measurable = (Measurable) obj;
        Placeable c0 = measurable != null ? measurable.c0(Constraints.d(j2, 0, 0, 0, 0, 10, (Object) null)) : null;
        int c2 = LayoutUtilKt.c(c0);
        int a2 = LayoutUtilKt.a(c0);
        int size2 = collection.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list2.get(i3);
            if (Intrinsics.d(LayoutIdKt.a((Measurable) obj2), "trailingIcon")) {
                break;
            }
            i3++;
        }
        Measurable measurable2 = (Measurable) obj2;
        if (measurable2 != null) {
            placeable = measurable2.c0(Constraints.d(j2, 0, 0, 0, 0, 10, (Object) null));
        }
        Placeable placeable2 = placeable;
        int c3 = LayoutUtilKt.c(placeable2);
        int a3 = LayoutUtilKt.a(placeable2);
        int size3 = collection.size();
        for (int i4 = 0; i4 < size3; i4++) {
            Measurable measurable3 = (Measurable) list2.get(i4);
            if (Intrinsics.d(LayoutIdKt.a(measurable3), "label")) {
                Placeable c02 = measurable3.c0(ConstraintsKt.j(j2, -(c2 + c3), 0, 2, (Object) null));
                int L0 = c02.L0() + c2 + c3;
                int max = Math.max(a2, Math.max(c02.C0(), a3));
                return MeasureScope.R1(measureScope, L0, max, (Map) null, new C0190n0(c0, a2, max, c02, c2, placeable2, a3), 4, (Object) null);
            }
        }
        ListUtilsKt.f("Collection contains no element matching the predicate.");
        throw new KotlinNothingValueException();
    }

    public int c(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
        int size = list.size();
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            i3 += ((IntrinsicMeasurable) list.get(i4)).a0(i2);
        }
        return i3;
    }

    public int f(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
        Integer num;
        if (list.isEmpty()) {
            num = null;
        } else {
            num = Integer.valueOf(((IntrinsicMeasurable) list.get(0)).q0(i2));
            int o2 = CollectionsKt.o(list);
            int i3 = 1;
            if (1 <= o2) {
                while (true) {
                    Integer valueOf = Integer.valueOf(((IntrinsicMeasurable) list.get(i3)).q0(i2));
                    if (valueOf.compareTo(num) > 0) {
                        num = valueOf;
                    }
                    if (i3 == o2) {
                        break;
                    }
                    i3++;
                }
            }
        }
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public int h(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
        int size = list.size();
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            i3 += ((IntrinsicMeasurable) list.get(i4)).Z(i2);
        }
        return i3;
    }

    public int i(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
        Integer num;
        if (list.isEmpty()) {
            num = null;
        } else {
            num = Integer.valueOf(((IntrinsicMeasurable) list.get(0)).C(i2));
            int o2 = CollectionsKt.o(list);
            int i3 = 1;
            if (1 <= o2) {
                while (true) {
                    Integer valueOf = Integer.valueOf(((IntrinsicMeasurable) list.get(i3)).C(i2));
                    if (valueOf.compareTo(num) > 0) {
                        num = valueOf;
                    }
                    if (i3 == o2) {
                        break;
                    }
                    i3++;
                }
            }
        }
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }
}
