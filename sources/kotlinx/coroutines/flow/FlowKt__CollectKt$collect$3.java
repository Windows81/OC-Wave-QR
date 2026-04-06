package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function2;

@Metadata
public final class FlowKt__CollectKt$collect$3 implements FlowCollector<Object> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function2 f41589z;

    public Object c(Object obj, Continuation continuation) {
        Object m2 = this.f41589z.m(obj, continuation);
        return m2 == IntrinsicsKt.f() ? m2 : Unit.f40552a;
    }
}
