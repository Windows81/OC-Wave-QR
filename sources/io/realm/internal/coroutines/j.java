package io.realm.internal.coroutines;

import io.realm.RealmChangeListener;
import io.realm.RealmResults;
import kotlinx.coroutines.channels.ProducerScope;

public final /* synthetic */ class j implements RealmChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ProducerScope f40334a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ InternalFlowFactory f40335b;

    public /* synthetic */ j(ProducerScope producerScope, InternalFlowFactory internalFlowFactory) {
        this.f40334a = producerScope;
        this.f40335b = internalFlowFactory;
    }

    public final void a(Object obj) {
        InternalFlowFactory$from$4.C(this.f40334a, this.f40335b, (RealmResults) obj);
    }
}
