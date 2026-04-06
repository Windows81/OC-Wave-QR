package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Ref;

@Metadata
public final class FlowKt__LimitKt$drop$$inlined$unsafeFlow$1 implements Flow<Object> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ int f41620A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Flow f41621z;

    public FlowKt__LimitKt$drop$$inlined$unsafeFlow$1(Flow flow, int i2) {
        this.f41621z = flow;
        this.f41620A = i2;
    }

    public Object a(FlowCollector flowCollector, Continuation continuation) {
        Object a2 = this.f41621z.a(new FlowKt__LimitKt$drop$2$1(new Ref.IntRef(), this.f41620A, flowCollector), continuation);
        return a2 == IntrinsicsKt.f() ? a2 : Unit.f40552a;
    }
}
