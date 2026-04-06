package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.app.LocaleManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.LocaleList;
import android.util.Log;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.app.AppLocalesStorageHelper;
import androidx.collection.ArraySet;
import androidx.core.os.BuildCompat;
import androidx.core.os.LocaleListCompat;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.Iterator;

public abstract class AppCompatDelegate {

    /* renamed from: A  reason: collision with root package name */
    public static int f571A = -100;

    /* renamed from: B  reason: collision with root package name */
    public static LocaleListCompat f572B = null;
    public static LocaleListCompat C = null;
    public static Boolean D = null;
    public static boolean E = false;
    public static final ArraySet F = new ArraySet();
    public static final Object G = new Object();
    public static final Object H = new Object();

    /* renamed from: z  reason: collision with root package name */
    public static AppLocalesStorageHelper.SerialExecutor f573z = new AppLocalesStorageHelper.SerialExecutor(new AppLocalesStorageHelper.ThreadPerTaskExecutor());

    public static class Api24Impl {
        public static LocaleList a(String str) {
            return LocaleList.forLanguageTags(str);
        }
    }

    public static class Api33Impl {
        public static LocaleList a(Object obj) {
            return ((LocaleManager) obj).getApplicationLocales();
        }

        public static void b(Object obj, LocaleList localeList) {
            ((LocaleManager) obj).setApplicationLocales(localeList);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface NightMode {
    }

    public static void E(AppCompatDelegate appCompatDelegate) {
        synchronized (G) {
            F(appCompatDelegate);
        }
    }

    public static void F(AppCompatDelegate appCompatDelegate) {
        synchronized (G) {
            try {
                Iterator it = F.iterator();
                while (it.hasNext()) {
                    AppCompatDelegate appCompatDelegate2 = (AppCompatDelegate) ((WeakReference) it.next()).get();
                    if (appCompatDelegate2 == appCompatDelegate || appCompatDelegate2 == null) {
                        it.remove();
                    }
                }
            } finally {
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void N(android.content.Context r3) {
        /*
            boolean r0 = u(r3)
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            boolean r0 = androidx.core.os.BuildCompat.c()
            if (r0 == 0) goto L_0x001c
            boolean r0 = E
            if (r0 != 0) goto L_0x0057
            androidx.appcompat.app.AppLocalesStorageHelper$SerialExecutor r0 = f573z
            androidx.appcompat.app.a r1 = new androidx.appcompat.app.a
            r1.<init>(r3)
            r0.execute(r1)
            goto L_0x0057
        L_0x001c:
            java.lang.Object r0 = H
            monitor-enter(r0)
            androidx.core.os.LocaleListCompat r1 = f572B     // Catch:{ all -> 0x0032 }
            if (r1 != 0) goto L_0x0043
            androidx.core.os.LocaleListCompat r1 = C     // Catch:{ all -> 0x0032 }
            if (r1 != 0) goto L_0x0034
            java.lang.String r3 = androidx.appcompat.app.AppLocalesStorageHelper.b(r3)     // Catch:{ all -> 0x0032 }
            androidx.core.os.LocaleListCompat r3 = androidx.core.os.LocaleListCompat.c(r3)     // Catch:{ all -> 0x0032 }
            C = r3     // Catch:{ all -> 0x0032 }
            goto L_0x0034
        L_0x0032:
            r3 = move-exception
            goto L_0x0058
        L_0x0034:
            androidx.core.os.LocaleListCompat r3 = C     // Catch:{ all -> 0x0032 }
            boolean r3 = r3.f()     // Catch:{ all -> 0x0032 }
            if (r3 == 0) goto L_0x003e
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
            return
        L_0x003e:
            androidx.core.os.LocaleListCompat r3 = C     // Catch:{ all -> 0x0032 }
            f572B = r3     // Catch:{ all -> 0x0032 }
            goto L_0x0056
        L_0x0043:
            androidx.core.os.LocaleListCompat r2 = C     // Catch:{ all -> 0x0032 }
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0032 }
            if (r1 != 0) goto L_0x0056
            androidx.core.os.LocaleListCompat r1 = f572B     // Catch:{ all -> 0x0032 }
            C = r1     // Catch:{ all -> 0x0032 }
            java.lang.String r1 = r1.h()     // Catch:{ all -> 0x0032 }
            androidx.appcompat.app.AppLocalesStorageHelper.a(r3, r1)     // Catch:{ all -> 0x0032 }
        L_0x0056:
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
        L_0x0057:
            return
        L_0x0058:
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegate.N(android.content.Context):void");
    }

    public static void d(AppCompatDelegate appCompatDelegate) {
        synchronized (G) {
            F(appCompatDelegate);
            F.add(new WeakReference(appCompatDelegate));
        }
    }

    public static AppCompatDelegate h(Activity activity, AppCompatCallback appCompatCallback) {
        return new AppCompatDelegateImpl(activity, appCompatCallback);
    }

    public static AppCompatDelegate i(Dialog dialog, AppCompatCallback appCompatCallback) {
        return new AppCompatDelegateImpl(dialog, appCompatCallback);
    }

    public static LocaleListCompat k() {
        if (BuildCompat.c()) {
            Object o2 = o();
            if (o2 != null) {
                return LocaleListCompat.i(Api33Impl.a(o2));
            }
        } else {
            LocaleListCompat localeListCompat = f572B;
            if (localeListCompat != null) {
                return localeListCompat;
            }
        }
        return LocaleListCompat.e();
    }

    public static int m() {
        return f571A;
    }

    public static Object o() {
        Context l2;
        Iterator it = F.iterator();
        while (it.hasNext()) {
            AppCompatDelegate appCompatDelegate = (AppCompatDelegate) ((WeakReference) it.next()).get();
            if (appCompatDelegate != null && (l2 = appCompatDelegate.l()) != null) {
                return l2.getSystemService("locale");
            }
        }
        return null;
    }

    public static LocaleListCompat q() {
        return f572B;
    }

    public static boolean u(Context context) {
        if (D == null) {
            try {
                Bundle bundle = AppLocalesMetadataHolderService.a(context).metaData;
                if (bundle != null) {
                    D = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                D = Boolean.FALSE;
            }
        }
        return D.booleanValue();
    }

    public static /* synthetic */ void v(Context context) {
        AppLocalesStorageHelper.c(context);
        E = true;
    }

    public abstract void A();

    public abstract void B(Bundle bundle);

    public abstract void C();

    public abstract void D();

    public abstract boolean G(int i2);

    public abstract void H(int i2);

    public abstract void I(View view);

    public abstract void J(View view, ViewGroup.LayoutParams layoutParams);

    public void K(OnBackInvokedDispatcher onBackInvokedDispatcher) {
    }

    public void L(int i2) {
    }

    public abstract void M(CharSequence charSequence);

    public abstract void e(View view, ViewGroup.LayoutParams layoutParams);

    public void f(Context context) {
    }

    public Context g(Context context) {
        f(context);
        return context;
    }

    public abstract View j(int i2);

    public Context l() {
        return null;
    }

    public int n() {
        return -100;
    }

    public abstract MenuInflater p();

    public abstract ActionBar r();

    public abstract void s();

    public abstract void t();

    public abstract void w(Configuration configuration);

    public abstract void x(Bundle bundle);

    public abstract void y();

    public abstract void z(Bundle bundle);
}
