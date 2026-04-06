package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.Unit;

@Metadata
final class ResumeUndispatchedRunnable implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public final CancellableContinuation f41435A;

    /* renamed from: z  reason: collision with root package name */
    public final CoroutineDispatcher f41436z;

    public ResumeUndispatchedRunnable(CoroutineDispatcher coroutineDispatcher, CancellableContinuation cancellableContinuation) {
        this.f41436z = coroutineDispatcher;
        this.f41435A = cancellableContinuation;
    }

    public void run() {
        this.f41435A.P(this.f41436z, Unit.f40552a);
    }
}
