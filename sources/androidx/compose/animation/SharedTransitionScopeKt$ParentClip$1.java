package androidx.compose.animation;

import androidx.compose.animation.SharedTransitionScope;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;

@Metadata
public final class SharedTransitionScopeKt$ParentClip$1 implements SharedTransitionScope.OverlayClip {
    public Path a(SharedTransitionScope.SharedContentState sharedContentState, Rect rect, LayoutDirection layoutDirection, Density density) {
        SharedTransitionScope.SharedContentState e2 = sharedContentState.e();
        if (e2 != null) {
            return e2.a();
        }
        return null;
    }
}
