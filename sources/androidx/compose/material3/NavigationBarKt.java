package androidx.compose.material3;

import androidx.compose.material3.tokens.NavigationBarTokens;
import androidx.compose.material3.tokens.NavigationBarVerticalItemTokens;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;

@Metadata
public final class NavigationBarKt {

    /* renamed from: a  reason: collision with root package name */
    public static final float f10403a = NavigationBarTokens.f13572a.e();

    /* renamed from: b  reason: collision with root package name */
    public static final float f10404b = Dp.m((float) 8);

    /* renamed from: c  reason: collision with root package name */
    public static final float f10405c = Dp.m((float) 4);

    /* renamed from: d  reason: collision with root package name */
    public static final float f10406d;

    /* renamed from: e  reason: collision with root package name */
    public static final float f10407e;

    /* renamed from: f  reason: collision with root package name */
    public static final float f10408f = Dp.m((float) 12);

    /* renamed from: g  reason: collision with root package name */
    public static final float f10409g = Dp.m((float) 44);

    /* renamed from: h  reason: collision with root package name */
    public static final ProvidableCompositionLocal f10410h = CompositionLocalKt.h((SnapshotMutationPolicy) null, new C0077d4(), 1, (Object) null);

    static {
        NavigationBarVerticalItemTokens navigationBarVerticalItemTokens = NavigationBarVerticalItemTokens.f13587a;
        float f2 = (float) 2;
        f10406d = Dp.m(Dp.m(navigationBarVerticalItemTokens.b() - navigationBarVerticalItemTokens.d()) / f2);
        f10407e = Dp.m(Dp.m(navigationBarVerticalItemTokens.a() - navigationBarVerticalItemTokens.d()) / f2);
    }

    public static final NavigationBarOverride d() {
        return DefaultNavigationBarOverride.f9838a;
    }

    public static final float i() {
        return f10407e;
    }

    public static final float j() {
        return f10404b;
    }

    public static final MeasureResult k(MeasureScope measureScope, Placeable placeable, Placeable placeable2, Placeable placeable3, long j2) {
        MeasureScope measureScope2 = measureScope;
        int L0 = Constraints.l(j2) == Integer.MAX_VALUE ? placeable.L0() + (measureScope.P1(f10409g) * 2) : Constraints.l(j2);
        int f2 = ConstraintsKt.f(j2, measureScope.P1(f10403a));
        return MeasureScope.R1(measureScope, L0, f2, (Map) null, new C0097f4(placeable3, placeable, (L0 - placeable.L0()) / 2, (f2 - placeable.C0()) / 2, placeable2, (L0 - placeable2.L0()) / 2, (f2 - placeable2.C0()) / 2, L0, f2), 4, (Object) null);
    }

    public static final Unit l(Placeable placeable, Placeable placeable2, int i2, int i3, Placeable placeable3, int i4, int i5, int i6, int i7, Placeable.PlacementScope placementScope) {
        if (placeable != null) {
            Placeable.PlacementScope.n(placementScope, placeable, (i6 - placeable.L0()) / 2, (i7 - placeable.C0()) / 2, 0.0f, 4, (Object) null);
        }
        Placeable.PlacementScope.n(placementScope, placeable2, i2, i3, 0.0f, 4, (Object) null);
        Placeable.PlacementScope.n(placementScope, placeable3, i4, i5, 0.0f, 4, (Object) null);
        return Unit.f40552a;
    }

    public static final MeasureResult m(MeasureScope measureScope, Placeable placeable, Placeable placeable2, Placeable placeable3, Placeable placeable4, long j2, boolean z2, float f2) {
        MeasureScope measureScope2 = measureScope;
        float f3 = f10407e;
        float C0 = ((float) placeable2.C0()) + measureScope2.B1(f3);
        float f4 = f10405c;
        float B1 = C0 + measureScope2.B1(f4) + ((float) placeable.C0());
        float f5 = (float) 2;
        float d2 = RangesKt.d((((float) Constraints.m(j2)) - B1) / f5, measureScope2.B1(f3));
        float f6 = B1 + (d2 * f5);
        float C02 = ((z2 ? d2 : (f6 - ((float) placeable2.C0())) / f5) - d2) * (((float) 1) - f2);
        float C03 = ((float) placeable2.C0()) + d2 + measureScope2.B1(f3) + measureScope2.B1(f4);
        int L0 = Constraints.l(j2) == Integer.MAX_VALUE ? placeable2.L0() + (measureScope2.P1(f10409g) * 2) : Constraints.l(j2);
        return MeasureScope.R1(measureScope, L0, MathKt.d(f6), (Map) null, new C0087e4(placeable4, z2, f2, placeable, (L0 - placeable.L0()) / 2, C03, C02, placeable2, (L0 - placeable2.L0()) / 2, d2, placeable3, (L0 - placeable3.L0()) / 2, d2 - measureScope2.B1(f3), L0, measureScope), 4, (Object) null);
    }

    public static final Unit n(Placeable placeable, boolean z2, float f2, Placeable placeable2, int i2, float f3, float f4, Placeable placeable3, int i3, float f5, Placeable placeable4, int i4, float f6, int i5, MeasureScope measureScope, Placeable.PlacementScope placementScope) {
        if (placeable != null) {
            Placeable.PlacementScope placementScope2 = placementScope;
            Placeable placeable5 = placeable;
            Placeable.PlacementScope.n(placementScope2, placeable5, (i5 - placeable.L0()) / 2, MathKt.d((f5 - ((float) measureScope.P1(f10407e))) + f4), 0.0f, 4, (Object) null);
        }
        if (z2 || f2 != 0.0f) {
            Placeable.PlacementScope.n(placementScope, placeable2, i2, MathKt.d(f3 + f4), 0.0f, 4, (Object) null);
        }
        Placeable.PlacementScope.n(placementScope, placeable3, i3, MathKt.d(f5 + f4), 0.0f, 4, (Object) null);
        Placeable.PlacementScope.n(placementScope, placeable4, i4, MathKt.d(f6 + f4), 0.0f, 4, (Object) null);
        return Unit.f40552a;
    }
}
