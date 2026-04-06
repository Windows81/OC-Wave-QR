package androidx.compose.ui.graphics.layer;

import android.view.View;
import kotlin.Metadata;

@Metadata
final class ViewLayerVerificationHelper28 {

    /* renamed from: a  reason: collision with root package name */
    public static final ViewLayerVerificationHelper28 f16453a = new ViewLayerVerificationHelper28();

    public final void a(View view) {
        view.resetPivot();
    }

    public final void b(View view, int i2) {
        view.setOutlineAmbientShadowColor(i2);
    }

    public final void c(View view, int i2) {
        view.setOutlineSpotShadowColor(i2);
    }
}
