package com.hansecom.abt.data.preferences;

import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Provider;

public final class LockPreferences_Factory implements Factory<LockPreferences> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f33327a;

    public static LockPreferences b(Context context) {
        return new LockPreferences(context);
    }

    /* renamed from: a */
    public LockPreferences get() {
        return b((Context) this.f33327a.get());
    }
}
