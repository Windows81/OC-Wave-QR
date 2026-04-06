package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata
public final class CombineKt$zipImpl$$inlined$unsafeFlow$1 implements Flow<Object> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Flow f41792A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function3 f41793B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Flow f41794z;

    public Object a(FlowCollector flowCollector, Continuation continuation) {
        Object f2 = CoroutineScopeKt.f(new CombineKt$zipImpl$1$1(this.f41794z, this.f41792A, flowCollector, this.f41793B, (Continuation) null), continuation);
        return f2 == IntrinsicsKt.f() ? f2 : Unit.f40552a;
    }
}
