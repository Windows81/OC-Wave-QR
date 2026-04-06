package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@Metadata
final class ResumeOnCompletion extends JobNode {
    public final Continuation D;

    public ResumeOnCompletion(Continuation continuation) {
        this.D = continuation;
    }

    public boolean w() {
        return false;
    }

    public void x(Throwable th) {
        Continuation continuation = this.D;
        Result.Companion companion = Result.f40519A;
        continuation.q(Result.b(Unit.f40552a));
    }
}
