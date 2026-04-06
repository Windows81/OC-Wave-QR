package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import androidx.savedstate.SavedStateRegistry;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class SavedStateHandleController implements LifecycleEventObserver, AutoCloseable {

    /* renamed from: A  reason: collision with root package name */
    public final SavedStateHandle f21966A;

    /* renamed from: B  reason: collision with root package name */
    public boolean f21967B;

    /* renamed from: z  reason: collision with root package name */
    public final String f21968z;

    public SavedStateHandleController(String str, SavedStateHandle savedStateHandle) {
        Intrinsics.i(str, "key");
        Intrinsics.i(savedStateHandle, "handle");
        this.f21968z = str;
        this.f21966A = savedStateHandle;
    }

    public final void b(SavedStateRegistry savedStateRegistry, Lifecycle lifecycle) {
        Intrinsics.i(savedStateRegistry, "registry");
        Intrinsics.i(lifecycle, "lifecycle");
        if (!this.f21967B) {
            this.f21967B = true;
            lifecycle.a(this);
            savedStateRegistry.c(this.f21968z, this.f21966A.e());
            return;
        }
        throw new IllegalStateException("Already attached to lifecycleOwner");
    }

    public void close() {
    }

    public final SavedStateHandle d() {
        return this.f21966A;
    }

    public final boolean f() {
        return this.f21967B;
    }

    public void j(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        Intrinsics.i(lifecycleOwner, "source");
        Intrinsics.i(event, "event");
        if (event == Lifecycle.Event.ON_DESTROY) {
            this.f21967B = false;
            lifecycleOwner.a().d(this);
        }
    }
}
