package com.google.android.datatransport.runtime.scheduling.persistence;

import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.time.Clock;
import javax.inject.Provider;

public final class SQLiteEventStore_Factory implements Factory<SQLiteEventStore> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f24262a;

    /* renamed from: b  reason: collision with root package name */
    public final Provider f24263b;

    /* renamed from: c  reason: collision with root package name */
    public final Provider f24264c;

    /* renamed from: d  reason: collision with root package name */
    public final Provider f24265d;

    /* renamed from: e  reason: collision with root package name */
    public final Provider f24266e;

    public SQLiteEventStore_Factory(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        this.f24262a = provider;
        this.f24263b = provider2;
        this.f24264c = provider3;
        this.f24265d = provider4;
        this.f24266e = provider5;
    }

    public static SQLiteEventStore_Factory a(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        return new SQLiteEventStore_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static SQLiteEventStore c(Clock clock, Clock clock2, Object obj, Object obj2, Provider provider) {
        return new SQLiteEventStore(clock, clock2, (EventStoreConfig) obj, (SchemaManager) obj2, provider);
    }

    /* renamed from: b */
    public SQLiteEventStore get() {
        return c((Clock) this.f24262a.get(), (Clock) this.f24263b.get(), this.f24264c.get(), this.f24265d.get(), this.f24266e);
    }
}
