package androidx.compose.material3;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;

@Metadata
final class TabKt$TabTransition$color$2 implements Function3<Transition.Segment<Boolean>, Composer, Integer, FiniteAnimationSpec<Color>> {

    /* renamed from: z  reason: collision with root package name */
    public static final TabKt$TabTransition$color$2 f11289z = new TabKt$TabTransition$color$2();

    public final FiniteAnimationSpec b(Transition.Segment segment, Composer composer, int i2) {
        FiniteAnimationSpec finiteAnimationSpec;
        composer.X(1058649156);
        if (ComposerKt.P()) {
            ComposerKt.Y(1058649156, i2, -1, "androidx.compose.material3.TabTransition.<anonymous> (Tab.kt:280)");
        }
        if (segment.c(Boolean.FALSE, Boolean.TRUE)) {
            composer.X(272207019);
            finiteAnimationSpec = MotionSchemeKt.b(MotionSchemeKeyTokens.DefaultEffects, composer, 6);
            composer.M();
        } else {
            composer.X(272326989);
            finiteAnimationSpec = MotionSchemeKt.b(MotionSchemeKeyTokens.FastEffects, composer, 6);
            composer.M();
        }
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        composer.M();
        return finiteAnimationSpec;
    }

    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        return b((Transition.Segment) obj, (Composer) obj2, ((Number) obj3).intValue());
    }
}
