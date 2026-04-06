package androidx.compose.material3.internal;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;

@Metadata
public final class TextFieldImplKt$TextFieldTransitionScope$placeholderOpacity$1 implements Function3<Transition.Segment<InputPhase>, Composer, Integer, FiniteAnimationSpec<Float>> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ FiniteAnimationSpec f12363A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ FiniteAnimationSpec f12364z;

    public TextFieldImplKt$TextFieldTransitionScope$placeholderOpacity$1(FiniteAnimationSpec finiteAnimationSpec, FiniteAnimationSpec finiteAnimationSpec2) {
        this.f12364z = finiteAnimationSpec;
        this.f12363A = finiteAnimationSpec2;
    }

    public final FiniteAnimationSpec b(Transition.Segment segment, Composer composer, int i2) {
        composer.X(-984009111);
        if (ComposerKt.P()) {
            ComposerKt.Y(-984009111, i2, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:404)");
        }
        InputPhase inputPhase = InputPhase.Focused;
        InputPhase inputPhase2 = InputPhase.UnfocusedEmpty;
        FiniteAnimationSpec finiteAnimationSpec = segment.c(inputPhase, inputPhase2) ? this.f12364z : (segment.c(inputPhase2, inputPhase) || segment.c(InputPhase.UnfocusedNotEmpty, inputPhase2)) ? this.f12363A : this.f12364z;
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
