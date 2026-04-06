package androidx.compose.animation;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.VisibilityThresholdsKt;
import androidx.compose.ui.geometry.Rect;
import kotlin.Metadata;

@Metadata
public final class AnimateBoundsModifierKt {

    /* renamed from: a  reason: collision with root package name */
    public static final BoundsTransform f2016a = new a();

    public static final FiniteAnimationSpec b(Rect rect, Rect rect2) {
        return AnimationSpecKt.k(1.0f, 400.0f, VisibilityThresholdsKt.g(Rect.f15860e));
    }
}
