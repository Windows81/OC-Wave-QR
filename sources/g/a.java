package g;

import android.os.Bundle;
import androidx.lifecycle.internal.SavedStateHandleImpl;
import androidx.savedstate.SavedStateRegistry;

public final /* synthetic */ class a implements SavedStateRegistry.SavedStateProvider {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SavedStateHandleImpl f34114a;

    public /* synthetic */ a(SavedStateHandleImpl savedStateHandleImpl) {
        this.f34114a = savedStateHandleImpl;
    }

    public final Bundle a() {
        return SavedStateHandleImpl.i(this.f34114a);
    }
}
