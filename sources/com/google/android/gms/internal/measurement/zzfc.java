package com.google.android.gms.internal.measurement;

import android.content.Intent;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzdv;

final class zzfc extends zzdv.zzb {
    public final /* synthetic */ Intent D;
    public final /* synthetic */ zzdv E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzfc(zzdv zzdv, Intent intent) {
        super(zzdv);
        this.D = intent;
        this.E = zzdv;
    }

    public final void a() {
        ((zzdk) Preconditions.m(this.E.f25429i)).setSgtmDebugInfo(this.D);
    }
}
