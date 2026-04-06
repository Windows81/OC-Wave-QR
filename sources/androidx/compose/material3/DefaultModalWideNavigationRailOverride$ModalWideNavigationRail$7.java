package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class DefaultModalWideNavigationRailOverride$ModalWideNavigationRail$7 implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ ModalWideNavigationRailState f9834A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function1 f9835B;
    public final /* synthetic */ Animatable C;
    public final /* synthetic */ RailPredictiveBackState D;
    public final /* synthetic */ Function2 E;
    public final /* synthetic */ Function2 F;
    public final /* synthetic */ State G;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ModalWideNavigationRailOverrideScope f9836z;

    public final void b(Composer composer, int i2) {
        Composer composer2 = composer;
        int i3 = i2;
        if (composer2.E((i3 & 3) != 2, i3 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(1345045690, i3, -1, "androidx.compose.material3.DefaultModalWideNavigationRailOverride.ModalWideNavigationRail.<anonymous> (WideNavigationRail.kt:600)");
            }
            Modifier a2 = WindowInsetsPadding_androidKt.a(SizeKt.f(Modifier.f15489d, 0.0f, 1, (Object) null));
            ModalWideNavigationRailOverrideScope modalWideNavigationRailOverrideScope = this.f9836z;
            ModalWideNavigationRailState modalWideNavigationRailState = this.f9834A;
            Function1 function1 = this.f9835B;
            Animatable animatable = this.C;
            RailPredictiveBackState railPredictiveBackState = this.D;
            Function2 function2 = this.E;
            Function2 function22 = this.F;
            State state = this.G;
            MeasurePolicy g2 = BoxKt.g(Alignment.f15444a.o(), false);
            int a3 = ComposablesKt.a(composer2, 0);
            CompositionLocalMap I = composer.I();
            Modifier e2 = ComposedModifierKt.e(composer2, a2);
            ComposeUiNode.Companion companion = ComposeUiNode.f17222h;
            Function0 a4 = companion.a();
            if (composer.v() == null) {
                ComposablesKt.d();
            }
            composer.s();
            if (composer.n()) {
                composer2.y(a4);
            } else {
                composer.K();
            }
            Composer b2 = Updater.b(composer);
            Updater.g(b2, g2, companion.c());
            Updater.g(b2, I, companion.e());
            Function2 b3 = companion.b();
            if (b2.n() || !Intrinsics.d(b2.g(), Integer.valueOf(a3))) {
                b2.N(Integer.valueOf(a3));
                b2.A(Integer.valueOf(a3), b3);
            }
            Updater.g(b2, e2, companion.d());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f3797a;
            State state2 = state;
            WideNavigationRailKt.u(modalWideNavigationRailOverrideScope.b().e(), function1, modalWideNavigationRailOverrideScope.g() ? modalWideNavigationRailState.g() != WideNavigationRailValue.Collapsed : DefaultModalWideNavigationRailOverride.a(state), composer, 0);
            WideNavigationRailKt.o(modalWideNavigationRailOverrideScope.g() || DefaultModalWideNavigationRailOverride.a(state2), modalWideNavigationRailOverrideScope.g(), animatable, railPredictiveBackState, function2, modalWideNavigationRailOverrideScope.f(), modalWideNavigationRailState, modalWideNavigationRailOverrideScope.b(), modalWideNavigationRailOverrideScope.d(), WideNavigationRailKt.f11748g, ComposableLambdaKt.e(208840989, true, new DefaultModalWideNavigationRailOverride$ModalWideNavigationRail$7$1$1(modalWideNavigationRailOverrideScope), composer2, 54), modalWideNavigationRailOverrideScope.i(), modalWideNavigationRailOverrideScope.g(), modalWideNavigationRailOverrideScope.a(), function22, composer, (Animatable.f2421m << 6) | 805309440, 6);
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
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
