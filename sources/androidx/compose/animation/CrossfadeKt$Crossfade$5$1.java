package androidx.compose.animation;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class CrossfadeKt$Crossfade$5$1 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ FiniteAnimationSpec f2200A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Object f2201B;
    public final /* synthetic */ Function3 C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Transition f2202z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CrossfadeKt$Crossfade$5$1(Transition transition, FiniteAnimationSpec finiteAnimationSpec, Object obj, Function3 function3) {
        super(2);
        this.f2202z = transition;
        this.f2200A = finiteAnimationSpec;
        this.f2201B = obj;
        this.C = function3;
    }

    public static final float e(State state) {
        return ((Number) state.getValue()).floatValue();
    }

    public final void c(Composer composer, int i2) {
        if (composer.E((i2 & 3) != 2, 1 & i2)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-1426421288, i2, -1, "androidx.compose.animation.Crossfade.<anonymous>.<anonymous> (Crossfade.kt:125)");
            }
            Transition transition = this.f2202z;
            CrossfadeKt$Crossfade$5$1$alpha$2 crossfadeKt$Crossfade$5$1$alpha$2 = new CrossfadeKt$Crossfade$5$1$alpha$2(this.f2200A);
            Object obj = this.f2201B;
            TwoWayConverter i3 = VectorConvertersKt.i(FloatCompanionObject.f40896a);
            Object i4 = transition.i();
            composer.X(-438678252);
            if (ComposerKt.P()) {
                ComposerKt.Y(-438678252, 0, -1, "androidx.compose.animation.Crossfade.<anonymous>.<anonymous>.<anonymous> (Crossfade.kt:127)");
            }
            float f2 = 0.0f;
            float f3 = Intrinsics.d(i4, obj) ? 1.0f : 0.0f;
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
            composer.M();
            Float valueOf = Float.valueOf(f3);
            Object q2 = transition.q();
            composer.X(-438678252);
            if (ComposerKt.P()) {
                ComposerKt.Y(-438678252, 0, -1, "androidx.compose.animation.Crossfade.<anonymous>.<anonymous>.<anonymous> (Crossfade.kt:127)");
            }
            if (Intrinsics.d(q2, obj)) {
                f2 = 1.0f;
            }
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
            composer.M();
            State f4 = TransitionKt.f(transition, valueOf, Float.valueOf(f2), (FiniteAnimationSpec) crossfadeKt$Crossfade$5$1$alpha$2.d(transition.o(), composer, 0), i3, "FloatAnimation", composer, 0);
            Modifier.Companion companion = Modifier.f15489d;
            boolean W = composer.W(f4);
            Object g2 = composer.g();
            if (W || g2 == Composer.f14567a.a()) {
                g2 = new CrossfadeKt$Crossfade$5$1$1$1(f4);
                composer.N(g2);
            }
            Modifier a2 = GraphicsLayerModifierKt.a(companion, (Function1) g2);
            Function3 function3 = this.C;
            Object obj2 = this.f2201B;
            MeasurePolicy g3 = BoxKt.g(Alignment.f15444a.o(), false);
            int a3 = ComposablesKt.a(composer, 0);
            CompositionLocalMap I = composer.I();
            Modifier e2 = ComposedModifierKt.e(composer, a2);
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
            function3.d(obj2, composer, 0);
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
