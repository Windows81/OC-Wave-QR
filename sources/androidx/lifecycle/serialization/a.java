package androidx.lifecycle.serialization;

import android.os.Bundle;
import androidx.savedstate.SavedStateRegistry;

public final /* synthetic */ class a implements SavedStateRegistry.SavedStateProvider {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SavedStateHandleDelegate f22061a;

    public /* synthetic */ a(SavedStateHandleDelegate savedStateHandleDelegate) {
        this.f22061a = savedStateHandleDelegate;
    }

    public final Bundle a() {
        return SavedStateHandleDelegate.f(this.f22061a);
    }
}
