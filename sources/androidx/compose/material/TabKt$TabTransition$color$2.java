package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class TabKt$TabTransition$color$2 extends Lambda implements Function3<Transition.Segment<Boolean>, Composer, Integer, FiniteAnimationSpec<Color>> {

    /* renamed from: z  reason: collision with root package name */
    public static final TabKt$TabTransition$color$2 f8679z = new TabKt$TabTransition$color$2();

    public TabKt$TabTransition$color$2() {
        super(3);
    }

    public final FiniteAnimationSpec b(Transition.Segment segment, Composer composer, int i2) {
        composer.X(-2120892502);
        if (ComposerKt.P()) {
            ComposerKt.Y(-2120892502, i2, -1, "androidx.compose.material.TabTransition.<anonymous> (Tab.kt:274)");
        }
        TweenSpec m2 = segment.c(Boolean.FALSE, Boolean.TRUE) ? AnimationSpecKt.m(150, 100, EasingKt.e()) : AnimationSpecKt.n(100, 0, EasingKt.e(), 2, (Object) null);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        composer.M();
        return m2;
    }

    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        return b((Transition.Segment) obj, (Composer) obj2, ((Number) obj3).intValue());
    }
}
