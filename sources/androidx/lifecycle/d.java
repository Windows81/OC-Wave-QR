package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import kotlinx.coroutines.Job;

public final /* synthetic */ class d implements LifecycleEventObserver {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Job f22040A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ LifecycleController f22041z;

    public /* synthetic */ d(LifecycleController lifecycleController, Job job) {
        this.f22041z = lifecycleController;
        this.f22040A = job;
    }

    public final void j(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        LifecycleController.c(this.f22041z, this.f22040A, lifecycleOwner, event);
    }
}
