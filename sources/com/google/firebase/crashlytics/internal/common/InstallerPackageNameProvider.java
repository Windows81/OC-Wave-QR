package com.google.firebase.crashlytics.internal.common;

import android.content.Context;

class InstallerPackageNameProvider {

    /* renamed from: a  reason: collision with root package name */
    public String f30096a;

    public static String b(Context context) {
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        return installerPackageName == null ? "" : installerPackageName;
    }

    public synchronized String a(Context context) {
        try {
            if (this.f30096a == null) {
                this.f30096a = b(context);
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
        return "".equals(this.f30096a) ? null : this.f30096a;
    }
}
