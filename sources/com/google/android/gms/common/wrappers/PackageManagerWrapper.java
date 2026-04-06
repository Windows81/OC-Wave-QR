package com.google.android.gms.common.wrappers;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Binder;
import android.os.Process;
import com.google.android.gms.common.util.PlatformVersion;

public class PackageManagerWrapper {

    /* renamed from: a  reason: collision with root package name */
    public final Context f25147a;

    public PackageManagerWrapper(Context context) {
        this.f25147a = context;
    }

    public int a(String str) {
        return this.f25147a.checkCallingOrSelfPermission(str);
    }

    public ApplicationInfo b(String str, int i2) {
        return this.f25147a.getPackageManager().getApplicationInfo(str, i2);
    }

    public CharSequence c(String str) {
        Context context = this.f25147a;
        return context.getPackageManager().getApplicationLabel(context.getPackageManager().getApplicationInfo(str, 0));
    }

    public PackageInfo d(String str, int i2) {
        return this.f25147a.getPackageManager().getPackageInfo(str, i2);
    }

    public boolean e() {
        String nameForUid;
        if (Binder.getCallingUid() == Process.myUid()) {
            return InstantApps.a(this.f25147a);
        }
        if (!PlatformVersion.h() || (nameForUid = this.f25147a.getPackageManager().getNameForUid(Binder.getCallingUid())) == null) {
            return false;
        }
        return this.f25147a.getPackageManager().isInstantApp(nameForUid);
    }

    public final boolean f(int i2, String str) {
        if (PlatformVersion.d()) {
            try {
                AppOpsManager appOpsManager = (AppOpsManager) this.f25147a.getSystemService("appops");
                if (appOpsManager != null) {
                    appOpsManager.checkPackage(i2, str);
                    return true;
                }
                throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
            } catch (SecurityException unused) {
                return false;
            }
        } else {
            String[] packagesForUid = this.f25147a.getPackageManager().getPackagesForUid(i2);
            if (!(str == null || packagesForUid == null)) {
                for (String equals : packagesForUid) {
                    if (str.equals(equals)) {
                        return true;
                    }
                }
            }
            return false;
        }
    }
}
