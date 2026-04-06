package androidx.activity;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;

public final /* synthetic */ class f implements LifecycleEventObserver {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ ComponentActivity f201A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ OnBackPressedDispatcher f202z;

    public /* synthetic */ f(OnBackPressedDispatcher onBackPressedDispatcher, ComponentActivity componentActivity) {
        this.f202z = onBackPressedDispatcher;
        this.f201A = componentActivity;
    }

    public final void j(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        ComponentActivity.R(this.f202z, this.f201A, lifecycleOwner, event);
    }
}
