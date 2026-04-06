package com.google.android.gms.measurement.internal;

final class zzkd implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ zzjk f26670A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ long f26671z;

    public zzkd(zzjk zzjk, long j2) {
        this.f26671z = j2;
        this.f26670A = zzjk;
    }

    public final void run() {
        this.f26670A.i().f26366m.b(this.f26671z);
        this.f26670A.m().F().b("Session timeout duration set", Long.valueOf(this.f26671z));
    }
}
