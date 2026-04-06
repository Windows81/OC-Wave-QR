package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.measurement.internal.zzhq;
import com.google.android.gms.measurement.internal.zzjg;
import com.google.android.gms.measurement.internal.zzjj;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutorService;

public class zzdv {

    /* renamed from: j  reason: collision with root package name */
    public static volatile zzdv f25420j;

    /* renamed from: a  reason: collision with root package name */
    public final String f25421a;

    /* renamed from: b  reason: collision with root package name */
    public final Clock f25422b;

    /* renamed from: c  reason: collision with root package name */
    public final ExecutorService f25423c;

    /* renamed from: d  reason: collision with root package name */
    public final AppMeasurementSdk f25424d;

    /* renamed from: e  reason: collision with root package name */
    public final List f25425e;

    /* renamed from: f  reason: collision with root package name */
    public int f25426f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f25427g;

    /* renamed from: h  reason: collision with root package name */
    public String f25428h;

    /* renamed from: i  reason: collision with root package name */
    public volatile zzdk f25429i;

    public static class zza extends zzdp {

        /* renamed from: l  reason: collision with root package name */
        public final zzjg f25430l;

        public final void O1(String str, String str2, Bundle bundle, long j2) {
            this.f25430l.a(str, str2, bundle, j2);
        }

        public final int a() {
            return System.identityHashCode(this.f25430l);
        }
    }

    public abstract class zzb implements Runnable {

        /* renamed from: A  reason: collision with root package name */
        public final long f25431A;

        /* renamed from: B  reason: collision with root package name */
        public final boolean f25432B;

        /* renamed from: z  reason: collision with root package name */
        public final long f25433z;

        public zzb(zzdv zzdv) {
            this(true);
        }

        public abstract void a();

        public void b() {
        }

        public void run() {
            if (zzdv.this.f25427g) {
                b();
                return;
            }
            try {
                a();
            } catch (Exception e2) {
                zzdv.this.r(e2, false, this.f25432B);
                b();
            }
        }

        public zzb(boolean z2) {
            this.f25433z = zzdv.this.f25422b.a();
            this.f25431A = zzdv.this.f25422b.c();
            this.f25432B = z2;
        }
    }

    public class zzc implements Application.ActivityLifecycleCallbacks {
        public zzc() {
        }

        public final void onActivityCreated(Activity activity, Bundle bundle) {
            zzdv.this.m(new zzfg(this, bundle, activity));
        }

        public final void onActivityDestroyed(Activity activity) {
            zzdv.this.m(new zzfl(this, activity));
        }

        public final void onActivityPaused(Activity activity) {
            zzdv.this.m(new zzfh(this, activity));
        }

        public final void onActivityResumed(Activity activity) {
            zzdv.this.m(new zzfi(this, activity));
        }

        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            zzdi zzdi = new zzdi();
            zzdv.this.m(new zzfj(this, activity, zzdi));
            Bundle N = zzdi.N(50);
            if (N != null) {
                bundle.putAll(N);
            }
        }

        public final void onActivityStarted(Activity activity) {
            zzdv.this.m(new zzff(this, activity));
        }

        public final void onActivityStopped(Activity activity) {
            zzdv.this.m(new zzfk(this, activity));
        }
    }

    public static class zzd extends zzdp {

        /* renamed from: l  reason: collision with root package name */
        public final zzjj f25435l;

        public zzd(zzjj zzjj) {
            this.f25435l = zzjj;
        }

        public final void O1(String str, String str2, Bundle bundle, long j2) {
            this.f25435l.a(str, str2, bundle, j2);
        }

        public final int a() {
            return System.identityHashCode(this.f25435l);
        }
    }

    public zzdv(Context context, String str, String str2, String str3, Bundle bundle) {
        if (str == null || !E(str2, str3)) {
            this.f25421a = "FA";
        } else {
            this.f25421a = str;
        }
        this.f25422b = DefaultClock.d();
        boolean z2 = true;
        this.f25423c = zzcz.a().a(new zzeh(this), 1);
        this.f25424d = new AppMeasurementSdk(this);
        this.f25425e = new ArrayList();
        if (!A(context) || K()) {
            if (!E(str2, str3)) {
                this.f25428h = "fa";
                if (str2 == null || str3 == null) {
                    if ((str2 == null) ^ (str3 != null ? false : z2)) {
                        Log.w(this.f25421a, "Specified origin or custom app id is null. Both parameters will be ignored.");
                    }
                } else {
                    Log.v(this.f25421a, "Deferring to Google Analytics for Firebase for event data collection. https://firebase.google.com/docs/analytics");
                }
            } else {
                this.f25428h = str2;
            }
            m(new zzdy(this, str2, str3, context, bundle));
            Application application = (Application) context.getApplicationContext();
            if (application == null) {
                Log.w(this.f25421a, "Unable to register lifecycle notifications. Application null.");
            } else {
                application.registerActivityLifecycleCallbacks(new zzc());
            }
        } else {
            this.f25428h = null;
            this.f25427g = true;
            Log.w(this.f25421a, "Disabling data collection. Found google_app_id in strings.xml but Google Analytics for Firebase is missing. Remove this value or add Google Analytics for Firebase to resume data collection.");
        }
    }

    public static boolean A(Context context) {
        try {
            return new zzhq(context, zzhq.a(context)).b("google_app_id") != null;
        } catch (IllegalStateException unused) {
        }
    }

    public static zzdv e(Context context) {
        return f(context, (String) null, (String) null, (String) null, (Bundle) null);
    }

    public static zzdv f(Context context, String str, String str2, String str3, Bundle bundle) {
        Preconditions.m(context);
        if (f25420j == null) {
            synchronized (zzdv.class) {
                try {
                    if (f25420j == null) {
                        f25420j = new zzdv(context, str, str2, str3, bundle);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f25420j;
    }

    public final Long B() {
        zzdi zzdi = new zzdi();
        m(new zzey(this, zzdi));
        return zzdi.u1(120000);
    }

    public final void C(String str) {
        m(new zzem(this, str));
    }

    public final boolean E(String str, String str2) {
        return (str2 == null || str == null || K()) ? false : true;
    }

    public final String F() {
        zzdi zzdi = new zzdi();
        m(new zzev(this, zzdi));
        return zzdi.W2(120000);
    }

    public final String G() {
        zzdi zzdi = new zzdi();
        m(new zzeo(this, zzdi));
        return zzdi.W2(50);
    }

    public final String H() {
        zzdi zzdi = new zzdi();
        m(new zzep(this, zzdi));
        return zzdi.W2(500);
    }

    public final String I() {
        zzdi zzdi = new zzdi();
        m(new zzeq(this, zzdi));
        return zzdi.W2(500);
    }

    public final String J() {
        zzdi zzdi = new zzdi();
        m(new zzel(this, zzdi));
        return zzdi.W2(500);
    }

    public final boolean K() {
        try {
            Class.forName("com.google.firebase.analytics.FirebaseAnalytics", false, getClass().getClassLoader());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public final int a(String str) {
        zzdi zzdi = new zzdi();
        m(new zzew(this, str, zzdi));
        Integer num = (Integer) zzdi.P(zzdi.N(10000), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    public final long b() {
        zzdi zzdi = new zzdi();
        m(new zzen(this, zzdi));
        Long u1 = zzdi.u1(500);
        if (u1 != null) {
            return u1.longValue();
        }
        long nextLong = new Random(System.nanoTime() ^ this.f25422b.a()).nextLong();
        int i2 = this.f25426f + 1;
        this.f25426f = i2;
        return nextLong + ((long) i2);
    }

    public final zzdk c(Context context, boolean z2) {
        try {
            return zzdj.asInterface(DynamiteModule.e(context, DynamiteModule.f25222e, ModuleDescriptor.MODULE_ID).d("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
        } catch (DynamiteModule.LoadingException e2) {
            r(e2, true, false);
            return null;
        }
    }

    public final List g(String str, String str2) {
        zzdi zzdi = new zzdi();
        m(new zzec(this, str, str2, zzdi));
        List list = (List) zzdi.P(zzdi.N(5000), List.class);
        return list == null ? Collections.emptyList() : list;
    }

    public final Map h(String str, String str2, boolean z2) {
        zzdi zzdi = new zzdi();
        m(new zzes(this, str, str2, z2, zzdi));
        Bundle N = zzdi.N(5000);
        if (N == null || N.size() == 0) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap(N.size());
        for (String next : N.keySet()) {
            Object obj = N.get(next);
            if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                hashMap.put(next, obj);
            }
        }
        return hashMap;
    }

    public final void i(int i2, String str, Object obj, Object obj2, Object obj3) {
        m(new zzer(this, false, 5, str, obj, (Object) null, (Object) null));
    }

    public final void j(Activity activity, String str, String str2) {
        m(new zzee(this, activity, str, str2));
    }

    public final void k(Intent intent) {
        m(new zzfc(this, intent));
    }

    public final void l(Bundle bundle) {
        m(new zzea(this, bundle));
    }

    public final void m(zzb zzb2) {
        this.f25423c.execute(zzb2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003f, code lost:
        if (r4.f25429i == null) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r4.f25429i.registerOnMeasurementEventListener(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0046, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0047, code lost:
        android.util.Log.w(r4.f25421a, "Failed to register event listener on calling thread. Trying again on the dynamite thread.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004e, code lost:
        m(new com.google.android.gms.internal.measurement.zzfb(r4, r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0056, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void q(com.google.android.gms.measurement.internal.zzjj r5) {
        /*
            r4 = this;
            com.google.android.gms.common.internal.Preconditions.m(r5)
            java.util.List r0 = r4.f25425e
            monitor-enter(r0)
            r1 = 0
        L_0x0007:
            java.util.List r2 = r4.f25425e     // Catch:{ all -> 0x0028 }
            int r2 = r2.size()     // Catch:{ all -> 0x0028 }
            if (r1 >= r2) goto L_0x002d
            java.util.List r2 = r4.f25425e     // Catch:{ all -> 0x0028 }
            java.lang.Object r2 = r2.get(r1)     // Catch:{ all -> 0x0028 }
            android.util.Pair r2 = (android.util.Pair) r2     // Catch:{ all -> 0x0028 }
            java.lang.Object r2 = r2.first     // Catch:{ all -> 0x0028 }
            boolean r2 = r5.equals(r2)     // Catch:{ all -> 0x0028 }
            if (r2 == 0) goto L_0x002a
            java.lang.String r5 = r4.f25421a     // Catch:{ all -> 0x0028 }
            java.lang.String r1 = "OnEventListener already registered."
            android.util.Log.w(r5, r1)     // Catch:{ all -> 0x0028 }
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            return
        L_0x0028:
            r5 = move-exception
            goto L_0x0057
        L_0x002a:
            int r1 = r1 + 1
            goto L_0x0007
        L_0x002d:
            com.google.android.gms.internal.measurement.zzdv$zzd r1 = new com.google.android.gms.internal.measurement.zzdv$zzd     // Catch:{ all -> 0x0028 }
            r1.<init>(r5)     // Catch:{ all -> 0x0028 }
            java.util.List r2 = r4.f25425e     // Catch:{ all -> 0x0028 }
            android.util.Pair r3 = new android.util.Pair     // Catch:{ all -> 0x0028 }
            r3.<init>(r5, r1)     // Catch:{ all -> 0x0028 }
            r2.add(r3)     // Catch:{ all -> 0x0028 }
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            com.google.android.gms.internal.measurement.zzdk r5 = r4.f25429i
            if (r5 == 0) goto L_0x004e
            com.google.android.gms.internal.measurement.zzdk r5 = r4.f25429i     // Catch:{ BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException -> 0x0047 }
            r5.registerOnMeasurementEventListener(r1)     // Catch:{ BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException -> 0x0047 }
            return
        L_0x0047:
            java.lang.String r5 = r4.f25421a
            java.lang.String r0 = "Failed to register event listener on calling thread. Trying again on the dynamite thread."
            android.util.Log.w(r5, r0)
        L_0x004e:
            com.google.android.gms.internal.measurement.zzfb r5 = new com.google.android.gms.internal.measurement.zzfb
            r5.<init>(r4, r1)
            r4.m(r5)
            return
        L_0x0057:
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzdv.q(com.google.android.gms.measurement.internal.zzjj):void");
    }

    public final void r(Exception exc, boolean z2, boolean z3) {
        this.f25427g |= z2;
        if (z2) {
            Log.w(this.f25421a, "Data collection startup failed. No data will be collected.", exc);
            return;
        }
        if (z3) {
            i(5, "Error with data collection. Data lost.", exc, (Object) null, (Object) null);
        }
        Log.w(this.f25421a, "Error with data collection. Data lost.", exc);
    }

    public final void s(String str, String str2, Bundle bundle) {
        m(new zzdz(this, str, str2, bundle));
    }

    public final void t(String str, String str2, Bundle bundle, boolean z2, boolean z3, Long l2) {
        m(new zzfd(this, l2, str, str2, bundle, z2, z3));
    }

    public final void u(boolean z2) {
        m(new zzfa(this, z2));
    }

    public final AppMeasurementSdk w() {
        return this.f25424d;
    }

    public final void y(String str) {
        m(new zzej(this, str));
    }

    public final void z(String str, String str2, Bundle bundle) {
        t(str, str2, bundle, true, true, (Long) null);
    }
}
