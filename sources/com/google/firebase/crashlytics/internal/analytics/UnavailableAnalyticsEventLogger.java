package com.google.firebase.crashlytics.internal.analytics;

import android.os.Bundle;
import com.google.firebase.crashlytics.internal.Logger;

public class UnavailableAnalyticsEventLogger implements AnalyticsEventLogger {
    public void a(String str, Bundle bundle) {
        Logger.f().b("Skipping logging Crashlytics event to Firebase, no Firebase Analytics");
    }
}
