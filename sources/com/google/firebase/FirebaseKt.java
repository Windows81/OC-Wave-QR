package com.google.firebase;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class FirebaseKt {
    public static final FirebaseApp a(Firebase firebase2) {
        Intrinsics.i(firebase2, "<this>");
        FirebaseApp l2 = FirebaseApp.l();
        Intrinsics.h(l2, "getInstance()");
        return l2;
    }
}
