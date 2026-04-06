package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.Preconditions;

public final class zzha {

    /* renamed from: a  reason: collision with root package name */
    public final String f26429a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f26430b;

    /* renamed from: c  reason: collision with root package name */
    public String f26431c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ zzgu f26432d;

    public zzha(zzgu zzgu, String str, String str2) {
        this.f26432d = zzgu;
        Preconditions.g(str);
        this.f26429a = str;
    }

    public final String a() {
        if (!this.f26430b) {
            this.f26430b = true;
            this.f26431c = this.f26432d.J().getString(this.f26429a, (String) null);
        }
        return this.f26431c;
    }

    public final void b(String str) {
        SharedPreferences.Editor edit = this.f26432d.J().edit();
        edit.putString(this.f26429a, str);
        edit.apply();
        this.f26431c = str;
    }
}
