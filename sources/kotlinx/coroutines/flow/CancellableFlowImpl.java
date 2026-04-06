package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;

@Metadata
final class CancellableFlowImpl<T> implements CancellableFlow<T> {

    /* renamed from: z  reason: collision with root package name */
    public final Flow f41568z;

    public Object a(FlowCollector flowCollector, Continuation continuation) {
        Object a2 = this.f41568z.a(new CancellableFlowImpl$collect$2(flowCollector), continuation);
        return a2 == IntrinsicsKt.f() ? a2 : Unit.f40552a;
    }
}
