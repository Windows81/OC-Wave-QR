package androidx.compose.foundation.draganddrop;

import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.draw.DrawResult;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.graphics.layer.GraphicsLayerKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;

@Metadata
public final class CacheDrawScopeDragShadowCallback {

    /* renamed from: a  reason: collision with root package name */
    public GraphicsLayer f3291a;

    public final DrawResult b(CacheDrawScope cacheDrawScope) {
        GraphicsLayer f2 = cacheDrawScope.f();
        CacheDrawScope.w(cacheDrawScope, f2, (Density) null, (LayoutDirection) null, 0, CacheDrawScopeDragShadowCallback$cachePicture$1$1$1.f3292z, 7, (Object) null);
        this.f3291a = f2;
        return cacheDrawScope.t(new CacheDrawScopeDragShadowCallback$cachePicture$1$2(this));
    }

    public final void c(DrawScope drawScope) {
        GraphicsLayer graphicsLayer = this.f3291a;
        if (graphicsLayer != null) {
            GraphicsLayerKt.a(drawScope, graphicsLayer);
            return;
        }
        throw new IllegalArgumentException("No cached drag shadow. Check if the drag source node was rendered first");
    }
}
