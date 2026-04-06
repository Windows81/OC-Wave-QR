package com.google.firebase.crashlytics;

import android.os.Bundle;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.analytics.AnalyticsEventReceiver;
import java.util.Locale;

class CrashlyticsAnalyticsListener implements AnalyticsConnector.AnalyticsConnectorListener {

    /* renamed from: a  reason: collision with root package name */
    public AnalyticsEventReceiver f29897a;

    /* renamed from: b  reason: collision with root package name */
    public AnalyticsEventReceiver f29898b;

    public static void b(AnalyticsEventReceiver analyticsEventReceiver, String str, Bundle bundle) {
        if (analyticsEventReceiver != null) {
            analyticsEventReceiver.b(str, bundle);
        }
    }

    public void a(int i2, Bundle bundle) {
        String string;
        Logger.f().i(String.format(Locale.US, "Analytics listener received message. ID: %d, Extras: %s", new Object[]{Integer.valueOf(i2), bundle}));
        if (bundle != null && (string = bundle.getString("name")) != null) {
            Bundle bundle2 = bundle.getBundle("params");
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            c(string, bundle2);
        }
    }

    public final void c(String str, Bundle bundle) {
        b("clx".equals(bundle.getString("_o")) ? this.f29897a : this.f29898b, str, bundle);
    }

    public void d(AnalyticsEventReceiver analyticsEventReceiver) {
        this.f29898b = analyticsEventReceiver;
    }

    public void e(AnalyticsEventReceiver analyticsEventReceiver) {
        this.f29897a = analyticsEventReceiver;
    }
}
