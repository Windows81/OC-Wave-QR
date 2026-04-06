package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;

final class zzlu implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ boolean f26773A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ zzok f26774B;
    public final /* synthetic */ zzlp C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ zzp f26775z;

    public zzlu(zzlp zzlp, zzp zzp, boolean z2, zzok zzok) {
        this.f26775z = zzp;
        this.f26773A = z2;
        this.f26774B = zzok;
        this.C = zzlp;
    }

    public final void run() {
        zzgb B2 = this.C.f26759d;
        if (B2 == null) {
            this.C.m().G().a("Discarding data. Failed to set user property");
            return;
        }
        Preconditions.m(this.f26775z);
        this.C.K(B2, this.f26773A ? null : this.f26774B, this.f26775z);
        this.C.n0();
    }
}
