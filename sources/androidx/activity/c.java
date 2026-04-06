package androidx.activity;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;

public final /* synthetic */ class c implements LifecycleEventObserver {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ComponentActivity f128z;

    public /* synthetic */ c(ComponentActivity componentActivity) {
        this.f128z = componentActivity;
    }

    public final void j(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        ComponentActivity.J(this.f128z, lifecycleOwner, event);
    }
}
