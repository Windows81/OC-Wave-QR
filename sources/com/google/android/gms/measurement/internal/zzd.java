package com.google.android.gms.measurement.internal;

import android.text.TextUtils;

final class zzd {

    /* renamed from: a  reason: collision with root package name */
    public final zzjb f26288a;

    public zzd(zzjb zzjb) {
        this.f26288a = zzjb;
    }

    public static zzd a(String str) {
        return new zzd((TextUtils.isEmpty(str) || str.length() > 1) ? zzjb.UNINITIALIZED : zzjc.c(str.charAt(0)));
    }

    public final zzjb b() {
        return this.f26288a;
    }

    public final String c() {
        return String.valueOf(zzjc.a(this.f26288a));
    }
}
