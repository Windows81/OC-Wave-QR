package androidx.compose.material.pullrefresh;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import kotlin.Metadata;

@Metadata
public final class PullRefreshIndicatorTransformKt {
    public static final Modifier a(Modifier modifier, PullRefreshState pullRefreshState, boolean z2) {
        return GraphicsLayerModifierKt.a(DrawModifierKt.d(modifier, PullRefreshIndicatorTransformKt$pullRefreshIndicatorTransform$1.f9029z), new PullRefreshIndicatorTransformKt$pullRefreshIndicatorTransform$2(pullRefreshState, z2));
    }
}
