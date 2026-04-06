package io.realm.internal.coroutines;

import io.realm.Realm;
import io.realm.RealmChangeListener;
import kotlinx.coroutines.channels.ProducerScope;

public final /* synthetic */ class g implements RealmChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ProducerScope f40326a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ InternalFlowFactory f40327b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Realm f40328c;

    public /* synthetic */ g(ProducerScope producerScope, InternalFlowFactory internalFlowFactory, Realm realm) {
        this.f40326a = producerScope;
        this.f40327b = internalFlowFactory;
        this.f40328c = realm;
    }

    public final void a(Object obj) {
        InternalFlowFactory$from$1.C(this.f40326a, this.f40327b, this.f40328c, (Realm) obj);
    }
}
