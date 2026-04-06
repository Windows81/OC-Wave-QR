package androidx.compose.material3.internal;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.functions.Function1;

/* renamed from: androidx.compose.material3.internal.g  reason: case insensitive filesystem */
public final /* synthetic */ class C0134g implements LifecycleEventObserver {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function1 f12437z;

    public /* synthetic */ C0134g(Function1 function1) {
        this.f12437z = function1;
    }

    public final void j(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        AccessibilityServiceStateProvider_androidKt.j(this.f12437z, lifecycleOwner, event);
    }
}
