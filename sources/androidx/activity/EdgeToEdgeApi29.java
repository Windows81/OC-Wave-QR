package androidx.activity;

import android.view.View;
import android.view.Window;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
class EdgeToEdgeApi29 extends EdgeToEdgeApi28 {
    public void a(SystemBarStyle systemBarStyle, SystemBarStyle systemBarStyle2, Window window, View view, boolean z2, boolean z3) {
        Intrinsics.i(systemBarStyle, "statusBarStyle");
        Intrinsics.i(systemBarStyle2, "navigationBarStyle");
        Intrinsics.i(window, "window");
        Intrinsics.i(view, "view");
        boolean z4 = false;
        WindowCompat.b(window, false);
        window.setStatusBarColor(systemBarStyle.e(z2));
        window.setNavigationBarColor(systemBarStyle2.e(z3));
        window.setStatusBarContrastEnforced(false);
        if (systemBarStyle2.c() == 0) {
            z4 = true;
        }
        window.setNavigationBarContrastEnforced(z4);
        WindowInsetsControllerCompat windowInsetsControllerCompat = new WindowInsetsControllerCompat(window, view);
        windowInsetsControllerCompat.c(!z2);
        windowInsetsControllerCompat.b(true ^ z3);
    }
}
