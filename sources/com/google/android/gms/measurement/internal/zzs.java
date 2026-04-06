package com.google.android.gms.measurement.internal;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;

public final class zzs {

    /* renamed from: a  reason: collision with root package name */
    public final zzhw f26980a;

    public zzs(zzhw zzhw) {
        this.f26980a = zzhw;
    }

    public final void a() {
        this.f26980a.f().n();
        if (d()) {
            if (e()) {
                this.f26980a.F().f26378y.b((String) null);
                Bundle bundle = new Bundle();
                bundle.putString("source", "(not set)");
                bundle.putString("medium", "(not set)");
                bundle.putString("_cis", "intent");
                bundle.putLong("_cc", 1);
                this.f26980a.H().b1("auto", "_cmpx", bundle);
            } else {
                String a2 = this.f26980a.F().f26378y.a();
                if (TextUtils.isEmpty(a2)) {
                    this.f26980a.m().I().a("Cache still valid but referrer not found");
                } else {
                    long a3 = ((this.f26980a.F().f26379z.a() / 3600000) - 1) * 3600000;
                    Uri parse = Uri.parse(a2);
                    Bundle bundle2 = new Bundle();
                    Pair pair = new Pair(parse.getPath(), bundle2);
                    for (String next : parse.getQueryParameterNames()) {
                        bundle2.putString(next, parse.getQueryParameter(next));
                    }
                    ((Bundle) pair.second).putLong("_cc", a3);
                    Object obj = pair.first;
                    this.f26980a.H().b1(obj == null ? "app" : (String) obj, "_cmp", (Bundle) pair.second);
                }
                this.f26980a.F().f26378y.b((String) null);
            }
            this.f26980a.F().f26379z.b(0);
        }
    }

    public final void b(String str, Bundle bundle) {
        String str2;
        this.f26980a.f().n();
        if (!this.f26980a.p()) {
            if (bundle == null || bundle.isEmpty()) {
                str2 = null;
            } else {
                if (str == null || str.isEmpty()) {
                    str = "auto";
                }
                Uri.Builder builder = new Uri.Builder();
                builder.path(str);
                for (String next : bundle.keySet()) {
                    builder.appendQueryParameter(next, bundle.getString(next));
                }
                str2 = builder.build().toString();
            }
            if (!TextUtils.isEmpty(str2)) {
                this.f26980a.F().f26378y.b(str2);
                this.f26980a.F().f26379z.b(this.f26980a.b().a());
            }
        }
    }

    public final void c() {
        if (d() && e()) {
            this.f26980a.F().f26378y.b((String) null);
        }
    }

    public final boolean d() {
        return this.f26980a.F().f26379z.a() > 0;
    }

    public final boolean e() {
        return d() && this.f26980a.b().a() - this.f26980a.F().f26379z.a() > this.f26980a.z().C((String) null, zzbj.W);
    }
}
