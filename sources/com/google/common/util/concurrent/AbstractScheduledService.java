package com.google.common.util.concurrent;

import com.google.common.base.Supplier;
import com.google.common.util.concurrent.Service;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Logger;

@ElementTypesAreNonnullByDefault
public abstract class AbstractScheduledService implements Service {

    /* renamed from: b  reason: collision with root package name */
    public static final Logger f29319b = Logger.getLogger(AbstractScheduledService.class.getName());

    /* renamed from: a  reason: collision with root package name */
    public final AbstractService f29320a;

    /* renamed from: com.google.common.util.concurrent.AbstractScheduledService$1  reason: invalid class name */
    class AnonymousClass1 extends Service.Listener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ScheduledExecutorService f29321a;

        public void a(Service.State state, Throwable th) {
            this.f29321a.shutdown();
        }

        public void e(Service.State state) {
            this.f29321a.shutdown();
        }
    }

    /* renamed from: com.google.common.util.concurrent.AbstractScheduledService$1ThreadFactoryImpl  reason: invalid class name */
    class AnonymousClass1ThreadFactoryImpl implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AbstractScheduledService f29322a;

        public Thread newThread(Runnable runnable) {
            return MoreExecutors.c(this.f29322a.f(), runnable);
        }
    }

    public interface Cancellable {
        void cancel(boolean z2);

        boolean isCancelled();
    }

    public static abstract class CustomScheduler extends Scheduler {

        public final class ReschedulableCallable implements Callable<Void> {

            /* renamed from: a  reason: collision with root package name */
            public final Runnable f29323a;

            /* renamed from: b  reason: collision with root package name */
            public final ScheduledExecutorService f29324b;

            /* renamed from: c  reason: collision with root package name */
            public final AbstractService f29325c;

            /* renamed from: d  reason: collision with root package name */
            public final ReentrantLock f29326d = new ReentrantLock();

            /* renamed from: e  reason: collision with root package name */
            public SupplantableFuture f29327e;

            public ReschedulableCallable(AbstractService abstractService, ScheduledExecutorService scheduledExecutorService, Runnable runnable) {
                this.f29323a = runnable;
                this.f29324b = scheduledExecutorService;
                this.f29325c = abstractService;
            }

            /* renamed from: a */
            public Void call() {
                this.f29323a.run();
                c();
                return null;
            }

            public final Cancellable b(Schedule schedule) {
                SupplantableFuture supplantableFuture = this.f29327e;
                if (supplantableFuture == null) {
                    SupplantableFuture supplantableFuture2 = new SupplantableFuture(this.f29326d, d(schedule));
                    this.f29327e = supplantableFuture2;
                    return supplantableFuture2;
                }
                if (!supplantableFuture.f29332b.isCancelled()) {
                    Future unused = this.f29327e.f29332b = d(schedule);
                }
                return this.f29327e;
            }

            public Cancellable c() {
                Cancellable cancellable;
                try {
                    Schedule b2 = CustomScheduler.this.b();
                    this.f29326d.lock();
                    try {
                        cancellable = b(b2);
                        this.f29326d.unlock();
                        th = null;
                    } catch (Throwable th) {
                        this.f29326d.unlock();
                        throw th;
                    }
                    if (th != null) {
                        this.f29325c.h(th);
                    }
                    return cancellable;
                } catch (Throwable th2) {
                    this.f29325c.h(th2);
                    return new FutureAsCancellable(Futures.c());
                }
            }

            public final ScheduledFuture d(Schedule schedule) {
                return this.f29324b.schedule(this, schedule.f29329a, schedule.f29330b);
            }
        }

        public static final class Schedule {

            /* renamed from: a  reason: collision with root package name */
            public final long f29329a;

            /* renamed from: b  reason: collision with root package name */
            public final TimeUnit f29330b;
        }

        public static final class SupplantableFuture implements Cancellable {

            /* renamed from: a  reason: collision with root package name */
            public final ReentrantLock f29331a;

            /* renamed from: b  reason: collision with root package name */
            public Future f29332b;

            public SupplantableFuture(ReentrantLock reentrantLock, Future future) {
                this.f29331a = reentrantLock;
                this.f29332b = future;
            }

            public void cancel(boolean z2) {
                this.f29331a.lock();
                try {
                    this.f29332b.cancel(z2);
                } finally {
                    this.f29331a.unlock();
                }
            }

            public boolean isCancelled() {
                this.f29331a.lock();
                try {
                    return this.f29332b.isCancelled();
                } finally {
                    this.f29331a.unlock();
                }
            }
        }

        public final Cancellable a(AbstractService abstractService, ScheduledExecutorService scheduledExecutorService, Runnable runnable) {
            return new ReschedulableCallable(abstractService, scheduledExecutorService, runnable).c();
        }

        public abstract Schedule b();
    }

    public static final class FutureAsCancellable implements Cancellable {

        /* renamed from: a  reason: collision with root package name */
        public final Future f29333a;

        public FutureAsCancellable(Future future) {
            this.f29333a = future;
        }

        public void cancel(boolean z2) {
            this.f29333a.cancel(z2);
        }

        public boolean isCancelled() {
            return this.f29333a.isCancelled();
        }
    }

    public static abstract class Scheduler {

        /* renamed from: com.google.common.util.concurrent.AbstractScheduledService$Scheduler$1  reason: invalid class name */
        class AnonymousClass1 extends Scheduler {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ long f29334a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ long f29335b;

            /* renamed from: c  reason: collision with root package name */
            public final /* synthetic */ TimeUnit f29336c;

            public Cancellable a(AbstractService abstractService, ScheduledExecutorService scheduledExecutorService, Runnable runnable) {
                return new FutureAsCancellable(scheduledExecutorService.scheduleWithFixedDelay(runnable, this.f29334a, this.f29335b, this.f29336c));
            }
        }

        /* renamed from: com.google.common.util.concurrent.AbstractScheduledService$Scheduler$2  reason: invalid class name */
        class AnonymousClass2 extends Scheduler {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ long f29337a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ long f29338b;

            /* renamed from: c  reason: collision with root package name */
            public final /* synthetic */ TimeUnit f29339c;

            public Cancellable a(AbstractService abstractService, ScheduledExecutorService scheduledExecutorService, Runnable runnable) {
                return new FutureAsCancellable(scheduledExecutorService.scheduleAtFixedRate(runnable, this.f29337a, this.f29338b, this.f29339c));
            }
        }

        public abstract Cancellable a(AbstractService abstractService, ScheduledExecutorService scheduledExecutorService, Runnable runnable);
    }

    public final class ServiceDelegate extends AbstractService {

        /* renamed from: l  reason: collision with root package name */
        public volatile Cancellable f29340l;

        /* renamed from: m  reason: collision with root package name */
        public volatile ScheduledExecutorService f29341m;

        /* renamed from: n  reason: collision with root package name */
        public final ReentrantLock f29342n;

        /* renamed from: o  reason: collision with root package name */
        public final Runnable f29343o;

        /* renamed from: p  reason: collision with root package name */
        public final /* synthetic */ AbstractScheduledService f29344p;

        /* renamed from: com.google.common.util.concurrent.AbstractScheduledService$ServiceDelegate$1  reason: invalid class name */
        class AnonymousClass1 implements Supplier<String> {

            /* renamed from: z  reason: collision with root package name */
            public final /* synthetic */ ServiceDelegate f29345z;

            /* renamed from: a */
            public String get() {
                String f2 = this.f29345z.f29344p.f();
                String valueOf = String.valueOf(this.f29345z.a());
                StringBuilder sb = new StringBuilder(String.valueOf(f2).length() + 1 + valueOf.length());
                sb.append(f2);
                sb.append(" ");
                sb.append(valueOf);
                return sb.toString();
            }
        }

        /* renamed from: com.google.common.util.concurrent.AbstractScheduledService$ServiceDelegate$2  reason: invalid class name */
        class AnonymousClass2 implements Runnable {

            /* renamed from: z  reason: collision with root package name */
            public final /* synthetic */ ServiceDelegate f29346z;

            public void run() {
                this.f29346z.f29342n.lock();
                try {
                    this.f29346z.f29344p.h();
                    ServiceDelegate serviceDelegate = this.f29346z;
                    Cancellable unused = serviceDelegate.f29340l = serviceDelegate.f29344p.e().a(this.f29346z.f29344p.f29320a, this.f29346z.f29341m, this.f29346z.f29343o);
                    this.f29346z.i();
                } catch (Throwable th) {
                    this.f29346z.f29342n.unlock();
                    throw th;
                }
                this.f29346z.f29342n.unlock();
            }
        }

        public class Task implements Runnable {

            /* renamed from: z  reason: collision with root package name */
            public final /* synthetic */ ServiceDelegate f29348z;

            public void run() {
                this.f29348z.f29342n.lock();
                try {
                    Cancellable n2 = this.f29348z.f29340l;
                    Objects.requireNonNull(n2);
                    if (n2.isCancelled()) {
                        this.f29348z.f29342n.unlock();
                        return;
                    }
                    this.f29348z.f29344p.d();
                    this.f29348z.f29342n.unlock();
                } catch (Throwable th) {
                    this.f29348z.f29342n.unlock();
                    throw th;
                }
            }
        }

        public final void c() {
            Objects.requireNonNull(this.f29340l);
            Objects.requireNonNull(this.f29341m);
            this.f29340l.cancel(false);
            this.f29341m.execute(new Runnable() {
                public void run() {
                    try {
                        ServiceDelegate.this.f29342n.lock();
                        if (ServiceDelegate.this.a() != Service.State.STOPPING) {
                            ServiceDelegate.this.f29342n.unlock();
                            return;
                        }
                        ServiceDelegate.this.f29344p.g();
                        ServiceDelegate.this.f29342n.unlock();
                        ServiceDelegate.this.j();
                    } catch (Throwable th) {
                        ServiceDelegate.this.h(th);
                    }
                }
            });
        }

        public String toString() {
            return this.f29344p.toString();
        }
    }

    public final Service.State a() {
        return this.f29320a.a();
    }

    public abstract void d();

    public abstract Scheduler e();

    public String f() {
        return getClass().getSimpleName();
    }

    public void g() {
    }

    public void h() {
    }

    public String toString() {
        String f2 = f();
        String valueOf = String.valueOf(a());
        StringBuilder sb = new StringBuilder(String.valueOf(f2).length() + 3 + valueOf.length());
        sb.append(f2);
        sb.append(" [");
        sb.append(valueOf);
        sb.append("]");
        return sb.toString();
    }
}
