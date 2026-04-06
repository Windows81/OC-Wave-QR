package androidx.core.view;

import android.view.ViewGroup;

public final class ViewGroupCompat {

    public static class Api21Impl {
        public static boolean a(ViewGroup viewGroup) {
            return viewGroup.isTransitionGroup();
        }
    }

    public static boolean a(ViewGroup viewGroup) {
        return Api21Impl.a(viewGroup);
    }
}
