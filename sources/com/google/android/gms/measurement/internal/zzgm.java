package com.google.android.gms.measurement.internal;

import android.os.Bundle;

public final class zzgm {

    /* renamed from: a  reason: collision with root package name */
    public String f26340a;

    /* renamed from: b  reason: collision with root package name */
    public String f26341b;

    /* renamed from: c  reason: collision with root package name */
    public long f26342c;

    /* renamed from: d  reason: collision with root package name */
    public Bundle f26343d;

    public zzgm(String str, String str2, Bundle bundle, long j2) {
        this.f26340a = str;
        this.f26341b = str2;
        this.f26343d = bundle == null ? new Bundle() : bundle;
        this.f26342c = j2;
    }

    public static zzgm b(zzbh zzbh) {
        return new zzgm(zzbh.f26256z, zzbh.f26255B, zzbh.f26254A.X(), zzbh.C);
    }

    public final zzbh a() {
        return new zzbh(this.f26340a, new zzbc(new Bundle(this.f26343d)), this.f26341b, this.f26342c);
    }

    public final String toString() {
        String str = this.f26341b;
        String str2 = this.f26340a;
        String valueOf = String.valueOf(this.f26343d);
        return "origin=" + str + ",name=" + str2 + ",params=" + valueOf;
    }
}
