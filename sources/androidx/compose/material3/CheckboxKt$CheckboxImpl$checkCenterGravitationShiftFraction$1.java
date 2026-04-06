package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.state.ToggleableState;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;

@Metadata
public final class CheckboxKt$CheckboxImpl$checkCenterGravitationShiftFraction$1 implements Function3<Transition.Segment<ToggleableState>, Composer, Integer, FiniteAnimationSpec<Float>> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ FiniteAnimationSpec f9389z;

    public CheckboxKt$CheckboxImpl$checkCenterGravitationShiftFraction$1(FiniteAnimationSpec finiteAnimationSpec) {
        this.f9389z = finiteAnimationSpec;
    }

    public final FiniteAnimationSpec b(Transition.Segment segment, Composer composer, int i2) {
        composer.X(630790831);
        if (ComposerKt.P()) {
            ComposerKt.Y(630790831, i2, -1, "androidx.compose.material3.CheckboxImpl.<anonymous> (Checkbox.kt:425)");
        }
        Object b2 = segment.b();
        ToggleableState toggleableState = ToggleableState.Off;
        FiniteAnimationSpec j2 = b2 == toggleableState ? AnimationSpecKt.j(0, 1, (Object) null) : segment.d() == toggleableState ? AnimationSpecKt.i(100) : this.f9389z;
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        composer.M();
        return j2;
    }

    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        return b((Transition.Segment) obj, (Composer) obj2, ((Number) obj3).intValue());
    }
}
