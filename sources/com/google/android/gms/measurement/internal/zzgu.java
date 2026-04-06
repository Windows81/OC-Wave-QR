package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzjc;

final class zzgu extends zzix {

    /* renamed from: B  reason: collision with root package name */
    public static final Pair f26354B = new Pair("", 0L);

    /* renamed from: A  reason: collision with root package name */
    public final zzgw f26355A = new zzgw(this, "default_event_parameters", (Bundle) null);

    /* renamed from: c  reason: collision with root package name */
    public SharedPreferences f26356c;

    /* renamed from: d  reason: collision with root package name */
    public Object f26357d = new Object();

    /* renamed from: e  reason: collision with root package name */
    public SharedPreferences f26358e;

    /* renamed from: f  reason: collision with root package name */
    public zzgy f26359f;

    /* renamed from: g  reason: collision with root package name */
    public final zzgz f26360g = new zzgz(this, "first_open_time", 0);

    /* renamed from: h  reason: collision with root package name */
    public final zzgz f26361h = new zzgz(this, "app_install_time", 0);

    /* renamed from: i  reason: collision with root package name */
    public final zzha f26362i = new zzha(this, "app_instance_id", (String) null);

    /* renamed from: j  reason: collision with root package name */
    public String f26363j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f26364k;

    /* renamed from: l  reason: collision with root package name */
    public long f26365l;

    /* renamed from: m  reason: collision with root package name */
    public final zzgz f26366m = new zzgz(this, "session_timeout", 1800000);

    /* renamed from: n  reason: collision with root package name */
    public final zzgx f26367n = new zzgx(this, "start_new_session", true);

    /* renamed from: o  reason: collision with root package name */
    public final zzha f26368o = new zzha(this, "non_personalized_ads", (String) null);

    /* renamed from: p  reason: collision with root package name */
    public final zzgw f26369p = new zzgw(this, "last_received_uri_timestamps_by_source", (Bundle) null);

    /* renamed from: q  reason: collision with root package name */
    public final zzgx f26370q = new zzgx(this, "allow_remote_dynamite", false);

    /* renamed from: r  reason: collision with root package name */
    public final zzgz f26371r = new zzgz(this, "last_pause_time", 0);

    /* renamed from: s  reason: collision with root package name */
    public final zzgz f26372s = new zzgz(this, "session_id", 0);

    /* renamed from: t  reason: collision with root package name */
    public boolean f26373t;

    /* renamed from: u  reason: collision with root package name */
    public zzgx f26374u = new zzgx(this, "app_backgrounded", false);

    /* renamed from: v  reason: collision with root package name */
    public zzgx f26375v = new zzgx(this, "deep_link_retrieval_complete", false);

    /* renamed from: w  reason: collision with root package name */
    public zzgz f26376w = new zzgz(this, "deep_link_retrieval_attempts", 0);

    /* renamed from: x  reason: collision with root package name */
    public final zzha f26377x = new zzha(this, "firebase_feature_rollouts", (String) null);

    /* renamed from: y  reason: collision with root package name */
    public final zzha f26378y = new zzha(this, "deferred_attribution_cache", (String) null);

    /* renamed from: z  reason: collision with root package name */
    public final zzgz f26379z = new zzgz(this, "deferred_attribution_cache_timestamp", 0);

    public zzgu(zzhw zzhw) {
        super(zzhw);
    }

    public final boolean A(zzaz zzaz) {
        n();
        if (!zzjc.l(zzaz.a(), L().a())) {
            return false;
        }
        SharedPreferences.Editor edit = J().edit();
        edit.putString("dma_consent_settings", zzaz.j());
        edit.apply();
        return true;
    }

    public final boolean B(zzjc zzjc) {
        n();
        int b2 = zzjc.b();
        if (!y(b2)) {
            return false;
        }
        SharedPreferences.Editor edit = J().edit();
        edit.putString("consent_settings", zzjc.z());
        edit.putInt("consent_source", b2);
        edit.apply();
        return true;
    }

    public final boolean C(zzni zzni) {
        n();
        String string = J().getString("stored_tcf_param", "");
        String g2 = zzni.g();
        if (g2.equals(string)) {
            return false;
        }
        SharedPreferences.Editor edit = J().edit();
        edit.putString("stored_tcf_param", g2);
        edit.apply();
        return true;
    }

    public final boolean D() {
        SharedPreferences sharedPreferences = this.f26356c;
        if (sharedPreferences == null) {
            return false;
        }
        return sharedPreferences.contains("deferred_analytics_collection");
    }

    public final void E(Boolean bool) {
        n();
        SharedPreferences.Editor edit = J().edit();
        if (bool != null) {
            edit.putBoolean("measurement_enabled_from_api", bool.booleanValue());
        } else {
            edit.remove("measurement_enabled_from_api");
        }
        edit.apply();
    }

    public final void F(String str) {
        n();
        SharedPreferences.Editor edit = J().edit();
        edit.putString("admob_app_id", str);
        edit.apply();
    }

    public final void G(boolean z2) {
        n();
        m().K().b("App measurement setting deferred collection", Boolean.valueOf(z2));
        SharedPreferences.Editor edit = J().edit();
        edit.putBoolean("deferred_analytics_collection", z2);
        edit.apply();
    }

    public final SharedPreferences H() {
        n();
        p();
        if (this.f26358e == null) {
            synchronized (this.f26357d) {
                try {
                    if (this.f26358e == null) {
                        String str = a().getPackageName() + "_preferences";
                        m().K().b("Default prefs file", str);
                        this.f26358e = a().getSharedPreferences(str, 0);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f26358e;
    }

    public final void I(String str) {
        n();
        SharedPreferences.Editor edit = J().edit();
        edit.putString("gmp_app_id", str);
        edit.apply();
    }

    public final SharedPreferences J() {
        n();
        p();
        Preconditions.m(this.f26356c);
        return this.f26356c;
    }

    public final SparseArray K() {
        Bundle a2 = this.f26369p.a();
        if (a2 == null) {
            return new SparseArray();
        }
        int[] intArray = a2.getIntArray("uriSources");
        long[] longArray = a2.getLongArray("uriTimestamps");
        if (intArray == null || longArray == null) {
            return new SparseArray();
        }
        if (intArray.length != longArray.length) {
            m().G().a("Trigger URI source and timestamp array lengths do not match");
            return new SparseArray();
        }
        SparseArray sparseArray = new SparseArray();
        for (int i2 = 0; i2 < intArray.length; i2++) {
            sparseArray.put(intArray[i2], Long.valueOf(longArray[i2]));
        }
        return sparseArray;
    }

    public final zzaz L() {
        n();
        return zzaz.d(J().getString("dma_consent_settings", (String) null));
    }

    public final zzjc M() {
        n();
        return zzjc.i(J().getString("consent_settings", "G1"), J().getInt("consent_source", 100));
    }

    public final Boolean N() {
        n();
        if (!J().contains("use_service")) {
            return null;
        }
        return Boolean.valueOf(J().getBoolean("use_service", false));
    }

    public final Boolean O() {
        n();
        if (J().contains("measurement_enabled_from_api")) {
            return Boolean.valueOf(J().getBoolean("measurement_enabled_from_api", true));
        }
        return null;
    }

    public final Boolean P() {
        n();
        if (J().contains("measurement_enabled")) {
            return Boolean.valueOf(J().getBoolean("measurement_enabled", true));
        }
        return null;
    }

    public final String Q() {
        n();
        String string = J().getString("previous_os_version", (String) null);
        g().p();
        String str = Build.VERSION.RELEASE;
        if (!TextUtils.isEmpty(str) && !str.equals(string)) {
            SharedPreferences.Editor edit = J().edit();
            edit.putString("previous_os_version", str);
            edit.apply();
        }
        return string;
    }

    public final String R() {
        n();
        return J().getString("admob_app_id", (String) null);
    }

    public final String S() {
        n();
        return J().getString("gmp_app_id", (String) null);
    }

    public final void T() {
        n();
        Boolean P = P();
        SharedPreferences.Editor edit = J().edit();
        edit.clear();
        edit.apply();
        if (P != null) {
            w(P);
        }
    }

    public final void o() {
        SharedPreferences sharedPreferences = a().getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.f26356c = sharedPreferences;
        boolean z2 = sharedPreferences.getBoolean("has_been_opened", false);
        this.f26373t = z2;
        if (!z2) {
            SharedPreferences.Editor edit = this.f26356c.edit();
            edit.putBoolean("has_been_opened", true);
            edit.apply();
        }
        this.f26359f = new zzgy(this, "health_monitor", Math.max(0, ((Long) zzbj.f26262d.a((Object) null)).longValue()));
    }

    public final boolean t() {
        return true;
    }

    public final Pair u(String str) {
        n();
        if (!M().m(zzjc.zza.AD_STORAGE)) {
            return new Pair("", Boolean.FALSE);
        }
        long c2 = b().c();
        if (this.f26363j != null && c2 < this.f26365l) {
            return new Pair(this.f26363j, Boolean.valueOf(this.f26364k));
        }
        this.f26365l = c2 + d().E(str);
        AdvertisingIdClient.b(true);
        try {
            AdvertisingIdClient.Info a2 = AdvertisingIdClient.a(a());
            this.f26363j = "";
            String a3 = a2.a();
            if (a3 != null) {
                this.f26363j = a3;
            }
            this.f26364k = a2.b();
        } catch (Exception e2) {
            m().F().b("Unable to get advertising id", e2);
            this.f26363j = "";
        }
        AdvertisingIdClient.b(false);
        return new Pair(this.f26363j, Boolean.valueOf(this.f26364k));
    }

    public final void v(SparseArray sparseArray) {
        if (sparseArray == null) {
            this.f26369p.b((Bundle) null);
            return;
        }
        int[] iArr = new int[sparseArray.size()];
        long[] jArr = new long[sparseArray.size()];
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            iArr[i2] = sparseArray.keyAt(i2);
            jArr[i2] = ((Long) sparseArray.valueAt(i2)).longValue();
        }
        Bundle bundle = new Bundle();
        bundle.putIntArray("uriSources", iArr);
        bundle.putLongArray("uriTimestamps", jArr);
        this.f26369p.b(bundle);
    }

    public final void w(Boolean bool) {
        n();
        SharedPreferences.Editor edit = J().edit();
        if (bool != null) {
            edit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            edit.remove("measurement_enabled");
        }
        edit.apply();
    }

    public final void x(boolean z2) {
        n();
        SharedPreferences.Editor edit = J().edit();
        edit.putBoolean("use_service", z2);
        edit.apply();
    }

    public final boolean y(int i2) {
        return zzjc.l(i2, J().getInt("consent_source", 100));
    }

    public final boolean z(long j2) {
        return j2 - this.f26366m.a() > this.f26371r.a();
    }
}
