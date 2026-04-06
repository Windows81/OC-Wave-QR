package com.google.common.util.concurrent;

import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import com.google.common.base.Throwables;
import com.google.common.util.concurrent.AbstractFuture;
import com.google.common.util.concurrent.ForwardingListenableFuture;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

@ElementTypesAreNonnullByDefault
public final class MoreExecutors {

    /* renamed from: com.google.common.util.concurrent.MoreExecutors$1  reason: invalid class name */
    class AnonymousClass1 implements Runnable {

        /* renamed from: A  reason: collision with root package name */
        public final /* synthetic */ ListenableFuture f29535A;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ BlockingQueue f29536z;

        public void run() {
            this.f29536z.add(this.f29535A);
        }
    }

    /* renamed from: com.google.common.util.concurrent.MoreExecutors$3  reason: invalid class name */
    class AnonymousClass3 extends WrappingExecutorService {

        /* renamed from: A  reason: collision with root package name */
        public final /* synthetic */ Supplier f29539A;

        public Runnable c(Runnable runnable) {
            return Callables.e(runnable, this.f29539A);
        }

        public Callable d(Callable callable) {
            return Callables.f(callable, this.f29539A);
        }
    }

    /* renamed from: com.google.common.util.concurrent.MoreExecutors$4  reason: invalid class name */
    class AnonymousClass4 extends WrappingScheduledExecutorService {

        /* renamed from: B  reason: collision with root package name */
        public final /* synthetic */ Supplier f29540B;

        public Runnable c(Runnable runnable) {
            return Callables.e(runnable, this.f29540B);
        }

        public Callable d(Callable callable) {
            return Callables.f(callable, this.f29540B);
        }
    }

    public static class Application {

        /* renamed from: com.google.common.util.concurrent.MoreExecutors$Application$1  reason: invalid class name */
        class AnonymousClass1 implements Runnable {

            /* renamed from: A  reason: collision with root package name */
            public final /* synthetic */ long f29543A;

            /* renamed from: B  reason: collision with root package name */
            public final /* synthetic */ TimeUnit f29544B;

            /* renamed from: z  reason: collision with root package name */
            public final /* synthetic */ ExecutorService f29545z;

            public void run() {
                try {
                    this.f29545z.shutdown();
                    this.f29545z.awaitTermination(this.f29543A, this.f29544B);
                } catch (InterruptedException unused) {
                }
            }
        }
    }

    public static final class DirectExecutorService extends AbstractListeningExecutorService {

        /* renamed from: A  reason: collision with root package name */
        public int f29546A;

        /* renamed from: B  reason: collision with root package name */
        public boolean f29547B;

        /* renamed from: z  reason: collision with root package name */
        public final Object f29548z;

        public final void a() {
            synchronized (this.f29548z) {
                try {
                    int i2 = this.f29546A - 1;
                    this.f29546A = i2;
                    if (i2 == 0) {
                        this.f29548z.notifyAll();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public boolean awaitTermination(long j2, TimeUnit timeUnit) {
            long nanos = timeUnit.toNanos(j2);
            synchronized (this.f29548z) {
                while (true) {
                    try {
                        if (this.f29547B && this.f29546A == 0) {
                            return true;
                        }
                        if (nanos <= 0) {
                            return false;
                        }
                        long nanoTime = System.nanoTime();
                        TimeUnit.NANOSECONDS.timedWait(this.f29548z, nanos);
                        nanos -= System.nanoTime() - nanoTime;
                    } finally {
                    }
                }
            }
        }

        public final void b() {
            synchronized (this.f29548z) {
                try {
                    if (!this.f29547B) {
                        this.f29546A++;
                    } else {
                        throw new RejectedExecutionException("Executor already shutdown");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public void execute(Runnable runnable) {
            b();
            try {
                runnable.run();
            } finally {
                a();
            }
        }

        public boolean isShutdown() {
            boolean z2;
            synchronized (this.f29548z) {
                z2 = this.f29547B;
            }
            return z2;
        }

        public boolean isTerminated() {
            boolean z2;
            synchronized (this.f29548z) {
                try {
                    z2 = this.f29547B && this.f29546A == 0;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return z2;
        }

        public void shutdown() {
            synchronized (this.f29548z) {
                try {
                    this.f29547B = true;
                    if (this.f29546A == 0) {
                        this.f29548z.notifyAll();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public List shutdownNow() {
            shutdown();
            return Collections.emptyList();
        }
    }

    public static class ListeningDecorator extends AbstractListeningExecutorService {

        /* renamed from: z  reason: collision with root package name */
        public final ExecutorService f29549z;

        public final boolean awaitTermination(long j2, TimeUnit timeUnit) {
            return this.f29549z.awaitTermination(j2, timeUnit);
        }

        public final void execute(Runnable runnable) {
            this.f29549z.execute(runnable);
        }

        public final boolean isShutdown() {
            return this.f29549z.isShutdown();
        }

        public final boolean isTerminated() {
            return this.f29549z.isTerminated();
        }

        public final void shutdown() {
            this.f29549z.shutdown();
        }

        public final List shutdownNow() {
            return this.f29549z.shutdownNow();
        }

        public final String toString() {
            String obj = super.toString();
            String valueOf = String.valueOf(this.f29549z);
            StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 2 + valueOf.length());
            sb.append(obj);
            sb.append("[");
            sb.append(valueOf);
            sb.append("]");
            return sb.toString();
        }
    }

    public static final class ScheduledListeningDecorator extends ListeningDecorator implements ListeningScheduledExecutorService {

        /* renamed from: A  reason: collision with root package name */
        public final ScheduledExecutorService f29550A;

        public static final class ListenableScheduledTask<V> extends ForwardingListenableFuture.SimpleForwardingListenableFuture<V> implements ListenableScheduledFuture<V> {

            /* renamed from: A  reason: collision with root package name */
            public final ScheduledFuture f29551A;

            public ListenableScheduledTask(ListenableFuture listenableFuture, ScheduledFuture scheduledFuture) {
                super(listenableFuture);
                this.f29551A = scheduledFuture;
            }

            /* renamed from: S */
            public int compareTo(Delayed delayed) {
                return this.f29551A.compareTo(delayed);
            }

            public boolean cancel(boolean z2) {
                boolean cancel = super.cancel(z2);
                if (cancel) {
                    this.f29551A.cancel(z2);
                }
                return cancel;
            }

            public long getDelay(TimeUnit timeUnit) {
                return this.f29551A.getDelay(timeUnit);
            }
        }

        public static final class NeverSuccessfulListenableFutureTask extends AbstractFuture.TrustedFuture<Void> implements Runnable {
            public final Runnable G;

            public NeverSuccessfulListenableFutureTask(Runnable runnable) {
                this.G = (Runnable) Preconditions.q(runnable);
            }

            public void run() {
                try {
                    this.G.run();
                } catch (Throwable th) {
                    D(th);
                    throw Throwables.j(th);
                }
            }

            public String y() {
                String valueOf = String.valueOf(this.G);
                StringBuilder sb = new StringBuilder(valueOf.length() + 7);
                sb.append("task=[");
                sb.append(valueOf);
                sb.append("]");
                return sb.toString();
            }
        }

        /* renamed from: a */
        public ListenableScheduledFuture schedule(Runnable runnable, long j2, TimeUnit timeUnit) {
            TrustedListenableFutureTask H = TrustedListenableFutureTask.H(runnable, (Object) null);
            return new ListenableScheduledTask(H, this.f29550A.schedule(H, j2, timeUnit));
        }

        /* renamed from: b */
        public ListenableScheduledFuture schedule(Callable callable, long j2, TimeUnit timeUnit) {
            TrustedListenableFutureTask I = TrustedListenableFutureTask.I(callable);
            return new ListenableScheduledTask(I, this.f29550A.schedule(I, j2, timeUnit));
        }

        /* renamed from: c */
        public ListenableScheduledFuture scheduleAtFixedRate(Runnable runnable, long j2, long j3, TimeUnit timeUnit) {
            NeverSuccessfulListenableFutureTask neverSuccessfulListenableFutureTask = new NeverSuccessfulListenableFutureTask(runnable);
            return new ListenableScheduledTask(neverSuccessfulListenableFutureTask, this.f29550A.scheduleAtFixedRate(neverSuccessfulListenableFutureTask, j2, j3, timeUnit));
        }

        /* renamed from: d */
        public ListenableScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j2, long j3, TimeUnit timeUnit) {
            NeverSuccessfulListenableFutureTask neverSuccessfulListenableFutureTask = new NeverSuccessfulListenableFutureTask(runnable);
            return new ListenableScheduledTask(neverSuccessfulListenableFutureTask, this.f29550A.scheduleWithFixedDelay(neverSuccessfulListenableFutureTask, j2, j3, timeUnit));
        }
    }

    public static Executor a() {
        return DirectExecutor.INSTANCE;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        return false;
     */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:11:? A[ExcHandler: ClassNotFoundException (unused java.lang.ClassNotFoundException), SYNTHETIC, Splitter:B:7:0x0011] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean b() {
        /*
            java.lang.String r0 = "com.google.appengine.runtime.environment"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            r1 = 0
            if (r0 != 0) goto L_0x000a
            return r1
        L_0x000a:
            java.lang.String r0 = "com.google.appengine.api.utils.SystemProperty"
            java.lang.Class.forName(r0)     // Catch:{  }
            java.lang.String r0 = "com.google.apphosting.api.ApiProxy"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ ClassNotFoundException -> 0x0023, ClassNotFoundException -> 0x0023, ClassNotFoundException -> 0x0023 }
            java.lang.String r2 = "getCurrentEnvironment"
            r3 = 0
            java.lang.reflect.Method r0 = r0.getMethod(r2, r3)     // Catch:{ ClassNotFoundException -> 0x0023, ClassNotFoundException -> 0x0023, ClassNotFoundException -> 0x0023 }
            java.lang.Object r0 = r0.invoke(r3, r3)     // Catch:{ ClassNotFoundException -> 0x0023, ClassNotFoundException -> 0x0023, ClassNotFoundException -> 0x0023 }
            if (r0 == 0) goto L_0x0023
            r1 = 1
        L_0x0023:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.util.concurrent.MoreExecutors.b():boolean");
    }

    public static Thread c(String str, Runnable runnable) {
        Preconditions.q(str);
        Preconditions.q(runnable);
        Thread newThread = d().newThread(runnable);
        try {
            newThread.setName(str);
        } catch (SecurityException unused) {
        }
        return newThread;
    }

    public static ThreadFactory d() {
        if (!b()) {
            return Executors.defaultThreadFactory();
        }
        try {
            return (ThreadFactory) Class.forName("com.google.appengine.api.ThreadManager").getMethod("currentRequestThreadFactory", (Class[]) null).invoke((Object) null, (Object[]) null);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Couldn't invoke ThreadManager.currentRequestThreadFactory", e2);
        } catch (ClassNotFoundException e3) {
            throw new RuntimeException("Couldn't invoke ThreadManager.currentRequestThreadFactory", e3);
        } catch (NoSuchMethodException e4) {
            throw new RuntimeException("Couldn't invoke ThreadManager.currentRequestThreadFactory", e4);
        } catch (InvocationTargetException e5) {
            throw Throwables.j(e5.getCause());
        }
    }

    public static Executor e(final Executor executor, final AbstractFuture abstractFuture) {
        Preconditions.q(executor);
        Preconditions.q(abstractFuture);
        return executor == a() ? executor : new Executor() {
            public void execute(Runnable runnable) {
                try {
                    executor.execute(runnable);
                } catch (RejectedExecutionException e2) {
                    abstractFuture.D(e2);
                }
            }
        };
    }

    public static Executor f(final Executor executor, final Supplier supplier) {
        Preconditions.q(executor);
        Preconditions.q(supplier);
        return new Executor() {
            public void execute(Runnable runnable) {
                executor.execute(Callables.e(runnable, supplier));
            }
        };
    }
}
