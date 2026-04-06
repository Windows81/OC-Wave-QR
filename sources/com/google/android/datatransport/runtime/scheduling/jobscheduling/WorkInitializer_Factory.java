package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import java.util.concurrent.Executor;
import javax.inject.Provider;

public final class WorkInitializer_Factory implements Factory<WorkInitializer> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f24204a;

    /* renamed from: b  reason: collision with root package name */
    public final Provider f24205b;

    /* renamed from: c  reason: collision with root package name */
    public final Provider f24206c;

    /* renamed from: d  reason: collision with root package name */
    public final Provider f24207d;

    public WorkInitializer_Factory(Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.f24204a = provider;
        this.f24205b = provider2;
        this.f24206c = provider3;
        this.f24207d = provider4;
    }

    public static WorkInitializer_Factory a(Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        return new WorkInitializer_Factory(provider, provider2, provider3, provider4);
    }

    public static WorkInitializer c(Executor executor, EventStore eventStore, WorkScheduler workScheduler, SynchronizationGuard synchronizationGuard) {
        return new WorkInitializer(executor, eventStore, workScheduler, synchronizationGuard);
    }

    /* renamed from: b */
    public WorkInitializer get() {
        return c((Executor) this.f24204a.get(), (EventStore) this.f24205b.get(), (WorkScheduler) this.f24206c.get(), (SynchronizationGuard) this.f24207d.get());
    }
}
