package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.DispatchedContinuation;

@Metadata
public final class CancellableContinuationKt {
    public static final void a(CancellableContinuation cancellableContinuation, DisposableHandle disposableHandle) {
        c(cancellableContinuation, new DisposeOnCancel(disposableHandle));
    }

    public static final CancellableContinuationImpl b(Continuation continuation) {
        if (!(continuation instanceof DispatchedContinuation)) {
            return new CancellableContinuationImpl(continuation, 1);
        }
        CancellableContinuationImpl l2 = ((DispatchedContinuation) continuation).l();
        if (l2 != null) {
            if (!l2.S()) {
                l2 = null;
            }
            if (l2 != null) {
                return l2;
            }
        }
        return new CancellableContinuationImpl(continuation, 2);
    }

    public static final void c(CancellableContinuation cancellableContinuation, CancelHandler cancelHandler) {
        if (cancellableContinuation instanceof CancellableContinuationImpl) {
            ((CancellableContinuationImpl) cancellableContinuation).K(cancelHandler);
            return;
        }
        throw new UnsupportedOperationException("third-party implementation of CancellableContinuation is not supported");
    }
}
