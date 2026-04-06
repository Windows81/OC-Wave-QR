package com.google.android.datatransport.runtime.scheduling;

import com.google.android.datatransport.runtime.dagger.Module;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import com.google.android.datatransport.runtime.time.Clock;

@Module
public abstract class SchedulingConfigModule {
    public static SchedulerConfig a(Clock clock) {
        return SchedulerConfig.f(clock);
    }
}
