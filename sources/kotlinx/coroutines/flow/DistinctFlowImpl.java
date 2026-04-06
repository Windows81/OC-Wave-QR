package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.flow.internal.NullSurrogateKt;

@Metadata
final class DistinctFlowImpl<T> implements Flow<T> {

    /* renamed from: A  reason: collision with root package name */
    public final Function1 f41570A;

    /* renamed from: B  reason: collision with root package name */
    public final Function2 f41571B;

    /* renamed from: z  reason: collision with root package name */
    public final Flow f41572z;

    public DistinctFlowImpl(Flow flow, Function1 function1, Function2 function2) {
        this.f41572z = flow;
        this.f41570A = function1;
        this.f41571B = function2;
    }

    public Object a(FlowCollector flowCollector, Continuation continuation) {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.f40908z = NullSurrogateKt.f41808a;
        Object a2 = this.f41572z.a(new DistinctFlowImpl$collect$2(this, objectRef, flowCollector), continuation);
        return a2 == IntrinsicsKt.f() ? a2 : Unit.f40552a;
    }
}
