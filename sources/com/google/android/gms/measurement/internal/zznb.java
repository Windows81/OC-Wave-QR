package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.measurement.zzdh;

public final class zznb extends zzf {

    /* renamed from: c  reason: collision with root package name */
    public Handler f26859c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f26860d = true;

    /* renamed from: e  reason: collision with root package name */
    public final zznj f26861e = new zznj(this);

    /* renamed from: f  reason: collision with root package name */
    public final zznh f26862f = new zznh(this);

    /* renamed from: g  reason: collision with root package name */
    public final zznc f26863g = new zznc(this);

    public zznb(zzhw zzhw) {
        super(zzhw);
    }

    public static /* synthetic */ void C(zznb zznb, long j2) {
        zznb.n();
        zznb.G();
        zznb.m().K().b("Activity paused, time", Long.valueOf(j2));
        zznb.f26863g.b(j2);
        if (zznb.d().Z()) {
            zznb.f26862f.e(j2);
        }
    }

    public static /* synthetic */ void I(zznb zznb, long j2) {
        zznb.n();
        zznb.G();
        zznb.m().K().b("Activity resumed, time", Long.valueOf(j2));
        if (zznb.d().t(zzbj.O0)) {
            if (zznb.d().Z() || zznb.f26860d) {
                zznb.f26862f.f(j2);
            }
        } else if (zznb.d().Z() || zznb.i().f26374u.b()) {
            zznb.f26862f.f(j2);
        }
        zznb.f26863g.a();
        zznj zznj = zznb.f26861e;
        zznj.f26879a.n();
        if (zznj.f26879a.f26587a.p()) {
            zznj.b(zznj.f26879a.b().a(), false);
        }
    }

    public final boolean A() {
        return false;
    }

    public final void D(boolean z2) {
        n();
        this.f26860d = z2;
    }

    public final boolean E(boolean z2, boolean z3, long j2) {
        return this.f26862f.d(z2, z3, j2);
    }

    public final boolean F() {
        n();
        return this.f26860d;
    }

    public final void G() {
        n();
        if (this.f26859c == null) {
            this.f26859c = new zzdh(Looper.getMainLooper());
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
}
