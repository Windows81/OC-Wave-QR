package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import kotlin.Metadata;

@Metadata
public interface LifecycleEventObserver extends LifecycleObserver {
    void j(LifecycleOwner lifecycleOwner, Lifecycle.Event event);
}
