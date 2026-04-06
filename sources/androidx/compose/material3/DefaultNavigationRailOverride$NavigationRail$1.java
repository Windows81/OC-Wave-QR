package androidx.compose.material3;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.foundation.selection.SelectableGroupKt;
import androidx.compose.material3.tokens.NavigationRailCollapsedTokens;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class DefaultNavigationRailOverride$NavigationRail$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ NavigationRailOverrideScope f9841z;

    /* access modifiers changed from: private */
    public static final Unit e(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.H0(semanticsPropertyReceiver, true);
        return Unit.f40552a;
    }

    public final void c(Composer composer, int i2) {
        if (composer.E((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-1027527987, i2, -1, "androidx.compose.material3.DefaultNavigationRailOverride.NavigationRail.<anonymous> (NavigationRail.kt:149)");
            }
            Modifier.Companion companion = Modifier.f15489d;
            Modifier a2 = SelectableGroupKt.a(PaddingKt.k(SizeKt.A(WindowInsetsPaddingKt.e(SizeKt.d(companion, 0.0f, 1, (Object) null), this.f9841z.c()), NavigationRailCollapsedTokens.f13630a.c(), 0.0f, 2, (Object) null), 0.0f, NavigationRailKt.k(), 1, (Object) null));
            Object g2 = composer.g();
            if (g2 == Composer.f14567a.a()) {
                g2 = new C0095f2();
                composer.N(g2);
            }
            Modifier d2 = SemanticsModifierKt.d(a2, false, (Function1) g2, 1, (Object) null);
            Alignment.Horizontal g3 = Alignment.f15444a.g();
            Arrangement.HorizontalOrVertical n2 = Arrangement.f3739a.n(NavigationRailKt.k());
            NavigationRailOverrideScope navigationRailOverrideScope = this.f9841z;
            MeasurePolicy a3 = ColumnKt.a(n2, g3, composer, 54);
            int a4 = ComposablesKt.a(composer, 0);
            CompositionLocalMap I = composer.I();
            Modifier e2 = ComposedModifierKt.e(composer, d2);
            ComposeUiNode.Companion companion2 = ComposeUiNode.f17222h;
            Function0 a5 = companion2.a();
            if (composer.v() == null) {
                ComposablesKt.d();
            }
            composer.s();
            if (composer.n()) {
                composer.y(a5);
            } else {
                composer.K();
            }
            Composer b2 = Updater.b(composer);
            Updater.g(b2, a3, companion2.c());
            Updater.g(b2, I, companion2.e());
            Function2 b3 = companion2.b();
            if (b2.n() || !Intrinsics.d(b2.g(), Integer.valueOf(a4))) {
                b2.N(Integer.valueOf(a4));
                b2.A(Integer.valueOf(a4), b3);
            }
            Updater.g(b2, e2, companion2.d());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f3815a;
            Function3 b4 = navigationRailOverrideScope.b();
            if (b4 != null) {
                composer.X(-548298554);
                b4.d(columnScopeInstance, composer, 6);
                SpacerKt.a(SizeKt.i(companion, NavigationRailKt.f10487b), composer, 6);
                composer.M();
            } else {
                composer.X(-548182273);
                composer.M();
            }
            navigationRailOverrideScope.a().d(columnScopeInstance, composer, 6);
            composer.T();
            if (ComposerKt.P()) {
                ComposerKt.X();
                return;
            }
            return;
        }
        composer.B();
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        c((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
