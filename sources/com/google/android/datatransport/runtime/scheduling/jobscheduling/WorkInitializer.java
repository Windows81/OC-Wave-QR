package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import java.util.concurrent.Executor;

public class WorkInitializer {

    /* renamed from: a  reason: collision with root package name */
    public final Executor f24200a;

    /* renamed from: b  reason: collision with root package name */
    public final EventStore f24201b;

    /* renamed from: c  reason: collision with root package name */
    public final WorkScheduler f24202c;

    /* renamed from: d  reason: collision with root package name */
    public final SynchronizationGuard f24203d;

    public WorkInitializer(Executor executor, EventStore eventStore, WorkScheduler workScheduler, SynchronizationGuard synchronizationGuard) {
        this.f24200a = executor;
        this.f24201b = eventStore;
        this.f24202c = workScheduler;
        this.f24203d = synchronizationGuard;
    }

    public void c() {
        this.f24200a.execute(new n(this));
    }

    public final /* synthetic */ Object d() {
        for (TransportContext a2 : this.f24201b.p0()) {
            this.f24202c.a(a2, 1);
        }
        return null;
    }

    public final /* synthetic */ void e() {
        this.f24203d.b(new o(this));
    }
}
