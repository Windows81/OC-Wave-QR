package androidx.core.view;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsAnimationControlListener;
import android.view.WindowInsetsAnimationController;
import android.view.WindowInsetsController;
import androidx.collection.SimpleArrayMap;

public final class WindowInsetsControllerCompat {

    /* renamed from: a  reason: collision with root package name */
    public final Impl f20364a;

    public static class Impl {
        public boolean a() {
            return false;
        }

        public void b(boolean z2) {
        }

        public void c(boolean z2) {
        }
    }

    public static class Impl20 extends Impl {

        /* renamed from: a  reason: collision with root package name */
        public final Window f20365a;

        /* renamed from: b  reason: collision with root package name */
        public final SoftwareKeyboardControllerCompat f20366b;

        public Impl20(Window window, SoftwareKeyboardControllerCompat softwareKeyboardControllerCompat) {
            this.f20365a = window;
            this.f20366b = softwareKeyboardControllerCompat;
        }

        public void d(int i2) {
            View decorView = this.f20365a.getDecorView();
            decorView.setSystemUiVisibility(i2 | decorView.getSystemUiVisibility());
        }

        public void e(int i2) {
            this.f20365a.addFlags(i2);
        }

        public void f(int i2) {
            View decorView = this.f20365a.getDecorView();
            decorView.setSystemUiVisibility((~i2) & decorView.getSystemUiVisibility());
        }

        public void g(int i2) {
            this.f20365a.clearFlags(i2);
        }
    }

    public static class Impl23 extends Impl20 {
        public Impl23(Window window, SoftwareKeyboardControllerCompat softwareKeyboardControllerCompat) {
            super(window, softwareKeyboardControllerCompat);
        }

        public boolean a() {
            return (this.f20365a.getDecorView().getSystemUiVisibility() & 8192) != 0;
        }

        public void c(boolean z2) {
            if (z2) {
                g(67108864);
                e(Integer.MIN_VALUE);
                d(8192);
                return;
            }
            f(8192);
        }
    }

    public static class Impl26 extends Impl23 {
        public Impl26(Window window, SoftwareKeyboardControllerCompat softwareKeyboardControllerCompat) {
            super(window, softwareKeyboardControllerCompat);
        }

        public void b(boolean z2) {
            if (z2) {
                g(134217728);
                e(Integer.MIN_VALUE);
                d(16);
                return;
            }
            f(16);
        }
    }

    public static class Impl31 extends Impl30 {
        public Impl31(Window window, WindowInsetsControllerCompat windowInsetsControllerCompat, SoftwareKeyboardControllerCompat softwareKeyboardControllerCompat) {
            super(window, windowInsetsControllerCompat, softwareKeyboardControllerCompat);
        }
    }

    public static class Impl35 extends Impl31 {
        public Impl35(Window window, WindowInsetsControllerCompat windowInsetsControllerCompat, SoftwareKeyboardControllerCompat softwareKeyboardControllerCompat) {
            super(window, windowInsetsControllerCompat, softwareKeyboardControllerCompat);
        }

        public boolean a() {
            return (i0.a(this.f20368b) & 8) != 0;
        }
    }

    public interface OnControllableInsetsChangedListener {
    }

    public WindowInsetsControllerCompat(Window window, View view) {
        SoftwareKeyboardControllerCompat softwareKeyboardControllerCompat = new SoftwareKeyboardControllerCompat(view);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 35) {
            this.f20364a = new Impl35(window, this, softwareKeyboardControllerCompat);
        } else if (i2 >= 30) {
            this.f20364a = new Impl30(window, this, softwareKeyboardControllerCompat);
        } else {
            this.f20364a = new Impl26(window, softwareKeyboardControllerCompat);
        }
    }

    public boolean a() {
        return this.f20364a.a();
    }

    public void b(boolean z2) {
        this.f20364a.b(z2);
    }

    public void c(boolean z2) {
        this.f20364a.c(z2);
    }

    public static class Impl30 extends Impl {

        /* renamed from: a  reason: collision with root package name */
        public final WindowInsetsControllerCompat f20367a;

        /* renamed from: b  reason: collision with root package name */
        public final WindowInsetsController f20368b;

        /* renamed from: c  reason: collision with root package name */
        public final SoftwareKeyboardControllerCompat f20369c;

        /* renamed from: d  reason: collision with root package name */
        public final SimpleArrayMap f20370d;

        /* renamed from: e  reason: collision with root package name */
        public Window f20371e;

        /* renamed from: androidx.core.view.WindowInsetsControllerCompat$Impl30$1  reason: invalid class name */
        class AnonymousClass1 implements WindowInsetsAnimationControlListener {

            /* renamed from: A  reason: collision with root package name */
            public final /* synthetic */ WindowInsetsAnimationControlListenerCompat f20372A;

            /* renamed from: z  reason: collision with root package name */
            public WindowInsetsAnimationControllerCompat f20373z;

            public void onCancelled(WindowInsetsAnimationController windowInsetsAnimationController) {
                this.f20372A.a(windowInsetsAnimationController == null ? null : this.f20373z);
            }

            public void onFinished(WindowInsetsAnimationController windowInsetsAnimationController) {
                this.f20372A.c(this.f20373z);
            }

            public void onReady(WindowInsetsAnimationController windowInsetsAnimationController, int i2) {
                WindowInsetsAnimationControllerCompat windowInsetsAnimationControllerCompat = new WindowInsetsAnimationControllerCompat(windowInsetsAnimationController);
                this.f20373z = windowInsetsAnimationControllerCompat;
                this.f20372A.b(windowInsetsAnimationControllerCompat, i2);
            }
        }

        public Impl30(Window window, WindowInsetsControllerCompat windowInsetsControllerCompat, SoftwareKeyboardControllerCompat softwareKeyboardControllerCompat) {
            this(window.getInsetsController(), windowInsetsControllerCompat, softwareKeyboardControllerCompat);
            this.f20371e = window;
        }

        public boolean a() {
            this.f20368b.setSystemBarsAppearance(0, 0);
            return (i0.a(this.f20368b) & 8) != 0;
        }

        public void b(boolean z2) {
            if (z2) {
                if (this.f20371e != null) {
                    d(16);
                }
                this.f20368b.setSystemBarsAppearance(16, 16);
                return;
            }
            if (this.f20371e != null) {
                e(16);
            }
            this.f20368b.setSystemBarsAppearance(0, 16);
        }

        public void c(boolean z2) {
            if (z2) {
                if (this.f20371e != null) {
                    d(8192);
                }
                this.f20368b.setSystemBarsAppearance(8, 8);
                return;
            }
            if (this.f20371e != null) {
                e(8192);
            }
            this.f20368b.setSystemBarsAppearance(0, 8);
        }

        public void d(int i2) {
            View decorView = this.f20371e.getDecorView();
            decorView.setSystemUiVisibility(i2 | decorView.getSystemUiVisibility());
        }

        public void e(int i2) {
            View decorView = this.f20371e.getDecorView();
            decorView.setSystemUiVisibility((~i2) & decorView.getSystemUiVisibility());
        }

        public Impl30(WindowInsetsController windowInsetsController, WindowInsetsControllerCompat windowInsetsControllerCompat, SoftwareKeyboardControllerCompat softwareKeyboardControllerCompat) {
            this.f20370d = new SimpleArrayMap();
            this.f20368b = windowInsetsController;
            this.f20367a = windowInsetsControllerCompat;
            this.f20369c = softwareKeyboardControllerCompat;
        }
    }
}
