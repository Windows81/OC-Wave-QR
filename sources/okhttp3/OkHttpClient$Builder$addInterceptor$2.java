package okhttp3;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;

@Metadata
public final class OkHttpClient$Builder$addInterceptor$2 implements Interceptor {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Function1 f42745a;

    public final Response intercept(Interceptor.Chain chain) {
        Intrinsics.i(chain, "chain");
        return (Response) this.f42745a.invoke(chain);
    }
}
