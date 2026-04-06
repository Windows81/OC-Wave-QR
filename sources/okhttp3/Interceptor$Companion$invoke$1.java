package okhttp3;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;

@Metadata
public final class Interceptor$Companion$invoke$1 implements Interceptor {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Function1 f42679a;

    public final Response intercept(Interceptor.Chain chain) {
        Intrinsics.i(chain, "it");
        return (Response) this.f42679a.invoke(chain);
    }
}
