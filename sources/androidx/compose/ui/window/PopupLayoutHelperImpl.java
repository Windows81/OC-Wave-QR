package androidx.compose.ui.window;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import kotlin.Metadata;

@Metadata
class PopupLayoutHelperImpl implements PopupLayoutHelper {
    public void a(WindowManager windowManager, View view, ViewGroup.LayoutParams layoutParams) {
        windowManager.updateViewLayout(view, layoutParams);
    }

    public void b(View view, int i2, int i3) {
    }

    public void c(View view, Rect rect) {
        view.getWindowVisibleDisplayFrame(rect);
    }
}
