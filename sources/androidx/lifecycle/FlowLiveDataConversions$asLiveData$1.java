package androidx.lifecycle;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata
@DebugMetadata(c = "androidx.lifecycle.FlowLiveDataConversions$asLiveData$1", f = "FlowLiveData.kt", l = {78}, m = "invokeSuspend")
final class FlowLiveDataConversions$asLiveData$1 extends SuspendLambda implements Function2<LiveDataScope<Object>, Continuation<? super Unit>, Object> {
    public int D;
    public /* synthetic */ Object E;
    public final /* synthetic */ Flow F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowLiveDataConversions$asLiveData$1(Flow flow, Continuation continuation) {
        super(2, continuation);
        this.F = flow;
    }

    /* renamed from: A */
    public final Object m(LiveDataScope liveDataScope, Continuation continuation) {
        return ((FlowLiveDataConversions$asLiveData$1) s(liveDataScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        FlowLiveDataConversions$asLiveData$1 flowLiveDataConversions$asLiveData$1 = new FlowLiveDataConversions$asLiveData$1(this.F, continuation);
        flowLiveDataConversions$asLiveData$1.E = obj;
        return flowLiveDataConversions$asLiveData$1;
    }

    public final Object x(Object obj) {
        Object f2 = IntrinsicsKt.f();
        int i2 = this.D;
        if (i2 == 0) {
            ResultKt.b(obj);
            final LiveDataScope liveDataScope = (LiveDataScope) this.E;
            Flow flow = this.F;
            AnonymousClass1 r3 = new FlowCollector() {
                public final Object c(Object obj, Continuation continuation) {
                    Object c2 = liveDataScope.c(obj, continuation);
                    return c2 == IntrinsicsKt.f() ? c2 : Unit.f40552a;
                }
            };
            this.D = 1;
            if (flow.a(r3, this) == f2) {
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
