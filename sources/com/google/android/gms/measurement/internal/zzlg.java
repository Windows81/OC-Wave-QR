package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

public final class zzlg extends zzf {

    /* renamed from: c  reason: collision with root package name */
    public volatile zzlh f26728c;

    /* renamed from: d  reason: collision with root package name */
    public volatile zzlh f26729d;

    /* renamed from: e  reason: collision with root package name */
    public zzlh f26730e;

    /* renamed from: f  reason: collision with root package name */
    public final Map f26731f = new ConcurrentHashMap();

    /* renamed from: g  reason: collision with root package name */
    public Activity f26732g;

    /* renamed from: h  reason: collision with root package name */
    public volatile boolean f26733h;

    /* renamed from: i  reason: collision with root package name */
    public volatile zzlh f26734i;

    /* renamed from: j  reason: collision with root package name */
    public zzlh f26735j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f26736k;

    /* renamed from: l  reason: collision with root package name */
    public final Object f26737l = new Object();

    public zzlg(zzhw zzhw) {
        super(zzhw);
    }

    public static /* synthetic */ void J(zzlg zzlg, Bundle bundle, zzlh zzlh, zzlh zzlh2, long j2) {
        if (bundle != null) {
            bundle.remove("screen_name");
            bundle.remove("screen_class");
        }
        zzlg.N(zzlh, zzlh2, j2, true, zzlg.j().F((String) null, "screen_view", bundle, (List) null, false));
    }

    public final boolean A() {
        return false;
    }

    public final zzlh C(boolean z2) {
        v();
        n();
        if (!z2) {
            return this.f26730e;
        }
        zzlh zzlh = this.f26730e;
        return zzlh != null ? zzlh : this.f26735j;
    }

    public final String D(Class cls, String str) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            return str;
        }
        String[] split = canonicalName.split("\\.");
        String str2 = split.length > 0 ? split[split.length - 1] : "";
        return str2.length() > d().r((String) null, false) ? str2.substring(0, d().r((String) null, false)) : str2;
    }

    public final void E(Activity activity) {
        synchronized (this.f26737l) {
            try {
                if (activity == this.f26732g) {
                    this.f26732g = null;
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        if (d().Z()) {
            this.f26731f.remove(activity);
        }
    }

    public final void F(Activity activity, Bundle bundle) {
        Bundle bundle2;
        if (d().Z() && bundle != null && (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) != null) {
            this.f26731f.put(activity, new zzlh(bundle2.getString("name"), bundle2.getString("referrer_name"), bundle2.getLong("id")));
        }
    }

    public final void G(Activity activity, zzlh zzlh, boolean z2) {
        zzlh zzlh2;
        zzlh zzlh3 = zzlh;
        zzlh zzlh4 = this.f26728c == null ? this.f26729d : this.f26728c;
        if (zzlh3.f26739b == null) {
            zzlh2 = new zzlh(zzlh3.f26738a, activity != null ? D(activity.getClass(), "Activity") : null, zzlh3.f26740c, zzlh3.f26742e, zzlh3.f26743f);
        } else {
            zzlh2 = zzlh3;
        }
        this.f26729d = this.f26728c;
        this.f26728c = zzlh2;
        f().D(new zzli(this, zzlh2, zzlh4, b().c(), z2));
    }

    public final void H(Activity activity, String str, String str2) {
        if (!d().Z()) {
            m().M().a("setCurrentScreen cannot be called while screen reporting is disabled.");
            return;
        }
        zzlh zzlh = this.f26728c;
        if (zzlh == null) {
            m().M().a("setCurrentScreen cannot be called while no activity active");
        } else if (this.f26731f.get(activity) == null) {
            m().M().a("setCurrentScreen must be called with an activity in the activity lifecycle");
        } else {
            if (str2 == null) {
                str2 = D(activity.getClass(), "Activity");
            }
            boolean equals = Objects.equals(zzlh.f26739b, str2);
            boolean equals2 = Objects.equals(zzlh.f26738a, str);
            if (equals && equals2) {
                m().M().a("setCurrentScreen cannot be called with the same class and name");
            } else if (str != null && (str.length() <= 0 || str.length() > d().r((String) null, false))) {
                m().M().b("Invalid screen name length in setCurrentScreen. Length", Integer.valueOf(str.length()));
            } else if (str2 == null || (str2.length() > 0 && str2.length() <= d().r((String) null, false))) {
                m().K().c("Setting current screen to name, class", str == null ? "null" : str, str2);
                zzlh zzlh2 = new zzlh(str, str2, j().R0());
                this.f26731f.put(activity, zzlh2);
                G(activity, zzlh2, true);
            } else {
                m().M().b("Invalid class name length in setCurrentScreen. Length", Integer.valueOf(str2.length()));
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00c9, code lost:
        r1 = m().K();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00d3, code lost:
        if (r10 != null) goto L_0x00d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00d5, code lost:
        r3 = "null";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00d8, code lost:
        r3 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00d9, code lost:
        if (r11 != null) goto L_0x00de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00db, code lost:
        r4 = "null";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00de, code lost:
        r4 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00df, code lost:
        r1.c("Logging screen view with name, class", r3, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00e4, code lost:
        if (r8.f26728c != null) goto L_0x00ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00e6, code lost:
        r1 = r8.f26729d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00e8, code lost:
        r5 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00ea, code lost:
        r1 = r8.f26728c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00ed, code lost:
        r9 = new com.google.android.gms.measurement.internal.zzlh(r10, r11, j().R0(), true, r19);
        r8.f26728c = r9;
        r8.f26729d = r5;
        r8.f26734i = r9;
        f().D(new com.google.android.gms.measurement.internal.zzlj(r17, r18, r9, r5, b().c()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x011d, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void I(android.os.Bundle r18, long r19) {
        /*
            r17 = this;
            r8 = r17
            r0 = r18
            java.lang.Object r1 = r8.f26737l
            monitor-enter(r1)
            boolean r2 = r8.f26736k     // Catch:{ all -> 0x001a }
            if (r2 != 0) goto L_0x001d
            com.google.android.gms.measurement.internal.zzgi r0 = r17.m()     // Catch:{ all -> 0x001a }
            com.google.android.gms.measurement.internal.zzgk r0 = r0.M()     // Catch:{ all -> 0x001a }
            java.lang.String r2 = "Cannot log screen view event when the app is in the background."
            r0.a(r2)     // Catch:{ all -> 0x001a }
            monitor-exit(r1)     // Catch:{ all -> 0x001a }
            return
        L_0x001a:
            r0 = move-exception
            goto L_0x011e
        L_0x001d:
            r2 = 0
            r3 = 0
            if (r0 == 0) goto L_0x008a
            java.lang.String r4 = "screen_name"
            java.lang.String r4 = r0.getString(r4)     // Catch:{ all -> 0x001a }
            if (r4 == 0) goto L_0x0054
            int r5 = r4.length()     // Catch:{ all -> 0x001a }
            if (r5 <= 0) goto L_0x003d
            int r5 = r4.length()     // Catch:{ all -> 0x001a }
            com.google.android.gms.measurement.internal.zzah r6 = r17.d()     // Catch:{ all -> 0x001a }
            int r6 = r6.r(r3, r2)     // Catch:{ all -> 0x001a }
            if (r5 <= r6) goto L_0x0054
        L_0x003d:
            com.google.android.gms.measurement.internal.zzgi r0 = r17.m()     // Catch:{ all -> 0x001a }
            com.google.android.gms.measurement.internal.zzgk r0 = r0.M()     // Catch:{ all -> 0x001a }
            java.lang.String r2 = "Invalid screen name length for screen view. Length"
            int r3 = r4.length()     // Catch:{ all -> 0x001a }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x001a }
            r0.b(r2, r3)     // Catch:{ all -> 0x001a }
            monitor-exit(r1)     // Catch:{ all -> 0x001a }
            return
        L_0x0054:
            java.lang.String r5 = "screen_class"
            java.lang.String r5 = r0.getString(r5)     // Catch:{ all -> 0x001a }
            if (r5 == 0) goto L_0x0087
            int r6 = r5.length()     // Catch:{ all -> 0x001a }
            if (r6 <= 0) goto L_0x0070
            int r6 = r5.length()     // Catch:{ all -> 0x001a }
            com.google.android.gms.measurement.internal.zzah r7 = r17.d()     // Catch:{ all -> 0x001a }
            int r3 = r7.r(r3, r2)     // Catch:{ all -> 0x001a }
            if (r6 <= r3) goto L_0x0087
        L_0x0070:
            com.google.android.gms.measurement.internal.zzgi r0 = r17.m()     // Catch:{ all -> 0x001a }
            com.google.android.gms.measurement.internal.zzgk r0 = r0.M()     // Catch:{ all -> 0x001a }
            java.lang.String r2 = "Invalid screen class length for screen view. Length"
            int r3 = r5.length()     // Catch:{ all -> 0x001a }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x001a }
            r0.b(r2, r3)     // Catch:{ all -> 0x001a }
            monitor-exit(r1)     // Catch:{ all -> 0x001a }
            return
        L_0x0087:
            r10 = r4
            r3 = r5
            goto L_0x008b
        L_0x008a:
            r10 = r3
        L_0x008b:
            if (r3 != 0) goto L_0x009e
            android.app.Activity r3 = r8.f26732g     // Catch:{ all -> 0x001a }
            if (r3 == 0) goto L_0x009c
            java.lang.Class r3 = r3.getClass()     // Catch:{ all -> 0x001a }
            java.lang.String r4 = "Activity"
            java.lang.String r3 = r8.D(r3, r4)     // Catch:{ all -> 0x001a }
            goto L_0x009e
        L_0x009c:
            java.lang.String r3 = "Activity"
        L_0x009e:
            r11 = r3
            com.google.android.gms.measurement.internal.zzlh r3 = r8.f26728c     // Catch:{ all -> 0x001a }
            boolean r4 = r8.f26733h     // Catch:{ all -> 0x001a }
            if (r4 == 0) goto L_0x00c8
            if (r3 == 0) goto L_0x00c8
            r8.f26733h = r2     // Catch:{ all -> 0x001a }
            java.lang.String r2 = r3.f26739b     // Catch:{ all -> 0x001a }
            boolean r2 = java.util.Objects.equals(r2, r11)     // Catch:{ all -> 0x001a }
            java.lang.String r3 = r3.f26738a     // Catch:{ all -> 0x001a }
            boolean r3 = java.util.Objects.equals(r3, r10)     // Catch:{ all -> 0x001a }
            if (r2 == 0) goto L_0x00c8
            if (r3 == 0) goto L_0x00c8
            com.google.android.gms.measurement.internal.zzgi r0 = r17.m()     // Catch:{ all -> 0x001a }
            com.google.android.gms.measurement.internal.zzgk r0 = r0.M()     // Catch:{ all -> 0x001a }
            java.lang.String r2 = "Ignoring call to log screen view event with duplicate parameters."
            r0.a(r2)     // Catch:{ all -> 0x001a }
            monitor-exit(r1)     // Catch:{ all -> 0x001a }
            return
        L_0x00c8:
            monitor-exit(r1)     // Catch:{ all -> 0x001a }
            com.google.android.gms.measurement.internal.zzgi r1 = r17.m()
            com.google.android.gms.measurement.internal.zzgk r1 = r1.K()
            java.lang.String r2 = "Logging screen view with name, class"
            if (r10 != 0) goto L_0x00d8
            java.lang.String r3 = "null"
            goto L_0x00d9
        L_0x00d8:
            r3 = r10
        L_0x00d9:
            if (r11 != 0) goto L_0x00de
            java.lang.String r4 = "null"
            goto L_0x00df
        L_0x00de:
            r4 = r11
        L_0x00df:
            r1.c(r2, r3, r4)
            com.google.android.gms.measurement.internal.zzlh r1 = r8.f26728c
            if (r1 != 0) goto L_0x00ea
            com.google.android.gms.measurement.internal.zzlh r1 = r8.f26729d
        L_0x00e8:
            r5 = r1
            goto L_0x00ed
        L_0x00ea:
            com.google.android.gms.measurement.internal.zzlh r1 = r8.f26728c
            goto L_0x00e8
        L_0x00ed:
            com.google.android.gms.measurement.internal.zzlh r4 = new com.google.android.gms.measurement.internal.zzlh
            com.google.android.gms.measurement.internal.zzop r1 = r17.j()
            long r12 = r1.R0()
            r14 = 1
            r9 = r4
            r15 = r19
            r9.<init>(r10, r11, r12, r14, r15)
            r8.f26728c = r4
            r8.f26729d = r5
            r8.f26734i = r4
            com.google.android.gms.common.util.Clock r1 = r17.b()
            long r6 = r1.c()
            com.google.android.gms.measurement.internal.zzhp r9 = r17.f()
            com.google.android.gms.measurement.internal.zzlj r10 = new com.google.android.gms.measurement.internal.zzlj
            r1 = r10
            r2 = r17
            r3 = r18
            r1.<init>(r2, r3, r4, r5, r6)
            r9.D(r10)
            return
        L_0x011e:
            monitor-exit(r1)     // Catch:{ all -> 0x001a }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzlg.I(android.os.Bundle, long):void");
    }

    public final void N(zzlh zzlh, zzlh zzlh2, long j2, boolean z2, Bundle bundle) {
        Bundle bundle2;
        long j3;
        zzlh zzlh3 = zzlh;
        zzlh zzlh4 = zzlh2;
        long j4 = j2;
        Bundle bundle3 = bundle;
        n();
        boolean z3 = false;
        boolean z4 = zzlh4 == null || zzlh4.f26740c != zzlh3.f26740c || !Objects.equals(zzlh4.f26739b, zzlh3.f26739b) || !Objects.equals(zzlh4.f26738a, zzlh3.f26738a);
        if (z2 && this.f26730e != null) {
            z3 = true;
        }
        if (z4) {
            if (bundle3 == null) {
                bundle2 = new Bundle();
            }
            Bundle bundle4 = bundle2;
            zzop.X(zzlh3, bundle4, true);
            if (zzlh4 != null) {
                String str = zzlh4.f26738a;
                if (str != null) {
                    bundle4.putString("_pn", str);
                }
                String str2 = zzlh4.f26739b;
                if (str2 != null) {
                    bundle4.putString("_pc", str2);
                }
                bundle4.putLong("_pi", zzlh4.f26740c);
            }
            if (z3) {
                long a2 = u().f26862f.a(j4);
                if (a2 > 0) {
                    j().M(bundle4, a2);
                }
            }
            if (!d().Z()) {
                bundle4.putLong("_mst", 1);
            }
            String str3 = zzlh3.f26742e ? "app" : "auto";
            long a3 = b().a();
            if (zzlh3.f26742e) {
                long j5 = zzlh3.f26743f;
                if (j5 != 0) {
                    j3 = j5;
                    r().e0(str3, "_vs", j3, bundle4);
                }
            }
            j3 = a3;
            r().e0(str3, "_vs", j3, bundle4);
        }
        if (z3) {
            O(this.f26730e, true, j4);
        }
        this.f26730e = zzlh3;
        if (zzlh3.f26742e) {
            this.f26735j = zzlh3;
        }
        t().L(zzlh3);
    }

    public final void O(zzlh zzlh, boolean z2, long j2) {
        o().v(b().c());
        if (u().E(zzlh != null && zzlh.f26741d, z2, j2) && zzlh != null) {
            zzlh.f26741d = false;
        }
    }

    public final zzlh P() {
        return this.f26728c;
    }

    public final void Q(Activity activity) {
        synchronized (this.f26737l) {
            this.f26736k = false;
            this.f26733h = true;
        }
        long c2 = b().c();
        if (!d().Z()) {
            this.f26728c = null;
            f().D(new zzlk(this, c2));
            return;
        }
        zzlh T = T(activity);
        this.f26729d = this.f26728c;
        this.f26728c = null;
        f().D(new zzln(this, T, c2));
    }

    public final void R(Activity activity, Bundle bundle) {
        zzlh zzlh;
        if (d().Z() && bundle != null && (zzlh = (zzlh) this.f26731f.get(activity)) != null) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("id", zzlh.f26740c);
            bundle2.putString("name", zzlh.f26738a);
            bundle2.putString("referrer_name", zzlh.f26739b);
            bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
        }
    }

    public final void S(Activity activity) {
        synchronized (this.f26737l) {
            this.f26736k = true;
            if (activity != this.f26732g) {
                synchronized (this.f26737l) {
                    this.f26732g = activity;
                    this.f26733h = false;
                }
                if (d().Z()) {
                    this.f26734i = null;
                    f().D(new zzlm(this));
                }
            }
        }
        if (!d().Z()) {
            this.f26728c = this.f26734i;
            f().D(new zzll(this));
            return;
        }
        G(activity, T(activity), false);
        zza o2 = o();
        o2.f().D(new zze(o2, o2.b().c()));
    }

    public final zzlh T(Activity activity) {
        Preconditions.m(activity);
        zzlh zzlh = (zzlh) this.f26731f.get(activity);
        if (zzlh == null) {
            zzlh zzlh2 = new zzlh((String) null, D(activity.getClass(), "Activity"), j().R0());
            this.f26731f.put(activity, zzlh2);
            zzlh = zzlh2;
        }
        return this.f26734i != null ? this.f26734i : zzlh;
    }

    public final /* bridge */ /* synthetic */ Context a() {
        return super.a();
    }

    public final /* bridge */ /* synthetic */ Clock b() {
        return super.b();
    }

    public final /* bridge */ /* synthetic */ zzah d() {
        return super.d();
    }

    public final /* bridge */ /* synthetic */ zzac e() {
        return super.e();
    }

    public final /* bridge */ /* synthetic */ zzhp f() {
        return super.f();
    }

    public final /* bridge */ /* synthetic */ zzbb g() {
        return super.g();
    }

    public final /* bridge */ /* synthetic */ zzgh h() {
        return super.h();
    }

    public final /* bridge */ /* synthetic */ zzgu i() {
        return super.i();
    }

    public final /* bridge */ /* synthetic */ zzop j() {
        return super.j();
    }

    public final /* bridge */ /* synthetic */ void k() {
        super.k();
    }

    public final /* bridge */ /* synthetic */ void l() {
        super.l();
    }

    public final /* bridge */ /* synthetic */ zzgi m() {
        return super.m();
    }

    public final /* bridge */ /* synthetic */ void n() {
        super.n();
    }

    public final /* bridge */ /* synthetic */ zza o() {
        return super.o();
    }

    public final /* bridge */ /* synthetic */ zzgc p() {
        return super.p();
    }

    public final /* bridge */ /* synthetic */ zzgf q() {
        return super.q();
    }

    public final /* bridge */ /* synthetic */ zzjk r() {
        return super.r();
    }

    public final /* bridge */ /* synthetic */ zzlg s() {
        return super.s();
    }

    public final /* bridge */ /* synthetic */ zzlp t() {
        return super.t();
    }

    public final /* bridge */ /* synthetic */ zznb u() {
        return super.u();
    }
}
