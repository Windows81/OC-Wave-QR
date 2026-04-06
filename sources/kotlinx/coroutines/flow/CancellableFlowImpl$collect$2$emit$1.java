package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata
@DebugMetadata(c = "kotlinx.coroutines.flow.CancellableFlowImpl$collect$2", f = "Context.kt", l = {278}, m = "emit")
public final class CancellableFlowImpl$collect$2$emit$1 extends ContinuationImpl {
    public /* synthetic */ Object C;
    public final /* synthetic */ CancellableFlowImpl$collect$2 D;
    public int E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CancellableFlowImpl$collect$2$emit$1(CancellableFlowImpl$collect$2 cancellableFlowImpl$collect$2, Continuation continuation) {
        super(continuation);
        this.D = cancellableFlowImpl$collect$2;
    }

    public final Object x(Object obj) {
        this.C = obj;
        this.E |= Integer.MIN_VALUE;
        return this.D.c((Object) null, this);
    }
}
