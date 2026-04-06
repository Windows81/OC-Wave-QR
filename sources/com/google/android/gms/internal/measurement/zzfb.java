package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzdv;

final class zzfb extends zzdv.zzb {
    public final /* synthetic */ zzdv.zzd D;
    public final /* synthetic */ zzdv E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzfb(zzdv zzdv, zzdv.zzd zzd) {
        super(zzdv);
        this.D = zzd;
        this.E = zzdv;
    }

    public final void a() {
        ((zzdk) Preconditions.m(this.E.f25429i)).registerOnMeasurementEventListener(this.D);
    }
}
