package com.hansecom.abt.data.preferences;

import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Provider;

public final class AuthenticationPreferences_Factory implements Factory<AuthenticationPreferences> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f33316a;

    public static AuthenticationPreferences b(Context context) {
        return new AuthenticationPreferences(context);
    }

    /* renamed from: a */
    public AuthenticationPreferences get() {
        return b((Context) this.f33316a.get());
    }
}
