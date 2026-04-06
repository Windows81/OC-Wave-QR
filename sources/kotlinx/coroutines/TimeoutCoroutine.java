package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ScopeCoroutine;

@Metadata
final class TimeoutCoroutine<U, T extends U> extends ScopeCoroutine<T> implements Runnable {
    public final long D;

    public TimeoutCoroutine(long j2, Continuation continuation) {
        super(continuation.f(), continuation);
        this.D = j2;
    }

    public String T0() {
        return super.T0() + "(timeMillis=" + this.D + ')';
    }

    public void run() {
        k0(TimeoutKt.a(this.D, DelayKt.d(f()), this));
    }
}
