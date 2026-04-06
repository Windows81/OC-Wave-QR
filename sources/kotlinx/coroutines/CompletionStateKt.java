package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class CompletionStateKt {
    public static final Object a(Object obj, Continuation continuation) {
        if (!(obj instanceof CompletedExceptionally)) {
            return Result.b(obj);
        }
        Result.Companion companion = Result.f40519A;
        return Result.b(ResultKt.a(((CompletedExceptionally) obj).f41376a));
    }

    public static final Object b(Object obj) {
        Throwable e2 = Result.e(obj);
        return e2 == null ? obj : new CompletedExceptionally(e2, false, 2, (DefaultConstructorMarker) null);
    }

    public static final Object c(Object obj, CancellableContinuation cancellableContinuation) {
        Throwable e2 = Result.e(obj);
        return e2 == null ? obj : new CompletedExceptionally(e2, false, 2, (DefaultConstructorMarker) null);
    }
}
