package kotlinx.coroutines.intrinsics;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.DispatchException;
import kotlinx.coroutines.internal.DispatchedContinuationKt;

@Metadata
public final class CancellableKt {
    public static final void a(Continuation continuation, Throwable th) {
        if (th instanceof DispatchException) {
            th = ((DispatchException) th).getCause();
        }
        Result.Companion companion = Result.f40519A;
        continuation.q(Result.b(ResultKt.a(th)));
        throw th;
    }

    public static final void b(Continuation continuation, Continuation continuation2) {
        try {
            Continuation c2 = IntrinsicsKt.c(continuation);
            Result.Companion companion = Result.f40519A;
            DispatchedContinuationKt.b(c2, Result.b(Unit.f40552a));
        } catch (Throwable th) {
            a(continuation2, th);
        }
    }

    public static final void c(Function2 function2, Object obj, Continuation continuation) {
        try {
            Continuation c2 = IntrinsicsKt.c(IntrinsicsKt.a(function2, obj, continuation));
            Result.Companion companion = Result.f40519A;
            DispatchedContinuationKt.b(c2, Result.b(Unit.f40552a));
        } catch (Throwable th) {
            a(continuation, th);
        }
    }
}
