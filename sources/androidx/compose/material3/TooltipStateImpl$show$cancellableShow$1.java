package androidx.compose.material3;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CancellableContinuationImpl;

@Metadata
@DebugMetadata(c = "androidx.compose.material3.TooltipStateImpl$show$cancellableShow$1", f = "Tooltip.kt", l = {1655}, m = "invokeSuspend")
public final class TooltipStateImpl$show$cancellableShow$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    public Object D;
    public int E;
    public final /* synthetic */ TooltipStateImpl F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TooltipStateImpl$show$cancellableShow$1(TooltipStateImpl tooltipStateImpl, Continuation continuation) {
        super(1, continuation);
        this.F = tooltipStateImpl;
    }

    public final Continuation A(Continuation continuation) {
        return new TooltipStateImpl$show$cancellableShow$1(this.F, continuation);
    }

    /* renamed from: B */
    public final Object invoke(Continuation continuation) {
        return ((TooltipStateImpl$show$cancellableShow$1) A(continuation)).x(Unit.f40552a);
    }

    public final Object x(Object obj) {
        Object f2 = IntrinsicsKt.f();
        int i2 = this.E;
        if (i2 == 0) {
            ResultKt.b(obj);
            TooltipStateImpl tooltipStateImpl = this.F;
            this.D = tooltipStateImpl;
            this.E = 1;
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.c(this), 1);
            cancellableContinuationImpl.G();
            tooltipStateImpl.c().h(Boxing.a(true));
            tooltipStateImpl.f11624d = cancellableContinuationImpl;
            Object A2 = cancellableContinuationImpl.A();
            if (A2 == IntrinsicsKt.f()) {
                DebugProbesKt.c(this);
            }
            if (A2 == f2) {
                return f2;
            }
        } else if (i2 == 1) {
            TooltipStateImpl tooltipStateImpl2 = (TooltipStateImpl) this.D;
            ResultKt.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.f40552a;
    }
}
