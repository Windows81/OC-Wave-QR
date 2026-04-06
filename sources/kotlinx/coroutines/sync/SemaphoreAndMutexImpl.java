package kotlinx.coroutines.sync;

import androidx.concurrent.futures.a;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CancellableContinuationKt;
import kotlinx.coroutines.Waiter;
import kotlinx.coroutines.channels.d;
import kotlinx.coroutines.internal.ConcurrentLinkedListKt;
import kotlinx.coroutines.internal.Segment;
import kotlinx.coroutines.internal.SegmentOrClosed;
import kotlinx.coroutines.selects.SelectInstance;

@Metadata
public class SemaphoreAndMutexImpl {

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f41968c;

    /* renamed from: d  reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f41969d;

    /* renamed from: e  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f41970e;

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f41971f;

    /* renamed from: g  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f41972g;
    private volatile /* synthetic */ int _availablePermits$volatile;

    /* renamed from: a  reason: collision with root package name */
    public final int f41973a;

    /* renamed from: b  reason: collision with root package name */
    public final Function3 f41974b;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    static {
        Class<SemaphoreAndMutexImpl> cls = SemaphoreAndMutexImpl.class;
        Class<Object> cls2 = Object.class;
        f41968c = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "head$volatile");
        f41969d = AtomicLongFieldUpdater.newUpdater(cls, "deqIdx$volatile");
        f41970e = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "tail$volatile");
        f41971f = AtomicLongFieldUpdater.newUpdater(cls, "enqIdx$volatile");
        f41972g = AtomicIntegerFieldUpdater.newUpdater(cls, "_availablePermits$volatile");
    }

    public SemaphoreAndMutexImpl(int i2, int i3) {
        this.f41973a = i2;
        if (i2 <= 0) {
            throw new IllegalArgumentException(("Semaphore should have at least 1 permit, but had " + i2).toString());
        } else if (i3 < 0 || i3 > i2) {
            throw new IllegalArgumentException(("The number of acquired permits should be in 0.." + i2).toString());
        } else {
            SemaphoreSegment semaphoreSegment = new SemaphoreSegment(0, (SemaphoreSegment) null, 2);
            this.head$volatile = semaphoreSegment;
            this.tail$volatile = semaphoreSegment;
            this._availablePermits$volatile = i2 - i3;
            this.f41974b = new e(this);
        }
    }

    public static final Unit u(SemaphoreAndMutexImpl semaphoreAndMutexImpl, Throwable th, Unit unit, CoroutineContext coroutineContext) {
        semaphoreAndMutexImpl.g();
        return Unit.f40552a;
    }

    public final Object c(Continuation continuation) {
        if (m() > 0) {
            return Unit.f40552a;
        }
        Object j2 = j(continuation);
        return j2 == IntrinsicsKt.f() ? j2 : Unit.f40552a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void g() {
        /*
            r3 = this;
        L_0x0000:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = f41972g
            int r0 = r0.getAndIncrement(r3)
            int r1 = r3.f41973a
            if (r0 >= r1) goto L_0x0016
            if (r0 < 0) goto L_0x000f
            return
        L_0x000f:
            boolean r0 = r3.x()
            if (r0 == 0) goto L_0x0000
            return
        L_0x0016:
            r3.l()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "The number of released permits cannot be greater than "
            r1.append(r2)
            int r2 = r3.f41973a
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.sync.SemaphoreAndMutexImpl.g():void");
    }

    public final void i(CancellableContinuation cancellableContinuation) {
        while (m() <= 0) {
            Intrinsics.g(cancellableContinuation, "null cannot be cast to non-null type kotlinx.coroutines.Waiter");
            if (k((Waiter) cancellableContinuation)) {
                return;
            }
        }
        cancellableContinuation.w(Unit.f40552a, this.f41974b);
    }

    public final Object j(Continuation continuation) {
        CancellableContinuationImpl b2 = CancellableContinuationKt.b(IntrinsicsKt.c(continuation));
        try {
            if (!k(b2)) {
                i(b2);
            }
            Object A2 = b2.A();
            if (A2 == IntrinsicsKt.f()) {
                DebugProbesKt.c(continuation);
            }
            return A2 == IntrinsicsKt.f() ? A2 : Unit.f40552a;
        } catch (Throwable th) {
            b2.R();
            throw th;
        }
    }

    public final boolean k(Waiter waiter) {
        Object c2;
        SemaphoreSegment semaphoreSegment = (SemaphoreSegment) f41970e.get(this);
        long andIncrement = f41971f.getAndIncrement(this);
        SemaphoreAndMutexImpl$addAcquireToQueue$createNewSegment$1 semaphoreAndMutexImpl$addAcquireToQueue$createNewSegment$1 = SemaphoreAndMutexImpl$addAcquireToQueue$createNewSegment$1.I;
        AtomicReferenceFieldUpdater r2 = f41970e;
        long h2 = andIncrement / ((long) SemaphoreKt.f41980f);
        loop0:
        while (true) {
            c2 = ConcurrentLinkedListKt.c(semaphoreSegment, h2, semaphoreAndMutexImpl$addAcquireToQueue$createNewSegment$1);
            if (SegmentOrClosed.e(c2)) {
                break;
            }
            Segment c3 = SegmentOrClosed.c(c2);
            while (true) {
                Segment segment = (Segment) r2.get(this);
                if (segment.f41864B >= c3.f41864B) {
                    break loop0;
                } else if (c3.u()) {
                    if (a.a(r2, this, segment, c3)) {
                        if (segment.p()) {
                            segment.n();
                        }
                    } else if (c3.p()) {
                        c3.n();
                    }
                }
            }
        }
        SemaphoreSegment semaphoreSegment2 = (SemaphoreSegment) SegmentOrClosed.c(c2);
        int h3 = (int) (andIncrement % ((long) SemaphoreKt.f41980f));
        if (d.a(semaphoreSegment2.v(), h3, (Object) null, waiter)) {
            waiter.c(semaphoreSegment2, h3);
            return true;
        }
        if (!d.a(semaphoreSegment2.v(), h3, SemaphoreKt.f41976b, SemaphoreKt.f41977c)) {
            return false;
        }
        if (waiter instanceof CancellableContinuation) {
            Intrinsics.g(waiter, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            ((CancellableContinuation) waiter).w(Unit.f40552a, this.f41974b);
        } else if (waiter instanceof SelectInstance) {
            ((SelectInstance) waiter).h(Unit.f40552a);
        } else {
            throw new IllegalStateException(("unexpected: " + waiter).toString());
        }
        return true;
    }

    /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public final void l() {
        /*
            r3 = this;
        L_0x0000:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = f41972g
            int r0 = r0.get(r3)
            int r1 = r3.f41973a
            if (r0 <= r1) goto L_0x0018
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = f41972g
            int r2 = r3.f41973a
            boolean r0 = r1.compareAndSet(r3, r0, r2)
            if (r0 == 0) goto L_0x0000
        L_0x0018:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.sync.SemaphoreAndMutexImpl.l():void");
    }

    public final int m() {
        int andDecrement;
        do {
            andDecrement = f41972g.getAndDecrement(this);
        } while (andDecrement > this.f41973a);
        return andDecrement;
    }

    public final int n() {
        return Math.max(f41972g.get(this), 0);
    }

    public final void t(SelectInstance selectInstance, Object obj) {
        while (m() <= 0) {
            Intrinsics.g(selectInstance, "null cannot be cast to non-null type kotlinx.coroutines.Waiter");
            if (k((Waiter) selectInstance)) {
                return;
            }
        }
        selectInstance.h(Unit.f40552a);
    }

    public final boolean v() {
        while (true) {
            int i2 = f41972g.get(this);
            if (i2 > this.f41973a) {
                l();
            } else if (i2 <= 0) {
                return false;
            } else {
                if (f41972g.compareAndSet(this, i2, i2 - 1)) {
                    return true;
                }
            }
        }
    }

    public final boolean w(Object obj) {
        if (obj instanceof CancellableContinuation) {
            Intrinsics.g(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            CancellableContinuation cancellableContinuation = (CancellableContinuation) obj;
            Object Z = cancellableContinuation.Z(Unit.f40552a, (Object) null, this.f41974b);
            if (Z == null) {
                return false;
            }
            cancellableContinuation.a0(Z);
            return true;
        } else if (obj instanceof SelectInstance) {
            return ((SelectInstance) obj).d(this, Unit.f40552a);
        } else {
            throw new IllegalStateException(("unexpected: " + obj).toString());
        }
    }

    public final boolean x() {
        Object c2;
        SemaphoreSegment semaphoreSegment = (SemaphoreSegment) f41968c.get(this);
        long andIncrement = f41969d.getAndIncrement(this);
        long h2 = andIncrement / ((long) SemaphoreKt.f41980f);
        SemaphoreAndMutexImpl$tryResumeNextFromQueue$createNewSegment$1 semaphoreAndMutexImpl$tryResumeNextFromQueue$createNewSegment$1 = SemaphoreAndMutexImpl$tryResumeNextFromQueue$createNewSegment$1.I;
        AtomicReferenceFieldUpdater q2 = f41968c;
        loop0:
        while (true) {
            c2 = ConcurrentLinkedListKt.c(semaphoreSegment, h2, semaphoreAndMutexImpl$tryResumeNextFromQueue$createNewSegment$1);
            if (SegmentOrClosed.e(c2)) {
                break;
            }
            Segment c3 = SegmentOrClosed.c(c2);
            while (true) {
                Segment segment = (Segment) q2.get(this);
                if (segment.f41864B >= c3.f41864B) {
                    break loop0;
                } else if (c3.u()) {
                    if (a.a(q2, this, segment, c3)) {
                        if (segment.p()) {
                            segment.n();
                        }
                    } else if (c3.p()) {
                        c3.n();
                    }
                }
            }
        }
        SemaphoreSegment semaphoreSegment2 = (SemaphoreSegment) SegmentOrClosed.c(c2);
        semaphoreSegment2.b();
        if (semaphoreSegment2.f41864B > h2) {
            return false;
        }
        int h3 = (int) (andIncrement % ((long) SemaphoreKt.f41980f));
        Object andSet = semaphoreSegment2.v().getAndSet(h3, SemaphoreKt.f41976b);
        if (andSet == null) {
            int f2 = SemaphoreKt.f41975a;
            for (int i2 = 0; i2 < f2; i2++) {
                if (semaphoreSegment2.v().get(h3) == SemaphoreKt.f41977c) {
                    return true;
                }
            }
            return !d.a(semaphoreSegment2.v(), h3, SemaphoreKt.f41976b, SemaphoreKt.f41978d);
        } else if (andSet == SemaphoreKt.f41979e) {
            return false;
        } else {
            return w(andSet);
        }
    }
}
