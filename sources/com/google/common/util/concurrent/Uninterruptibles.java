package com.google.common.util.concurrent;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

@ElementTypesAreNonnullByDefault
public final class Uninterruptibles {
    public static Object a(Future future) {
        Object obj;
        boolean z2 = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z2 = true;
            } catch (Throwable th) {
                if (z2) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public static Object b(Future future, long j2, TimeUnit timeUnit) {
        long nanos;
        Object obj;
        boolean z2 = false;
        try {
            nanos = timeUnit.toNanos(j2);
            while (true) {
                obj = future.get(nanos, TimeUnit.NANOSECONDS);
                break;
            }
            if (z2) {
                Thread.currentThread().interrupt();
            }
            return obj;
        } catch (InterruptedException unused) {
            z2 = true;
            nanos = (System.nanoTime() + nanos) - System.nanoTime();
        } catch (Throwable th) {
            if (z2) {
                Thread.currentThread().interrupt();
            }
            throw th;
        }
    }
}
