package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;
import kotlinx.coroutines.flow.internal.ChannelLimitedFlowMerge;
import kotlinx.coroutines.internal.SystemPropsKt;

@Metadata
final /* synthetic */ class FlowKt__MergeKt {

    /* renamed from: a  reason: collision with root package name */
    public static final int f41646a = SystemPropsKt.b("kotlinx.coroutines.flow.defaultConcurrency", 16, 1, Integer.MAX_VALUE);

    public static final Flow a(Flow flow, Function2 function2) {
        return FlowKt.h0(flow, new FlowKt__MergeKt$mapLatest$1(function2, (Continuation) null));
    }

    public static final Flow b(Iterable iterable) {
        return new ChannelLimitedFlowMerge(iterable, (CoroutineContext) null, 0, (BufferOverflow) null, 14, (DefaultConstructorMarker) null);
    }

    public static final Flow c(Flow... flowArr) {
        return FlowKt.R(ArraysKt.S(flowArr));
    }

    public static final Flow d(Flow flow, Function3 function3) {
        return new ChannelFlowTransformLatest(function3, flow, (CoroutineContext) null, 0, (BufferOverflow) null, 28, (DefaultConstructorMarker) null);
    }
}
