package androidx.core.view;

import android.os.Build;
import android.view.View;
import android.view.Window;

public final class WindowCompat {

    public static class Api16Impl {
        public static void a(Window window, boolean z2) {
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z2 ? systemUiVisibility & -1793 : systemUiVisibility | 1792);
        }
    }

    public static class Api28Impl {
    }

    public static class Api30Impl {
        public static void a(Window window, boolean z2) {
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z2 ? systemUiVisibility & -257 : systemUiVisibility | 256);
            window.setDecorFitsSystemWindows(z2);
        }
    }

    public static class Api35Impl {
        public static void a(Window window, boolean z2) {
            window.setDecorFitsSystemWindows(z2);
        }
    }

    public static WindowInsetsControllerCompat a(Window window, View view) {
        return new WindowInsetsControllerCompat(window, view);
    }

    public static void b(Window window, boolean z2) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 35) {
            Api35Impl.a(window, z2);
        } else if (i2 >= 30) {
            Api30Impl.a(window, z2);
        } else {
            Api16Impl.a(window, z2);
        }
    }
}
