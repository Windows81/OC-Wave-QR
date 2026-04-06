package androidx.compose.material3;

import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class NavigationBarKt$NavigationBarItem$styledIcon$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ boolean f10414A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ boolean f10415B;
    public final /* synthetic */ FiniteAnimationSpec C;
    public final /* synthetic */ Function2 D;
    public final /* synthetic */ boolean E;
    public final /* synthetic */ Function2 F;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ NavigationBarItemColors f10416z;

    public static final long e(State state) {
        return ((Color) state.getValue()).v();
    }

    public static final Unit f(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return Unit.f40552a;
    }

    public final void c(Composer composer, int i2) {
        Modifier modifier;
        if (composer.E((i2 & 3) != 2, 1 & i2)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-876637252, i2, -1, "androidx.compose.material3.NavigationBarItem.<anonymous> (NavigationBar.kt:212)");
            }
            State a2 = SingleValueAnimationKt.a(this.f10416z.b(this.f10414A, this.f10415B), this.C, (String) null, (Function1) null, composer, 0, 12);
            if (this.D == null || (!this.E && !this.f10414A)) {
                composer.X(-634793532);
                composer.M();
                modifier = Modifier.f15489d;
            } else {
                composer.X(-634794445);
                Modifier.Companion companion = Modifier.f15489d;
                Object g2 = composer.g();
                if (g2 == Composer.f14567a.a()) {
                    g2 = new C0115h4();
                    composer.N(g2);
                }
                modifier = SemanticsModifierKt.a(companion, (Function1) g2);
                composer.M();
            }
            Function2 function2 = this.F;
            MeasurePolicy g3 = BoxKt.g(Alignment.f15444a.o(), false);
            int a3 = ComposablesKt.a(composer, 0);
            CompositionLocalMap I = composer.I();
            Modifier e2 = ComposedModifierKt.e(composer, modifier);
            ComposeUiNode.Companion companion2 = ComposeUiNode.f17222h;
            Function0 a4 = companion2.a();
            if (composer.v() == null) {
                ComposablesKt.d();
            }
            composer.s();
            if (composer.n()) {
                composer.y(a4);
            } else {
                composer.K();
            }
            Composer b2 = Updater.b(composer);
            Updater.g(b2, g3, companion2.c());
            Updater.g(b2, I, companion2.e());
            Function2 b3 = companion2.b();
            if (b2.n() || !Intrinsics.d(b2.g(), Integer.valueOf(a3))) {
                b2.N(Integer.valueOf(a3));
                b2.A(Integer.valueOf(a3), b3);
            }
            Updater.g(b2, e2, companion2.d());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f3797a;
            CompositionLocalKt.c(ContentColorKt.a().d(Color.h(e(a2))), function2, composer, ProvidedValue.f14769i);
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
