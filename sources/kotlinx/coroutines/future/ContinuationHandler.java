package kotlinx.coroutines.future;

import java.util.concurrent.CompletionException;
import java.util.function.BiFunction;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@Metadata
final class ContinuationHandler<T> implements BiFunction<T, Throwable, Unit> {
    public volatile Continuation<? super T> cont;

    public void a(Object obj, Throwable th) {
        Throwable cause;
        Continuation<? super T> continuation = this.cont;
        if (continuation != null) {
            if (th == null) {
                continuation.q(Result.b(obj));
                return;
            }
            CompletionException completionException = th instanceof CompletionException ? (CompletionException) th : null;
            if (!(completionException == null || (cause = completionException.getCause()) == null)) {
                th = cause;
            }
            Result.Companion companion = Result.f40519A;
            continuation.q(Result.b(ResultKt.a(th)));
        }
    }

    public /* bridge */ /* synthetic */ Object apply(Object obj, Object obj2) {
        a(obj, (Throwable) obj2);
        return Unit.f40552a;
    }
}
