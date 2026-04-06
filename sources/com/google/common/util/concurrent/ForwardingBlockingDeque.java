package com.google.common.util.concurrent;

import com.google.common.collect.ForwardingDeque;
import java.util.Collection;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.TimeUnit;

@ElementTypesAreNonnullByDefault
public abstract class ForwardingBlockingDeque<E> extends ForwardingDeque<E> implements BlockingDeque<E> {
    /* renamed from: b0 */
    public abstract BlockingDeque a0();

    public int drainTo(Collection collection) {
        return a0().drainTo(collection);
    }

    public boolean offer(Object obj, long j2, TimeUnit timeUnit) {
        return a0().offer(obj, j2, timeUnit);
    }

    public boolean offerFirst(Object obj, long j2, TimeUnit timeUnit) {
        return a0().offerFirst(obj, j2, timeUnit);
    }

    public boolean offerLast(Object obj, long j2, TimeUnit timeUnit) {
        return a0().offerLast(obj, j2, timeUnit);
    }

    public Object poll(long j2, TimeUnit timeUnit) {
        return a0().poll(j2, timeUnit);
    }

    public Object pollFirst(long j2, TimeUnit timeUnit) {
        return a0().pollFirst(j2, timeUnit);
    }

    public Object pollLast(long j2, TimeUnit timeUnit) {
        return a0().pollLast(j2, timeUnit);
    }

    public void put(Object obj) {
        a0().put(obj);
    }

    public void putFirst(Object obj) {
        a0().putFirst(obj);
    }

    public void putLast(Object obj) {
        a0().putLast(obj);
    }

    public int remainingCapacity() {
        return a0().remainingCapacity();
    }

    public Object take() {
        return a0().take();
    }

    public Object takeFirst() {
        return a0().takeFirst();
    }

    public Object takeLast() {
        return a0().takeLast();
    }

    public int drainTo(Collection collection, int i2) {
        return a0().drainTo(collection, i2);
    }
}
