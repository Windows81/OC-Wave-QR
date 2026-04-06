package androidx.appcompat.widget;

import android.view.View;

public class TooltipCompat {

    public static class Api26Impl {
        public static void a(View view, CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }

    public static void a(View view, CharSequence charSequence) {
        Api26Impl.a(view, charSequence);
    }
}
