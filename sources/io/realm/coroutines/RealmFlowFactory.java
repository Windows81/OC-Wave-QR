package io.realm.coroutines;

import io.realm.internal.coroutines.InternalFlowFactory;

public class RealmFlowFactory implements FlowFactory {

    /* renamed from: a  reason: collision with root package name */
    public final InternalFlowFactory f40110a;

    public RealmFlowFactory(Boolean bool) {
        this.f40110a = new InternalFlowFactory(bool.booleanValue());
    }
}
