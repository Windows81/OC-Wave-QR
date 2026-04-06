package com.google.firebase.analytics.connector.internal;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.connector.AnalyticsConnector;

public final class zze implements zza {

    /* renamed from: a  reason: collision with root package name */
    public AnalyticsConnector.AnalyticsConnectorListener f29723a;

    /* renamed from: b  reason: collision with root package name */
    public AppMeasurementSdk f29724b;

    /* renamed from: c  reason: collision with root package name */
    public zzg f29725c;

    public zze(AppMeasurementSdk appMeasurementSdk, AnalyticsConnector.AnalyticsConnectorListener analyticsConnectorListener) {
        this.f29723a = analyticsConnectorListener;
        this.f29724b = appMeasurementSdk;
        zzg zzg = new zzg(this);
        this.f29725c = zzg;
        this.f29724b.f(zzg);
    }
}
