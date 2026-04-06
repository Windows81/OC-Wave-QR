package com.google.common.util.concurrent;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

@ElementTypesAreNonnullByDefault
abstract class ForwardingLock implements Lock {
    public abstract Lock a();

    public void lock() {
        a().lock();
    }

    public void lockInterruptibly() {
        a().lockInterruptibly();
    }

    public Condition newCondition() {
        return a().newCondition();
    }

    public boolean tryLock() {
        return a().tryLock();
    }

    public void unlock() {
        a().unlock();
    }

    public boolean tryLock(long j2, TimeUnit timeUnit) {
        return a().tryLock(j2, timeUnit);
    }
}
