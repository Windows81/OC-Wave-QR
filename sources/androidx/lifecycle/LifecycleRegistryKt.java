package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class LifecycleRegistryKt {
    public static final void a(LifecycleOwner lifecycleOwner, Lifecycle.State state, Lifecycle.State state2) {
        Intrinsics.i(state, "current");
        Intrinsics.i(state2, "next");
        if (state == Lifecycle.State.INITIALIZED && state2 == Lifecycle.State.DESTROYED) {
            throw new IllegalStateException(("State must be at least '" + Lifecycle.State.CREATED + "' to be moved to '" + state2 + "' in component " + lifecycleOwner).toString());
        }
        Lifecycle.State state3 = Lifecycle.State.DESTROYED;
        if (state == state3 && state != state2) {
            throw new IllegalStateException(("State is '" + state3 + "' and cannot be moved to `" + state2 + "` in component " + lifecycleOwner).toString());
        }
    }
}
