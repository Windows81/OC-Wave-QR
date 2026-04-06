package androidx.compose.material3;

import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.util.ListUtilsKt;
import java.util.List;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class TabKt$TabBaselineLayout$2$1 implements MeasurePolicy {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Function2 f11287a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Function2 f11288b;

    public TabKt$TabBaselineLayout$2$1(Function2 function2, Function2 function22) {
        this.f11287a = function2;
        this.f11288b = function22;
    }

    public static final Unit d(Placeable placeable, Placeable placeable2, MeasureScope measureScope, int i2, int i3, Integer num, Integer num2, Placeable.PlacementScope placementScope) {
        if (placeable != null && placeable2 != null) {
            Intrinsics.f(num);
            int intValue = num.intValue();
            Intrinsics.f(num2);
            TabKt.l(placementScope, measureScope, placeable, placeable2, i2, i3, intValue, num2.intValue());
        } else if (placeable != null) {
            TabKt.m(placementScope, placeable, i3);
        } else if (placeable2 != null) {
            TabKt.m(placementScope, placeable2, i3);
        }
        return Unit.f40552a;
    }

    public final MeasureResult b(MeasureScope measureScope, List list, long j2) {
        Placeable placeable;
        Placeable placeable2;
        MeasureScope measureScope2 = measureScope;
        List list2 = list;
        int i2 = 0;
        if (this.f11287a != null) {
            int size = list2.size();
            int i3 = 0;
            while (i3 < size) {
                Measurable measurable = (Measurable) list2.get(i3);
                if (Intrinsics.d(LayoutIdKt.a(measurable), "text")) {
                    placeable = measurable.c0(Constraints.d(j2, 0, 0, 0, 0, 11, (Object) null));
                } else {
                    i3++;
                }
            }
            ListUtilsKt.f("Collection contains no element matching the predicate.");
            throw new KotlinNothingValueException();
        }
        placeable = null;
        if (this.f11288b != null) {
            int size2 = list2.size();
            int i4 = 0;
            while (i4 < size2) {
                Measurable measurable2 = (Measurable) list2.get(i4);
                if (Intrinsics.d(LayoutIdKt.a(measurable2), "icon")) {
                    placeable2 = measurable2.c0(j2);
                } else {
                    long j3 = j2;
                    i4++;
                }
            }
            ListUtilsKt.f("Collection contains no element matching the predicate.");
            throw new KotlinNothingValueException();
        }
        placeable2 = null;
        int max = Math.max(placeable != null ? placeable.L0() : 0, placeable2 != null ? placeable2.L0() : 0);
        int P1 = measureScope2.P1((placeable == null || placeable2 == null) ? TabKt.f11271a : TabKt.f11272b);
        int C0 = placeable2 != null ? placeable2.C0() : 0;
        if (placeable != null) {
            i2 = placeable.C0();
        }
        int max2 = Math.max(P1, C0 + i2 + measureScope2.K1(TabKt.f11276f));
        return MeasureScope.R1(measureScope, max, max2, (Map) null, new Q6(placeable, placeable2, measureScope, max, max2, placeable != null ? Integer.valueOf(placeable.f0(AlignmentLineKt.a())) : null, placeable != null ? Integer.valueOf(placeable.f0(AlignmentLineKt.b())) : null), 4, (Object) null);
    }
}
