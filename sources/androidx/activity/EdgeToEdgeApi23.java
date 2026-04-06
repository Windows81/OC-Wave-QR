package androidx.activity;

import android.view.View;
import android.view.Window;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class EdgeToEdgeApi23 extends EdgeToEdgeBase {
    public void a(SystemBarStyle systemBarStyle, SystemBarStyle systemBarStyle2, Window window, View view, boolean z2, boolean z3) {
        Intrinsics.i(systemBarStyle, "statusBarStyle");
        Intrinsics.i(systemBarStyle2, "navigationBarStyle");
        Intrinsics.i(window, "window");
        Intrinsics.i(view, "view");
        WindowCompat.b(window, false);
        window.setStatusBarColor(systemBarStyle.d(z2));
        window.setNavigationBarColor(systemBarStyle2.a());
        new WindowInsetsControllerCompat(window, view).c(!z2);
    }
}
