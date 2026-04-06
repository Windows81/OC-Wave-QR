package androidx.compose.animation.core;

import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class TransitionKt$animateValue$1 extends Lambda implements Function3<Transition.Segment<Object>, Composer, Integer, SpringSpec<Object>> {

    /* renamed from: z  reason: collision with root package name */
    public static final TransitionKt$animateValue$1 f2768z = new TransitionKt$animateValue$1();

    public TransitionKt$animateValue$1() {
        super(3);
    }

    public final SpringSpec b(Transition.Segment segment, Composer composer, int i2) {
        composer.X(-895531546);
        if (ComposerKt.P()) {
            ComposerKt.Y(-895531546, i2, -1, "androidx.compose.animation.core.animateValue.<anonymous> (Transition.kt:1827)");
        }
        SpringSpec l2 = AnimationSpecKt.l(0.0f, 0.0f, (Object) null, 7, (Object) null);
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
