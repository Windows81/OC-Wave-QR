package androidx.compose.material3.internal;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;

@Metadata
public final class AccessibilityUtilKt {

    /* renamed from: a  reason: collision with root package name */
    public static final float f12102a;

    /* renamed from: b  reason: collision with root package name */
    public static final float f12103b;

    /* renamed from: c  reason: collision with root package name */
    public static final Modifier f12104c;

    /* renamed from: d  reason: collision with root package name */
    public static final Modifier f12105d;

    static {
        float f2 = (float) 10;
        float m2 = Dp.m(f2);
        f12102a = m2;
        float m3 = Dp.m(f2);
        f12103b = m3;
        Modifier.Companion companion = Modifier.f15489d;
        f12104c = PaddingKt.k(SemanticsModifierKt.c(LayoutModifierKt.a(companion, new C0135h()), true, new C0136i()), m2, 0.0f, 2, (Object) null);
        f12105d = PaddingKt.k(SemanticsModifierKt.c(LayoutModifierKt.a(companion, new C0137j()), true, new C0138k()), 0.0f, m3, 1, (Object) null);
    }

    public static final MeasureResult g(MeasureScope measureScope, Measurable measurable, Constraints constraints) {
        int P1 = measureScope.P1(f12102a);
        long r2 = constraints.r();
        int i2 = P1 * 2;
        Placeable c0 = measurable.c0(ConstraintsKt.i(r2, i2, 0));
        return MeasureScope.R1(measureScope, c0.L0() - i2, c0.C0(), (Map) null, new C0140m(c0, P1), 4, (Object) null);
    }

    public static final Unit h(Placeable placeable, int i2, Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope.j(placementScope, placeable, -i2, 0, 0.0f, 4, (Object) null);
        return Unit.f40552a;
    }

    public static final Unit i(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return Unit.f40552a;
    }

    public static final MeasureResult j(MeasureScope measureScope, Measurable measurable, Constraints constraints) {
        int P1 = measureScope.P1(f12103b);
        long r2 = constraints.r();
        int i2 = P1 * 2;
        Placeable c0 = measurable.c0(ConstraintsKt.i(r2, 0, i2));
        return MeasureScope.R1(measureScope, c0.L0(), c0.C0() - i2, (Map) null, new C0139l(c0, P1), 4, (Object) null);
    }

    public static final Unit k(Placeable placeable, int i2, Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope.j(placementScope, placeable, 0, -i2, 0.0f, 4, (Object) null);
        return Unit.f40552a;
    }

    public static final Unit l(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return Unit.f40552a;
    }

    public static final Modifier m() {
        return f12105d;
    }
}
