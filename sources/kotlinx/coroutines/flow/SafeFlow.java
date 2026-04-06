package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function2;

@Metadata
final class SafeFlow<T> extends AbstractFlow<T> {

    /* renamed from: z  reason: collision with root package name */
    public final Function2 f41746z;

    public SafeFlow(Function2 function2) {
        this.f41746z = function2;
    }

    public Object d(FlowCollector flowCollector, Continuation continuation) {
        Object m2 = this.f41746z.m(flowCollector, continuation);
        return m2 == IntrinsicsKt.f() ? m2 : Unit.f40552a;
    }
}
