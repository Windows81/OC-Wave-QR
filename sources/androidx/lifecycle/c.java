package androidx.lifecycle;

import kotlinx.coroutines.channels.ProducerScope;

public final /* synthetic */ class c implements Observer {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ProducerScope f22021z;

    public /* synthetic */ c(ProducerScope producerScope) {
        this.f22021z = producerScope;
    }

    public final void a(Object obj) {
        FlowLiveDataConversions$asFlow$1.C(this.f22021z, obj);
    }
}
