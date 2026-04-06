package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.DefaultExecutorKt;
import kotlinx.coroutines.Delay;
import kotlinx.coroutines.DisposableHandle;

@Metadata
public final class LimitedDispatcher extends CoroutineDispatcher implements Delay {
    public static final /* synthetic */ AtomicIntegerFieldUpdater H = AtomicIntegerFieldUpdater.newUpdater(LimitedDispatcher.class, "runningWorkers$volatile");

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Delay f41840B;
    public final CoroutineDispatcher C;
    public final int D;
    public final String E;
    public final LockFreeTaskQueue F;
    public final Object G;
    private volatile /* synthetic */ int runningWorkers$volatile;

    @Metadata
    public final class Worker implements Runnable {

        /* renamed from: z  reason: collision with root package name */
        public Runnable f41842z;

        public Worker(Runnable runnable) {
            this.f41842z = runnable;
        }

        public void run() {
            int i2 = 0;
            while (true) {
                try {
                    this.f41842z.run();
                } catch (Throwable th) {
                    Object L0 = LimitedDispatcher.this.G;
                    LimitedDispatcher limitedDispatcher = LimitedDispatcher.this;
                    synchronized (L0) {
                        LimitedDispatcher.H.decrementAndGet(limitedDispatcher);
                        throw th;
                    }
                }
                Runnable S0 = LimitedDispatcher.this.W0();
                if (S0 != null) {
                    this.f41842z = S0;
                    i2++;
                    if (i2 >= 16 && DispatchedContinuationKt.d(LimitedDispatcher.this.C, LimitedDispatcher.this)) {
                        DispatchedContinuationKt.c(LimitedDispatcher.this.C, LimitedDispatcher.this, this);
                        return;
                    }
                } else {
                    return;
                }
            }
        }
    }

    public LimitedDispatcher(CoroutineDispatcher coroutineDispatcher, int i2, String str) {
        Delay delay = coroutineDispatcher instanceof Delay ? (Delay) coroutineDispatcher : null;
        this.f41840B = delay == null ? DefaultExecutorKt.a() : delay;
        this.C = coroutineDispatcher;
        this.D = i2;
        this.E = str;
        this.F = new LockFreeTaskQueue(false);
        this.G = new Object();
    }

    public CoroutineDispatcher E0(int i2, String str) {
        LimitedDispatcherKt.a(i2);
        return i2 >= this.D ? LimitedDispatcherKt.b(this, str) : super.E0(i2, str);
    }

    public DisposableHandle O(long j2, Runnable runnable, CoroutineContext coroutineContext) {
        return this.f41840B.O(j2, runnable, coroutineContext);
    }

    public final Runnable W0() {
        while (true) {
            Runnable runnable = (Runnable) this.F.e();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.G) {
                H.decrementAndGet(this);
                if (this.F.c() == 0) {
                    return null;
                }
                H.incrementAndGet(this);
            }
        }
    }

    public final boolean b1() {
        synchronized (this.G) {
            if (H.get(this) >= this.D) {
                return false;
            }
            H.incrementAndGet(this);
            return true;
        }
    }

    public void f(long j2, CancellableContinuation cancellableContinuation) {
        this.f41840B.f(j2, cancellableContinuation);
    }

    public void o0(CoroutineContext coroutineContext, Runnable runnable) {
        Runnable W0;
        this.F.a(runnable);
        if (H.get(this) < this.D && b1() && (W0 = W0()) != null) {
            try {
                DispatchedContinuationKt.c(this.C, this, new Worker(W0));
            } catch (Throwable th) {
                H.decrementAndGet(this);
                throw th;
            }
        }
    }

    public void t0(CoroutineContext coroutineContext, Runnable runnable) {
        Runnable W0;
        this.F.a(runnable);
        if (H.get(this) < this.D && b1() && (W0 = W0()) != null) {
            try {
                this.C.t0(this, new Worker(W0));
            } catch (Throwable th) {
                H.decrementAndGet(this);
                throw th;
            }
        }
    }

    public String toString() {
        String str = this.E;
        if (str != null) {
            return str;
        }
        return this.C + ".limitedParallelism(" + this.D + ')';
    }
}
