package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.Easing;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.state.ToggleableState;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class CheckboxKt$CheckboxImpl$checkCenterGravitationShiftFraction$2 extends Lambda implements Function3<Transition.Segment<ToggleableState>, Composer, Integer, FiniteAnimationSpec<Float>> {

    /* renamed from: z  reason: collision with root package name */
    public static final CheckboxKt$CheckboxImpl$checkCenterGravitationShiftFraction$2 f7464z = new CheckboxKt$CheckboxImpl$checkCenterGravitationShiftFraction$2();

    public CheckboxKt$CheckboxImpl$checkCenterGravitationShiftFraction$2() {
        super(3);
    }

    public final FiniteAnimationSpec b(Transition.Segment segment, Composer composer, int i2) {
        composer.X(1075283605);
        if (ComposerKt.P()) {
            ComposerKt.Y(1075283605, i2, -1, "androidx.compose.material.CheckboxImpl.<anonymous> (Checkbox.kt:280)");
        }
        Object b2 = segment.b();
        ToggleableState toggleableState = ToggleableState.Off;
        FiniteAnimationSpec j2 = b2 == toggleableState ? AnimationSpecKt.j(0, 1, (Object) null) : segment.d() == toggleableState ? AnimationSpecKt.i(100) : AnimationSpecKt.n(100, 0, (Easing) null, 6, (Object) null);
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
