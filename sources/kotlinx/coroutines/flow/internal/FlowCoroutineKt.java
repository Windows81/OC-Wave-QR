package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.intrinsics.UndispatchedKt;

@Metadata
public final class FlowCoroutineKt {
    public static final Object a(Function2 function2, Continuation continuation) {
        FlowCoroutine flowCoroutine = new FlowCoroutine(continuation.f(), continuation);
        Object d2 = UndispatchedKt.d(flowCoroutine, flowCoroutine, function2);
        if (d2 == IntrinsicsKt.f()) {
            DebugProbesKt.c(continuation);
        }
        return d2;
    }

    public static final Flow b(Function3 function3) {
        return new FlowCoroutineKt$scopedFlow$$inlined$unsafeFlow$1(function3);
    }
}
