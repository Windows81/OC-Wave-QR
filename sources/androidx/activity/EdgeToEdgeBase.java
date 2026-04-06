package androidx.activity;

import android.view.View;
import android.view.Window;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
class EdgeToEdgeBase implements EdgeToEdgeImpl {
    public void a(SystemBarStyle systemBarStyle, SystemBarStyle systemBarStyle2, Window window, View view, boolean z2, boolean z3) {
        Intrinsics.i(systemBarStyle, "statusBarStyle");
        Intrinsics.i(systemBarStyle2, "navigationBarStyle");
        Intrinsics.i(window, "window");
        Intrinsics.i(view, "view");
    }

    public void b(Window window) {
        Intrinsics.i(window, "window");
    }
}
