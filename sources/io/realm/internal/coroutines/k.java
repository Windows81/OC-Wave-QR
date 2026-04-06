package io.realm.internal.coroutines;

import io.realm.RealmChangeListener;
import io.realm.RealmList;
import kotlinx.coroutines.channels.ProducerScope;

public final /* synthetic */ class k implements RealmChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ProducerScope f40336a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ InternalFlowFactory f40337b;

    public /* synthetic */ k(ProducerScope producerScope, InternalFlowFactory internalFlowFactory) {
        this.f40336a = producerScope;
        this.f40337b = internalFlowFactory;
    }

    public final void a(Object obj) {
        InternalFlowFactory$from$5.C(this.f40336a, this.f40337b, (RealmList) obj);
    }
}
