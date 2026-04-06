package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import kotlinx.coroutines.channels.ProducerScope;

public final /* synthetic */ class e implements LifecycleEventObserver {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ProducerScope f22042z;

    public /* synthetic */ e(ProducerScope producerScope) {
        this.f22042z = producerScope;
    }

    public final void j(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        LifecycleKt$eventFlow$1.D(this.f22042z, lifecycleOwner, event);
    }
}
