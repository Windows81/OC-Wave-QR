package com.google.firebase.crashlytics.internal;

import com.google.firebase.crashlytics.internal.model.StaticSessionData;

public interface CrashlyticsNativeComponent {
    NativeSessionFileProvider a(String str);

    boolean b();

    void c(String str, String str2, long j2, StaticSessionData staticSessionData);

    boolean d(String str);
}
