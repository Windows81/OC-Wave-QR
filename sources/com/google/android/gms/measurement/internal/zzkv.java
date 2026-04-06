package com.google.android.gms.measurement.internal;

final class zzkv implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ zzjk f26710A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ zzaz f26711z;

    public zzkv(zzjk zzjk, zzaz zzaz) {
        this.f26711z = zzaz;
        this.f26710A = zzjk;
    }

    public final void run() {
        if (this.f26710A.i().A(this.f26711z)) {
            this.f26710A.m().K().b("Setting DMA consent(FE)", this.f26711z);
            if (this.f26710A.t().k0()) {
                this.f26710A.t().f0();
            } else {
                this.f26710A.t().V(false);
            }
        } else {
            this.f26710A.m().J().b("Lower precedence consent source ignored, proposed source", Integer.valueOf(this.f26711z.a()));
        }
    }
}
