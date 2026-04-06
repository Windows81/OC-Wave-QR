package androidx.compose.animation;

import androidx.compose.animation.SharedTransitionScope;
import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

@Metadata
final class SharedTransitionScopeImpl$sharedBounds$2 extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ EnterTransition f2351A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ ExitTransition f2352B;
    public final /* synthetic */ SharedTransitionScope.SharedContentState C;
    public final /* synthetic */ SharedTransitionScope.ResizeMode D;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ AnimatedVisibilityScope f2353z;

    public final Modifier b(Modifier modifier, Composer composer, int i2) {
        Modifier modifier2;
        composer.X(-419341573);
        if (ComposerKt.P()) {
            ComposerKt.Y(-419341573, i2, -1, "androidx.compose.animation.SharedTransitionScopeImpl.sharedBounds.<anonymous> (SharedTransitionScope.kt:736)");
        }
        Transition c2 = this.f2353z.c();
        EnterTransition enterTransition = this.f2351A;
        ExitTransition exitTransition = this.f2352B;
        boolean l2 = composer.l(this.C);
        SharedTransitionScope.SharedContentState sharedContentState = this.C;
        Object g2 = composer.g();
        if (l2 || g2 == Composer.f14567a.a()) {
            g2 = new SharedTransitionScopeImpl$sharedBounds$2$1$1(sharedContentState);
            composer.N(g2);
        }
        Modifier g3 = EnterExitTransitionKt.g(c2, enterTransition, exitTransition, (Function0) g2, "enter/exit for " + this.C.c(), composer, 0, 0);
        if (this.D instanceof ScaleToBoundsImpl) {
            composer.X(-805568624);
            Modifier.Companion companion = Modifier.f15489d;
            ScaleToBoundsImpl scaleToBoundsImpl = (ScaleToBoundsImpl) this.D;
            boolean l3 = composer.l(this.C);
            SharedTransitionScope.SharedContentState sharedContentState2 = this.C;
            Object g4 = composer.g();
            if (l3 || g4 == Composer.f14567a.a()) {
                g4 = new SharedTransitionScopeImpl$sharedBounds$2$2$1(sharedContentState2);
                composer.N(g4);
            }
            modifier2 = SkipToLookaheadNodeKt.a(companion, scaleToBoundsImpl, (Function0) g4);
            composer.M();
        } else {
            composer.X(-804951414);
            composer.M();
            modifier2 = Modifier.f15489d;
        }
        Modifier o0 = g3.o0(modifier2);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        composer.M();
        return o0;
    }

    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        return b((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
    }
}
