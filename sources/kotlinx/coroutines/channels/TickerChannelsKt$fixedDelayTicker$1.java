package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata
@DebugMetadata(c = "kotlinx.coroutines.channels.TickerChannelsKt", f = "TickerChannels.kt", l = {102, 104, 105}, m = "fixedDelayTicker")
public final class TickerChannelsKt$fixedDelayTicker$1 extends ContinuationImpl {
    public long C;
    public Object D;
    public /* synthetic */ Object E;
    public int F;

    public TickerChannelsKt$fixedDelayTicker$1(Continuation continuation) {
        super(continuation);
    }

    public final Object x(Object obj) {
        this.E = obj;
        this.F |= Integer.MIN_VALUE;
        return TickerChannelsKt.c(0, 0, (SendChannel) null, this);
    }
}
