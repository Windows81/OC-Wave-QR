package com.google.android.datatransport.runtime.time;

import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.Preconditions;

public final class TimeModule_UptimeClockFactory implements Factory<Clock> {

    public static final class InstanceHolder {

        /* renamed from: a  reason: collision with root package name */
        public static final TimeModule_UptimeClockFactory f24307a = new TimeModule_UptimeClockFactory();
    }

    public static TimeModule_UptimeClockFactory a() {
        return InstanceHolder.f24307a;
    }

    public static Clock c() {
        return (Clock) Preconditions.d(TimeModule.b());
    }

    /* renamed from: b */
    public Clock get() {
        return c();
    }
}
