package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;

@Metadata
public final class FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2 implements Flow<Object> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Object f41588z;

    public FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2(Object obj) {
        this.f41588z = obj;
    }

    public Object a(FlowCollector flowCollector, Continuation continuation) {
        Object c2 = flowCollector.c(this.f41588z, continuation);
        return c2 == IntrinsicsKt.f() ? c2 : Unit.f40552a;
    }
}
