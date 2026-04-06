package com.google.firebase.perf.config;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.firebase.FirebaseApp;
import com.google.firebase.perf.logging.AndroidLogger;
import com.google.firebase.perf.util.Optional;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class DeviceCacheManager {

    /* renamed from: c  reason: collision with root package name */
    public static final AndroidLogger f30944c = AndroidLogger.e();

    /* renamed from: d  reason: collision with root package name */
    public static DeviceCacheManager f30945d;

    /* renamed from: a  reason: collision with root package name */
    public volatile SharedPreferences f30946a;

    /* renamed from: b  reason: collision with root package name */
    public final ExecutorService f30947b;

    public DeviceCacheManager(ExecutorService executorService) {
        this.f30947b = executorService;
    }

    public static synchronized DeviceCacheManager e() {
        DeviceCacheManager deviceCacheManager;
        synchronized (DeviceCacheManager.class) {
            try {
                if (f30945d == null) {
                    f30945d = new DeviceCacheManager(Executors.newSingleThreadExecutor());
                }
                deviceCacheManager = f30945d;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        return deviceCacheManager;
    }

    public Optional b(String str) {
        if (str == null) {
            f30944c.a("Key is null when getting boolean value on device cache.");
            return Optional.a();
        }
        if (this.f30946a == null) {
            i(d());
            if (this.f30946a == null) {
                return Optional.a();
            }
        }
        if (!this.f30946a.contains(str)) {
            return Optional.a();
        }
        try {
            return Optional.e(Boolean.valueOf(this.f30946a.getBoolean(str, false)));
        } catch (ClassCastException e2) {
            f30944c.b("Key %s from sharedPreferences has type other than long: %s", str, e2.getMessage());
            return Optional.a();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005b, code lost:
        return com.google.firebase.perf.util.Optional.e(java.lang.Double.valueOf(java.lang.Float.valueOf(r3.f30946a.getFloat(r4, 0.0f)).doubleValue()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005d, code lost:
        f30944c.b("Key %s from sharedPreferences has type other than double: %s", r4, r0.getMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0070, code lost:
        return com.google.firebase.perf.util.Optional.a();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0044 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.firebase.perf.util.Optional c(java.lang.String r4) {
        /*
            r3 = this;
            if (r4 != 0) goto L_0x000e
            com.google.firebase.perf.logging.AndroidLogger r4 = f30944c
            java.lang.String r0 = "Key is null when getting double value on device cache."
            r4.a(r0)
            com.google.firebase.perf.util.Optional r4 = com.google.firebase.perf.util.Optional.a()
            return r4
        L_0x000e:
            android.content.SharedPreferences r0 = r3.f30946a
            if (r0 != 0) goto L_0x0022
            android.content.Context r0 = r3.d()
            r3.i(r0)
            android.content.SharedPreferences r0 = r3.f30946a
            if (r0 != 0) goto L_0x0022
            com.google.firebase.perf.util.Optional r4 = com.google.firebase.perf.util.Optional.a()
            return r4
        L_0x0022:
            android.content.SharedPreferences r0 = r3.f30946a
            boolean r0 = r0.contains(r4)
            if (r0 != 0) goto L_0x002f
            com.google.firebase.perf.util.Optional r4 = com.google.firebase.perf.util.Optional.a()
            return r4
        L_0x002f:
            android.content.SharedPreferences r0 = r3.f30946a     // Catch:{ ClassCastException -> 0x0044 }
            r1 = 0
            long r0 = r0.getLong(r4, r1)     // Catch:{ ClassCastException -> 0x0044 }
            double r0 = java.lang.Double.longBitsToDouble(r0)     // Catch:{ ClassCastException -> 0x0044 }
            java.lang.Double r0 = java.lang.Double.valueOf(r0)     // Catch:{ ClassCastException -> 0x0044 }
            com.google.firebase.perf.util.Optional r4 = com.google.firebase.perf.util.Optional.e(r0)     // Catch:{ ClassCastException -> 0x0044 }
            return r4
        L_0x0044:
            android.content.SharedPreferences r0 = r3.f30946a     // Catch:{ ClassCastException -> 0x005c }
            r1 = 0
            float r0 = r0.getFloat(r4, r1)     // Catch:{ ClassCastException -> 0x005c }
            java.lang.Float r0 = java.lang.Float.valueOf(r0)     // Catch:{ ClassCastException -> 0x005c }
            double r0 = r0.doubleValue()     // Catch:{ ClassCastException -> 0x005c }
            java.lang.Double r0 = java.lang.Double.valueOf(r0)     // Catch:{ ClassCastException -> 0x005c }
            com.google.firebase.perf.util.Optional r4 = com.google.firebase.perf.util.Optional.e(r0)     // Catch:{ ClassCastException -> 0x005c }
            return r4
        L_0x005c:
            r0 = move-exception
            com.google.firebase.perf.logging.AndroidLogger r1 = f30944c
            java.lang.String r0 = r0.getMessage()
            java.lang.Object[] r4 = new java.lang.Object[]{r4, r0}
            java.lang.String r0 = "Key %s from sharedPreferences has type other than double: %s"
            r1.b(r0, r4)
            com.google.firebase.perf.util.Optional r4 = com.google.firebase.perf.util.Optional.a()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.perf.config.DeviceCacheManager.c(java.lang.String):com.google.firebase.perf.util.Optional");
    }

    public final Context d() {
        try {
            FirebaseApp.l();
            return FirebaseApp.l().k();
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    public Optional f(String str) {
        if (str == null) {
            f30944c.a("Key is null when getting long value on device cache.");
            return Optional.a();
        }
        if (this.f30946a == null) {
            i(d());
            if (this.f30946a == null) {
                return Optional.a();
            }
        }
        if (!this.f30946a.contains(str)) {
            return Optional.a();
        }
        try {
            return Optional.e(Long.valueOf(this.f30946a.getLong(str, 0)));
        } catch (ClassCastException e2) {
            f30944c.b("Key %s from sharedPreferences has type other than long: %s", str, e2.getMessage());
            return Optional.a();
        }
    }

    public Optional g(String str) {
        if (str == null) {
            f30944c.a("Key is null when getting String value on device cache.");
            return Optional.a();
        }
        if (this.f30946a == null) {
            i(d());
            if (this.f30946a == null) {
                return Optional.a();
            }
        }
        if (!this.f30946a.contains(str)) {
            return Optional.a();
        }
        try {
            return Optional.e(this.f30946a.getString(str, ""));
        } catch (ClassCastException e2) {
            f30944c.b("Key %s from sharedPreferences has type other than String: %s", str, e2.getMessage());
            return Optional.a();
        }
    }

    public final /* synthetic */ void h(Context context) {
        if (this.f30946a == null && context != null) {
            this.f30946a = context.getSharedPreferences("FirebasePerfSharedPrefs", 0);
        }
    }

    public synchronized void i(Context context) {
        if (this.f30946a == null && context != null) {
            this.f30947b.execute(new a(this, context));
        }
    }

    public boolean j(String str, double d2) {
        if (str == null) {
            f30944c.a("Key is null when setting double value on device cache.");
            return false;
        }
        if (this.f30946a == null) {
            i(d());
            if (this.f30946a == null) {
                return false;
            }
        }
        this.f30946a.edit().putLong(str, Double.doubleToRawLongBits(d2)).apply();
        return true;
    }

    public boolean k(String str, long j2) {
        if (str == null) {
            f30944c.a("Key is null when setting long value on device cache.");
            return false;
        }
        if (this.f30946a == null) {
            i(d());
            if (this.f30946a == null) {
                return false;
            }
        }
        this.f30946a.edit().putLong(str, j2).apply();
        return true;
    }

    public boolean l(String str, String str2) {
        if (str == null) {
            f30944c.a("Key is null when setting String value on device cache.");
            return false;
        }
        if (this.f30946a == null) {
            i(d());
            if (this.f30946a == null) {
                return false;
            }
        }
        if (str2 == null) {
            this.f30946a.edit().remove(str).apply();
            return true;
        }
        this.f30946a.edit().putString(str, str2).apply();
        return true;
    }

    public boolean m(String str, boolean z2) {
        if (str == null) {
            f30944c.a("Key is null when setting boolean value on device cache.");
            return false;
        }
        if (this.f30946a == null) {
            i(d());
            if (this.f30946a == null) {
                return false;
            }
        }
        this.f30946a.edit().putBoolean(str, z2).apply();
        return true;
    }
}
