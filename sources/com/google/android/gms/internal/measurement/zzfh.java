package com.google.android.gms.internal.measurement;

import android.app.Activity;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.measurement.zzdv;

final class zzfh extends zzdv.zzb {
    public final /* synthetic */ Activity D;
    public final /* synthetic */ zzdv.zzc E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzfh(zzdv.zzc zzc, Activity activity) {
        super(zzdv.this);
        this.D = activity;
        this.E = zzc;
    }

    public final void a() {
        ((zzdk) Preconditions.m(zzdv.this.f25429i)).onActivityPaused(ObjectWrapper.u1(this.D), this.f25431A);
    }
}
