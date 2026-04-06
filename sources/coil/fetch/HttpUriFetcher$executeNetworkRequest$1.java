package coil.fetch;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import okhttp3.Request;

@Metadata
@DebugMetadata(c = "coil.fetch.HttpUriFetcher", f = "HttpUriFetcher.kt", l = {224}, m = "executeNetworkRequest")
public final class HttpUriFetcher$executeNetworkRequest$1 extends ContinuationImpl {
    public /* synthetic */ Object C;
    public final /* synthetic */ HttpUriFetcher D;
    public int E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HttpUriFetcher$executeNetworkRequest$1(HttpUriFetcher httpUriFetcher, Continuation continuation) {
        super(continuation);
        this.D = httpUriFetcher;
    }

    public final Object x(Object obj) {
        this.C = obj;
        this.E |= Integer.MIN_VALUE;
        return this.D.c((Request) null, this);
    }
}
