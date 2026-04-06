package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Iterator;

public final class zzba {

    /* renamed from: a  reason: collision with root package name */
    public final String f26229a;

    /* renamed from: b  reason: collision with root package name */
    public final String f26230b;

    /* renamed from: c  reason: collision with root package name */
    public final String f26231c;

    /* renamed from: d  reason: collision with root package name */
    public final long f26232d;

    /* renamed from: e  reason: collision with root package name */
    public final long f26233e;

    /* renamed from: f  reason: collision with root package name */
    public final zzbc f26234f;

    public zzba(zzhw zzhw, String str, String str2, String str3, long j2, long j3, Bundle bundle) {
        zzbc zzbc;
        Preconditions.g(str2);
        Preconditions.g(str3);
        this.f26229a = str2;
        this.f26230b = str3;
        this.f26231c = TextUtils.isEmpty(str) ? null : str;
        this.f26232d = j2;
        this.f26233e = j3;
        if (j3 != 0 && j3 > j2) {
            zzhw.m().L().b("Event created with reverse previous/current timestamps. appId", zzgi.v(str2));
        }
        if (bundle == null || bundle.isEmpty()) {
            zzbc = new zzbc(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    zzhw.m().G().a("Param name can't be null");
                    it.remove();
                } else {
                    Object s0 = zzhw.L().s0(next, bundle2.get(next));
                    if (s0 == null) {
                        zzhw.m().L().b("Param value can't be null", zzhw.D().f(next));
                        it.remove();
                    } else {
                        zzhw.L().O(bundle2, next, s0);
                    }
                }
            }
            zzbc = new zzbc(bundle2);
        }
        this.f26234f = zzbc;
    }

    public final zzba a(zzhw zzhw, long j2) {
        return new zzba(zzhw, this.f26231c, this.f26229a, this.f26230b, this.f26232d, j2, this.f26234f);
    }

    public final String toString() {
        String str = this.f26229a;
        String str2 = this.f26230b;
        String valueOf = String.valueOf(this.f26234f);
        return "Event{appId='" + str + "', name='" + str2 + "', params=" + valueOf + "}";
    }

    public zzba(zzhw zzhw, String str, String str2, String str3, long j2, long j3, zzbc zzbc) {
        Preconditions.g(str2);
        Preconditions.g(str3);
        Preconditions.m(zzbc);
        this.f26229a = str2;
        this.f26230b = str3;
        this.f26231c = TextUtils.isEmpty(str) ? null : str;
        this.f26232d = j2;
        this.f26233e = j3;
        if (j3 != 0 && j3 > j2) {
            zzhw.m().L().c("Event created with reverse previous/current timestamps. appId, name", zzgi.v(str2), zzgi.v(str3));
        }
        this.f26234f = zzbc;
    }
}
