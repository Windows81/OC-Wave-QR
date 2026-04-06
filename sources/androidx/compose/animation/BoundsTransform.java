package androidx.compose.animation;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.ui.geometry.Rect;
import kotlin.Metadata;

@Metadata
public interface BoundsTransform {
    FiniteAnimationSpec a(Rect rect, Rect rect2);
}
