package com.hansecom.abt.api;

import com.hansecom.abt.AppInfo;
import dagger.internal.Factory;
import dagger.internal.Provider;

public final class AppPropertiesHeaderInterceptor_Factory implements Factory<AppPropertiesHeaderInterceptor> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f33112a;

    /* renamed from: b  reason: collision with root package name */
    public final Provider f33113b;

    public static AppPropertiesHeaderInterceptor b(RealmPreferences realmPreferences, AppInfo appInfo) {
        return new AppPropertiesHeaderInterceptor(realmPreferences, appInfo);
    }

    /* renamed from: a */
    public AppPropertiesHeaderInterceptor get() {
        return b((RealmPreferences) this.f33112a.get(), (AppInfo) this.f33113b.get());
    }
}
