package com.hansecom.abt.api.oauth;

import com.hansecom.abt.data.preferences.AuthenticationPreferences;
import com.hansecom.abt.data.useCases.LogOutUseCase;
import com.hansecom.abt.data.useCases.auth.RefreshAccessTokenUseCase;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Address;
import okhttp3.Authenticator;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Route;
import timber.log.Timber;

@Singleton
@Metadata
public final class OAuthAuthenticator implements Authenticator {

    /* renamed from: d  reason: collision with root package name */
    public final AuthenticationPreferences f33149d;

    /* renamed from: e  reason: collision with root package name */
    public final RefreshAccessTokenUseCase f33150e;

    /* renamed from: f  reason: collision with root package name */
    public final LogOutUseCase f33151f;

    public OAuthAuthenticator(AuthenticationPreferences authenticationPreferences, RefreshAccessTokenUseCase refreshAccessTokenUseCase, LogOutUseCase logOutUseCase) {
        Intrinsics.i(authenticationPreferences, "authenticationPreferences");
        Intrinsics.i(refreshAccessTokenUseCase, "refreshTokenUseCase");
        Intrinsics.i(logOutUseCase, "logoutUseCase");
        this.f33149d = authenticationPreferences;
        this.f33150e = refreshAccessTokenUseCase;
        this.f33151f = logOutUseCase;
    }

    public Request a(Route route, Response response) {
        Intrinsics.i(response, "response");
        Timber.Forest forest = Timber.f44337a;
        Address a2 = route != null ? route.a() : null;
        forest.i("authenticate for " + a2, new Object[0]);
        return e(response.E());
    }

    public final synchronized Request e(Request request) {
        return (Request) BuildersKt__BuildersKt.b((CoroutineContext) null, new OAuthAuthenticator$authenticate$1(request, this, (Continuation) null), 1, (Object) null);
    }
}
