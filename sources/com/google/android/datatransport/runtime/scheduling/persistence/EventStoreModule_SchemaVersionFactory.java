package com.google.android.datatransport.runtime.scheduling.persistence;

import com.google.android.datatransport.runtime.dagger.internal.Factory;

public final class EventStoreModule_SchemaVersionFactory implements Factory<Integer> {

    public static final class InstanceHolder {

        /* renamed from: a  reason: collision with root package name */
        public static final EventStoreModule_SchemaVersionFactory f24255a = new EventStoreModule_SchemaVersionFactory();
    }

    public static EventStoreModule_SchemaVersionFactory a() {
        return InstanceHolder.f24255a;
    }

    public static int c() {
        return EventStoreModule.c();
    }

    /* renamed from: b */
    public Integer get() {
        return Integer.valueOf(c());
    }
}
