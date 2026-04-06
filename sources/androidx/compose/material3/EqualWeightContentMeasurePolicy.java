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
import kotlin.ranges.RangesKt;

@Metadata
final class EqualWeightContentMeasurePolicy implements MeasurePolicy {
    /* access modifiers changed from: private */
    public static final Unit e(Placeable.PlacementScope placementScope) {
        return Unit.f40552a;
    }

    public static final Unit g(List list, Placeable.PlacementScope placementScope) {
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            Placeable placeable = (Placeable) list.get(i3);
            Placeable.PlacementScope.n(placementScope, placeable, i2, 0, 0.0f, 4, (Object) null);
            i2 += placeable.L0();
        }
        return Unit.f40552a;
    }

    public MeasureResult b(MeasureScope measureScope, List list, long j2) {
        ArrayList arrayList;
        int l2 = Constraints.l(j2);
        int m2 = Constraints.m(j2);
        int size = list.size();
        if (size < 1) {
            return MeasureScope.R1(measureScope, l2, m2, (Map) null, new C0264v2(), 4, (Object) null);
        }
        int i2 = 0;
        if (!Constraints.h(j2)) {
            arrayList = new ArrayList(list.size());
            int size2 = list.size();
            while (i2 < size2) {
                arrayList.add(((Measurable) list.get(i2)).c0(ConstraintsKt.e(j2, Constraints.f19137b.d(m2))));
                i2++;
            }
        } else {
            int i3 = l2 / size;
            Collection collection = list;
            int size3 = collection.size();
            for (int i4 = 0; i4 < size3; i4++) {
                int C = ((Measurable) list.get(i4)).C(i3);
                if (m2 < C) {
                    m2 = RangesKt.j(C, Constraints.k(j2));
                }
            }
            ArrayList arrayList2 = new ArrayList(list.size());
            int size4 = collection.size();
            while (i2 < size4) {
                arrayList2.add(((Measurable) list.get(i2)).c0(ConstraintsKt.e(j2, Constraints.f19137b.c(i3, m2))));
                i2++;
            }
            arrayList = arrayList2;
        }
        return MeasureScope.R1(measureScope, l2, m2, (Map) null, new C0273w2(arrayList), 4, (Object) null);
    }
}
