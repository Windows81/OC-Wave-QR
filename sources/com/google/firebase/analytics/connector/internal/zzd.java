package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zziz;
import com.google.android.gms.measurement.internal.zzjf;
import com.google.android.gms.measurement.internal.zzjh;
import com.google.android.gms.measurement.internal.zzle;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.firebase.analytics.connector.AnalyticsConnector;

public final class zzd {

    /* renamed from: a  reason: collision with root package name */
    public static final ImmutableSet f29717a = ImmutableSet.H("_in", "_xa", "_xu", "_aq", "_aa", "_ai", "_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire");

    /* renamed from: b  reason: collision with root package name */
    public static final ImmutableList f29718b = ImmutableList.J("_e", "_f", "_iap", "_s", "_au", "_ui", "_cd");

    /* renamed from: c  reason: collision with root package name */
    public static final ImmutableList f29719c = ImmutableList.H("auto", "app", "am");

    /* renamed from: d  reason: collision with root package name */
    public static final ImmutableList f29720d = ImmutableList.F("_r", "_dbg");

    /* renamed from: e  reason: collision with root package name */
    public static final ImmutableList f29721e = new ImmutableList.Builder().j(zzjh.f26610a).j(zzjh.f26611b).l();

    /* renamed from: f  reason: collision with root package name */
    public static final ImmutableList f29722f = ImmutableList.F("^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$");

    public static Bundle a(AnalyticsConnector.ConditionalUserProperty conditionalUserProperty) {
        Bundle bundle = new Bundle();
        String str = conditionalUserProperty.f29693a;
        if (str != null) {
            bundle.putString("origin", str);
        }
        String str2 = conditionalUserProperty.f29694b;
        if (str2 != null) {
            bundle.putString("name", str2);
        }
        Object obj = conditionalUserProperty.f29695c;
        if (obj != null) {
            zziz.b(bundle, obj);
        }
        String str3 = conditionalUserProperty.f29696d;
        if (str3 != null) {
            bundle.putString("trigger_event_name", str3);
        }
        bundle.putLong("trigger_timeout", conditionalUserProperty.f29697e);
        String str4 = conditionalUserProperty.f29698f;
        if (str4 != null) {
            bundle.putString("timed_out_event_name", str4);
        }
        Bundle bundle2 = conditionalUserProperty.f29699g;
        if (bundle2 != null) {
            bundle.putBundle("timed_out_event_params", bundle2);
        }
        String str5 = conditionalUserProperty.f29700h;
        if (str5 != null) {
            bundle.putString("triggered_event_name", str5);
        }
        Bundle bundle3 = conditionalUserProperty.f29701i;
        if (bundle3 != null) {
            bundle.putBundle("triggered_event_params", bundle3);
        }
        bundle.putLong("time_to_live", conditionalUserProperty.f29702j);
        String str6 = conditionalUserProperty.f29703k;
        if (str6 != null) {
            bundle.putString("expired_event_name", str6);
        }
        Bundle bundle4 = conditionalUserProperty.f29704l;
        if (bundle4 != null) {
            bundle.putBundle("expired_event_params", bundle4);
        }
        bundle.putLong("creation_timestamp", conditionalUserProperty.f29705m);
        bundle.putBoolean("active", conditionalUserProperty.f29706n);
        bundle.putLong("triggered_timestamp", conditionalUserProperty.f29707o);
        return bundle;
    }

    public static AnalyticsConnector.ConditionalUserProperty b(Bundle bundle) {
        Preconditions.m(bundle);
        AnalyticsConnector.ConditionalUserProperty conditionalUserProperty = new AnalyticsConnector.ConditionalUserProperty();
        Class<String> cls = String.class;
        conditionalUserProperty.f29693a = (String) Preconditions.m((String) zziz.a(bundle, "origin", cls, (Object) null));
        conditionalUserProperty.f29694b = (String) Preconditions.m((String) zziz.a(bundle, "name", cls, (Object) null));
        conditionalUserProperty.f29695c = zziz.a(bundle, "value", Object.class, (Object) null);
        conditionalUserProperty.f29696d = (String) zziz.a(bundle, "trigger_event_name", cls, (Object) null);
        Class<Long> cls2 = Long.class;
        conditionalUserProperty.f29697e = ((Long) zziz.a(bundle, "trigger_timeout", cls2, 0L)).longValue();
        conditionalUserProperty.f29698f = (String) zziz.a(bundle, "timed_out_event_name", cls, (Object) null);
        Class<Bundle> cls3 = Bundle.class;
        conditionalUserProperty.f29699g = (Bundle) zziz.a(bundle, "timed_out_event_params", cls3, (Object) null);
        conditionalUserProperty.f29700h = (String) zziz.a(bundle, "triggered_event_name", cls, (Object) null);
        conditionalUserProperty.f29701i = (Bundle) zziz.a(bundle, "triggered_event_params", cls3, (Object) null);
        conditionalUserProperty.f29702j = ((Long) zziz.a(bundle, "time_to_live", cls2, 0L)).longValue();
        conditionalUserProperty.f29703k = (String) zziz.a(bundle, "expired_event_name", cls, (Object) null);
        conditionalUserProperty.f29704l = (Bundle) zziz.a(bundle, "expired_event_params", cls3, (Object) null);
        conditionalUserProperty.f29706n = ((Boolean) zziz.a(bundle, "active", Boolean.class, Boolean.FALSE)).booleanValue();
        conditionalUserProperty.f29705m = ((Long) zziz.a(bundle, "creation_timestamp", cls2, 0L)).longValue();
        conditionalUserProperty.f29707o = ((Long) zziz.a(bundle, "triggered_timestamp", cls2, 0L)).longValue();
        return conditionalUserProperty;
    }

    public static String c(String str) {
        String a2 = zzjf.a(str);
        return a2 != null ? a2 : str;
    }

    public static void d(String str, String str2, Bundle bundle) {
        if ("clx".equals(str) && "_ae".equals(str2)) {
            bundle.putLong("_r", 1);
        }
    }

    public static boolean e(String str, Bundle bundle) {
        if (f29718b.contains(str)) {
            return false;
        }
        if (bundle == null) {
            return true;
        }
        ImmutableList immutableList = f29720d;
        int size = immutableList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = immutableList.get(i2);
            i2++;
            if (bundle.containsKey((String) obj)) {
                return false;
            }
        }
        return true;
    }

    public static boolean f(String str, String str2) {
        if ("_ce1".equals(str2) || "_ce2".equals(str2)) {
            return str.equals("fcm") || str.equals("frc");
        }
        if ("_ln".equals(str2)) {
            return str.equals("fcm") || str.equals("fiam");
        }
        if (f29721e.contains(str2)) {
            return false;
        }
        ImmutableList immutableList = f29722f;
        int size = immutableList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = immutableList.get(i2);
            i2++;
            if (str2.matches((String) obj)) {
                return false;
            }
        }
        return true;
    }

    public static boolean g(AnalyticsConnector.ConditionalUserProperty conditionalUserProperty) {
        String str;
        if (conditionalUserProperty == null || (str = conditionalUserProperty.f29693a) == null || str.isEmpty()) {
            return false;
        }
        Object obj = conditionalUserProperty.f29695c;
        if ((obj != null && zzle.a(obj) == null) || !j(str) || !f(str, conditionalUserProperty.f29694b)) {
            return false;
        }
        String str2 = conditionalUserProperty.f29703k;
        if (str2 != null && (!e(str2, conditionalUserProperty.f29704l) || !h(str, conditionalUserProperty.f29703k, conditionalUserProperty.f29704l))) {
            return false;
        }
        String str3 = conditionalUserProperty.f29700h;
        if (str3 != null && (!e(str3, conditionalUserProperty.f29701i) || !h(str, conditionalUserProperty.f29700h, conditionalUserProperty.f29701i))) {
            return false;
        }
        String str4 = conditionalUserProperty.f29698f;
        if (str4 != null) {
            return e(str4, conditionalUserProperty.f29699g) && h(str, conditionalUserProperty.f29698f, conditionalUserProperty.f29699g);
        }
        return true;
    }

    public static boolean h(String str, String str2, Bundle bundle) {
        if (!"_cmp".equals(str2)) {
            return true;
        }
        if (!j(str) || bundle == null) {
            return false;
        }
        ImmutableList immutableList = f29720d;
        int size = immutableList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = immutableList.get(i2);
            i2++;
            if (bundle.containsKey((String) obj)) {
                return false;
            }
        }
        str.hashCode();
        char c2 = 65535;
        switch (str.hashCode()) {
            case 101200:
                if (str.equals("fcm")) {
                    c2 = 0;
                    break;
                }
                break;
            case 101230:
                if (str.equals("fdl")) {
                    c2 = 1;
                    break;
                }
                break;
            case 3142703:
                if (str.equals("fiam")) {
                    c2 = 2;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                bundle.putString("_cis", "fcm_integration");
                return true;
            case 1:
                bundle.putString("_cis", "fdl_integration");
                return true;
            case 2:
                bundle.putString("_cis", "fiam_integration");
                return true;
            default:
                return false;
        }
    }

    public static boolean i(String str) {
        return !f29717a.contains(str);
    }

    public static boolean j(String str) {
        return !f29719c.contains(str);
    }
}
