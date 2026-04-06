package androidx.compose.material3;

import androidx.compose.material3.ListItemType;
import androidx.compose.material3.internal.LayoutUtilKt;
import androidx.compose.material3.internal.ProvideContentColorTextStyleKt;
import androidx.compose.material3.tokens.ListTokens;
import androidx.compose.material3.tokens.TypographyKeyTokens;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.MultiContentMeasurePolicyKt;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

@Metadata
public final class ListItemKt {

    /* renamed from: a  reason: collision with root package name */
    public static final float f10231a = Dp.m((float) 8);

    /* renamed from: b  reason: collision with root package name */
    public static final float f10232b = Dp.m((float) 12);

    /* renamed from: c  reason: collision with root package name */
    public static final float f10233c;

    /* renamed from: d  reason: collision with root package name */
    public static final float f10234d;

    /* renamed from: e  reason: collision with root package name */
    public static final float f10235e;

    /* renamed from: f  reason: collision with root package name */
    public static final float f10236f;

    static {
        float f2 = (float) 16;
        f10233c = Dp.m(f2);
        f10234d = Dp.m(f2);
        f10235e = Dp.m(f2);
        f10236f = Dp.m(f2);
    }

    public static final void d(Function2 function2, Function2 function22, Function2 function23, Function2 function24, Function2 function25, Composer composer, int i2) {
        int i3;
        Function2 function26 = function2;
        Function2 function27 = function22;
        Function2 function28 = function23;
        Function2 function29 = function24;
        Function2 function210 = function25;
        int i4 = i2;
        Composer q2 = composer.q(-61277522);
        if ((i4 & 6) == 0) {
            i3 = (q2.l(function26) ? 4 : 2) | i4;
        } else {
            i3 = i4;
        }
        if ((i4 & 48) == 0) {
            i3 |= q2.l(function27) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i3 |= q2.l(function28) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i3 |= q2.l(function29) ? 2048 : 1024;
        }
        if ((i4 & 24576) == 0) {
            i3 |= q2.l(function210) ? 16384 : 8192;
        }
        if (q2.E((i3 & 9363) != 9362, i3 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-61277522, i3, -1, "androidx.compose.material3.ListItemLayout (ListItem.kt:181)");
            }
            Object g2 = q2.g();
            Composer.Companion companion = Composer.f14567a;
            if (g2 == companion.a()) {
                g2 = new ListItemMeasurePolicy();
                q2.N(g2);
            }
            ListItemMeasurePolicy listItemMeasurePolicy = (ListItemMeasurePolicy) g2;
            List p2 = CollectionsKt.p(function28, function29 == null ? ComposableSingletons$ListItemKt.f9547a.a() : function29, function210 == null ? ComposableSingletons$ListItemKt.f9547a.d() : function210, function26 == null ? ComposableSingletons$ListItemKt.f9547a.b() : function26, function27 == null ? ComposableSingletons$ListItemKt.f9547a.c() : function27);
            Modifier.Companion companion2 = Modifier.f15489d;
            Function2 b2 = LayoutKt.b(p2);
            Object g3 = q2.g();
            if (g3 == companion.a()) {
                g3 = MultiContentMeasurePolicyKt.a(listItemMeasurePolicy);
                q2.N(g3);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) g3;
            int a2 = ComposablesKt.a(q2, 0);
            CompositionLocalMap I = q2.I();
            Modifier e2 = ComposedModifierKt.e(q2, companion2);
            ComposeUiNode.Companion companion3 = ComposeUiNode.f17222h;
            Function0 a3 = companion3.a();
            if (q2.v() == null) {
                ComposablesKt.d();
            }
            q2.s();
            if (q2.n()) {
                q2.y(a3);
            } else {
                q2.K();
            }
            Composer b3 = Updater.b(q2);
            Updater.g(b3, measurePolicy, companion3.c());
            Updater.g(b3, I, companion3.e());
            Function2 b4 = companion3.b();
            if (b3.n() || !Intrinsics.d(b3.g(), Integer.valueOf(a2))) {
                b3.N(Integer.valueOf(a2));
                b3.A(Integer.valueOf(a2), b4);
            }
            Updater.g(b3, e2, companion3.d());
            b2.m(q2, 0);
            q2.T();
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
        }
        ScopeUpdateScope x2 = q2.x();
        if (x2 != null) {
            x2.a(new C0157j3(function2, function22, function23, function24, function25, i2));
        }
    }

    public static final Unit e(Function2 function2, Function2 function22, Function2 function23, Function2 function24, Function2 function25, int i2, Composer composer, int i3) {
        d(function2, function22, function23, function24, function25, composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }

    public static final void f(long j2, TypographyKeyTokens typographyKeyTokens, Function2 function2, Composer composer, int i2) {
        int i3;
        Composer q2 = composer.q(-285397024);
        if ((i2 & 6) == 0) {
            i3 = (q2.j(j2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= q2.i(typographyKeyTokens.ordinal()) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= q2.l(function2) ? 256 : 128;
        }
        if (q2.E((i3 & 147) != 146, i3 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-285397024, i3, -1, "androidx.compose.material3.ProvideTextStyleFromToken (ListItem.kt:703)");
            }
            ProvideContentColorTextStyleKt.b(j2, TypographyKt.e(typographyKeyTokens, q2, (i3 >> 3) & 14), function2, q2, i3 & 910);
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
        }
        ScopeUpdateScope x2 = q2.x();
        if (x2 != null) {
            x2.a(new C0166k3(j2, typographyKeyTokens, function2, i2));
        }
    }

    public static final Unit g(long j2, TypographyKeyTokens typographyKeyTokens, Function2 function2, int i2, Composer composer, int i3) {
        f(j2, typographyKeyTokens, function2, composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }

    public static final int o(IntrinsicMeasureScope intrinsicMeasureScope, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j2) {
        ListItemType.Companion companion = ListItemType.f10250A;
        return RangesKt.j(Math.max(Math.max(Constraints.m(j2), intrinsicMeasureScope.P1(ListItemType.n(i7, companion.a()) ? ListTokens.f13495a.l() : ListItemType.n(i7, companion.c()) ? ListTokens.f13495a.s() : ListTokens.f13495a.o())), i8 + Math.max(i2, Math.max(i4 + i5 + i6, i3))), Constraints.k(j2));
    }

    public static final int p(IntrinsicMeasureScope intrinsicMeasureScope, int i2, int i3, int i4, int i5, int i6, int i7, long j2) {
        if (Constraints.h(j2)) {
            return Constraints.l(j2);
        }
        return i7 + i2 + Math.max(i4, Math.max(i5, i6)) + i3;
    }

    public static final float q() {
        return f10235e;
    }

    public static final float r() {
        return f10234d;
    }

    public static final float s() {
        return f10233c;
    }

    public static final float t() {
        return f10236f;
    }

    public static final boolean u(Density density, int i2) {
        return i2 > density.K1(TextUnitKt.i(30));
    }

    public static final MeasureResult v(MeasureScope measureScope, int i2, int i3, Placeable placeable, Placeable placeable2, Placeable placeable3, Placeable placeable4, Placeable placeable5, boolean z2, int i4, int i5, int i6) {
        return MeasureScope.R1(measureScope, i2, i3, (Map) null, new C0123i3(placeable, i4, z2, i6, placeable3, placeable4, placeable5, i3, placeable2, i2, i5), 4, (Object) null);
    }

    public static final Unit w(Placeable placeable, int i2, boolean z2, int i3, Placeable placeable2, Placeable placeable3, Placeable placeable4, int i4, Placeable placeable5, int i5, int i6, Placeable.PlacementScope placementScope) {
        int i7 = i4;
        if (placeable != null) {
            Placeable.PlacementScope.n(placementScope, placeable, i2, z2 ? i3 : Alignment.f15444a.i().a(placeable.C0(), i7), 0.0f, 4, (Object) null);
        }
        int c2 = LayoutUtilKt.c(placeable) + i2;
        int a2 = z2 ? i3 : Alignment.f15444a.i().a(LayoutUtilKt.a(placeable2) + LayoutUtilKt.a(placeable3) + LayoutUtilKt.a(placeable4), i7);
        if (placeable3 != null) {
            Placeable.PlacementScope.n(placementScope, placeable3, c2, a2, 0.0f, 4, (Object) null);
        }
        int a3 = a2 + LayoutUtilKt.a(placeable3);
        if (placeable2 != null) {
            Placeable.PlacementScope.n(placementScope, placeable2, c2, a3, 0.0f, 4, (Object) null);
        }
        int a4 = a3 + LayoutUtilKt.a(placeable2);
        if (placeable4 != null) {
            Placeable.PlacementScope.n(placementScope, placeable4, c2, a4, 0.0f, 4, (Object) null);
        }
        if (placeable5 != null) {
            Placeable.PlacementScope.n(placementScope, placeable5, (i5 - i6) - placeable5.L0(), z2 ? i3 : Alignment.f15444a.i().a(placeable5.C0(), i7), 0.0f, 4, (Object) null);
        }
        return Unit.f40552a;
    }

    public static final float x(int i2) {
        return ListItemType.n(i2, ListItemType.f10250A.b()) ? f10232b : f10231a;
    }
}
