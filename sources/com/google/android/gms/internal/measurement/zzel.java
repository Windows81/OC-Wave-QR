package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzdv;

final class zzel extends zzdv.zzb {
    public final /* synthetic */ zzdi D;
    public final /* synthetic */ zzdv E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzel(zzdv zzdv, zzdi zzdi) {
        super(zzdv);
        this.D = zzdi;
        this.E = zzdv;
    }

    public final void a() {
        ((zzdk) Preconditions.m(this.E.f25429i)).getGmpAppId(this.D);
    }

    public final void b() {
        this.D.u((Bundle) null);
    }
}
