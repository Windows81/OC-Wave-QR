package androidx.core.widget;

import android.view.View;
import android.widget.PopupWindow;

public final class PopupWindowCompat {

    public static class Api23Impl {
        public static void a(PopupWindow popupWindow, boolean z2) {
            popupWindow.setOverlapAnchor(z2);
        }

        public static void b(PopupWindow popupWindow, int i2) {
            popupWindow.setWindowLayoutType(i2);
        }
    }

    public static void a(PopupWindow popupWindow, boolean z2) {
        Api23Impl.a(popupWindow, z2);
    }

    public static void b(PopupWindow popupWindow, int i2) {
        Api23Impl.b(popupWindow, i2);
    }

    public static void c(PopupWindow popupWindow, View view, int i2, int i3, int i4) {
        popupWindow.showAsDropDown(view, i2, i3, i4);
    }
}
