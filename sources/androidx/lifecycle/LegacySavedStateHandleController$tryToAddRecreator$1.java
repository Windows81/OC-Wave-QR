package androidx.lifecycle;

import androidx.lifecycle.LegacySavedStateHandleController;
import androidx.lifecycle.Lifecycle;
import androidx.savedstate.SavedStateRegistry;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class LegacySavedStateHandleController$tryToAddRecreator$1 implements LifecycleEventObserver {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ SavedStateRegistry f21893A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Lifecycle f21894z;

    public LegacySavedStateHandleController$tryToAddRecreator$1(Lifecycle lifecycle, SavedStateRegistry savedStateRegistry) {
        this.f21894z = lifecycle;
        this.f21893A = savedStateRegistry;
    }

    public void j(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        Intrinsics.i(lifecycleOwner, "source");
        Intrinsics.i(event, "event");
        if (event == Lifecycle.Event.ON_START) {
            this.f21894z.d(this);
            this.f21893A.d(LegacySavedStateHandleController.OnRecreation.class);
        }
    }
}
