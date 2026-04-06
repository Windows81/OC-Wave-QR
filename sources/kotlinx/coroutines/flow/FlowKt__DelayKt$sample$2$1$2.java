package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.flow.internal.NullSurrogateKt;

@Metadata
@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$1$2", f = "Delay.kt", l = {293}, m = "invokeSuspend")
public final class FlowKt__DelayKt$sample$2$1$2 extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {
    public int D;
    public final /* synthetic */ Ref.ObjectRef E;
    public final /* synthetic */ FlowCollector F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$sample$2$1$2(Ref.ObjectRef objectRef, FlowCollector flowCollector, Continuation continuation) {
        super(2, continuation);
        this.E = objectRef;
        this.F = flowCollector;
    }

    /* renamed from: A */
    public final Object m(Unit unit, Continuation continuation) {
        return ((FlowKt__DelayKt$sample$2$1$2) s(unit, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        return new FlowKt__DelayKt$sample$2$1$2(this.E, this.F, continuation);
    }

    public final Object x(Object obj) {
        Object f2 = IntrinsicsKt.f();
        int i2 = this.D;
        if (i2 == 0) {
            ResultKt.b(obj);
            Ref.ObjectRef objectRef = this.E;
            Object obj2 = objectRef.f40908z;
            if (obj2 == null) {
                return Unit.f40552a;
            }
            objectRef.f40908z = null;
            FlowCollector flowCollector = this.F;
            if (obj2 == NullSurrogateKt.f41808a) {
                obj2 = null;
            }
            this.D = 1;
            if (flowCollector.c(obj2, this) == f2) {
                return f2;
            }
        } else if (i2 == 1) {
            ResultKt.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.f40552a;
    }
}
