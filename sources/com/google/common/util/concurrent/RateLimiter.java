package com.google.common.util.concurrent;

import java.util.Locale;

@ElementTypesAreNonnullByDefault
public abstract class RateLimiter {

    /* renamed from: a  reason: collision with root package name */
    public volatile Object f29552a;

    public static abstract class SleepingStopwatch {

        /* renamed from: com.google.common.util.concurrent.RateLimiter$SleepingStopwatch$1  reason: invalid class name */
        class AnonymousClass1 extends SleepingStopwatch {
        }
    }

    public abstract double a();

    public final double b() {
        double a2;
        synchronized (c()) {
            a2 = a();
        }
        return a2;
    }

    public final Object c() {
        Object obj = this.f29552a;
        if (obj == null) {
            synchronized (this) {
                try {
                    obj = this.f29552a;
                    if (obj == null) {
                        obj = new Object();
                        this.f29552a = obj;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return obj;
    }

    public String toString() {
        return String.format(Locale.ROOT, "RateLimiter[stableRate=%3.1fqps]", new Object[]{Double.valueOf(b())});
    }
}
