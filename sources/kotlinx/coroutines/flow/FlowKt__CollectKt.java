package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.NopCollector;

@Metadata
final /* synthetic */ class FlowKt__CollectKt {
    public static final Object a(Flow flow, Continuation continuation) {
        Object a2 = flow.a(NopCollector.f41807z, continuation);
        return a2 == IntrinsicsKt.f() ? a2 : Unit.f40552a;
    }

    public static final Object b(Flow flow, Function2 function2, Continuation continuation) {
        Object k2 = FlowKt.k(FlowKt__ContextKt.b(FlowKt.Q(flow, function2), 0, (BufferOverflow) null, 2, (Object) null), continuation);
        return k2 == IntrinsicsKt.f() ? k2 : Unit.f40552a;
    }

    public static final Object c(FlowCollector flowCollector, Flow flow, Continuation continuation) {
        FlowKt.B(flowCollector);
        Object a2 = flow.a(flowCollector, continuation);
        return a2 == IntrinsicsKt.f() ? a2 : Unit.f40552a;
    }

    public static final Job d(Flow flow, CoroutineScope coroutineScope) {
        return BuildersKt__Builders_commonKt.d(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new FlowKt__CollectKt$launchIn$1(flow, (Continuation) null), 3, (Object) null);
    }
}
