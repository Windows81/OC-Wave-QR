package com.google.firebase.crashlytics.internal.settings;

import com.google.firebase.crashlytics.internal.common.CurrentTimeProvider;
import org.json.JSONObject;

interface SettingsJsonTransform {
    Settings a(CurrentTimeProvider currentTimeProvider, JSONObject jSONObject);
}
