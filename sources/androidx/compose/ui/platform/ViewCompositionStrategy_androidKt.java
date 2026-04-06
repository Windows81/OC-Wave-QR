package androidx.compose.ui.platform;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

@Metadata
public final class ViewCompositionStrategy_androidKt {
    public static final Function0 c(AbstractComposeView abstractComposeView, Lifecycle lifecycle) {
        if (lifecycle.b().compareTo(Lifecycle.State.DESTROYED) > 0) {
            L l2 = new L(abstractComposeView);
            lifecycle.a(l2);
            return new ViewCompositionStrategy_androidKt$installForLifecycle$2(lifecycle, l2);
        }
        throw new IllegalStateException(("Cannot configure " + abstractComposeView + " to disposeComposition at Lifecycle ON_DESTROY: " + lifecycle + "is already destroyed").toString());
    }

    public static final void d(AbstractComposeView abstractComposeView, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            abstractComposeView.f();
        }
    }
}
