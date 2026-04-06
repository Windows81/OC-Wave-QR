package com.google.firebase.analytics.connector;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzdv;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.DataCollectionDefaultChange;
import com.google.firebase.FirebaseApp;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.analytics.connector.internal.zzc;
import com.google.firebase.analytics.connector.internal.zzd;
import com.google.firebase.analytics.connector.internal.zze;
import com.google.firebase.events.Event;
import com.google.firebase.events.Subscriber;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class AnalyticsConnectorImpl implements AnalyticsConnector {

    /* renamed from: c  reason: collision with root package name */
    public static volatile AnalyticsConnector f29708c;

    /* renamed from: a  reason: collision with root package name */
    public final AppMeasurementSdk f29709a;

    /* renamed from: b  reason: collision with root package name */
    public final Map f29710b = new ConcurrentHashMap();

    public AnalyticsConnectorImpl(AppMeasurementSdk appMeasurementSdk) {
        Preconditions.m(appMeasurementSdk);
        this.f29709a = appMeasurementSdk;
    }

    public static AnalyticsConnector g(FirebaseApp firebaseApp, Context context, Subscriber subscriber) {
        Preconditions.m(firebaseApp);
        Preconditions.m(context);
        Preconditions.m(subscriber);
        Preconditions.m(context.getApplicationContext());
        if (f29708c == null) {
            synchronized (AnalyticsConnectorImpl.class) {
                try {
                    if (f29708c == null) {
                        Bundle bundle = new Bundle(1);
                        if (firebaseApp.u()) {
                            subscriber.a(DataCollectionDefaultChange.class, new zzb(), new zza());
                            bundle.putBoolean("dataCollectionDefaultEnabled", firebaseApp.t());
                        }
                        f29708c = new AnalyticsConnectorImpl(zzdv.f(context, (String) null, (String) null, (String) null, bundle).w());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f29708c;
    }

    public static /* synthetic */ void h(Event event) {
        boolean z2 = ((DataCollectionDefaultChange) event.a()).f29631a;
        synchronized (AnalyticsConnectorImpl.class) {
            ((AnalyticsConnectorImpl) Preconditions.m(f29708c)).f29709a.h(z2);
        }
    }

    public Map a(boolean z2) {
        return this.f29709a.d((String) null, (String) null, z2);
    }

    public void b(AnalyticsConnector.ConditionalUserProperty conditionalUserProperty) {
        if (zzd.g(conditionalUserProperty)) {
            this.f29709a.g(zzd.a(conditionalUserProperty));
        }
    }

    public void c(String str, String str2, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (zzd.j(str) && zzd.e(str2, bundle) && zzd.h(str, str2, bundle)) {
            zzd.d(str, str2, bundle);
            this.f29709a.e(str, str2, bundle);
        }
    }

    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        if (str2 == null || zzd.e(str2, bundle)) {
            this.f29709a.a(str, str2, bundle);
        }
    }

    public int d(String str) {
        return this.f29709a.c(str);
    }

    public List e(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        for (Bundle b2 : this.f29709a.b(str, str2)) {
            arrayList.add(zzd.b(b2));
        }
        return arrayList;
    }

    public AnalyticsConnector.AnalyticsConnectorHandle f(final String str, AnalyticsConnector.AnalyticsConnectorListener analyticsConnectorListener) {
        Preconditions.m(analyticsConnectorListener);
        if (!zzd.j(str) || i(str)) {
            return null;
        }
        AppMeasurementSdk appMeasurementSdk = this.f29709a;
        Object zzc = "fiam".equals(str) ? new zzc(appMeasurementSdk, analyticsConnectorListener) : "clx".equals(str) ? new zze(appMeasurementSdk, analyticsConnectorListener) : null;
        if (zzc == null) {
            return null;
        }
        this.f29710b.put(str, zzc);
        return new AnalyticsConnector.AnalyticsConnectorHandle(this) {

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ AnalyticsConnectorImpl f29712b;

            {
                this.f29712b = r1;
            }
        };
    }

    public final boolean i(String str) {
        return !str.isEmpty() && this.f29710b.containsKey(str) && this.f29710b.get(str) != null;
    }
}
