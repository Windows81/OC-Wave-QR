package io.realm.internal.coroutines;

import io.realm.ObjectChangeSet;
import io.realm.RealmModel;
import io.realm.RealmObjectChangeListener;
import kotlinx.coroutines.channels.ProducerScope;

public final /* synthetic */ class e implements RealmObjectChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ProducerScope f40322a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ InternalFlowFactory f40323b;

    public /* synthetic */ e(ProducerScope producerScope, InternalFlowFactory internalFlowFactory) {
        this.f40322a = producerScope;
        this.f40323b = internalFlowFactory;
    }

    public final void a(RealmModel realmModel, ObjectChangeSet objectChangeSet) {
        InternalFlowFactory$changesetFrom$5.C(this.f40322a, this.f40323b, realmModel, objectChangeSet);
    }
}
