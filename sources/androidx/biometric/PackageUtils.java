package androidx.biometric;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;

class PackageUtils {

    public static class Api23Impl {
        public static boolean a(PackageManager packageManager) {
            return packageManager.hasSystemFeature("android.hardware.fingerprint");
        }
    }

    public static class Api29Impl {
        public static boolean a(PackageManager packageManager) {
            return packageManager.hasSystemFeature("android.hardware.biometrics.face");
        }

        public static boolean b(PackageManager packageManager) {
            return packageManager.hasSystemFeature("android.hardware.biometrics.iris");
        }
    }

    public static boolean a(Context context) {
        return Build.VERSION.SDK_INT >= 29 && context != null && context.getPackageManager() != null && Api29Impl.a(context.getPackageManager());
    }

    public static boolean b(Context context) {
        return (context == null || context.getPackageManager() == null || !Api23Impl.a(context.getPackageManager())) ? false : true;
    }

    public static boolean c(Context context) {
        return Build.VERSION.SDK_INT >= 29 && context != null && context.getPackageManager() != null && Api29Impl.b(context.getPackageManager());
    }
}
