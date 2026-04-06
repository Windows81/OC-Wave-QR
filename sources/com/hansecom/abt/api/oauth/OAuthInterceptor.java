package com.hansecom.abt.api.oauth;

import com.hansecom.abt.api.RequestExtKt;
import com.hansecom.abt.data.preferences.AuthenticationPreferences;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import timber.log.Timber;

@Singleton
@Metadata
public final class OAuthInterceptor implements Interceptor {

    /* renamed from: a  reason: collision with root package name */
    public final AuthenticationPreferences f33161a;

    public OAuthInterceptor(AuthenticationPreferences authenticationPreferences) {
        Intrinsics.i(authenticationPreferences, "preferences");
        this.f33161a = authenticationPreferences;
    }

    public Response intercept(Interceptor.Chain chain) {
        Intrinsics.i(chain, "chain");
        Request m2 = chain.m();
        String a2 = RequestExtKt.a(m2);
        if (a2 != null) {
            Timber.Forest forest = Timber.f44337a;
            forest.n(a2 + " already in " + m2, new Object[0]);
            return chain.b(m2);
        }
        String str = (String) BuildersKt__BuildersKt.b((CoroutineContext) null, new OAuthInterceptor$intercept$token$1(this, (Continuation) null), 1, (Object) null);
        if (str != null) {
            return chain.b(RequestExtKt.c(m2, str));
        }
        Timber.Forest forest2 = Timber.f44337a;
        forest2.o("Missing access token in preferences for " + m2, new Object[0]);
        return chain.b(m2);
    }
}
