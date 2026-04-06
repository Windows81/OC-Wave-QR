package coil.intercept;

import coil.ComponentRegistry;
import coil.EventListener;
import coil.fetch.SourceResult;
import coil.intercept.EngineInterceptor;
import coil.request.ImageRequest;
import coil.request.Options;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;

@Metadata
@DebugMetadata(c = "coil.intercept.EngineInterceptor$execute$executeResult$1", f = "EngineInterceptor.kt", l = {131}, m = "invokeSuspend")
public final class EngineInterceptor$execute$executeResult$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super EngineInterceptor.ExecuteResult>, Object> {
    public int D;
    public final /* synthetic */ EngineInterceptor E;
    public final /* synthetic */ Ref.ObjectRef F;
    public final /* synthetic */ Ref.ObjectRef G;
    public final /* synthetic */ ImageRequest H;
    public final /* synthetic */ Object I;
    public final /* synthetic */ Ref.ObjectRef J;
    public final /* synthetic */ EventListener K;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EngineInterceptor$execute$executeResult$1(EngineInterceptor engineInterceptor, Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2, ImageRequest imageRequest, Object obj, Ref.ObjectRef objectRef3, EventListener eventListener, Continuation continuation) {
        super(2, continuation);
        this.E = engineInterceptor;
        this.F = objectRef;
        this.G = objectRef2;
        this.H = imageRequest;
        this.I = obj;
        this.J = objectRef3;
        this.K = eventListener;
    }

    /* renamed from: A */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((EngineInterceptor$execute$executeResult$1) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        return new EngineInterceptor$execute$executeResult$1(this.E, this.F, this.G, this.H, this.I, this.J, this.K, continuation);
    }

    public final Object x(Object obj) {
        Object f2 = IntrinsicsKt.f();
        int i2 = this.D;
        if (i2 == 0) {
            ResultKt.b(obj);
            EngineInterceptor engineInterceptor = this.E;
            EventListener eventListener = this.K;
            this.D = 1;
            obj = engineInterceptor.i((SourceResult) this.F.f40908z, (ComponentRegistry) this.G.f40908z, this.H, this.I, (Options) this.J.f40908z, eventListener, this);
            if (obj == f2) {
                return f2;
            }
        } else if (i2 == 1) {
            ResultKt.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return obj;
    }
}
