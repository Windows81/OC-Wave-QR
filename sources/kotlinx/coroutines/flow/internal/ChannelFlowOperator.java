package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineContextKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata
public abstract class ChannelFlowOperator<S, T> extends ChannelFlow<T> {
    public final Flow C;

    public ChannelFlowOperator(Flow flow, CoroutineContext coroutineContext, int i2, BufferOverflow bufferOverflow) {
        super(coroutineContext, i2, bufferOverflow);
        this.C = flow;
    }

    public static /* synthetic */ Object p(ChannelFlowOperator channelFlowOperator, FlowCollector flowCollector, Continuation continuation) {
        if (channelFlowOperator.f41783A == -3) {
            CoroutineContext f2 = continuation.f();
            CoroutineContext j2 = CoroutineContextKt.j(f2, channelFlowOperator.f41785z);
            if (Intrinsics.d(j2, f2)) {
                Object s2 = channelFlowOperator.s(flowCollector, continuation);
                return s2 == IntrinsicsKt.f() ? s2 : Unit.f40552a;
            }
            ContinuationInterceptor.Key key = ContinuationInterceptor.f40717v;
            if (Intrinsics.d(j2.d(key), f2.d(key))) {
                Object r2 = channelFlowOperator.r(flowCollector, j2, continuation);
                return r2 == IntrinsicsKt.f() ? r2 : Unit.f40552a;
            }
        }
        Object a2 = super.a(flowCollector, continuation);
        return a2 == IntrinsicsKt.f() ? a2 : Unit.f40552a;
    }

    public static /* synthetic */ Object q(ChannelFlowOperator channelFlowOperator, ProducerScope producerScope, Continuation continuation) {
        Object s2 = channelFlowOperator.s(new SendingCollector(producerScope), continuation);
        return s2 == IntrinsicsKt.f() ? s2 : Unit.f40552a;
    }

    public Object a(FlowCollector flowCollector, Continuation continuation) {
        return p(this, flowCollector, continuation);
    }

    public Object f(ProducerScope producerScope, Continuation continuation) {
        return q(this, producerScope, continuation);
    }

    public final Object r(FlowCollector flowCollector, CoroutineContext coroutineContext, Continuation continuation) {
        return ChannelFlowKt.d(coroutineContext, ChannelFlowKt.e(flowCollector, continuation.f()), (Object) null, new ChannelFlowOperator$collectWithContextUndispatched$2(this, (Continuation) null), continuation, 4, (Object) null);
    }

    public abstract Object s(FlowCollector flowCollector, Continuation continuation);

    public String toString() {
        return this.C + " -> " + super.toString();
    }
}
