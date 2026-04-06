package com.google.common.util.concurrent;

import java.util.concurrent.locks.LockSupport;

@ElementTypesAreNonnullByDefault
final class OverflowAvoidingLockSupport {
    public static void a(Object obj, long j2) {
        LockSupport.parkNanos(obj, Math.min(j2, 2147483647999999999L));
    }
}
