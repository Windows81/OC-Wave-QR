package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;

final class zziq implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ zzia f26567A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ zzp f26568z;

    public zziq(zzia zzia, zzp zzp) {
        this.f26568z = zzp;
        this.f26567A = zzia;
    }

    public final void run() {
        this.f26567A.f26522l.z0();
        zznv N = this.f26567A.f26522l;
        zzp zzp = this.f26568z;
        N.f().n();
        N.A0();
        Preconditions.g(zzp.f26977z);
        N.o0(zzp);
        N.m0(zzp);
    }
}
