package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function3;

@Metadata
public final class FlowKt__EmittersKt$unsafeTransform$$inlined$unsafeFlow$1 implements Flow<Object> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function3 f41606A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Flow f41607z;

    @Metadata
    /* renamed from: kotlinx.coroutines.flow.FlowKt__EmittersKt$unsafeTransform$$inlined$unsafeFlow$1$1  reason: invalid class name */
    public static final class AnonymousClass1 extends ContinuationImpl {
        public /* synthetic */ Object C;
        public int D;
        public final /* synthetic */ FlowKt__EmittersKt$unsafeTransform$$inlined$unsafeFlow$1 E;

        public final Object x(Object obj) {
            this.C = obj;
            this.D |= Integer.MIN_VALUE;
            return this.E.a((FlowCollector) null, this);
        }
    }

    public Object a(FlowCollector flowCollector, Continuation continuation) {
        Object a2 = this.f41607z.a(new FlowKt__EmittersKt$unsafeTransform$1$1(this.f41606A, flowCollector), continuation);
        return a2 == IntrinsicsKt.f() ? a2 : Unit.f40552a;
    }
}
