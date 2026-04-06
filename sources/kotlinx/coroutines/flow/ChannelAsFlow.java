package kotlinx.coroutines.flow;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.flow.internal.ChannelFlow;
import kotlinx.coroutines.flow.internal.SendingCollector;

@Metadata
final class ChannelAsFlow<T> extends ChannelFlow<T> {
    public static final /* synthetic */ AtomicIntegerFieldUpdater E = AtomicIntegerFieldUpdater.newUpdater(ChannelAsFlow.class, "consumed$volatile");
    public final ReceiveChannel C;
    public final boolean D;
    private volatile /* synthetic */ int consumed$volatile;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ChannelAsFlow(ReceiveChannel receiveChannel, boolean z2, CoroutineContext coroutineContext, int i2, BufferOverflow bufferOverflow, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(receiveChannel, z2, (i3 & 4) != 0 ? EmptyCoroutineContext.f40721z : coroutineContext, (i3 & 8) != 0 ? -3 : i2, (i3 & 16) != 0 ? BufferOverflow.SUSPEND : bufferOverflow);
    }

    public Object a(FlowCollector flowCollector, Continuation continuation) {
        if (this.f41783A == -3) {
            q();
            Object a2 = FlowKt__ChannelsKt.d(flowCollector, this.C, this.D, continuation);
            return a2 == IntrinsicsKt.f() ? a2 : Unit.f40552a;
        }
        Object a3 = super.a(flowCollector, continuation);
        return a3 == IntrinsicsKt.f() ? a3 : Unit.f40552a;
    }

    public String d() {
        return "channel=" + this.C;
    }

    public Object f(ProducerScope producerScope, Continuation continuation) {
        Object a2 = FlowKt__ChannelsKt.d(new SendingCollector(producerScope), this.C, this.D, continuation);
        return a2 == IntrinsicsKt.f() ? a2 : Unit.f40552a;
    }

    public ChannelFlow j(CoroutineContext coroutineContext, int i2, BufferOverflow bufferOverflow) {
        return new ChannelAsFlow(this.C, this.D, coroutineContext, i2, bufferOverflow);
    }

    public Flow l() {
        return new ChannelAsFlow(this.C, this.D, (CoroutineContext) null, 0, (BufferOverflow) null, 28, (DefaultConstructorMarker) null);
    }

    public ReceiveChannel o(CoroutineScope coroutineScope) {
        q();
        return this.f41783A == -3 ? this.C : super.o(coroutineScope);
    }

    public final void q() {
        if (this.D && E.getAndSet(this, 1) == 1) {
            throw new IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once");
        }
    }

    public ChannelAsFlow(ReceiveChannel receiveChannel, boolean z2, CoroutineContext coroutineContext, int i2, BufferOverflow bufferOverflow) {
        super(coroutineContext, i2, bufferOverflow);
        this.C = receiveChannel;
        this.D = z2;
    }
}
