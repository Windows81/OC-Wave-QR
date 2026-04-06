package com.google.firebase.analytics.connector;

import android.os.Bundle;
import java.util.List;
import java.util.Map;

public interface AnalyticsConnector {

    public interface AnalyticsConnectorHandle {
    }

    public interface AnalyticsConnectorListener {
        void a(int i2, Bundle bundle);
    }

    public static class ConditionalUserProperty {

        /* renamed from: a  reason: collision with root package name */
        public String f29693a;

        /* renamed from: b  reason: collision with root package name */
        public String f29694b;

        /* renamed from: c  reason: collision with root package name */
        public Object f29695c;

        /* renamed from: d  reason: collision with root package name */
        public String f29696d;

        /* renamed from: e  reason: collision with root package name */
        public long f29697e;

        /* renamed from: f  reason: collision with root package name */
        public String f29698f;

        /* renamed from: g  reason: collision with root package name */
        public Bundle f29699g;

        /* renamed from: h  reason: collision with root package name */
        public String f29700h;

        /* renamed from: i  reason: collision with root package name */
        public Bundle f29701i;

        /* renamed from: j  reason: collision with root package name */
        public long f29702j;

        /* renamed from: k  reason: collision with root package name */
        public String f29703k;

        /* renamed from: l  reason: collision with root package name */
        public Bundle f29704l;

        /* renamed from: m  reason: collision with root package name */
        public long f29705m;

        /* renamed from: n  reason: collision with root package name */
        public boolean f29706n;

        /* renamed from: o  reason: collision with root package name */
        public long f29707o;
    }

    Map a(boolean z2);

    void b(ConditionalUserProperty conditionalUserProperty);

    void c(String str, String str2, Bundle bundle);

    void clearConditionalUserProperty(String str, String str2, Bundle bundle);

    int d(String str);

    List e(String str, String str2);

    AnalyticsConnectorHandle f(String str, AnalyticsConnectorListener analyticsConnectorListener);
}
