package androidx.compose.material3;

import androidx.compose.material3.tokens.TimePickerTokens;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.util.ListUtilsKt;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class TimePickerKt$HorizontalPeriodToggle$measurePolicy$1$1 implements MeasurePolicy {

    /* renamed from: a  reason: collision with root package name */
    public static final TimePickerKt$HorizontalPeriodToggle$measurePolicy$1$1 f11500a = new TimePickerKt$HorizontalPeriodToggle$measurePolicy$1$1();

    public static final Unit d(List list, Placeable placeable, Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope placementScope2 = placementScope;
        Placeable.PlacementScope.j(placementScope2, (Placeable) list.get(0), 0, 0, 0.0f, 4, (Object) null);
        Placeable.PlacementScope.j(placementScope2, (Placeable) list.get(1), ((Placeable) list.get(0)).L0(), 0, 0.0f, 4, (Object) null);
        Placeable.PlacementScope.j(placementScope, placeable, ((Placeable) list.get(0)).L0() - (placeable.L0() / 2), 0, 0.0f, 4, (Object) null);
        return Unit.f40552a;
    }

    public final MeasureResult b(MeasureScope measureScope, List list, long j2) {
        List list2 = list;
        int size = list2.size();
        for (int i2 = 0; i2 < size; i2++) {
            Measurable measurable = (Measurable) list2.get(i2);
            if (Intrinsics.d(LayoutIdKt.a(measurable), "Spacer")) {
                Placeable c0 = measurable.c0(Constraints.d(j2, 0, measureScope.P1(TimePickerTokens.f14264a.d()), 0, 0, 12, (Object) null));
                ArrayList arrayList = new ArrayList(list.size());
                int size2 = list2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    Object obj = list2.get(i3);
                    if (!Intrinsics.d(LayoutIdKt.a((Measurable) obj), "Spacer")) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                int size3 = arrayList.size();
                for (int i4 = 0; i4 < size3; i4++) {
                    arrayList2.add(((Measurable) arrayList.get(i4)).c0(Constraints.d(j2, 0, Constraints.l(j2) / 2, 0, 0, 12, (Object) null)));
                }
                return MeasureScope.R1(measureScope, Constraints.l(j2), Constraints.k(j2), (Map) null, new O7(arrayList2, c0), 4, (Object) null);
            }
            MeasureScope measureScope2 = measureScope;
        }
        ListUtilsKt.f("Collection contains no element matching the predicate.");
        throw new KotlinNothingValueException();
    }
}
