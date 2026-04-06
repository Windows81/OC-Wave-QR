package androidx.compose.material;

import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class TabKt$TabBaselineLayout$2$1 implements MeasurePolicy {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Function2 f8668a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Function2 f8669b;

    public TabKt$TabBaselineLayout$2$1(Function2 function2, Function2 function22) {
        this.f8668a = function2;
        this.f8669b = function22;
    }

    public final MeasureResult b(MeasureScope measureScope, List list, long j2) {
        Placeable placeable;
        final Placeable placeable2;
        List list2 = list;
        Integer num = null;
        int i2 = 0;
        if (this.f8668a != null) {
            int size = list.size();
            int i3 = 0;
            while (i3 < size) {
                Measurable measurable = (Measurable) list2.get(i3);
                if (Intrinsics.d(LayoutIdKt.a(measurable), "text")) {
                    placeable = measurable.c0(Constraints.d(j2, 0, 0, 0, 0, 11, (Object) null));
                } else {
                    i3++;
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        placeable = null;
        if (this.f8669b != null) {
            int size2 = list.size();
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
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        placeable2 = null;
        int L0 = placeable != null ? placeable.L0() : 0;
        if (placeable2 != null) {
            i2 = placeable2.L0();
        }
        int max = Math.max(L0, i2);
        int P1 = measureScope.P1((placeable == null || placeable2 == null) ? TabKt.f8643a : TabKt.f8644b);
        final Integer valueOf = placeable != null ? Integer.valueOf(placeable.f0(AlignmentLineKt.a())) : null;
        if (placeable != null) {
            num = Integer.valueOf(placeable.f0(AlignmentLineKt.b()));
        }
        final Integer num2 = num;
        final Placeable placeable3 = placeable;
        final MeasureScope measureScope2 = measureScope;
        final int i5 = max;
        final int i6 = P1;
        return MeasureScope.R1(measureScope2, i5, i6, (Map) null, new Function1<Placeable.PlacementScope, Unit>() {
            public final void b(Placeable.PlacementScope placementScope) {
                Placeable placeable;
                Placeable placeable2 = placeable3;
                if (placeable2 != null && (placeable = placeable2) != null) {
                    MeasureScope measureScope = measureScope2;
                    int i2 = i5;
                    int i3 = i6;
                    Integer num = valueOf;
                    Intrinsics.f(num);
                    int intValue = num.intValue();
                    Integer num2 = num2;
                    Intrinsics.f(num2);
                    TabKt.o(placementScope, measureScope, placeable2, placeable, i2, i3, intValue, num2.intValue());
                } else if (placeable2 != null) {
                    TabKt.p(placementScope, placeable2, i6);
                } else {
                    Placeable placeable3 = placeable2;
                    if (placeable3 != null) {
                        TabKt.p(placementScope, placeable3, i6);
                    }
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((Placeable.PlacementScope) obj);
                return Unit.f40552a;
            }
        }, 4, (Object) null);
    }
}
