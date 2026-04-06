package androidx.compose.material3;

import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.math.MathKt;

@Metadata
public final class TimePickerKt$CircularLayout$1$1 implements MeasurePolicy {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ float f11486a;

    public TimePickerKt$CircularLayout$1$1(float f2) {
        this.f11486a = f2;
    }

    public static final Unit d(Placeable placeable, List list, Placeable placeable2, long j2, float f2, float f3, Placeable.PlacementScope placementScope) {
        List list2 = list;
        if (placeable != null) {
            Placeable.PlacementScope.j(placementScope, placeable, 0, 0, 0.0f, 4, (Object) null);
        }
        int size = list2.size();
        for (int i2 = 0; i2 < size; i2++) {
            Placeable placeable3 = (Placeable) list2.get(i2);
            int l2 = (Constraints.l(j2) / 2) - (placeable3.L0() / 2);
            double d2 = (double) f2;
            double d3 = ((double) (((float) i2) * f3)) - 1.5707963267948966d;
            double sin = (d2 * Math.sin(d3)) + ((double) ((Constraints.k(j2) / 2) - (placeable3.C0() / 2)));
            Placeable.PlacementScope.j(placementScope, placeable3, MathKt.c((Math.cos(d3) * d2) + ((double) l2)), MathKt.c(sin), 0.0f, 4, (Object) null);
        }
        if (placeable2 != null) {
            Placeable.PlacementScope.j(placementScope, placeable2, (Constraints.n(j2) - placeable2.L0()) / 2, (Constraints.m(j2) - placeable2.C0()) / 2, 0.0f, 4, (Object) null);
        }
        return Unit.f40552a;
    }

    public final MeasureResult b(MeasureScope measureScope, List list, long j2) {
        Object obj;
        Object obj2;
        List list2 = list;
        float k2 = ((float) Constraints.k(j2)) * this.f11486a;
        long d2 = Constraints.d(j2, 0, 0, 0, 0, 10, (Object) null);
        ArrayList arrayList = new ArrayList(list.size());
        Collection collection = list2;
        int size = collection.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj3 = list2.get(i3);
            Measurable measurable = (Measurable) obj3;
            if (!(LayoutIdKt.a(measurable) == LayoutId.Selector || LayoutIdKt.a(measurable) == LayoutId.InnerCircle)) {
                arrayList.add(obj3);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i4 = 0; i4 < size2; i4++) {
            arrayList2.add(((Measurable) arrayList.get(i4)).c0(d2));
        }
        int size3 = collection.size();
        int i5 = 0;
        while (true) {
            if (i5 >= size3) {
                obj = null;
                break;
            }
            obj = list2.get(i5);
            if (LayoutIdKt.a((Measurable) obj) == LayoutId.Selector) {
                break;
            }
            i5++;
        }
        Measurable measurable2 = (Measurable) obj;
        int size4 = collection.size();
        while (true) {
            if (i2 >= size4) {
                obj2 = null;
                break;
            }
            obj2 = list2.get(i2);
            if (LayoutIdKt.a((Measurable) obj2) == LayoutId.InnerCircle) {
                break;
            }
            i2++;
        }
        Measurable measurable3 = (Measurable) obj2;
        return MeasureScope.R1(measureScope, Constraints.n(j2), Constraints.m(j2), (Map) null, new K7(measurable2 != null ? measurable2.c0(d2) : null, arrayList2, measurable3 != null ? measurable3.c0(d2) : null, j2, k2, 6.2831855f / ((float) arrayList2.size())), 4, (Object) null);
    }
}
