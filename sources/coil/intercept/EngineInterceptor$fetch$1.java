package coil.intercept;

import coil.ComponentRegistry;
import coil.EventListener;
import coil.request.ImageRequest;
import coil.request.Options;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata
@DebugMetadata(c = "coil.intercept.EngineInterceptor", f = "EngineInterceptor.kt", l = {169}, m = "fetch")
public final class EngineInterceptor$fetch$1 extends ContinuationImpl {
    public Object C;
    public Object D;
    public Object E;
    public Object F;
    public Object G;
    public Object H;
    public Object I;
    public int J;
    public /* synthetic */ Object K;
    public final /* synthetic */ EngineInterceptor L;
    public int M;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EngineInterceptor$fetch$1(EngineInterceptor engineInterceptor, Continuation continuation) {
        super(continuation);
        this.L = engineInterceptor;
    }

    public final Object x(Object obj) {
        this.K = obj;
        this.M |= Integer.MIN_VALUE;
        return this.L.k((ComponentRegistry) null, (ImageRequest) null, (Object) null, (Options) null, (EventListener) null, this);
    }
}
