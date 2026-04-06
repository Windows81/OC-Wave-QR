package com.google.firebase.platforminfo;

import kotlin.KotlinVersion;

public final class KotlinDetector {
    public static String a() {
        try {
            return KotlinVersion.E.toString();
        } catch (NoClassDefFoundError unused) {
            return null;
        }
    }
}
