package com.google.firebase.crashlytics.internal.analytics;

import android.os.Bundle;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbHandler;
import com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbSource;
import org.json.JSONException;
import org.json.JSONObject;

public class BreadcrumbAnalyticsEventReceiver implements AnalyticsEventReceiver, BreadcrumbSource {

    /* renamed from: a  reason: collision with root package name */
    public BreadcrumbHandler f29931a;

    public static String c(String str, Bundle bundle) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (String next : bundle.keySet()) {
            jSONObject2.put(next, bundle.get(next));
        }
        jSONObject.put("name", str);
        jSONObject.put("parameters", jSONObject2);
        return jSONObject.toString();
    }

    public void a(BreadcrumbHandler breadcrumbHandler) {
        this.f29931a = breadcrumbHandler;
        Logger.f().b("Registered Firebase Analytics event receiver for breadcrumbs");
    }

    public void b(String str, Bundle bundle) {
        BreadcrumbHandler breadcrumbHandler = this.f29931a;
        if (breadcrumbHandler != null) {
            try {
                breadcrumbHandler.a("$A$:" + c(str, bundle));
            } catch (JSONException unused) {
                Logger.f().k("Unable to serialize Firebase Analytics event to breadcrumb.");
            }
        }
    }
}
