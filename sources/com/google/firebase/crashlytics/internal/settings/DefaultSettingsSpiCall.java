package com.google.firebase.crashlytics.internal.settings;

import android.text.TextUtils;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.CrashlyticsCore;
import com.google.firebase.crashlytics.internal.network.HttpGetRequest;
import com.google.firebase.crashlytics.internal.network.HttpRequestFactory;
import com.google.firebase.crashlytics.internal.network.HttpResponse;
import com.lokalise.sdk.api.Params;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

class DefaultSettingsSpiCall implements SettingsSpiCall {

    /* renamed from: a  reason: collision with root package name */
    public final String f30650a;

    /* renamed from: b  reason: collision with root package name */
    public final HttpRequestFactory f30651b;

    /* renamed from: c  reason: collision with root package name */
    public final Logger f30652c;

    public DefaultSettingsSpiCall(String str, HttpRequestFactory httpRequestFactory) {
        this(str, httpRequestFactory, Logger.f());
    }

    public JSONObject a(SettingsRequest settingsRequest, boolean z2) {
        if (z2) {
            try {
                Map f2 = f(settingsRequest);
                HttpGetRequest b2 = b(d(f2), settingsRequest);
                Logger logger = this.f30652c;
                logger.b("Requesting settings from " + this.f30650a);
                Logger logger2 = this.f30652c;
                logger2.i("Settings query params were: " + f2);
                return g(b2.c());
            } catch (IOException e2) {
                this.f30652c.e("Settings request failed.", e2);
                return null;
            }
        } else {
            throw new RuntimeException("An invalid data collection token was used.");
        }
    }

    public final HttpGetRequest b(HttpGetRequest httpGetRequest, SettingsRequest settingsRequest) {
        c(httpGetRequest, "X-CRASHLYTICS-GOOGLE-APP-ID", settingsRequest.f30680a);
        c(httpGetRequest, "X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        c(httpGetRequest, "X-CRASHLYTICS-API-CLIENT-VERSION", CrashlyticsCore.i());
        c(httpGetRequest, "Accept", "application/json");
        c(httpGetRequest, "X-CRASHLYTICS-DEVICE-MODEL", settingsRequest.f30681b);
        c(httpGetRequest, "X-CRASHLYTICS-OS-BUILD-VERSION", settingsRequest.f30682c);
        c(httpGetRequest, "X-CRASHLYTICS-OS-DISPLAY-VERSION", settingsRequest.f30683d);
        c(httpGetRequest, "X-CRASHLYTICS-INSTALLATION-ID", settingsRequest.f30684e.a().c());
        return httpGetRequest;
    }

    public final void c(HttpGetRequest httpGetRequest, String str, String str2) {
        if (str2 != null) {
            httpGetRequest.d(str, str2);
        }
    }

    public HttpGetRequest d(Map map) {
        HttpGetRequest a2 = this.f30651b.a(this.f30650a, map);
        return a2.d(Params.Headers.USER_AGENT, "Crashlytics Android SDK/" + CrashlyticsCore.i()).d("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
    }

    public final JSONObject e(String str) {
        try {
            return new JSONObject(str);
        } catch (Exception e2) {
            Logger logger = this.f30652c;
            logger.l("Failed to parse settings JSON from " + this.f30650a, e2);
            Logger logger2 = this.f30652c;
            logger2.k("Settings response " + str);
            return null;
        }
    }

    public final Map f(SettingsRequest settingsRequest) {
        HashMap hashMap = new HashMap();
        hashMap.put("build_version", settingsRequest.f30687h);
        hashMap.put("display_version", settingsRequest.f30686g);
        hashMap.put("source", Integer.toString(settingsRequest.f30688i));
        String str = settingsRequest.f30685f;
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("instance", str);
        }
        return hashMap;
    }

    public JSONObject g(HttpResponse httpResponse) {
        int b2 = httpResponse.b();
        Logger logger = this.f30652c;
        logger.i("Settings response code was: " + b2);
        if (h(b2)) {
            return e(httpResponse.a());
        }
        Logger logger2 = this.f30652c;
        logger2.d("Settings request failed; (status: " + b2 + ") from " + this.f30650a);
        return null;
    }

    public boolean h(int i2) {
        return i2 == 200 || i2 == 201 || i2 == 202 || i2 == 203;
    }

    public DefaultSettingsSpiCall(String str, HttpRequestFactory httpRequestFactory, Logger logger) {
        if (str != null) {
            this.f30652c = logger;
            this.f30651b = httpRequestFactory;
            this.f30650a = str;
            return;
        }
        throw new IllegalArgumentException("url must not be null.");
    }
}
