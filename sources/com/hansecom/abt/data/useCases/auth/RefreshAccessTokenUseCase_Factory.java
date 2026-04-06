package com.hansecom.abt.data.useCases.auth;

import com.hansecom.abt.api.RealmPreferences;
import com.hansecom.abt.api.oauth.OAuthService;
import com.hansecom.abt.data.preferences.AuthenticationPreferences;
import dagger.internal.Factory;
import dagger.internal.Provider;

public final class RefreshAccessTokenUseCase_Factory implements Factory<RefreshAccessTokenUseCase> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f33809a;

    /* renamed from: b  reason: collision with root package name */
    public final Provider f33810b;

    /* renamed from: c  reason: collision with root package name */
    public final Provider f33811c;

    public static RefreshAccessTokenUseCase b(OAuthService oAuthService, AuthenticationPreferences authenticationPreferences, RealmPreferences realmPreferences) {
        return new RefreshAccessTokenUseCase(oAuthService, authenticationPreferences, realmPreferences);
    }

    /* renamed from: a */
    public RefreshAccessTokenUseCase get() {
        return b((OAuthService) this.f33809a.get(), (AuthenticationPreferences) this.f33810b.get(), (RealmPreferences) this.f33811c.get());
    }
}
