package com.google.android.datatransport.runtime.scheduling;

import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.Preconditions;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import com.google.android.datatransport.runtime.time.Clock;
import javax.inject.Provider;

public final class SchedulingConfigModule_ConfigFactory implements Factory<SchedulerConfig> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f24156a;

    public SchedulingConfigModule_ConfigFactory(Provider provider) {
        this.f24156a = provider;
    }

    public static SchedulerConfig a(Clock clock) {
        return (SchedulerConfig) Preconditions.d(SchedulingConfigModule.a(clock));
    }

    public static SchedulingConfigModule_ConfigFactory b(Provider provider) {
        return new SchedulingConfigModule_ConfigFactory(provider);
    }

    /* renamed from: c */
    public SchedulerConfig get() {
        return a((Clock) this.f24156a.get());
    }
}
