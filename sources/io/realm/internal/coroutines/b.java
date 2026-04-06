package io.realm.internal.coroutines;

import io.realm.OrderedCollectionChangeSet;
import io.realm.OrderedRealmCollectionChangeListener;
import io.realm.RealmResults;
import kotlinx.coroutines.channels.ProducerScope;

public final /* synthetic */ class b implements OrderedRealmCollectionChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ProducerScope f40316a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ InternalFlowFactory f40317b;

    public /* synthetic */ b(ProducerScope producerScope, InternalFlowFactory internalFlowFactory) {
        this.f40316a = producerScope;
        this.f40317b = internalFlowFactory;
    }

    public final void a(Object obj, OrderedCollectionChangeSet orderedCollectionChangeSet) {
        InternalFlowFactory$changesetFrom$2.C(this.f40316a, this.f40317b, (RealmResults) obj, orderedCollectionChangeSet);
    }
}
