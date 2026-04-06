package androidx.lifecycle;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public interface DefaultLifecycleObserver extends LifecycleObserver {
    void C(LifecycleOwner lifecycleOwner) {
        Intrinsics.i(lifecycleOwner, "owner");
    }

    void D(LifecycleOwner lifecycleOwner) {
        Intrinsics.i(lifecycleOwner, "owner");
    }

    void N(LifecycleOwner lifecycleOwner) {
        Intrinsics.i(lifecycleOwner, "owner");
    }

    void c(LifecycleOwner lifecycleOwner) {
        Intrinsics.i(lifecycleOwner, "owner");
    }

    void g(LifecycleOwner lifecycleOwner) {
        Intrinsics.i(lifecycleOwner, "owner");
    }

    void k(LifecycleOwner lifecycleOwner) {
        Intrinsics.i(lifecycleOwner, "owner");
    }
}
