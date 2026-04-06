package com.google.android.gms.measurement;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzdt;
import com.google.android.gms.measurement.internal.zzhw;
import com.google.android.gms.measurement.internal.zziz;
import com.google.android.gms.measurement.internal.zzjg;
import com.google.android.gms.measurement.internal.zzjj;
import com.google.android.gms.measurement.internal.zzky;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Deprecated
public class AppMeasurement {

    /* renamed from: b  reason: collision with root package name */
    public static volatile AppMeasurement f26149b;

    /* renamed from: a  reason: collision with root package name */
    public final zza f26150a;

    public static class ConditionalUserProperty {
        public boolean mActive;
        public String mAppId;
        public long mCreationTimestamp;
        public String mExpiredEventName;
        public Bundle mExpiredEventParams;
        public String mName;
        public String mOrigin;
        public long mTimeToLive;
        public String mTimedOutEventName;
        public Bundle mTimedOutEventParams;
        public String mTriggerEventName;
        public long mTriggerTimeout;
        public String mTriggeredEventName;
        public Bundle mTriggeredEventParams;
        public long mTriggeredTimestamp;
        public Object mValue;

        public ConditionalUserProperty(Bundle bundle) {
            Preconditions.m(bundle);
            Class<String> cls = String.class;
            this.mAppId = (String) zziz.a(bundle, "app_id", cls, (Object) null);
            this.mOrigin = (String) zziz.a(bundle, "origin", cls, (Object) null);
            this.mName = (String) zziz.a(bundle, "name", cls, (Object) null);
            this.mValue = zziz.a(bundle, "value", Object.class, (Object) null);
            this.mTriggerEventName = (String) zziz.a(bundle, "trigger_event_name", cls, (Object) null);
            Class<Long> cls2 = Long.class;
            this.mTriggerTimeout = ((Long) zziz.a(bundle, "trigger_timeout", cls2, 0L)).longValue();
            this.mTimedOutEventName = (String) zziz.a(bundle, "timed_out_event_name", cls, (Object) null);
            Class<Bundle> cls3 = Bundle.class;
            this.mTimedOutEventParams = (Bundle) zziz.a(bundle, "timed_out_event_params", cls3, (Object) null);
            this.mTriggeredEventName = (String) zziz.a(bundle, "triggered_event_name", cls, (Object) null);
            this.mTriggeredEventParams = (Bundle) zziz.a(bundle, "triggered_event_params", cls3, (Object) null);
            this.mTimeToLive = ((Long) zziz.a(bundle, "time_to_live", cls2, 0L)).longValue();
            this.mExpiredEventName = (String) zziz.a(bundle, "expired_event_name", cls, (Object) null);
            this.mExpiredEventParams = (Bundle) zziz.a(bundle, "expired_event_params", cls3, (Object) null);
            this.mActive = ((Boolean) zziz.a(bundle, "active", Boolean.class, Boolean.FALSE)).booleanValue();
            this.mCreationTimestamp = ((Long) zziz.a(bundle, "creation_timestamp", cls2, 0L)).longValue();
            this.mTriggeredTimestamp = ((Long) zziz.a(bundle, "triggered_timestamp", cls2, 0L)).longValue();
        }
    }

    public interface EventInterceptor extends zzjg {
    }

    public interface OnEventListener extends zzjj {
    }

    public static abstract class zza implements zzky {
        public zza() {
        }
    }

    public AppMeasurement(zzhw zzhw) {
        this.f26150a = new zza(zzhw);
    }

    public static AppMeasurement a(Context context, String str, String str2) {
        if (f26149b == null) {
            synchronized (AppMeasurement.class) {
                try {
                    if (f26149b == null) {
                        zzky b2 = b(context, (Bundle) null);
                        if (b2 != null) {
                            f26149b = new AppMeasurement(b2);
                        } else {
                            f26149b = new AppMeasurement(zzhw.c(context, new zzdt(0, 0, true, (String) null, (String) null, (String) null, (Bundle) null, (String) null), (Long) null));
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f26149b;
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.measurement.internal.zzky b(android.content.Context r4, android.os.Bundle r5) {
        /*
            r5 = 0
            java.lang.Class<com.google.firebase.analytics.FirebaseAnalytics> r0 = com.google.firebase.analytics.FirebaseAnalytics.class
            java.lang.String r1 = "getScionFrontendApiImplementation"
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            java.lang.Class<android.os.Bundle> r3 = android.os.Bundle.class
            java.lang.Class[] r2 = new java.lang.Class[]{r2, r3}     // Catch:{  }
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r2)     // Catch:{  }
            java.lang.Object[] r4 = new java.lang.Object[]{r4, r5}     // Catch:{  }
            java.lang.Object r4 = r0.invoke(r5, r4)     // Catch:{  }
            com.google.android.gms.measurement.internal.zzky r4 = (com.google.android.gms.measurement.internal.zzky) r4     // Catch:{  }
            return r4
        L_0x001c:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.AppMeasurement.b(android.content.Context, android.os.Bundle):com.google.android.gms.measurement.internal.zzky");
    }

    @Deprecated
    public static AppMeasurement getInstance(Context context) {
        return a(context, (String) null, (String) null);
    }

    public void beginAdUnitExposure(String str) {
        this.f26150a.e(str);
    }

    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        this.f26150a.b(str, str2, bundle);
    }

    public void endAdUnitExposure(String str) {
        this.f26150a.n(str);
    }

    public long generateEventId() {
        return this.f26150a.a();
    }

    public String getAppInstanceId() {
        return this.f26150a.h();
    }

    public List<ConditionalUserProperty> getConditionalUserProperties(String str, String str2) {
        List<Bundle> c2 = this.f26150a.c(str, str2);
        ArrayList arrayList = new ArrayList(c2 == null ? 0 : c2.size());
        for (Bundle conditionalUserProperty : c2) {
            arrayList.add(new ConditionalUserProperty(conditionalUserProperty));
        }
        return arrayList;
    }

    public String getCurrentScreenClass() {
        return this.f26150a.k();
    }

    public String getCurrentScreenName() {
        return this.f26150a.i();
    }

    public String getGmpAppId() {
        return this.f26150a.d();
    }

    public int getMaxUserProperties(String str) {
        return this.f26150a.m(str);
    }

    public Map<String, Object> getUserProperties(String str, String str2, boolean z2) {
        return this.f26150a.f(str, str2, z2);
    }

    public void logEventInternal(String str, String str2, Bundle bundle) {
        this.f26150a.g(str, str2, bundle);
    }

    public void setConditionalUserProperty(ConditionalUserProperty conditionalUserProperty) {
        Preconditions.m(conditionalUserProperty);
        zza zza2 = this.f26150a;
        Bundle bundle = new Bundle();
        String str = conditionalUserProperty.mAppId;
        if (str != null) {
            bundle.putString("app_id", str);
        }
        String str2 = conditionalUserProperty.mOrigin;
        if (str2 != null) {
            bundle.putString("origin", str2);
        }
        String str3 = conditionalUserProperty.mName;
        if (str3 != null) {
            bundle.putString("name", str3);
        }
        Object obj = conditionalUserProperty.mValue;
        if (obj != null) {
            zziz.b(bundle, obj);
        }
        String str4 = conditionalUserProperty.mTriggerEventName;
        if (str4 != null) {
            bundle.putString("trigger_event_name", str4);
        }
        bundle.putLong("trigger_timeout", conditionalUserProperty.mTriggerTimeout);
        String str5 = conditionalUserProperty.mTimedOutEventName;
        if (str5 != null) {
            bundle.putString("timed_out_event_name", str5);
        }
        Bundle bundle2 = conditionalUserProperty.mTimedOutEventParams;
        if (bundle2 != null) {
            bundle.putBundle("timed_out_event_params", bundle2);
        }
        String str6 = conditionalUserProperty.mTriggeredEventName;
        if (str6 != null) {
            bundle.putString("triggered_event_name", str6);
        }
        Bundle bundle3 = conditionalUserProperty.mTriggeredEventParams;
        if (bundle3 != null) {
            bundle.putBundle("triggered_event_params", bundle3);
        }
        bundle.putLong("time_to_live", conditionalUserProperty.mTimeToLive);
        String str7 = conditionalUserProperty.mExpiredEventName;
        if (str7 != null) {
            bundle.putString("expired_event_name", str7);
        }
        Bundle bundle4 = conditionalUserProperty.mExpiredEventParams;
        if (bundle4 != null) {
            bundle.putBundle("expired_event_params", bundle4);
        }
        bundle.putLong("creation_timestamp", conditionalUserProperty.mCreationTimestamp);
        bundle.putBoolean("active", conditionalUserProperty.mActive);
        bundle.putLong("triggered_timestamp", conditionalUserProperty.mTriggeredTimestamp);
        zza2.u(bundle);
    }

    public AppMeasurement(zzky zzky) {
        this.f26150a = new zzc(zzky);
    }
}
