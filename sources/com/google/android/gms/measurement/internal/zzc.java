package com.google.android.gms.measurement.internal;

final class zzc implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ long f26285A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ zza f26286B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ String f26287z;

    public zzc(zza zza, String str, long j2) {
        this.f26287z = str;
        this.f26285A = j2;
        this.f26286B = zza;
    }

    public final void run() {
        zza.y(this.f26286B, this.f26287z, this.f26285A);
    }
}
