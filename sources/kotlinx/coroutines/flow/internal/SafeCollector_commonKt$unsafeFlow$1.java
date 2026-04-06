package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata
public final class SafeCollector_commonKt$unsafeFlow$1 implements Flow<Object> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function2 f41812z;

    public Object a(FlowCollector flowCollector, Continuation continuation) {
        Object m2 = this.f41812z.m(flowCollector, continuation);
        return m2 == IntrinsicsKt.f() ? m2 : Unit.f40552a;
    }
}
