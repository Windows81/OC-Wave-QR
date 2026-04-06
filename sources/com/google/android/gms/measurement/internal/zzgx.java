package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.Preconditions;

public final class zzgx {

    /* renamed from: a  reason: collision with root package name */
    public final String f26386a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f26387b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f26388c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f26389d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ zzgu f26390e;

    public zzgx(zzgu zzgu, String str, boolean z2) {
        this.f26390e = zzgu;
        Preconditions.g(str);
        this.f26386a = str;
        this.f26387b = z2;
    }

    public final void a(boolean z2) {
        SharedPreferences.Editor edit = this.f26390e.J().edit();
        edit.putBoolean(this.f26386a, z2);
        edit.apply();
        this.f26389d = z2;
    }

    public final boolean b() {
        if (!this.f26388c) {
            this.f26388c = true;
            this.f26389d = this.f26390e.J().getBoolean(this.f26386a, this.f26387b);
        }
        return this.f26389d;
    }
}
