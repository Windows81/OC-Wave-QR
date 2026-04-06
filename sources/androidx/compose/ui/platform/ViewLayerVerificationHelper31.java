package androidx.compose.ui.platform;

import android.view.View;
import androidx.compose.ui.graphics.RenderEffect;
import kotlin.Metadata;

@Metadata
final class ViewLayerVerificationHelper31 {

    /* renamed from: a  reason: collision with root package name */
    public static final ViewLayerVerificationHelper31 f17915a = new ViewLayerVerificationHelper31();

    public final void a(View view, RenderEffect renderEffect) {
        view.setRenderEffect(renderEffect != null ? renderEffect.a() : null);
    }
}
