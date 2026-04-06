package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata
@DebugMetadata(c = "kotlinx.coroutines.channels.TickerChannelsKt", f = "TickerChannels.kt", l = {80, 84, 90, 92}, m = "fixedPeriodTicker")
public final class TickerChannelsKt$fixedPeriodTicker$1 extends ContinuationImpl {
    public long C;
    public long D;
    public Object E;
    public /* synthetic */ Object F;
    public int G;

    public TickerChannelsKt$fixedPeriodTicker$1(Continuation continuation) {
        super(continuation);
    }

    public final Object x(Object obj) {
        this.F = obj;
        this.G |= Integer.MIN_VALUE;
        return TickerChannelsKt.d(0, 0, (SendChannel) null, this);
    }
}
