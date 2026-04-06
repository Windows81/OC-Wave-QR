package androidx.biometric;

import android.content.Context;
import android.os.Build;

class DeviceUtils {
    public static boolean a(Context context, String str) {
        if (Build.VERSION.SDK_INT >= 30) {
            return false;
        }
        return b(context, str, R.array.f1498a);
    }

    public static boolean b(Context context, String str, int i2) {
        if (str == null) {
            return false;
        }
        for (String equals : context.getResources().getStringArray(i2)) {
            if (str.equals(equals)) {
                return true;
            }
        }
        return false;
    }

    public static boolean c(Context context, String str, int i2) {
        if (str == null) {
            return false;
        }
        for (String startsWith : context.getResources().getStringArray(i2)) {
            if (str.startsWith(startsWith)) {
                return true;
            }
        }
        return false;
    }

    public static boolean d(Context context, String str, int i2) {
        if (str == null) {
            return false;
        }
        for (String equalsIgnoreCase : context.getResources().getStringArray(i2)) {
            if (str.equalsIgnoreCase(equalsIgnoreCase)) {
                return true;
            }
        }
        return false;
    }

    public static boolean e(Context context, String str) {
        if (Build.VERSION.SDK_INT != 29) {
            return false;
        }
        return b(context, str, R.array.f1501d);
    }

    public static boolean f(Context context, String str) {
        if (Build.VERSION.SDK_INT != 28) {
            return false;
        }
        return c(context, str, R.array.f1502e);
    }

    public static boolean g(Context context, String str, String str2) {
        if (Build.VERSION.SDK_INT != 28) {
            return false;
        }
        return d(context, str, R.array.f1500c) || c(context, str2, R.array.f1499b);
    }

    public static boolean h(Context context, String str) {
        if (Build.VERSION.SDK_INT != 29) {
            return false;
        }
        return !d(context, str, R.array.f1503f);
    }
}
