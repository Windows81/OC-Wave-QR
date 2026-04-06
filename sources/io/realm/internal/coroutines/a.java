package io.realm.internal.coroutines;

import io.realm.OrderedCollectionChangeSet;
import io.realm.OrderedRealmCollectionChangeListener;
import io.realm.RealmResults;
import kotlinx.coroutines.channels.ProducerScope;

public final /* synthetic */ class a implements OrderedRealmCollectionChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ProducerScope f40314a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ InternalFlowFactory f40315b;

    public /* synthetic */ a(ProducerScope producerScope, InternalFlowFactory internalFlowFactory) {
        this.f40314a = producerScope;
        this.f40315b = internalFlowFactory;
    }

    public final void a(Object obj, OrderedCollectionChangeSet orderedCollectionChangeSet) {
        InternalFlowFactory$changesetFrom$1.C(this.f40314a, this.f40315b, (RealmResults) obj, orderedCollectionChangeSet);
    }
}
