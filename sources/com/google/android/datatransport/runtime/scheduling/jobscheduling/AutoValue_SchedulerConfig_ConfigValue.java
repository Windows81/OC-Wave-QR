package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import java.util.Set;

final class AutoValue_SchedulerConfig_ConfigValue extends SchedulerConfig.ConfigValue {

    /* renamed from: a  reason: collision with root package name */
    public final long f24168a;

    /* renamed from: b  reason: collision with root package name */
    public final long f24169b;

    /* renamed from: c  reason: collision with root package name */
    public final Set f24170c;

    public static final class Builder extends SchedulerConfig.ConfigValue.Builder {

        /* renamed from: a  reason: collision with root package name */
        public Long f24171a;

        /* renamed from: b  reason: collision with root package name */
        public Long f24172b;

        /* renamed from: c  reason: collision with root package name */
        public Set f24173c;

        public SchedulerConfig.ConfigValue a() {
            String str = "";
            if (this.f24171a == null) {
                str = str + " delta";
            }
            if (this.f24172b == null) {
                str = str + " maxAllowedDelay";
            }
            if (this.f24173c == null) {
                str = str + " flags";
            }
            if (str.isEmpty()) {
                return new AutoValue_SchedulerConfig_ConfigValue(this.f24171a.longValue(), this.f24172b.longValue(), this.f24173c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public SchedulerConfig.ConfigValue.Builder b(long j2) {
            this.f24171a = Long.valueOf(j2);
            return this;
        }

        public SchedulerConfig.ConfigValue.Builder c(Set set) {
            if (set != null) {
                this.f24173c = set;
                return this;
            }
            throw new NullPointerException("Null flags");
        }

        public SchedulerConfig.ConfigValue.Builder d(long j2) {
            this.f24172b = Long.valueOf(j2);
            return this;
        }
    }

    public long b() {
        return this.f24168a;
    }

    public Set c() {
        return this.f24170c;
    }

    public long d() {
        return this.f24169b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SchedulerConfig.ConfigValue)) {
            return false;
        }
        SchedulerConfig.ConfigValue configValue = (SchedulerConfig.ConfigValue) obj;
        return this.f24168a == configValue.b() && this.f24169b == configValue.d() && this.f24170c.equals(configValue.c());
    }

    public int hashCode() {
        long j2 = this.f24168a;
        long j3 = this.f24169b;
        return ((((((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003) ^ this.f24170c.hashCode();
    }

    public String toString() {
        return "ConfigValue{delta=" + this.f24168a + ", maxAllowedDelay=" + this.f24169b + ", flags=" + this.f24170c + "}";
    }

    public AutoValue_SchedulerConfig_ConfigValue(long j2, long j3, Set set) {
        this.f24168a = j2;
        this.f24169b = j3;
        this.f24170c = set;
    }
}
