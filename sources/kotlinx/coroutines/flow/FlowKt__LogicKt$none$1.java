package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

@Metadata
@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__LogicKt", f = "Logic.kt", l = {107}, m = "none")
public final class FlowKt__LogicKt$none$1<T> extends ContinuationImpl {
    public /* synthetic */ Object C;
    public int D;

    public FlowKt__LogicKt$none$1(Continuation continuation) {
        super(continuation);
    }

    public final Object x(Object obj) {
        this.C = obj;
        this.D |= Integer.MIN_VALUE;
        return FlowKt.T((Flow) null, (Function2) null, this);
    }
}
