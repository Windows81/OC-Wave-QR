package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class SavedStateHandleAttacher implements LifecycleEventObserver {

    /* renamed from: z  reason: collision with root package name */
    public final SavedStateHandlesProvider f21965z;

    public SavedStateHandleAttacher(SavedStateHandlesProvider savedStateHandlesProvider) {
        Intrinsics.i(savedStateHandlesProvider, "provider");
        this.f21965z = savedStateHandlesProvider;
    }

    public void j(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        Intrinsics.i(lifecycleOwner, "source");
        Intrinsics.i(event, "event");
        if (event == Lifecycle.Event.ON_CREATE) {
            lifecycleOwner.a().d(this);
            this.f21965z.e();
            return;
        }
        throw new IllegalStateException(("Next event must be ON_CREATE, it was " + event).toString());
    }
}
