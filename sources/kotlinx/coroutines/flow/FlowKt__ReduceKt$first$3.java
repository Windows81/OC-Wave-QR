package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

@Metadata
@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", l = {179}, m = "first")
public final class FlowKt__ReduceKt$first$3<T> extends ContinuationImpl {
    public Object C;
    public Object D;
    public /* synthetic */ Object E;
    public int F;

    public FlowKt__ReduceKt$first$3(Continuation continuation) {
        super(continuation);
    }

    public final Object x(Object obj) {
        this.E = obj;
        this.F |= Integer.MIN_VALUE;
        return FlowKt.E((Flow) null, (Function2) null, this);
    }
}
