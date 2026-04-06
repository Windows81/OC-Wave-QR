package com.google.firebase.remoteconfig.internal;

import android.os.Bundle;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.inject.Provider;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public class Personalization {

    /* renamed from: a  reason: collision with root package name */
    public final Provider f31362a;

    /* renamed from: b  reason: collision with root package name */
    public final Map f31363b = Collections.synchronizedMap(new HashMap());

    public Personalization(Provider provider) {
        this.f31362a = provider;
    }

    public void a(String str, ConfigContainer configContainer) {
        JSONObject optJSONObject;
        AnalyticsConnector analyticsConnector = (AnalyticsConnector) this.f31362a.get();
        if (analyticsConnector != null) {
            JSONObject i2 = configContainer.i();
            if (i2.length() >= 1) {
                JSONObject g2 = configContainer.g();
                if (g2.length() >= 1 && (optJSONObject = i2.optJSONObject(str)) != null) {
                    String optString = optJSONObject.optString("choiceId");
                    if (!optString.isEmpty()) {
                        synchronized (this.f31363b) {
                            try {
                                if (!optString.equals(this.f31363b.get(str))) {
                                    this.f31363b.put(str, optString);
                                    Bundle bundle = new Bundle();
                                    bundle.putString("arm_key", str);
                                    bundle.putString("arm_value", g2.optString(str));
                                    bundle.putString("personalization_id", optJSONObject.optString("personalizationId"));
                                    bundle.putInt("arm_index", optJSONObject.optInt("armIndex", -1));
                                    bundle.putString("group", optJSONObject.optString("group"));
                                    analyticsConnector.c("fp", "personalization_assignment", bundle);
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putString("_fpid", optString);
                                    analyticsConnector.c("fp", "_fpc", bundle2);
                                }
                            } catch (Throwable th) {
                                while (true) {
                                    throw th;
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
