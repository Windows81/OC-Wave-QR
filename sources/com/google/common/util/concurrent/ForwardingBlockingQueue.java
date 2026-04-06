package com.google.common.util.concurrent;

import com.google.common.collect.ForwardingQueue;
import java.util.Collection;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

@ElementTypesAreNonnullByDefault
public abstract class ForwardingBlockingQueue<E> extends ForwardingQueue<E> implements BlockingQueue<E> {
    /* renamed from: a0 */
    public abstract BlockingQueue Z();

    public int drainTo(Collection collection, int i2) {
        return Z().drainTo(collection, i2);
    }

    public boolean offer(Object obj, long j2, TimeUnit timeUnit) {
        return Z().offer(obj, j2, timeUnit);
    }

    public Object poll(long j2, TimeUnit timeUnit) {
        return Z().poll(j2, timeUnit);
    }

    public void put(Object obj) {
        Z().put(obj);
    }

    public int remainingCapacity() {
        return Z().remainingCapacity();
    }

    public Object take() {
        return Z().take();
    }

    public int drainTo(Collection collection) {
        return Z().drainTo(collection);
    }
}
