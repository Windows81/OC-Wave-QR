package com.google.android.gms.internal.measurement;

import android.content.SharedPreferences;

public final /* synthetic */ class zzjd implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public /* synthetic */ zzja f25553a;

    public /* synthetic */ zzjd(zzja zzja) {
        this.f25553a = zzja;
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        this.f25553a.d(sharedPreferences, str);
    }
}
