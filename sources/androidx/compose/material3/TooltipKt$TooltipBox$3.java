package androidx.compose.material3;

import androidx.compose.animation.core.Transition;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
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
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class TooltipKt$TooltipBox$3 implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function3 f11609A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ TooltipScopeImpl f11610B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Transition f11611z;

    public TooltipKt$TooltipBox$3(Transition transition, Function3 function3, TooltipScopeImpl tooltipScopeImpl) {
        this.f11611z = transition;
        this.f11609A = function3;
        this.f11610B = tooltipScopeImpl;
    }

    public final void b(Composer composer, int i2) {
        if (composer.E((i2 & 3) != 2, 1 & i2)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-527401546, i2, -1, "androidx.compose.material3.TooltipBox.<anonymous> (Tooltip.kt:321)");
            }
            Modifier m2 = TooltipKt.m(Modifier.f15489d, this.f11611z);
            Function3 function3 = this.f11609A;
            TooltipScopeImpl tooltipScopeImpl = this.f11610B;
            MeasurePolicy g2 = BoxKt.g(Alignment.f15444a.o(), false);
            int a2 = ComposablesKt.a(composer, 0);
            CompositionLocalMap I = composer.I();
            Modifier e2 = ComposedModifierKt.e(composer, m2);
            ComposeUiNode.Companion companion = ComposeUiNode.f17222h;
            Function0 a3 = companion.a();
            if (composer.v() == null) {
                ComposablesKt.d();
            }
            composer.s();
            if (composer.n()) {
                composer.y(a3);
            } else {
                composer.K();
            }
            Composer b2 = Updater.b(composer);
            Updater.g(b2, g2, companion.c());
            Updater.g(b2, I, companion.e());
            Function2 b3 = companion.b();
            if (b2.n() || !Intrinsics.d(b2.g(), Integer.valueOf(a2))) {
                b2.N(Integer.valueOf(a2));
                b2.A(Integer.valueOf(a2), b3);
            }
            Updater.g(b2, e2, companion.d());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f3797a;
            function3.d(tooltipScopeImpl, composer, 6);
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
