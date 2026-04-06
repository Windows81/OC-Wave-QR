package com.google.android.datatransport.runtime.scheduling;

import android.content.Context;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.Preconditions;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.time.Clock;
import javax.inject.Provider;

public final class SchedulingModule_WorkSchedulerFactory implements Factory<WorkScheduler> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f24157a;

    /* renamed from: b  reason: collision with root package name */
    public final Provider f24158b;

    /* renamed from: c  reason: collision with root package name */
    public final Provider f24159c;

    /* renamed from: d  reason: collision with root package name */
    public final Provider f24160d;

    public SchedulingModule_WorkSchedulerFactory(Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.f24157a = provider;
        this.f24158b = provider2;
        this.f24159c = provider3;
        this.f24160d = provider4;
    }

    public static SchedulingModule_WorkSchedulerFactory a(Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        return new SchedulingModule_WorkSchedulerFactory(provider, provider2, provider3, provider4);
    }

    public static WorkScheduler c(Context context, EventStore eventStore, SchedulerConfig schedulerConfig, Clock clock) {
        return (WorkScheduler) Preconditions.d(SchedulingModule.a(context, eventStore, schedulerConfig, clock));
    }

    /* renamed from: b */
    public WorkScheduler get() {
        return c((Context) this.f24157a.get(), (EventStore) this.f24158b.get(), (SchedulerConfig) this.f24159c.get(), (Clock) this.f24160d.get());
    }
}
