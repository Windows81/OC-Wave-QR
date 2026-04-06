package com.google.android.gms.measurement.internal;

final class zznc {

    /* renamed from: a  reason: collision with root package name */
    public zznf f26864a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ zznb f26865b;

    public zznc(zznb zznb) {
        this.f26865b = zznb;
    }

    public final void a() {
        this.f26865b.n();
        if (this.f26864a != null) {
            this.f26865b.f26859c.removeCallbacks(this.f26864a);
        }
        this.f26865b.i().f26374u.a(false);
        this.f26865b.D(false);
        if (this.f26865b.d().t(zzbj.L0) && this.f26865b.r().J0()) {
            this.f26865b.m().K().a("Retrying trigger URI registration in foreground");
            this.f26865b.r().H0();
        }
    }

    public final void b(long j2) {
        this.f26864a = new zznf(this, this.f26865b.b().a(), j2);
        this.f26865b.f26859c.postDelayed(this.f26864a, 2000);
    }
}
