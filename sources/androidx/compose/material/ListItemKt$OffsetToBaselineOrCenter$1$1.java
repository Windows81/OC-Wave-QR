package androidx.compose.material;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

@Metadata
public final class ListItemKt$OffsetToBaselineOrCenter$1$1 implements MeasurePolicy {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ float f7923a;

    public ListItemKt$OffsetToBaselineOrCenter$1$1(float f2) {
        this.f7923a = f2;
    }

    public final MeasureResult b(MeasureScope measureScope, List list, long j2) {
        int max;
        final int l2;
        final Placeable c0 = ((Measurable) list.get(0)).c0(Constraints.d(j2, 0, 0, 0, 0, 11, (Object) null));
        int f0 = c0.f0(AlignmentLineKt.a());
        if (f0 != Integer.MIN_VALUE) {
            l2 = measureScope.P1(this.f7923a) - f0;
            max = Math.max(Constraints.m(j2), c0.C0() + l2);
        } else {
            max = Math.max(Constraints.m(j2), c0.C0());
            l2 = IntOffset.l(Alignment.f15444a.e().a(IntSize.f19170b.a(), IntSizeKt.a(0, max - c0.C0()), measureScope.getLayoutDirection()));
        }
        return MeasureScope.R1(measureScope, c0.L0(), max, (Map) null, new Function1<Placeable.PlacementScope, Unit>() {
            public final void b(Placeable.PlacementScope placementScope) {
                Placeable.PlacementScope.n(placementScope, c0, 0, l2, 0.0f, 4, (Object) null);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((Placeable.PlacementScope) obj);
                return Unit.f40552a;
            }
        }, 4, (Object) null);
    }
}
