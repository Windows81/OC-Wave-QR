package kotlinx.coroutines.stream;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata
@DebugMetadata(c = "kotlinx.coroutines.stream.StreamFlow", f = "Stream.kt", l = {22}, m = "collect")
public final class StreamFlow$collect$1 extends ContinuationImpl {
    public Object C;
    public Object D;
    public Object E;
    public /* synthetic */ Object F;
    public final /* synthetic */ StreamFlow G;
    public int H;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StreamFlow$collect$1(StreamFlow streamFlow, Continuation continuation) {
        super(continuation);
        this.G = streamFlow;
    }

    public final Object x(Object obj) {
        this.F = obj;
        this.H |= Integer.MIN_VALUE;
        return this.G.a((FlowCollector) null, this);
    }
}
