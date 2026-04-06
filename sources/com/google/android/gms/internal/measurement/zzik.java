package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.database.ContentObserver;
import android.os.Handler;
import android.util.Log;
import androidx.core.content.PermissionChecker;

final class zzik implements zzif {

    /* renamed from: c  reason: collision with root package name */
    public static zzik f25517c;

    /* renamed from: a  reason: collision with root package name */
    public final Context f25518a;

    /* renamed from: b  reason: collision with root package name */
    public final ContentObserver f25519b;

    public zzik() {
        this.f25518a = null;
        this.f25519b = null;
    }

    public static zzik a(Context context) {
        zzik zzik;
        synchronized (zzik.class) {
            try {
                if (f25517c == null) {
                    f25517c = PermissionChecker.b(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new zzik(context) : new zzik();
                }
                zzik = f25517c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzik;
    }

    public static synchronized void b() {
        Context context;
        synchronized (zzik.class) {
            try {
                zzik zzik = f25517c;
                if (!(zzik == null || (context = zzik.f25518a) == null || zzik.f25519b == null)) {
                    context.getContentResolver().unregisterContentObserver(f25517c.f25519b);
                }
                f25517c = null;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
    }

    public final /* synthetic */ String c(String str) {
        return zzhn.a(this.f25518a.getContentResolver(), str, (String) null);
    }

    /* renamed from: d */
    public final String m(String str) {
        Context context = this.f25518a;
        if (context != null && !zzia.b(context)) {
            try {
                return (String) zzii.a(new zzij(this, str));
            } catch (IllegalStateException | NullPointerException | SecurityException e2) {
                Log.e("GservicesLoader", "Unable to read GServices for: " + str, e2);
            }
        }
        return null;
    }

    public zzik(Context context) {
        this.f25518a = context;
        zzim zzim = new zzim(this, (Handler) null);
        this.f25519b = zzim;
        context.getContentResolver().registerContentObserver(zzhq.f25483a, true, zzim);
    }
}
