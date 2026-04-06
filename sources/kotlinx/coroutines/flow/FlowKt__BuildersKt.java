package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.channels.BufferOverflow;

@Metadata
final /* synthetic */ class FlowKt__BuildersKt {
    public static final Flow a(Iterable iterable) {
        return new FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3(iterable);
    }

    public static final Flow b(Function2 function2) {
        return new ChannelFlowBuilder(function2, (CoroutineContext) null, 0, (BufferOverflow) null, 14, (DefaultConstructorMarker) null);
    }

    public static final Flow c() {
        return EmptyFlow.f41576z;
    }

    public static final Flow d(Function2 function2) {
        return new SafeFlow(function2);
    }

    public static final Flow e(Object obj) {
        return new FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2(obj);
    }

    public static final Flow f(Object... objArr) {
        return new FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1(objArr);
    }
}
