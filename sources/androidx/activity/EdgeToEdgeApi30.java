package androidx.activity;

import android.view.Window;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class EdgeToEdgeApi30 extends EdgeToEdgeApi29 {
    public void b(Window window) {
        Intrinsics.i(window, "window");
        window.getAttributes().layoutInDisplayCutoutMode = 3;
    }
}
