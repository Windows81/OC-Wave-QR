package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.measurement.zzdv;

final class zzfg extends zzdv.zzb {
    public final /* synthetic */ Bundle D;
    public final /* synthetic */ Activity E;
    public final /* synthetic */ zzdv.zzc F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzfg(zzdv.zzc zzc, Bundle bundle, Activity activity) {
        super(zzdv.this);
        this.D = bundle;
        this.E = activity;
        this.F = zzc;
    }

    public final void a() {
        Bundle bundle;
        if (this.D != null) {
            bundle = new Bundle();
            if (this.D.containsKey("com.google.app_measurement.screen_service")) {
                Object obj = this.D.get("com.google.app_measurement.screen_service");
                if (obj instanceof Bundle) {
                    bundle.putBundle("com.google.app_measurement.screen_service", (Bundle) obj);
                }
            }
        } else {
            bundle = null;
        }
        ((zzdk) Preconditions.m(zzdv.this.f25429i)).onActivityCreated(ObjectWrapper.u1(this.E), bundle, this.f25431A);
    }
}
