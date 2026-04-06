package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.time.Duration;
import kotlinx.coroutines.TimeoutCancellationException;

@Metadata
@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1$1$2", f = "Delay.kt", l = {}, m = "invokeSuspend")
public final class FlowKt__DelayKt$timeoutInternal$1$1$2 extends SuspendLambda implements Function1<Continuation<?>, Object> {
    public int D;
    public final /* synthetic */ long E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$timeoutInternal$1$1$2(long j2, Continuation continuation) {
        super(1, continuation);
        this.E = j2;
    }

    public final Continuation A(Continuation continuation) {
        return new FlowKt__DelayKt$timeoutInternal$1$1$2(this.E, continuation);
    }

    /* renamed from: B */
    public final Object invoke(Continuation continuation) {
        return ((FlowKt__DelayKt$timeoutInternal$1$1$2) A(continuation)).x(Unit.f40552a);
    }

    public final Object x(Object obj) {
        IntrinsicsKt.f();
        if (this.D != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        throw new TimeoutCancellationException("Timed out waiting for " + Duration.Y(this.E));
    }
}
