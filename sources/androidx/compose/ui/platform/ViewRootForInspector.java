package androidx.compose.ui.platform;

import android.view.View;
import kotlin.Metadata;

@Metadata
public interface ViewRootForInspector {

    @Metadata
    public static final class DefaultImpls {
    }

    AbstractComposeView getSubCompositionView() {
        return null;
    }

    View getViewRoot() {
        return null;
    }
}
