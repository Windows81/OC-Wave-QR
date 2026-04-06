package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzdl;

final class zzn implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ String f26854A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ String f26855B;
    public final /* synthetic */ AppMeasurementDynamiteService C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ zzdl f26856z;

    public zzn(AppMeasurementDynamiteService appMeasurementDynamiteService, zzdl zzdl, String str, String str2) {
        this.f26856z = zzdl;
        this.f26854A = str;
        this.f26855B = str2;
        this.C = appMeasurementDynamiteService;
    }

    public final void run() {
        this.C.f26155l.J().F(this.f26856z, this.f26854A, this.f26855B);
    }
}
