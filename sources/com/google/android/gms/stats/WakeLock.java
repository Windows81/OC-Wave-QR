package com.google.android.gms.stats;

import android.os.PowerManager;
import android.util.Log;
import com.google.android.gms.internal.stats.zzb;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class WakeLock {

    /* renamed from: l  reason: collision with root package name */
    public static final long f27164l = TimeUnit.DAYS.toMillis(366);

    /* renamed from: m  reason: collision with root package name */
    public static volatile ScheduledExecutorService f27165m = null;

    /* renamed from: n  reason: collision with root package name */
    public static final Object f27166n = new Object();

    /* renamed from: o  reason: collision with root package name */
    public static volatile zzd f27167o = new zzb();

    /* renamed from: a  reason: collision with root package name */
    public final Object f27168a;

    /* renamed from: b  reason: collision with root package name */
    public final PowerManager.WakeLock f27169b;

    /* renamed from: c  reason: collision with root package name */
    public int f27170c;

    /* renamed from: d  reason: collision with root package name */
    public Future f27171d;

    /* renamed from: e  reason: collision with root package name */
    public long f27172e;

    /* renamed from: f  reason: collision with root package name */
    public final Set f27173f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f27174g;

    /* renamed from: h  reason: collision with root package name */
    public int f27175h;

    /* renamed from: i  reason: collision with root package name */
    public zzb f27176i;

    /* renamed from: j  reason: collision with root package name */
    public final String f27177j;

    /* renamed from: k  reason: collision with root package name */
    public final Map f27178k;

    public static /* synthetic */ void b(WakeLock wakeLock) {
        synchronized (wakeLock.f27168a) {
            try {
                if (wakeLock.a()) {
                    Log.e("WakeLock", String.valueOf(wakeLock.f27177j).concat(" ** IS FORCE-RELEASED ON TIMEOUT **"));
                    wakeLock.c();
                    if (wakeLock.a()) {
                        wakeLock.f27170c = 1;
                        wakeLock.d(0);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean a() {
        boolean z2;
        synchronized (this.f27168a) {
            z2 = this.f27170c > 0;
        }
        return z2;
    }

    public final void c() {
        if (!this.f27173f.isEmpty()) {
            ArrayList arrayList = new ArrayList(this.f27173f);
            this.f27173f.clear();
            if (arrayList.size() > 0) {
                zze zze = (zze) arrayList.get(0);
                throw null;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00a6, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d(int r6) {
        /*
            r5 = this;
            java.lang.Object r6 = r5.f27168a
            monitor-enter(r6)
            boolean r0 = r5.a()     // Catch:{ all -> 0x000b }
            if (r0 != 0) goto L_0x000e
            monitor-exit(r6)     // Catch:{ all -> 0x000b }
            return
        L_0x000b:
            r0 = move-exception
            goto L_0x00a7
        L_0x000e:
            boolean r0 = r5.f27174g     // Catch:{ all -> 0x000b }
            r1 = 0
            if (r0 == 0) goto L_0x001e
            int r0 = r5.f27170c     // Catch:{ all -> 0x000b }
            int r0 = r0 + -1
            r5.f27170c = r0     // Catch:{ all -> 0x000b }
            if (r0 > 0) goto L_0x001c
            goto L_0x0020
        L_0x001c:
            monitor-exit(r6)     // Catch:{ all -> 0x000b }
            return
        L_0x001e:
            r5.f27170c = r1     // Catch:{ all -> 0x000b }
        L_0x0020:
            r5.c()     // Catch:{ all -> 0x000b }
            java.util.Map r0 = r5.f27178k     // Catch:{ all -> 0x000b }
            java.util.Collection r0 = r0.values()     // Catch:{ all -> 0x000b }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x000b }
        L_0x002d:
            boolean r2 = r0.hasNext()     // Catch:{ all -> 0x000b }
            if (r2 == 0) goto L_0x003c
            java.lang.Object r2 = r0.next()     // Catch:{ all -> 0x000b }
            com.google.android.gms.stats.zzc r2 = (com.google.android.gms.stats.zzc) r2     // Catch:{ all -> 0x000b }
            r2.f27180a = r1     // Catch:{ all -> 0x000b }
            goto L_0x002d
        L_0x003c:
            java.util.Map r0 = r5.f27178k     // Catch:{ all -> 0x000b }
            r0.clear()     // Catch:{ all -> 0x000b }
            java.util.concurrent.Future r0 = r5.f27171d     // Catch:{ all -> 0x000b }
            r2 = 0
            if (r0 == 0) goto L_0x004f
            r0.cancel(r1)     // Catch:{ all -> 0x000b }
            r5.f27171d = r2     // Catch:{ all -> 0x000b }
            r3 = 0
            r5.f27172e = r3     // Catch:{ all -> 0x000b }
        L_0x004f:
            r5.f27175h = r1     // Catch:{ all -> 0x000b }
            android.os.PowerManager$WakeLock r0 = r5.f27169b     // Catch:{ all -> 0x000b }
            boolean r0 = r0.isHeld()     // Catch:{ all -> 0x000b }
            if (r0 == 0) goto L_0x0094
            android.os.PowerManager$WakeLock r0 = r5.f27169b     // Catch:{ RuntimeException -> 0x0067 }
            r0.release()     // Catch:{ RuntimeException -> 0x0067 }
            com.google.android.gms.internal.stats.zzb r0 = r5.f27176i     // Catch:{ all -> 0x000b }
            if (r0 == 0) goto L_0x00a5
            r5.f27176i = r2     // Catch:{ all -> 0x000b }
            goto L_0x00a5
        L_0x0065:
            r0 = move-exception
            goto L_0x008d
        L_0x0067:
            r0 = move-exception
            java.lang.Class r1 = r0.getClass()     // Catch:{ all -> 0x0065 }
            java.lang.Class<java.lang.RuntimeException> r3 = java.lang.RuntimeException.class
            boolean r1 = r1.equals(r3)     // Catch:{ all -> 0x0065 }
            if (r1 == 0) goto L_0x008c
            java.lang.String r1 = "WakeLock"
            java.lang.String r3 = r5.f27177j     // Catch:{ all -> 0x0065 }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x0065 }
            java.lang.String r4 = " failed to release!"
            java.lang.String r3 = r3.concat(r4)     // Catch:{ all -> 0x0065 }
            android.util.Log.e(r1, r3, r0)     // Catch:{ all -> 0x0065 }
            com.google.android.gms.internal.stats.zzb r0 = r5.f27176i     // Catch:{ all -> 0x000b }
            if (r0 == 0) goto L_0x00a5
            r5.f27176i = r2     // Catch:{ all -> 0x000b }
            goto L_0x00a5
        L_0x008c:
            throw r0     // Catch:{ all -> 0x0065 }
        L_0x008d:
            com.google.android.gms.internal.stats.zzb r1 = r5.f27176i     // Catch:{ all -> 0x000b }
            if (r1 == 0) goto L_0x0093
            r5.f27176i = r2     // Catch:{ all -> 0x000b }
        L_0x0093:
            throw r0     // Catch:{ all -> 0x000b }
        L_0x0094:
            java.lang.String r0 = "WakeLock"
            java.lang.String r1 = r5.f27177j     // Catch:{ all -> 0x000b }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x000b }
            java.lang.String r2 = " should be held!"
            java.lang.String r1 = r1.concat(r2)     // Catch:{ all -> 0x000b }
            android.util.Log.e(r0, r1)     // Catch:{ all -> 0x000b }
        L_0x00a5:
            monitor-exit(r6)     // Catch:{ all -> 0x000b }
            return
        L_0x00a7:
            monitor-exit(r6)     // Catch:{ all -> 0x000b }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.stats.WakeLock.d(int):void");
    }
}
