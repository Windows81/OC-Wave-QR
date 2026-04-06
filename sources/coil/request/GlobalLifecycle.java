package coil.request;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import kotlin.Metadata;

@Metadata
public final class GlobalLifecycle extends Lifecycle {

    /* renamed from: b  reason: collision with root package name */
    public static final GlobalLifecycle f23575b = new GlobalLifecycle();

    /* renamed from: c  reason: collision with root package name */
    public static final GlobalLifecycle$owner$1 f23576c = new GlobalLifecycle$owner$1();

    public void a(LifecycleObserver lifecycleObserver) {
        if (lifecycleObserver instanceof DefaultLifecycleObserver) {
            DefaultLifecycleObserver defaultLifecycleObserver = (DefaultLifecycleObserver) lifecycleObserver;
            GlobalLifecycle$owner$1 globalLifecycle$owner$1 = f23576c;
            defaultLifecycleObserver.g(globalLifecycle$owner$1);
            defaultLifecycleObserver.N(globalLifecycle$owner$1);
            defaultLifecycleObserver.c(globalLifecycle$owner$1);
            return;
        }
        throw new IllegalArgumentException((lifecycleObserver + " must implement androidx.lifecycle.DefaultLifecycleObserver.").toString());
    }

    public Lifecycle.State b() {
        return Lifecycle.State.RESUMED;
    }

    public void d(LifecycleObserver lifecycleObserver) {
    }

    public String toString() {
        return "coil.request.GlobalLifecycle";
    }
}
