package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzdl;

final class zzj implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ AppMeasurementDynamiteService f26588A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ zzdl f26589z;

    public zzj(AppMeasurementDynamiteService appMeasurementDynamiteService, zzdl zzdl) {
        this.f26589z = zzdl;
        this.f26588A = appMeasurementDynamiteService;
    }

    public final void run() {
        this.f26588A.f26155l.J().D(this.f26589z);
    }
}
