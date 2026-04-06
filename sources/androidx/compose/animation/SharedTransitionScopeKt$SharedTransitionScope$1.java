package androidx.compose.animation;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.layout.LookaheadScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;

@Metadata
public final class SharedTransitionScopeKt$SharedTransitionScope$1 extends Lambda implements Function3<LookaheadScope, Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function4 f2375z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SharedTransitionScopeKt$SharedTransitionScope$1(Function4 function4) {
        super(3);
        this.f2375z = function4;
    }

    public final void b(LookaheadScope lookaheadScope, Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(-863967934, i2, -1, "androidx.compose.animation.SharedTransitionScope.<anonymous> (SharedTransitionScope.kt:123)");
        }
        Object g2 = composer.g();
        Composer.Companion companion = Composer.f14567a;
        if (g2 == companion.a()) {
            g2 = EffectsKt.j(EmptyCoroutineContext.f40721z, composer);
            composer.N(g2);
        }
        CoroutineScope coroutineScope = (CoroutineScope) g2;
        Object g3 = composer.g();
        if (g3 == companion.a()) {
            g3 = new SharedTransitionScopeImpl(lookaheadScope, coroutineScope);
            composer.N(g3);
        }
        SharedTransitionScopeImpl sharedTransitionScopeImpl = (SharedTransitionScopeImpl) g3;
        Function4 function4 = this.f2375z;
        Modifier.Companion companion2 = Modifier.f15489d;
        Object g4 = composer.g();
        if (g4 == companion.a()) {
            g4 = new SharedTransitionScopeKt$SharedTransitionScope$1$1$1(sharedTransitionScopeImpl);
            composer.N(g4);
        }
        Modifier a2 = LayoutModifierKt.a(companion2, (Function3) g4);
        Object g5 = composer.g();
        if (g5 == companion.a()) {
            g5 = new SharedTransitionScopeKt$SharedTransitionScope$1$2$1(sharedTransitionScopeImpl);
            composer.N(g5);
        }
        function4.j(sharedTransitionScopeImpl, DrawModifierKt.d(a2, (Function1) g5), composer, 6);
        Unit unit = Unit.f40552a;
        Object g6 = composer.g();
        if (g6 == companion.a()) {
            g6 = new SharedTransitionScopeKt$SharedTransitionScope$1$3$1(sharedTransitionScopeImpl);
            composer.N(g6);
        }
        EffectsKt.c(unit, (Function1) g6, composer, 54);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
    }

    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        b((LookaheadScope) obj, (Composer) obj2, ((Number) obj3).intValue());
        return Unit.f40552a;
    }
}
