package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.flow.internal.NullSurrogateKt;
import kotlinx.coroutines.selects.SelectImplementation;

@Metadata
@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2", f = "Delay.kt", l = {412}, m = "invokeSuspend")
final class FlowKt__DelayKt$sample$2 extends SuspendLambda implements Function3<CoroutineScope, FlowCollector<Object>, Continuation<? super Unit>, Object> {
    public Object D;
    public Object E;
    public int F;
    public /* synthetic */ Object G;
    public /* synthetic */ Object H;
    public final /* synthetic */ long I;
    public final /* synthetic */ Flow J;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$sample$2(long j2, Flow flow, Continuation continuation) {
        super(3, continuation);
        this.I = j2;
        this.J = flow;
    }

    /* renamed from: A */
    public final Object d(CoroutineScope coroutineScope, FlowCollector flowCollector, Continuation continuation) {
        FlowKt__DelayKt$sample$2 flowKt__DelayKt$sample$2 = new FlowKt__DelayKt$sample$2(this.I, this.J, continuation);
        flowKt__DelayKt$sample$2.G = coroutineScope;
        flowKt__DelayKt$sample$2.H = flowCollector;
        return flowKt__DelayKt$sample$2.x(Unit.f40552a);
    }

    public final Object x(Object obj) {
        FlowCollector flowCollector;
        ReceiveChannel receiveChannel;
        Ref.ObjectRef objectRef;
        ReceiveChannel receiveChannel2;
        Object f2 = IntrinsicsKt.f();
        int i2 = this.F;
        if (i2 == 0) {
            ResultKt.b(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.G;
            ReceiveChannel d2 = ProduceKt.d(coroutineScope, (CoroutineContext) null, -1, new FlowKt__DelayKt$sample$2$values$1(this.J, (Continuation) null), 1, (Object) null);
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            ReceiveChannel H2 = FlowKt.H(coroutineScope, this.I);
            flowCollector = (FlowCollector) this.H;
            receiveChannel2 = H2;
            Ref.ObjectRef objectRef3 = objectRef2;
            receiveChannel = d2;
            objectRef = objectRef3;
        } else if (i2 == 1) {
            receiveChannel2 = (ReceiveChannel) this.E;
            objectRef = (Ref.ObjectRef) this.D;
            receiveChannel = (ReceiveChannel) this.H;
            flowCollector = (FlowCollector) this.G;
            ResultKt.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        while (objectRef.f40908z != NullSurrogateKt.f41810c) {
            SelectImplementation selectImplementation = new SelectImplementation(f());
            selectImplementation.g(receiveChannel.i(), new FlowKt__DelayKt$sample$2$1$1(objectRef, receiveChannel2, (Continuation) null));
            selectImplementation.g(receiveChannel2.h(), new FlowKt__DelayKt$sample$2$1$2(objectRef, flowCollector, (Continuation) null));
            this.G = flowCollector;
            this.H = receiveChannel;
            this.D = objectRef;
            this.E = receiveChannel2;
            this.F = 1;
            if (selectImplementation.q(this) == f2) {
                return f2;
            }
        }
        return Unit.f40552a;
    }
}
