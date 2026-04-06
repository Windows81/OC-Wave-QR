package com.google.android.gms.measurement.internal;

final class zzmz implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Runnable f26852A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ zznv f26853z;

    public zzmz(zzmu zzmu, zznv zznv, Runnable runnable) {
        this.f26853z = zznv;
        this.f26852A = runnable;
    }

    public final void run() {
        this.f26853z.z0();
        this.f26853z.z(this.f26852A);
        this.f26853z.E0();
    }
}
