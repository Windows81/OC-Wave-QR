package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.wrappers.Wrappers;

public final class zzah {

    /* renamed from: a  reason: collision with root package name */
    public static final Object f24968a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static boolean f24969b;

    /* renamed from: c  reason: collision with root package name */
    public static String f24970c;

    /* renamed from: d  reason: collision with root package name */
    public static int f24971d;

    public static int a(Context context) {
        b(context);
        return f24971d;
    }

    public static void b(Context context) {
        synchronized (f24968a) {
            try {
                if (!f24969b) {
                    f24969b = true;
                    Bundle bundle = Wrappers.a(context).b(context.getPackageName(), 128).metaData;
                    if (bundle != null) {
                        f24970c = bundle.getString("com.google.app.id");
                        f24971d = bundle.getInt("com.google.android.gms.version");
                    }
                }
            } catch (PackageManager.NameNotFoundException e2) {
                Log.wtf("MetadataValueReader", "This should never happen.", e2);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
