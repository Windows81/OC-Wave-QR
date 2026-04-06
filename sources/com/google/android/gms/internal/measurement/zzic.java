package com.google.android.gms.internal.measurement;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Handler;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import androidx.collection.ArrayMap;
import com.google.common.base.Preconditions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class zzic implements zzif {

    /* renamed from: h  reason: collision with root package name */
    public static final Map f25504h = new ArrayMap();

    /* renamed from: i  reason: collision with root package name */
    public static final String[] f25505i = {"key", "value"};

    /* renamed from: a  reason: collision with root package name */
    public final ContentResolver f25506a;

    /* renamed from: b  reason: collision with root package name */
    public final Uri f25507b;

    /* renamed from: c  reason: collision with root package name */
    public final Runnable f25508c;

    /* renamed from: d  reason: collision with root package name */
    public final ContentObserver f25509d;

    /* renamed from: e  reason: collision with root package name */
    public final Object f25510e = new Object();

    /* renamed from: f  reason: collision with root package name */
    public volatile Map f25511f;

    /* renamed from: g  reason: collision with root package name */
    public final List f25512g = new ArrayList();

    public zzic(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        zzie zzie = new zzie(this, (Handler) null);
        this.f25509d = zzie;
        Preconditions.q(contentResolver);
        Preconditions.q(uri);
        this.f25506a = contentResolver;
        this.f25507b = uri;
        this.f25508c = runnable;
        contentResolver.registerContentObserver(uri, false, zzie);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:2|3|(5:5|6|7|8|9)|12|13) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0019 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.measurement.zzic a(android.content.ContentResolver r4, android.net.Uri r5, java.lang.Runnable r6) {
        /*
            java.lang.Class<com.google.android.gms.internal.measurement.zzic> r0 = com.google.android.gms.internal.measurement.zzic.class
            monitor-enter(r0)
            java.util.Map r1 = f25504h     // Catch:{ all -> 0x0017 }
            java.lang.Object r2 = r1.get(r5)     // Catch:{ all -> 0x0017 }
            com.google.android.gms.internal.measurement.zzic r2 = (com.google.android.gms.internal.measurement.zzic) r2     // Catch:{ all -> 0x0017 }
            if (r2 != 0) goto L_0x0019
            com.google.android.gms.internal.measurement.zzic r3 = new com.google.android.gms.internal.measurement.zzic     // Catch:{ SecurityException -> 0x0019 }
            r3.<init>(r4, r5, r6)     // Catch:{ SecurityException -> 0x0019 }
            r1.put(r5, r3)     // Catch:{ SecurityException -> 0x0015 }
        L_0x0015:
            r2 = r3
            goto L_0x0019
        L_0x0017:
            r4 = move-exception
            goto L_0x001b
        L_0x0019:
            monitor-exit(r0)     // Catch:{ all -> 0x0017 }
            return r2
        L_0x001b:
            monitor-exit(r0)     // Catch:{ all -> 0x0017 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzic.a(android.content.ContentResolver, android.net.Uri, java.lang.Runnable):com.google.android.gms.internal.measurement.zzic");
    }

    public static synchronized void d() {
        synchronized (zzic.class) {
            try {
                for (zzic zzic : f25504h.values()) {
                    zzic.f25506a.unregisterContentObserver(zzic.f25509d);
                }
                f25504h.clear();
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
    }

    public final Map b() {
        Map map = this.f25511f;
        if (map == null) {
            synchronized (this.f25510e) {
                try {
                    map = this.f25511f;
                    if (map == null) {
                        map = f();
                        this.f25511f = map;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return map != null ? map : Collections.emptyMap();
    }

    public final /* synthetic */ Map c() {
        Cursor query;
        ContentProviderClient acquireUnstableContentProviderClient = this.f25506a.acquireUnstableContentProviderClient(this.f25507b);
        if (acquireUnstableContentProviderClient == null) {
            Log.w("ConfigurationContentLdr", "Unable to acquire ContentProviderClient, using default values");
            return Collections.emptyMap();
        }
        try {
            query = acquireUnstableContentProviderClient.query(this.f25507b, f25505i, (String) null, (String[]) null, (String) null);
            if (query == null) {
                Log.w("ConfigurationContentLdr", "ContentProvider query returned null cursor, using default values");
                Map emptyMap = Collections.emptyMap();
                if (query != null) {
                    query.close();
                }
                acquireUnstableContentProviderClient.release();
                return emptyMap;
            }
            int count = query.getCount();
            if (count == 0) {
                Map emptyMap2 = Collections.emptyMap();
                query.close();
                acquireUnstableContentProviderClient.release();
                return emptyMap2;
            }
            Map arrayMap = count <= 256 ? new ArrayMap(count) : new HashMap(count, 1.0f);
            while (query.moveToNext()) {
                arrayMap.put(query.getString(0), query.getString(1));
            }
            if (!query.isAfterLast()) {
                Log.w("ConfigurationContentLdr", "Cursor read incomplete (ContentProvider dead?), using default values");
                Map emptyMap3 = Collections.emptyMap();
                query.close();
                acquireUnstableContentProviderClient.release();
                return emptyMap3;
            }
            query.close();
            acquireUnstableContentProviderClient.release();
            return arrayMap;
        } catch (RemoteException e2) {
            Log.w("ConfigurationContentLdr", "ContentProvider query failed, using default values", e2);
            Map emptyMap4 = Collections.emptyMap();
            acquireUnstableContentProviderClient.release();
            return emptyMap4;
        } catch (Throwable th) {
            acquireUnstableContentProviderClient.release();
            throw th;
        }
        throw th;
    }

    public final void e() {
        synchronized (this.f25510e) {
            this.f25511f = null;
            this.f25508c.run();
        }
        synchronized (this) {
            try {
                for (zzid a2 : this.f25512g) {
                    a2.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Map f() {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return (Map) zzii.a(new zzib(this));
        } catch (SQLiteException | IllegalStateException | SecurityException e2) {
            Log.w("ConfigurationContentLdr", "Unable to query ContentProvider, using default values", e2);
            return Collections.emptyMap();
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    public final /* synthetic */ Object m(String str) {
        return (String) b().get(str);
    }
}
