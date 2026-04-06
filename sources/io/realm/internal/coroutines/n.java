package io.realm.internal.coroutines;

import io.realm.DynamicRealmObject;
import io.realm.RealmChangeListener;
import kotlinx.coroutines.channels.ProducerScope;

public final /* synthetic */ class n implements RealmChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ProducerScope f40342a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ InternalFlowFactory f40343b;

    public /* synthetic */ n(ProducerScope producerScope, InternalFlowFactory internalFlowFactory) {
        this.f40342a = producerScope;
        this.f40343b = internalFlowFactory;
    }

    public final void a(Object obj) {
        InternalFlowFactory$from$8.C(this.f40342a, this.f40343b, (DynamicRealmObject) obj);
    }
}
