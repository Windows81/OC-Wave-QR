package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobInfo;
import com.google.android.datatransport.Priority;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AutoValue_SchedulerConfig_ConfigValue;
import com.google.android.datatransport.runtime.time.Clock;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public abstract class SchedulerConfig {

    public static class Builder {

        /* renamed from: a  reason: collision with root package name */
        public Clock f24177a;

        /* renamed from: b  reason: collision with root package name */
        public Map f24178b = new HashMap();

        public Builder a(Priority priority, ConfigValue configValue) {
            this.f24178b.put(priority, configValue);
            return this;
        }

        public SchedulerConfig b() {
            if (this.f24177a == null) {
                throw new NullPointerException("missing required property: clock");
            } else if (this.f24178b.keySet().size() >= Priority.values().length) {
                Map map = this.f24178b;
                this.f24178b = new HashMap();
                return SchedulerConfig.d(this.f24177a, map);
            } else {
                throw new IllegalStateException("Not all priorities have been configured");
            }
        }

        public Builder c(Clock clock) {
            this.f24177a = clock;
            return this;
        }
    }

    public static abstract class ConfigValue {

        public static abstract class Builder {
            public abstract ConfigValue a();

            public abstract Builder b(long j2);

            public abstract Builder c(Set set);

            public abstract Builder d(long j2);
        }

        public static Builder a() {
            return new AutoValue_SchedulerConfig_ConfigValue.Builder().c(Collections.emptySet());
        }

        public abstract long b();

        public abstract Set c();

        public abstract long d();
    }

    public enum Flag {
        NETWORK_UNMETERED,
        DEVICE_IDLE,
        DEVICE_CHARGING
    }

    public static Builder b() {
        return new Builder();
    }

    public static SchedulerConfig d(Clock clock, Map map) {
        return new AutoValue_SchedulerConfig(clock, map);
    }

    public static SchedulerConfig f(Clock clock) {
        return b().a(Priority.DEFAULT, ConfigValue.a().b(30000).d(86400000).a()).a(Priority.HIGHEST, ConfigValue.a().b(1000).d(86400000).a()).a(Priority.VERY_LOW, ConfigValue.a().b(86400000).d(86400000).c(i(Flag.DEVICE_IDLE)).a()).c(clock).b();
    }

    public static Set i(Object... objArr) {
        return Collections.unmodifiableSet(new HashSet(Arrays.asList(objArr)));
    }

    public final long a(int i2, long j2) {
        int i3 = i2 - 1;
        return (long) (Math.pow(3.0d, (double) i3) * ((double) j2) * Math.max(1.0d, Math.log(10000.0d) / Math.log((double) ((j2 > 1 ? j2 : 2) * ((long) i3)))));
    }

    public JobInfo.Builder c(JobInfo.Builder builder, Priority priority, long j2, int i2) {
        builder.setMinimumLatency(g(priority, j2, i2));
        j(builder, ((ConfigValue) h().get(priority)).c());
        return builder;
    }

    public abstract Clock e();

    public long g(Priority priority, long j2, int i2) {
        long a2 = j2 - e().a();
        ConfigValue configValue = (ConfigValue) h().get(priority);
        return Math.min(Math.max(a(i2, configValue.b()), a2), configValue.d());
    }

    public abstract Map h();

    public final void j(JobInfo.Builder builder, Set set) {
        if (set.contains(Flag.NETWORK_UNMETERED)) {
            builder.setRequiredNetworkType(2);
        } else {
            builder.setRequiredNetworkType(1);
        }
        if (set.contains(Flag.DEVICE_CHARGING)) {
            builder.setRequiresCharging(true);
        }
        if (set.contains(Flag.DEVICE_IDLE)) {
            builder.setRequiresDeviceIdle(true);
        }
    }
}
