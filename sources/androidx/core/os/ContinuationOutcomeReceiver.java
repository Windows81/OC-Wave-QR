package androidx.core.os;

import android.os.OutcomeReceiver;
import java.lang.Throwable;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;

@Metadata
final class ContinuationOutcomeReceiver<R, E extends Throwable> extends AtomicBoolean implements OutcomeReceiver {

    /* renamed from: z  reason: collision with root package name */
    public final Continuation f19954z;

    public ContinuationOutcomeReceiver(Continuation continuation) {
        super(false);
        this.f19954z = continuation;
    }

    public void onError(Throwable th) {
        if (compareAndSet(false, true)) {
            Continuation continuation = this.f19954z;
            Result.Companion companion = Result.f40519A;
            continuation.q(Result.b(ResultKt.a(th)));
        }
    }

    public void onResult(Object obj) {
        if (compareAndSet(false, true)) {
            this.f19954z.q(Result.b(obj));
        }
    }

    public String toString() {
        return "ContinuationOutcomeReceiver(outcomeReceived = " + get() + ')';
    }
}
