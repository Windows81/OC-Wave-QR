package com.hansecom.abt.data.useCases.auth;

import com.hansecom.abt.api.RealmPreferences;
import com.hansecom.abt.api.oauth.OAuthService;
import com.hansecom.abt.data.preferences.AuthenticationPreferences;
import com.hansecom.abt.data.useCases.lock.SetShownUserBiometricDialogUseCase;
import dagger.internal.Factory;
import dagger.internal.Provider;

public final class LogInUseCase_Factory implements Factory<LogInUseCase> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f33800a;

    /* renamed from: b  reason: collision with root package name */
    public final Provider f33801b;

    /* renamed from: c  reason: collision with root package name */
    public final Provider f33802c;

    /* renamed from: d  reason: collision with root package name */
    public final Provider f33803d;

    public static LogInUseCase b(OAuthService oAuthService, AuthenticationPreferences authenticationPreferences, SetShownUserBiometricDialogUseCase setShownUserBiometricDialogUseCase, RealmPreferences realmPreferences) {
        return new LogInUseCase(oAuthService, authenticationPreferences, setShownUserBiometricDialogUseCase, realmPreferences);
    }

    /* renamed from: a */
    public LogInUseCase get() {
        return b((OAuthService) this.f33800a.get(), (AuthenticationPreferences) this.f33801b.get(), (SetShownUserBiometricDialogUseCase) this.f33802c.get(), (RealmPreferences) this.f33803d.get());
    }
}
