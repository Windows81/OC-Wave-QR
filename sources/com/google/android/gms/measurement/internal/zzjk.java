package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.collection.ArrayMap;
import androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.CollectionUtils;
import com.google.android.gms.common.util.Strings;
import com.google.android.gms.internal.measurement.zzdl;
import com.google.android.gms.internal.measurement.zzox;
import com.google.android.gms.internal.measurement.zzpd;
import com.google.android.gms.internal.measurement.zzrl;
import com.google.android.gms.internal.measurement.zzrw;
import com.google.android.gms.measurement.internal.zzjc;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

public final class zzjk extends zzf {

    /* renamed from: c  reason: collision with root package name */
    public zzkw f26622c;

    /* renamed from: d  reason: collision with root package name */
    public zzjg f26623d;

    /* renamed from: e  reason: collision with root package name */
    public final Set f26624e = new CopyOnWriteArraySet();

    /* renamed from: f  reason: collision with root package name */
    public boolean f26625f;

    /* renamed from: g  reason: collision with root package name */
    public final AtomicReference f26626g = new AtomicReference();

    /* renamed from: h  reason: collision with root package name */
    public final Object f26627h = new Object();

    /* renamed from: i  reason: collision with root package name */
    public boolean f26628i = false;

    /* renamed from: j  reason: collision with root package name */
    public int f26629j = 1;

    /* renamed from: k  reason: collision with root package name */
    public zzax f26630k;

    /* renamed from: l  reason: collision with root package name */
    public PriorityQueue f26631l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f26632m;

    /* renamed from: n  reason: collision with root package name */
    public zzjc f26633n = zzjc.f26593c;

    /* renamed from: o  reason: collision with root package name */
    public final AtomicLong f26634o = new AtomicLong(0);

    /* renamed from: p  reason: collision with root package name */
    public long f26635p = -1;

    /* renamed from: q  reason: collision with root package name */
    public final zzs f26636q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f26637r = true;

    /* renamed from: s  reason: collision with root package name */
    public zzax f26638s;

    /* renamed from: t  reason: collision with root package name */
    public SharedPreferences.OnSharedPreferenceChangeListener f26639t;

    /* renamed from: u  reason: collision with root package name */
    public zzax f26640u;

    /* renamed from: v  reason: collision with root package name */
    public final zzoo f26641v = new zzko(this);

    public zzjk(zzhw zzhw) {
        super(zzhw);
        this.f26636q = new zzs(zzhw);
    }

    public static /* synthetic */ int C(zzjk zzjk, Throwable th) {
        String message = th.getMessage();
        zzjk.f26632m = false;
        if (message == null) {
            return 2;
        }
        if (!(th instanceof IllegalStateException) && !message.contains("garbage collected") && !th.getClass().getSimpleName().equals("ServiceUnavailableException")) {
            return (!(th instanceof SecurityException) || message.endsWith("READ_DEVICE_CONFIG")) ? 2 : 3;
        }
        if (message.contains("Background")) {
            zzjk.f26632m = true;
        }
        return 1;
    }

    public static int E(String str) {
        Preconditions.g(str);
        return 25;
    }

    public static /* synthetic */ void Q0(zzjk zzjk, int i2) {
        if (zzjk.f26630k == null) {
            zzjk.f26630k = new zzjy(zzjk, zzjk.f26587a);
        }
        zzjk.f26630k.b((long) (i2 * 1000));
    }

    public static /* synthetic */ void R0(zzjk zzjk, Bundle bundle) {
        Bundle bundle2 = bundle;
        zzjk.n();
        zzjk.v();
        Preconditions.m(bundle);
        String string = bundle2.getString("name");
        String string2 = bundle2.getString("origin");
        Preconditions.g(string);
        Preconditions.g(string2);
        Preconditions.m(bundle2.get("value"));
        if (!zzjk.f26587a.p()) {
            zzjk.m().K().a("Conditional property not set since app measurement is disabled");
            return;
        }
        zzok zzok = new zzok(string, bundle2.getLong("triggered_timestamp"), bundle2.get("value"), string2);
        try {
            zzbh H = zzjk.j().H(bundle2.getString("app_id"), bundle2.getString("triggered_event_name"), bundle2.getBundle("triggered_event_params"), string2, 0, true, true);
            zzbh H2 = zzjk.j().H(bundle2.getString("app_id"), bundle2.getString("timed_out_event_name"), bundle2.getBundle("timed_out_event_params"), string2, 0, true, true);
            zzbh H3 = zzjk.j().H(bundle2.getString("app_id"), bundle2.getString("expired_event_name"), bundle2.getBundle("expired_event_params"), string2, 0, true, true);
            zzjk.t().H(new zzaf(bundle2.getString("app_id"), string2, zzok, bundle2.getLong("creation_timestamp"), false, bundle2.getString("trigger_event_name"), H2, bundle2.getLong("trigger_timeout"), H, bundle2.getLong("time_to_live"), H3));
        } catch (IllegalArgumentException unused) {
        }
    }

    public static /* synthetic */ void W(zzjk zzjk, Bundle bundle) {
        Bundle bundle2 = bundle;
        zzjk.n();
        zzjk.v();
        Preconditions.m(bundle);
        String g2 = Preconditions.g(bundle2.getString("name"));
        if (!zzjk.f26587a.p()) {
            zzjk.m().K().a("Conditional property not cleared since app measurement is disabled");
            return;
        }
        zzok zzok = new zzok(g2, 0, (Object) null, "");
        try {
            zzbh H = zzjk.j().H(bundle2.getString("app_id"), bundle2.getString("expired_event_name"), bundle2.getBundle("expired_event_params"), "", bundle2.getLong("creation_timestamp"), true, true);
            String string = bundle2.getString("app_id");
            long j2 = bundle2.getLong("creation_timestamp");
            boolean z2 = bundle2.getBoolean("active");
            zzaf zzaf = r4;
            zzaf zzaf2 = new zzaf(string, "", zzok, j2, z2, bundle2.getString("trigger_event_name"), (zzbh) null, bundle2.getLong("trigger_timeout"), (zzbh) null, bundle2.getLong("time_to_live"), H);
            zzjk.t().H(zzaf);
        } catch (IllegalArgumentException unused) {
        }
    }

    public static /* synthetic */ void X(zzjk zzjk, zzjc zzjc, long j2, boolean z2, boolean z3) {
        zzjk.n();
        zzjk.v();
        zzjc M = zzjk.i().M();
        if (j2 <= zzjk.f26635p && zzjc.l(M.b(), zzjc.b())) {
            zzjk.m().J().b("Dropped out-of-date consent setting, proposed settings", zzjc);
        } else if (zzjk.i().B(zzjc)) {
            zzjk.m().K().b("Setting storage consent(FE)", zzjc);
            zzjk.f26635p = j2;
            if (zzjk.t().k0()) {
                zzjk.t().q0(z2);
            } else {
                zzjk.t().V(z2);
            }
            if (z3) {
                zzjk.t().Q(new AtomicReference());
            }
        } else {
            zzjk.m().J().b("Lower precedence consent source ignored, proposed source", Integer.valueOf(zzjc.b()));
        }
    }

    public static /* synthetic */ void Y(zzjk zzjk, zzjc zzjc, zzjc zzjc2) {
        if (!zzpd.a() || !zzjk.d().t(zzbj.c1)) {
            zzjc.zza zza = zzjc.zza.ANALYTICS_STORAGE;
            zzjc.zza zza2 = zzjc.zza.AD_STORAGE;
            boolean n2 = zzjc.n(zzjc2, zza, zza2);
            boolean s2 = zzjc.s(zzjc2, zza, zza2);
            if (n2 || s2) {
                zzjk.p().I();
            }
        }
    }

    public final boolean A() {
        return false;
    }

    public final PriorityQueue A0() {
        if (this.f26631l == null) {
            this.f26631l = new PriorityQueue(Comparator.comparing(new zzjn(), new zzjm()));
        }
        return this.f26631l;
    }

    public final void B0() {
        n();
        v();
        if (d().t(zzbj.i1)) {
            zzlp t2 = t();
            t2.n();
            t2.v();
            if (!t2.l0() || t2.j().I0() >= 242600) {
                t().Y();
            }
        }
    }

    public final void C0() {
        n();
        v();
        if (this.f26587a.s()) {
            Boolean G = d().G("google_analytics_deferred_deep_link_enabled");
            if (G != null && G.booleanValue()) {
                m().F().a("Deferred Deep Link feature enabled.");
                f().D(new zzjt(this));
            }
            t().Z();
            this.f26637r = false;
            String Q = i().Q();
            if (!TextUtils.isEmpty(Q)) {
                g().p();
                if (!Q.equals(Build.VERSION.RELEASE)) {
                    Bundle bundle = new Bundle();
                    bundle.putString("_po", Q);
                    b1("auto", "_ou", bundle);
                }
            }
        }
    }

    public final void D0() {
        if ((a().getApplicationContext() instanceof Application) && this.f26622c != null) {
            ((Application) a().getApplicationContext()).unregisterActivityLifecycleCallbacks(this.f26622c);
        }
    }

    public final void E0() {
        if (zzrl.a() && d().t(zzbj.I0)) {
            if (f().J()) {
                m().G().a("Cannot get trigger URIs from analytics worker thread");
            } else if (zzac.a()) {
                m().G().a("Cannot get trigger URIs from main thread");
            } else {
                v();
                m().K().a("Getting trigger URIs (FE)");
                AtomicReference atomicReference = new AtomicReference();
                f().v(atomicReference, 5000, "get trigger URIs", new zzjp(this, atomicReference));
                List list = (List) atomicReference.get();
                if (list == null) {
                    m().G().a("Timed out waiting for get trigger URIs");
                } else {
                    f().D(new zzjo(this, list));
                }
            }
        }
    }

    public final void F0() {
        n();
        if (i().f26375v.b()) {
            m().F().a("Deferred Deep Link already retrieved. Not fetching again.");
            return;
        }
        long a2 = i().f26376w.a();
        i().f26376w.b(1 + a2);
        if (a2 >= 5) {
            m().L().a("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
            i().f26375v.a(true);
            return;
        }
        if (this.f26638s == null) {
            this.f26638s = new zzkj(this, this.f26587a);
        }
        this.f26638s.b(0);
    }

    public final ArrayList G(String str, String str2) {
        if (f().J()) {
            m().G().a("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList(0);
        } else if (zzac.a()) {
            m().G().a("Cannot get conditional user properties from main thread");
            return new ArrayList(0);
        } else {
            AtomicReference atomicReference = new AtomicReference();
            this.f26587a.f().v(atomicReference, 5000, "get conditional user properties", new zzkn(this, atomicReference, (String) null, str, str2));
            List list = (List) atomicReference.get();
            if (list != null) {
                return zzop.t0(list);
            }
            m().G().b("Timed out waiting for get conditional user properties", (Object) null);
            return new ArrayList();
        }
    }

    public final void G0() {
        n();
        m().F().a("Handle tcf update.");
        zzni c2 = zzni.c(i().H());
        m().K().b("Tcf preferences read", c2);
        if (i().C(c2)) {
            Bundle b2 = c2.b();
            m().K().b("Consent generated from Tcf", b2);
            if (b2 != Bundle.EMPTY) {
                N(b2, -30, b().a());
            }
            Bundle bundle = new Bundle();
            bundle.putString("_tcfd", c2.e());
            b1("auto", "_tcf", bundle);
        }
    }

    public final Map H(String str, String str2, boolean z2) {
        if (f().J()) {
            m().G().a("Cannot get user properties from analytics worker thread");
            return Collections.emptyMap();
        } else if (zzac.a()) {
            m().G().a("Cannot get user properties from main thread");
            return Collections.emptyMap();
        } else {
            AtomicReference atomicReference = new AtomicReference();
            this.f26587a.f().v(atomicReference, 5000, "get user properties", new zzkm(this, atomicReference, (String) null, str, str2, z2));
            List<zzok> list = (List) atomicReference.get();
            if (list == null) {
                m().G().b("Timed out waiting for handle get user properties, includeInternal", Boolean.valueOf(z2));
                return Collections.emptyMap();
            }
            ArrayMap arrayMap = new ArrayMap(list.size());
            for (zzok zzok : list) {
                Object H = zzok.H();
                if (H != null) {
                    arrayMap.put(zzok.f26959A, H);
                }
            }
            return arrayMap;
        }
    }

    public final void H0() {
        zznk zznk;
        MeasurementManagerFutures S0;
        n();
        this.f26632m = false;
        if (!A0().isEmpty() && !this.f26628i && (zznk = (zznk) A0().poll()) != null && (S0 = j().S0()) != null) {
            this.f26628i = true;
            m().K().b("Registering trigger URI", zznk.f26882z);
            ListenableFuture c2 = S0.c(Uri.parse(zznk.f26882z));
            if (c2 == null) {
                this.f26628i = false;
                A0().add(zznk);
                return;
            }
            if (!d().t(zzbj.N0)) {
                SparseArray K = i().K();
                K.put(zznk.f26881B, Long.valueOf(zznk.f26880A));
                i().v(K);
            }
            Futures.a(c2, new zzjz(this, zznk), new zzjw(this));
        }
    }

    public final void I(long j2) {
        a1((String) null);
        f().D(new zzki(this, j2));
    }

    public final void I0() {
        n();
        m().F().a("Register tcfPrefChangeListener.");
        if (this.f26639t == null) {
            this.f26640u = new zzkc(this, this.f26587a);
            this.f26639t = new zzjv(this);
        }
        i().H().registerOnSharedPreferenceChangeListener(this.f26639t);
    }

    public final void J(long j2, boolean z2) {
        n();
        v();
        m().F().a("Resetting analytics data (FE)");
        zznb u2 = u();
        u2.n();
        u2.f26862f.b();
        p().I();
        boolean p2 = this.f26587a.p();
        zzgu i2 = i();
        i2.f26360g.b(j2);
        if (!TextUtils.isEmpty(i2.i().f26377x.a())) {
            i2.f26377x.b((String) null);
        }
        i2.f26371r.b(0);
        i2.f26372s.b(0);
        if (!i2.d().a0()) {
            i2.G(!p2);
        }
        i2.f26378y.b((String) null);
        i2.f26379z.b(0);
        i2.f26355A.b((Bundle) null);
        if (z2) {
            t().e0();
        }
        u().f26861e.a();
        this.f26637r = !p2;
    }

    public final boolean J0() {
        return this.f26632m;
    }

    public final void K(Intent intent) {
        if (zzrw.a() && d().t(zzbj.y0)) {
            Uri data = intent.getData();
            if (data == null) {
                m().J().a("Activity intent has no data. Preview Mode was not enabled.");
                return;
            }
            String queryParameter = data.getQueryParameter("sgtm_debug_enable");
            if (queryParameter == null || !queryParameter.equals("1")) {
                m().J().a("Preview Mode was not enabled.");
                d().N((String) null);
                return;
            }
            String queryParameter2 = data.getQueryParameter("sgtm_preview_key");
            if (!TextUtils.isEmpty(queryParameter2)) {
                m().J().b("Preview Mode was enabled. Using the sgtmPreviewKey: ", queryParameter2);
                d().N(queryParameter2);
            }
        }
    }

    public final void K0() {
        n();
        String a2 = i().f26368o.a();
        if (a2 != null) {
            if ("unset".equals(a2)) {
                k0("app", "_npa", (Object) null, b().a());
            } else {
                k0("app", "_npa", Long.valueOf("true".equals(a2) ? 1 : 0), b().a());
            }
        }
        if (!this.f26587a.p() || !this.f26637r) {
            m().F().a("Updating Scion state (FE)");
            t().g0();
            return;
        }
        m().F().a("Recording app launch after enabling measurement for the first time (FE)");
        C0();
        u().f26861e.a();
        f().D(new zzka(this));
    }

    public final /* synthetic */ void L(SharedPreferences sharedPreferences, String str) {
        if ("IABTCF_TCString".equals(str)) {
            m().K().a("IABTCF_TCString change picked up in listener.");
            ((zzax) Preconditions.m(this.f26640u)).b(500);
        }
    }

    public final /* synthetic */ void M(Bundle bundle) {
        Bundle g1 = bundle.isEmpty() ? bundle : g1(bundle);
        i().f26355A.b(g1);
        if (!bundle.isEmpty() || d().t(zzbj.k1)) {
            t().C(g1);
        }
    }

    public final void M0(long j2) {
        J(j2, true);
    }

    public final void N(Bundle bundle, int i2, long j2) {
        v();
        String k2 = zzjc.k(bundle);
        if (k2 != null) {
            m().M().b("Ignoring invalid consent setting", k2);
            m().M().a("Valid consent values are 'granted', 'denied'");
        }
        boolean J = f().J();
        zzjc f2 = zzjc.f(bundle, i2);
        if (f2.C()) {
            S(f2, j2, J);
        }
        zzaz b2 = zzaz.b(bundle, i2);
        if (b2.k()) {
            Q(b2, J);
        }
        Boolean e2 = zzaz.e(bundle);
        if (e2 != null) {
            l0(i2 == -30 ? "tcf" : "app", "allow_personalized_ads", e2.toString(), false);
        }
    }

    public final /* synthetic */ void N0(Bundle bundle) {
        if (!bundle.isEmpty()) {
            bundle = g1(bundle);
        }
        i().f26355A.b(bundle);
        zzlp t2 = t();
        t2.n();
        t2.v();
        if (!t2.l0() || t2.j().I0() >= 243100) {
            t().p0(bundle);
        }
    }

    public final /* synthetic */ void O(Bundle bundle, long j2) {
        if (TextUtils.isEmpty(p().G())) {
            N(bundle, 0, j2);
        } else {
            m().M().a("Using developer consent only; google app id found");
        }
    }

    public final void O0(Bundle bundle, long j2) {
        Preconditions.m(bundle);
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString("app_id"))) {
            m().L().a("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        Preconditions.m(bundle2);
        Class<String> cls = String.class;
        zziz.a(bundle2, "app_id", cls, (Object) null);
        zziz.a(bundle2, "origin", cls, (Object) null);
        zziz.a(bundle2, "name", cls, (Object) null);
        zziz.a(bundle2, "value", Object.class, (Object) null);
        zziz.a(bundle2, "trigger_event_name", cls, (Object) null);
        Class<Long> cls2 = Long.class;
        zziz.a(bundle2, "trigger_timeout", cls2, 0L);
        zziz.a(bundle2, "timed_out_event_name", cls, (Object) null);
        Class<Bundle> cls3 = Bundle.class;
        zziz.a(bundle2, "timed_out_event_params", cls3, (Object) null);
        zziz.a(bundle2, "triggered_event_name", cls, (Object) null);
        zziz.a(bundle2, "triggered_event_params", cls3, (Object) null);
        zziz.a(bundle2, "time_to_live", cls2, 0L);
        zziz.a(bundle2, "expired_event_name", cls, (Object) null);
        zziz.a(bundle2, "expired_event_params", cls3, (Object) null);
        Preconditions.g(bundle2.getString("name"));
        Preconditions.g(bundle2.getString("origin"));
        Preconditions.m(bundle2.get("value"));
        bundle2.putLong("creation_timestamp", j2);
        String string = bundle2.getString("name");
        Object obj = bundle2.get("value");
        if (j().r0(string) != 0) {
            m().G().b("Invalid conditional user property name", h().g(string));
        } else if (j().w(string, obj) != 0) {
            m().G().c("Invalid conditional user property value", h().g(string), obj);
        } else {
            Object A0 = j().A0(string, obj);
            if (A0 == null) {
                m().G().c("Unable to normalize conditional user property value", h().g(string), obj);
                return;
            }
            zziz.b(bundle2, A0);
            long j3 = bundle2.getLong("trigger_timeout");
            if (TextUtils.isEmpty(bundle2.getString("trigger_event_name")) || (j3 <= 15552000000L && j3 >= 1)) {
                long j4 = bundle2.getLong("time_to_live");
                if (j4 > 15552000000L || j4 < 1) {
                    m().G().c("Invalid conditional user property time to live", h().g(string), Long.valueOf(j4));
                } else {
                    f().D(new zzkl(this, bundle2));
                }
            } else {
                m().G().c("Invalid conditional user property timeout", h().g(string), Long.valueOf(j3));
            }
        }
    }

    public final void P(zzdl zzdl) {
        f().D(new zzkp(this, zzdl));
    }

    public final void P0(zzjj zzjj) {
        v();
        Preconditions.m(zzjj);
        if (!this.f26624e.remove(zzjj)) {
            m().L().a("OnEventListener had not been registered");
        }
    }

    public final void Q(zzaz zzaz, boolean z2) {
        zzkv zzkv = new zzkv(this, zzaz);
        if (z2) {
            n();
            zzkv.run();
            return;
        }
        f().D(zzkv);
    }

    public final void R(zzjc zzjc) {
        n();
        boolean z2 = (zzjc.B() && zzjc.A()) || t().j0();
        if (z2 != this.f26587a.q()) {
            this.f26587a.w(z2);
            Boolean O = i().O();
            if (!z2 || O == null || O.booleanValue()) {
                c0(Boolean.valueOf(z2), false);
            }
        }
    }

    public final void S(zzjc zzjc, long j2, boolean z2) {
        zzjc zzjc2;
        boolean z3;
        boolean z4;
        boolean z5;
        zzjb zzjb;
        zzjc zzjc3 = zzjc;
        v();
        int b2 = zzjc.b();
        if (!zzox.a() || !d().t(zzbj.Y0)) {
            if (b2 != -10 && zzjc.w() == null && zzjc.x() == null) {
                m().M().a("Discarding empty consent settings");
                return;
            }
        } else if (b2 != -10 && zzjc.t() == (zzjb = zzjb.UNINITIALIZED) && zzjc.v() == zzjb) {
            m().M().a("Ignoring empty consent settings");
            return;
        }
        synchronized (this.f26627h) {
            try {
                zzjc2 = this.f26633n;
                z3 = false;
                if (zzjc.l(b2, zzjc2.b())) {
                    z5 = zzjc.u(this.f26633n);
                    if (zzjc.B() && !this.f26633n.B()) {
                        z3 = true;
                    }
                    zzjc3 = zzjc.p(this.f26633n);
                    this.f26633n = zzjc3;
                    z4 = z3;
                    z3 = true;
                } else {
                    z5 = false;
                    z4 = false;
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        if (!z3) {
            m().J().b("Ignoring lower-priority consent settings, proposed settings", zzjc3);
            return;
        }
        long andIncrement = this.f26634o.getAndIncrement();
        if (z5) {
            a1((String) null);
            zzku zzku = new zzku(this, zzjc3, j2, andIncrement, z4, zzjc2);
            if (z2) {
                n();
                zzku.run();
                return;
            }
            f().G(zzku);
            return;
        }
        zzkx zzkx = new zzkx(this, zzjc3, andIncrement, z4, zzjc2);
        if (z2) {
            n();
            zzkx.run();
        } else if (b2 == 30 || b2 == -10) {
            f().G(zzkx);
        } else {
            f().D(zzkx);
        }
    }

    public final /* synthetic */ void S0(String str) {
        if (p().K(str)) {
            p().I();
        }
    }

    public final void T(zzjg zzjg) {
        zzjg zzjg2;
        n();
        v();
        if (!(zzjg == null || zzjg == (zzjg2 = this.f26623d))) {
            Preconditions.r(zzjg2 == null, "EventInterceptor already set.");
        }
        this.f26623d = zzjg;
    }

    public final void T0(String str, String str2, long j2, Bundle bundle, boolean z2, boolean z3, boolean z4, String str3) {
        f().D(new zzkf(this, str, str2, j2, zzop.D(bundle), z2, z3, z4, str3));
    }

    public final void U(zzjj zzjj) {
        v();
        Preconditions.m(zzjj);
        if (!this.f26624e.add(zzjj)) {
            m().L().a("OnEventListener already registered");
        }
    }

    public final void U0(String str, String str2, Bundle bundle) {
        j0(str, str2, bundle, true, true, b().a());
    }

    public final void V0(boolean z2) {
        if (a().getApplicationContext() instanceof Application) {
            Application application = (Application) a().getApplicationContext();
            if (this.f26622c == null) {
                this.f26622c = new zzkw(this);
            }
            if (z2) {
                application.unregisterActivityLifecycleCallbacks(this.f26622c);
                application.registerActivityLifecycleCallbacks(this.f26622c);
                m().K().a("Registered activity lifecycle callback");
            }
        }
    }

    public final void W0(long j2) {
        f().D(new zzkd(this, j2));
    }

    public final void X0(Bundle bundle) {
        O0(bundle, b().a());
    }

    public final void Y0(Bundle bundle, long j2) {
        f().G(new zzjq(this, bundle, j2));
    }

    public final /* bridge */ /* synthetic */ Context a() {
        return super.a();
    }

    public final void a1(String str) {
        this.f26626g.set(str);
    }

    public final /* bridge */ /* synthetic */ Clock b() {
        return super.b();
    }

    public final void b0(Boolean bool) {
        v();
        f().D(new zzks(this, bool));
    }

    public final void b1(String str, String str2, Bundle bundle) {
        n();
        e0(str, str2, b().a(), bundle);
    }

    public final void c0(Boolean bool, boolean z2) {
        n();
        v();
        m().F().b("Setting app measurement enabled (FE)", bool);
        i().w(bool);
        if (z2) {
            i().E(bool);
        }
        if (this.f26587a.q() || (bool != null && !bool.booleanValue())) {
            K0();
        }
    }

    public final void c1(boolean z2) {
        v();
        f().D(new zzkb(this, z2));
    }

    public final /* bridge */ /* synthetic */ zzah d() {
        return super.d();
    }

    public final void d0(String str, long j2) {
        if (str == null || !TextUtils.isEmpty(str)) {
            f().D(new zzju(this, str));
            m0((String) null, "_id", str, true, j2);
            return;
        }
        this.f26587a.m().L().a("User ID must be non-empty or null");
    }

    public final void d1(Bundle bundle) {
        f().D(new zzjr(this, bundle == null ? new Bundle() : new Bundle(bundle)));
    }

    public final /* bridge */ /* synthetic */ zzac e() {
        return super.e();
    }

    public final void e0(String str, String str2, long j2, Bundle bundle) {
        n();
        f0(str, str2, j2, bundle, true, this.f26623d == null || zzop.J0(str2), true, (String) null);
    }

    public final void e1(Bundle bundle, long j2) {
        N(bundle, -20, j2);
    }

    public final /* bridge */ /* synthetic */ zzhp f() {
        return super.f();
    }

    public final void f0(String str, String str2, long j2, Bundle bundle, boolean z2, boolean z3, boolean z4, String str3) {
        ArrayList arrayList;
        String str4;
        long j3;
        int i2;
        Object obj;
        String str5 = str;
        String str6 = str2;
        long j4 = j2;
        Bundle bundle2 = bundle;
        Preconditions.g(str);
        Preconditions.m(bundle);
        n();
        v();
        if (!this.f26587a.p()) {
            m().F().a("Event not sent since app measurement is disabled");
            return;
        }
        List H = p().H();
        if (H == null || H.contains(str6)) {
            if (!this.f26625f) {
                this.f26625f = true;
                try {
                    try {
                        (!this.f26587a.t() ? Class.forName("com.google.android.gms.tagmanager.TagManagerService", true, a().getClassLoader()) : Class.forName("com.google.android.gms.tagmanager.TagManagerService")).getDeclaredMethod("initialize", new Class[]{Context.class}).invoke((Object) null, new Object[]{a()});
                    } catch (Exception e2) {
                        m().L().b("Failed to invoke Tag Manager's initialize() method", e2);
                    }
                } catch (ClassNotFoundException unused) {
                    m().J().a("Tag Manager is not found and thus will not be used");
                }
            }
            if ("_cmp".equals(str6) && bundle2.containsKey("gclid")) {
                k0("auto", "_lgclid", bundle2.getString("gclid"), b().a());
            }
            if (z2 && zzop.N0(str2)) {
                j().N(bundle2, i().f26355A.a());
            }
            int i3 = 0;
            if (!z4 && !"_iap".equals(str6)) {
                zzop L = this.f26587a.L();
                int i4 = 2;
                if (L.C0("event", str6)) {
                    if (!L.p0("event", zzjf.f26606a, zzjf.f26607b, str6)) {
                        i4 = 13;
                    } else if (L.j0("event", 40, str6)) {
                        i4 = 0;
                    }
                }
                if (i4 != 0) {
                    m().H().b("Invalid public event name. Event will not be logged (FE)", h().c(str6));
                    this.f26587a.L();
                    String J = zzop.J(str6, 40, true);
                    if (str6 != null) {
                        i3 = str2.length();
                    }
                    this.f26587a.L();
                    zzop.Y(this.f26641v, i4, "_ev", J, i3);
                    return;
                }
            }
            zzlh C = s().C(false);
            if (C != null && !bundle2.containsKey("_sc")) {
                C.f26741d = true;
            }
            zzop.X(C, bundle2, z2 && !z4);
            boolean equals = "am".equals(str5);
            boolean J0 = zzop.J0(str2);
            if (z2 && this.f26623d != null && !J0 && !equals) {
                m().F().c("Passing event to registered event handler (FE)", h().c(str6), h().a(bundle2));
                Preconditions.m(this.f26623d);
                this.f26623d.a(str, str2, bundle, j2);
            } else if (this.f26587a.s()) {
                int v2 = j().v(str6);
                if (v2 != 0) {
                    m().H().b("Invalid event name. Event will not be logged (FE)", h().c(str6));
                    j();
                    String J2 = zzop.J(str6, 40, true);
                    if (str6 != null) {
                        i3 = str2.length();
                    }
                    this.f26587a.L();
                    zzop.Z(this.f26641v, str3, v2, "_ev", J2, i3);
                    return;
                }
                String str7 = "_o";
                Bundle F = j().F(str3, str2, bundle, CollectionUtils.b("_o", "_sn", "_sc", "_si"), z4);
                Preconditions.m(F);
                if (s().C(false) != null && "_ae".equals(str6)) {
                    zznh zznh = u().f26862f;
                    long c2 = zznh.f26876d.b().c();
                    long j5 = c2 - zznh.f26874b;
                    zznh.f26874b = c2;
                    if (j5 > 0) {
                        j().M(F, j5);
                    }
                }
                if (!"auto".equals(str5) && "_ssr".equals(str6)) {
                    zzop j6 = j();
                    String string = F.getString("_ffr");
                    if (Strings.a(string)) {
                        string = null;
                    } else if (string != null) {
                        string = string.trim();
                    }
                    if (Objects.equals(string, j6.i().f26377x.a())) {
                        j6.m().F().a("Not logging duplicate session_start_with_rollout event");
                        return;
                    }
                    j6.i().f26377x.b(string);
                } else if ("_ae".equals(str6)) {
                    String a2 = j().i().f26377x.a();
                    if (!TextUtils.isEmpty(a2)) {
                        F.putString("_ffr", a2);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(F);
                boolean F2 = d().t(zzbj.O0) ? u().F() : i().f26374u.b();
                if (i().f26371r.a() <= 0 || !i().z(j4) || !F2) {
                    str4 = "_ae";
                    arrayList = arrayList2;
                    j3 = 0;
                } else {
                    m().K().a("Current session is expired, remove the session number, ID, and engagement time");
                    arrayList = arrayList2;
                    j3 = 0;
                    str4 = "_ae";
                    k0("auto", "_sid", (Object) null, b().a());
                    k0("auto", "_sno", (Object) null, b().a());
                    k0("auto", "_se", (Object) null, b().a());
                    i().f26372s.b(0);
                }
                if (F.getLong("extend_session", j3) == 1) {
                    m().K().a("EXTEND_SESSION param attached: initiate a new session or extend the current active session");
                    i2 = 1;
                    this.f26587a.K().f26861e.b(j4, true);
                } else {
                    i2 = 1;
                }
                ArrayList arrayList3 = new ArrayList(F.keySet());
                Collections.sort(arrayList3);
                int size = arrayList3.size();
                int i5 = 0;
                while (i5 < size) {
                    Object obj2 = arrayList3.get(i5);
                    i5 += i2;
                    String str8 = (String) obj2;
                    if (str8 != null) {
                        j();
                        Bundle[] x0 = zzop.x0(F.get(str8));
                        if (x0 != null) {
                            F.putParcelableArray(str8, x0);
                        }
                    }
                    i2 = 1;
                }
                int i6 = 0;
                while (i6 < arrayList.size()) {
                    ArrayList arrayList4 = arrayList;
                    Bundle bundle3 = (Bundle) arrayList4.get(i6);
                    String str9 = i6 != 0 ? "_ep" : str6;
                    bundle3.putString(str7, str5);
                    if (z3) {
                        obj = null;
                        bundle3 = j().E(bundle3, (String) null);
                    } else {
                        obj = null;
                    }
                    Bundle bundle4 = bundle3;
                    zzbh zzbh = r1;
                    String str10 = str7;
                    Object obj3 = obj;
                    Bundle bundle5 = bundle4;
                    zzbh zzbh2 = new zzbh(str9, new zzbc(bundle4), str, j2);
                    t().I(zzbh, str3);
                    if (!equals) {
                        for (zzjj a3 : this.f26624e) {
                            a3.a(str, str2, new Bundle(bundle5), j2);
                            String str11 = str3;
                        }
                    }
                    i6++;
                    arrayList = arrayList4;
                    str7 = str10;
                }
                if (s().C(false) != null && str4.equals(str6)) {
                    u().E(true, true, b().c());
                }
            }
        } else {
            m().F().c("Dropping non-safelisted event. event name, origin", str6, str5);
        }
    }

    public final void f1(Bundle bundle) {
        if (d().t(zzbj.m1)) {
            f().D(new zzjs(this, bundle == null ? new Bundle() : new Bundle(bundle)));
        }
    }

    public final /* bridge */ /* synthetic */ zzbb g() {
        return super.g();
    }

    public final void g0(String str, String str2, long j2, Object obj) {
        f().D(new zzke(this, str, str2, obj, j2));
    }

    public final Bundle g1(Bundle bundle) {
        Bundle a2 = i().f26355A.a();
        for (String next : bundle.keySet()) {
            Object obj = bundle.get(next);
            if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                j();
                if (zzop.h0(obj)) {
                    j();
                    zzop.Y(this.f26641v, 27, (String) null, (String) null, 0);
                }
                m().M().c("Invalid default event parameter type. Name, value", next, obj);
            } else if (zzop.J0(next)) {
                m().M().b("Invalid default event parameter name. Name", next);
            } else if (obj == null) {
                a2.remove(next);
            } else if (j().l0("param", next, d().r((String) null, false), obj)) {
                j().O(a2, next, obj);
            }
        }
        j();
        if (zzop.g0(a2, d().K())) {
            j();
            zzop.Y(this.f26641v, 26, (String) null, (String) null, 0);
            m().M().a("Too many default event parameters set. Discarding beyond event parameter limit");
        }
        return a2;
    }

    public final /* bridge */ /* synthetic */ zzgh h() {
        return super.h();
    }

    public final void h0(String str, String str2, Bundle bundle) {
        long a2 = b().a();
        Preconditions.g(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str);
        bundle2.putLong("creation_timestamp", a2);
        if (str2 != null) {
            bundle2.putString("expired_event_name", str2);
            bundle2.putBundle("expired_event_params", bundle);
        }
        f().D(new zzkk(this, bundle2));
    }

    public final /* bridge */ /* synthetic */ zzgu i() {
        return super.i();
    }

    public final void i0(String str, String str2, Bundle bundle, String str3) {
        l();
        T0(str, str2, b().a(), bundle, false, true, true, str3);
    }

    public final /* bridge */ /* synthetic */ zzop j() {
        return super.j();
    }

    public final void j0(String str, String str2, Bundle bundle, boolean z2, boolean z3, long j2) {
        String str3 = str == null ? "app" : str;
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        String str4 = str2;
        if (Objects.equals(str2, "screen_view")) {
            s().I(bundle2, j2);
            return;
        }
        long j3 = j2;
        T0(str3, str2, j2, bundle2, z3, !z3 || this.f26623d == null || zzop.J0(str2), z2, (String) null);
    }

    public final /* bridge */ /* synthetic */ void k() {
        super.k();
    }

    public final void k0(String str, String str2, Object obj, long j2) {
        Preconditions.g(str);
        Preconditions.g(str2);
        n();
        v();
        if ("allow_personalized_ads".equals(str2)) {
            if (obj instanceof String) {
                String str3 = (String) obj;
                if (!TextUtils.isEmpty(str3)) {
                    String str4 = "false";
                    Long valueOf = Long.valueOf(str4.equals(str3.toLowerCase(Locale.ENGLISH)) ? 1 : 0);
                    zzha zzha = i().f26368o;
                    if (valueOf.longValue() == 1) {
                        str4 = "true";
                    }
                    zzha.b(str4);
                    obj = valueOf;
                    str2 = "_npa";
                    m().K().c("Setting user property(FE)", "non_personalized_ads(_npa)", obj);
                }
            }
            if (obj == null) {
                i().f26368o.b("unset");
                str2 = "_npa";
            }
            m().K().c("Setting user property(FE)", "non_personalized_ads(_npa)", obj);
        }
        String str5 = str2;
        Object obj2 = obj;
        if (!this.f26587a.p()) {
            m().K().a("User property not set since app measurement is disabled");
        } else if (this.f26587a.s()) {
            t().O(new zzok(str5, j2, obj2, str));
        }
    }

    public final /* bridge */ /* synthetic */ void l() {
        super.l();
    }

    public final void l0(String str, String str2, Object obj, boolean z2) {
        m0(str, str2, obj, z2, b().a());
    }

    public final /* bridge */ /* synthetic */ zzgi m() {
        return super.m();
    }

    public final void m0(String str, String str2, Object obj, boolean z2, long j2) {
        int i2;
        if (str == null) {
            str = "app";
        }
        String str3 = str;
        int i3 = 0;
        if (z2) {
            i2 = j().r0(str2);
        } else {
            zzop j3 = j();
            if (j3.C0("user property", str2)) {
                if (!j3.o0("user property", zzjh.f26610a, str2)) {
                    i2 = 15;
                } else if (j3.j0("user property", 24, str2)) {
                    i2 = 0;
                }
            }
            i2 = 6;
        }
        if (i2 != 0) {
            j();
            String J = zzop.J(str2, 24, true);
            if (str2 != null) {
                i3 = str2.length();
            }
            this.f26587a.L();
            zzop.Y(this.f26641v, i2, "_ev", J, i3);
        } else if (obj != null) {
            int w2 = j().w(str2, obj);
            if (w2 != 0) {
                j();
                String J2 = zzop.J(str2, 24, true);
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    i3 = String.valueOf(obj).length();
                }
                this.f26587a.L();
                zzop.Y(this.f26641v, w2, "_ev", J2, i3);
                return;
            }
            Object A0 = j().A0(str2, obj);
            if (A0 != null) {
                g0(str3, str2, j2, A0);
            }
        } else {
            g0(str3, str2, j2, (Object) null);
        }
    }

    public final /* bridge */ /* synthetic */ void n() {
        super.n();
    }

    public final /* synthetic */ void n0(List list) {
        n();
        if (Build.VERSION.SDK_INT >= 30) {
            SparseArray K = i().K();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                zznk zznk = (zznk) it.next();
                if (!K.contains(zznk.f26881B) || ((Long) K.get(zznk.f26881B)).longValue() < zznk.f26880A) {
                    A0().add(zznk);
                }
            }
            H0();
        }
    }

    public final /* bridge */ /* synthetic */ zza o() {
        return super.o();
    }

    public final /* synthetic */ void o0(AtomicReference atomicReference) {
        Bundle a2 = i().f26369p.a();
        zzlp t2 = t();
        if (a2 == null) {
            a2 = new Bundle();
        }
        t2.R(atomicReference, a2);
    }

    public final /* bridge */ /* synthetic */ zzgc p() {
        return super.p();
    }

    public final Application.ActivityLifecycleCallbacks p0() {
        return this.f26622c;
    }

    public final /* bridge */ /* synthetic */ zzgf q() {
        return super.q();
    }

    public final zzak q0() {
        n();
        return t().W();
    }

    public final /* bridge */ /* synthetic */ zzjk r() {
        return super.r();
    }

    public final Boolean r0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Boolean) f().v(atomicReference, 15000, "boolean test flag value", new zzjx(this, atomicReference));
    }

    public final /* bridge */ /* synthetic */ zzlg s() {
        return super.s();
    }

    public final Double s0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Double) f().v(atomicReference, 15000, "double test flag value", new zzkt(this, atomicReference));
    }

    public final /* bridge */ /* synthetic */ zzlp t() {
        return super.t();
    }

    public final Integer t0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Integer) f().v(atomicReference, 15000, "int test flag value", new zzkq(this, atomicReference));
    }

    public final /* bridge */ /* synthetic */ zznb u() {
        return super.u();
    }

    public final Long u0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Long) f().v(atomicReference, 15000, "long test flag value", new zzkr(this, atomicReference));
    }

    public final String v0() {
        return (String) this.f26626g.get();
    }

    public final String w0() {
        zzlh P = this.f26587a.I().P();
        if (P != null) {
            return P.f26739b;
        }
        return null;
    }

    public final String x0() {
        zzlh P = this.f26587a.I().P();
        if (P != null) {
            return P.f26738a;
        }
        return null;
    }

    public final String y0() {
        if (this.f26587a.M() != null) {
            return this.f26587a.M();
        }
        try {
            return new zzhq(a(), this.f26587a.P()).b("google_app_id");
        } catch (IllegalStateException e2) {
            this.f26587a.m().G().b("getGoogleAppId failed with exception", e2);
            return null;
        }
    }

    public final String z0() {
        AtomicReference atomicReference = new AtomicReference();
        return (String) f().v(atomicReference, 15000, "String test flag value", new zzkg(this, atomicReference));
    }
}
