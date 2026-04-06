package com.google.android.gms.measurement.internal;

final class zzmp implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ zzmm f26829A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ zzgb f26830z;

    public zzmp(zzmm zzmm, zzgb zzgb) {
        this.f26830z = zzgb;
        this.f26829A = zzmm;
    }

    public final void run() {
        synchronized (this.f26829A) {
            try {
                this.f26829A.f26821a = false;
                if (!this.f26829A.f26823c.h0()) {
                    this.f26829A.f26823c.m().K().a("Connected to service");
                    this.f26829A.f26823c.J(this.f26830z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
