package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.coroutines.internal.DispatchedContinuationKt;
import kotlinx.coroutines.internal.ScopeCoroutine;

@Metadata
public final class DispatchedCoroutine<T> extends ScopeCoroutine<T> {
    public static final /* synthetic */ AtomicIntegerFieldUpdater D = AtomicIntegerFieldUpdater.newUpdater(DispatchedCoroutine.class, "_decision$volatile");
    private volatile /* synthetic */ int _decision$volatile;

    public DispatchedCoroutine(CoroutineContext coroutineContext, Continuation continuation) {
        super(coroutineContext, continuation);
    }

    private final boolean y1() {
        AtomicIntegerFieldUpdater x1 = D;
        do {
            int i2 = x1.get(this);
            if (i2 != 0) {
                if (i2 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed");
            }
        } while (!D.compareAndSet(this, 0, 2));
        return true;
    }

    private final boolean z1() {
        AtomicIntegerFieldUpdater x1 = D;
        do {
            int i2 = x1.get(this);
            if (i2 != 0) {
                if (i2 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended");
            }
        } while (!D.compareAndSet(this, 0, 1));
        return true;
    }

    public void h0(Object obj) {
        r1(obj);
    }

    public void r1(Object obj) {
        if (!y1()) {
            DispatchedContinuationKt.b(IntrinsicsKt.c(this.C), CompletionStateKt.a(obj, this.C));
        }
    }

    public final Object w1() {
        if (z1()) {
            return IntrinsicsKt.f();
        }
        Object h2 = JobSupportKt.h(G0());
        if (!(h2 instanceof CompletedExceptionally)) {
            return h2;
        }
        throw ((CompletedExceptionally) h2).f41376a;
    }
}
