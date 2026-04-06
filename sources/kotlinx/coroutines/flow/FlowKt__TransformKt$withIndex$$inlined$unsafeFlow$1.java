package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.IndexedValue;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Ref;

@Metadata
public final class FlowKt__TransformKt$withIndex$$inlined$unsafeFlow$1 implements Flow<IndexedValue<Object>> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Flow f41710z;

    public Object a(FlowCollector flowCollector, Continuation continuation) {
        Object a2 = this.f41710z.a(new FlowKt__TransformKt$withIndex$1$1(flowCollector, new Ref.IntRef()), continuation);
        return a2 == IntrinsicsKt.f() ? a2 : Unit.f40552a;
    }
}
