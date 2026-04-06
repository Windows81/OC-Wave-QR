package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.time.Clock;
import java.util.Map;

final class AutoValue_SchedulerConfig extends SchedulerConfig {

    /* renamed from: a  reason: collision with root package name */
    public final Clock f24166a;

    /* renamed from: b  reason: collision with root package name */
    public final Map f24167b;

    public AutoValue_SchedulerConfig(Clock clock, Map map) {
        if (clock != null) {
            this.f24166a = clock;
            if (map != null) {
                this.f24167b = map;
                return;
            }
            throw new NullPointerException("Null values");
        }
        throw new NullPointerException("Null clock");
    }

    public Clock e() {
        return this.f24166a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SchedulerConfig)) {
            return false;
        }
        SchedulerConfig schedulerConfig = (SchedulerConfig) obj;
        return this.f24166a.equals(schedulerConfig.e()) && this.f24167b.equals(schedulerConfig.h());
    }

    public Map h() {
        return this.f24167b;
    }

    public int hashCode() {
        return ((this.f24166a.hashCode() ^ 1000003) * 1000003) ^ this.f24167b.hashCode();
    }

    public String toString() {
        return "SchedulerConfig{clock=" + this.f24166a + ", values=" + this.f24167b + "}";
    }
}
