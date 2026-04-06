package androidx.compose.animation.core;

import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class TransitionKt$animateInt$1 extends Lambda implements Function3<Transition.Segment<Object>, Composer, Integer, SpringSpec<Integer>> {

    /* renamed from: z  reason: collision with root package name */
    public static final TransitionKt$animateInt$1 f2762z = new TransitionKt$animateInt$1();

    public TransitionKt$animateInt$1() {
        super(3);
    }

    public final SpringSpec b(Transition.Segment segment, Composer composer, int i2) {
        composer.X(-785273069);
        if (ComposerKt.P()) {
            ComposerKt.Y(-785273069, i2, -1, "androidx.compose.animation.core.animateInt.<anonymous> (Transition.kt:2074)");
        }
        SpringSpec l2 = AnimationSpecKt.l(0.0f, 0.0f, 1, 3, (Object) null);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        composer.M();
        return l2;
    }

    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        return b((Transition.Segment) obj, (Composer) obj2, ((Number) obj3).intValue());
    }
}
