package androidx.core.view;

import android.view.WindowInsetsAnimationController;

public final class WindowInsetsAnimationControllerCompat {

    /* renamed from: a  reason: collision with root package name */
    public final Impl f20329a;

    public static class Impl {
    }

    public static class Impl30 extends Impl {

        /* renamed from: a  reason: collision with root package name */
        public final WindowInsetsAnimationController f20330a;

        public Impl30(WindowInsetsAnimationController windowInsetsAnimationController) {
            this.f20330a = windowInsetsAnimationController;
        }
    }

    public WindowInsetsAnimationControllerCompat(WindowInsetsAnimationController windowInsetsAnimationController) {
        this.f20329a = new Impl30(windowInsetsAnimationController);
    }
}
