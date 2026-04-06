package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.flow.Flow;

@Metadata
public final class ChannelLimitedFlowMerge<T> extends ChannelFlow<T> {
    public final Iterable C;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ChannelLimitedFlowMerge(Iterable iterable, CoroutineContext coroutineContext, int i2, BufferOverflow bufferOverflow, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(iterable, (i3 & 2) != 0 ? EmptyCoroutineContext.f40721z : coroutineContext, (i3 & 4) != 0 ? -2 : i2, (i3 & 8) != 0 ? BufferOverflow.SUSPEND : bufferOverflow);
    }

    public Object f(ProducerScope producerScope, Continuation continuation) {
        SendingCollector sendingCollector = new SendingCollector(producerScope);
        for (Flow channelLimitedFlowMerge$collectTo$2$1 : this.C) {
            Job unused = BuildersKt__Builders_commonKt.d(producerScope, (CoroutineContext) null, (CoroutineStart) null, new ChannelLimitedFlowMerge$collectTo$2$1(channelLimitedFlowMerge$collectTo$2$1, sendingCollector, (Continuation) null), 3, (Object) null);
        }
        return Unit.f40552a;
    }

    public ChannelFlow j(CoroutineContext coroutineContext, int i2, BufferOverflow bufferOverflow) {
        return new ChannelLimitedFlowMerge(this.C, coroutineContext, i2, bufferOverflow);
    }

    public ReceiveChannel o(CoroutineScope coroutineScope) {
        return ProduceKt.b(coroutineScope, this.f41785z, this.f41783A, m());
    }

    public ChannelLimitedFlowMerge(Iterable iterable, CoroutineContext coroutineContext, int i2, BufferOverflow bufferOverflow) {
        super(coroutineContext, i2, bufferOverflow);
        this.C = iterable;
    }
}
