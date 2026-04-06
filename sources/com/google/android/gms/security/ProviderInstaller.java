package com.google.android.gms.security;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamite.DynamiteModule;
import java.lang.reflect.Method;

public class ProviderInstaller {

    /* renamed from: a  reason: collision with root package name */
    public static final GoogleApiAvailabilityLight f27137a = GoogleApiAvailabilityLight.h();

    /* renamed from: b  reason: collision with root package name */
    public static final Object f27138b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public static Method f27139c = null;

    /* renamed from: d  reason: collision with root package name */
    public static Method f27140d = null;

    public interface ProviderInstallListener {
        void a();

        void b(int i2, Intent intent);
    }

    public static void a(Context context) {
        Context context2;
        Preconditions.n(context, "Context must not be null");
        f27137a.n(context, 11925000);
        synchronized (f27138b) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            try {
                context2 = DynamiteModule.e(context, DynamiteModule.f25223f, "com.google.android.gms.providerinstaller.dynamite").b();
            } catch (DynamiteModule.LoadingException e2) {
                Log.w("ProviderInstaller", "Failed to load providerinstaller module: ".concat(String.valueOf(e2.getMessage())));
                context2 = null;
            }
            if (context2 != null) {
                d(context2, context, "com.google.android.gms.providerinstaller.ProviderInstallerImpl");
                return;
            }
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            Context e3 = GooglePlayServicesUtilLight.e(context);
            if (e3 != null) {
                try {
                    if (f27140d == null) {
                        Class cls = Long.TYPE;
                        f27140d = c(e3, "com.google.android.gms.common.security.ProviderInstallerImpl", "reportRequestStats", new Class[]{Context.class, cls, cls});
                    }
                    f27140d.invoke((Object) null, new Object[]{context, Long.valueOf(elapsedRealtime), Long.valueOf(elapsedRealtime2)});
                } catch (Exception e4) {
                    Log.w("ProviderInstaller", "Failed to report request stats: ".concat(String.valueOf(e4.getMessage())));
                }
            }
            if (e3 != null) {
                d(e3, context, "com.google.android.gms.common.security.ProviderInstallerImpl");
            } else {
                Log.e("ProviderInstaller", "Failed to get remote context");
                throw new GooglePlayServicesNotAvailableException(8);
            }
        }
    }

    public static Method c(Context context, String str, String str2, Class[] clsArr) {
        return context.getClassLoader().loadClass(str).getMethod(str2, clsArr);
    }

    public static void d(Context context, Context context2, String str) {
        try {
            if (f27139c == null) {
                f27139c = c(context, str, "insertProvider", new Class[]{Context.class});
            }
            f27139c.invoke((Object) null, new Object[]{context});
        } catch (Exception e2) {
            Throwable cause = e2.getCause();
            if (Log.isLoggable("ProviderInstaller", 6)) {
                Log.e("ProviderInstaller", "Failed to install provider: ".concat(String.valueOf(cause == null ? e2.getMessage() : cause.getMessage())));
            }
            throw new GooglePlayServicesNotAvailableException(8);
        }
    }
}
