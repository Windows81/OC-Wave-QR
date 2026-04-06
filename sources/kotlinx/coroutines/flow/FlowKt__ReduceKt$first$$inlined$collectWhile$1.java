package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.flow.internal.AbortFlowException;

@Metadata
public final class FlowKt__ReduceKt$first$$inlined$collectWhile$1 implements FlowCollector<Object> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f41657z;

    public FlowKt__ReduceKt$first$$inlined$collectWhile$1(Ref.ObjectRef objectRef) {
        this.f41657z = objectRef;
    }

    public Object c(Object obj, Continuation continuation) {
        this.f41657z.f40908z = obj;
        throw new AbortFlowException(this);
    }
}
