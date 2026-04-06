package com.google.android.gms.measurement.internal;

import android.content.Context;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.measurement.zzrx;
import com.google.android.gms.measurement.internal.zzjc;
import java.math.BigInteger;
import java.util.List;
import java.util.Locale;

public final class zzgc extends zzf {

    /* renamed from: c  reason: collision with root package name */
    public String f26300c;

    /* renamed from: d  reason: collision with root package name */
    public String f26301d;

    /* renamed from: e  reason: collision with root package name */
    public int f26302e;

    /* renamed from: f  reason: collision with root package name */
    public String f26303f;

    /* renamed from: g  reason: collision with root package name */
    public long f26304g;

    /* renamed from: h  reason: collision with root package name */
    public long f26305h;

    /* renamed from: i  reason: collision with root package name */
    public List f26306i;

    /* renamed from: j  reason: collision with root package name */
    public String f26307j;

    /* renamed from: k  reason: collision with root package name */
    public int f26308k;

    /* renamed from: l  reason: collision with root package name */
    public String f26309l;

    /* renamed from: m  reason: collision with root package name */
    public String f26310m;

    /* renamed from: n  reason: collision with root package name */
    public String f26311n;

    /* renamed from: o  reason: collision with root package name */
    public long f26312o = 0;

    /* renamed from: p  reason: collision with root package name */
    public String f26313p = null;

    public zzgc(zzhw zzhw, long j2) {
        super(zzhw);
        this.f26305h = j2;
    }

    private final String J() {
        if (!zzrx.a() || !d().t(zzbj.r0)) {
            try {
                Class<?> loadClass = a().getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
                if (loadClass == null) {
                    return null;
                }
                try {
                    Object invoke = loadClass.getDeclaredMethod("getInstance", new Class[]{Context.class}).invoke((Object) null, new Object[]{a()});
                    if (invoke == null) {
                        return null;
                    }
                    try {
                        return (String) loadClass.getDeclaredMethod("getFirebaseInstanceId", (Class[]) null).invoke(invoke, (Object[]) null);
                    } catch (Exception unused) {
                        m().M().a("Failed to retrieve Firebase Instance Id");
                        return null;
                    }
                } catch (Exception unused2) {
                    m().N().a("Failed to obtain Firebase Analytics instance");
                    return null;
                }
            } catch (ClassNotFoundException unused3) {
                return null;
            }
        } else {
            m().K().a("Disabled IID for tests.");
            return null;
        }
    }

    public final boolean A() {
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x0166  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0169  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x01a5  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x01af  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x01c3  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x01ce  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x01ea  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01ff  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.zzp B(java.lang.String r49) {
        /*
            r48 = this;
            r0 = r48
            r48.n()
            com.google.android.gms.measurement.internal.zzp r42 = new com.google.android.gms.measurement.internal.zzp
            java.lang.String r2 = r48.F()
            java.lang.String r3 = r48.G()
            r48.v()
            java.lang.String r4 = r0.f26301d
            int r1 = r48.D()
            long r5 = (long) r1
            r48.v()
            java.lang.String r1 = r0.f26303f
            com.google.android.gms.common.internal.Preconditions.m(r1)
            java.lang.String r7 = r0.f26303f
            r48.v()
            r48.n()
            long r8 = r0.f26304g
            r10 = 0
            int r1 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r1 != 0) goto L_0x0049
            com.google.android.gms.measurement.internal.zzhw r1 = r0.f26587a
            com.google.android.gms.measurement.internal.zzop r1 = r1.L()
            android.content.Context r8 = r48.a()
            android.content.Context r9 = r48.a()
            java.lang.String r9 = r9.getPackageName()
            long r8 = r1.z(r8, r9)
            r0.f26304g = r8
        L_0x0049:
            long r12 = r0.f26304g
            com.google.android.gms.measurement.internal.zzhw r1 = r0.f26587a
            boolean r14 = r1.p()
            com.google.android.gms.measurement.internal.zzgu r1 = r48.i()
            boolean r1 = r1.f26373t
            r8 = 1
            r15 = r1 ^ 1
            r48.n()
            com.google.android.gms.measurement.internal.zzhw r1 = r0.f26587a
            boolean r1 = r1.p()
            if (r1 != 0) goto L_0x0068
            r18 = 0
            goto L_0x006e
        L_0x0068:
            java.lang.String r1 = r48.J()
            r18 = r1
        L_0x006e:
            com.google.android.gms.measurement.internal.zzhw r1 = r0.f26587a
            com.google.android.gms.measurement.internal.zzgu r9 = r1.F()
            com.google.android.gms.measurement.internal.zzgz r9 = r9.f26360g
            long r8 = r9.a()
            int r19 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r19 != 0) goto L_0x0083
            long r8 = r1.H
        L_0x0080:
            r21 = r8
            goto L_0x008a
        L_0x0083:
            long r10 = r1.H
            long r8 = java.lang.Math.min(r10, r8)
            goto L_0x0080
        L_0x008a:
            int r23 = r48.C()
            com.google.android.gms.measurement.internal.zzah r1 = r48.d()
            boolean r24 = r1.Y()
            com.google.android.gms.measurement.internal.zzgu r1 = r48.i()
            r1.n()
            android.content.SharedPreferences r1 = r1.J()
            java.lang.String r8 = "deferred_analytics_collection"
            r9 = 0
            boolean r25 = r1.getBoolean(r8, r9)
            java.lang.String r26 = r48.E()
            com.google.android.gms.measurement.internal.zzah r1 = r48.d()
            java.lang.String r8 = "google_analytics_default_allow_ad_personalization_signals"
            java.lang.Boolean r1 = r1.G(r8)
            if (r1 != 0) goto L_0x00bb
            r27 = 0
            goto L_0x00c7
        L_0x00bb:
            boolean r1 = r1.booleanValue()
            r10 = 1
            r1 = r1 ^ r10
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r27 = r1
        L_0x00c7:
            long r10 = r0.f26305h
            java.util.List r1 = r0.f26306i
            com.google.android.gms.measurement.internal.zzgu r28 = r48.i()
            com.google.android.gms.measurement.internal.zzjc r28 = r28.M()
            java.lang.String r29 = r28.z()
            java.lang.String r9 = r0.f26307j
            if (r9 != 0) goto L_0x00e5
            com.google.android.gms.measurement.internal.zzop r9 = r48.j()
            java.lang.String r9 = r9.U0()
            r0.f26307j = r9
        L_0x00e5:
            java.lang.String r9 = r0.f26307j
            boolean r30 = com.google.android.gms.internal.measurement.zzpd.a()
            if (r30 == 0) goto L_0x0118
            r30 = r1
            com.google.android.gms.measurement.internal.zzah r1 = r48.d()
            r31 = r9
            com.google.android.gms.measurement.internal.zzfz r9 = com.google.android.gms.measurement.internal.zzbj.c1
            boolean r1 = r1.t(r9)
            if (r1 == 0) goto L_0x011c
            com.google.android.gms.measurement.internal.zzgu r1 = r48.i()
            com.google.android.gms.measurement.internal.zzjc r1 = r1.M()
            com.google.android.gms.measurement.internal.zzjc$zza r9 = com.google.android.gms.measurement.internal.zzjc.zza.ANALYTICS_STORAGE
            boolean r1 = r1.m(r9)
            if (r1 != 0) goto L_0x011c
            r32 = r10
            r34 = r14
            r35 = r15
            r19 = 0
            r36 = 0
            goto L_0x015a
        L_0x0118:
            r30 = r1
            r31 = r9
        L_0x011c:
            r48.n()
            r32 = r10
            long r9 = r0.f26312o
            r19 = 0
            int r1 = (r9 > r19 ? 1 : (r9 == r19 ? 0 : -1))
            if (r1 == 0) goto L_0x014b
            com.google.android.gms.common.util.Clock r1 = r48.b()
            long r9 = r1.a()
            r34 = r14
            r35 = r15
            long r14 = r0.f26312o
            long r9 = r9 - r14
            java.lang.String r1 = r0.f26311n
            if (r1 == 0) goto L_0x014f
            r14 = 86400000(0x5265c00, double:4.2687272E-316)
            int r1 = (r9 > r14 ? 1 : (r9 == r14 ? 0 : -1))
            if (r1 <= 0) goto L_0x014f
            java.lang.String r1 = r0.f26313p
            if (r1 != 0) goto L_0x014f
            r48.I()
            goto L_0x014f
        L_0x014b:
            r34 = r14
            r35 = r15
        L_0x014f:
            java.lang.String r1 = r0.f26311n
            if (r1 != 0) goto L_0x0156
            r48.I()
        L_0x0156:
            java.lang.String r1 = r0.f26311n
            r36 = r1
        L_0x015a:
            com.google.android.gms.measurement.internal.zzah r1 = r48.d()
            java.lang.String r9 = "google_analytics_sgtm_upload_enabled"
            java.lang.Boolean r1 = r1.G(r9)
            if (r1 != 0) goto L_0x0169
            r37 = 0
            goto L_0x016f
        L_0x0169:
            boolean r1 = r1.booleanValue()
            r37 = r1
        L_0x016f:
            com.google.android.gms.measurement.internal.zzop r1 = r48.j()
            java.lang.String r9 = r48.F()
            long r38 = r1.z0(r9)
            com.google.android.gms.measurement.internal.zzgu r1 = r48.i()
            com.google.android.gms.measurement.internal.zzjc r1 = r1.M()
            int r40 = r1.b()
            com.google.android.gms.measurement.internal.zzgu r1 = r48.i()
            com.google.android.gms.measurement.internal.zzaz r1 = r1.L()
            java.lang.String r41 = r1.j()
            boolean r1 = com.google.android.gms.internal.measurement.zzrl.a()
            if (r1 == 0) goto L_0x01af
            com.google.android.gms.measurement.internal.zzah r1 = r48.d()
            com.google.android.gms.measurement.internal.zzfz r9 = com.google.android.gms.measurement.internal.zzbj.I0
            boolean r1 = r1.t(r9)
            if (r1 == 0) goto L_0x01af
            r48.j()
            int r1 = com.google.android.gms.measurement.internal.zzop.y0()
            r43 = r1
            goto L_0x01b1
        L_0x01af:
            r43 = 0
        L_0x01b1:
            boolean r1 = com.google.android.gms.internal.measurement.zzrl.a()
            if (r1 == 0) goto L_0x01ce
            com.google.android.gms.measurement.internal.zzah r1 = r48.d()
            com.google.android.gms.measurement.internal.zzfz r9 = com.google.android.gms.measurement.internal.zzbj.I0
            boolean r1 = r1.t(r9)
            if (r1 == 0) goto L_0x01ce
            com.google.android.gms.measurement.internal.zzop r1 = r48.j()
            long r9 = r1.K0()
            r44 = r9
            goto L_0x01d0
        L_0x01ce:
            r44 = r19
        L_0x01d0:
            com.google.android.gms.measurement.internal.zzah r1 = r48.d()
            java.lang.String r46 = r1.X()
            boolean r1 = com.google.android.gms.internal.measurement.zzox.a()
            if (r1 == 0) goto L_0x01ff
            com.google.android.gms.measurement.internal.zzah r1 = r48.d()
            com.google.android.gms.measurement.internal.zzfz r9 = com.google.android.gms.measurement.internal.zzbj.Y0
            boolean r1 = r1.t(r9)
            if (r1 == 0) goto L_0x01ff
            com.google.android.gms.measurement.internal.zzah r1 = r48.d()
            r9 = 1
            com.google.android.gms.measurement.internal.zzjb r1 = r1.D(r8, r9)
            com.google.android.gms.measurement.internal.zzd r8 = new com.google.android.gms.measurement.internal.zzd
            r8.<init>(r1)
            java.lang.String r1 = r8.c()
        L_0x01fc:
            r47 = r1
            goto L_0x0202
        L_0x01ff:
            java.lang.String r1 = ""
            goto L_0x01fc
        L_0x0202:
            r8 = 102001(0x18e71, double:5.0395E-319)
            r16 = 0
            r28 = 0
            r1 = r42
            r10 = r12
            r12 = r49
            r13 = r34
            r14 = r35
            r15 = r18
            r18 = r21
            r20 = r23
            r21 = r24
            r22 = r25
            r23 = r26
            r24 = r27
            r25 = r32
            r27 = r30
            r30 = r31
            r31 = r36
            r32 = r37
            r33 = r38
            r35 = r40
            r36 = r41
            r37 = r43
            r38 = r44
            r40 = r46
            r41 = r47
            r1.<init>((java.lang.String) r2, (java.lang.String) r3, (java.lang.String) r4, (long) r5, (java.lang.String) r7, (long) r8, (long) r10, (java.lang.String) r12, (boolean) r13, (boolean) r14, (java.lang.String) r15, (long) r16, (long) r18, (int) r20, (boolean) r21, (boolean) r22, (java.lang.String) r23, (java.lang.Boolean) r24, (long) r25, (java.util.List) r27, (java.lang.String) r28, (java.lang.String) r29, (java.lang.String) r30, (java.lang.String) r31, (boolean) r32, (long) r33, (int) r35, (java.lang.String) r36, (int) r37, (long) r38, (java.lang.String) r40, (java.lang.String) r41)
            return r42
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzgc.B(java.lang.String):com.google.android.gms.measurement.internal.zzp");
    }

    public final int C() {
        v();
        return this.f26308k;
    }

    public final int D() {
        v();
        return this.f26302e;
    }

    public final String E() {
        v();
        return this.f26310m;
    }

    public final String F() {
        v();
        Preconditions.m(this.f26300c);
        return this.f26300c;
    }

    public final String G() {
        n();
        v();
        Preconditions.m(this.f26309l);
        return this.f26309l;
    }

    public final List H() {
        return this.f26306i;
    }

    public final void I() {
        String str;
        n();
        if (!i().M().m(zzjc.zza.ANALYTICS_STORAGE)) {
            m().F().a("Analytics Storage consent is not granted");
            str = null;
        } else {
            byte[] bArr = new byte[16];
            j().W0().nextBytes(bArr);
            str = String.format(Locale.US, "%032x", new Object[]{new BigInteger(1, bArr)});
        }
        m().F().a(String.format("Resetting session stitching token to %s", new Object[]{str == null ? "null" : "not null"}));
        this.f26311n = str;
        this.f26312o = b().a();
    }

    public final boolean K(String str) {
        String str2 = this.f26313p;
        boolean z2 = str2 != null && !str2.equals(str);
        this.f26313p = str;
        return z2;
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

    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x014c  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x015c  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0163  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0186 A[Catch:{ IllegalStateException -> 0x01a8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0187 A[Catch:{ IllegalStateException -> 0x01a8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0190 A[Catch:{ IllegalStateException -> 0x01a8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x01ac A[Catch:{ IllegalStateException -> 0x01a8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01e9  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x021e  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0229  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void y() {
        /*
            r11 = this;
            android.content.Context r0 = r11.a()
            java.lang.String r0 = r0.getPackageName()
            android.content.Context r1 = r11.a()
            android.content.pm.PackageManager r1 = r1.getPackageManager()
            r2 = 0
            java.lang.String r3 = ""
            java.lang.String r4 = "unknown"
            java.lang.String r5 = "Unknown"
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 != 0) goto L_0x002d
            com.google.android.gms.measurement.internal.zzgi r7 = r11.m()
            com.google.android.gms.measurement.internal.zzgk r7 = r7.G()
            java.lang.String r8 = "PackageManager is null, app identity information might be inaccurate. appId"
            java.lang.Object r9 = com.google.android.gms.measurement.internal.zzgi.v(r0)
            r7.b(r8, r9)
            goto L_0x008c
        L_0x002d:
            java.lang.String r4 = r1.getInstallerPackageName(r0)     // Catch:{ IllegalArgumentException -> 0x0032 }
            goto L_0x0043
        L_0x0032:
            com.google.android.gms.measurement.internal.zzgi r7 = r11.m()
            com.google.android.gms.measurement.internal.zzgk r7 = r7.G()
            java.lang.String r8 = "Error retrieving app installer package name. appId"
            java.lang.Object r9 = com.google.android.gms.measurement.internal.zzgi.v(r0)
            r7.b(r8, r9)
        L_0x0043:
            if (r4 != 0) goto L_0x0048
            java.lang.String r4 = "manual_install"
            goto L_0x0051
        L_0x0048:
            java.lang.String r7 = "com.android.vending"
            boolean r7 = r7.equals(r4)
            if (r7 == 0) goto L_0x0051
            r4 = r3
        L_0x0051:
            android.content.Context r7 = r11.a()     // Catch:{ NameNotFoundException -> 0x0079 }
            java.lang.String r7 = r7.getPackageName()     // Catch:{ NameNotFoundException -> 0x0079 }
            android.content.pm.PackageInfo r7 = r1.getPackageInfo(r7, r2)     // Catch:{ NameNotFoundException -> 0x0079 }
            if (r7 == 0) goto L_0x008c
            android.content.pm.ApplicationInfo r8 = r7.applicationInfo     // Catch:{ NameNotFoundException -> 0x0079 }
            java.lang.CharSequence r8 = r1.getApplicationLabel(r8)     // Catch:{ NameNotFoundException -> 0x0079 }
            boolean r9 = android.text.TextUtils.isEmpty(r8)     // Catch:{ NameNotFoundException -> 0x0079 }
            if (r9 != 0) goto L_0x0070
            java.lang.String r8 = r8.toString()     // Catch:{ NameNotFoundException -> 0x0079 }
            goto L_0x0071
        L_0x0070:
            r8 = r5
        L_0x0071:
            java.lang.String r5 = r7.versionName     // Catch:{ NameNotFoundException -> 0x0076 }
            int r6 = r7.versionCode     // Catch:{ NameNotFoundException -> 0x0076 }
            goto L_0x008c
        L_0x0076:
            r7 = r5
            r5 = r8
            goto L_0x007a
        L_0x0079:
            r7 = r5
        L_0x007a:
            com.google.android.gms.measurement.internal.zzgi r8 = r11.m()
            com.google.android.gms.measurement.internal.zzgk r8 = r8.G()
            java.lang.String r9 = "Error retrieving package info. appId, appName"
            java.lang.Object r10 = com.google.android.gms.measurement.internal.zzgi.v(r0)
            r8.c(r9, r10, r5)
            r5 = r7
        L_0x008c:
            r11.f26300c = r0
            r11.f26303f = r4
            r11.f26301d = r5
            r11.f26302e = r6
            r4 = 0
            r11.f26304g = r4
            com.google.android.gms.measurement.internal.zzhw r4 = r11.f26587a
            java.lang.String r4 = r4.M()
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            r5 = 1
            if (r4 != 0) goto L_0x00b5
            com.google.android.gms.measurement.internal.zzhw r4 = r11.f26587a
            java.lang.String r4 = r4.N()
            java.lang.String r6 = "am"
            boolean r4 = r6.equals(r4)
            if (r4 == 0) goto L_0x00b5
            r4 = r5
            goto L_0x00b6
        L_0x00b5:
            r4 = r2
        L_0x00b6:
            com.google.android.gms.measurement.internal.zzhw r6 = r11.f26587a
            int r6 = r6.x()
            switch(r6) {
                case 0: goto L_0x014c;
                case 1: goto L_0x013e;
                case 2: goto L_0x0130;
                case 3: goto L_0x0122;
                case 4: goto L_0x0114;
                case 5: goto L_0x0106;
                case 6: goto L_0x00f8;
                case 7: goto L_0x00ea;
                case 8: goto L_0x00db;
                default: goto L_0x00bf;
            }
        L_0x00bf:
            com.google.android.gms.measurement.internal.zzgi r7 = r11.m()
            com.google.android.gms.measurement.internal.zzgk r7 = r7.J()
            java.lang.String r8 = "App measurement disabled"
            r7.a(r8)
            com.google.android.gms.measurement.internal.zzgi r7 = r11.m()
            com.google.android.gms.measurement.internal.zzgk r7 = r7.I()
            java.lang.String r8 = "Invalid scion state in identity"
            r7.a(r8)
            goto L_0x0159
        L_0x00db:
            com.google.android.gms.measurement.internal.zzgi r7 = r11.m()
            com.google.android.gms.measurement.internal.zzgk r7 = r7.J()
            java.lang.String r8 = "App measurement disabled due to denied storage consent"
            r7.a(r8)
            goto L_0x0159
        L_0x00ea:
            com.google.android.gms.measurement.internal.zzgi r7 = r11.m()
            com.google.android.gms.measurement.internal.zzgk r7 = r7.J()
            java.lang.String r8 = "App measurement disabled via the global data collection setting"
            r7.a(r8)
            goto L_0x0159
        L_0x00f8:
            com.google.android.gms.measurement.internal.zzgi r7 = r11.m()
            com.google.android.gms.measurement.internal.zzgk r7 = r7.M()
            java.lang.String r8 = "App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics"
            r7.a(r8)
            goto L_0x0159
        L_0x0106:
            com.google.android.gms.measurement.internal.zzgi r7 = r11.m()
            com.google.android.gms.measurement.internal.zzgk r7 = r7.K()
            java.lang.String r8 = "App measurement disabled via the init parameters"
            r7.a(r8)
            goto L_0x0159
        L_0x0114:
            com.google.android.gms.measurement.internal.zzgi r7 = r11.m()
            com.google.android.gms.measurement.internal.zzgk r7 = r7.J()
            java.lang.String r8 = "App measurement disabled via the manifest"
            r7.a(r8)
            goto L_0x0159
        L_0x0122:
            com.google.android.gms.measurement.internal.zzgi r7 = r11.m()
            com.google.android.gms.measurement.internal.zzgk r7 = r7.J()
            java.lang.String r8 = "App measurement disabled by setAnalyticsCollectionEnabled(false)"
            r7.a(r8)
            goto L_0x0159
        L_0x0130:
            com.google.android.gms.measurement.internal.zzgi r7 = r11.m()
            com.google.android.gms.measurement.internal.zzgk r7 = r7.K()
            java.lang.String r8 = "App measurement deactivated via the init parameters"
            r7.a(r8)
            goto L_0x0159
        L_0x013e:
            com.google.android.gms.measurement.internal.zzgi r7 = r11.m()
            com.google.android.gms.measurement.internal.zzgk r7 = r7.J()
            java.lang.String r8 = "App measurement deactivated via the manifest"
            r7.a(r8)
            goto L_0x0159
        L_0x014c:
            com.google.android.gms.measurement.internal.zzgi r7 = r11.m()
            com.google.android.gms.measurement.internal.zzgk r7 = r7.K()
            java.lang.String r8 = "App measurement collection enabled"
            r7.a(r8)
        L_0x0159:
            if (r6 != 0) goto L_0x015c
            goto L_0x015d
        L_0x015c:
            r5 = r2
        L_0x015d:
            r11.f26309l = r3
            r11.f26310m = r3
            if (r4 == 0) goto L_0x016b
            com.google.android.gms.measurement.internal.zzhw r4 = r11.f26587a
            java.lang.String r4 = r4.M()
            r11.f26310m = r4
        L_0x016b:
            android.content.Context r4 = r11.a()     // Catch:{ IllegalStateException -> 0x01a8 }
            com.google.android.gms.measurement.internal.zzhw r6 = r11.f26587a     // Catch:{ IllegalStateException -> 0x01a8 }
            java.lang.String r6 = r6.P()     // Catch:{ IllegalStateException -> 0x01a8 }
            java.lang.String r7 = "google_app_id"
            com.google.android.gms.measurement.internal.zzhq r8 = new com.google.android.gms.measurement.internal.zzhq     // Catch:{ IllegalStateException -> 0x01a8 }
            r8.<init>(r4, r6)     // Catch:{ IllegalStateException -> 0x01a8 }
            java.lang.String r4 = r8.b(r7)     // Catch:{ IllegalStateException -> 0x01a8 }
            boolean r6 = android.text.TextUtils.isEmpty(r4)     // Catch:{ IllegalStateException -> 0x01a8 }
            if (r6 == 0) goto L_0x0187
            goto L_0x0188
        L_0x0187:
            r3 = r4
        L_0x0188:
            r11.f26309l = r3     // Catch:{ IllegalStateException -> 0x01a8 }
            boolean r3 = android.text.TextUtils.isEmpty(r4)     // Catch:{ IllegalStateException -> 0x01a8 }
            if (r3 != 0) goto L_0x01aa
            com.google.android.gms.measurement.internal.zzhq r3 = new com.google.android.gms.measurement.internal.zzhq     // Catch:{ IllegalStateException -> 0x01a8 }
            android.content.Context r4 = r11.a()     // Catch:{ IllegalStateException -> 0x01a8 }
            com.google.android.gms.measurement.internal.zzhw r6 = r11.f26587a     // Catch:{ IllegalStateException -> 0x01a8 }
            java.lang.String r6 = r6.P()     // Catch:{ IllegalStateException -> 0x01a8 }
            r3.<init>(r4, r6)     // Catch:{ IllegalStateException -> 0x01a8 }
            java.lang.String r4 = "admob_app_id"
            java.lang.String r3 = r3.b(r4)     // Catch:{ IllegalStateException -> 0x01a8 }
            r11.f26310m = r3     // Catch:{ IllegalStateException -> 0x01a8 }
            goto L_0x01aa
        L_0x01a8:
            r3 = move-exception
            goto L_0x01c9
        L_0x01aa:
            if (r5 == 0) goto L_0x01da
            com.google.android.gms.measurement.internal.zzgi r3 = r11.m()     // Catch:{ IllegalStateException -> 0x01a8 }
            com.google.android.gms.measurement.internal.zzgk r3 = r3.K()     // Catch:{ IllegalStateException -> 0x01a8 }
            java.lang.String r4 = "App measurement enabled for app package, google app id"
            java.lang.String r5 = r11.f26300c     // Catch:{ IllegalStateException -> 0x01a8 }
            java.lang.String r6 = r11.f26309l     // Catch:{ IllegalStateException -> 0x01a8 }
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch:{ IllegalStateException -> 0x01a8 }
            if (r6 == 0) goto L_0x01c3
            java.lang.String r6 = r11.f26310m     // Catch:{ IllegalStateException -> 0x01a8 }
            goto L_0x01c5
        L_0x01c3:
            java.lang.String r6 = r11.f26309l     // Catch:{ IllegalStateException -> 0x01a8 }
        L_0x01c5:
            r3.c(r4, r5, r6)     // Catch:{ IllegalStateException -> 0x01a8 }
            goto L_0x01da
        L_0x01c9:
            com.google.android.gms.measurement.internal.zzgi r4 = r11.m()
            com.google.android.gms.measurement.internal.zzgk r4 = r4.G()
            java.lang.String r5 = "Fetching Google App Id failed with exception. appId"
            java.lang.Object r0 = com.google.android.gms.measurement.internal.zzgi.v(r0)
            r4.c(r5, r0, r3)
        L_0x01da:
            r0 = 0
            r11.f26306i = r0
            com.google.android.gms.measurement.internal.zzah r0 = r11.d()
            java.lang.String r3 = "analytics.safelisted_events"
            java.util.List r0 = r0.L(r3)
            if (r0 == 0) goto L_0x021a
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto L_0x01fd
            com.google.android.gms.measurement.internal.zzgi r0 = r11.m()
            com.google.android.gms.measurement.internal.zzgk r0 = r0.M()
            java.lang.String r3 = "Safelisted event list is empty. Ignoring"
            r0.a(r3)
            goto L_0x021c
        L_0x01fd:
            java.util.Iterator r3 = r0.iterator()
        L_0x0201:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x021a
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            com.google.android.gms.measurement.internal.zzop r5 = r11.j()
            java.lang.String r6 = "safelisted event"
            boolean r4 = r5.w0(r6, r4)
            if (r4 != 0) goto L_0x0201
            goto L_0x021c
        L_0x021a:
            r11.f26306i = r0
        L_0x021c:
            if (r1 == 0) goto L_0x0229
            android.content.Context r0 = r11.a()
            boolean r0 = com.google.android.gms.common.wrappers.InstantApps.a(r0)
            r11.f26308k = r0
            return
        L_0x0229:
            r11.f26308k = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzgc.y():void");
    }
}
