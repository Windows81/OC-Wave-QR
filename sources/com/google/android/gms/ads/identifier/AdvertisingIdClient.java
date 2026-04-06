package com.google.android.gms.ads.identifier;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.BlockingServiceConnection;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.internal.ads_identifier.zze;
import com.google.android.gms.internal.ads_identifier.zzf;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
public class AdvertisingIdClient {

    /* renamed from: a  reason: collision with root package name */
    public BlockingServiceConnection f24310a;

    /* renamed from: b  reason: collision with root package name */
    public zzf f24311b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f24312c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f24313d = new Object();

    /* renamed from: e  reason: collision with root package name */
    public zzb f24314e;

    /* renamed from: f  reason: collision with root package name */
    public final Context f24315f;

    /* renamed from: g  reason: collision with root package name */
    public final long f24316g;

    public static final class Info {

        /* renamed from: a  reason: collision with root package name */
        public final String f24317a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f24318b;

        public Info(String str, boolean z2) {
            this.f24317a = str;
            this.f24318b = z2;
        }

        public String a() {
            return this.f24317a;
        }

        public boolean b() {
            return this.f24318b;
        }

        public String toString() {
            String str = this.f24317a;
            boolean z2 = this.f24318b;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7);
            sb.append("{");
            sb.append(str);
            sb.append("}");
            sb.append(z2);
            return sb.toString();
        }
    }

    public AdvertisingIdClient(Context context, long j2, boolean z2, boolean z3) {
        Context applicationContext;
        Preconditions.m(context);
        if (z2 && (applicationContext = context.getApplicationContext()) != null) {
            context = applicationContext;
        }
        this.f24315f = context;
        this.f24312c = false;
        this.f24316g = j2;
    }

    public static Info a(Context context) {
        AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(context, -1, true, false);
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            advertisingIdClient.d(false);
            Info f2 = advertisingIdClient.f(-1);
            advertisingIdClient.e(f2, true, 0.0f, SystemClock.elapsedRealtime() - elapsedRealtime, "", (Throwable) null);
            advertisingIdClient.c();
            return f2;
        } catch (Throwable th) {
            advertisingIdClient.c();
            throw th;
        }
    }

    public static void b(boolean z2) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0034, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c() {
        /*
            r3 = this;
            java.lang.String r0 = "Calling this from your main thread can lead to deadlock"
            com.google.android.gms.common.internal.Preconditions.l(r0)
            monitor-enter(r3)
            android.content.Context r0 = r3.f24315f     // Catch:{ all -> 0x0031 }
            if (r0 == 0) goto L_0x0033
            com.google.android.gms.common.BlockingServiceConnection r0 = r3.f24310a     // Catch:{ all -> 0x0031 }
            if (r0 != 0) goto L_0x000f
            goto L_0x0033
        L_0x000f:
            boolean r0 = r3.f24312c     // Catch:{ all -> 0x001f }
            if (r0 == 0) goto L_0x0027
            com.google.android.gms.common.stats.ConnectionTracker r0 = com.google.android.gms.common.stats.ConnectionTracker.b()     // Catch:{ all -> 0x001f }
            android.content.Context r1 = r3.f24315f     // Catch:{ all -> 0x001f }
            com.google.android.gms.common.BlockingServiceConnection r2 = r3.f24310a     // Catch:{ all -> 0x001f }
            r0.c(r1, r2)     // Catch:{ all -> 0x001f }
            goto L_0x0027
        L_0x001f:
            r0 = move-exception
            java.lang.String r1 = "AdvertisingIdClient"
            java.lang.String r2 = "AdvertisingIdClient unbindService failed."
            android.util.Log.i(r1, r2, r0)     // Catch:{ all -> 0x0031 }
        L_0x0027:
            r0 = 0
            r3.f24312c = r0     // Catch:{ all -> 0x0031 }
            r0 = 0
            r3.f24311b = r0     // Catch:{ all -> 0x0031 }
            r3.f24310a = r0     // Catch:{ all -> 0x0031 }
            monitor-exit(r3)     // Catch:{ all -> 0x0031 }
            return
        L_0x0031:
            r0 = move-exception
            goto L_0x0035
        L_0x0033:
            monitor-exit(r3)     // Catch:{ all -> 0x0031 }
            return
        L_0x0035:
            monitor-exit(r3)     // Catch:{ all -> 0x0031 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.identifier.AdvertisingIdClient.c():void");
    }

    public final void d(boolean z2) {
        Preconditions.l("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.f24312c) {
                    c();
                }
                Context context = this.f24315f;
                context.getPackageManager().getPackageInfo("com.android.vending", 0);
                int j2 = GoogleApiAvailabilityLight.h().j(context, GooglePlayServicesUtilLight.f24398a);
                if (j2 != 0) {
                    if (j2 != 2) {
                        throw new IOException("Google Play services not available");
                    }
                }
                BlockingServiceConnection blockingServiceConnection = new BlockingServiceConnection();
                Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                intent.setPackage("com.google.android.gms");
                if (ConnectionTracker.b().a(context, intent, blockingServiceConnection, 1)) {
                    this.f24310a = blockingServiceConnection;
                    this.f24311b = zze.J(blockingServiceConnection.a(10000, TimeUnit.MILLISECONDS));
                    this.f24312c = true;
                    if (z2) {
                        g();
                    }
                } else {
                    throw new IOException("Connection failure");
                }
            } catch (PackageManager.NameNotFoundException unused) {
                throw new GooglePlayServicesNotAvailableException(9);
            } catch (InterruptedException unused2) {
                throw new IOException("Interrupted exception");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean e(Info info, boolean z2, float f2, long j2, String str, Throwable th) {
        if (Math.random() > 0.0d) {
            return false;
        }
        HashMap hashMap = new HashMap();
        String str2 = "1";
        hashMap.put("app_context", str2);
        if (info != null) {
            if (true != info.b()) {
                str2 = "0";
            }
            hashMap.put("limit_ad_tracking", str2);
            String a2 = info.a();
            if (a2 != null) {
                hashMap.put("ad_id_size", Integer.toString(a2.length()));
            }
        }
        if (th != null) {
            hashMap.put("error", th.getClass().getName());
        }
        hashMap.put("tag", "AdvertisingIdClient");
        hashMap.put("time_spent", Long.toString(j2));
        new zza(this, hashMap).start();
        return true;
    }

    public final Info f(int i2) {
        Info info;
        Preconditions.l("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (!this.f24312c) {
                    synchronized (this.f24313d) {
                        zzb zzb = this.f24314e;
                        if (zzb == null || !zzb.C) {
                            throw new IOException("AdvertisingIdClient is not connected.");
                        }
                    }
                    d(false);
                    if (!this.f24312c) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.");
                    }
                }
                Preconditions.m(this.f24310a);
                Preconditions.m(this.f24311b);
                info = new Info(this.f24311b.c(), this.f24311b.v0(true));
            } catch (RemoteException e2) {
                Log.i("AdvertisingIdClient", "GMS remote exception ", e2);
                throw new IOException("Remote exception");
            } catch (Exception e3) {
                throw new IOException("AdvertisingIdClient cannot reconnect.", e3);
            } catch (Throwable th) {
                throw th;
            }
        }
        g();
        return info;
    }

    public final void finalize() {
        c();
        super.finalize();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:2|3|(3:5|6|7)|9|10|(1:12)|13) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0014 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x001c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void g() {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f24313d
            monitor-enter(r0)
            com.google.android.gms.ads.identifier.zzb r1 = r5.f24314e     // Catch:{ all -> 0x0012 }
            if (r1 == 0) goto L_0x0014
            java.util.concurrent.CountDownLatch r1 = r1.f24321B     // Catch:{ all -> 0x0012 }
            r1.countDown()     // Catch:{ all -> 0x0012 }
            com.google.android.gms.ads.identifier.zzb r1 = r5.f24314e     // Catch:{ InterruptedException -> 0x0014 }
            r1.join()     // Catch:{ InterruptedException -> 0x0014 }
            goto L_0x0014
        L_0x0012:
            r1 = move-exception
            goto L_0x0025
        L_0x0014:
            long r1 = r5.f24316g     // Catch:{ all -> 0x0012 }
            r3 = 0
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 <= 0) goto L_0x0023
            com.google.android.gms.ads.identifier.zzb r3 = new com.google.android.gms.ads.identifier.zzb     // Catch:{ all -> 0x0012 }
            r3.<init>(r5, r1)     // Catch:{ all -> 0x0012 }
            r5.f24314e = r3     // Catch:{ all -> 0x0012 }
        L_0x0023:
            monitor-exit(r0)     // Catch:{ all -> 0x0012 }
            return
        L_0x0025:
            monitor-exit(r0)     // Catch:{ all -> 0x0012 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.identifier.AdvertisingIdClient.g():void");
    }
}
