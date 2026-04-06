package androidx.compose.ui.platform;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class ViewLayer$Companion$OutlineProvider$1 extends ViewOutlineProvider {
    public void getOutline(View view, Outline outline) {
        Intrinsics.g(view, "null cannot be cast to non-null type androidx.compose.ui.platform.ViewLayer");
        Outline b2 = ((ViewLayer) view).D.b();
        Intrinsics.f(b2);
        outline.set(b2);
    }
}
