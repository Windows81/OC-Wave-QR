package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.measurement.zzfx;
import com.google.android.gms.internal.measurement.zzrw;
import java.util.HashMap;

public final class zznq extends zzno {
    public zznq(zznv zznv) {
        super(zznv);
    }

    private final String w(String str) {
        String R = r().R(str);
        if (TextUtils.isEmpty(R)) {
            return (String) zzbj.f26276r.a((Object) null);
        }
        Uri parse = Uri.parse((String) zzbj.f26276r.a((Object) null));
        Uri.Builder buildUpon = parse.buildUpon();
        String authority = parse.getAuthority();
        buildUpon.authority(R + "." + authority);
        return buildUpon.build().toString();
    }

    public final /* bridge */ /* synthetic */ Context a() {
        return super.a();
    }

    public final /* bridge */ /* synthetic */ Clock b() {
        return super.b();
    }

    public final /* bridge */ /* synthetic */ zzah d() {
        return super.d();
    }

    public final /* bridge */ /* synthetic */ zzac e() {
        return super.e();
    }

    public final /* bridge */ /* synthetic */ zzhp f() {
        return super.f();
    }

    public final /* bridge */ /* synthetic */ zzbb g() {
        return super.g();
    }

    public final /* bridge */ /* synthetic */ zzgh h() {
        return super.h();
    }

    public final /* bridge */ /* synthetic */ zzgu i() {
        return super.i();
    }

    public final /* bridge */ /* synthetic */ zzop j() {
        return super.j();
    }

    public final /* bridge */ /* synthetic */ void k() {
        super.k();
    }

    public final /* bridge */ /* synthetic */ void l() {
        super.l();
    }

    public final /* bridge */ /* synthetic */ zzgi m() {
        return super.m();
    }

    public final /* bridge */ /* synthetic */ void n() {
        super.n();
    }

    public final /* bridge */ /* synthetic */ zzol o() {
        return super.o();
    }

    public final /* bridge */ /* synthetic */ zzv p() {
        return super.p();
    }

    public final /* bridge */ /* synthetic */ zzam q() {
        return super.q();
    }

    public final /* bridge */ /* synthetic */ zzhg r() {
        return super.r();
    }

    public final /* bridge */ /* synthetic */ zzms s() {
        return super.s();
    }

    public final /* bridge */ /* synthetic */ zznq t() {
        return super.t();
    }

    public final zzns u(String str) {
        zzh L0;
        if (zzrw.a() && d().t(zzbj.x0)) {
            j();
            if (zzop.H0(str)) {
                m().K().a("sgtm feature flag enabled.");
                zzh L02 = q().L0(str);
                if (L02 == null) {
                    return new zzns(w(str), zznt.GOOGLE_ANALYTICS);
                }
                String m2 = L02.m();
                zzfx.zzd L = r().L(str);
                if (L == null || (L0 = q().L0(str)) == null || ((!L.d0() || L.T().n() != 100) && !j().E0(str, L0.v()) && (TextUtils.isEmpty(m2) || m2.hashCode() % 100 >= L.T().n()))) {
                    return new zzns(w(str), zznt.GOOGLE_ANALYTICS);
                }
                zzns zzns = null;
                if (L02.C()) {
                    m().K().a("sgtm upload enabled in manifest.");
                    zzfx.zzd L2 = r().L(L02.l());
                    if (L2 != null && L2.d0()) {
                        String M = L2.T().M();
                        if (!TextUtils.isEmpty(M)) {
                            String L3 = L2.T().L();
                            m().K().c("sgtm configured with upload_url, server_info", M, TextUtils.isEmpty(L3) ? "Y" : "N");
                            if (TextUtils.isEmpty(L3)) {
                                zzns = new zzns(M, zznt.SGTM);
                            } else {
                                HashMap hashMap = new HashMap();
                                hashMap.put("x-sgtm-server-info", L3);
                                if (!TextUtils.isEmpty(L02.v())) {
                                    hashMap.put("x-gtm-server-preview", L02.v());
                                }
                                zzns = new zzns(M, hashMap, zznt.SGTM);
                            }
                        }
                    }
                }
                if (zzns != null) {
                    return zzns;
                }
            }
        }
        return new zzns(w(str), zznt.GOOGLE_ANALYTICS);
    }

    public final String v(zzh zzh) {
        Uri.Builder builder = new Uri.Builder();
        String q2 = zzh.q();
        if (TextUtils.isEmpty(q2)) {
            q2 = zzh.j();
        }
        Uri.Builder encodedAuthority = builder.scheme((String) zzbj.f26264f.a((Object) null)).encodedAuthority((String) zzbj.f26265g.a((Object) null));
        encodedAuthority.path("config/app/" + q2).appendQueryParameter("platform", "android").appendQueryParameter("gmp_version", "102001").appendQueryParameter("runtime_version", "0");
        return builder.build().toString();
    }
}
