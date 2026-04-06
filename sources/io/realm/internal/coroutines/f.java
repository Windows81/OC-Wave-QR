package io.realm.internal.coroutines;

import io.realm.DynamicRealmObject;
import io.realm.ObjectChangeSet;
import io.realm.RealmModel;
import io.realm.RealmObjectChangeListener;
import kotlinx.coroutines.channels.ProducerScope;

public final /* synthetic */ class f implements RealmObjectChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ProducerScope f40324a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ InternalFlowFactory f40325b;

    public /* synthetic */ f(ProducerScope producerScope, InternalFlowFactory internalFlowFactory) {
        this.f40324a = producerScope;
        this.f40325b = internalFlowFactory;
    }

    public final void a(RealmModel realmModel, ObjectChangeSet objectChangeSet) {
        InternalFlowFactory$changesetFrom$6.C(this.f40324a, this.f40325b, (DynamicRealmObject) realmModel, objectChangeSet);
    }
}
