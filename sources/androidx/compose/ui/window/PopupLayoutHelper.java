package androidx.compose.ui.window;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import kotlin.Metadata;

@Metadata
public interface PopupLayoutHelper {
    void a(WindowManager windowManager, View view, ViewGroup.LayoutParams layoutParams);

    void b(View view, int i2, int i3);

    void c(View view, Rect rect);
}
