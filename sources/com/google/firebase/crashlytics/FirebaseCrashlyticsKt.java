package com.google.firebase.crashlytics;

import com.google.firebase.Firebase;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class FirebaseCrashlyticsKt {
    public static final FirebaseCrashlytics a(Firebase firebase2) {
        Intrinsics.i(firebase2, "<this>");
        FirebaseCrashlytics a2 = FirebaseCrashlytics.a();
        Intrinsics.h(a2, "getInstance()");
        return a2;
    }
}
