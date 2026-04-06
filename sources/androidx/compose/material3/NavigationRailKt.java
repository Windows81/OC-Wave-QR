package androidx.compose.material3;

import androidx.compose.material3.tokens.NavigationRailBaselineItemTokens;
import androidx.compose.material3.tokens.NavigationRailCollapsedTokens;
import androidx.compose.material3.tokens.NavigationRailVerticalItemTokens;
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
public final class NavigationRailKt {

    /* renamed from: a  reason: collision with root package name */
    public static final float f10486a;

    /* renamed from: b  reason: collision with root package name */
    public static final float f10487b = Dp.m((float) 8);

    /* renamed from: c  reason: collision with root package name */
    public static final float f10488c = NavigationRailCollapsedTokens.f13630a.c();

    /* renamed from: d  reason: collision with root package name */
    public static final float f10489d;

    /* renamed from: e  reason: collision with root package name */
    public static final float f10490e;

    /* renamed from: f  reason: collision with root package name */
    public static final float f10491f;

    /* renamed from: g  reason: collision with root package name */
    public static final float f10492g;

    /* renamed from: h  reason: collision with root package name */
    public static final float f10493h;

    /* renamed from: i  reason: collision with root package name */
    public static final ProvidableCompositionLocal f10494i = CompositionLocalKt.h((SnapshotMutationPolicy) null, new D4(), 1, (Object) null);

    static {
        float f2 = (float) 4;
        f10486a = Dp.m(f2);
        NavigationRailVerticalItemTokens navigationRailVerticalItemTokens = NavigationRailVerticalItemTokens.f13666a;
        f10489d = navigationRailVerticalItemTokens.b();
        f10490e = Dp.m(f2);
        float b2 = navigationRailVerticalItemTokens.b();
        NavigationRailBaselineItemTokens navigationRailBaselineItemTokens = NavigationRailBaselineItemTokens.f13620a;
        float f3 = (float) 2;
        f10491f = Dp.m(Dp.m(b2 - navigationRailBaselineItemTokens.c()) / f3);
        f10492g = Dp.m(Dp.m(navigationRailVerticalItemTokens.a() - navigationRailBaselineItemTokens.c()) / f3);
        f10493h = Dp.m(Dp.m(navigationRailVerticalItemTokens.b() - navigationRailBaselineItemTokens.c()) / f3);
    }

    public static final NavigationRailOverride d() {
        return DefaultNavigationRailOverride.f9840a;
    }

    public static final float k() {
        return f10486a;
    }

    public static final MeasureResult l(MeasureScope measureScope, Placeable placeable, Placeable placeable2, Placeable placeable3, long j2) {
        long j3 = j2;
        int g2 = ConstraintsKt.g(j3, Math.max(placeable.L0(), Math.max(placeable2.L0(), placeable3 != null ? placeable3.L0() : 0)));
        MeasureScope measureScope2 = measureScope;
        int f2 = ConstraintsKt.f(j3, measureScope.P1(f10489d));
        return MeasureScope.R1(measureScope, g2, f2, (Map) null, new E4(placeable3, placeable, (g2 - placeable.L0()) / 2, (f2 - placeable.C0()) / 2, placeable2, (g2 - placeable2.L0()) / 2, (f2 - placeable2.C0()) / 2, g2, f2), 4, (Object) null);
    }

    public static final Unit m(Placeable placeable, Placeable placeable2, int i2, int i3, Placeable placeable3, int i4, int i5, int i6, int i7, Placeable.PlacementScope placementScope) {
        if (placeable != null) {
            Placeable.PlacementScope.n(placementScope, placeable, (i6 - placeable.L0()) / 2, (i7 - placeable.C0()) / 2, 0.0f, 4, (Object) null);
        }
        Placeable.PlacementScope.n(placementScope, placeable2, i2, i3, 0.0f, 4, (Object) null);
        Placeable.PlacementScope.n(placementScope, placeable3, i4, i5, 0.0f, 4, (Object) null);
        return Unit.f40552a;
    }

    public static final MeasureResult n(MeasureScope measureScope, Placeable placeable, Placeable placeable2, Placeable placeable3, Placeable placeable4, long j2, boolean z2, float f2) {
        MeasureScope measureScope2 = measureScope;
        float f3 = f10492g;
        float C0 = ((float) placeable2.C0()) + measureScope2.B1(f3);
        float f4 = f10490e;
        float B1 = C0 + measureScope2.B1(f4) + ((float) placeable.C0());
        float f5 = (float) 2;
        float d2 = RangesKt.d((((float) Constraints.m(j2)) - B1) / f5, measureScope2.B1(f3));
        float f6 = B1 + (d2 * f5);
        float C02 = ((z2 ? d2 : (f6 - ((float) placeable2.C0())) / f5) - d2) * (((float) 1) - f2);
        float C03 = ((float) placeable2.C0()) + d2 + measureScope2.B1(f3) + measureScope2.B1(f4);
        int g2 = ConstraintsKt.g(j2, Math.max(placeable2.L0(), Math.max(placeable.L0(), placeable4 != null ? placeable4.L0() : 0)));
        return MeasureScope.R1(measureScope, g2, MathKt.d(f6), (Map) null, new C4(placeable4, z2, f2, placeable, (g2 - placeable.L0()) / 2, C03, C02, placeable2, (g2 - placeable2.L0()) / 2, d2, placeable3, (g2 - placeable3.L0()) / 2, d2 - measureScope2.B1(f3), g2, measureScope), 4, (Object) null);
    }

    public static final Unit o(Placeable placeable, boolean z2, float f2, Placeable placeable2, int i2, float f3, float f4, Placeable placeable3, int i3, float f5, Placeable placeable4, int i4, float f6, int i5, MeasureScope measureScope, Placeable.PlacementScope placementScope) {
        if (placeable != null) {
            Placeable.PlacementScope placementScope2 = placementScope;
            Placeable placeable5 = placeable;
            Placeable.PlacementScope.n(placementScope2, placeable5, (i5 - placeable.L0()) / 2, MathKt.d((f5 - measureScope.B1(f10492g)) + f4), 0.0f, 4, (Object) null);
        }
        if (z2 || f2 != 0.0f) {
            Placeable.PlacementScope.n(placementScope, placeable2, i2, MathKt.d(f3 + f4), 0.0f, 4, (Object) null);
        }
        Placeable.PlacementScope.n(placementScope, placeable3, i3, MathKt.d(f5 + f4), 0.0f, 4, (Object) null);
        Placeable.PlacementScope.n(placementScope, placeable4, i4, MathKt.d(f6 + f4), 0.0f, 4, (Object) null);
        return Unit.f40552a;
    }
}
