package androidx.compose.ui.platform;

import android.graphics.RenderNode;
import androidx.compose.ui.graphics.RenderEffect;
import kotlin.Metadata;

@Metadata
final class RenderNodeApi29VerificationHelper {

    /* renamed from: a  reason: collision with root package name */
    public static final RenderNodeApi29VerificationHelper f17861a = new RenderNodeApi29VerificationHelper();

    public final void a(RenderNode renderNode, RenderEffect renderEffect) {
        boolean unused = renderNode.setRenderEffect(renderEffect != null ? renderEffect.a() : null);
    }
}
