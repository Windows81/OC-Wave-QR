package com.google.android.datatransport.runtime.time;

import java.util.concurrent.atomic.AtomicLong;

public class TestClock implements Clock {

    /* renamed from: a  reason: collision with root package name */
    public final AtomicLong f24305a;

    public long a() {
        return this.f24305a.get();
    }
}
