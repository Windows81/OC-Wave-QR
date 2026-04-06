package androidx.compose.ui.platform;

import android.view.ViewParent;
import kotlin.Metadata;

@Metadata
public final class WrapperRenderNodeLayerHelperMethods {

    /* renamed from: a  reason: collision with root package name */
    public static final WrapperRenderNodeLayerHelperMethods f17954a = new WrapperRenderNodeLayerHelperMethods();

    public final void a(AndroidComposeView androidComposeView) {
        ViewParent parent = androidComposeView.getParent();
        if (parent != null) {
            parent.onDescendantInvalidated(androidComposeView, androidComposeView);
        }
    }
}
