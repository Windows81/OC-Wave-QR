package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import com.google.android.gms.measurement.api.AppMeasurementSdk;

final class zzf implements AppMeasurementSdk.OnEventListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ zzc f29726a;

    public zzf(zzc zzc) {
        this.f29726a = zzc;
    }

    public final void a(String str, String str2, Bundle bundle, long j2) {
        if (this.f29726a.f29713a.contains(str2)) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("events", zzd.c(str2));
            this.f29726a.f29714b.a(2, bundle2);
        }
    }
}
