package io.realm.internal.coroutines;

import io.realm.RealmChangeListener;
import io.realm.RealmList;
import kotlinx.coroutines.channels.ProducerScope;

public final /* synthetic */ class l implements RealmChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ProducerScope f40338a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ InternalFlowFactory f40339b;

    public /* synthetic */ l(ProducerScope producerScope, InternalFlowFactory internalFlowFactory) {
        this.f40338a = producerScope;
        this.f40339b = internalFlowFactory;
    }

    public final void a(Object obj) {
        InternalFlowFactory$from$6.C(this.f40338a, this.f40339b, (RealmList) obj);
    }
}
