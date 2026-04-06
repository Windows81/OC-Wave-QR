package com.hansecom.abt.data.preferences;

import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Provider;

public final class AppPreferences_Factory implements Factory<AppPreferences> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f33310a;

    public static AppPreferences b(Context context) {
        return new AppPreferences(context);
    }

    /* renamed from: a */
    public AppPreferences get() {
        return b((Context) this.f33310a.get());
    }
}
