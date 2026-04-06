package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.Context;
import com.google.android.datatransport.runtime.backends.BackendRegistry;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.scheduling.persistence.ClientHealthMetricsStore;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import com.google.android.datatransport.runtime.time.Clock;
import java.util.concurrent.Executor;
import javax.inject.Provider;

public final class Uploader_Factory implements Factory<Uploader> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f24191a;

    /* renamed from: b  reason: collision with root package name */
    public final Provider f24192b;

    /* renamed from: c  reason: collision with root package name */
    public final Provider f24193c;

    /* renamed from: d  reason: collision with root package name */
    public final Provider f24194d;

    /* renamed from: e  reason: collision with root package name */
    public final Provider f24195e;

    /* renamed from: f  reason: collision with root package name */
    public final Provider f24196f;

    /* renamed from: g  reason: collision with root package name */
    public final Provider f24197g;

    /* renamed from: h  reason: collision with root package name */
    public final Provider f24198h;

    /* renamed from: i  reason: collision with root package name */
    public final Provider f24199i;

    public Uploader_Factory(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8, Provider provider9) {
        this.f24191a = provider;
        this.f24192b = provider2;
        this.f24193c = provider3;
        this.f24194d = provider4;
        this.f24195e = provider5;
        this.f24196f = provider6;
        this.f24197g = provider7;
        this.f24198h = provider8;
        this.f24199i = provider9;
    }

    public static Uploader_Factory a(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8, Provider provider9) {
        return new Uploader_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9);
    }

    public static Uploader c(Context context, BackendRegistry backendRegistry, EventStore eventStore, WorkScheduler workScheduler, Executor executor, SynchronizationGuard synchronizationGuard, Clock clock, Clock clock2, ClientHealthMetricsStore clientHealthMetricsStore) {
        return new Uploader(context, backendRegistry, eventStore, workScheduler, executor, synchronizationGuard, clock, clock2, clientHealthMetricsStore);
    }

    /* renamed from: b */
    public Uploader get() {
        return c((Context) this.f24191a.get(), (BackendRegistry) this.f24192b.get(), (EventStore) this.f24193c.get(), (WorkScheduler) this.f24194d.get(), (Executor) this.f24195e.get(), (SynchronizationGuard) this.f24196f.get(), (Clock) this.f24197g.get(), (Clock) this.f24198h.get(), (ClientHealthMetricsStore) this.f24199i.get());
    }
}
