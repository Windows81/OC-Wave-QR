package com.google.android.gms.common.util;

import android.os.SystemClock;

public class DefaultClock implements Clock {

    /* renamed from: a  reason: collision with root package name */
    public static final DefaultClock f25112a = new DefaultClock();

    public static Clock d() {
        return f25112a;
    }

    public final long a() {
        return System.currentTimeMillis();
    }

    public final long b() {
        return System.nanoTime();
    }

    public final long c() {
        return SystemClock.elapsedRealtime();
    }
}
