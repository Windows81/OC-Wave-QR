package androidx.compose.ui.graphics.layer;

import android.graphics.RenderNode;
import androidx.compose.ui.graphics.RenderEffect;
import kotlin.Metadata;

@Metadata
public final class RenderNodeVerificationHelper {

    /* renamed from: a  reason: collision with root package name */
    public static final RenderNodeVerificationHelper f16444a = new RenderNodeVerificationHelper();

    public final void a(RenderNode renderNode, RenderEffect renderEffect) {
        boolean unused = renderNode.setRenderEffect(renderEffect != null ? renderEffect.a() : null);
    }
}
