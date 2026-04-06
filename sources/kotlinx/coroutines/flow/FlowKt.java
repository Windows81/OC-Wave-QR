package kotlinx.coroutines.flow;

import java.util.Collection;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.ReceiveChannel;

@Metadata
public final class FlowKt {
    public static final Flow A() {
        return FlowKt__BuildersKt.c();
    }

    public static final void B(FlowCollector flowCollector) {
        FlowKt__EmittersKt.b(flowCollector);
    }

    public static final Flow C(Flow flow) {
        return FlowKt__TransformKt.a(flow);
    }

    public static final Object D(Flow flow, Continuation continuation) {
        return FlowKt__ReduceKt.a(flow, continuation);
    }

    public static final Object E(Flow flow, Function2 function2, Continuation continuation) {
        return FlowKt__ReduceKt.b(flow, function2, continuation);
    }

    public static final Object F(Flow flow, Continuation continuation) {
        return FlowKt__ReduceKt.c(flow, continuation);
    }

    public static final Object G(Flow flow, Function2 function2, Continuation continuation) {
        return FlowKt__ReduceKt.d(flow, function2, continuation);
    }

    public static final ReceiveChannel H(CoroutineScope coroutineScope, long j2) {
        return FlowKt__DelayKt.e(coroutineScope, j2);
    }

    public static final Flow I(Function2 function2) {
        return FlowKt__BuildersKt.d(function2);
    }

    public static final Flow J(Flow flow, Flow flow2, Function3 function3) {
        return FlowKt__ZipKt.e(flow, flow2, function3);
    }

    public static final Flow K(Object obj) {
        return FlowKt__BuildersKt.e(obj);
    }

    public static final Flow L(Object... objArr) {
        return FlowKt__BuildersKt.f(objArr);
    }

    public static final Flow M(Flow flow, CoroutineContext coroutineContext) {
        return FlowKt__ContextKt.e(flow, coroutineContext);
    }

    public static final Object N(Flow flow, Continuation continuation) {
        return FlowKt__ReduceKt.f(flow, continuation);
    }

    public static final Object O(Flow flow, Continuation continuation) {
        return FlowKt__ReduceKt.g(flow, continuation);
    }

    public static final Job P(Flow flow, CoroutineScope coroutineScope) {
        return FlowKt__CollectKt.d(flow, coroutineScope);
    }

    public static final Flow Q(Flow flow, Function2 function2) {
        return FlowKt__MergeKt.a(flow, function2);
    }

    public static final Flow R(Iterable iterable) {
        return FlowKt__MergeKt.b(iterable);
    }

    public static final Flow S(Flow... flowArr) {
        return FlowKt__MergeKt.c(flowArr);
    }

    public static final Object T(Flow flow, Function2 function2, Continuation continuation) {
        return FlowKt__LogicKt.c(flow, function2, continuation);
    }

    public static final Flow U(Flow flow, Function3 function3) {
        return FlowKt__EmittersKt.d(flow, function3);
    }

    public static final Flow V(Flow flow, Function2 function2) {
        return FlowKt__TransformKt.b(flow, function2);
    }

    public static final Flow W(Flow flow, Function2 function2) {
        return FlowKt__EmittersKt.e(flow, function2);
    }

    public static final ReceiveChannel X(Flow flow, CoroutineScope coroutineScope) {
        return FlowKt__ChannelsKt.e(flow, coroutineScope);
    }

    public static final Flow Y(ReceiveChannel receiveChannel) {
        return FlowKt__ChannelsKt.f(receiveChannel);
    }

    public static final Object Z(Flow flow, Function3 function3, Continuation continuation) {
        return FlowKt__ReduceKt.h(flow, function3, continuation);
    }

    public static final Object a(Flow flow, Function2 function2, Continuation continuation) {
        return FlowKt__LogicKt.a(flow, function2, continuation);
    }

    public static final Object a0(Flow flow, Continuation continuation) {
        return FlowKt__ReduceKt.i(flow, continuation);
    }

    public static final Object b(Flow flow, Function2 function2, Continuation continuation) {
        return FlowKt__LogicKt.b(flow, function2, continuation);
    }

    public static final Object b0(Flow flow, Continuation continuation) {
        return FlowKt__ReduceKt.j(flow, continuation);
    }

    public static final Flow c(Iterable iterable) {
        return FlowKt__BuildersKt.a(iterable);
    }

    public static final Object c0(Flow flow, CoroutineScope coroutineScope, Continuation continuation) {
        return FlowKt__ShareKt.f(flow, coroutineScope, continuation);
    }

    public static final SharedFlow d(MutableSharedFlow mutableSharedFlow) {
        return FlowKt__ShareKt.a(mutableSharedFlow);
    }

    public static final StateFlow d0(Flow flow, CoroutineScope coroutineScope, SharingStarted sharingStarted, Object obj) {
        return FlowKt__ShareKt.g(flow, coroutineScope, sharingStarted, obj);
    }

    public static final StateFlow e(MutableStateFlow mutableStateFlow) {
        return FlowKt__ShareKt.b(mutableStateFlow);
    }

    public static final Flow e0(Flow flow, int i2) {
        return FlowKt__LimitKt.f(flow, i2);
    }

    public static final Flow f(Flow flow, int i2, BufferOverflow bufferOverflow) {
        return FlowKt__ContextKt.a(flow, i2, bufferOverflow);
    }

    public static final Flow f0(Flow flow, Function2 function2) {
        return FlowKt__LimitKt.g(flow, function2);
    }

    public static final Object g0(Flow flow, Collection collection, Continuation continuation) {
        return FlowKt__CollectionKt.a(flow, collection, continuation);
    }

    public static final Flow h(Flow flow, Function3 function3) {
        return FlowKt__ErrorsKt.a(flow, function3);
    }

    public static final Flow h0(Flow flow, Function3 function3) {
        return FlowKt__MergeKt.d(flow, function3);
    }

    public static final Object i(Flow flow, FlowCollector flowCollector, Continuation continuation) {
        return FlowKt__ErrorsKt.b(flow, flowCollector, continuation);
    }

    public static final Flow j(Function2 function2) {
        return FlowKt__BuildersKt.b(function2);
    }

    public static final Object k(Flow flow, Continuation continuation) {
        return FlowKt__CollectKt.a(flow, continuation);
    }

    public static final Object l(Flow flow, Function2 function2, Continuation continuation) {
        return FlowKt__CollectKt.b(flow, function2, continuation);
    }

    public static final Flow m(Flow flow, Flow flow2, Function3 function3) {
        return FlowKt__ZipKt.b(flow, flow2, function3);
    }

    public static final Flow n(Flow flow, Flow flow2, Flow flow3, Function4 function4) {
        return FlowKt__ZipKt.c(flow, flow2, flow3, function4);
    }

    public static final Flow o(Flow flow, Flow flow2, Function4 function4) {
        return FlowKt__ZipKt.d(flow, flow2, function4);
    }

    public static final Flow p(Flow flow) {
        return FlowKt__ContextKt.d(flow);
    }

    public static final Flow q(ReceiveChannel receiveChannel) {
        return FlowKt__ChannelsKt.b(receiveChannel);
    }

    public static final Object r(Flow flow, Continuation continuation) {
        return FlowKt__CountKt.a(flow, continuation);
    }

    public static final Object s(Flow flow, Function2 function2, Continuation continuation) {
        return FlowKt__CountKt.b(flow, function2, continuation);
    }

    public static final Flow t(Flow flow, Function1 function1) {
        return FlowKt__DelayKt.c(flow, function1);
    }

    public static final Flow u(Flow flow) {
        return FlowKt__DistinctKt.e(flow);
    }

    public static final Flow v(Flow flow, Function2 function2) {
        return FlowKt__DistinctKt.f(flow, function2);
    }

    public static final Flow w(Flow flow, int i2) {
        return FlowKt__LimitKt.c(flow, i2);
    }

    public static final Flow x(Flow flow, Function2 function2) {
        return FlowKt__LimitKt.d(flow, function2);
    }

    public static final Object y(FlowCollector flowCollector, ReceiveChannel receiveChannel, Continuation continuation) {
        return FlowKt__ChannelsKt.c(flowCollector, receiveChannel, continuation);
    }

    public static final Object z(FlowCollector flowCollector, Flow flow, Continuation continuation) {
        return FlowKt__CollectKt.c(flowCollector, flow, continuation);
    }
}
