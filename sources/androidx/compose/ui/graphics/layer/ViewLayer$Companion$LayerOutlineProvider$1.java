package androidx.compose.ui.graphics.layer;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import kotlin.Metadata;

@Metadata
public final class ViewLayer$Companion$LayerOutlineProvider$1 extends ViewOutlineProvider {
    public void getOutline(View view, Outline outline) {
        Outline a2;
        if ((view instanceof ViewLayer) && (a2 = ((ViewLayer) view).D) != null) {
            outline.set(a2);
        }
    }
}
