package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlinx.coroutines.internal.DispatchedContinuation;
import kotlinx.coroutines.internal.DispatchedContinuationKt;

@Metadata
public final class YieldKt {
    public static final Object a(Continuation continuation) {
        Object obj;
        CoroutineContext f2 = continuation.f();
        JobKt.i(f2);
        Continuation c2 = IntrinsicsKt.c(continuation);
        DispatchedContinuation dispatchedContinuation = c2 instanceof DispatchedContinuation ? (DispatchedContinuation) c2 : null;
        if (dispatchedContinuation == null) {
            obj = Unit.f40552a;
        } else {
            if (DispatchedContinuationKt.d(dispatchedContinuation.C, f2)) {
                dispatchedContinuation.m(f2, Unit.f40552a);
            } else {
                YieldContext yieldContext = new YieldContext();
                CoroutineContext y2 = f2.y(yieldContext);
                Unit unit = Unit.f40552a;
                dispatchedContinuation.m(y2, unit);
                if (yieldContext.f41443A) {
                    obj = DispatchedContinuationKt.e(dispatchedContinuation) ? IntrinsicsKt.f() : unit;
                }
            }
            obj = IntrinsicsKt.f();
        }
        if (obj == IntrinsicsKt.f()) {
            DebugProbesKt.c(continuation);
        }
        return obj == IntrinsicsKt.f() ? obj : Unit.f40552a;
    }
}
