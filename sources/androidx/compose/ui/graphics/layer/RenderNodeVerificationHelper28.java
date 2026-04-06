package androidx.compose.ui.graphics.layer;

import android.view.RenderNode;
import kotlin.Metadata;

@Metadata
final class RenderNodeVerificationHelper28 {

    /* renamed from: a  reason: collision with root package name */
    public static final RenderNodeVerificationHelper28 f16447a = new RenderNodeVerificationHelper28();

    public final int a(RenderNode renderNode) {
        return renderNode.getAmbientShadowColor();
    }

    public final int b(RenderNode renderNode) {
        return renderNode.getSpotShadowColor();
    }

    public final void c(RenderNode renderNode, int i2) {
        renderNode.setAmbientShadowColor(i2);
    }

    public final void d(RenderNode renderNode, int i2) {
        renderNode.setSpotShadowColor(i2);
    }
}
