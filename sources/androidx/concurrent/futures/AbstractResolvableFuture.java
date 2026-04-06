package androidx.concurrent.futures;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class AbstractResolvableFuture<V> implements ListenableFuture<V> {
    public static final boolean C = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public static final Logger D;
    public static final AtomicHelper E;
    public static final Object F = new Object();

    /* renamed from: A  reason: collision with root package name */
    public volatile Listener f19345A;

    /* renamed from: B  reason: collision with root package name */
    public volatile Waiter f19346B;

    /* renamed from: z  reason: collision with root package name */
    public volatile Object f19347z;

    public static abstract class AtomicHelper {
        public AtomicHelper() {
        }

        public abstract boolean a(AbstractResolvableFuture abstractResolvableFuture, Listener listener, Listener listener2);

        public abstract boolean b(AbstractResolvableFuture abstractResolvableFuture, Object obj, Object obj2);

        public abstract boolean c(AbstractResolvableFuture abstractResolvableFuture, Waiter waiter, Waiter waiter2);

        public abstract void d(Waiter waiter, Waiter waiter2);

        public abstract void e(Waiter waiter, Thread thread);
    }

    public static final class Cancellation {

        /* renamed from: c  reason: collision with root package name */
        public static final Cancellation f19348c;

        /* renamed from: d  reason: collision with root package name */
        public static final Cancellation f19349d;

        /* renamed from: a  reason: collision with root package name */
        public final boolean f19350a;

        /* renamed from: b  reason: collision with root package name */
        public final Throwable f19351b;

        static {
            if (AbstractResolvableFuture.C) {
                f19349d = null;
                f19348c = null;
                return;
            }
            f19349d = new Cancellation(false, (Throwable) null);
            f19348c = new Cancellation(true, (Throwable) null);
        }

        public Cancellation(boolean z2, Throwable th) {
            this.f19350a = z2;
            this.f19351b = th;
        }
    }

    public static final class Failure {

        /* renamed from: b  reason: collision with root package name */
        public static final Failure f19352b = new Failure(new Throwable("Failure occurred while trying to finish a future.") {
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        });

        /* renamed from: a  reason: collision with root package name */
        public final Throwable f19353a;

        public Failure(Throwable th) {
            this.f19353a = (Throwable) AbstractResolvableFuture.j(th);
        }
    }

    public static final class Listener {

        /* renamed from: d  reason: collision with root package name */
        public static final Listener f19354d = new Listener((Runnable) null, (Executor) null);

        /* renamed from: a  reason: collision with root package name */
        public final Runnable f19355a;

        /* renamed from: b  reason: collision with root package name */
        public final Executor f19356b;

        /* renamed from: c  reason: collision with root package name */
        public Listener f19357c;

        public Listener(Runnable runnable, Executor executor) {
            this.f19355a = runnable;
            this.f19356b = executor;
        }
    }

    public static final class SafeAtomicHelper extends AtomicHelper {

        /* renamed from: a  reason: collision with root package name */
        public final AtomicReferenceFieldUpdater f19358a;

        /* renamed from: b  reason: collision with root package name */
        public final AtomicReferenceFieldUpdater f19359b;

        /* renamed from: c  reason: collision with root package name */
        public final AtomicReferenceFieldUpdater f19360c;

        /* renamed from: d  reason: collision with root package name */
        public final AtomicReferenceFieldUpdater f19361d;

        /* renamed from: e  reason: collision with root package name */
        public final AtomicReferenceFieldUpdater f19362e;

        public SafeAtomicHelper(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
            super();
            this.f19358a = atomicReferenceFieldUpdater;
            this.f19359b = atomicReferenceFieldUpdater2;
            this.f19360c = atomicReferenceFieldUpdater3;
            this.f19361d = atomicReferenceFieldUpdater4;
            this.f19362e = atomicReferenceFieldUpdater5;
        }

        public boolean a(AbstractResolvableFuture abstractResolvableFuture, Listener listener, Listener listener2) {
            return a.a(this.f19361d, abstractResolvableFuture, listener, listener2);
        }

        public boolean b(AbstractResolvableFuture abstractResolvableFuture, Object obj, Object obj2) {
            return a.a(this.f19362e, abstractResolvableFuture, obj, obj2);
        }

        public boolean c(AbstractResolvableFuture abstractResolvableFuture, Waiter waiter, Waiter waiter2) {
            return a.a(this.f19360c, abstractResolvableFuture, waiter, waiter2);
        }

        public void d(Waiter waiter, Waiter waiter2) {
            this.f19359b.lazySet(waiter, waiter2);
        }

        public void e(Waiter waiter, Thread thread) {
            this.f19358a.lazySet(waiter, thread);
        }
    }

    public static final class SetFuture<V> implements Runnable {

        /* renamed from: A  reason: collision with root package name */
        public final ListenableFuture f19363A;

        /* renamed from: z  reason: collision with root package name */
        public final AbstractResolvableFuture f19364z;

        public void run() {
            if (this.f19364z.f19347z == this) {
                if (AbstractResolvableFuture.E.b(this.f19364z, this, AbstractResolvableFuture.o(this.f19363A))) {
                    AbstractResolvableFuture.l(this.f19364z);
                }
            }
        }
    }

    public static final class SynchronizedHelper extends AtomicHelper {
        public SynchronizedHelper() {
            super();
        }

        public boolean a(AbstractResolvableFuture abstractResolvableFuture, Listener listener, Listener listener2) {
            synchronized (abstractResolvableFuture) {
                try {
                    if (abstractResolvableFuture.f19345A != listener) {
                        return false;
                    }
                    abstractResolvableFuture.f19345A = listener2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public boolean b(AbstractResolvableFuture abstractResolvableFuture, Object obj, Object obj2) {
            synchronized (abstractResolvableFuture) {
                try {
                    if (abstractResolvableFuture.f19347z != obj) {
                        return false;
                    }
                    abstractResolvableFuture.f19347z = obj2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public boolean c(AbstractResolvableFuture abstractResolvableFuture, Waiter waiter, Waiter waiter2) {
            synchronized (abstractResolvableFuture) {
                try {
                    if (abstractResolvableFuture.f19346B != waiter) {
                        return false;
                    }
                    abstractResolvableFuture.f19346B = waiter2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public void d(Waiter waiter, Waiter waiter2) {
            waiter.f19367b = waiter2;
        }

        public void e(Waiter waiter, Thread thread) {
            waiter.f19366a = thread;
        }
    }

    public static final class Waiter {

        /* renamed from: c  reason: collision with root package name */
        public static final Waiter f19365c = new Waiter(false);

        /* renamed from: a  reason: collision with root package name */
        public volatile Thread f19366a;

        /* renamed from: b  reason: collision with root package name */
        public volatile Waiter f19367b;

        public Waiter(boolean z2) {
        }

        public void a(Waiter waiter) {
            AbstractResolvableFuture.E.d(this, waiter);
        }

        public void b() {
            Thread thread = this.f19366a;
            if (thread != null) {
                this.f19366a = null;
                LockSupport.unpark(thread);
            }
        }

        public Waiter() {
            AbstractResolvableFuture.E.e(this, Thread.currentThread());
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: androidx.concurrent.futures.AbstractResolvableFuture$SynchronizedHelper} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            java.lang.Class<androidx.concurrent.futures.AbstractResolvableFuture$Waiter> r0 = androidx.concurrent.futures.AbstractResolvableFuture.Waiter.class
            java.lang.String r1 = "guava.concurrent.generate_cancellation_cause"
            java.lang.String r2 = "false"
            java.lang.String r1 = java.lang.System.getProperty(r1, r2)
            boolean r1 = java.lang.Boolean.parseBoolean(r1)
            C = r1
            java.lang.Class<androidx.concurrent.futures.AbstractResolvableFuture> r1 = androidx.concurrent.futures.AbstractResolvableFuture.class
            java.lang.String r2 = r1.getName()
            java.util.logging.Logger r2 = java.util.logging.Logger.getLogger(r2)
            D = r2
            androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper r2 = new androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper     // Catch:{ all -> 0x0048 }
            java.lang.Class<java.lang.Thread> r3 = java.lang.Thread.class
            java.lang.String r4 = "a"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r3, r4)     // Catch:{ all -> 0x0048 }
            java.lang.String r3 = "b"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r0, r3)     // Catch:{ all -> 0x0048 }
            java.lang.String r3 = "B"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r0, r3)     // Catch:{ all -> 0x0048 }
            java.lang.Class<androidx.concurrent.futures.AbstractResolvableFuture$Listener> r0 = androidx.concurrent.futures.AbstractResolvableFuture.Listener.class
            java.lang.String r3 = "A"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r0, r3)     // Catch:{ all -> 0x0048 }
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.String r3 = "z"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r8 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r0, r3)     // Catch:{ all -> 0x0048 }
            r3 = r2
            r3.<init>(r4, r5, r6, r7, r8)     // Catch:{ all -> 0x0048 }
            r0 = 0
            goto L_0x004e
        L_0x0048:
            r0 = move-exception
            androidx.concurrent.futures.AbstractResolvableFuture$SynchronizedHelper r2 = new androidx.concurrent.futures.AbstractResolvableFuture$SynchronizedHelper
            r2.<init>()
        L_0x004e:
            E = r2
            if (r0 == 0) goto L_0x005b
            java.util.logging.Logger r1 = D
            java.util.logging.Level r2 = java.util.logging.Level.SEVERE
            java.lang.String r3 = "SafeAtomicHelper is broken!"
            r1.log(r2, r3, r0)
        L_0x005b:
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            F = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.concurrent.futures.AbstractResolvableFuture.<clinit>():void");
    }

    private void d(StringBuilder sb) {
        try {
            Object p2 = p(this);
            sb.append("SUCCESS, result=[");
            sb.append(B(p2));
            sb.append("]");
        } catch (ExecutionException e2) {
            sb.append("FAILURE, cause=[");
            sb.append(e2.getCause());
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e3) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e3.getClass());
            sb.append(" thrown from get()]");
        }
    }

    private static CancellationException h(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    public static Object j(Object obj) {
        obj.getClass();
        return obj;
    }

    public static void l(AbstractResolvableFuture abstractResolvableFuture) {
        Listener listener = null;
        while (true) {
            abstractResolvableFuture.x();
            abstractResolvableFuture.f();
            Listener k2 = abstractResolvableFuture.k(listener);
            while (true) {
                if (k2 != null) {
                    listener = k2.f19357c;
                    Runnable runnable = k2.f19355a;
                    if (runnable instanceof SetFuture) {
                        SetFuture setFuture = (SetFuture) runnable;
                        abstractResolvableFuture = setFuture.f19364z;
                        if (abstractResolvableFuture.f19347z == setFuture) {
                            if (E.b(abstractResolvableFuture, setFuture, o(setFuture.f19363A))) {
                            }
                        } else {
                            continue;
                        }
                    } else {
                        m(runnable, k2.f19356b);
                    }
                    k2 = listener;
                } else {
                    return;
                }
            }
        }
    }

    private static void m(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e2) {
            Logger logger = D;
            Level level = Level.SEVERE;
            logger.log(level, "RuntimeException while executing runnable " + runnable + " with executor " + executor, e2);
        }
    }

    private Object n(Object obj) {
        if (obj instanceof Cancellation) {
            throw h("Task was cancelled.", ((Cancellation) obj).f19351b);
        } else if (obj instanceof Failure) {
            throw new ExecutionException(((Failure) obj).f19353a);
        } else if (obj == F) {
            return null;
        } else {
            return obj;
        }
    }

    public static Object o(ListenableFuture listenableFuture) {
        if (listenableFuture instanceof AbstractResolvableFuture) {
            Object obj = ((AbstractResolvableFuture) listenableFuture).f19347z;
            if (!(obj instanceof Cancellation)) {
                return obj;
            }
            Cancellation cancellation = (Cancellation) obj;
            return cancellation.f19350a ? cancellation.f19351b != null ? new Cancellation(false, cancellation.f19351b) : Cancellation.f19349d : obj;
        }
        boolean isCancelled = listenableFuture.isCancelled();
        if ((!C) && isCancelled) {
            return Cancellation.f19349d;
        }
        try {
            Object p2 = p(listenableFuture);
            return p2 == null ? F : p2;
        } catch (ExecutionException e2) {
            return new Failure(e2.getCause());
        } catch (CancellationException e3) {
            if (isCancelled) {
                return new Cancellation(false, e3);
            }
            return new Failure(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + listenableFuture, e3));
        } catch (Throwable th) {
            return new Failure(th);
        }
    }

    public static Object p(Future future) {
        Object obj;
        boolean z2 = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z2 = true;
            } catch (Throwable th) {
                if (z2) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    private void x() {
        Waiter waiter;
        do {
            waiter = this.f19346B;
        } while (!E.c(this, waiter, Waiter.f19365c));
        while (waiter != null) {
            waiter.b();
            waiter = waiter.f19367b;
        }
    }

    public boolean A(Throwable th) {
        if (!E.b(this, (Object) null, new Failure((Throwable) j(th)))) {
            return false;
        }
        l(this);
        return true;
    }

    public final String B(Object obj) {
        return obj == this ? "this future" : String.valueOf(obj);
    }

    public final void C(Runnable runnable, Executor executor) {
        j(runnable);
        j(executor);
        Listener listener = this.f19345A;
        if (listener != Listener.f19354d) {
            Listener listener2 = new Listener(runnable, executor);
            do {
                listener2.f19357c = listener;
                if (!E.a(this, listener, listener2)) {
                    listener = this.f19345A;
                } else {
                    return;
                }
            } while (listener != Listener.f19354d);
        }
        m(runnable, executor);
    }

    public final boolean D() {
        Object obj = this.f19347z;
        return (obj instanceof Cancellation) && ((Cancellation) obj).f19350a;
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [java.util.concurrent.Future, com.google.common.util.concurrent.ListenableFuture] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean cancel(boolean r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f19347z
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0008
            r3 = r1
            goto L_0x0009
        L_0x0008:
            r3 = r2
        L_0x0009:
            boolean r4 = r0 instanceof androidx.concurrent.futures.AbstractResolvableFuture.SetFuture
            r3 = r3 | r4
            if (r3 == 0) goto L_0x0061
            boolean r3 = C
            if (r3 == 0) goto L_0x001f
            androidx.concurrent.futures.AbstractResolvableFuture$Cancellation r3 = new androidx.concurrent.futures.AbstractResolvableFuture$Cancellation
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.String r5 = "Future.cancel() was called."
            r4.<init>(r5)
            r3.<init>(r8, r4)
            goto L_0x0026
        L_0x001f:
            if (r8 == 0) goto L_0x0024
            androidx.concurrent.futures.AbstractResolvableFuture$Cancellation r3 = androidx.concurrent.futures.AbstractResolvableFuture.Cancellation.f19348c
            goto L_0x0026
        L_0x0024:
            androidx.concurrent.futures.AbstractResolvableFuture$Cancellation r3 = androidx.concurrent.futures.AbstractResolvableFuture.Cancellation.f19349d
        L_0x0026:
            r4 = r7
            r5 = r2
        L_0x0028:
            androidx.concurrent.futures.AbstractResolvableFuture$AtomicHelper r6 = E
            boolean r6 = r6.b(r4, r0, r3)
            if (r6 == 0) goto L_0x0059
            if (r8 == 0) goto L_0x0035
            r4.r()
        L_0x0035:
            l(r4)
            boolean r4 = r0 instanceof androidx.concurrent.futures.AbstractResolvableFuture.SetFuture
            if (r4 == 0) goto L_0x0062
            androidx.concurrent.futures.AbstractResolvableFuture$SetFuture r0 = (androidx.concurrent.futures.AbstractResolvableFuture.SetFuture) r0
            com.google.common.util.concurrent.ListenableFuture r0 = r0.f19363A
            boolean r4 = r0 instanceof androidx.concurrent.futures.AbstractResolvableFuture
            if (r4 == 0) goto L_0x0055
            r4 = r0
            androidx.concurrent.futures.AbstractResolvableFuture r4 = (androidx.concurrent.futures.AbstractResolvableFuture) r4
            java.lang.Object r0 = r4.f19347z
            if (r0 != 0) goto L_0x004d
            r5 = r1
            goto L_0x004e
        L_0x004d:
            r5 = r2
        L_0x004e:
            boolean r6 = r0 instanceof androidx.concurrent.futures.AbstractResolvableFuture.SetFuture
            r5 = r5 | r6
            if (r5 == 0) goto L_0x0062
            r5 = r1
            goto L_0x0028
        L_0x0055:
            r0.cancel(r8)
            goto L_0x0062
        L_0x0059:
            java.lang.Object r0 = r4.f19347z
            boolean r6 = r0 instanceof androidx.concurrent.futures.AbstractResolvableFuture.SetFuture
            if (r6 != 0) goto L_0x0028
            r1 = r5
            goto L_0x0062
        L_0x0061:
            r1 = r2
        L_0x0062:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.concurrent.futures.AbstractResolvableFuture.cancel(boolean):boolean");
    }

    public void f() {
    }

    public final Object get(long j2, TimeUnit timeUnit) {
        long j3 = j2;
        TimeUnit timeUnit2 = timeUnit;
        long nanos = timeUnit2.toNanos(j3);
        if (!Thread.interrupted()) {
            Object obj = this.f19347z;
            if ((obj != null) && (!(obj instanceof SetFuture))) {
                return n(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0;
            if (nanos >= 1000) {
                Waiter waiter = this.f19346B;
                if (waiter != Waiter.f19365c) {
                    Waiter waiter2 = new Waiter();
                    do {
                        waiter2.a(waiter);
                        if (E.c(this, waiter, waiter2)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f19347z;
                                    if ((obj2 != null) && (!(obj2 instanceof SetFuture))) {
                                        return n(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    y(waiter2);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            y(waiter2);
                        } else {
                            waiter = this.f19346B;
                        }
                    } while (waiter != Waiter.f19365c);
                }
                return n(this.f19347z);
            }
            while (nanos > 0) {
                Object obj3 = this.f19347z;
                if ((obj3 != null) && (!(obj3 instanceof SetFuture))) {
                    return n(obj3);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String abstractResolvableFuture = toString();
            String obj4 = timeUnit.toString();
            Locale locale = Locale.ROOT;
            String lowerCase = obj4.toLowerCase(locale);
            String str = "Waited " + j3 + " " + timeUnit.toString().toLowerCase(locale);
            if (nanos + 1000 < 0) {
                String str2 = str + " (plus ";
                long j4 = -nanos;
                long convert = timeUnit2.convert(j4, TimeUnit.NANOSECONDS);
                long nanos2 = j4 - timeUnit2.toNanos(convert);
                int i2 = (convert > 0 ? 1 : (convert == 0 ? 0 : -1));
                boolean z2 = i2 == 0 || nanos2 > 1000;
                if (i2 > 0) {
                    String str3 = str2 + convert + " " + lowerCase;
                    if (z2) {
                        str3 = str3 + ",";
                    }
                    str2 = str3 + " ";
                }
                if (z2) {
                    str2 = str2 + nanos2 + " nanoseconds ";
                }
                str = str2 + "delay)";
            }
            if (isDone()) {
                throw new TimeoutException(str + " but future completed as timeout expired");
            }
            throw new TimeoutException(str + " for " + abstractResolvableFuture);
        }
        throw new InterruptedException();
    }

    public final boolean isCancelled() {
        return this.f19347z instanceof Cancellation;
    }

    public final boolean isDone() {
        Object obj = this.f19347z;
        return (!(obj instanceof SetFuture)) & (obj != null);
    }

    public final Listener k(Listener listener) {
        Listener listener2;
        do {
            listener2 = this.f19345A;
        } while (!E.a(this, listener2, Listener.f19354d));
        Listener listener3 = listener2;
        Listener listener4 = listener;
        Listener listener5 = listener3;
        while (listener5 != null) {
            Listener listener6 = listener5.f19357c;
            listener5.f19357c = listener4;
            listener4 = listener5;
            listener5 = listener6;
        }
        return listener4;
    }

    public void r() {
    }

    public String t() {
        Object obj = this.f19347z;
        if (obj instanceof SetFuture) {
            return "setFuture=[" + B(((SetFuture) obj).f19363A) + "]";
        } else if (!(this instanceof ScheduledFuture)) {
            return null;
        } else {
            return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
        }
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            d(sb);
        } else {
            try {
                str = t();
            } catch (RuntimeException e2) {
                str = "Exception thrown from implementation: " + e2.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(str);
                sb.append("]");
            } else if (isDone()) {
                d(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public final void y(Waiter waiter) {
        waiter.f19366a = null;
        while (true) {
            Waiter waiter2 = this.f19346B;
            if (waiter2 != Waiter.f19365c) {
                Waiter waiter3 = null;
                while (waiter2 != null) {
                    Waiter waiter4 = waiter2.f19367b;
                    if (waiter2.f19366a != null) {
                        waiter3 = waiter2;
                    } else if (waiter3 != null) {
                        waiter3.f19367b = waiter4;
                        if (waiter3.f19366a == null) {
                        }
                    } else if (!E.c(this, waiter2, waiter4)) {
                    }
                    waiter2 = waiter4;
                }
                return;
            }
            return;
        }
    }

    public boolean z(Object obj) {
        if (obj == null) {
            obj = F;
        }
        if (!E.b(this, (Object) null, obj)) {
            return false;
        }
        l(this);
        return true;
    }

    public final Object get() {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f19347z;
            if ((obj2 != null) && (!(obj2 instanceof SetFuture))) {
                return n(obj2);
            }
            Waiter waiter = this.f19346B;
            if (waiter != Waiter.f19365c) {
                Waiter waiter2 = new Waiter();
                do {
                    waiter2.a(waiter);
                    if (E.c(this, waiter, waiter2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f19347z;
                            } else {
                                y(waiter2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof SetFuture))));
                        return n(obj);
                    }
                    waiter = this.f19346B;
                } while (waiter != Waiter.f19365c);
            }
            return n(this.f19347z);
        }
        throw new InterruptedException();
    }
}
