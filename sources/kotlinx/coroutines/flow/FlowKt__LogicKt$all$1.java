package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

@Metadata
@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__LogicKt", f = "Logic.kt", l = {119}, m = "all")
public final class FlowKt__LogicKt$all$1<T> extends ContinuationImpl {
    public Object C;
    public Object D;
    public /* synthetic */ Object E;
    public int F;

    public FlowKt__LogicKt$all$1(Continuation continuation) {
        super(continuation);
    }

    public final Object x(Object obj) {
        this.E = obj;
        this.F |= Integer.MIN_VALUE;
        return FlowKt.a((Flow) null, (Function2) null, this);
    }
}
