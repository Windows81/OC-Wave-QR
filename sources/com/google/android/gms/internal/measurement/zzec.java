package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzdv;

final class zzec extends zzdv.zzb {
    public final /* synthetic */ String D;
    public final /* synthetic */ String E;
    public final /* synthetic */ zzdi F;
    public final /* synthetic */ zzdv G;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzec(zzdv zzdv, String str, String str2, zzdi zzdi) {
        super(zzdv);
        this.D = str;
        this.E = str2;
        this.F = zzdi;
        this.G = zzdv;
    }

    public final void a() {
        ((zzdk) Preconditions.m(this.G.f25429i)).getConditionalUserProperties(this.D, this.E, this.F);
    }

    public final void b() {
        this.F.u((Bundle) null);
    }
}
