package com.google.common.util.concurrent;

import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;

@ElementTypesAreNonnullByDefault
abstract class ForwardingCondition implements Condition {
    public abstract Condition a();

    public void await() {
        a().await();
    }

    public long awaitNanos(long j2) {
        return a().awaitNanos(j2);
    }

    public void awaitUninterruptibly() {
        a().awaitUninterruptibly();
    }

    public boolean awaitUntil(Date date) {
        return a().awaitUntil(date);
    }

    public void signal() {
        a().signal();
    }

    public void signalAll() {
        a().signalAll();
    }

    public boolean await(long j2, TimeUnit timeUnit) {
        return a().await(j2, timeUnit);
    }
}
