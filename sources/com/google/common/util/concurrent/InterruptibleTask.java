package com.google.common.util.concurrent;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.AbstractOwnableSynchronizer;
import java.util.concurrent.locks.LockSupport;

@ElementTypesAreNonnullByDefault
abstract class InterruptibleTask<T> extends AtomicReference<Runnable> implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public static final Runnable f29519A = new DoNothingRunnable();

    /* renamed from: z  reason: collision with root package name */
    public static final Runnable f29520z = new DoNothingRunnable();

    public static final class Blocker extends AbstractOwnableSynchronizer implements Runnable {

        /* renamed from: z  reason: collision with root package name */
        public final InterruptibleTask f29521z;

        public final void b(Thread thread) {
            super.setExclusiveOwnerThread(thread);
        }

        public void run() {
        }

        public String toString() {
            return this.f29521z.toString();
        }

        public Blocker(InterruptibleTask interruptibleTask) {
            this.f29521z = interruptibleTask;
        }
    }

    public static final class DoNothingRunnable implements Runnable {
        public DoNothingRunnable() {
        }

        public void run() {
        }
    }

    public abstract void a(Throwable th);

    public abstract void b(Object obj);

    public final void c() {
        Runnable runnable = (Runnable) get();
        if (runnable instanceof Thread) {
            Blocker blocker = new Blocker();
            blocker.b(Thread.currentThread());
            if (compareAndSet(runnable, blocker)) {
                try {
                    ((Thread) runnable).interrupt();
                } finally {
                    if (((Runnable) getAndSet(f29520z)) == f29519A) {
                        LockSupport.unpark((Thread) runnable);
                    }
                }
            }
        }
    }

    public abstract boolean d();

    public abstract Object e();

    public abstract String f();

    public final void g(Thread thread) {
        Runnable runnable = (Runnable) get();
        Blocker blocker = null;
        boolean z2 = false;
        int i2 = 0;
        while (true) {
            boolean z3 = runnable instanceof Blocker;
            if (!z3 && runnable != f29519A) {
                break;
            }
            if (z3) {
                blocker = (Blocker) runnable;
            }
            i2++;
            if (i2 > 1000) {
                Runnable runnable2 = f29519A;
                if (runnable == runnable2 || compareAndSet(runnable, runnable2)) {
                    z2 = Thread.interrupted() || z2;
                    LockSupport.park(blocker);
                }
            } else {
                Thread.yield();
            }
            runnable = (Runnable) get();
        }
        if (z2) {
            thread.interrupt();
        }
    }

    public final void run() {
        Thread currentThread = Thread.currentThread();
        Object obj = null;
        if (compareAndSet((Object) null, currentThread)) {
            boolean d2 = d();
            if (!d2) {
                try {
                    obj = e();
                } catch (Throwable th) {
                    if (!compareAndSet(currentThread, f29520z)) {
                        g(currentThread);
                    }
                    if (!d2) {
                        a(th);
                        return;
                    }
                    return;
                }
            }
            if (!compareAndSet(currentThread, f29520z)) {
                g(currentThread);
            }
            if (!d2) {
                b(NullnessCasts.a(obj));
            }
        }
    }

    public final String toString() {
        String str;
        Runnable runnable = (Runnable) get();
        if (runnable == f29520z) {
            str = "running=[DONE]";
        } else if (runnable instanceof Blocker) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            String name = ((Thread) runnable).getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 21);
            sb.append("running=[RUNNING ON ");
            sb.append(name);
            sb.append("]");
            str = sb.toString();
        } else {
            str = "running=[NOT STARTED YET]";
        }
        String f2 = f();
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(f2).length());
        sb2.append(str);
        sb2.append(", ");
        sb2.append(f2);
        return sb2.toString();
    }
}
