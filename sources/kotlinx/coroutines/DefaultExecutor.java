package kotlinx.coroutines;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.EventLoopImplBase;

@Metadata
public final class DefaultExecutor extends EventLoopImplBase implements Runnable {
    public static final DefaultExecutor H;
    public static final long I;
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    static {
        Long l2;
        DefaultExecutor defaultExecutor = new DefaultExecutor();
        H = defaultExecutor;
        EventLoop.b1(defaultExecutor, false, 1, (Object) null);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l2 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000);
        } catch (SecurityException unused) {
            l2 = 1000L;
        }
        I = timeUnit.toNanos(l2.longValue());
    }

    public Thread G1() {
        Thread thread = _thread;
        return thread == null ? b2() : thread;
    }

    public void H1(long j2, EventLoopImplBase.DelayedTask delayedTask) {
        f2();
    }

    public void M1(Runnable runnable) {
        if (c2()) {
            f2();
        }
        super.M1(runnable);
    }

    public DisposableHandle O(long j2, Runnable runnable, CoroutineContext coroutineContext) {
        return X1(j2, runnable);
    }

    public final synchronized void a2() {
        if (d2()) {
            debugStatus = 3;
            U1();
            Intrinsics.g(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
        }
    }

    public final synchronized Thread b2() {
        Thread thread;
        thread = _thread;
        if (thread == null) {
            thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
            _thread = thread;
            thread.setContextClassLoader(H.getClass().getClassLoader());
            thread.setDaemon(true);
            thread.start();
        }
        return thread;
    }

    public final boolean c2() {
        return debugStatus == 4;
    }

    public final boolean d2() {
        int i2 = debugStatus;
        return i2 == 2 || i2 == 3;
    }

    public final synchronized boolean e2() {
        if (d2()) {
            return false;
        }
        debugStatus = 1;
        Intrinsics.g(this, "null cannot be cast to non-null type java.lang.Object");
        notifyAll();
        return true;
    }

    public final void f2() {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    public void run() {
        ThreadLocalEventLoop.f41437a.d(this);
        AbstractTimeSource a2 = AbstractTimeSourceKt.f41360a;
        if (a2 != null) {
            a2.c();
        }
        try {
            if (!e2()) {
                _thread = null;
                a2();
                AbstractTimeSource a3 = AbstractTimeSourceKt.f41360a;
                if (a3 != null) {
                    a3.g();
                }
                if (!S1()) {
                    G1();
                    return;
                }
                return;
            }
            long j2 = Long.MAX_VALUE;
            while (true) {
                Thread.interrupted();
                long w1 = w1();
                if (w1 == Long.MAX_VALUE) {
                    AbstractTimeSource a4 = AbstractTimeSourceKt.f41360a;
                    long a5 = a4 != null ? a4.a() : System.nanoTime();
                    if (j2 == Long.MAX_VALUE) {
                        j2 = I + a5;
                    }
                    long j3 = j2 - a5;
                    if (j3 <= 0) {
                        _thread = null;
                        a2();
                        AbstractTimeSource a6 = AbstractTimeSourceKt.f41360a;
                        if (a6 != null) {
                            a6.g();
                        }
                        if (!S1()) {
                            G1();
                            return;
                        }
                        return;
                    }
                    w1 = RangesKt.k(w1, j3);
                } else {
                    j2 = Long.MAX_VALUE;
                }
                if (w1 > 0) {
                    if (d2()) {
                        _thread = null;
                        a2();
                        AbstractTimeSource a7 = AbstractTimeSourceKt.f41360a;
                        if (a7 != null) {
                            a7.g();
                        }
                        if (!S1()) {
                            G1();
                            return;
                        }
                        return;
                    }
                    AbstractTimeSource a8 = AbstractTimeSourceKt.f41360a;
                    if (a8 != null) {
                        a8.b(this, w1);
                    } else {
                        LockSupport.parkNanos(this, w1);
                    }
                }
            }
        } catch (Throwable th) {
            _thread = null;
            a2();
            AbstractTimeSource a9 = AbstractTimeSourceKt.f41360a;
            if (a9 != null) {
                a9.g();
            }
            if (!S1()) {
                G1();
            }
            throw th;
        }
    }

    public void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    public String toString() {
        return "DefaultExecutor";
    }
}
