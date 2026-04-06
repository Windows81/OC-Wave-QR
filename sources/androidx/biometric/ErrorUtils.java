package androidx.biometric;

import android.content.Context;
import android.util.Log;

class ErrorUtils {
    public static String a(Context context, int i2) {
        if (context == null) {
            return "";
        }
        if (i2 == 1) {
            return context.getString(R.string.f1514d);
        }
        if (i2 != 7) {
            switch (i2) {
                case 9:
                    break;
                case 10:
                    return context.getString(R.string.f1518h);
                case 11:
                    return context.getString(R.string.f1517g);
                case 12:
                    return context.getString(R.string.f1515e);
                default:
                    Log.e("BiometricUtils", "Unknown error code: " + i2);
                    return context.getString(R.string.f1512b);
            }
        }
        return context.getString(R.string.f1516f);
    }

    public static boolean b(int i2) {
        switch (i2) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return true;
            default:
                return false;
        }
    }

    public static boolean c(int i2) {
        return i2 == 7 || i2 == 9;
    }
}
