package com.google.android.gms.internal.measurement;

import android.app.Activity;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.measurement.zzdv;

final class zzee extends zzdv.zzb {
    public final /* synthetic */ Activity D;
    public final /* synthetic */ String E;
    public final /* synthetic */ String F;
    public final /* synthetic */ zzdv G;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzee(zzdv zzdv, Activity activity, String str, String str2) {
        super(zzdv);
        this.D = activity;
        this.E = str;
        this.F = str2;
        this.G = zzdv;
    }

    public final void a() {
        ((zzdk) Preconditions.m(this.G.f25429i)).setCurrentScreen(ObjectWrapper.u1(this.D), this.E, this.F, this.f25433z);
    }
}
