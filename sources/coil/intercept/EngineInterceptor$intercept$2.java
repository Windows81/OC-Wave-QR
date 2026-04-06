package coil.intercept;

import coil.EventListener;
import coil.intercept.EngineInterceptor;
import coil.intercept.Interceptor;
import coil.memory.MemoryCache;
import coil.request.ImageRequest;
import coil.request.Options;
import coil.request.SuccessResult;
import coil.util.Utils;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata
@DebugMetadata(c = "coil.intercept.EngineInterceptor$intercept$2", f = "EngineInterceptor.kt", l = {77}, m = "invokeSuspend")
public final class EngineInterceptor$intercept$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super SuccessResult>, Object> {
    public int D;
    public final /* synthetic */ EngineInterceptor E;
    public final /* synthetic */ ImageRequest F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ Options H;
    public final /* synthetic */ EventListener I;
    public final /* synthetic */ MemoryCache.Key J;
    public final /* synthetic */ Interceptor.Chain K;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EngineInterceptor$intercept$2(EngineInterceptor engineInterceptor, ImageRequest imageRequest, Object obj, Options options, EventListener eventListener, MemoryCache.Key key, Interceptor.Chain chain, Continuation continuation) {
        super(2, continuation);
        this.E = engineInterceptor;
        this.F = imageRequest;
        this.G = obj;
        this.H = options;
        this.I = eventListener;
        this.J = key;
        this.K = chain;
    }

    /* renamed from: A */
    public final Object m(CoroutineScope coroutineScope, Continuation continuation) {
        return ((EngineInterceptor$intercept$2) s(coroutineScope, continuation)).x(Unit.f40552a);
    }

    public final Continuation s(Object obj, Continuation continuation) {
        return new EngineInterceptor$intercept$2(this.E, this.F, this.G, this.H, this.I, this.J, this.K, continuation);
    }

    public final Object x(Object obj) {
        Object f2 = IntrinsicsKt.f();
        int i2 = this.D;
        if (i2 == 0) {
            ResultKt.b(obj);
            EngineInterceptor engineInterceptor = this.E;
            ImageRequest imageRequest = this.F;
            Object obj2 = this.G;
            Options options = this.H;
            EventListener eventListener = this.I;
            this.D = 1;
            obj = engineInterceptor.j(imageRequest, obj2, options, eventListener, this);
            if (obj == f2) {
                return f2;
            }
        } else if (i2 == 1) {
            ResultKt.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        EngineInterceptor.ExecuteResult executeResult = (EngineInterceptor.ExecuteResult) obj;
        this.E.f23464b.c();
        return new SuccessResult(executeResult.e(), this.F, executeResult.c(), this.E.f23467e.h(this.J, this.F, executeResult) ? this.J : null, executeResult.d(), executeResult.f(), Utils.u(this.K));
    }
}
