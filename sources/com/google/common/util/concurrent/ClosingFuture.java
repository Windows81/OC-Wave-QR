package com.google.common.util.concurrent;

import androidx.compose.animation.core.h;
import com.google.common.base.Function;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.errorprone.annotations.DoNotMock;
import java.io.Closeable;
import java.io.IOException;
import java.util.IdentityHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;

@ElementTypesAreNonnullByDefault
@DoNotMock
public final class ClosingFuture<V> {

    /* renamed from: d  reason: collision with root package name */
    public static final Logger f29380d = Logger.getLogger(ClosingFuture.class.getName());

    /* renamed from: a  reason: collision with root package name */
    public final AtomicReference f29381a = new AtomicReference(State.OPEN);

    /* renamed from: b  reason: collision with root package name */
    public final CloseableList f29382b = new CloseableList((AnonymousClass1) null);

    /* renamed from: c  reason: collision with root package name */
    public final FluentFuture f29383c;

    /* renamed from: com.google.common.util.concurrent.ClosingFuture$1  reason: invalid class name */
    class AnonymousClass1 implements FutureCallback<Closeable> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ClosingFuture f29384a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Executor f29385b;

        public void b(Throwable th) {
        }

        /* renamed from: c */
        public void a(Closeable closeable) {
            this.f29384a.f29382b.f29406z.a(closeable, this.f29385b);
        }
    }

    /* renamed from: com.google.common.util.concurrent.ClosingFuture$10  reason: invalid class name */
    class AnonymousClass10 implements Runnable {

        /* renamed from: A  reason: collision with root package name */
        public final /* synthetic */ ClosingFuture f29386A;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ ValueAndCloserConsumer f29387z;

        public void run() {
            ClosingFuture.p(this.f29387z, this.f29386A);
        }
    }

    /* renamed from: com.google.common.util.concurrent.ClosingFuture$12  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass12 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f29389a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.google.common.util.concurrent.ClosingFuture$State[] r0 = com.google.common.util.concurrent.ClosingFuture.State.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f29389a = r0
                com.google.common.util.concurrent.ClosingFuture$State r1 = com.google.common.util.concurrent.ClosingFuture.State.SUBSUMED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f29389a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.common.util.concurrent.ClosingFuture$State r1 = com.google.common.util.concurrent.ClosingFuture.State.WILL_CREATE_VALUE_AND_CLOSER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f29389a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.common.util.concurrent.ClosingFuture$State r1 = com.google.common.util.concurrent.ClosingFuture.State.WILL_CLOSE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f29389a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.common.util.concurrent.ClosingFuture$State r1 = com.google.common.util.concurrent.ClosingFuture.State.CLOSING     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f29389a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.common.util.concurrent.ClosingFuture$State r1 = com.google.common.util.concurrent.ClosingFuture.State.CLOSED     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f29389a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.common.util.concurrent.ClosingFuture$State r1 = com.google.common.util.concurrent.ClosingFuture.State.OPEN     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.util.concurrent.ClosingFuture.AnonymousClass12.<clinit>():void");
        }
    }

    /* renamed from: com.google.common.util.concurrent.ClosingFuture$2  reason: invalid class name */
    class AnonymousClass2 implements Callable<Object> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ClosingCallable f29390a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ClosingFuture f29391b;

        public Object call() {
            return this.f29390a.a(this.f29391b.f29382b.f29406z);
        }

        public String toString() {
            return this.f29390a.toString();
        }
    }

    /* renamed from: com.google.common.util.concurrent.ClosingFuture$3  reason: invalid class name */
    class AnonymousClass3 implements AsyncCallable<Object> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AsyncClosingCallable f29392a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ClosingFuture f29393b;

        public ListenableFuture call() {
            CloseableList closeableList = new CloseableList((AnonymousClass1) null);
            try {
                ClosingFuture a2 = this.f29392a.a(closeableList.f29406z);
                a2.i(this.f29393b.f29382b);
                return a2.f29383c;
            } finally {
                this.f29393b.f29382b.c(closeableList, MoreExecutors.a());
            }
        }

        public String toString() {
            return this.f29392a.toString();
        }
    }

    /* renamed from: com.google.common.util.concurrent.ClosingFuture$4  reason: invalid class name */
    class AnonymousClass4 implements AsyncFunction<Object, Object> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ClosingFunction f29394a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ClosingFuture f29395b;

        public ListenableFuture apply(Object obj) {
            return this.f29395b.f29382b.g(this.f29394a, obj);
        }

        public String toString() {
            return this.f29394a.toString();
        }
    }

    /* renamed from: com.google.common.util.concurrent.ClosingFuture$5  reason: invalid class name */
    class AnonymousClass5 implements AsyncFunction<Object, Object> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AsyncClosingFunction f29396a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ClosingFuture f29397b;

        public ListenableFuture apply(Object obj) {
            return this.f29397b.f29382b.f(this.f29396a, obj);
        }

        public String toString() {
            return this.f29396a.toString();
        }
    }

    /* renamed from: com.google.common.util.concurrent.ClosingFuture$6  reason: invalid class name */
    class AnonymousClass6 implements AsyncClosingFunction<Object, Object> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AsyncFunction f29398a;

        public ClosingFuture a(DeferredCloser deferredCloser, Object obj) {
            return ClosingFuture.o(this.f29398a.apply(obj));
        }
    }

    /* renamed from: com.google.common.util.concurrent.ClosingFuture$7  reason: invalid class name */
    class AnonymousClass7 implements AsyncFunction<Throwable, Object> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ClosingFunction f29399a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ClosingFuture f29400b;

        /* renamed from: a */
        public ListenableFuture apply(Throwable th) {
            return this.f29400b.f29382b.g(this.f29399a, th);
        }

        public String toString() {
            return this.f29399a.toString();
        }
    }

    /* renamed from: com.google.common.util.concurrent.ClosingFuture$8  reason: invalid class name */
    class AnonymousClass8 implements AsyncFunction<Throwable, Object> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AsyncClosingFunction f29401a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ClosingFuture f29402b;

        /* renamed from: a */
        public ListenableFuture apply(Throwable th) {
            return this.f29402b.f29382b.f(this.f29401a, th);
        }

        public String toString() {
            return this.f29401a.toString();
        }
    }

    public interface AsyncClosingCallable<V> {
        ClosingFuture a(DeferredCloser deferredCloser);
    }

    public interface AsyncClosingFunction<T, U> {
        ClosingFuture a(DeferredCloser deferredCloser, Object obj);
    }

    public interface ClosingCallable<V> {
        Object a(DeferredCloser deferredCloser);
    }

    public interface ClosingFunction<T, U> {
        Object a(DeferredCloser deferredCloser, Object obj);
    }

    @DoNotMock
    public static class Combiner {

        /* renamed from: c  reason: collision with root package name */
        public static final Function f29407c = new Function<ClosingFuture<?>, FluentFuture<?>>() {
            /* renamed from: a */
            public FluentFuture apply(ClosingFuture closingFuture) {
                return closingFuture.f29383c;
            }
        };

        /* renamed from: a  reason: collision with root package name */
        public final CloseableList f29408a;

        /* renamed from: b  reason: collision with root package name */
        public final ImmutableList f29409b;

        /* renamed from: com.google.common.util.concurrent.ClosingFuture$Combiner$1  reason: invalid class name */
        class AnonymousClass1 implements Callable<Object> {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ CombiningCallable f29410a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ Combiner f29411b;

            public Object call() {
                return new Peeker(this.f29411b.f29409b, (AnonymousClass1) null).c(this.f29410a, this.f29411b.f29408a);
            }

            public String toString() {
                return this.f29410a.toString();
            }
        }

        /* renamed from: com.google.common.util.concurrent.ClosingFuture$Combiner$2  reason: invalid class name */
        class AnonymousClass2 implements AsyncCallable<Object> {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ AsyncCombiningCallable f29412a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ Combiner f29413b;

            public ListenableFuture call() {
                return new Peeker(this.f29413b.f29409b, (AnonymousClass1) null).d(this.f29412a, this.f29413b.f29408a);
            }

            public String toString() {
                return this.f29412a.toString();
            }
        }

        public interface AsyncCombiningCallable<V> {
            ClosingFuture a(DeferredCloser deferredCloser, Peeker peeker);
        }

        public interface CombiningCallable<V> {
            Object a(DeferredCloser deferredCloser, Peeker peeker);
        }
    }

    public static final class Combiner2<V1, V2> extends Combiner {

        /* renamed from: d  reason: collision with root package name */
        public final ClosingFuture f29414d;

        /* renamed from: e  reason: collision with root package name */
        public final ClosingFuture f29415e;

        /* renamed from: com.google.common.util.concurrent.ClosingFuture$Combiner2$1  reason: invalid class name */
        class AnonymousClass1 implements Combiner.CombiningCallable<Object> {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ ClosingFunction2 f29416a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ Combiner2 f29417b;

            public Object a(DeferredCloser deferredCloser, Peeker peeker) {
                return this.f29416a.a(deferredCloser, peeker.e(this.f29417b.f29414d), peeker.e(this.f29417b.f29415e));
            }

            public String toString() {
                return this.f29416a.toString();
            }
        }

        /* renamed from: com.google.common.util.concurrent.ClosingFuture$Combiner2$2  reason: invalid class name */
        class AnonymousClass2 implements Combiner.AsyncCombiningCallable<Object> {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ AsyncClosingFunction2 f29418a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ Combiner2 f29419b;

            public ClosingFuture a(DeferredCloser deferredCloser, Peeker peeker) {
                return this.f29418a.a(deferredCloser, peeker.e(this.f29419b.f29414d), peeker.e(this.f29419b.f29415e));
            }

            public String toString() {
                return this.f29418a.toString();
            }
        }

        public interface AsyncClosingFunction2<V1, V2, U> {
            ClosingFuture a(DeferredCloser deferredCloser, Object obj, Object obj2);
        }

        public interface ClosingFunction2<V1, V2, U> {
            Object a(DeferredCloser deferredCloser, Object obj, Object obj2);
        }
    }

    public static final class Combiner3<V1, V2, V3> extends Combiner {

        /* renamed from: d  reason: collision with root package name */
        public final ClosingFuture f29420d;

        /* renamed from: e  reason: collision with root package name */
        public final ClosingFuture f29421e;

        /* renamed from: f  reason: collision with root package name */
        public final ClosingFuture f29422f;

        /* renamed from: com.google.common.util.concurrent.ClosingFuture$Combiner3$1  reason: invalid class name */
        class AnonymousClass1 implements Combiner.CombiningCallable<Object> {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ ClosingFunction3 f29423a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ Combiner3 f29424b;

            public Object a(DeferredCloser deferredCloser, Peeker peeker) {
                return this.f29423a.a(deferredCloser, peeker.e(this.f29424b.f29420d), peeker.e(this.f29424b.f29421e), peeker.e(this.f29424b.f29422f));
            }

            public String toString() {
                return this.f29423a.toString();
            }
        }

        /* renamed from: com.google.common.util.concurrent.ClosingFuture$Combiner3$2  reason: invalid class name */
        class AnonymousClass2 implements Combiner.AsyncCombiningCallable<Object> {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ AsyncClosingFunction3 f29425a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ Combiner3 f29426b;

            public ClosingFuture a(DeferredCloser deferredCloser, Peeker peeker) {
                return this.f29425a.a(deferredCloser, peeker.e(this.f29426b.f29420d), peeker.e(this.f29426b.f29421e), peeker.e(this.f29426b.f29422f));
            }

            public String toString() {
                return this.f29425a.toString();
            }
        }

        public interface AsyncClosingFunction3<V1, V2, V3, U> {
            ClosingFuture a(DeferredCloser deferredCloser, Object obj, Object obj2, Object obj3);
        }

        public interface ClosingFunction3<V1, V2, V3, U> {
            Object a(DeferredCloser deferredCloser, Object obj, Object obj2, Object obj3);
        }
    }

    public static final class Combiner4<V1, V2, V3, V4> extends Combiner {

        /* renamed from: d  reason: collision with root package name */
        public final ClosingFuture f29427d;

        /* renamed from: e  reason: collision with root package name */
        public final ClosingFuture f29428e;

        /* renamed from: f  reason: collision with root package name */
        public final ClosingFuture f29429f;

        /* renamed from: g  reason: collision with root package name */
        public final ClosingFuture f29430g;

        /* renamed from: com.google.common.util.concurrent.ClosingFuture$Combiner4$1  reason: invalid class name */
        class AnonymousClass1 implements Combiner.CombiningCallable<Object> {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ ClosingFunction4 f29431a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ Combiner4 f29432b;

            public Object a(DeferredCloser deferredCloser, Peeker peeker) {
                return this.f29431a.a(deferredCloser, peeker.e(this.f29432b.f29427d), peeker.e(this.f29432b.f29428e), peeker.e(this.f29432b.f29429f), peeker.e(this.f29432b.f29430g));
            }

            public String toString() {
                return this.f29431a.toString();
            }
        }

        /* renamed from: com.google.common.util.concurrent.ClosingFuture$Combiner4$2  reason: invalid class name */
        class AnonymousClass2 implements Combiner.AsyncCombiningCallable<Object> {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ AsyncClosingFunction4 f29433a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ Combiner4 f29434b;

            public ClosingFuture a(DeferredCloser deferredCloser, Peeker peeker) {
                return this.f29433a.a(deferredCloser, peeker.e(this.f29434b.f29427d), peeker.e(this.f29434b.f29428e), peeker.e(this.f29434b.f29429f), peeker.e(this.f29434b.f29430g));
            }

            public String toString() {
                return this.f29433a.toString();
            }
        }

        public interface AsyncClosingFunction4<V1, V2, V3, V4, U> {
            ClosingFuture a(DeferredCloser deferredCloser, Object obj, Object obj2, Object obj3, Object obj4);
        }

        public interface ClosingFunction4<V1, V2, V3, V4, U> {
            Object a(DeferredCloser deferredCloser, Object obj, Object obj2, Object obj3, Object obj4);
        }
    }

    public static final class Combiner5<V1, V2, V3, V4, V5> extends Combiner {

        /* renamed from: d  reason: collision with root package name */
        public final ClosingFuture f29435d;

        /* renamed from: e  reason: collision with root package name */
        public final ClosingFuture f29436e;

        /* renamed from: f  reason: collision with root package name */
        public final ClosingFuture f29437f;

        /* renamed from: g  reason: collision with root package name */
        public final ClosingFuture f29438g;

        /* renamed from: h  reason: collision with root package name */
        public final ClosingFuture f29439h;

        /* renamed from: com.google.common.util.concurrent.ClosingFuture$Combiner5$1  reason: invalid class name */
        class AnonymousClass1 implements Combiner.CombiningCallable<Object> {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ ClosingFunction5 f29440a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ Combiner5 f29441b;

            public Object a(DeferredCloser deferredCloser, Peeker peeker) {
                return this.f29440a.a(deferredCloser, peeker.e(this.f29441b.f29435d), peeker.e(this.f29441b.f29436e), peeker.e(this.f29441b.f29437f), peeker.e(this.f29441b.f29438g), peeker.e(this.f29441b.f29439h));
            }

            public String toString() {
                return this.f29440a.toString();
            }
        }

        /* renamed from: com.google.common.util.concurrent.ClosingFuture$Combiner5$2  reason: invalid class name */
        class AnonymousClass2 implements Combiner.AsyncCombiningCallable<Object> {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ AsyncClosingFunction5 f29442a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ Combiner5 f29443b;

            public ClosingFuture a(DeferredCloser deferredCloser, Peeker peeker) {
                return this.f29442a.a(deferredCloser, peeker.e(this.f29443b.f29435d), peeker.e(this.f29443b.f29436e), peeker.e(this.f29443b.f29437f), peeker.e(this.f29443b.f29438g), peeker.e(this.f29443b.f29439h));
            }

            public String toString() {
                return this.f29442a.toString();
            }
        }

        public interface AsyncClosingFunction5<V1, V2, V3, V4, V5, U> {
            ClosingFuture a(DeferredCloser deferredCloser, Object obj, Object obj2, Object obj3, Object obj4, Object obj5);
        }

        public interface ClosingFunction5<V1, V2, V3, V4, V5, U> {
            Object a(DeferredCloser deferredCloser, Object obj, Object obj2, Object obj3, Object obj4, Object obj5);
        }
    }

    public static final class DeferredCloser {

        /* renamed from: a  reason: collision with root package name */
        public final CloseableList f29444a;

        public DeferredCloser(CloseableList closeableList) {
            this.f29444a = closeableList;
        }

        public Object a(Object obj, Executor executor) {
            Preconditions.q(executor);
            if (obj != null) {
                this.f29444a.c((Closeable) obj, executor);
            }
            return obj;
        }
    }

    public static final class Peeker {

        /* renamed from: a  reason: collision with root package name */
        public final ImmutableList f29445a;

        /* renamed from: b  reason: collision with root package name */
        public volatile boolean f29446b;

        public /* synthetic */ Peeker(ImmutableList immutableList, AnonymousClass1 r2) {
            this(immutableList);
        }

        public final Object c(Combiner.CombiningCallable combiningCallable, CloseableList closeableList) {
            this.f29446b = true;
            CloseableList closeableList2 = new CloseableList((AnonymousClass1) null);
            try {
                return combiningCallable.a(closeableList2.f29406z, this);
            } finally {
                closeableList.c(closeableList2, MoreExecutors.a());
                this.f29446b = false;
            }
        }

        public final FluentFuture d(Combiner.AsyncCombiningCallable asyncCombiningCallable, CloseableList closeableList) {
            this.f29446b = true;
            CloseableList closeableList2 = new CloseableList((AnonymousClass1) null);
            try {
                ClosingFuture a2 = asyncCombiningCallable.a(closeableList2.f29406z, this);
                a2.i(closeableList);
                return a2.f29383c;
            } finally {
                closeableList.c(closeableList2, MoreExecutors.a());
                this.f29446b = false;
            }
        }

        public final Object e(ClosingFuture closingFuture) {
            Preconditions.w(this.f29446b);
            Preconditions.d(this.f29445a.contains(closingFuture));
            return Futures.b(closingFuture.f29383c);
        }

        public Peeker(ImmutableList immutableList) {
            this.f29445a = (ImmutableList) Preconditions.q(immutableList);
        }
    }

    public enum State {
        OPEN,
        SUBSUMED,
        WILL_CLOSE,
        CLOSING,
        CLOSED,
        WILL_CREATE_VALUE_AND_CLOSER
    }

    public static final class ValueAndCloser<V> {

        /* renamed from: a  reason: collision with root package name */
        public final ClosingFuture f29450a;

        public ValueAndCloser(ClosingFuture closingFuture) {
            this.f29450a = (ClosingFuture) Preconditions.q(closingFuture);
        }
    }

    public interface ValueAndCloserConsumer<V> {
        void a(ValueAndCloser valueAndCloser);
    }

    public ClosingFuture(ListenableFuture listenableFuture) {
        this.f29383c = FluentFuture.G(listenableFuture);
    }

    public static void l(final Closeable closeable, Executor executor) {
        if (closeable != null) {
            try {
                executor.execute(new Runnable() {
                    public void run() {
                        try {
                            closeable.close();
                        } catch (IOException | RuntimeException e2) {
                            ClosingFuture.f29380d.log(Level.WARNING, "thrown by close()", e2);
                        }
                    }
                });
            } catch (RejectedExecutionException e2) {
                Logger logger = f29380d;
                Level level = Level.WARNING;
                if (logger.isLoggable(level)) {
                    logger.log(level, String.format("while submitting close to %s; will close inline", new Object[]{executor}), e2);
                }
                l(closeable, MoreExecutors.a());
            }
        }
    }

    public static ClosingFuture o(ListenableFuture listenableFuture) {
        return new ClosingFuture(listenableFuture);
    }

    public static void p(ValueAndCloserConsumer valueAndCloserConsumer, ClosingFuture closingFuture) {
        valueAndCloserConsumer.a(new ValueAndCloser(closingFuture));
    }

    public void finalize() {
        if (((State) this.f29381a.get()).equals(State.OPEN)) {
            f29380d.log(Level.SEVERE, "Uh oh! An open ClosingFuture has leaked and will close: {0}", this);
            n();
        }
    }

    public final void i(CloseableList closeableList) {
        j(State.OPEN, State.SUBSUMED);
        closeableList.c(this.f29382b, MoreExecutors.a());
    }

    public final void j(State state, State state2) {
        Preconditions.A(m(state, state2), "Expected state to be %s, but it was %s", state, state2);
    }

    public final void k() {
        f29380d.log(Level.FINER, "closing {0}", this);
        this.f29382b.close();
    }

    public final boolean m(State state, State state2) {
        return h.a(this.f29381a, state, state2);
    }

    public FluentFuture n() {
        if (m(State.OPEN, State.WILL_CLOSE)) {
            f29380d.log(Level.FINER, "will close {0}", this);
            this.f29383c.C(new Runnable() {
                public void run() {
                    ClosingFuture closingFuture = ClosingFuture.this;
                    State state = State.WILL_CLOSE;
                    State state2 = State.CLOSING;
                    closingFuture.j(state, state2);
                    ClosingFuture.this.k();
                    ClosingFuture.this.j(state2, State.CLOSED);
                }
            }, MoreExecutors.a());
        } else {
            switch (AnonymousClass12.f29389a[((State) this.f29381a.get()).ordinal()]) {
                case 1:
                    throw new IllegalStateException("Cannot call finishToFuture() after deriving another step");
                case 2:
                    throw new IllegalStateException("Cannot call finishToFuture() after calling finishToValueAndCloser()");
                case 3:
                case 4:
                case 5:
                    throw new IllegalStateException("Cannot call finishToFuture() twice");
                case 6:
                    throw new AssertionError();
            }
        }
        return this.f29383c;
    }

    public String toString() {
        return MoreObjects.c(this).d("state", this.f29381a.get()).j(this.f29383c).toString();
    }

    public static final class CloseableList extends IdentityHashMap<Closeable, Executor> implements Closeable {

        /* renamed from: A  reason: collision with root package name */
        public volatile boolean f29404A;

        /* renamed from: B  reason: collision with root package name */
        public volatile CountDownLatch f29405B;

        /* renamed from: z  reason: collision with root package name */
        public final DeferredCloser f29406z;

        public CloseableList() {
            this.f29406z = new DeferredCloser(this);
        }

        public void c(Closeable closeable, Executor executor) {
            Preconditions.q(executor);
            if (closeable != null) {
                synchronized (this) {
                    try {
                        if (!this.f29404A) {
                            put(closeable, executor);
                        } else {
                            ClosingFuture.l(closeable, executor);
                        }
                    } catch (Throwable th) {
                        while (true) {
                            throw th;
                        }
                    }
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0012, code lost:
            r0 = entrySet().iterator();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x001e, code lost:
            if (r0.hasNext() == false) goto L_0x0036;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0020, code lost:
            r1 = (java.util.Map.Entry) r0.next();
            com.google.common.util.concurrent.ClosingFuture.h((java.io.Closeable) r1.getKey(), (java.util.concurrent.Executor) r1.getValue());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0036, code lost:
            clear();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x003b, code lost:
            if (r3.f29405B == null) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x003d, code lost:
            r3.f29405B.countDown();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void close() {
            /*
                r3 = this;
                boolean r0 = r3.f29404A
                if (r0 == 0) goto L_0x0005
                return
            L_0x0005:
                monitor-enter(r3)
                boolean r0 = r3.f29404A     // Catch:{ all -> 0x000c }
                if (r0 == 0) goto L_0x000e
                monitor-exit(r3)     // Catch:{ all -> 0x000c }
                return
            L_0x000c:
                r0 = move-exception
                goto L_0x0043
            L_0x000e:
                r0 = 1
                r3.f29404A = r0     // Catch:{ all -> 0x000c }
                monitor-exit(r3)     // Catch:{ all -> 0x000c }
                java.util.Set r0 = r3.entrySet()
                java.util.Iterator r0 = r0.iterator()
            L_0x001a:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L_0x0036
                java.lang.Object r1 = r0.next()
                java.util.Map$Entry r1 = (java.util.Map.Entry) r1
                java.lang.Object r2 = r1.getKey()
                java.io.Closeable r2 = (java.io.Closeable) r2
                java.lang.Object r1 = r1.getValue()
                java.util.concurrent.Executor r1 = (java.util.concurrent.Executor) r1
                com.google.common.util.concurrent.ClosingFuture.l(r2, r1)
                goto L_0x001a
            L_0x0036:
                r3.clear()
                java.util.concurrent.CountDownLatch r0 = r3.f29405B
                if (r0 == 0) goto L_0x0042
                java.util.concurrent.CountDownLatch r0 = r3.f29405B
                r0.countDown()
            L_0x0042:
                return
            L_0x0043:
                monitor-exit(r3)     // Catch:{ all -> 0x000c }
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.util.concurrent.ClosingFuture.CloseableList.close():void");
        }

        public FluentFuture f(AsyncClosingFunction asyncClosingFunction, Object obj) {
            CloseableList closeableList = new CloseableList();
            try {
                ClosingFuture a2 = asyncClosingFunction.a(closeableList.f29406z, obj);
                a2.i(closeableList);
                return a2.f29383c;
            } finally {
                c(closeableList, MoreExecutors.a());
            }
        }

        public ListenableFuture g(ClosingFunction closingFunction, Object obj) {
            CloseableList closeableList = new CloseableList();
            try {
                return Futures.e(closingFunction.a(closeableList.f29406z, obj));
            } finally {
                c(closeableList, MoreExecutors.a());
            }
        }

        public /* synthetic */ CloseableList(AnonymousClass1 r1) {
            this();
        }
    }
}
