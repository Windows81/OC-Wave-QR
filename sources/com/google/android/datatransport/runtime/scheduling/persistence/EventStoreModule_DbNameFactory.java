package com.google.android.datatransport.runtime.scheduling.persistence;

import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.Preconditions;

public final class EventStoreModule_DbNameFactory implements Factory<String> {

    public static final class InstanceHolder {

        /* renamed from: a  reason: collision with root package name */
        public static final EventStoreModule_DbNameFactory f24253a = new EventStoreModule_DbNameFactory();
    }

    public static EventStoreModule_DbNameFactory a() {
        return InstanceHolder.f24253a;
    }

    public static String b() {
        return (String) Preconditions.d(EventStoreModule.a());
    }

    /* renamed from: c */
    public String get() {
        return b();
    }
}
