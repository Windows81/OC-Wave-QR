package com.google.protobuf;

final class Android {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f31937a;

    /* renamed from: b  reason: collision with root package name */
    public static final Class f31938b = a("libcore.io.Memory");

    /* renamed from: c  reason: collision with root package name */
    public static final boolean f31939c = (!f31937a && a("org.robolectric.Robolectric") != null);

    public static Class a(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Class b() {
        return f31938b;
    }

    public static boolean c() {
        return f31937a || (f31938b != null && !f31939c);
    }
}
