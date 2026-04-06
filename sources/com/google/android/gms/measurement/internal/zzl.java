package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzdl;

final class zzl implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ String f26719A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ String f26720B;
    public final /* synthetic */ boolean C;
    public final /* synthetic */ AppMeasurementDynamiteService D;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ zzdl f26721z;

    public zzl(AppMeasurementDynamiteService appMeasurementDynamiteService, zzdl zzdl, String str, String str2, boolean z2) {
        this.f26721z = zzdl;
        this.f26719A = str;
        this.f26720B = str2;
        this.C = z2;
        this.D = appMeasurementDynamiteService;
    }

    public final void run() {
        this.D.f26155l.J().G(this.f26721z, this.f26719A, this.f26720B, this.C);
    }
}
