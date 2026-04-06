package com.google.android.datatransport.runtime.time;

import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.Preconditions;

public final class TimeModule_EventClockFactory implements Factory<Clock> {

    public static final class InstanceHolder {

        /* renamed from: a  reason: collision with root package name */
        public static final TimeModule_EventClockFactory f24306a = new TimeModule_EventClockFactory();
    }

    public static TimeModule_EventClockFactory a() {
        return InstanceHolder.f24306a;
    }

    public static Clock b() {
        return (Clock) Preconditions.d(TimeModule.a());
    }

    /* renamed from: c */
    public Clock get() {
        return b();
    }
}
