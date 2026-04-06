package com.google.android.gms.common.util;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.google.android.gms.common.GooglePlayServicesUtilLight;

public final class DeviceProperties {

    /* renamed from: a  reason: collision with root package name */
    public static Boolean f25113a;

    /* renamed from: b  reason: collision with root package name */
    public static Boolean f25114b;

    /* renamed from: c  reason: collision with root package name */
    public static Boolean f25115c;

    /* renamed from: d  reason: collision with root package name */
    public static Boolean f25116d;

    public static boolean a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f25116d == null) {
            boolean z2 = false;
            if (PlatformVersion.h() && packageManager.hasSystemFeature("android.hardware.type.automotive")) {
                z2 = true;
            }
            f25116d = Boolean.valueOf(z2);
        }
        return f25116d.booleanValue();
    }

    public static boolean b() {
        int i2 = GooglePlayServicesUtilLight.f24398a;
        return "user".equals(Build.TYPE);
    }

    public static boolean c(Context context) {
        return g(context.getPackageManager());
    }

    public static boolean d(Context context) {
        if (c(context) && !PlatformVersion.g()) {
            return true;
        }
        if (e(context)) {
            return !PlatformVersion.h() || PlatformVersion.k();
        }
        return false;
    }

    public static boolean e(Context context) {
        if (f25114b == null) {
            boolean z2 = false;
            if (PlatformVersion.f() && context.getPackageManager().hasSystemFeature("cn.google")) {
                z2 = true;
            }
            f25114b = Boolean.valueOf(z2);
        }
        return f25114b.booleanValue();
    }

    public static boolean f(Context context) {
        if (f25115c == null) {
            boolean z2 = true;
            if (!context.getPackageManager().hasSystemFeature("android.hardware.type.iot") && !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                z2 = false;
            }
            f25115c = Boolean.valueOf(z2);
        }
        return f25115c.booleanValue();
    }

    public static boolean g(PackageManager packageManager) {
        if (f25113a == null) {
            boolean z2 = false;
            if (PlatformVersion.e() && packageManager.hasSystemFeature("android.hardware.type.watch")) {
                z2 = true;
            }
            f25113a = Boolean.valueOf(z2);
        }
        return f25113a.booleanValue();
    }
}
