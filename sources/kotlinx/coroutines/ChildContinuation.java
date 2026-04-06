package kotlinx.coroutines;

import kotlin.Metadata;

@Metadata
final class ChildContinuation extends JobNode {
    public final CancellableContinuationImpl D;

    public ChildContinuation(CancellableContinuationImpl cancellableContinuationImpl) {
        this.D = cancellableContinuationImpl;
    }

    public boolean w() {
        return true;
    }

    public void x(Throwable th) {
        CancellableContinuationImpl cancellableContinuationImpl = this.D;
        cancellableContinuationImpl.Q(cancellableContinuationImpl.y(v()));
    }
}
