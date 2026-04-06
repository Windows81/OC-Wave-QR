package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.sync.SemaphoreKt;

@Metadata
public final class ChannelFlowMerge<T> extends ChannelFlow<T> {
    public final Flow C;
    public final int D;

    public ChannelFlowMerge(Flow flow, int i2, CoroutineContext coroutineContext, int i3, BufferOverflow bufferOverflow) {
        super(coroutineContext, i3, bufferOverflow);
        this.C = flow;
        this.D = i2;
    }

    public String d() {
        return "concurrency=" + this.D;
    }

    public Object f(ProducerScope producerScope, Continuation continuation) {
        Object a2 = this.C.a(new ChannelFlowMerge$collectTo$2((Job) continuation.f().d(Job.f41415x), SemaphoreKt.b(this.D, 0, 2, (Object) null), producerScope, new SendingCollector(producerScope)), continuation);
        return a2 == IntrinsicsKt.f() ? a2 : Unit.f40552a;
    }

    public ChannelFlow j(CoroutineContext coroutineContext, int i2, BufferOverflow bufferOverflow) {
        return new ChannelFlowMerge(this.C, this.D, coroutineContext, i2, bufferOverflow);
    }

    public ReceiveChannel o(CoroutineScope coroutineScope) {
        return ProduceKt.b(coroutineScope, this.f41785z, this.f41783A, m());
    }
}
