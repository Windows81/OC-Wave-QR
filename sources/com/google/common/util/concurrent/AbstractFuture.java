package com.google.common.util.concurrent;

import androidx.concurrent.futures.a;
import com.google.common.base.Preconditions;
import com.google.common.base.Strings;
import com.google.common.util.concurrent.internal.InternalFutureFailureAccess;
import com.google.common.util.concurrent.internal.InternalFutures;
import java.util.Locale;
import java.util.Objects;
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
import sun.misc.Unsafe;

@ElementTypesAreNonnullByDefault
public abstract class AbstractFuture<V> extends InternalFutureFailureAccess implements ListenableFuture<V> {
    public static final boolean C;
    public static final Logger D;
    public static final AtomicHelper E;
    public static final Object F = new Object();

    /* renamed from: A  reason: collision with root package name */
    public volatile Listener f29283A;

    /* renamed from: B  reason: collision with root package name */
    public volatile Waiter f29284B;

    /* renamed from: z  reason: collision with root package name */
    public volatile Object f29285z;

    public static abstract class AtomicHelper {
        public AtomicHelper() {
        }

        public abstract boolean a(AbstractFuture abstractFuture, Listener listener, Listener listener2);

        public abstract boolean b(AbstractFuture abstractFuture, Object obj, Object obj2);

        public abstract boolean c(AbstractFuture abstractFuture, Waiter waiter, Waiter waiter2);

        public abstract Listener d(AbstractFuture abstractFuture, Listener listener);

        public abstract Waiter e(AbstractFuture abstractFuture, Waiter waiter);

        public abstract void f(Waiter waiter, Waiter waiter2);

        public abstract void g(Waiter waiter, Thread thread);
    }

    public static final class Cancellation {

        /* renamed from: c  reason: collision with root package name */
        public static final Cancellation f29286c;

        /* renamed from: d  reason: collision with root package name */
        public static final Cancellation f29287d;

        /* renamed from: a  reason: collision with root package name */
        public final boolean f29288a;

        /* renamed from: b  reason: collision with root package name */
        public final Throwable f29289b;

        static {
            if (AbstractFuture.C) {
                f29287d = null;
                f29286c = null;
                return;
            }
            f29287d = new Cancellation(false, (Throwable) null);
            f29286c = new Cancellation(true, (Throwable) null);
        }

        public Cancellation(boolean z2, Throwable th) {
            this.f29288a = z2;
            this.f29289b = th;
        }
    }

    public static final class Failure {

        /* renamed from: b  reason: collision with root package name */
        public static final Failure f29290b = new Failure(new Throwable("Failure occurred while trying to finish a future.") {
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        });

        /* renamed from: a  reason: collision with root package name */
        public final Throwable f29291a;

        public Failure(Throwable th) {
            this.f29291a = (Throwable) Preconditions.q(th);
        }
    }

    public static final class SafeAtomicHelper extends AtomicHelper {

        /* renamed from: a  reason: collision with root package name */
        public final AtomicReferenceFieldUpdater f29296a;

        /* renamed from: b  reason: collision with root package name */
        public final AtomicReferenceFieldUpdater f29297b;

        /* renamed from: c  reason: collision with root package name */
        public final AtomicReferenceFieldUpdater f29298c;

        /* renamed from: d  reason: collision with root package name */
        public final AtomicReferenceFieldUpdater f29299d;

        /* renamed from: e  reason: collision with root package name */
        public final AtomicReferenceFieldUpdater f29300e;

        public SafeAtomicHelper(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
            super();
            this.f29296a = atomicReferenceFieldUpdater;
            this.f29297b = atomicReferenceFieldUpdater2;
            this.f29298c = atomicReferenceFieldUpdater3;
            this.f29299d = atomicReferenceFieldUpdater4;
            this.f29300e = atomicReferenceFieldUpdater5;
        }

        public boolean a(AbstractFuture abstractFuture, Listener listener, Listener listener2) {
            return a.a(this.f29299d, abstractFuture, listener, listener2);
        }

        public boolean b(AbstractFuture abstractFuture, Object obj, Object obj2) {
            return a.a(this.f29300e, abstractFuture, obj, obj2);
        }

        public boolean c(AbstractFuture abstractFuture, Waiter waiter, Waiter waiter2) {
            return a.a(this.f29298c, abstractFuture, waiter, waiter2);
        }

        public Listener d(AbstractFuture abstractFuture, Listener listener) {
            return (Listener) this.f29299d.getAndSet(abstractFuture, listener);
        }

        public Waiter e(AbstractFuture abstractFuture, Waiter waiter) {
            return (Waiter) this.f29298c.getAndSet(abstractFuture, waiter);
        }

        public void f(Waiter waiter, Waiter waiter2) {
            this.f29297b.lazySet(waiter, waiter2);
        }

        public void g(Waiter waiter, Thread thread) {
            this.f29296a.lazySet(waiter, thread);
        }
    }

    public static final class SetFuture<V> implements Runnable {

        /* renamed from: A  reason: collision with root package name */
        public final ListenableFuture f29301A;

        /* renamed from: z  reason: collision with root package name */
        public final AbstractFuture f29302z;

        public SetFuture(AbstractFuture abstractFuture, ListenableFuture listenableFuture) {
            this.f29302z = abstractFuture;
            this.f29301A = listenableFuture;
        }

        public void run() {
            if (this.f29302z.f29285z == this) {
                if (AbstractFuture.E.b(this.f29302z, this, AbstractFuture.u(this.f29301A))) {
                    AbstractFuture.r(this.f29302z);
                }
            }
        }
    }

    public static final class SynchronizedHelper extends AtomicHelper {
        public SynchronizedHelper() {
            super();
        }

        public boolean a(AbstractFuture abstractFuture, Listener listener, Listener listener2) {
            synchronized (abstractFuture) {
                try {
                    if (abstractFuture.f29283A != listener) {
                        return false;
                    }
                    Listener unused = abstractFuture.f29283A = listener2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public boolean b(AbstractFuture abstractFuture, Object obj, Object obj2) {
            synchronized (abstractFuture) {
                try {
                    if (abstractFuture.f29285z != obj) {
                        return false;
                    }
                    Object unused = abstractFuture.f29285z = obj2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public boolean c(AbstractFuture abstractFuture, Waiter waiter, Waiter waiter2) {
            synchronized (abstractFuture) {
                try {
                    if (abstractFuture.f29284B != waiter) {
                        return false;
                    }
                    Waiter unused = abstractFuture.f29284B = waiter2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public Listener d(AbstractFuture abstractFuture, Listener listener) {
            Listener g2;
            synchronized (abstractFuture) {
                try {
                    g2 = abstractFuture.f29283A;
                    if (g2 != listener) {
                        Listener unused = abstractFuture.f29283A = listener;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return g2;
        }

        public Waiter e(AbstractFuture abstractFuture, Waiter waiter) {
            Waiter i2;
            synchronized (abstractFuture) {
                try {
                    i2 = abstractFuture.f29284B;
                    if (i2 != waiter) {
                        Waiter unused = abstractFuture.f29284B = waiter;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return i2;
        }

        public void f(Waiter waiter, Waiter waiter2) {
            waiter.f29311b = waiter2;
        }

        public void g(Waiter waiter, Thread thread) {
            waiter.f29310a = thread;
        }
    }

    public interface Trusted<V> extends ListenableFuture<V> {
    }

    public static abstract class TrustedFuture<V> extends AbstractFuture<V> implements Trusted<V> {
        public final void C(Runnable runnable, Executor executor) {
            AbstractFuture.super.C(runnable, executor);
        }

        public final boolean cancel(boolean z2) {
            return AbstractFuture.super.cancel(z2);
        }

        public final Object get() {
            return AbstractFuture.super.get();
        }

        public final boolean isCancelled() {
            return AbstractFuture.super.isCancelled();
        }

        public final boolean isDone() {
            return AbstractFuture.super.isDone();
        }

        public final Object get(long j2, TimeUnit timeUnit) {
            return AbstractFuture.super.get(j2, timeUnit);
        }
    }

    public static final class UnsafeAtomicHelper extends AtomicHelper {

        /* renamed from: a  reason: collision with root package name */
        public static final Unsafe f29303a;

        /* renamed from: b  reason: collision with root package name */
        public static final long f29304b;

        /* renamed from: c  reason: collision with root package name */
        public static final long f29305c;

        /* renamed from: d  reason: collision with root package name */
        public static final long f29306d;

        /* renamed from: e  reason: collision with root package name */
        public static final long f29307e;

        /* renamed from: f  reason: collision with root package name */
        public static final long f29308f;

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x005d, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0069, code lost:
            throw new java.lang.RuntimeException("Could not initialize intrinsics", r0.getCause());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:4:?, code lost:
            r1 = (sun.misc.Unsafe) java.security.AccessController.doPrivileged(new com.google.common.util.concurrent.AbstractFuture.UnsafeAtomicHelper.AnonymousClass1());
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0007 */
        static {
            /*
                java.lang.Class<com.google.common.util.concurrent.AbstractFuture$Waiter> r0 = com.google.common.util.concurrent.AbstractFuture.Waiter.class
                sun.misc.Unsafe r1 = sun.misc.Unsafe.getUnsafe()     // Catch:{ SecurityException -> 0x0007 }
                goto L_0x0012
            L_0x0007:
                com.google.common.util.concurrent.AbstractFuture$UnsafeAtomicHelper$1 r1 = new com.google.common.util.concurrent.AbstractFuture$UnsafeAtomicHelper$1     // Catch:{ PrivilegedActionException -> 0x005d }
                r1.<init>()     // Catch:{ PrivilegedActionException -> 0x005d }
                java.lang.Object r1 = java.security.AccessController.doPrivileged(r1)     // Catch:{ PrivilegedActionException -> 0x005d }
                sun.misc.Unsafe r1 = (sun.misc.Unsafe) r1     // Catch:{ PrivilegedActionException -> 0x005d }
            L_0x0012:
                java.lang.Class<com.google.common.util.concurrent.AbstractFuture> r2 = com.google.common.util.concurrent.AbstractFuture.class
                java.lang.String r3 = "B"
                java.lang.reflect.Field r3 = r2.getDeclaredField(r3)     // Catch:{ Exception -> 0x0053 }
                long r3 = r1.objectFieldOffset(r3)     // Catch:{ Exception -> 0x0053 }
                f29305c = r3     // Catch:{ Exception -> 0x0053 }
                java.lang.String r3 = "A"
                java.lang.reflect.Field r3 = r2.getDeclaredField(r3)     // Catch:{ Exception -> 0x0053 }
                long r3 = r1.objectFieldOffset(r3)     // Catch:{ Exception -> 0x0053 }
                f29304b = r3     // Catch:{ Exception -> 0x0053 }
                java.lang.String r3 = "z"
                java.lang.reflect.Field r2 = r2.getDeclaredField(r3)     // Catch:{ Exception -> 0x0053 }
                long r2 = r1.objectFieldOffset(r2)     // Catch:{ Exception -> 0x0053 }
                f29306d = r2     // Catch:{ Exception -> 0x0053 }
                java.lang.String r2 = "a"
                java.lang.reflect.Field r2 = r0.getDeclaredField(r2)     // Catch:{ Exception -> 0x0053 }
                long r2 = r1.objectFieldOffset(r2)     // Catch:{ Exception -> 0x0053 }
                f29307e = r2     // Catch:{ Exception -> 0x0053 }
                java.lang.String r2 = "b"
                java.lang.reflect.Field r0 = r0.getDeclaredField(r2)     // Catch:{ Exception -> 0x0053 }
                long r2 = r1.objectFieldOffset(r0)     // Catch:{ Exception -> 0x0053 }
                f29308f = r2     // Catch:{ Exception -> 0x0053 }
                f29303a = r1     // Catch:{ Exception -> 0x0053 }
                return
            L_0x0053:
                r0 = move-exception
                com.google.common.base.Throwables.o(r0)
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                r1.<init>(r0)
                throw r1
            L_0x005d:
                r0 = move-exception
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                java.lang.String r2 = "Could not initialize intrinsics"
                java.lang.Throwable r0 = r0.getCause()
                r1.<init>(r2, r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.util.concurrent.AbstractFuture.UnsafeAtomicHelper.<clinit>():void");
        }

        public UnsafeAtomicHelper() {
            super();
        }

        public boolean a(AbstractFuture abstractFuture, Listener listener, Listener listener2) {
            return a.a(f29303a, abstractFuture, f29304b, listener, listener2);
        }

        public boolean b(AbstractFuture abstractFuture, Object obj, Object obj2) {
            return a.a(f29303a, abstractFuture, f29306d, obj, obj2);
        }

        public boolean c(AbstractFuture abstractFuture, Waiter waiter, Waiter waiter2) {
            return a.a(f29303a, abstractFuture, f29305c, waiter, waiter2);
        }

        /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: 
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        public com.google.common.util.concurrent.AbstractFuture.Listener d(com.google.common.util.concurrent.AbstractFuture r3, com.google.common.util.concurrent.AbstractFuture.Listener r4) {
            /*
                r2 = this;
            L_0x0000:
                com.google.common.util.concurrent.AbstractFuture$Listener r0 = r3.f29283A
                if (r4 != r0) goto L_0x0007
                return r0
            L_0x0007:
                boolean r1 = r2.a(r3, r0, r4)
                if (r1 == 0) goto L_0x0000
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.util.concurrent.AbstractFuture.UnsafeAtomicHelper.d(com.google.common.util.concurrent.AbstractFuture, com.google.common.util.concurrent.AbstractFuture$Listener):com.google.common.util.concurrent.AbstractFuture$Listener");
        }

        /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: 
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        public com.google.common.util.concurrent.AbstractFuture.Waiter e(com.google.common.util.concurrent.AbstractFuture r3, com.google.common.util.concurrent.AbstractFuture.Waiter r4) {
            /*
                r2 = this;
            L_0x0000:
                com.google.common.util.concurrent.AbstractFuture$Waiter r0 = r3.f29284B
                if (r4 != r0) goto L_0x0007
                return r0
            L_0x0007:
                boolean r1 = r2.c(r3, r0, r4)
                if (r1 == 0) goto L_0x0000
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.util.concurrent.AbstractFuture.UnsafeAtomicHelper.e(com.google.common.util.concurrent.AbstractFuture, com.google.common.util.concurrent.AbstractFuture$Waiter):com.google.common.util.concurrent.AbstractFuture$Waiter");
        }

        public void f(Waiter waiter, Waiter waiter2) {
            f29303a.putObject(waiter, f29308f, waiter2);
        }

        public void g(Waiter waiter, Thread thread) {
            f29303a.putObject(waiter, f29307e, thread);
        }
    }

    public static final class Waiter {

        /* renamed from: c  reason: collision with root package name */
        public static final Waiter f29309c = new Waiter(false);

        /* renamed from: a  reason: collision with root package name */
        public volatile Thread f29310a;

        /* renamed from: b  reason: collision with root package name */
        public volatile Waiter f29311b;

        public Waiter(boolean z2) {
        }

        public void a(Waiter waiter) {
            AbstractFuture.E.f(this, waiter);
        }

        public void b() {
            Thread thread = this.f29310a;
            if (thread != null) {
                this.f29310a = null;
                LockSupport.unpark(thread);
            }
        }

        public Waiter() {
            AbstractFuture.E.g(this, Thread.currentThread());
        }
    }

    static {
        boolean z2;
        AtomicHelper atomicHelper;
        Class<Waiter> cls = Waiter.class;
        try {
            z2 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z2 = false;
        }
        C = z2;
        Class<AbstractFuture> cls2 = AbstractFuture.class;
        D = Logger.getLogger(cls2.getName());
        Throwable th = null;
        try {
            atomicHelper = new UnsafeAtomicHelper();
            th = null;
        } catch (Throwable th2) {
            atomicHelper = new SynchronizedHelper();
            th = th2;
        }
        E = atomicHelper;
        if (th != null) {
            Logger logger = D;
            Level level = Level.SEVERE;
            logger.log(level, "UnsafeAtomicHelper is broken!", th);
            logger.log(level, "SafeAtomicHelper is broken!", th);
        }
    }

    public static CancellationException p(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    public static void r(AbstractFuture abstractFuture) {
        Listener listener = null;
        while (true) {
            abstractFuture.z();
            abstractFuture.m();
            Listener q2 = abstractFuture.q(listener);
            while (true) {
                if (q2 != null) {
                    listener = q2.f29295c;
                    Runnable runnable = q2.f29293a;
                    Objects.requireNonNull(runnable);
                    Runnable runnable2 = runnable;
                    if (runnable2 instanceof SetFuture) {
                        SetFuture setFuture = (SetFuture) runnable2;
                        abstractFuture = setFuture.f29302z;
                        if (abstractFuture.f29285z == setFuture) {
                            if (E.b(abstractFuture, setFuture, u(setFuture.f29301A))) {
                            }
                        } else {
                            continue;
                        }
                    } else {
                        Executor executor = q2.f29294b;
                        Objects.requireNonNull(executor);
                        s(runnable2, executor);
                    }
                    q2 = listener;
                } else {
                    return;
                }
            }
        }
    }

    public static void s(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e2) {
            Logger logger = D;
            Level level = Level.SEVERE;
            String valueOf = String.valueOf(runnable);
            String valueOf2 = String.valueOf(executor);
            StringBuilder sb = new StringBuilder(valueOf.length() + 57 + valueOf2.length());
            sb.append("RuntimeException while executing runnable ");
            sb.append(valueOf);
            sb.append(" with executor ");
            sb.append(valueOf2);
            logger.log(level, sb.toString(), e2);
        }
    }

    /* access modifiers changed from: private */
    public static Object u(ListenableFuture listenableFuture) {
        Throwable a2;
        if (listenableFuture instanceof Trusted) {
            Object obj = ((AbstractFuture) listenableFuture).f29285z;
            if (obj instanceof Cancellation) {
                Cancellation cancellation = (Cancellation) obj;
                if (cancellation.f29288a) {
                    obj = cancellation.f29289b != null ? new Cancellation(false, cancellation.f29289b) : Cancellation.f29287d;
                }
            }
            Objects.requireNonNull(obj);
            return obj;
        } else if ((listenableFuture instanceof InternalFutureFailureAccess) && (a2 = InternalFutures.a((InternalFutureFailureAccess) listenableFuture)) != null) {
            return new Failure(a2);
        } else {
            boolean isCancelled = listenableFuture.isCancelled();
            if ((!C) && isCancelled) {
                Cancellation cancellation2 = Cancellation.f29287d;
                Objects.requireNonNull(cancellation2);
                return cancellation2;
            }
            try {
                Object v2 = v(listenableFuture);
                if (!isCancelled) {
                    return v2 == null ? F : v2;
                }
                String valueOf = String.valueOf(listenableFuture);
                StringBuilder sb = new StringBuilder(valueOf.length() + 84);
                sb.append("get() did not throw CancellationException, despite reporting isCancelled() == true: ");
                sb.append(valueOf);
                return new Cancellation(false, new IllegalArgumentException(sb.toString()));
            } catch (ExecutionException e2) {
                if (!isCancelled) {
                    return new Failure(e2.getCause());
                }
                String valueOf2 = String.valueOf(listenableFuture);
                StringBuilder sb2 = new StringBuilder(valueOf2.length() + 84);
                sb2.append("get() did not throw CancellationException, despite reporting isCancelled() == true: ");
                sb2.append(valueOf2);
                return new Cancellation(false, new IllegalArgumentException(sb2.toString(), e2));
            } catch (CancellationException e3) {
                if (isCancelled) {
                    return new Cancellation(false, e3);
                }
                String valueOf3 = String.valueOf(listenableFuture);
                StringBuilder sb3 = new StringBuilder(valueOf3.length() + 77);
                sb3.append("get() threw CancellationException, despite reporting isCancelled() == false: ");
                sb3.append(valueOf3);
                return new Failure(new IllegalArgumentException(sb3.toString(), e3));
            } catch (Throwable th) {
                return new Failure(th);
            }
        }
    }

    private static Object v(Future future) {
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

    public final void A(Waiter waiter) {
        waiter.f29310a = null;
        while (true) {
            Waiter waiter2 = this.f29284B;
            if (waiter2 != Waiter.f29309c) {
                Waiter waiter3 = null;
                while (waiter2 != null) {
                    Waiter waiter4 = waiter2.f29311b;
                    if (waiter2.f29310a != null) {
                        waiter3 = waiter2;
                    } else if (waiter3 != null) {
                        waiter3.f29311b = waiter4;
                        if (waiter3.f29310a == null) {
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

    public boolean B(Object obj) {
        if (obj == null) {
            obj = F;
        }
        if (!E.b(this, (Object) null, obj)) {
            return false;
        }
        r(this);
        return true;
    }

    public void C(Runnable runnable, Executor executor) {
        Listener listener;
        Preconditions.r(runnable, "Runnable was null.");
        Preconditions.r(executor, "Executor was null.");
        if (isDone() || (listener = this.f29283A) == Listener.f29292d) {
            s(runnable, executor);
        }
        Listener listener2 = new Listener(runnable, executor);
        do {
            listener2.f29295c = listener;
            if (!E.a(this, listener, listener2)) {
                listener = this.f29283A;
            } else {
                return;
            }
        } while (listener != Listener.f29292d);
        s(runnable, executor);
    }

    public boolean D(Throwable th) {
        if (!E.b(this, (Object) null, new Failure((Throwable) Preconditions.q(th)))) {
            return false;
        }
        r(this);
        return true;
    }

    public boolean E(ListenableFuture listenableFuture) {
        SetFuture setFuture;
        Failure failure;
        Preconditions.q(listenableFuture);
        Object obj = this.f29285z;
        if (obj == null) {
            if (listenableFuture.isDone()) {
                if (!E.b(this, (Object) null, u(listenableFuture))) {
                    return false;
                }
                r(this);
                return true;
            }
            setFuture = new SetFuture(this, listenableFuture);
            if (E.b(this, (Object) null, setFuture)) {
                try {
                    listenableFuture.C(setFuture, DirectExecutor.INSTANCE);
                } catch (Throwable unused) {
                    failure = Failure.f29290b;
                }
                return true;
            }
            obj = this.f29285z;
        }
        if (obj instanceof Cancellation) {
            listenableFuture.cancel(((Cancellation) obj).f29288a);
        }
        return false;
        E.b(this, setFuture, failure);
        return true;
    }

    public final boolean F() {
        Object obj = this.f29285z;
        return (obj instanceof Cancellation) && ((Cancellation) obj).f29288a;
    }

    public final Throwable a() {
        if (!(this instanceof Trusted)) {
            return null;
        }
        Object obj = this.f29285z;
        if (obj instanceof Failure) {
            return ((Failure) obj).f29291a;
        }
        return null;
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [java.util.concurrent.Future, com.google.common.util.concurrent.ListenableFuture] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean cancel(boolean r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f29285z
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0008
            r3 = r1
            goto L_0x0009
        L_0x0008:
            r3 = r2
        L_0x0009:
            boolean r4 = r0 instanceof com.google.common.util.concurrent.AbstractFuture.SetFuture
            r3 = r3 | r4
            if (r3 == 0) goto L_0x0064
            boolean r3 = C
            if (r3 == 0) goto L_0x001f
            com.google.common.util.concurrent.AbstractFuture$Cancellation r3 = new com.google.common.util.concurrent.AbstractFuture$Cancellation
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.String r5 = "Future.cancel() was called."
            r4.<init>(r5)
            r3.<init>(r8, r4)
            goto L_0x0029
        L_0x001f:
            if (r8 == 0) goto L_0x0024
            com.google.common.util.concurrent.AbstractFuture$Cancellation r3 = com.google.common.util.concurrent.AbstractFuture.Cancellation.f29286c
            goto L_0x0026
        L_0x0024:
            com.google.common.util.concurrent.AbstractFuture$Cancellation r3 = com.google.common.util.concurrent.AbstractFuture.Cancellation.f29287d
        L_0x0026:
            java.util.Objects.requireNonNull(r3)
        L_0x0029:
            r4 = r7
            r5 = r2
        L_0x002b:
            com.google.common.util.concurrent.AbstractFuture$AtomicHelper r6 = E
            boolean r6 = r6.b(r4, r0, r3)
            if (r6 == 0) goto L_0x005c
            if (r8 == 0) goto L_0x0038
            r4.w()
        L_0x0038:
            r(r4)
            boolean r4 = r0 instanceof com.google.common.util.concurrent.AbstractFuture.SetFuture
            if (r4 == 0) goto L_0x0065
            com.google.common.util.concurrent.AbstractFuture$SetFuture r0 = (com.google.common.util.concurrent.AbstractFuture.SetFuture) r0
            com.google.common.util.concurrent.ListenableFuture r0 = r0.f29301A
            boolean r4 = r0 instanceof com.google.common.util.concurrent.AbstractFuture.Trusted
            if (r4 == 0) goto L_0x0058
            r4 = r0
            com.google.common.util.concurrent.AbstractFuture r4 = (com.google.common.util.concurrent.AbstractFuture) r4
            java.lang.Object r0 = r4.f29285z
            if (r0 != 0) goto L_0x0050
            r5 = r1
            goto L_0x0051
        L_0x0050:
            r5 = r2
        L_0x0051:
            boolean r6 = r0 instanceof com.google.common.util.concurrent.AbstractFuture.SetFuture
            r5 = r5 | r6
            if (r5 == 0) goto L_0x0065
            r5 = r1
            goto L_0x002b
        L_0x0058:
            r0.cancel(r8)
            goto L_0x0065
        L_0x005c:
            java.lang.Object r0 = r4.f29285z
            boolean r6 = r0 instanceof com.google.common.util.concurrent.AbstractFuture.SetFuture
            if (r6 != 0) goto L_0x002b
            r1 = r5
            goto L_0x0065
        L_0x0064:
            r1 = r2
        L_0x0065:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.util.concurrent.AbstractFuture.cancel(boolean):boolean");
    }

    public Object get(long j2, TimeUnit timeUnit) {
        long j3 = j2;
        TimeUnit timeUnit2 = timeUnit;
        long nanos = timeUnit2.toNanos(j3);
        if (!Thread.interrupted()) {
            Object obj = this.f29285z;
            if ((obj != null) && (!(obj instanceof SetFuture))) {
                return t(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0;
            if (nanos >= 1000) {
                Waiter waiter = this.f29284B;
                if (waiter != Waiter.f29309c) {
                    Waiter waiter2 = new Waiter();
                    do {
                        waiter2.a(waiter);
                        if (E.c(this, waiter, waiter2)) {
                            do {
                                OverflowAvoidingLockSupport.a(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f29285z;
                                    if ((obj2 != null) && (!(obj2 instanceof SetFuture))) {
                                        return t(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    A(waiter2);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            A(waiter2);
                        } else {
                            waiter = this.f29284B;
                        }
                    } while (waiter != Waiter.f29309c);
                }
                Object obj3 = this.f29285z;
                Objects.requireNonNull(obj3);
                return t(obj3);
            }
            while (nanos > 0) {
                Object obj4 = this.f29285z;
                if ((obj4 != null) && (!(obj4 instanceof SetFuture))) {
                    return t(obj4);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String abstractFuture = toString();
            String obj5 = timeUnit.toString();
            Locale locale = Locale.ROOT;
            String lowerCase = obj5.toLowerCase(locale);
            String lowerCase2 = timeUnit.toString().toLowerCase(locale);
            StringBuilder sb = new StringBuilder(String.valueOf(lowerCase2).length() + 28);
            sb.append("Waited ");
            sb.append(j3);
            sb.append(" ");
            sb.append(lowerCase2);
            String sb2 = sb.toString();
            if (nanos + 1000 < 0) {
                String concat = String.valueOf(sb2).concat(" (plus ");
                long j4 = -nanos;
                long convert = timeUnit2.convert(j4, TimeUnit.NANOSECONDS);
                long nanos2 = j4 - timeUnit2.toNanos(convert);
                int i2 = (convert > 0 ? 1 : (convert == 0 ? 0 : -1));
                boolean z2 = i2 == 0 || nanos2 > 1000;
                if (i2 > 0) {
                    String valueOf = String.valueOf(concat);
                    StringBuilder sb3 = new StringBuilder(valueOf.length() + 21 + String.valueOf(lowerCase).length());
                    sb3.append(valueOf);
                    sb3.append(convert);
                    sb3.append(" ");
                    sb3.append(lowerCase);
                    String sb4 = sb3.toString();
                    if (z2) {
                        sb4 = String.valueOf(sb4).concat(",");
                    }
                    concat = String.valueOf(sb4).concat(" ");
                }
                if (z2) {
                    String valueOf2 = String.valueOf(concat);
                    StringBuilder sb5 = new StringBuilder(valueOf2.length() + 33);
                    sb5.append(valueOf2);
                    sb5.append(nanos2);
                    sb5.append(" nanoseconds ");
                    concat = sb5.toString();
                }
                sb2 = String.valueOf(concat).concat("delay)");
            }
            if (isDone()) {
                throw new TimeoutException(String.valueOf(sb2).concat(" but future completed as timeout expired"));
            }
            StringBuilder sb6 = new StringBuilder(String.valueOf(sb2).length() + 5 + String.valueOf(abstractFuture).length());
            sb6.append(sb2);
            sb6.append(" for ");
            sb6.append(abstractFuture);
            throw new TimeoutException(sb6.toString());
        }
        throw new InterruptedException();
    }

    public boolean isCancelled() {
        return this.f29285z instanceof Cancellation;
    }

    public boolean isDone() {
        Object obj = this.f29285z;
        return (!(obj instanceof SetFuture)) & (obj != null);
    }

    public final void k(StringBuilder sb) {
        try {
            Object v2 = v(this);
            sb.append("SUCCESS, result=[");
            n(sb, v2);
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

    public final void l(StringBuilder sb) {
        String str;
        int length = sb.length();
        sb.append("PENDING");
        Object obj = this.f29285z;
        if (obj instanceof SetFuture) {
            sb.append(", setFuture=[");
            o(sb, ((SetFuture) obj).f29301A);
            sb.append("]");
        } else {
            try {
                str = Strings.a(y());
            } catch (RuntimeException | StackOverflowError e2) {
                String valueOf = String.valueOf(e2.getClass());
                StringBuilder sb2 = new StringBuilder(valueOf.length() + 38);
                sb2.append("Exception thrown from implementation: ");
                sb2.append(valueOf);
                str = sb2.toString();
            }
            if (str != null) {
                sb.append(", info=[");
                sb.append(str);
                sb.append("]");
            }
        }
        if (isDone()) {
            sb.delete(length, sb.length());
            k(sb);
        }
    }

    public void m() {
    }

    public final void n(StringBuilder sb, Object obj) {
        if (obj == null) {
            sb.append("null");
        } else if (obj == this) {
            sb.append("this future");
        } else {
            sb.append(obj.getClass().getName());
            sb.append("@");
            sb.append(Integer.toHexString(System.identityHashCode(obj)));
        }
    }

    public final void o(StringBuilder sb, Object obj) {
        if (obj == this) {
            try {
                sb.append("this future");
            } catch (RuntimeException e2) {
                e = e2;
                sb.append("Exception thrown from implementation: ");
                sb.append(e.getClass());
            } catch (StackOverflowError e3) {
                e = e3;
                sb.append("Exception thrown from implementation: ");
                sb.append(e.getClass());
            }
        } else {
            sb.append(obj);
        }
    }

    public final Listener q(Listener listener) {
        Listener listener2 = listener;
        Listener d2 = E.d(this, Listener.f29292d);
        while (d2 != null) {
            Listener listener3 = d2.f29295c;
            d2.f29295c = listener2;
            listener2 = d2;
            d2 = listener3;
        }
        return listener2;
    }

    public final Object t(Object obj) {
        if (obj instanceof Cancellation) {
            throw p("Task was cancelled.", ((Cancellation) obj).f29289b);
        } else if (!(obj instanceof Failure)) {
            return obj == F ? NullnessCasts.b() : obj;
        } else {
            throw new ExecutionException(((Failure) obj).f29291a);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb.append(getClass().getSimpleName());
        } else {
            sb.append(getClass().getName());
        }
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            k(sb);
        } else {
            l(sb);
        }
        sb.append("]");
        return sb.toString();
    }

    public void w() {
    }

    public final void x(Future future) {
        if ((future != null) && isCancelled()) {
            future.cancel(F());
        }
    }

    public String y() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        long delay = ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS);
        StringBuilder sb = new StringBuilder(41);
        sb.append("remaining delay=[");
        sb.append(delay);
        sb.append(" ms]");
        return sb.toString();
    }

    public final void z() {
        for (Waiter e2 = E.e(this, Waiter.f29309c); e2 != null; e2 = e2.f29311b) {
            e2.b();
        }
    }

    public static final class Listener {

        /* renamed from: d  reason: collision with root package name */
        public static final Listener f29292d = new Listener();

        /* renamed from: a  reason: collision with root package name */
        public final Runnable f29293a;

        /* renamed from: b  reason: collision with root package name */
        public final Executor f29294b;

        /* renamed from: c  reason: collision with root package name */
        public Listener f29295c;

        public Listener(Runnable runnable, Executor executor) {
            this.f29293a = runnable;
            this.f29294b = executor;
        }

        public Listener() {
            this.f29293a = null;
            this.f29294b = null;
        }
    }

    public Object get() {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f29285z;
            if ((obj2 != null) && (!(obj2 instanceof SetFuture))) {
                return t(obj2);
            }
            Waiter waiter = this.f29284B;
            if (waiter != Waiter.f29309c) {
                Waiter waiter2 = new Waiter();
                do {
                    waiter2.a(waiter);
                    if (E.c(this, waiter, waiter2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f29285z;
                            } else {
                                A(waiter2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof SetFuture))));
                        return t(obj);
                    }
                    waiter = this.f29284B;
                } while (waiter != Waiter.f29309c);
            }
            Object obj3 = this.f29285z;
            Objects.requireNonNull(obj3);
            return t(obj3);
        }
        throw new InterruptedException();
    }
}
