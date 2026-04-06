package com.hansecom.abt.presentation.appUpdate;

import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Provider;

public final class AppUpdateHelper_Factory implements Factory<AppUpdateHelper> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f34155a;

    public static AppUpdateHelper b(Context context) {
        return new AppUpdateHelper(context);
    }

    /* renamed from: a */
    public AppUpdateHelper get() {
        return b((Context) this.f34155a.get());
    }
}
