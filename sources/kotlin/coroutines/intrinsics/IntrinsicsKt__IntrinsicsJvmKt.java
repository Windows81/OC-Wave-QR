package kotlin.coroutines.intrinsics;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;

@Metadata
class IntrinsicsKt__IntrinsicsJvmKt {
    public static Continuation a(Function2 function2, Object obj, Continuation continuation) {
        Intrinsics.i(function2, "<this>");
        Intrinsics.i(continuation, "completion");
        Continuation a2 = DebugProbesKt.a(continuation);
        if (function2 instanceof BaseContinuationImpl) {
            return ((BaseContinuationImpl) function2).s(obj, a2);
        }
        CoroutineContext f2 = a2.f();
        return f2 == EmptyCoroutineContext.f40721z ? new IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$3(a2, function2, obj) : new IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$4(a2, f2, function2, obj);
    }

    public static final Continuation b(Continuation continuation) {
        CoroutineContext f2 = continuation.f();
        return f2 == EmptyCoroutineContext.f40721z ? new IntrinsicsKt__IntrinsicsJvmKt$createSimpleCoroutineForSuspendFunction$1(continuation) : new IntrinsicsKt__IntrinsicsJvmKt$createSimpleCoroutineForSuspendFunction$2(continuation, f2);
    }

    public static Continuation c(Continuation continuation) {
        Continuation z2;
        Intrinsics.i(continuation, "<this>");
        ContinuationImpl continuationImpl = continuation instanceof ContinuationImpl ? (ContinuationImpl) continuation : null;
        return (continuationImpl == null || (z2 = continuationImpl.z()) == null) ? continuation : z2;
    }

    public static Object d(Function2 function2, Object obj, Continuation continuation) {
        Intrinsics.i(function2, "<this>");
        Intrinsics.i(continuation, "completion");
        return ((Function2) TypeIntrinsics.e(function2, 2)).m(obj, b(DebugProbesKt.a(continuation)));
    }

    public static Object e(Function3 function3, Object obj, Object obj2, Continuation continuation) {
        Intrinsics.i(function3, "<this>");
        Intrinsics.i(continuation, "completion");
        return ((Function3) TypeIntrinsics.e(function3, 3)).d(obj, obj2, b(DebugProbesKt.a(continuation)));
    }
}
