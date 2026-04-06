package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata
@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", l = {151}, m = "last")
public final class FlowKt__ReduceKt$last$1<T> extends ContinuationImpl {
    public Object C;
    public /* synthetic */ Object D;
    public int E;

    public FlowKt__ReduceKt$last$1(Continuation continuation) {
        super(continuation);
    }

    public final Object x(Object obj) {
        this.D = obj;
        this.E |= Integer.MIN_VALUE;
        return FlowKt.N((Flow) null, this);
    }
}
