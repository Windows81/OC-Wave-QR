package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzdv;

final class zzdz extends zzdv.zzb {
    public final /* synthetic */ String D;
    public final /* synthetic */ String E;
    public final /* synthetic */ Bundle F;
    public final /* synthetic */ zzdv G;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzdz(zzdv zzdv, String str, String str2, Bundle bundle) {
        super(zzdv);
        this.D = str;
        this.E = str2;
        this.F = bundle;
        this.G = zzdv;
    }

    public final void a() {
        ((zzdk) Preconditions.m(this.G.f25429i)).clearConditionalUserProperty(this.D, this.E, this.F);
    }
}
