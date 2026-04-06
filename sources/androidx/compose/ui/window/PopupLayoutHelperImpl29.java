package androidx.compose.ui.window;

import android.graphics.Rect;
import android.view.View;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@Metadata
final class PopupLayoutHelperImpl29 extends PopupLayoutHelperImpl {
    public void b(View view, int i2, int i3) {
        view.setSystemGestureExclusionRects(CollectionsKt.s(new Rect(0, 0, i2, i3)));
    }
}
