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
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.flow.internal.ChildCancelledException;
import kotlinx.coroutines.flow.internal.NullSurrogateKt;

@Metadata
@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$1$1", f = "Delay.kt", l = {}, m = "invokeSuspend")
public final class FlowKt__DelayKt$sample$2$1$1 extends SuspendLambda implements Function2<ChannelResult<? extends Object>, Continuation<? super Unit>, Object> {
    public int D;
    public /* synthetic */ Object E;
    public final /* synthetic */ Ref.ObjectRef F;
    public final /* synthetic */ ReceiveChannel G;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$sample$2$1$1(Ref.ObjectRef objectRef, ReceiveChannel receiveChannel, Continuation continuation) {
        super(2, continuation);
        this.F = objectRef;
        this.G = receiveChannel;
    }

    public final Object A(Object obj, Continuation continuation) {
        return ((FlowKt__DelayKt$sample$2$1$1) s(ChannelResult.b(obj), continuation)).x(Unit.f40552a);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        return A(((ChannelResult) obj).l(), (Continuation) obj2);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        FlowKt__DelayKt$sample$2$1$1 flowKt__DelayKt$sample$2$1$1 = new FlowKt__DelayKt$sample$2$1$1(this.F, this.G, continuation);
        flowKt__DelayKt$sample$2$1$1.E = obj;
        return flowKt__DelayKt$sample$2$1$1;
    }

    public final Object x(Object obj) {
        IntrinsicsKt.f();
        if (this.D == 0) {
            ResultKt.b(obj);
            Object l2 = ((ChannelResult) this.E).l();
            Ref.ObjectRef objectRef = this.F;
            boolean z2 = l2 instanceof ChannelResult.Failed;
            if (!z2) {
                objectRef.f40908z = l2;
            }
            ReceiveChannel receiveChannel = this.G;
            if (z2) {
                Throwable e2 = ChannelResult.e(l2);
                if (e2 == null) {
                    receiveChannel.c(new ChildCancelledException());
                    objectRef.f40908z = NullSurrogateKt.f41810c;
                } else {
                    throw e2;
                }
            }
            return Unit.f40552a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
