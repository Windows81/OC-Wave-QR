package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata
@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__LimitKt", f = "Limit.kt", l = {71}, m = "emitAbort$FlowKt__LimitKt")
public final class FlowKt__LimitKt$emitAbort$1<T> extends ContinuationImpl {
    public Object C;
    public /* synthetic */ Object D;
    public int E;

    public FlowKt__LimitKt$emitAbort$1(Continuation continuation) {
        super(continuation);
    }

    public final Object x(Object obj) {
        this.D = obj;
        this.E |= Integer.MIN_VALUE;
        return FlowKt__LimitKt.e((FlowCollector) null, (Object) null, (Object) null, this);
    }
}
