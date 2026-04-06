package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.flow.internal.NullSurrogateKt;

@Metadata
public final class FlowKt__ReduceKt$single$2<T> implements FlowCollector {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f41670z;

    public FlowKt__ReduceKt$single$2(Ref.ObjectRef objectRef) {
        this.f41670z = objectRef;
    }

    public final Object c(Object obj, Continuation continuation) {
        Ref.ObjectRef objectRef = this.f41670z;
        if (objectRef.f40908z == NullSurrogateKt.f41808a) {
            objectRef.f40908z = obj;
            return Unit.f40552a;
        }
        throw new IllegalArgumentException("Flow has more than one element");
    }
}
