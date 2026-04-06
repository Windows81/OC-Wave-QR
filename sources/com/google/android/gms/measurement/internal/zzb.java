package com.google.android.gms.measurement.internal;

final class zzb implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ long f26226A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ zza f26227B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ String f26228z;

    public zzb(zza zza, String str, long j2) {
        this.f26228z = str;
        this.f26226A = j2;
        this.f26227B = zza;
    }

    public final void run() {
        zza.C(this.f26227B, this.f26228z, this.f26226A);
    }
}
