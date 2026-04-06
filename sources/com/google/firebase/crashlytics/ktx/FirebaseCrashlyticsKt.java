package com.google.firebase.crashlytics.ktx;

import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.google.firebase.ktx.Firebase;
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
