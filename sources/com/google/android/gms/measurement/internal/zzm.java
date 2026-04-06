package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzdl;

final class zzm implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ AppMeasurementDynamiteService f26789A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ zzdl f26790z;

    public zzm(AppMeasurementDynamiteService appMeasurementDynamiteService, zzdl zzdl) {
        this.f26790z = zzdl;
        this.f26789A = appMeasurementDynamiteService;
    }

    public final void run() {
        this.f26789A.f26155l.L().U(this.f26790z, this.f26789A.f26155l.o());
    }
}
