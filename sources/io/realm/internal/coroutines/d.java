package io.realm.internal.coroutines;

import io.realm.OrderedCollectionChangeSet;
import io.realm.OrderedRealmCollectionChangeListener;
import io.realm.RealmList;
import kotlinx.coroutines.channels.ProducerScope;

public final /* synthetic */ class d implements OrderedRealmCollectionChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ProducerScope f40320a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ InternalFlowFactory f40321b;

    public /* synthetic */ d(ProducerScope producerScope, InternalFlowFactory internalFlowFactory) {
        this.f40320a = producerScope;
        this.f40321b = internalFlowFactory;
    }

    public final void a(Object obj, OrderedCollectionChangeSet orderedCollectionChangeSet) {
        InternalFlowFactory$changesetFrom$4.C(this.f40320a, this.f40321b, (RealmList) obj, orderedCollectionChangeSet);
    }
}
