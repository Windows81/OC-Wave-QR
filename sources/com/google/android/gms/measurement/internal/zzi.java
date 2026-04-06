package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzdl;

final class zzi implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ zzbh f26519A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ String f26520B;
    public final /* synthetic */ AppMeasurementDynamiteService C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ zzdl f26521z;

    public zzi(AppMeasurementDynamiteService appMeasurementDynamiteService, zzdl zzdl, zzbh zzbh, String str) {
        this.f26521z = zzdl;
        this.f26519A = zzbh;
        this.f26520B = str;
        this.C = appMeasurementDynamiteService;
    }

    public final void run() {
        this.C.f26155l.J().E(this.f26521z, this.f26519A, this.f26520B);
    }
}
