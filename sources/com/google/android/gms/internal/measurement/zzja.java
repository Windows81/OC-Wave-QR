package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.StrictMode;
import androidx.collection.ArrayMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class zzja implements zzif {

    /* renamed from: g  reason: collision with root package name */
    public static final Map f25545g = new ArrayMap();

    /* renamed from: a  reason: collision with root package name */
    public final SharedPreferences f25546a;

    /* renamed from: b  reason: collision with root package name */
    public final Runnable f25547b;

    /* renamed from: c  reason: collision with root package name */
    public final SharedPreferences.OnSharedPreferenceChangeListener f25548c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f25549d = new Object();

    /* renamed from: e  reason: collision with root package name */
    public volatile Map f25550e;

    /* renamed from: f  reason: collision with root package name */
    public final List f25551f = new ArrayList();

    public zzja(SharedPreferences sharedPreferences, Runnable runnable) {
        zzjd zzjd = new zzjd(this);
        this.f25548c = zzjd;
        this.f25546a = sharedPreferences;
        this.f25547b = runnable;
        sharedPreferences.registerOnSharedPreferenceChangeListener(zzjd);
    }

    public static SharedPreferences a(Context context, String str) {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            if (str.startsWith("direct_boot:")) {
                if (zzia.a()) {
                    context = context.createDeviceProtectedStorageContext();
                }
                SharedPreferences a2 = zzcr.a(context, str.substring(12), 0, zzcn.f25396a);
                StrictMode.setThreadPolicy(allowThreadDiskReads);
                return a2;
            }
            SharedPreferences a3 = zzcr.a(context, str, 0, zzcn.f25396a);
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return a3;
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th;
        }
    }

    public static zzja b(Context context, String str, Runnable runnable) {
        zzja zzja;
        if (!((!zzia.a() || str.startsWith("direct_boot:")) ? true : zzia.c(context))) {
            return null;
        }
        synchronized (zzja.class) {
            try {
                Map map = f25545g;
                zzja = (zzja) map.get(str);
                if (zzja == null) {
                    zzja = new zzja(a(context, str), runnable);
                    map.put(str, zzja);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzja;
    }

    public static synchronized void c() {
        synchronized (zzja.class) {
            try {
                for (zzja zzja : f25545g.values()) {
                    zzja.f25546a.unregisterOnSharedPreferenceChangeListener(zzja.f25548c);
                }
                f25545g.clear();
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
    }

    public final /* synthetic */ void d(SharedPreferences sharedPreferences, String str) {
        synchronized (this.f25549d) {
            this.f25550e = null;
            this.f25547b.run();
        }
        synchronized (this) {
            try {
                for (zzid a2 : this.f25551f) {
                    a2.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Object m(String str) {
        StrictMode.ThreadPolicy allowThreadDiskReads;
        Map<String, ?> map = this.f25550e;
        if (map == null) {
            synchronized (this.f25549d) {
                try {
                    map = this.f25550e;
                    if (map == null) {
                        allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        Map<String, ?> all = this.f25546a.getAll();
                        this.f25550e = all;
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                        map = all;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (map != null) {
            return map.get(str);
        }
        return null;
    }
}
