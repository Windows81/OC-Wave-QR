package androidx.navigation;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;

public final /* synthetic */ class a implements LifecycleEventObserver {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ NavController f22447z;

    public /* synthetic */ a(NavController navController) {
        this.f22447z = navController;
    }

    public final void j(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        NavController.S(this.f22447z, lifecycleOwner, event);
    }
}
