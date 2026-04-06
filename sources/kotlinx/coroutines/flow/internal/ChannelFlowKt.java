package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.internal.ThreadContextKt;

@Metadata
public final class ChannelFlowKt {
    public static final ChannelFlow b(Flow flow) {
        ChannelFlow channelFlow = flow instanceof ChannelFlow ? (ChannelFlow) flow : null;
        return channelFlow == null ? new ChannelFlowOperatorImpl(flow, (CoroutineContext) null, 0, (BufferOverflow) null, 14, (DefaultConstructorMarker) null) : channelFlow;
    }

    /* JADX INFO: finally extract failed */
    public static final Object c(CoroutineContext coroutineContext, Object obj, Object obj2, Function2 function2, Continuation continuation) {
        Object i2 = ThreadContextKt.i(coroutineContext, obj2);
        try {
            StackFrameContinuation stackFrameContinuation = new StackFrameContinuation(continuation, coroutineContext);
            Object d2 = !(function2 instanceof BaseContinuationImpl) ? IntrinsicsKt.d(function2, obj, stackFrameContinuation) : ((Function2) TypeIntrinsics.e(function2, 2)).m(obj, stackFrameContinuation);
            ThreadContextKt.f(coroutineContext, i2);
            if (d2 == IntrinsicsKt.f()) {
                DebugProbesKt.c(continuation);
            }
            return d2;
        } catch (Throwable th) {
            ThreadContextKt.f(coroutineContext, i2);
            throw th;
        }
    }

    public static /* synthetic */ Object d(CoroutineContext coroutineContext, Object obj, Object obj2, Function2 function2, Continuation continuation, int i2, Object obj3) {
        if ((i2 & 4) != 0) {
            obj2 = ThreadContextKt.g(coroutineContext);
        }
        return c(coroutineContext, obj, obj2, function2, continuation);
    }

    public static final FlowCollector e(FlowCollector flowCollector, CoroutineContext coroutineContext) {
        return ((flowCollector instanceof SendingCollector) || (flowCollector instanceof NopCollector)) ? flowCollector : new UndispatchedContextCollector(flowCollector, coroutineContext);
    }
}
