package androidx.activity;

import android.view.Window;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
class EdgeToEdgeApi28 extends EdgeToEdgeApi26 {
    public void b(Window window) {
        Intrinsics.i(window, "window");
        window.getAttributes().layoutInDisplayCutoutMode = 1;
    }
}
