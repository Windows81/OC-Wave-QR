package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata
@DebugMetadata(c = "kotlinx.coroutines.flow.StateFlowImpl", f = "StateFlow.kt", l = {389, 401, 406}, m = "collect")
public final class StateFlowImpl$collect$1 extends ContinuationImpl {
    public Object C;
    public Object D;
    public Object E;
    public Object F;
    public Object G;
    public /* synthetic */ Object H;
    public final /* synthetic */ StateFlowImpl I;
    public int J;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StateFlowImpl$collect$1(StateFlowImpl stateFlowImpl, Continuation continuation) {
        super(continuation);
        this.I = stateFlowImpl;
    }

    public final Object x(Object obj) {
        this.H = obj;
        this.J |= Integer.MIN_VALUE;
        return this.I.a((FlowCollector) null, this);
    }
}
