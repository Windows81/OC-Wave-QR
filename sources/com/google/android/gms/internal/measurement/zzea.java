package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzdv;

final class zzea extends zzdv.zzb {
    public final /* synthetic */ Bundle D;
    public final /* synthetic */ zzdv E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzea(zzdv zzdv, Bundle bundle) {
        super(zzdv);
        this.D = bundle;
        this.E = zzdv;
    }

    public final void a() {
        ((zzdk) Preconditions.m(this.E.f25429i)).setConditionalUserProperty(this.D, this.f25433z);
    }
}
