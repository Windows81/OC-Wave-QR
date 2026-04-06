package androidx.savedstate.internal;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;

public final /* synthetic */ class a implements LifecycleEventObserver {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ SavedStateRegistryImpl f22847z;

    public /* synthetic */ a(SavedStateRegistryImpl savedStateRegistryImpl) {
        this.f22847z = savedStateRegistryImpl;
    }

    public final void j(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        SavedStateRegistryImpl.g(this.f22847z, lifecycleOwner, event);
    }
}
