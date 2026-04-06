package androidx.compose.material3;

import androidx.compose.material3.tokens.TimePickerTokens;
import androidx.compose.ui.layout.LayoutModifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;

@Metadata
public final class ClockFaceSizeModifier implements LayoutModifier {
    public static final Unit b(Placeable placeable, Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope.j(placementScope, placeable, 0, 0, 0.0f, 4, (Object) null);
        return Unit.f40552a;
    }

    public MeasureResult f(MeasureScope measureScope, Measurable measurable, long j2) {
        float D = measureScope.D(Constraints.k(j2));
        int P1 = measureScope.P1(Dp.l(D, TimePickerKt.f11481n) >= 0 ? TimePickerTokens.f14264a.a() : Dp.l(D, TimePickerKt.f11482o) >= 0 ? TimePickerKt.f11483p : TimePickerKt.x0());
        Placeable c0 = measurable.c0(Constraints.f19137b.c(P1, P1));
        return MeasureScope.R1(measureScope, c0.L0(), c0.C0(), (Map) null, new C0253u0(c0), 4, (Object) null);
    }
}
