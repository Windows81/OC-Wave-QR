package androidx.activity;

import android.os.Bundle;
import androidx.savedstate.SavedStateRegistry;

public final /* synthetic */ class d implements SavedStateRegistry.SavedStateProvider {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ComponentActivity f199a;

    public /* synthetic */ d(ComponentActivity componentActivity) {
        this.f199a = componentActivity;
    }

    public final Bundle a() {
        return ComponentActivity.K(this.f199a);
    }
}
