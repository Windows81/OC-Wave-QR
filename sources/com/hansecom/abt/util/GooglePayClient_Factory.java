package com.hansecom.abt.util;

import android.content.Context;
import com.hansecom.abt.api.RealmPreferences;
import dagger.internal.Factory;
import dagger.internal.Provider;

public final class GooglePayClient_Factory implements Factory<GooglePayClient> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f39014a;

    /* renamed from: b  reason: collision with root package name */
    public final Provider f39015b;

    public static GooglePayClient b(Context context, RealmPreferences realmPreferences) {
        return new GooglePayClient(context, realmPreferences);
    }

    /* renamed from: a */
    public GooglePayClient get() {
        return b((Context) this.f39014a.get(), (RealmPreferences) this.f39015b.get());
    }
}
