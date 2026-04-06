package androidx.biometric;

import android.content.Context;
import android.hardware.biometrics.BiometricPrompt;
import android.os.Build;
import android.util.Log;
import androidx.core.hardware.fingerprint.FingerprintManagerCompat;
import java.lang.reflect.Method;

public class BiometricManager {

    /* renamed from: a  reason: collision with root package name */
    public final Injector f1416a;

    /* renamed from: b  reason: collision with root package name */
    public final android.hardware.biometrics.BiometricManager f1417b;

    /* renamed from: c  reason: collision with root package name */
    public final FingerprintManagerCompat f1418c;

    public static class Api29Impl {
        public static int a(android.hardware.biometrics.BiometricManager biometricManager) {
            return biometricManager.canAuthenticate();
        }

        public static android.hardware.biometrics.BiometricManager b(Context context) {
            return (android.hardware.biometrics.BiometricManager) context.getSystemService(android.hardware.biometrics.BiometricManager.class);
        }

        public static Method c() {
            try {
                return android.hardware.biometrics.BiometricManager.class.getMethod("canAuthenticate", new Class[]{BiometricPrompt.CryptoObject.class});
            } catch (NoSuchMethodException unused) {
                return null;
            }
        }
    }

    public static class Api30Impl {
        public static int a(android.hardware.biometrics.BiometricManager biometricManager, int i2) {
            return biometricManager.canAuthenticate(i2);
        }
    }

    public static class Api31Impl {
    }

    public interface Authenticators {
    }

    public static class DefaultInjector implements Injector {

        /* renamed from: a  reason: collision with root package name */
        public final Context f1419a;

        public DefaultInjector(Context context) {
            this.f1419a = context.getApplicationContext();
        }

        public android.hardware.biometrics.BiometricManager a() {
            return Api29Impl.b(this.f1419a);
        }

        public boolean b() {
            return KeyguardUtils.a(this.f1419a) != null;
        }

        public boolean c() {
            return PackageUtils.b(this.f1419a);
        }

        public boolean d() {
            return KeyguardUtils.b(this.f1419a);
        }

        public boolean e() {
            return DeviceUtils.a(this.f1419a, Build.MODEL);
        }

        public FingerprintManagerCompat f() {
            return FingerprintManagerCompat.c(this.f1419a);
        }
    }

    public interface Injector {
        android.hardware.biometrics.BiometricManager a();

        boolean b();

        boolean c();

        boolean d();

        boolean e();

        FingerprintManagerCompat f();
    }

    public static class Strings {
    }

    public class StringsCompat {
    }

    public BiometricManager(Injector injector) {
        this.f1416a = injector;
        int i2 = Build.VERSION.SDK_INT;
        FingerprintManagerCompat fingerprintManagerCompat = null;
        this.f1417b = i2 >= 29 ? injector.a() : null;
        this.f1418c = i2 <= 29 ? injector.f() : fingerprintManagerCompat;
    }

    public static BiometricManager g(Context context) {
        return new BiometricManager(new DefaultInjector(context));
    }

    public int a(int i2) {
        if (Build.VERSION.SDK_INT < 30) {
            return b(i2);
        }
        android.hardware.biometrics.BiometricManager biometricManager = this.f1417b;
        if (biometricManager != null) {
            return Api30Impl.a(biometricManager, i2);
        }
        Log.e("BiometricManager", "Failure in canAuthenticate(). BiometricManager was null.");
        return 1;
    }

    public final int b(int i2) {
        if (!AuthenticatorUtils.f(i2)) {
            return -2;
        }
        if (i2 == 0 || !this.f1416a.b()) {
            return 12;
        }
        if (AuthenticatorUtils.d(i2)) {
            return this.f1416a.d() ? 0 : 11;
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 == 29) {
            return AuthenticatorUtils.g(i2) ? f() : e();
        }
        if (i3 != 28) {
            return c();
        }
        if (this.f1416a.c()) {
            return d();
        }
        return 12;
    }

    public final int c() {
        FingerprintManagerCompat fingerprintManagerCompat = this.f1418c;
        if (fingerprintManagerCompat == null) {
            Log.e("BiometricManager", "Failure in canAuthenticate(). FingerprintManager was null.");
            return 1;
        } else if (!fingerprintManagerCompat.f()) {
            return 12;
        } else {
            return !this.f1418c.e() ? 11 : 0;
        }
    }

    public final int d() {
        return !this.f1416a.d() ? c() : c() == 0 ? 0 : -1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x004c A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:26:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int e() {
        /*
            r5 = this;
            java.lang.String r0 = "BiometricManager"
            java.lang.reflect.Method r1 = androidx.biometric.BiometricManager.Api29Impl.c()
            if (r1 == 0) goto L_0x0040
            androidx.biometric.BiometricPrompt$CryptoObject r2 = androidx.biometric.CryptoObjectUtils.a()
            android.hardware.biometrics.BiometricPrompt$CryptoObject r2 = androidx.biometric.CryptoObjectUtils.d(r2)
            if (r2 == 0) goto L_0x0040
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch:{ IllegalAccessException -> 0x0027, IllegalArgumentException -> 0x0025, InvocationTargetException -> 0x0023 }
            r4 = 29
            if (r3 != r4) goto L_0x0029
            android.hardware.biometrics.BiometricManager r3 = r5.f1417b     // Catch:{ IllegalAccessException -> 0x0027, IllegalArgumentException -> 0x0025, InvocationTargetException -> 0x0023 }
            java.lang.Object[] r2 = new java.lang.Object[]{r2}     // Catch:{ IllegalAccessException -> 0x0027, IllegalArgumentException -> 0x0025, InvocationTargetException -> 0x0023 }
            java.lang.Object r1 = r1.invoke(r3, r2)     // Catch:{ IllegalAccessException -> 0x0027, IllegalArgumentException -> 0x0025, InvocationTargetException -> 0x0023 }
            goto L_0x002a
        L_0x0023:
            r1 = move-exception
            goto L_0x003b
        L_0x0025:
            r1 = move-exception
            goto L_0x003b
        L_0x0027:
            r1 = move-exception
            goto L_0x003b
        L_0x0029:
            r1 = 0
        L_0x002a:
            boolean r2 = r1 instanceof java.lang.Integer     // Catch:{ IllegalAccessException -> 0x0027, IllegalArgumentException -> 0x0025, InvocationTargetException -> 0x0023 }
            if (r2 == 0) goto L_0x0035
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ IllegalAccessException -> 0x0027, IllegalArgumentException -> 0x0025, InvocationTargetException -> 0x0023 }
            int r0 = r1.intValue()     // Catch:{ IllegalAccessException -> 0x0027, IllegalArgumentException -> 0x0025, InvocationTargetException -> 0x0023 }
            return r0
        L_0x0035:
            java.lang.String r1 = "Invalid return type for canAuthenticate(CryptoObject)."
            android.util.Log.w(r0, r1)     // Catch:{ IllegalAccessException -> 0x0027, IllegalArgumentException -> 0x0025, InvocationTargetException -> 0x0023 }
            goto L_0x0040
        L_0x003b:
            java.lang.String r2 = "Failed to invoke canAuthenticate(CryptoObject)."
            android.util.Log.w(r0, r2, r1)
        L_0x0040:
            int r0 = r5.f()
            androidx.biometric.BiometricManager$Injector r1 = r5.f1416a
            boolean r1 = r1.e()
            if (r1 != 0) goto L_0x0053
            if (r0 == 0) goto L_0x004f
            goto L_0x0053
        L_0x004f:
            int r0 = r5.d()
        L_0x0053:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.biometric.BiometricManager.e():int");
    }

    public final int f() {
        android.hardware.biometrics.BiometricManager biometricManager = this.f1417b;
        if (biometricManager != null) {
            return Api29Impl.a(biometricManager);
        }
        Log.e("BiometricManager", "Failure in canAuthenticate(). BiometricManager was null.");
        return 1;
    }
}
