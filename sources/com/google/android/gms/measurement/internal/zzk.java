package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

final class zzk implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ AppMeasurementDynamiteService f26664A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ AppMeasurementDynamiteService.zzb f26665z;

    public zzk(AppMeasurementDynamiteService appMeasurementDynamiteService, AppMeasurementDynamiteService.zzb zzb) {
        this.f26665z = zzb;
        this.f26664A = appMeasurementDynamiteService;
    }

    public final void run() {
        this.f26664A.f26155l.H().T(this.f26665z);
    }
}
