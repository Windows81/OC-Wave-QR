package com.google.common.util.concurrent;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

@ElementTypesAreNonnullByDefault
public final class Monitor {

    /* renamed from: a  reason: collision with root package name */
    public final ReentrantLock f29531a;

    /* renamed from: b  reason: collision with root package name */
    public Guard f29532b;

    public static abstract class Guard {

        /* renamed from: a  reason: collision with root package name */
        public final Condition f29533a;

        /* renamed from: b  reason: collision with root package name */
        public Guard f29534b;

        public abstract boolean a();
    }

    public void a() {
        this.f29531a.lock();
    }

    public boolean b() {
        return this.f29531a.isHeldByCurrentThread();
    }

    public final boolean c(Guard guard) {
        try {
            return guard.a();
        } catch (Throwable th) {
            e();
            throw th;
        }
    }

    public void d() {
        ReentrantLock reentrantLock = this.f29531a;
        try {
            if (reentrantLock.getHoldCount() == 1) {
                f();
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void e() {
        for (Guard guard = this.f29532b; guard != null; guard = guard.f29534b) {
            guard.f29533a.signalAll();
        }
    }

    public final void f() {
        for (Guard guard = this.f29532b; guard != null; guard = guard.f29534b) {
            if (c(guard)) {
                guard.f29533a.signal();
                return;
            }
        }
    }
}
