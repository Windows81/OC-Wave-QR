package androidx.core.util;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@Metadata
final class ContinuationRunnable extends AtomicBoolean implements Runnable {

    /* renamed from: z  reason: collision with root package name */
    public final Continuation f20144z;

    public void run() {
        if (compareAndSet(false, true)) {
            Continuation continuation = this.f20144z;
            Result.Companion companion = Result.f40519A;
            continuation.q(Result.b(Unit.f40552a));
        }
    }

    public String toString() {
        return "ContinuationRunnable(ran = " + get() + ')';
    }
}
