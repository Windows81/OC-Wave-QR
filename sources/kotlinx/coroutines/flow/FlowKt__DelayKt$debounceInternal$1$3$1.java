package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.flow.internal.NullSurrogateKt;
import kotlinx.coroutines.internal.Symbol;

@Metadata
@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$1", f = "Delay.kt", l = {226}, m = "invokeSuspend")
public final class FlowKt__DelayKt$debounceInternal$1$3$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    public int D;
    public final /* synthetic */ FlowCollector E;
    public final /* synthetic */ Ref.ObjectRef F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$debounceInternal$1$3$1(FlowCollector flowCollector, Ref.ObjectRef objectRef, Continuation continuation) {
        super(1, continuation);
        this.E = flowCollector;
        this.F = objectRef;
    }

    public final Continuation A(Continuation continuation) {
        return new FlowKt__DelayKt$debounceInternal$1$3$1(this.E, this.F, continuation);
    }

    /* renamed from: B */
    public final Object invoke(Continuation continuation) {
        return ((FlowKt__DelayKt$debounceInternal$1$3$1) A(continuation)).x(Unit.f40552a);
    }

    public final Object x(Object obj) {
        Object f2 = IntrinsicsKt.f();
        int i2 = this.D;
        if (i2 == 0) {
            ResultKt.b(obj);
            FlowCollector flowCollector = this.E;
            Symbol symbol = NullSurrogateKt.f41808a;
            Object obj2 = this.F.f40908z;
            if (obj2 == symbol) {
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
        this.F.f40908z = null;
        return Unit.f40552a;
    }
}
