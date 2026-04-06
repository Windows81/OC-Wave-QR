package io.realm.internal.coroutines;

import io.realm.RealmChangeListener;
import io.realm.RealmResults;
import kotlinx.coroutines.channels.ProducerScope;

public final /* synthetic */ class i implements RealmChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ProducerScope f40332a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ InternalFlowFactory f40333b;

    public /* synthetic */ i(ProducerScope producerScope, InternalFlowFactory internalFlowFactory) {
        this.f40332a = producerScope;
        this.f40333b = internalFlowFactory;
    }

    public final void a(Object obj) {
        InternalFlowFactory$from$3.C(this.f40332a, this.f40333b, (RealmResults) obj);
    }
}
