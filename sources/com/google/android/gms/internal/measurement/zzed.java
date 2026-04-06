package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzdv;

final class zzed extends zzdv.zzb {
    public final /* synthetic */ Boolean D;
    public final /* synthetic */ zzdv E;

    public final void a() {
        if (this.D != null) {
            ((zzdk) Preconditions.m(this.E.f25429i)).setMeasurementEnabled(this.D.booleanValue(), this.f25433z);
        } else {
            ((zzdk) Preconditions.m(this.E.f25429i)).clearMeasurementEnabled(this.f25433z);
        }
    }
}
