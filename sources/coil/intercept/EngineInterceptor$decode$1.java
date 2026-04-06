package coil.intercept;

import coil.ComponentRegistry;
import coil.EventListener;
import coil.fetch.SourceResult;
import coil.request.ImageRequest;
import coil.request.Options;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata
@DebugMetadata(c = "coil.intercept.EngineInterceptor", f = "EngineInterceptor.kt", l = {203}, m = "decode")
public final class EngineInterceptor$decode$1 extends ContinuationImpl {
    public Object C;
    public Object D;
    public Object E;
    public Object F;
    public Object G;
    public Object H;
    public Object I;
    public Object J;
    public int K;
    public /* synthetic */ Object L;
    public final /* synthetic */ EngineInterceptor M;
    public int N;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EngineInterceptor$decode$1(EngineInterceptor engineInterceptor, Continuation continuation) {
        super(continuation);
        this.M = engineInterceptor;
    }

    public final Object x(Object obj) {
        this.L = obj;
        this.N |= Integer.MIN_VALUE;
        return this.M.i((SourceResult) null, (ComponentRegistry) null, (ImageRequest) null, (Object) null, (Options) null, (EventListener) null, this);
    }
}
