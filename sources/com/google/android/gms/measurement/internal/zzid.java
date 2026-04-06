package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;

final class zzid implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ zzia f26530A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ zzp f26531z;

    public zzid(zzia zzia, zzp zzp) {
        this.f26531z = zzp;
        this.f26530A = zzia;
    }

    public final void run() {
        this.f26530A.f26522l.z0();
        zznv N = this.f26530A.f26522l;
        zzp zzp = this.f26531z;
        N.f().n();
        N.A0();
        Preconditions.g(zzp.f26977z);
        N.i(zzp);
    }
}
