package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;

@Metadata
public final class FlowKt__MergeKt$flattenConcat$$inlined$unsafeFlow$1 implements Flow<Object> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Flow f41655z;

    public Object a(FlowCollector flowCollector, Continuation continuation) {
        Object a2 = this.f41655z.a(new FlowKt__MergeKt$flattenConcat$1$1(flowCollector), continuation);
        return a2 == IntrinsicsKt.f() ? a2 : Unit.f40552a;
    }
}
