package com.google.firebase.analytics.connector.internal;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import java.util.HashSet;
import java.util.Set;

public final class zzc implements zza {

    /* renamed from: a  reason: collision with root package name */
    public Set f29713a = new HashSet();

    /* renamed from: b  reason: collision with root package name */
    public AnalyticsConnector.AnalyticsConnectorListener f29714b;

    /* renamed from: c  reason: collision with root package name */
    public AppMeasurementSdk f29715c;

    /* renamed from: d  reason: collision with root package name */
    public zzf f29716d;

    public zzc(AppMeasurementSdk appMeasurementSdk, AnalyticsConnector.AnalyticsConnectorListener analyticsConnectorListener) {
        this.f29714b = analyticsConnectorListener;
        this.f29715c = appMeasurementSdk;
        zzf zzf = new zzf(this);
        this.f29716d = zzf;
        this.f29715c.f(zzf);
    }
}
