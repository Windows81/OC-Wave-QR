package com.google.firebase.crashlytics;

import android.os.Bundle;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.analytics.AnalyticsEventLogger;
import com.google.firebase.crashlytics.internal.analytics.BlockingAnalyticsEventLogger;
import com.google.firebase.crashlytics.internal.analytics.BreadcrumbAnalyticsEventReceiver;
import com.google.firebase.crashlytics.internal.analytics.CrashlyticsOriginAnalyticsEventLogger;
import com.google.firebase.crashlytics.internal.analytics.UnavailableAnalyticsEventLogger;
import com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbHandler;
import com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbSource;
import com.google.firebase.crashlytics.internal.breadcrumbs.DisabledBreadcrumbSource;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class AnalyticsDeferredProxy {

    /* renamed from: a  reason: collision with root package name */
    public final Deferred f29893a;

    /* renamed from: b  reason: collision with root package name */
    public volatile AnalyticsEventLogger f29894b;

    /* renamed from: c  reason: collision with root package name */
    public volatile BreadcrumbSource f29895c;

    /* renamed from: d  reason: collision with root package name */
    public final List f29896d;

    public AnalyticsDeferredProxy(Deferred deferred) {
        this(deferred, new DisabledBreadcrumbSource(), new UnavailableAnalyticsEventLogger());
    }

    public static AnalyticsConnector.AnalyticsConnectorHandle j(AnalyticsConnector analyticsConnector, CrashlyticsAnalyticsListener crashlyticsAnalyticsListener) {
        AnalyticsConnector.AnalyticsConnectorHandle f2 = analyticsConnector.f("clx", crashlyticsAnalyticsListener);
        if (f2 == null) {
            Logger.f().b("Could not register AnalyticsConnectorListener with Crashlytics origin.");
            f2 = analyticsConnector.f("crash", crashlyticsAnalyticsListener);
            if (f2 != null) {
                Logger.f().k("A new version of the Google Analytics for Firebase SDK is now available. For improved performance and compatibility with Crashlytics, please update to the latest version.");
            }
        }
        return f2;
    }

    public AnalyticsEventLogger d() {
        return new b(this);
    }

    public BreadcrumbSource e() {
        return new a(this);
    }

    public final void f() {
        this.f29893a.a(new c(this));
    }

    public final /* synthetic */ void g(String str, Bundle bundle) {
        this.f29894b.a(str, bundle);
    }

    public final /* synthetic */ void h(BreadcrumbHandler breadcrumbHandler) {
        synchronized (this) {
            try {
                if (this.f29895c instanceof DisabledBreadcrumbSource) {
                    this.f29896d.add(breadcrumbHandler);
                }
                this.f29895c.a(breadcrumbHandler);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final /* synthetic */ void i(Provider provider) {
        Logger.f().b("AnalyticsConnector now available.");
        AnalyticsConnector analyticsConnector = (AnalyticsConnector) provider.get();
        CrashlyticsOriginAnalyticsEventLogger crashlyticsOriginAnalyticsEventLogger = new CrashlyticsOriginAnalyticsEventLogger(analyticsConnector);
        CrashlyticsAnalyticsListener crashlyticsAnalyticsListener = new CrashlyticsAnalyticsListener();
        if (j(analyticsConnector, crashlyticsAnalyticsListener) != null) {
            Logger.f().b("Registered Firebase Analytics listener.");
            BreadcrumbAnalyticsEventReceiver breadcrumbAnalyticsEventReceiver = new BreadcrumbAnalyticsEventReceiver();
            BlockingAnalyticsEventLogger blockingAnalyticsEventLogger = new BlockingAnalyticsEventLogger(crashlyticsOriginAnalyticsEventLogger, 500, TimeUnit.MILLISECONDS);
            synchronized (this) {
                try {
                    for (BreadcrumbHandler a2 : this.f29896d) {
                        breadcrumbAnalyticsEventReceiver.a(a2);
                    }
                    crashlyticsAnalyticsListener.d(breadcrumbAnalyticsEventReceiver);
                    crashlyticsAnalyticsListener.e(blockingAnalyticsEventLogger);
                    this.f29895c = breadcrumbAnalyticsEventReceiver;
                    this.f29894b = blockingAnalyticsEventLogger;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return;
        }
        Logger.f().k("Could not register Firebase Analytics listener; a listener is already registered.");
    }

    public AnalyticsDeferredProxy(Deferred deferred, BreadcrumbSource breadcrumbSource, AnalyticsEventLogger analyticsEventLogger) {
        this.f29893a = deferred;
        this.f29895c = breadcrumbSource;
        this.f29896d = new ArrayList();
        this.f29894b = analyticsEventLogger;
        f();
    }
}
