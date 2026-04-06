package androidx.compose.animation.core;

import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.geometry.Size;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class TransitionKt$animateSize$1 extends Lambda implements Function3<Transition.Segment<Object>, Composer, Integer, SpringSpec<Size>> {

    /* renamed from: z  reason: collision with root package name */
    public static final TransitionKt$animateSize$1 f2767z = new TransitionKt$animateSize$1();

    public TransitionKt$animateSize$1() {
        super(3);
    }

    public final SpringSpec b(Transition.Segment segment, Composer composer, int i2) {
        composer.X(-1607152761);
        if (ComposerKt.P()) {
            ComposerKt.Y(-1607152761, i2, -1, "androidx.compose.animation.core.animateSize.<anonymous> (Transition.kt:2010)");
        }
        SpringSpec l2 = AnimationSpecKt.l(0.0f, 0.0f, Size.c(VisibilityThresholdsKt.d(Size.f15876b)), 3, (Object) null);
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
