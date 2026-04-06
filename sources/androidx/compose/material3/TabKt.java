package androidx.compose.material3;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material3.tokens.PrimaryNavigationTabTokens;
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
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class TabKt {

    /* renamed from: a  reason: collision with root package name */
    public static final float f11271a = PrimaryNavigationTabTokens.f13859a.d();

    /* renamed from: b  reason: collision with root package name */
    public static final float f11272b = Dp.m((float) 72);

    /* renamed from: c  reason: collision with root package name */
    public static final float f11273c = Dp.m((float) 16);

    /* renamed from: d  reason: collision with root package name */
    public static final float f11274d = Dp.m((float) 14);

    /* renamed from: e  reason: collision with root package name */
    public static final float f11275e = Dp.m((float) 6);

    /* renamed from: f  reason: collision with root package name */
    public static final long f11276f = TextUnitKt.i(20);

    /* renamed from: g  reason: collision with root package name */
    public static final float f11277g = Dp.m((float) 8);

    public static final void b(Function2 function2, Function2 function22, Composer composer, int i2) {
        int i3;
        boolean z2 = true;
        Composer q2 = composer.q(-1349901398);
        if ((i2 & 6) == 0) {
            i3 = (q2.l(function2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= q2.l(function22) ? 32 : 16;
        }
        if (q2.E((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-1349901398, i3, -1, "androidx.compose.material3.TabBaselineLayout (Tab.kt:300)");
            }
            int i4 = i3 & 14;
            boolean z3 = i4 == 4;
            if ((i3 & 112) != 32) {
                z2 = false;
            }
            boolean z4 = z2 | z3;
            Object g2 = q2.g();
            if (z4 || g2 == Composer.f14567a.a()) {
                g2 = new TabKt$TabBaselineLayout$2$1(function2, function22);
                q2.N(g2);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) g2;
            Modifier.Companion companion = Modifier.f15489d;
            int a2 = ComposablesKt.a(q2, 0);
            CompositionLocalMap I = q2.I();
            Modifier e2 = ComposedModifierKt.e(q2, companion);
            ComposeUiNode.Companion companion2 = ComposeUiNode.f17222h;
            Function0 a3 = companion2.a();
            if (q2.v() == null) {
                ComposablesKt.d();
            }
            q2.s();
            if (q2.n()) {
                q2.y(a3);
            } else {
                q2.K();
            }
            Composer b2 = Updater.b(q2);
            Updater.g(b2, measurePolicy, companion2.c());
            Updater.g(b2, I, companion2.e());
            Function2 b3 = companion2.b();
            if (b2.n() || !Intrinsics.d(b2.g(), Integer.valueOf(a2))) {
                b2.N(Integer.valueOf(a2));
                b2.A(Integer.valueOf(a2), b3);
            }
            Updater.g(b2, e2, companion2.d());
            if (function2 != null) {
                q2.X(870361332);
                Modifier k2 = PaddingKt.k(LayoutIdKt.b(companion, "text"), f11273c, 0.0f, 2, (Object) null);
                MeasurePolicy g3 = BoxKt.g(Alignment.f15444a.o(), false);
                int a4 = ComposablesKt.a(q2, 0);
                CompositionLocalMap I2 = q2.I();
                Modifier e3 = ComposedModifierKt.e(q2, k2);
                Function0 a5 = companion2.a();
                if (q2.v() == null) {
                    ComposablesKt.d();
                }
                q2.s();
                if (q2.n()) {
                    q2.y(a5);
                } else {
                    q2.K();
                }
                Composer b4 = Updater.b(q2);
                Updater.g(b4, g3, companion2.c());
                Updater.g(b4, I2, companion2.e());
                Function2 b5 = companion2.b();
                if (b4.n() || !Intrinsics.d(b4.g(), Integer.valueOf(a4))) {
                    b4.N(Integer.valueOf(a4));
                    b4.A(Integer.valueOf(a4), b5);
                }
                Updater.g(b4, e3, companion2.d());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.f3797a;
                function2.m(q2, Integer.valueOf(i4));
                q2.T();
                q2.M();
            } else {
                q2.X(870466081);
                q2.M();
            }
            if (function22 != null) {
                q2.X(870494880);
                Modifier b6 = LayoutIdKt.b(companion, "icon");
                MeasurePolicy g4 = BoxKt.g(Alignment.f15444a.o(), false);
                int a6 = ComposablesKt.a(q2, 0);
                CompositionLocalMap I3 = q2.I();
                Modifier e4 = ComposedModifierKt.e(q2, b6);
                Function0 a7 = companion2.a();
                if (q2.v() == null) {
                    ComposablesKt.d();
                }
                q2.s();
                if (q2.n()) {
                    q2.y(a7);
                } else {
                    q2.K();
                }
                Composer b7 = Updater.b(q2);
                Updater.g(b7, g4, companion2.c());
                Updater.g(b7, I3, companion2.e());
                Function2 b8 = companion2.b();
                if (b7.n() || !Intrinsics.d(b7.g(), Integer.valueOf(a6))) {
                    b7.N(Integer.valueOf(a6));
                    b7.A(Integer.valueOf(a6), b8);
                }
                Updater.g(b7, e4, companion2.d());
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.f3797a;
                function22.m(q2, Integer.valueOf((i3 >> 3) & 14));
                q2.T();
                q2.M();
            } else {
                q2.X(870557345);
                q2.M();
            }
            q2.T();
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
        }
        ScopeUpdateScope x2 = q2.x();
        if (x2 != null) {
            x2.a(new P6(function2, function22, i2));
        }
    }

    public static final Unit c(Function2 function2, Function2 function22, int i2, Composer composer, int i3) {
        b(function2, function22, composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }

    public static final float k() {
        return f11273c;
    }

    public static final void l(Placeable.PlacementScope placementScope, Density density, Placeable placeable, Placeable placeable2, int i2, int i3, int i4, int i5) {
        Density density2 = density;
        int i6 = i4;
        int i7 = i5;
        int P1 = density.P1(i6 == i7 ? f11274d : f11275e) + density.P1(PrimaryNavigationTabTokens.f13859a.b());
        int C0 = (placeable2.C0() + density.K1(f11276f)) - i6;
        int i8 = (i3 - i7) - P1;
        Placeable.PlacementScope placementScope2 = placementScope;
        Placeable.PlacementScope.n(placementScope2, placeable, (i2 - placeable.L0()) / 2, i8, 0.0f, 4, (Object) null);
        Placeable.PlacementScope.n(placementScope2, placeable2, (i2 - placeable2.L0()) / 2, i8 - C0, 0.0f, 4, (Object) null);
    }

    public static final void m(Placeable.PlacementScope placementScope, Placeable placeable, int i2) {
        Placeable.PlacementScope.n(placementScope, placeable, 0, (i2 - placeable.C0()) / 2, 0.0f, 4, (Object) null);
    }
}
