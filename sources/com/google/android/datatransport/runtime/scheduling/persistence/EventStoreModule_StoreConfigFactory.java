package com.google.android.datatransport.runtime.scheduling.persistence;

import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.Preconditions;

public final class EventStoreModule_StoreConfigFactory implements Factory<EventStoreConfig> {

    public static final class InstanceHolder {

        /* renamed from: a  reason: collision with root package name */
        public static final EventStoreModule_StoreConfigFactory f24256a = new EventStoreModule_StoreConfigFactory();
    }

    public static EventStoreModule_StoreConfigFactory a() {
        return InstanceHolder.f24256a;
    }

    public static EventStoreConfig c() {
        return (EventStoreConfig) Preconditions.d(EventStoreModule.d());
    }

    /* renamed from: b */
    public EventStoreConfig get() {
        return c();
    }
}
