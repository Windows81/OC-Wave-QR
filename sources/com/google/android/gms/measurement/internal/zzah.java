package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.ProcessUtils;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.measurement.zzqy;
import com.google.android.gms.internal.measurement.zzqz;
import java.lang.reflect.InvocationTargetException;

public final class zzah extends zziy {

    /* renamed from: b  reason: collision with root package name */
    public Boolean f26177b;

    /* renamed from: c  reason: collision with root package name */
    public String f26178c;

    /* renamed from: d  reason: collision with root package name */
    public zzaj f26179d = new zzag();

    /* renamed from: e  reason: collision with root package name */
    public Boolean f26180e;

    public zzah(zzhw zzhw) {
        super(zzhw);
    }

    public static long M() {
        return ((Long) zzbj.f26263e.a((Object) null)).longValue();
    }

    public static long R() {
        return ((Long) zzbj.G.a((Object) null)).longValue();
    }

    public static long S() {
        return (long) ((Integer) zzbj.f26270l.a((Object) null)).intValue();
    }

    public static long T() {
        return ((Long) zzbj.F.a((Object) null)).longValue();
    }

    public static long U() {
        return ((Long) zzbj.f26257A.a((Object) null)).longValue();
    }

    private final String c(String str, String str2) {
        Class<String> cls = String.class;
        try {
            String str3 = (String) Class.forName("android.os.SystemProperties").getMethod("get", new Class[]{cls, cls}).invoke((Object) null, new Object[]{str, str2});
            Preconditions.m(str3);
            return str3;
        } catch (ClassNotFoundException e2) {
            m().G().b("Could not find SystemProperties class", e2);
            return str2;
        } catch (NoSuchMethodException e3) {
            m().G().b("Could not find SystemProperties.get() method", e3);
            return str2;
        } catch (IllegalAccessException e4) {
            m().G().b("Could not access SystemProperties.get()", e4);
            return str2;
        } catch (InvocationTargetException e5) {
            m().G().b("SystemProperties.get() threw an exception", e5);
            return str2;
        }
    }

    public final int A() {
        return (!zzqz.a() || !d().J((String) null, zzbj.F0) || !j().c0(231100000, true)) ? 0 : 35;
    }

    public final int B(String str) {
        return y(str, zzbj.f26274p);
    }

    public final long C(String str, zzfz zzfz) {
        if (TextUtils.isEmpty(str)) {
            return ((Long) zzfz.a((Object) null)).longValue();
        }
        String c2 = this.f26179d.c(str, zzfz.b());
        if (TextUtils.isEmpty(c2)) {
            return ((Long) zzfz.a((Object) null)).longValue();
        }
        try {
            return ((Long) zzfz.a(Long.valueOf(Long.parseLong(c2)))).longValue();
        } catch (NumberFormatException unused) {
            return ((Long) zzfz.a((Object) null)).longValue();
        }
    }

    public final zzjb D(String str, boolean z2) {
        Object obj;
        Preconditions.g(str);
        Bundle w2 = w();
        if (w2 == null) {
            m().G().a("Failed to load metadata: Metadata bundle is null");
            obj = null;
        } else {
            obj = w2.get(str);
        }
        if (obj == null) {
            return zzjb.UNINITIALIZED;
        }
        if (Boolean.TRUE.equals(obj)) {
            return zzjb.GRANTED;
        }
        if (Boolean.FALSE.equals(obj)) {
            return zzjb.DENIED;
        }
        if (z2 && "eu_consent_policy".equals(obj)) {
            return zzjb.POLICY;
        }
        m().L().b("Invalid manifest metadata for", str);
        return zzjb.UNINITIALIZED;
    }

    public final long E(String str) {
        return C(str, zzbj.f26260b);
    }

    public final String F(String str, zzfz zzfz) {
        return TextUtils.isEmpty(str) ? (String) zzfz.a((Object) null) : (String) zzfz.a(this.f26179d.c(str, zzfz.b()));
    }

    public final Boolean G(String str) {
        Preconditions.g(str);
        Bundle w2 = w();
        if (w2 == null) {
            m().G().a("Failed to load metadata: Metadata bundle is null");
            return null;
        } else if (!w2.containsKey(str)) {
            return null;
        } else {
            return Boolean.valueOf(w2.getBoolean(str));
        }
    }

    public final boolean H(String str, zzfz zzfz) {
        return J(str, zzfz);
    }

    public final String I(String str) {
        return F(str, zzbj.O);
    }

    public final boolean J(String str, zzfz zzfz) {
        if (TextUtils.isEmpty(str)) {
            return ((Boolean) zzfz.a((Object) null)).booleanValue();
        }
        String c2 = this.f26179d.c(str, zzfz.b());
        return TextUtils.isEmpty(c2) ? ((Boolean) zzfz.a((Object) null)).booleanValue() : ((Boolean) zzfz.a(Boolean.valueOf("1".equals(c2)))).booleanValue();
    }

    public final int K() {
        return j().c0(201500000, true) ? 100 : 25;
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002b A[SYNTHETIC, Splitter:B:9:0x002b] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List L(java.lang.String r4) {
        /*
            r3 = this;
            com.google.android.gms.common.internal.Preconditions.g(r4)
            android.os.Bundle r0 = r3.w()
            r1 = 0
            if (r0 != 0) goto L_0x0019
            com.google.android.gms.measurement.internal.zzgi r4 = r3.m()
            com.google.android.gms.measurement.internal.zzgk r4 = r4.G()
            java.lang.String r0 = "Failed to load metadata: Metadata bundle is null"
            r4.a(r0)
        L_0x0017:
            r4 = r1
            goto L_0x0028
        L_0x0019:
            boolean r2 = r0.containsKey(r4)
            if (r2 != 0) goto L_0x0020
            goto L_0x0017
        L_0x0020:
            int r4 = r0.getInt(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
        L_0x0028:
            if (r4 != 0) goto L_0x002b
            return r1
        L_0x002b:
            android.content.Context r0 = r3.a()     // Catch:{ NotFoundException -> 0x0043 }
            android.content.res.Resources r0 = r0.getResources()     // Catch:{ NotFoundException -> 0x0043 }
            int r4 = r4.intValue()     // Catch:{ NotFoundException -> 0x0043 }
            java.lang.String[] r4 = r0.getStringArray(r4)     // Catch:{ NotFoundException -> 0x0043 }
            if (r4 != 0) goto L_0x003e
            return r1
        L_0x003e:
            java.util.List r4 = java.util.Arrays.asList(r4)     // Catch:{ NotFoundException -> 0x0043 }
            return r4
        L_0x0043:
            r4 = move-exception
            com.google.android.gms.measurement.internal.zzgi r0 = r3.m()
            com.google.android.gms.measurement.internal.zzgk r0 = r0.G()
            java.lang.String r2 = "Failed to load string array from metadata: resource not found"
            r0.b(r2, r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzah.L(java.lang.String):java.util.List");
    }

    public final void N(String str) {
        this.f26178c = str;
    }

    public final boolean O(String str) {
        return J(str, zzbj.N);
    }

    public final boolean P(String str) {
        return "1".equals(this.f26179d.c(str, "gaia_collection_enabled"));
    }

    public final boolean Q(String str) {
        return "1".equals(this.f26179d.c(str, "measurement.event_sampling_enabled"));
    }

    public final String V() {
        return c("debug.firebase.analytics.app", "");
    }

    public final String W() {
        return c("debug.deferred.deeplink", "");
    }

    public final String X() {
        return this.f26178c;
    }

    public final boolean Y() {
        Boolean G = G("google_analytics_adid_collection_enabled");
        return G == null || G.booleanValue();
    }

    public final boolean Z() {
        Boolean G = G("google_analytics_automatic_screen_reporting_enabled");
        return G == null || G.booleanValue();
    }

    public final /* bridge */ /* synthetic */ Context a() {
        return super.a();
    }

    public final boolean a0() {
        Boolean G = G("firebase_analytics_collection_deactivated");
        return G != null && G.booleanValue();
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

    public final double o(String str, zzfz zzfz) {
        if (TextUtils.isEmpty(str)) {
            return ((Double) zzfz.a((Object) null)).doubleValue();
        }
        String c2 = this.f26179d.c(str, zzfz.b());
        if (TextUtils.isEmpty(c2)) {
            return ((Double) zzfz.a((Object) null)).doubleValue();
        }
        try {
            return ((Double) zzfz.a(Double.valueOf(Double.parseDouble(c2)))).doubleValue();
        } catch (NumberFormatException unused) {
            return ((Double) zzfz.a((Object) null)).doubleValue();
        }
    }

    public final int p(String str) {
        return q(str, zzbj.K, 500, 2000);
    }

    public final int q(String str, zzfz zzfz, int i2, int i3) {
        return Math.max(Math.min(y(str, zzfz), i3), i2);
    }

    public final int r(String str, boolean z2) {
        if (!zzqy.a() || !d().J((String) null, zzbj.V0)) {
            return 100;
        }
        if (z2) {
            return q(str, zzbj.U, 100, 500);
        }
        return 500;
    }

    public final void s(zzaj zzaj) {
        this.f26179d = zzaj;
    }

    public final boolean t(zzfz zzfz) {
        return J((String) null, zzfz);
    }

    public final boolean u() {
        if (this.f26177b == null) {
            Boolean G = G("app_measurement_lite");
            this.f26177b = G;
            if (G == null) {
                this.f26177b = Boolean.FALSE;
            }
        }
        return this.f26177b.booleanValue() || !this.f26587a.t();
    }

    public final boolean v() {
        if (this.f26180e == null) {
            synchronized (this) {
                try {
                    if (this.f26180e == null) {
                        ApplicationInfo applicationInfo = a().getApplicationInfo();
                        String a2 = ProcessUtils.a();
                        if (applicationInfo != null) {
                            String str = applicationInfo.processName;
                            this.f26180e = Boolean.valueOf(str != null && str.equals(a2));
                        }
                        if (this.f26180e == null) {
                            this.f26180e = Boolean.TRUE;
                            m().G().a("My process not in the list of running processes");
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f26180e.booleanValue();
    }

    public final Bundle w() {
        try {
            if (a().getPackageManager() == null) {
                m().G().a("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo b2 = Wrappers.a(a()).b(a().getPackageName(), 128);
            if (b2 != null) {
                return b2.metaData;
            }
            m().G().a("Failed to load metadata: ApplicationInfo is null");
            return null;
        } catch (PackageManager.NameNotFoundException e2) {
            m().G().b("Failed to load metadata: Package name not found", e2);
            return null;
        }
    }

    public final int x(String str) {
        return q(str, zzbj.L, 25, 100);
    }

    public final int y(String str, zzfz zzfz) {
        if (TextUtils.isEmpty(str)) {
            return ((Integer) zzfz.a((Object) null)).intValue();
        }
        String c2 = this.f26179d.c(str, zzfz.b());
        if (TextUtils.isEmpty(c2)) {
            return ((Integer) zzfz.a((Object) null)).intValue();
        }
        try {
            return ((Integer) zzfz.a(Integer.valueOf(Integer.parseInt(c2)))).intValue();
        } catch (NumberFormatException unused) {
            return ((Integer) zzfz.a((Object) null)).intValue();
        }
    }

    public final int z(String str, boolean z2) {
        return Math.max(r(str, z2), 256);
    }
}
