package androidx.compose.animation.core;

import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class TransitionKt$animateDp$1 extends Lambda implements Function3<Transition.Segment<Object>, Composer, Integer, SpringSpec<Dp>> {

    /* renamed from: z  reason: collision with root package name */
    public static final TransitionKt$animateDp$1 f2760z = new TransitionKt$animateDp$1();

    public TransitionKt$animateDp$1() {
        super(3);
    }

    public final SpringSpec b(Transition.Segment segment, Composer composer, int i2) {
        composer.X(-575880366);
        if (ComposerKt.P()) {
            ComposerKt.Y(-575880366, i2, -1, "androidx.compose.animation.core.animateDp.<anonymous> (Transition.kt:1950)");
        }
        SpringSpec l2 = AnimationSpecKt.l(0.0f, 0.0f, Dp.j(VisibilityThresholdsKt.a(Dp.f19144A)), 3, (Object) null);
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
