package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzdv;

final class zzfd extends zzdv.zzb {
    public final /* synthetic */ Long D;
    public final /* synthetic */ String E;
    public final /* synthetic */ String F;
    public final /* synthetic */ Bundle G;
    public final /* synthetic */ boolean H;
    public final /* synthetic */ boolean I;
    public final /* synthetic */ zzdv J;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzfd(zzdv zzdv, Long l2, String str, String str2, Bundle bundle, boolean z2, boolean z3) {
        super(zzdv);
        this.D = l2;
        this.E = str;
        this.F = str2;
        this.G = bundle;
        this.H = z2;
        this.I = z3;
        this.J = zzdv;
    }

    public final void a() {
        Long l2 = this.D;
        ((zzdk) Preconditions.m(this.J.f25429i)).logEvent(this.E, this.F, this.G, this.H, this.I, l2 == null ? this.f25433z : l2.longValue());
    }
}
