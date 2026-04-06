package androidx.savedstate.serialization;

import android.os.Bundle;
import androidx.savedstate.SavedStateRegistry;

public final /* synthetic */ class b implements SavedStateRegistry.SavedStateProvider {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SavedStateRegistryOwnerDelegate f22896a;

    public /* synthetic */ b(SavedStateRegistryOwnerDelegate savedStateRegistryOwnerDelegate) {
        this.f22896a = savedStateRegistryOwnerDelegate;
    }

    public final Bundle a() {
        return SavedStateRegistryOwnerDelegate.f(this.f22896a);
    }
}
