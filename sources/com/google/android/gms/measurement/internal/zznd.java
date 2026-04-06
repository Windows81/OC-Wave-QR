package com.google.android.gms.measurement.internal;

final class zznd implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ zznb f26866A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ long f26867z;

    public zznd(zznb zznb, long j2) {
        this.f26867z = j2;
        this.f26866A = zznb;
    }

    public final void run() {
        zznb.C(this.f26866A, this.f26867z);
    }
}
