package com.hansecom.abt.api.oauth;

import com.hansecom.abt.data.preferences.AuthenticationPreferences;
import dagger.internal.Factory;
import dagger.internal.Provider;

public final class OAuthInterceptor_Factory implements Factory<OAuthInterceptor> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f33162a;

    public static OAuthInterceptor b(AuthenticationPreferences authenticationPreferences) {
        return new OAuthInterceptor(authenticationPreferences);
    }

    /* renamed from: a */
    public OAuthInterceptor get() {
        return b((AuthenticationPreferences) this.f33162a.get());
    }
}
