package com.google.firebase.remoteconfig.ktx;

import com.google.firebase.ktx.Firebase;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class RemoteConfigKt {
    public static final FirebaseRemoteConfig a(Firebase firebase2) {
        Intrinsics.i(firebase2, "<this>");
        FirebaseRemoteConfig o2 = FirebaseRemoteConfig.o();
        Intrinsics.h(o2, "getInstance()");
        return o2;
    }

    public static final FirebaseRemoteConfigSettings b(Function1 function1) {
        Intrinsics.i(function1, "init");
        FirebaseRemoteConfigSettings.Builder builder = new FirebaseRemoteConfigSettings.Builder();
        function1.invoke(builder);
        FirebaseRemoteConfigSettings c2 = builder.c();
        Intrinsics.h(c2, "builder.build()");
        return c2;
    }
}
