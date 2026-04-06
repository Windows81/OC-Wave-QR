package androidx.biometric;

import android.app.KeyguardManager;
import android.content.Context;

class KeyguardUtils {

    public static class Api23Impl {
        public static KeyguardManager a(Context context) {
            return (KeyguardManager) context.getSystemService(KeyguardManager.class);
        }

        public static boolean b(KeyguardManager keyguardManager) {
            return keyguardManager.isDeviceSecure();
        }
    }

    public static KeyguardManager a(Context context) {
        return Api23Impl.a(context);
    }

    public static boolean b(Context context) {
        KeyguardManager a2 = a(context);
        if (a2 == null) {
            return false;
        }
        return Api23Impl.b(a2);
    }
}
