package io.realm.internal.coroutines;

import io.realm.DynamicRealm;
import io.realm.RealmChangeListener;
import kotlinx.coroutines.channels.ProducerScope;

public final /* synthetic */ class h implements RealmChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ProducerScope f40329a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ InternalFlowFactory f40330b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ DynamicRealm f40331c;

    public /* synthetic */ h(ProducerScope producerScope, InternalFlowFactory internalFlowFactory, DynamicRealm dynamicRealm) {
        this.f40329a = producerScope;
        this.f40330b = internalFlowFactory;
        this.f40331c = dynamicRealm;
    }

    public final void a(Object obj) {
        InternalFlowFactory$from$2.C(this.f40329a, this.f40330b, this.f40331c, (DynamicRealm) obj);
    }
}
