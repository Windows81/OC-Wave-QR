package androidx.biometric;

import android.os.Build;
import androidx.biometric.BiometricPrompt;

class AuthenticatorUtils {
    public static String a(int i2) {
        return i2 != 15 ? i2 != 255 ? i2 != 32768 ? i2 != 32783 ? i2 != 33023 ? String.valueOf(i2) : "BIOMETRIC_WEAK | DEVICE_CREDENTIAL" : "BIOMETRIC_STRONG | DEVICE_CREDENTIAL" : "DEVICE_CREDENTIAL" : "BIOMETRIC_WEAK" : "BIOMETRIC_STRONG";
    }

    public static int b(int i2) {
        return i2 & 32767;
    }

    public static int c(BiometricPrompt.PromptInfo promptInfo, BiometricPrompt.CryptoObject cryptoObject) {
        if (promptInfo.a() != 0) {
            return promptInfo.a();
        }
        int i2 = cryptoObject != null ? 15 : 255;
        return promptInfo.k() ? 32768 | i2 : i2;
    }

    public static boolean d(int i2) {
        return (i2 & 32768) != 0;
    }

    public static boolean e(int i2) {
        return b(i2) != 0;
    }

    public static boolean f(int i2) {
        if (i2 == 15 || i2 == 255) {
            return true;
        }
        if (i2 == 32768) {
            return Build.VERSION.SDK_INT >= 30;
        }
        if (i2 != 32783) {
            return i2 == 33023 || i2 == 0;
        }
        int i3 = Build.VERSION.SDK_INT;
        return i3 < 28 || i3 > 29;
    }

    public static boolean g(int i2) {
        return (i2 & 255) == 255;
    }
}
