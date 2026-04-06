package io.realm.internal.coroutines;

import io.realm.OrderedCollectionChangeSet;
import io.realm.OrderedRealmCollectionChangeListener;
import io.realm.RealmList;
import kotlinx.coroutines.channels.ProducerScope;

public final /* synthetic */ class c implements OrderedRealmCollectionChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ProducerScope f40318a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ InternalFlowFactory f40319b;

    public /* synthetic */ c(ProducerScope producerScope, InternalFlowFactory internalFlowFactory) {
        this.f40318a = producerScope;
        this.f40319b = internalFlowFactory;
    }

    public final void a(Object obj, OrderedCollectionChangeSet orderedCollectionChangeSet) {
        InternalFlowFactory$changesetFrom$3.C(this.f40318a, this.f40319b, (RealmList) obj, orderedCollectionChangeSet);
    }
}
