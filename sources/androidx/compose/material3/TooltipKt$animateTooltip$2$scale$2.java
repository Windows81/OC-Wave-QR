package androidx.compose.material3;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;

@Metadata
public final class TooltipKt$animateTooltip$2$scale$2 implements Function3<Transition.Segment<Boolean>, Composer, Integer, FiniteAnimationSpec<Float>> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ FiniteAnimationSpec f11616z;

    public TooltipKt$animateTooltip$2$scale$2(FiniteAnimationSpec finiteAnimationSpec) {
        this.f11616z = finiteAnimationSpec;
    }

    public final FiniteAnimationSpec b(Transition.Segment segment, Composer composer, int i2) {
        composer.X(386845748);
        if (ComposerKt.P()) {
            ComposerKt.Y(386845748, i2, -1, "androidx.compose.material3.animateTooltip.<anonymous>.<anonymous> (Tooltip.kt:1272)");
        }
        FiniteAnimationSpec finiteAnimationSpec = this.f11616z;
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
