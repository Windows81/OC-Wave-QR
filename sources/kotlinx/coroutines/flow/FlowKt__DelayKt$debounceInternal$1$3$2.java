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
import kotlinx.coroutines.flow.internal.NullSurrogateKt;

@Metadata
@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$2", f = "Delay.kt", l = {236}, m = "invokeSuspend")
public final class FlowKt__DelayKt$debounceInternal$1$3$2 extends SuspendLambda implements Function2<ChannelResult<? extends Object>, Continuation<? super Unit>, Object> {
    public Object D;
    public int E;
    public /* synthetic */ Object F;
    public final /* synthetic */ Ref.ObjectRef G;
    public final /* synthetic */ FlowCollector H;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$debounceInternal$1$3$2(Ref.ObjectRef objectRef, FlowCollector flowCollector, Continuation continuation) {
        super(2, continuation);
        this.G = objectRef;
        this.H = flowCollector;
    }

    public final Object A(Object obj, Continuation continuation) {
        return ((FlowKt__DelayKt$debounceInternal$1$3$2) s(ChannelResult.b(obj), continuation)).x(Unit.f40552a);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        return A(((ChannelResult) obj).l(), (Continuation) obj2);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        FlowKt__DelayKt$debounceInternal$1$3$2 flowKt__DelayKt$debounceInternal$1$3$2 = new FlowKt__DelayKt$debounceInternal$1$3$2(this.G, this.H, continuation);
        flowKt__DelayKt$debounceInternal$1$3$2.F = obj;
        return flowKt__DelayKt$debounceInternal$1$3$2;
    }

    public final Object x(Object obj) {
        Ref.ObjectRef objectRef;
        Ref.ObjectRef objectRef2;
        Object f2 = IntrinsicsKt.f();
        int i2 = this.E;
        if (i2 == 0) {
            ResultKt.b(obj);
            Object l2 = ((ChannelResult) this.F).l();
            objectRef = this.G;
            boolean z2 = l2 instanceof ChannelResult.Failed;
            if (!z2) {
                objectRef.f40908z = l2;
            }
            FlowCollector flowCollector = this.H;
            if (z2) {
                Throwable e2 = ChannelResult.e(l2);
                if (e2 == null) {
                    Object obj2 = objectRef.f40908z;
                    if (obj2 != null) {
                        if (obj2 == NullSurrogateKt.f41808a) {
                            obj2 = null;
                        }
                        this.F = l2;
                        this.D = objectRef;
                        this.E = 1;
                        if (flowCollector.c(obj2, this) == f2) {
                            return f2;
                        }
                        objectRef2 = objectRef;
                    }
                    objectRef.f40908z = NullSurrogateKt.f41810c;
                } else {
                    throw e2;
                }
            }
            return Unit.f40552a;
        } else if (i2 == 1) {
            objectRef2 = (Ref.ObjectRef) this.D;
            ResultKt.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        objectRef = objectRef2;
        objectRef.f40908z = NullSurrogateKt.f41810c;
        return Unit.f40552a;
    }
}
