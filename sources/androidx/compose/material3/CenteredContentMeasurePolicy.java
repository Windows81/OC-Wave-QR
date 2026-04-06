package androidx.compose.material3;

import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.RangesKt;

@Metadata
final class CenteredContentMeasurePolicy implements MeasurePolicy {
    public static final Unit e(Placeable.PlacementScope placementScope) {
        return Unit.f40552a;
    }

    public static final Unit g(Ref.IntRef intRef, List list, Placeable.PlacementScope placementScope) {
        int i2 = intRef.f40906z;
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            Placeable placeable = (Placeable) list.get(i3);
            Placeable.PlacementScope.n(placementScope, placeable, i2, 0, 0.0f, 4, (Object) null);
            i2 += placeable.L0();
        }
        return Unit.f40552a;
    }

    public MeasureResult b(MeasureScope measureScope, List list, long j2) {
        ArrayList arrayList;
        int i2;
        int i3;
        List list2 = list;
        long j3 = j2;
        int l2 = Constraints.l(j2);
        int m2 = Constraints.m(j2);
        int size = list.size();
        if (size < 1) {
            return MeasureScope.R1(measureScope, l2, m2, (Map) null, new C0073d0(), 4, (Object) null);
        }
        Ref.IntRef intRef = new Ref.IntRef();
        int i4 = 0;
        if (!Constraints.h(j2)) {
            arrayList = new ArrayList(list.size());
            int size2 = list2.size();
            while (i4 < size2) {
                arrayList.add(((Measurable) list2.get(i4)).c0(ConstraintsKt.e(j3, Constraints.f19137b.d(m2))));
                i4++;
            }
            i2 = m2;
        } else {
            int i5 = l2 / size;
            int c2 = ShortNavigationBarKt.d(size, l2);
            intRef.f40906z = c2;
            int i6 = (l2 - (c2 * 2)) / size;
            Collection collection = list2;
            int size3 = collection.size();
            for (int i7 = 0; i7 < size3; i7++) {
                int C = ((Measurable) list2.get(i7)).C(i6);
                if (m2 < C) {
                    m2 = RangesKt.j(C, Constraints.k(j2));
                }
            }
            ArrayList arrayList2 = new ArrayList(list.size());
            int size4 = collection.size();
            while (i4 < size4) {
                Measurable measurable = (Measurable) list2.get(i4);
                int a0 = measurable.a0(Constraints.m(j2));
                if (i6 < a0) {
                    i3 = RangesKt.j(a0, i5);
                    intRef.f40906z -= (i3 - i6) / 2;
                } else {
                    i3 = i6;
                }
                arrayList2.add(measurable.c0(ConstraintsKt.e(j3, Constraints.f19137b.c(i3, m2))));
                i4++;
            }
            i2 = m2;
            arrayList = arrayList2;
        }
        return MeasureScope.R1(measureScope, l2, i2, (Map) null, new C0083e0(intRef, arrayList), 4, (Object) null);
    }
}
