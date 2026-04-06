package com.google.firebase.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.core.content.ContextCompat;
import com.google.firebase.events.Publisher;

public class DataCollectionConfigStorage {

    /* renamed from: a  reason: collision with root package name */
    public final Context f30874a;

    /* renamed from: b  reason: collision with root package name */
    public final SharedPreferences f30875b;

    /* renamed from: c  reason: collision with root package name */
    public final Publisher f30876c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f30877d = c();

    public DataCollectionConfigStorage(Context context, String str, Publisher publisher) {
        Context a2 = a(context);
        this.f30874a = a2;
        this.f30875b = a2.getSharedPreferences("com.google.firebase.common.prefs:" + str, 0);
        this.f30876c = publisher;
    }

    public static Context a(Context context) {
        return ContextCompat.b(context);
    }

    public synchronized boolean b() {
        return this.f30877d;
    }

    public final boolean c() {
        return this.f30875b.contains("firebase_data_collection_default_enabled") ? this.f30875b.getBoolean("firebase_data_collection_default_enabled", true) : d();
    }

    public final boolean d() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageManager packageManager = this.f30874a.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(this.f30874a.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_data_collection_default_enabled")) {
                return true;
            }
            return applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }
}
