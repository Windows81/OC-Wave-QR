package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;

@Metadata
public final class FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$1 implements Flow<Object> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function0 f41577z;

    public Object a(FlowCollector flowCollector, Continuation continuation) {
        Object c2 = flowCollector.c(this.f41577z.invoke(), continuation);
        return c2 == IntrinsicsKt.f() ? c2 : Unit.f40552a;
    }
}
