package com.google.android.gms.measurement.internal;

final class zzkb implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ zzjk f26667A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ boolean f26668z;

    public zzkb(zzjk zzjk, boolean z2) {
        this.f26668z = z2;
        this.f26667A = zzjk;
    }

    public final void run() {
        boolean p2 = this.f26667A.f26587a.p();
        boolean o2 = this.f26667A.f26587a.o();
        this.f26667A.f26587a.l(this.f26668z);
        if (o2 == this.f26668z) {
            this.f26667A.f26587a.m().K().b("Default data collection state already set to", Boolean.valueOf(this.f26668z));
        }
        if (this.f26667A.f26587a.p() == p2 || this.f26667A.f26587a.p() != this.f26667A.f26587a.o()) {
            this.f26667A.f26587a.m().M().c("Default data collection is different than actual status", Boolean.valueOf(this.f26668z), Boolean.valueOf(p2));
        }
        this.f26667A.K0();
    }
}
