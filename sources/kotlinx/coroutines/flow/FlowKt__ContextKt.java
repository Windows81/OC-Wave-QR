package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.ChannelFlowOperatorImpl;
import kotlinx.coroutines.flow.internal.FusibleFlow;

@Metadata
final /* synthetic */ class FlowKt__ContextKt {
    public static final Flow a(Flow flow, int i2, BufferOverflow bufferOverflow) {
        if (i2 < 0 && i2 != -2 && i2 != -1) {
            throw new IllegalArgumentException(("Buffer size should be non-negative, BUFFERED, or CONFLATED, but was " + i2).toString());
        } else if (i2 != -1 || bufferOverflow == BufferOverflow.SUSPEND) {
            if (i2 == -1) {
                bufferOverflow = BufferOverflow.DROP_OLDEST;
                i2 = 0;
            }
            int i3 = i2;
            BufferOverflow bufferOverflow2 = bufferOverflow;
            return flow instanceof FusibleFlow ? FusibleFlow.DefaultImpls.a((FusibleFlow) flow, (CoroutineContext) null, i3, bufferOverflow2, 1, (Object) null) : new ChannelFlowOperatorImpl(flow, (CoroutineContext) null, i3, bufferOverflow2, 2, (DefaultConstructorMarker) null);
        } else {
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
        }
    }

    public static /* synthetic */ Flow b(Flow flow, int i2, BufferOverflow bufferOverflow, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = -2;
        }
        if ((i3 & 2) != 0) {
            bufferOverflow = BufferOverflow.SUSPEND;
        }
        return FlowKt.f(flow, i2, bufferOverflow);
    }

    public static final void c(CoroutineContext coroutineContext) {
        if (coroutineContext.d(Job.f41415x) != null) {
            throw new IllegalArgumentException(("Flow context cannot contain job in it. Had " + coroutineContext).toString());
        }
    }

    public static final Flow d(Flow flow) {
        return b(flow, -1, (BufferOverflow) null, 2, (Object) null);
    }

    public static final Flow e(Flow flow, CoroutineContext coroutineContext) {
        c(coroutineContext);
        return Intrinsics.d(coroutineContext, EmptyCoroutineContext.f40721z) ? flow : flow instanceof FusibleFlow ? FusibleFlow.DefaultImpls.a((FusibleFlow) flow, coroutineContext, 0, (BufferOverflow) null, 6, (Object) null) : new ChannelFlowOperatorImpl(flow, coroutineContext, 0, (BufferOverflow) null, 12, (DefaultConstructorMarker) null);
    }
}
