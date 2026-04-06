package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;

public final /* synthetic */ class zzjv implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public /* synthetic */ zzjk f26657a;

    public /* synthetic */ zzjv(zzjk zzjk) {
        this.f26657a = zzjk;
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        this.f26657a.L(sharedPreferences, str);
    }
}
