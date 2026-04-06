package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzdv;

final class zzej extends zzdv.zzb {
    public final /* synthetic */ String D;
    public final /* synthetic */ zzdv E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzej(zzdv zzdv, String str) {
        super(zzdv);
        this.D = str;
        this.E = zzdv;
    }

    public final void a() {
        ((zzdk) Preconditions.m(this.E.f25429i)).beginAdUnitExposure(this.D, this.f25431A);
    }
}
