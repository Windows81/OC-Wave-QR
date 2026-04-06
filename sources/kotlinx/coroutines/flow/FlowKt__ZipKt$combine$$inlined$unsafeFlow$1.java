package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.internal.CombineKt;

@Metadata
public final class FlowKt__ZipKt$combine$$inlined$unsafeFlow$1 implements Flow<Object> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Flow f41728A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function3 f41729B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Flow f41730z;

    public FlowKt__ZipKt$combine$$inlined$unsafeFlow$1(Flow flow, Flow flow2, Function3 function3) {
        this.f41730z = flow;
        this.f41728A = flow2;
        this.f41729B = function3;
    }

    public Object a(FlowCollector flowCollector, Continuation continuation) {
        Object a2 = CombineKt.a(flowCollector, new Flow[]{this.f41730z, this.f41728A}, FlowKt__ZipKt.f(), new FlowKt__ZipKt$combine$1$1(this.f41729B, (Continuation) null), continuation);
        return a2 == IntrinsicsKt.f() ? a2 : Unit.f40552a;
    }
}
