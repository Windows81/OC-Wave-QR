package com.google.android.gms.measurement.internal;

final class zzmr implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ zzmm f26832A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ zzgb f26833z;

    public zzmr(zzmm zzmm, zzgb zzgb) {
        this.f26833z = zzgb;
        this.f26832A = zzmm;
    }

    public final void run() {
        synchronized (this.f26832A) {
            try {
                this.f26832A.f26821a = false;
                if (!this.f26832A.f26823c.h0()) {
                    this.f26832A.f26823c.m().F().a("Connected to remote service");
                    this.f26832A.f26823c.J(this.f26833z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
