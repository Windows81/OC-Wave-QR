package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.flow.internal.AbortFlowException;
import kotlinx.coroutines.flow.internal.NullSurrogateKt;
import kotlinx.coroutines.internal.Symbol;

@Metadata
public final class FlowKt__ReduceKt$singleOrNull$$inlined$collectWhile$1 implements FlowCollector<Object> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f41663z;

    public FlowKt__ReduceKt$singleOrNull$$inlined$collectWhile$1(Ref.ObjectRef objectRef) {
        this.f41663z = objectRef;
    }

    public Object c(Object obj, Continuation continuation) {
        Ref.ObjectRef objectRef = this.f41663z;
        Object obj2 = objectRef.f40908z;
        Symbol symbol = NullSurrogateKt.f41808a;
        if (obj2 == symbol) {
            objectRef.f40908z = obj;
            return Unit.f40552a;
        }
        objectRef.f40908z = symbol;
        throw new AbortFlowException(this);
    }
}
