package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.flow.internal.NullSurrogateKt;

@Metadata
public final class FlowKt__TransformKt$runningReduce$$inlined$unsafeFlow$1 implements Flow<Object> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function3 f41708A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Flow f41709z;

    public Object a(FlowCollector flowCollector, Continuation continuation) {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.f40908z = NullSurrogateKt.f41808a;
        Object a2 = this.f41709z.a(new FlowKt__TransformKt$runningReduce$1$1(objectRef, this.f41708A, flowCollector), continuation);
        return a2 == IntrinsicsKt.f() ? a2 : Unit.f40552a;
    }
}
