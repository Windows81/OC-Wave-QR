package com.google.common.util.concurrent;

import java.util.concurrent.TimeUnit;

@ElementTypesAreNonnullByDefault
abstract class SmoothRateLimiter extends RateLimiter {

    /* renamed from: b  reason: collision with root package name */
    public double f29589b;

    public static final class SmoothBursty extends SmoothRateLimiter {
    }

    public static final class SmoothWarmingUp extends SmoothRateLimiter {
    }

    public final double a() {
        return ((double) TimeUnit.SECONDS.toMicros(1)) / this.f29589b;
    }
}
