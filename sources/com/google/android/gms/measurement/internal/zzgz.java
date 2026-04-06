package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.Preconditions;

public final class zzgz {

    /* renamed from: a  reason: collision with root package name */
    public final String f26396a;

    /* renamed from: b  reason: collision with root package name */
    public final long f26397b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f26398c;

    /* renamed from: d  reason: collision with root package name */
    public long f26399d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ zzgu f26400e;

    public zzgz(zzgu zzgu, String str, long j2) {
        this.f26400e = zzgu;
        Preconditions.g(str);
        this.f26396a = str;
        this.f26397b = j2;
    }

    public final long a() {
        if (!this.f26398c) {
            this.f26398c = true;
            this.f26399d = this.f26400e.J().getLong(this.f26396a, this.f26397b);
        }
        return this.f26399d;
    }

    public final void b(long j2) {
        SharedPreferences.Editor edit = this.f26400e.J().edit();
        edit.putLong(this.f26396a, j2);
        edit.apply();
        this.f26399d = j2;
    }
}
