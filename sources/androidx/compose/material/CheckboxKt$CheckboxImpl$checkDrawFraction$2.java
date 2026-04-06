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
public final class CheckboxKt$CheckboxImpl$checkDrawFraction$2 extends Lambda implements Function3<Transition.Segment<ToggleableState>, Composer, Integer, FiniteAnimationSpec<Float>> {

    /* renamed from: z  reason: collision with root package name */
    public static final CheckboxKt$CheckboxImpl$checkDrawFraction$2 f7465z = new CheckboxKt$CheckboxImpl$checkDrawFraction$2();

    public CheckboxKt$CheckboxImpl$checkDrawFraction$2() {
        super(3);
    }

    public final FiniteAnimationSpec b(Transition.Segment segment, Composer composer, int i2) {
        composer.X(-1707702900);
        if (ComposerKt.P()) {
            ComposerKt.Y(-1707702900, i2, -1, "androidx.compose.material.CheckboxImpl.<anonymous> (Checkbox.kt:263)");
        }
        Object b2 = segment.b();
        ToggleableState toggleableState = ToggleableState.Off;
        FiniteAnimationSpec n2 = b2 == toggleableState ? AnimationSpecKt.n(100, 0, (Easing) null, 6, (Object) null) : segment.d() == toggleableState ? AnimationSpecKt.i(100) : AnimationSpecKt.l(0.0f, 0.0f, (Object) null, 7, (Object) null);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        composer.M();
        return n2;
    }

    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        return b((Transition.Segment) obj, (Composer) obj2, ((Number) obj3).intValue());
    }
}
