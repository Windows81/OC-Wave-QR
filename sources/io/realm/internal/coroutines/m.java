package io.realm.internal.coroutines;

import io.realm.RealmChangeListener;
import io.realm.RealmModel;
import kotlinx.coroutines.channels.ProducerScope;

public final /* synthetic */ class m implements RealmChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ProducerScope f40340a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ InternalFlowFactory f40341b;

    public /* synthetic */ m(ProducerScope producerScope, InternalFlowFactory internalFlowFactory) {
        this.f40340a = producerScope;
        this.f40341b = internalFlowFactory;
    }

    public final void a(Object obj) {
        InternalFlowFactory$from$7.C(this.f40340a, this.f40341b, (RealmModel) obj);
    }
}
