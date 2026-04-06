package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzdv;

final class zzfa extends zzdv.zzb {
    public final /* synthetic */ boolean D;
    public final /* synthetic */ zzdv E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzfa(zzdv zzdv, boolean z2) {
        super(zzdv);
        this.D = z2;
        this.E = zzdv;
    }

    public final void a() {
        ((zzdk) Preconditions.m(this.E.f25429i)).setDataCollectionEnabled(this.D);
    }
}
