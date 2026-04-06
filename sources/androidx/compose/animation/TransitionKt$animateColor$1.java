package androidx.compose.animation;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class TransitionKt$animateColor$1 extends Lambda implements Function3<Transition.Segment<Object>, Composer, Integer, SpringSpec<Color>> {

    /* renamed from: z  reason: collision with root package name */
    public static final TransitionKt$animateColor$1 f2414z = new TransitionKt$animateColor$1();

    public TransitionKt$animateColor$1() {
        super(3);
    }

    public final SpringSpec b(Transition.Segment segment, Composer composer, int i2) {
        composer.X(-1457805428);
        if (ComposerKt.P()) {
            ComposerKt.Y(-1457805428, i2, -1, "androidx.compose.animation.animateColor.<anonymous> (Transition.kt:62)");
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
