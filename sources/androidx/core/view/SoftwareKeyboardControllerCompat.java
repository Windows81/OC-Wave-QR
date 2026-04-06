package androidx.core.view;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;
import java.util.concurrent.atomic.AtomicBoolean;

public final class SoftwareKeyboardControllerCompat {

    /* renamed from: a  reason: collision with root package name */
    public final Impl f20247a;

    public static class Impl {
        public void a() {
        }

        public void b() {
        }
    }

    public static class Impl20 extends Impl {

        /* renamed from: a  reason: collision with root package name */
        public final View f20248a;

        public Impl20(View view) {
            this.f20248a = view;
        }

        public void a() {
            View view = this.f20248a;
            if (view != null) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.f20248a.getWindowToken(), 0);
            }
        }

        public void b() {
            View view = this.f20248a;
            if (view != null) {
                if (view.isInEditMode() || view.onCheckIsTextEditor()) {
                    view.requestFocus();
                } else {
                    view = view.getRootView().findFocus();
                }
                if (view == null) {
                    view = this.f20248a.getRootView().findViewById(16908290);
                }
                if (view != null && view.hasWindowFocus()) {
                    view.post(new C0364m(view));
                }
            }
        }
    }

    public static class Impl30 extends Impl20 {

        /* renamed from: b  reason: collision with root package name */
        public View f20249b;

        /* renamed from: c  reason: collision with root package name */
        public WindowInsetsController f20250c;

        public Impl30(View view) {
            super(view);
            this.f20249b = view;
        }

        public static /* synthetic */ void f(AtomicBoolean atomicBoolean, WindowInsetsController windowInsetsController, int i2) {
            atomicBoolean.set((i2 & 8) != 0);
        }

        public void a() {
            View view;
            WindowInsetsController windowInsetsController = this.f20250c;
            if (windowInsetsController == null) {
                View view2 = this.f20249b;
                windowInsetsController = view2 != null ? view2.getWindowInsetsController() : null;
            }
            if (windowInsetsController != null) {
                AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                C0369s sVar = new C0369s(atomicBoolean);
                windowInsetsController.addOnControllableInsetsChangedListener(sVar);
                if (!atomicBoolean.get() && (view = this.f20249b) != null) {
                    ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.f20249b.getWindowToken(), 0);
                }
                windowInsetsController.removeOnControllableInsetsChangedListener(sVar);
                windowInsetsController.hide(WindowInsets.Type.ime());
                return;
            }
            super.a();
        }

        public void b() {
            View view = this.f20249b;
            if (view != null && Build.VERSION.SDK_INT < 33) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).isActive();
            }
            WindowInsetsController windowInsetsController = this.f20250c;
            if (windowInsetsController == null) {
                View view2 = this.f20249b;
                windowInsetsController = view2 != null ? view2.getWindowInsetsController() : null;
            }
            if (windowInsetsController != null) {
                windowInsetsController.show(WindowInsets.Type.ime());
            }
            super.b();
        }
    }

    public SoftwareKeyboardControllerCompat(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f20247a = new Impl30(view);
        } else {
            this.f20247a = new Impl20(view);
        }
    }

    public void a() {
        this.f20247a.a();
    }

    public void b() {
        this.f20247a.b();
    }
}
