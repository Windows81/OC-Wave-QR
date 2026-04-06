package androidx.compose.animation;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

@Metadata
final class AnimatedVisibilityScope$animateEnterExit$2 extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ EnterTransition f2145A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ ExitTransition f2146B;
    public final /* synthetic */ String C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ AnimatedVisibilityScope f2147z;

    public final Modifier b(Modifier modifier, Composer composer, int i2) {
        composer.X(1840112047);
        if (ComposerKt.P()) {
            ComposerKt.Y(1840112047, i2, -1, "androidx.compose.animation.AnimatedVisibilityScope.animateEnterExit.<anonymous> (AnimatedVisibility.kt:654)");
        }
        Modifier o0 = modifier.o0(EnterExitTransitionKt.g(this.f2147z.c(), this.f2145A, this.f2146B, (Function0) null, this.C, composer, 0, 4));
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
