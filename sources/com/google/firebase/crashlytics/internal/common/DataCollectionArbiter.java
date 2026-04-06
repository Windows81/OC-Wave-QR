package com.google.firebase.crashlytics.internal.common;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.FirebaseApp;
import com.google.firebase.crashlytics.internal.Logger;
import java.util.concurrent.Executor;

public class DataCollectionArbiter {

    /* renamed from: a  reason: collision with root package name */
    public final SharedPreferences f30065a;

    /* renamed from: b  reason: collision with root package name */
    public final FirebaseApp f30066b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f30067c;

    /* renamed from: d  reason: collision with root package name */
    public TaskCompletionSource f30068d = new TaskCompletionSource();

    /* renamed from: e  reason: collision with root package name */
    public boolean f30069e = false;

    /* renamed from: f  reason: collision with root package name */
    public boolean f30070f = false;

    /* renamed from: g  reason: collision with root package name */
    public Boolean f30071g;

    /* renamed from: h  reason: collision with root package name */
    public final TaskCompletionSource f30072h = new TaskCompletionSource();

    public DataCollectionArbiter(FirebaseApp firebaseApp) {
        Object obj = new Object();
        this.f30067c = obj;
        Context k2 = firebaseApp.k();
        this.f30066b = firebaseApp;
        this.f30065a = CommonUtils.q(k2);
        Boolean b2 = b();
        this.f30071g = b2 == null ? a(k2) : b2;
        synchronized (obj) {
            try {
                if (d()) {
                    this.f30068d.e((Object) null);
                    this.f30069e = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static Boolean g(Context context) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_crashlytics_collection_enabled")) {
                return null;
            }
            return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_crashlytics_collection_enabled"));
        } catch (PackageManager.NameNotFoundException e2) {
            Logger.f().e("Could not read data collection permission from manifest", e2);
            return null;
        }
    }

    public final Boolean a(Context context) {
        Boolean g2 = g(context);
        if (g2 == null) {
            this.f30070f = false;
            return null;
        }
        this.f30070f = true;
        return Boolean.valueOf(Boolean.TRUE.equals(g2));
    }

    public final Boolean b() {
        if (!this.f30065a.contains("firebase_crashlytics_collection_enabled")) {
            return null;
        }
        this.f30070f = false;
        return Boolean.valueOf(this.f30065a.getBoolean("firebase_crashlytics_collection_enabled", true));
    }

    public void c(boolean z2) {
        if (z2) {
            this.f30072h.e((Object) null);
            return;
        }
        throw new IllegalStateException("An invalid data collection token was used.");
    }

    public synchronized boolean d() {
        boolean booleanValue;
        try {
            Boolean bool = this.f30071g;
            booleanValue = bool != null ? bool.booleanValue() : e();
            f(booleanValue);
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
        return booleanValue;
    }

    public final boolean e() {
        try {
            return this.f30066b.t();
        } catch (IllegalStateException unused) {
            return false;
        }
    }

    public final void f(boolean z2) {
        Logger.f().b(String.format("Crashlytics automatic data collection %s by %s.", new Object[]{z2 ? "ENABLED" : "DISABLED", this.f30071g == null ? "global Firebase setting" : this.f30070f ? "firebase_crashlytics_collection_enabled manifest flag" : "API"}));
    }

    public Task h() {
        Task a2;
        synchronized (this.f30067c) {
            a2 = this.f30068d.a();
        }
        return a2;
    }

    public Task i(Executor executor) {
        return Utils.o(executor, this.f30072h.a(), h());
    }
}
