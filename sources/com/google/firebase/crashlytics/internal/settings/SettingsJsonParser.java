package com.google.firebase.crashlytics.internal.settings;

import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.CurrentTimeProvider;
import org.json.JSONObject;

public class SettingsJsonParser {

    /* renamed from: a  reason: collision with root package name */
    public final CurrentTimeProvider f30679a;

    public SettingsJsonParser(CurrentTimeProvider currentTimeProvider) {
        this.f30679a = currentTimeProvider;
    }

    public static SettingsJsonTransform a(int i2) {
        if (i2 == 3) {
            return new SettingsV3JsonTransform();
        }
        Logger f2 = Logger.f();
        f2.d("Could not determine SettingsJsonTransform for settings version " + i2 + ". Using default settings values.");
        return new DefaultSettingsJsonTransform();
    }

    public Settings b(JSONObject jSONObject) {
        return a(jSONObject.getInt("settings_version")).a(this.f30679a, jSONObject);
    }
}
