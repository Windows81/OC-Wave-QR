package androidx.fragment.app;

import android.os.Bundle;
import androidx.savedstate.SavedStateRegistry;

public final /* synthetic */ class a implements SavedStateRegistry.SavedStateProvider {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ FragmentActivity f21791a;

    public /* synthetic */ a(FragmentActivity fragmentActivity) {
        this.f21791a = fragmentActivity;
    }

    public final Bundle a() {
        return this.f21791a.h0();
    }
}
