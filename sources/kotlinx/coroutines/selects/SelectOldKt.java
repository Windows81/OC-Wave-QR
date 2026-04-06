package kotlinx.coroutines.selects;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CoroutineDispatcher;

@Metadata
public final class SelectOldKt {
    public static final void c(CancellableContinuation cancellableContinuation, Object obj) {
        CoroutineDispatcher coroutineDispatcher = (CoroutineDispatcher) cancellableContinuation.f().d(CoroutineDispatcher.f41377A);
        if (coroutineDispatcher != null) {
            cancellableContinuation.P(coroutineDispatcher, obj);
        } else {
            cancellableContinuation.q(Result.b(obj));
        }
    }

    public static final void d(CancellableContinuation cancellableContinuation, Throwable th) {
        CoroutineDispatcher coroutineDispatcher = (CoroutineDispatcher) cancellableContinuation.f().d(CoroutineDispatcher.f41377A);
        if (coroutineDispatcher != null) {
            cancellableContinuation.M(coroutineDispatcher, th);
            return;
        }
        Result.Companion companion = Result.f40519A;
        cancellableContinuation.q(Result.b(ResultKt.a(th)));
    }
}
