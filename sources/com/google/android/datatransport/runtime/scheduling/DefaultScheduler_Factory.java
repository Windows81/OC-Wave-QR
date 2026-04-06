package com.google.android.datatransport.runtime.scheduling;

import com.google.android.datatransport.runtime.backends.BackendRegistry;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import java.util.concurrent.Executor;
import javax.inject.Provider;

public final class DefaultScheduler_Factory implements Factory<DefaultScheduler> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f24151a;

    /* renamed from: b  reason: collision with root package name */
    public final Provider f24152b;

    /* renamed from: c  reason: collision with root package name */
    public final Provider f24153c;

    /* renamed from: d  reason: collision with root package name */
    public final Provider f24154d;

    /* renamed from: e  reason: collision with root package name */
    public final Provider f24155e;

    public DefaultScheduler_Factory(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        this.f24151a = provider;
        this.f24152b = provider2;
        this.f24153c = provider3;
        this.f24154d = provider4;
        this.f24155e = provider5;
    }

    public static DefaultScheduler_Factory a(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        return new DefaultScheduler_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static DefaultScheduler c(Executor executor, BackendRegistry backendRegistry, WorkScheduler workScheduler, EventStore eventStore, SynchronizationGuard synchronizationGuard) {
        return new DefaultScheduler(executor, backendRegistry, workScheduler, eventStore, synchronizationGuard);
    }

    /* renamed from: b */
    public DefaultScheduler get() {
        return c((Executor) this.f24151a.get(), (BackendRegistry) this.f24152b.get(), (WorkScheduler) this.f24153c.get(), (EventStore) this.f24154d.get(), (SynchronizationGuard) this.f24155e.get());
    }
}
