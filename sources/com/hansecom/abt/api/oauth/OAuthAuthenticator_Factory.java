package com.hansecom.abt.api.oauth;

import com.hansecom.abt.data.preferences.AuthenticationPreferences;
import com.hansecom.abt.data.useCases.LogOutUseCase;
import com.hansecom.abt.data.useCases.auth.RefreshAccessTokenUseCase;
import dagger.internal.Factory;
import dagger.internal.Provider;

public final class OAuthAuthenticator_Factory implements Factory<OAuthAuthenticator> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f33152a;

    /* renamed from: b  reason: collision with root package name */
    public final Provider f33153b;

    /* renamed from: c  reason: collision with root package name */
    public final Provider f33154c;

    public static OAuthAuthenticator b(AuthenticationPreferences authenticationPreferences, RefreshAccessTokenUseCase refreshAccessTokenUseCase, LogOutUseCase logOutUseCase) {
        return new OAuthAuthenticator(authenticationPreferences, refreshAccessTokenUseCase, logOutUseCase);
    }

    /* renamed from: a */
    public OAuthAuthenticator get() {
        return b((AuthenticationPreferences) this.f33152a.get(), (RefreshAccessTokenUseCase) this.f33153b.get(), (LogOutUseCase) this.f33154c.get());
    }
}
