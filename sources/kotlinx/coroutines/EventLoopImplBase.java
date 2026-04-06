package kotlinx.coroutines;

import androidx.concurrent.futures.a;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.Delay;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import kotlinx.coroutines.internal.ThreadSafeHeap;
import kotlinx.coroutines.internal.ThreadSafeHeapNode;

@Metadata
public abstract class EventLoopImplBase extends EventLoopImplPlatform implements Delay {
    public static final /* synthetic */ AtomicReferenceFieldUpdater E;
    public static final /* synthetic */ AtomicReferenceFieldUpdater F;
    public static final /* synthetic */ AtomicIntegerFieldUpdater G;
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile;
    private volatile /* synthetic */ Object _queue$volatile;

    @Metadata
    public final class DelayedResumeTask extends DelayedTask {

        /* renamed from: B  reason: collision with root package name */
        public final CancellableContinuation f41404B;

        public DelayedResumeTask(long j2, CancellableContinuation cancellableContinuation) {
            super(j2);
            this.f41404B = cancellableContinuation;
        }

        public void run() {
            this.f41404B.P(EventLoopImplBase.this, Unit.f40552a);
        }

        public String toString() {
            return super.toString() + this.f41404B;
        }
    }

    @Metadata
    public static final class DelayedRunnableTask extends DelayedTask {

        /* renamed from: B  reason: collision with root package name */
        public final Runnable f41405B;

        public DelayedRunnableTask(long j2, Runnable runnable) {
            super(j2);
            this.f41405B = runnable;
        }

        public void run() {
            this.f41405B.run();
        }

        public String toString() {
            return super.toString() + this.f41405B;
        }
    }

    @Metadata
    public static abstract class DelayedTask implements Runnable, Comparable<DelayedTask>, DisposableHandle, ThreadSafeHeapNode {

        /* renamed from: A  reason: collision with root package name */
        public int f41406A = -1;
        private volatile Object _heap;

        /* renamed from: z  reason: collision with root package name */
        public long f41407z;

        public DelayedTask(long j2) {
            this.f41407z = j2;
        }

        public final void d() {
            synchronized (this) {
                try {
                    Object obj = this._heap;
                    if (obj != EventLoop_commonKt.f41409a) {
                        DelayedTaskQueue delayedTaskQueue = obj instanceof DelayedTaskQueue ? (DelayedTaskQueue) obj : null;
                        if (delayedTaskQueue != null) {
                            delayedTaskQueue.h(this);
                        }
                        this._heap = EventLoop_commonKt.f41409a;
                        Unit unit = Unit.f40552a;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public void f(ThreadSafeHeap threadSafeHeap) {
            if (this._heap != EventLoop_commonKt.f41409a) {
                this._heap = threadSafeHeap;
                return;
            }
            throw new IllegalArgumentException("Failed requirement.");
        }

        public int getIndex() {
            return this.f41406A;
        }

        public ThreadSafeHeap j() {
            Object obj = this._heap;
            if (obj instanceof ThreadSafeHeap) {
                return (ThreadSafeHeap) obj;
            }
            return null;
        }

        /* renamed from: k */
        public int compareTo(DelayedTask delayedTask) {
            int i2 = ((this.f41407z - delayedTask.f41407z) > 0 ? 1 : ((this.f41407z - delayedTask.f41407z) == 0 ? 0 : -1));
            if (i2 > 0) {
                return 1;
            }
            return i2 < 0 ? -1 : 0;
        }

        public final int l(long j2, DelayedTaskQueue delayedTaskQueue, EventLoopImplBase eventLoopImplBase) {
            synchronized (this) {
                if (this._heap == EventLoop_commonKt.f41409a) {
                    return 2;
                }
                synchronized (delayedTaskQueue) {
                    try {
                        DelayedTask delayedTask = (DelayedTask) delayedTaskQueue.b();
                        if (eventLoopImplBase.t()) {
                            return 1;
                        }
                        if (delayedTask == null) {
                            delayedTaskQueue.f41408c = j2;
                        } else {
                            long j3 = delayedTask.f41407z;
                            if (j3 - j2 < 0) {
                                j2 = j3;
                            }
                            if (j2 - delayedTaskQueue.f41408c > 0) {
                                delayedTaskQueue.f41408c = j2;
                            }
                        }
                        long j4 = this.f41407z;
                        long j5 = delayedTaskQueue.f41408c;
                        if (j4 - j5 < 0) {
                            this.f41407z = j5;
                        }
                        delayedTaskQueue.a(this);
                        return 0;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }

        public final boolean m(long j2) {
            return j2 - this.f41407z >= 0;
        }

        public void setIndex(int i2) {
            this.f41406A = i2;
        }

        public String toString() {
            return "Delayed[nanos=" + this.f41407z + ']';
        }
    }

    @Metadata
    public static final class DelayedTaskQueue extends ThreadSafeHeap<DelayedTask> {

        /* renamed from: c  reason: collision with root package name */
        public long f41408c;

        public DelayedTaskQueue(long j2) {
            this.f41408c = j2;
        }
    }

    static {
        Class<EventLoopImplBase> cls = EventLoopImplBase.class;
        Class<Object> cls2 = Object.class;
        E = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_queue$volatile");
        F = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_delayed$volatile");
        G = AtomicIntegerFieldUpdater.newUpdater(cls, "_isCompleted$volatile");
    }

    /* access modifiers changed from: private */
    public final boolean t() {
        return G.get(this) == 1;
    }

    public final void K1() {
        AtomicReferenceFieldUpdater R1 = E;
        while (true) {
            Object obj = R1.get(this);
            if (obj == null) {
                if (a.a(E, this, (Object) null, EventLoop_commonKt.f41410b)) {
                    return;
                }
            } else if (obj instanceof LockFreeTaskQueueCore) {
                ((LockFreeTaskQueueCore) obj).d();
                return;
            } else if (obj != EventLoop_commonKt.f41410b) {
                LockFreeTaskQueueCore lockFreeTaskQueueCore = new LockFreeTaskQueueCore(8, true);
                Intrinsics.g(obj, "null cannot be cast to non-null type java.lang.Runnable");
                lockFreeTaskQueueCore.a((Runnable) obj);
                if (a.a(E, this, obj, lockFreeTaskQueueCore)) {
                    return;
                }
            } else {
                return;
            }
        }
    }

    public final Runnable L1() {
        AtomicReferenceFieldUpdater R1 = E;
        while (true) {
            Object obj = R1.get(this);
            if (obj == null) {
                return null;
            }
            if (obj instanceof LockFreeTaskQueueCore) {
                Intrinsics.g(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable>");
                LockFreeTaskQueueCore lockFreeTaskQueueCore = (LockFreeTaskQueueCore) obj;
                Object m2 = lockFreeTaskQueueCore.m();
                if (m2 != LockFreeTaskQueueCore.f41850h) {
                    return (Runnable) m2;
                }
                a.a(E, this, obj, lockFreeTaskQueueCore.l());
            } else if (obj == EventLoop_commonKt.f41410b) {
                return null;
            } else {
                if (a.a(E, this, obj, (Object) null)) {
                    Intrinsics.g(obj, "null cannot be cast to non-null type java.lang.Runnable");
                    return (Runnable) obj;
                }
            }
        }
    }

    public void M1(Runnable runnable) {
        N1();
        if (O1(runnable)) {
            I1();
        } else {
            DefaultExecutor.H.M1(runnable);
        }
    }

    public final void N1() {
        ThreadSafeHeapNode threadSafeHeapNode;
        DelayedTaskQueue delayedTaskQueue = (DelayedTaskQueue) F.get(this);
        if (delayedTaskQueue != null && !delayedTaskQueue.e()) {
            AbstractTimeSource a2 = AbstractTimeSourceKt.f41360a;
            long a3 = a2 != null ? a2.a() : System.nanoTime();
            do {
                synchronized (delayedTaskQueue) {
                    try {
                        ThreadSafeHeapNode b2 = delayedTaskQueue.b();
                        threadSafeHeapNode = null;
                        if (b2 != null) {
                            DelayedTask delayedTask = (DelayedTask) b2;
                            if (delayedTask.m(a3) ? O1(delayedTask) : false) {
                                threadSafeHeapNode = delayedTaskQueue.i(0);
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } while (((DelayedTask) threadSafeHeapNode) != null);
        }
    }

    public DisposableHandle O(long j2, Runnable runnable, CoroutineContext coroutineContext) {
        return Delay.DefaultImpls.a(this, j2, runnable, coroutineContext);
    }

    public final boolean O1(Runnable runnable) {
        AtomicReferenceFieldUpdater R1 = E;
        while (true) {
            Object obj = R1.get(this);
            if (t()) {
                return false;
            }
            if (obj == null) {
                if (a.a(E, this, (Object) null, runnable)) {
                    return true;
                }
            } else if (obj instanceof LockFreeTaskQueueCore) {
                Intrinsics.g(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable>");
                LockFreeTaskQueueCore lockFreeTaskQueueCore = (LockFreeTaskQueueCore) obj;
                int a2 = lockFreeTaskQueueCore.a(runnable);
                if (a2 == 0) {
                    return true;
                }
                if (a2 == 1) {
                    a.a(E, this, obj, lockFreeTaskQueueCore.l());
                } else if (a2 == 2) {
                    return false;
                }
            } else if (obj == EventLoop_commonKt.f41410b) {
                return false;
            } else {
                LockFreeTaskQueueCore lockFreeTaskQueueCore2 = new LockFreeTaskQueueCore(8, true);
                Intrinsics.g(obj, "null cannot be cast to non-null type java.lang.Runnable");
                lockFreeTaskQueueCore2.a((Runnable) obj);
                lockFreeTaskQueueCore2.a(runnable);
                if (a.a(E, this, obj, lockFreeTaskQueueCore2)) {
                    return true;
                }
            }
        }
    }

    public boolean S1() {
        if (!q1()) {
            return false;
        }
        DelayedTaskQueue delayedTaskQueue = (DelayedTaskQueue) F.get(this);
        if (delayedTaskQueue != null && !delayedTaskQueue.e()) {
            return false;
        }
        Object obj = E.get(this);
        if (obj != null) {
            if (obj instanceof LockFreeTaskQueueCore) {
                return ((LockFreeTaskQueueCore) obj).j();
            }
            if (obj != EventLoop_commonKt.f41410b) {
                return false;
            }
        }
        return true;
    }

    public final void T1() {
        DelayedTask delayedTask;
        AbstractTimeSource a2 = AbstractTimeSourceKt.f41360a;
        long a3 = a2 != null ? a2.a() : System.nanoTime();
        while (true) {
            DelayedTaskQueue delayedTaskQueue = (DelayedTaskQueue) F.get(this);
            if (delayedTaskQueue != null && (delayedTask = (DelayedTask) delayedTaskQueue.j()) != null) {
                H1(a3, delayedTask);
            } else {
                return;
            }
        }
    }

    public long U0() {
        DelayedTask delayedTask;
        if (super.U0() == 0) {
            return 0;
        }
        Object obj = E.get(this);
        if (obj != null) {
            if (!(obj instanceof LockFreeTaskQueueCore)) {
                return obj == EventLoop_commonKt.f41410b ? Long.MAX_VALUE : 0;
            }
            if (!((LockFreeTaskQueueCore) obj).j()) {
                return 0;
            }
        }
        DelayedTaskQueue delayedTaskQueue = (DelayedTaskQueue) F.get(this);
        if (delayedTaskQueue == null || (delayedTask = (DelayedTask) delayedTaskQueue.f()) == null) {
            return Long.MAX_VALUE;
        }
        long j2 = delayedTask.f41407z;
        AbstractTimeSource a2 = AbstractTimeSourceKt.f41360a;
        return RangesKt.f(j2 - (a2 != null ? a2.a() : System.nanoTime()), 0);
    }

    public final void U1() {
        E.set(this, (Object) null);
        F.set(this, (Object) null);
    }

    public final void V1(long j2, DelayedTask delayedTask) {
        int W1 = W1(j2, delayedTask);
        if (W1 != 0) {
            if (W1 == 1) {
                H1(j2, delayedTask);
            } else if (W1 != 2) {
                throw new IllegalStateException("unexpected result");
            }
        } else if (Z1(delayedTask)) {
            I1();
        }
    }

    public final int W1(long j2, DelayedTask delayedTask) {
        if (t()) {
            return 1;
        }
        DelayedTaskQueue delayedTaskQueue = (DelayedTaskQueue) F.get(this);
        if (delayedTaskQueue == null) {
            a.a(F, this, (Object) null, new DelayedTaskQueue(j2));
            Object obj = F.get(this);
            Intrinsics.f(obj);
            delayedTaskQueue = (DelayedTaskQueue) obj;
        }
        return delayedTask.l(j2, delayedTaskQueue, this);
    }

    public final DisposableHandle X1(long j2, Runnable runnable) {
        long d2 = EventLoop_commonKt.d(j2);
        if (d2 >= 4611686018427387903L) {
            return NonDisposableHandle.f41433z;
        }
        AbstractTimeSource a2 = AbstractTimeSourceKt.f41360a;
        long a3 = a2 != null ? a2.a() : System.nanoTime();
        DelayedRunnableTask delayedRunnableTask = new DelayedRunnableTask(d2 + a3, runnable);
        V1(a3, delayedRunnableTask);
        return delayedRunnableTask;
    }

    public final void Y1(boolean z2) {
        G.set(this, z2 ? 1 : 0);
    }

    public final boolean Z1(DelayedTask delayedTask) {
        DelayedTaskQueue delayedTaskQueue = (DelayedTaskQueue) F.get(this);
        return (delayedTaskQueue != null ? (DelayedTask) delayedTaskQueue.f() : null) == delayedTask;
    }

    public void f(long j2, CancellableContinuation cancellableContinuation) {
        long d2 = EventLoop_commonKt.d(j2);
        if (d2 < 4611686018427387903L) {
            AbstractTimeSource a2 = AbstractTimeSourceKt.f41360a;
            long a3 = a2 != null ? a2.a() : System.nanoTime();
            DelayedResumeTask delayedResumeTask = new DelayedResumeTask(d2 + a3, cancellableContinuation);
            V1(a3, delayedResumeTask);
            CancellableContinuationKt.a(cancellableContinuation, delayedResumeTask);
        }
    }

    public final void o0(CoroutineContext coroutineContext, Runnable runnable) {
        M1(runnable);
    }

    public void shutdown() {
        ThreadLocalEventLoop.f41437a.c();
        Y1(true);
        K1();
        do {
        } while (w1() <= 0);
        T1();
    }

    public long w1() {
        if (E1()) {
            return 0;
        }
        N1();
        Runnable L1 = L1();
        if (L1 == null) {
            return U0();
        }
        L1.run();
        return 0;
    }
}
