package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;

@Metadata
final class ResumeAwaitOnCompletion<T> extends JobNode {
    public final CancellableContinuationImpl D;

    public ResumeAwaitOnCompletion(CancellableContinuationImpl cancellableContinuationImpl) {
        this.D = cancellableContinuationImpl;
    }

    public boolean w() {
        return false;
    }

    public void x(Throwable th) {
        Object G0 = v().G0();
        if (G0 instanceof CompletedExceptionally) {
            CancellableContinuationImpl cancellableContinuationImpl = this.D;
            Result.Companion companion = Result.f40519A;
            cancellableContinuationImpl.q(Result.b(ResultKt.a(((CompletedExceptionally) G0).f41376a)));
            return;
        }
        CancellableContinuationImpl cancellableContinuationImpl2 = this.D;
        Result.Companion companion2 = Result.f40519A;
        cancellableContinuationImpl2.q(Result.b(JobSupportKt.h(G0)));
    }
}
