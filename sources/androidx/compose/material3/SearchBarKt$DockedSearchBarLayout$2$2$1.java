package androidx.compose.material3;

import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.MultiContentMeasurePolicy;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.util.MathHelpersKt;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.ranges.RangesKt;

@Metadata
public final class SearchBarKt$DockedSearchBarLayout$2$2$1 implements MultiContentMeasurePolicy {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SearchBarState f10846a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ float f10847b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ float f10848c;

    public SearchBarKt$DockedSearchBarLayout$2$2$1(SearchBarState searchBarState, float f2, float f3) {
        this.f10846a = searchBarState;
        this.f10847b = f2;
        this.f10848c = f3;
    }

    public static final Unit d(List list, List list2, int i2, Placeable.PlacementScope placementScope) {
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            Placeable.PlacementScope.j(placementScope, (Placeable) list.get(i3), 0, 0, 0.0f, 4, (Object) null);
        }
        int size2 = list2.size();
        for (int i4 = 0; i4 < size2; i4++) {
            Placeable.PlacementScope.j(placementScope, (Placeable) list2.get(i4), 0, i2, 0.0f, 4, (Object) null);
        }
        return Unit.f40552a;
    }

    public final MeasureResult b(MeasureScope measureScope, List list, long j2) {
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        MeasureScope measureScope2 = measureScope;
        List list2 = list;
        int i2 = 0;
        List list3 = (List) list2.get(0);
        int i3 = 1;
        List list4 = (List) list2.get(1);
        int c2 = MathHelpersKt.c(SearchBarKt.J(this.f10846a).f(), measureScope2.P1(this.f10847b), this.f10846a.e());
        long e2 = ConstraintsKt.e(j2, ConstraintsKt.b(0, 0, RangesKt.j(measureScope2.P1(this.f10848c), c2), c2, 3, (Object) null));
        long d2 = Constraints.d(e2, 0, 0, 0, 0, 10, (Object) null);
        ArrayList arrayList = new ArrayList(list3.size());
        int size = list3.size();
        for (int i4 = 0; i4 < size; i4++) {
            arrayList.add(((Measurable) list3.get(i4)).c0(d2));
        }
        if (arrayList.isEmpty()) {
            num = null;
        } else {
            num = Integer.valueOf(((Placeable) arrayList.get(0)).L0());
            int o2 = CollectionsKt.o(arrayList);
            if (1 <= o2) {
                int i5 = 1;
                while (true) {
                    Integer valueOf = Integer.valueOf(((Placeable) arrayList.get(i5)).L0());
                    if (valueOf.compareTo(num) > 0) {
                        num = valueOf;
                    }
                    if (i5 == o2) {
                        break;
                    }
                    i5++;
                }
            }
        }
        int intValue = num != null ? num.intValue() : 0;
        if (arrayList.isEmpty()) {
            num2 = null;
        } else {
            num2 = Integer.valueOf(((Placeable) arrayList.get(0)).C0());
            int o3 = CollectionsKt.o(arrayList);
            if (1 <= o3) {
                int i6 = 1;
                while (true) {
                    Integer valueOf2 = Integer.valueOf(((Placeable) arrayList.get(i6)).C0());
                    if (valueOf2.compareTo(num2) > 0) {
                        num2 = valueOf2;
                    }
                    if (i6 == o3) {
                        break;
                    }
                    i6++;
                }
            }
        }
        int intValue2 = num2 != null ? num2.intValue() : 0;
        int i7 = intValue2;
        long d3 = Constraints.d(ConstraintsKt.j(d2, 0, -intValue2, 1, (Object) null), 0, intValue, 0, 0, 13, (Object) null);
        ArrayList arrayList2 = new ArrayList(list4.size());
        int size2 = list4.size();
        for (int i8 = 0; i8 < size2; i8++) {
            arrayList2.add(((Measurable) list4.get(i8)).c0(d3));
        }
        if (arrayList2.isEmpty()) {
            num3 = null;
        } else {
            num3 = Integer.valueOf(((Placeable) arrayList2.get(0)).C0());
            int o4 = CollectionsKt.o(arrayList2);
            if (1 <= o4) {
                int i9 = 1;
                while (true) {
                    Integer valueOf3 = Integer.valueOf(((Placeable) arrayList2.get(i9)).C0());
                    if (valueOf3.compareTo(num3) > 0) {
                        num3 = valueOf3;
                    }
                    if (i9 == o4) {
                        break;
                    }
                    i9++;
                }
            }
        }
        int intValue3 = i7 + (num3 != null ? num3.intValue() : 0);
        if (arrayList2.isEmpty()) {
            num4 = null;
        } else {
            Integer valueOf4 = Integer.valueOf(((Placeable) arrayList2.get(0)).L0());
            int o5 = CollectionsKt.o(arrayList2);
            if (1 <= o5) {
                while (true) {
                    Integer valueOf5 = Integer.valueOf(((Placeable) arrayList2.get(i3)).L0());
                    if (valueOf5.compareTo(valueOf4) > 0) {
                        valueOf4 = valueOf5;
                    }
                    if (i3 == o5) {
                        break;
                    }
                    i3++;
                }
            }
            num4 = valueOf4;
        }
        if (num4 != null) {
            i2 = num4.intValue();
        }
        return MeasureScope.R1(measureScope, ConstraintsKt.g(e2, Math.max(intValue, i2)), ConstraintsKt.f(e2, intValue3), (Map) null, new D5(arrayList, arrayList2, i7), 4, (Object) null);
    }
}
