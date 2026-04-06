package com.hansecom.abt.api;

import android.content.Context;
import com.hansecom.abt.AppInfo;
import dagger.internal.Factory;
import dagger.internal.Provider;

public final class RealmPreferences_Factory implements Factory<RealmPreferences> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f33126a;

    /* renamed from: b  reason: collision with root package name */
    public final Provider f33127b;

    public static RealmPreferences b(Context context, AppInfo appInfo) {
        return new RealmPreferences(context, appInfo);
    }

    /* renamed from: a */
    public RealmPreferences get() {
        return b((Context) this.f33126a.get(), (AppInfo) this.f33127b.get());
    }
}
