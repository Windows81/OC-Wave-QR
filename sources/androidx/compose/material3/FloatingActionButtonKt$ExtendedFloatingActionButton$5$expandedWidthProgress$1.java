package androidx.compose.material3;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;

@Metadata
public final class FloatingActionButtonKt$ExtendedFloatingActionButton$5$expandedWidthProgress$1 implements Function3<Transition.Segment<Float>, Composer, Integer, FiniteAnimationSpec<Float>> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ FiniteAnimationSpec f10063z;

    public FloatingActionButtonKt$ExtendedFloatingActionButton$5$expandedWidthProgress$1(FiniteAnimationSpec finiteAnimationSpec) {
        this.f10063z = finiteAnimationSpec;
    }

    public final FiniteAnimationSpec b(Transition.Segment segment, Composer composer, int i2) {
        composer.X(-1114419602);
        if (ComposerKt.P()) {
            ComposerKt.Y(-1114419602, i2, -1, "androidx.compose.material3.ExtendedFloatingActionButton.<anonymous>.<anonymous> (FloatingActionButton.kt:469)");
        }
        FiniteAnimationSpec finiteAnimationSpec = this.f10063z;
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
