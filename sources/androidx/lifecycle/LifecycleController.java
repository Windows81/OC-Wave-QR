package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;

@Metadata
public final class LifecycleController {

    /* renamed from: a  reason: collision with root package name */
    public final Lifecycle f21901a;

    /* renamed from: b  reason: collision with root package name */
    public final Lifecycle.State f21902b;

    /* renamed from: c  reason: collision with root package name */
    public final DispatchQueue f21903c;

    /* renamed from: d  reason: collision with root package name */
    public final LifecycleEventObserver f21904d;

    public LifecycleController(Lifecycle lifecycle, Lifecycle.State state, DispatchQueue dispatchQueue, Job job) {
        Intrinsics.i(lifecycle, "lifecycle");
        Intrinsics.i(state, "minState");
        Intrinsics.i(dispatchQueue, "dispatchQueue");
        Intrinsics.i(job, "parentJob");
        this.f21901a = lifecycle;
        this.f21902b = state;
        this.f21903c = dispatchQueue;
        d dVar = new d(this, job);
        this.f21904d = dVar;
        if (lifecycle.b() == Lifecycle.State.DESTROYED) {
            Job.DefaultImpls.a(job, (CancellationException) null, 1, (Object) null);
            b();
            return;
        }
        lifecycle.a(dVar);
    }

    public static final void c(LifecycleController lifecycleController, Job job, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        Intrinsics.i(lifecycleOwner, "source");
        Intrinsics.i(event, "<unused var>");
        if (lifecycleOwner.a().b() == Lifecycle.State.DESTROYED) {
            Job.DefaultImpls.a(job, (CancellationException) null, 1, (Object) null);
            lifecycleController.b();
        } else if (lifecycleOwner.a().b().compareTo(lifecycleController.f21902b) < 0) {
            lifecycleController.f21903c.h();
        } else {
            lifecycleController.f21903c.i();
        }
    }

    public final void b() {
        this.f21901a.d(this.f21904d);
        this.f21903c.g();
    }
}
