package kotlin.coroutines;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class ContinuationKt {
    public static final Continuation a(Function2 function2, Object obj, Continuation continuation) {
        Intrinsics.i(function2, "<this>");
        Intrinsics.i(continuation, "completion");
        return new SafeContinuation(IntrinsicsKt.c(IntrinsicsKt.a(function2, obj, continuation)), IntrinsicsKt.f());
    }

    public static final void b(Function2 function2, Object obj, Continuation continuation) {
        Intrinsics.i(function2, "<this>");
        Intrinsics.i(continuation, "completion");
        Continuation c2 = IntrinsicsKt.c(IntrinsicsKt.a(function2, obj, continuation));
        Result.Companion companion = Result.f40519A;
        c2.q(Result.b(Unit.f40552a));
    }
}
