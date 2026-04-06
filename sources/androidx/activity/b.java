package androidx.activity;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;

public final /* synthetic */ class b implements LifecycleEventObserver {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ComponentActivity f127z;

    public /* synthetic */ b(ComponentActivity componentActivity) {
        this.f127z = componentActivity;
    }

    public final void j(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        ComponentActivity.I(this.f127z, lifecycleOwner, event);
    }
}
