package androidx.compose.ui.platform;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;

public final /* synthetic */ class L implements LifecycleEventObserver {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ AbstractComposeView f17806z;

    public /* synthetic */ L(AbstractComposeView abstractComposeView) {
        this.f17806z = abstractComposeView;
    }

    public final void j(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        ViewCompositionStrategy_androidKt.d(this.f17806z, lifecycleOwner, event);
    }
}
