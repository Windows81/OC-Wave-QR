package okhttp3.internal.connection;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.http.RealInterceptorChain;

@Metadata
public final class ConnectInterceptor implements Interceptor {

    /* renamed from: a  reason: collision with root package name */
    public static final ConnectInterceptor f42902a = new ConnectInterceptor();

    public Response intercept(Interceptor.Chain chain) {
        Intrinsics.i(chain, "chain");
        RealInterceptorChain realInterceptorChain = (RealInterceptorChain) chain;
        return RealInterceptorChain.f(realInterceptorChain, 0, realInterceptorChain.g().t(realInterceptorChain), (Request) null, 0, 0, 0, 61, (Object) null).b(realInterceptorChain.k());
    }
}
