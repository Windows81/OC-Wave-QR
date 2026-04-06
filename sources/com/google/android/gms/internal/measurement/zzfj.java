package com.google.android.gms.internal.measurement;

import android.app.Activity;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.measurement.zzdv;

final class zzfj extends zzdv.zzb {
    public final /* synthetic */ Activity D;
    public final /* synthetic */ zzdi E;
    public final /* synthetic */ zzdv.zzc F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzfj(zzdv.zzc zzc, Activity activity, zzdi zzdi) {
        super(zzdv.this);
        this.D = activity;
        this.E = zzdi;
        this.F = zzc;
    }

    public final void a() {
        ((zzdk) Preconditions.m(zzdv.this.f25429i)).onActivitySaveInstanceState(ObjectWrapper.u1(this.D), this.E, this.f25431A);
    }
}
