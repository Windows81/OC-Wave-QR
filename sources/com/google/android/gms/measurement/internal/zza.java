package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import java.util.Map;

public final class zza extends zzg {

    /* renamed from: b  reason: collision with root package name */
    public final Map f26161b = new ArrayMap();

    /* renamed from: c  reason: collision with root package name */
    public final Map f26162c = new ArrayMap();

    /* renamed from: d  reason: collision with root package name */
    public long f26163d;

    public zza(zzhw zzhw) {
        super(zzhw);
    }

    /* access modifiers changed from: private */
    public final void B(long j2) {
        for (String put : this.f26161b.keySet()) {
            this.f26161b.put(put, Long.valueOf(j2));
        }
        if (!this.f26161b.isEmpty()) {
            this.f26163d = j2;
        }
    }

    public static /* synthetic */ void C(zza zza, String str, long j2) {
        zza.n();
        Preconditions.g(str);
        Integer num = (Integer) zza.f26162c.get(str);
        if (num != null) {
            zzlh C = zza.s().C(false);
            int intValue = num.intValue() - 1;
            if (intValue == 0) {
                zza.f26162c.remove(str);
                Long l2 = (Long) zza.f26161b.get(str);
                if (l2 == null) {
                    zza.m().G().a("First ad unit exposure time was never set");
                } else {
                    zza.f26161b.remove(str);
                    zza.A(str, j2 - l2.longValue(), C);
                }
                if (zza.f26162c.isEmpty()) {
                    long j3 = zza.f26163d;
                    if (j3 == 0) {
                        zza.m().G().a("First ad exposure time was never set");
                        return;
                    }
                    zza.w(j2 - j3, C);
                    zza.f26163d = 0;
                    return;
                }
                return;
            }
            zza.f26162c.put(str, Integer.valueOf(intValue));
            return;
        }
        zza.m().G().b("Call to endAdUnitExposure for unknown ad unit id", str);
    }

    public static /* synthetic */ void y(zza zza, String str, long j2) {
        zza.n();
        Preconditions.g(str);
        if (zza.f26162c.isEmpty()) {
            zza.f26163d = j2;
        }
        Integer num = (Integer) zza.f26162c.get(str);
        if (num != null) {
            zza.f26162c.put(str, Integer.valueOf(num.intValue() + 1));
        } else if (zza.f26162c.size() >= 100) {
            zza.m().L().a("Too many ads visible");
        } else {
            zza.f26162c.put(str, 1);
            zza.f26161b.put(str, Long.valueOf(j2));
        }
    }

    public final void A(String str, long j2, zzlh zzlh) {
        if (zzlh == null) {
            m().K().a("Not logging ad unit exposure. No active activity");
        } else if (j2 < 1000) {
            m().K().b("Not logging ad unit exposure. Less than 1000 ms. exposure", Long.valueOf(j2));
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str);
            bundle.putLong("_xt", j2);
            zzop.X(zzlh, bundle, true);
            r().b1("am", "_xu", bundle);
        }
    }

    public final void D(String str, long j2) {
        if (str == null || str.length() == 0) {
            m().G().a("Ad unit id must be a non-empty string");
        } else {
            f().D(new zzb(this, str, j2));
        }
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

    public final /* bridge */ /* synthetic */ zza o() {
        return super.o();
    }

    public final /* bridge */ /* synthetic */ zzgc p() {
        return super.p();
    }

    public final /* bridge */ /* synthetic */ zzgf q() {
        return super.q();
    }

    public final /* bridge */ /* synthetic */ zzjk r() {
        return super.r();
    }

    public final /* bridge */ /* synthetic */ zzlg s() {
        return super.s();
    }

    public final /* bridge */ /* synthetic */ zzlp t() {
        return super.t();
    }

    public final /* bridge */ /* synthetic */ zznb u() {
        return super.u();
    }

    public final void v(long j2) {
        zzlh C = s().C(false);
        for (String str : this.f26161b.keySet()) {
            A(str, j2 - ((Long) this.f26161b.get(str)).longValue(), C);
        }
        if (!this.f26161b.isEmpty()) {
            w(j2 - this.f26163d, C);
        }
        B(j2);
    }

    public final void w(long j2, zzlh zzlh) {
        if (zzlh == null) {
            m().K().a("Not logging ad exposure. No active activity");
        } else if (j2 < 1000) {
            m().K().b("Not logging ad exposure. Less than 1000 ms. exposure", Long.valueOf(j2));
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("_xt", j2);
            zzop.X(zzlh, bundle, true);
            r().b1("am", "_xa", bundle);
        }
    }

    public final void z(String str, long j2) {
        if (str == null || str.length() == 0) {
            m().G().a("Ad unit id must be a non-empty string");
        } else {
            f().D(new zzc(this, str, j2));
        }
    }
}
