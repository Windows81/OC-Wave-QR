package com.google.firebase.crashlytics.internal.analytics;

import android.os.Bundle;
import com.google.firebase.analytics.connector.AnalyticsConnector;

public class CrashlyticsOriginAnalyticsEventLogger implements AnalyticsEventLogger {

    /* renamed from: a  reason: collision with root package name */
    public final AnalyticsConnector f29932a;

    public CrashlyticsOriginAnalyticsEventLogger(AnalyticsConnector analyticsConnector) {
        this.f29932a = analyticsConnector;
    }

    public void a(String str, Bundle bundle) {
        this.f29932a.c("clx", str, bundle);
    }
}
