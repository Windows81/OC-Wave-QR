package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzdv;

final class zzew extends zzdv.zzb {
    public final /* synthetic */ String D;
    public final /* synthetic */ zzdi E;
    public final /* synthetic */ zzdv F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzew(zzdv zzdv, String str, zzdi zzdi) {
        super(zzdv);
        this.D = str;
        this.E = zzdi;
        this.F = zzdv;
    }

    public final void a() {
        ((zzdk) Preconditions.m(this.F.f25429i)).getMaxUserProperties(this.D, this.E);
    }

    public final void b() {
        this.E.u((Bundle) null);
    }
}
