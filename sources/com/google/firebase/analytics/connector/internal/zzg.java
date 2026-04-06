package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import com.google.android.gms.measurement.api.AppMeasurementSdk;

final class zzg implements AppMeasurementSdk.OnEventListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ zze f29727a;

    public zzg(zze zze) {
        this.f29727a = zze;
    }

    public final void a(String str, String str2, Bundle bundle, long j2) {
        if (str != null && zzd.i(str2)) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("name", str2);
            bundle2.putLong("timestampInMillis", j2);
            bundle2.putBundle("params", bundle);
            this.f29727a.f29723a.a(3, bundle2);
        }
    }
}
