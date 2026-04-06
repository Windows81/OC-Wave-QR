package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.measurement.zzdt;
import com.google.android.gms.internal.measurement.zzir;
import com.google.android.gms.internal.measurement.zzqn;
import java.net.URL;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

public class zzhw implements zzja {
    public static volatile zzhw I;

    /* renamed from: A  reason: collision with root package name */
    public volatile Boolean f26486A;

    /* renamed from: B  reason: collision with root package name */
    public Boolean f26487B;
    public Boolean C;
    public volatile boolean D;
    public int E;
    public int F;
    public AtomicInteger G = new AtomicInteger(0);
    public final long H;

    /* renamed from: a  reason: collision with root package name */
    public final Context f26488a;

    /* renamed from: b  reason: collision with root package name */
    public final String f26489b;

    /* renamed from: c  reason: collision with root package name */
    public final String f26490c;

    /* renamed from: d  reason: collision with root package name */
    public final String f26491d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f26492e;

    /* renamed from: f  reason: collision with root package name */
    public final zzac f26493f;

    /* renamed from: g  reason: collision with root package name */
    public final zzah f26494g;

    /* renamed from: h  reason: collision with root package name */
    public final zzgu f26495h;

    /* renamed from: i  reason: collision with root package name */
    public final zzgi f26496i;

    /* renamed from: j  reason: collision with root package name */
    public final zzhp f26497j;

    /* renamed from: k  reason: collision with root package name */
    public final zznb f26498k;

    /* renamed from: l  reason: collision with root package name */
    public final zzop f26499l;

    /* renamed from: m  reason: collision with root package name */
    public final zzgh f26500m;

    /* renamed from: n  reason: collision with root package name */
    public final Clock f26501n;

    /* renamed from: o  reason: collision with root package name */
    public final zzlg f26502o;

    /* renamed from: p  reason: collision with root package name */
    public final zzjk f26503p;

    /* renamed from: q  reason: collision with root package name */
    public final zza f26504q;

    /* renamed from: r  reason: collision with root package name */
    public final zzlb f26505r;

    /* renamed from: s  reason: collision with root package name */
    public final String f26506s;

    /* renamed from: t  reason: collision with root package name */
    public zzgf f26507t;

    /* renamed from: u  reason: collision with root package name */
    public zzlp f26508u;

    /* renamed from: v  reason: collision with root package name */
    public zzbb f26509v;

    /* renamed from: w  reason: collision with root package name */
    public zzgc f26510w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f26511x = false;

    /* renamed from: y  reason: collision with root package name */
    public Boolean f26512y;

    /* renamed from: z  reason: collision with root package name */
    public long f26513z;

    public zzhw(zzji zzji) {
        Bundle bundle;
        boolean z2 = false;
        Preconditions.m(zzji);
        zzac zzac = new zzac(zzji.f26612a);
        this.f26493f = zzac;
        zzfw.f26292a = zzac;
        Context context = zzji.f26612a;
        this.f26488a = context;
        this.f26489b = zzji.f26613b;
        this.f26490c = zzji.f26614c;
        this.f26491d = zzji.f26615d;
        this.f26492e = zzji.f26619h;
        this.f26486A = zzji.f26616e;
        this.f26506s = zzji.f26621j;
        this.D = true;
        zzdt zzdt = zzji.f26618g;
        if (!(zzdt == null || (bundle = zzdt.F) == null)) {
            Object obj = bundle.get("measurementEnabled");
            if (obj instanceof Boolean) {
                this.f26487B = (Boolean) obj;
            }
            Object obj2 = zzdt.F.get("measurementDeactivated");
            if (obj2 instanceof Boolean) {
                this.C = (Boolean) obj2;
            }
        }
        zzir.l(context);
        Clock d2 = DefaultClock.d();
        this.f26501n = d2;
        Long l2 = zzji.f26620i;
        this.H = l2 != null ? l2.longValue() : d2.a();
        this.f26494g = new zzah(this);
        zzgu zzgu = new zzgu(this);
        zzgu.q();
        this.f26495h = zzgu;
        zzgi zzgi = new zzgi(this);
        zzgi.q();
        this.f26496i = zzgi;
        zzop zzop = new zzop(this);
        zzop.q();
        this.f26499l = zzop;
        this.f26500m = new zzgh(new zzjl(zzji, this));
        this.f26504q = new zza(this);
        zzlg zzlg = new zzlg(this);
        zzlg.w();
        this.f26502o = zzlg;
        zzjk zzjk = new zzjk(this);
        zzjk.w();
        this.f26503p = zzjk;
        zznb zznb = new zznb(this);
        zznb.w();
        this.f26498k = zznb;
        zzlb zzlb = new zzlb(this);
        zzlb.q();
        this.f26505r = zzlb;
        zzhp zzhp = new zzhp(this);
        zzhp.q();
        this.f26497j = zzhp;
        zzdt zzdt2 = zzji.f26618g;
        if (!(zzdt2 == null || zzdt2.f25417A == 0)) {
            z2 = true;
        }
        boolean z3 = !z2;
        if (context.getApplicationContext() instanceof Application) {
            H().V0(z3);
        } else {
            m().L().a("Application context is not an Application");
        }
        zzhp.D(new zzhx(this, zzji));
    }

    public static zzhw c(Context context, zzdt zzdt, Long l2) {
        Bundle bundle;
        if (zzdt != null && (zzdt.D == null || zzdt.E == null)) {
            zzdt = new zzdt(zzdt.f25419z, zzdt.f25417A, zzdt.f25418B, zzdt.C, (String) null, (String) null, zzdt.F, (String) null);
        }
        Preconditions.m(context);
        Preconditions.m(context.getApplicationContext());
        if (I == null) {
            synchronized (zzhw.class) {
                try {
                    if (I == null) {
                        I = new zzhw(new zzji(context, zzdt, l2));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else if (!(zzdt == null || (bundle = zzdt.F) == null || !bundle.containsKey("dataCollectionDefaultEnabled"))) {
            Preconditions.m(I);
            I.l(zzdt.F.getBoolean("dataCollectionDefaultEnabled"));
        }
        Preconditions.m(I);
        return I;
    }

    public static void g(zzf zzf) {
        if (zzf == null) {
            throw new IllegalStateException("Component not created");
        } else if (!zzf.z()) {
            String valueOf = String.valueOf(zzf.getClass());
            throw new IllegalStateException("Component not initialized: " + valueOf);
        }
    }

    public static /* synthetic */ void h(zzhw zzhw, zzji zzji) {
        zzhw.f().n();
        zzbb zzbb = new zzbb(zzhw);
        zzbb.q();
        zzhw.f26509v = zzbb;
        zzgc zzgc = new zzgc(zzhw, zzji.f26617f);
        zzgc.w();
        zzhw.f26510w = zzgc;
        zzgf zzgf = new zzgf(zzhw);
        zzgf.w();
        zzhw.f26507t = zzgf;
        zzlp zzlp = new zzlp(zzhw);
        zzlp.w();
        zzhw.f26508u = zzlp;
        zzhw.f26499l.r();
        zzhw.f26495h.r();
        zzhw.f26510w.x();
        zzhw.m().J().b("App measurement initialized, version", 102001L);
        zzhw.m().J().a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
        String F2 = zzgc.F();
        if (TextUtils.isEmpty(zzhw.f26489b)) {
            if (zzhw.L().E0(F2, zzhw.f26494g.X())) {
                zzhw.m().J().a("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
            } else {
                zzgk J = zzhw.m().J();
                J.a("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app " + F2);
            }
        }
        zzhw.m().F().a("Debug-level message logging enabled");
        if (zzhw.E != zzhw.G.get()) {
            zzhw.m().G().c("Not all components initialized", Integer.valueOf(zzhw.E), Integer.valueOf(zzhw.G.get()));
        }
        zzhw.f26511x = true;
    }

    public static void i(zzix zzix) {
        if (zzix == null) {
            throw new IllegalStateException("Component not created");
        } else if (!zzix.s()) {
            String valueOf = String.valueOf(zzix.getClass());
            throw new IllegalStateException("Component not initialized: " + valueOf);
        }
    }

    public static void j(zziy zziy) {
        if (zziy == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    public final zzbb A() {
        i(this.f26509v);
        return this.f26509v;
    }

    public final zzgc B() {
        g(this.f26510w);
        return this.f26510w;
    }

    public final zzgf C() {
        g(this.f26507t);
        return this.f26507t;
    }

    public final zzgh D() {
        return this.f26500m;
    }

    public final zzgi E() {
        zzgi zzgi = this.f26496i;
        if (zzgi == null || !zzgi.s()) {
            return null;
        }
        return this.f26496i;
    }

    public final zzgu F() {
        j(this.f26495h);
        return this.f26495h;
    }

    public final zzhp G() {
        return this.f26497j;
    }

    public final zzjk H() {
        g(this.f26503p);
        return this.f26503p;
    }

    public final zzlg I() {
        g(this.f26502o);
        return this.f26502o;
    }

    public final zzlp J() {
        g(this.f26508u);
        return this.f26508u;
    }

    public final zznb K() {
        g(this.f26498k);
        return this.f26498k;
    }

    public final zzop L() {
        j(this.f26499l);
        return this.f26499l;
    }

    public final String M() {
        return this.f26489b;
    }

    public final String N() {
        return this.f26490c;
    }

    public final String O() {
        return this.f26491d;
    }

    public final String P() {
        return this.f26506s;
    }

    public final void Q() {
        throw new IllegalStateException("Unexpected call on client side");
    }

    public final void R() {
        this.G.incrementAndGet();
    }

    public final Context a() {
        return this.f26488a;
    }

    public final Clock b() {
        return this.f26501n;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00ec, code lost:
        if (r1.C() != false) goto L_0x0165;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0161, code lost:
        if (r1.C() != false) goto L_0x0165;
     */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x029c  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x029e  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x02a4  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x02cf  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x02fc  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0381  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0167  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x019f  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01db  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x020d A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x024c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d(com.google.android.gms.internal.measurement.zzdt r13) {
        /*
            r12 = this;
            com.google.android.gms.measurement.internal.zzhp r0 = r12.f()
            r0.n()
            boolean r0 = com.google.android.gms.internal.measurement.zzrl.a()
            if (r0 == 0) goto L_0x004e
            com.google.android.gms.measurement.internal.zzah r0 = r12.f26494g
            com.google.android.gms.measurement.internal.zzfz r1 = com.google.android.gms.measurement.internal.zzbj.I0
            boolean r0 = r0.t(r1)
            if (r0 == 0) goto L_0x004e
            com.google.android.gms.measurement.internal.zzop r0 = r12.L()
            boolean r0 = r0.X0()
            if (r0 == 0) goto L_0x004e
            com.google.android.gms.measurement.internal.zzop r0 = r12.L()
            r0.n()
            android.content.IntentFilter r1 = new android.content.IntentFilter
            r1.<init>()
            java.lang.String r2 = "com.google.android.gms.measurement.TRIGGERS_AVAILABLE"
            r1.addAction(r2)
            com.google.android.gms.measurement.internal.zzr r2 = new com.google.android.gms.measurement.internal.zzr
            com.google.android.gms.measurement.internal.zzhw r3 = r0.f26587a
            r2.<init>(r3)
            android.content.Context r3 = r0.a()
            r4 = 2
            androidx.core.content.ContextCompat.j(r3, r2, r1, r4)
            com.google.android.gms.measurement.internal.zzgi r0 = r0.m()
            com.google.android.gms.measurement.internal.zzgk r0 = r0.F()
            java.lang.String r1 = "Registered app receiver"
            r0.a(r1)
        L_0x004e:
            com.google.android.gms.measurement.internal.zzgu r0 = r12.F()
            com.google.android.gms.measurement.internal.zzjc r0 = r0.M()
            int r1 = r0.b()
            boolean r2 = com.google.android.gms.internal.measurement.zzox.a()
            r3 = 40
            r4 = 10
            java.lang.String r5 = "google_analytics_default_allow_analytics_storage"
            java.lang.String r6 = "google_analytics_default_allow_ad_storage"
            r7 = 0
            r8 = 0
            r9 = -10
            r10 = 30
            if (r2 == 0) goto L_0x00f0
            com.google.android.gms.measurement.internal.zzah r2 = r12.f26494g
            com.google.android.gms.measurement.internal.zzfz r11 = com.google.android.gms.measurement.internal.zzbj.Y0
            boolean r2 = r2.t(r11)
            if (r2 == 0) goto L_0x00f0
            com.google.android.gms.measurement.internal.zzah r2 = r12.f26494g
            com.google.android.gms.measurement.internal.zzjb r2 = r2.D(r6, r7)
            com.google.android.gms.measurement.internal.zzah r6 = r12.f26494g
            com.google.android.gms.measurement.internal.zzjb r5 = r6.D(r5, r7)
            com.google.android.gms.measurement.internal.zzjb r6 = com.google.android.gms.measurement.internal.zzjb.UNINITIALIZED
            if (r2 != r6) goto L_0x008a
            if (r5 == r6) goto L_0x009a
        L_0x008a:
            com.google.android.gms.measurement.internal.zzgu r6 = r12.F()
            boolean r6 = r6.y(r9)
            if (r6 == 0) goto L_0x009a
            com.google.android.gms.measurement.internal.zzjc r1 = com.google.android.gms.measurement.internal.zzjc.g(r2, r5, r9)
            goto L_0x0165
        L_0x009a:
            com.google.android.gms.measurement.internal.zzgc r2 = r12.B()
            java.lang.String r2 = r2.G()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x00c4
            if (r1 == 0) goto L_0x00b4
            if (r1 == r10) goto L_0x00b4
            if (r1 == r4) goto L_0x00b4
            if (r1 == r10) goto L_0x00b4
            if (r1 == r10) goto L_0x00b4
            if (r1 != r3) goto L_0x00c4
        L_0x00b4:
            com.google.android.gms.measurement.internal.zzjk r1 = r12.H()
            com.google.android.gms.measurement.internal.zzjc r2 = new com.google.android.gms.measurement.internal.zzjc
            r2.<init>(r8, r8, r9)
            long r3 = r12.H
            r1.S(r2, r3, r7)
            goto L_0x0164
        L_0x00c4:
            com.google.android.gms.measurement.internal.zzgc r1 = r12.B()
            java.lang.String r1 = r1.G()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x0164
            if (r13 == 0) goto L_0x0164
            android.os.Bundle r1 = r13.F
            if (r1 == 0) goto L_0x0164
            com.google.android.gms.measurement.internal.zzgu r1 = r12.F()
            boolean r1 = r1.y(r10)
            if (r1 == 0) goto L_0x0164
            android.os.Bundle r1 = r13.F
            com.google.android.gms.measurement.internal.zzjc r1 = com.google.android.gms.measurement.internal.zzjc.f(r1, r10)
            boolean r2 = r1.C()
            if (r2 == 0) goto L_0x0164
            goto L_0x0165
        L_0x00f0:
            com.google.android.gms.measurement.internal.zzah r2 = r12.f26494g
            java.lang.Boolean r2 = r2.G(r6)
            com.google.android.gms.measurement.internal.zzah r6 = r12.f26494g
            java.lang.Boolean r5 = r6.G(r5)
            if (r2 != 0) goto L_0x0100
            if (r5 == 0) goto L_0x0110
        L_0x0100:
            com.google.android.gms.measurement.internal.zzgu r6 = r12.F()
            boolean r6 = r6.y(r9)
            if (r6 == 0) goto L_0x0110
            com.google.android.gms.measurement.internal.zzjc r1 = new com.google.android.gms.measurement.internal.zzjc
            r1.<init>(r2, r5, r9)
            goto L_0x0165
        L_0x0110:
            com.google.android.gms.measurement.internal.zzgc r2 = r12.B()
            java.lang.String r2 = r2.G()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x0139
            if (r1 == 0) goto L_0x012a
            if (r1 == r10) goto L_0x012a
            if (r1 == r4) goto L_0x012a
            if (r1 == r10) goto L_0x012a
            if (r1 == r10) goto L_0x012a
            if (r1 != r3) goto L_0x0139
        L_0x012a:
            com.google.android.gms.measurement.internal.zzjk r1 = r12.H()
            com.google.android.gms.measurement.internal.zzjc r2 = new com.google.android.gms.measurement.internal.zzjc
            r2.<init>(r8, r8, r9)
            long r3 = r12.H
            r1.S(r2, r3, r7)
            goto L_0x0164
        L_0x0139:
            com.google.android.gms.measurement.internal.zzgc r1 = r12.B()
            java.lang.String r1 = r1.G()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x0164
            if (r13 == 0) goto L_0x0164
            android.os.Bundle r1 = r13.F
            if (r1 == 0) goto L_0x0164
            com.google.android.gms.measurement.internal.zzgu r1 = r12.F()
            boolean r1 = r1.y(r10)
            if (r1 == 0) goto L_0x0164
            android.os.Bundle r1 = r13.F
            com.google.android.gms.measurement.internal.zzjc r1 = com.google.android.gms.measurement.internal.zzjc.f(r1, r10)
            boolean r2 = r1.C()
            if (r2 == 0) goto L_0x0164
            goto L_0x0165
        L_0x0164:
            r1 = r8
        L_0x0165:
            if (r1 == 0) goto L_0x0179
            com.google.android.gms.measurement.internal.zzjk r0 = r12.H()
            long r2 = r12.H
            com.google.android.gms.measurement.internal.zzah r4 = r12.f26494g
            com.google.android.gms.measurement.internal.zzfz r5 = com.google.android.gms.measurement.internal.zzbj.b1
            boolean r4 = r4.t(r5)
            r0.S(r1, r2, r4)
            r0 = r1
        L_0x0179:
            com.google.android.gms.measurement.internal.zzjk r1 = r12.H()
            r1.R(r0)
            com.google.android.gms.measurement.internal.zzgu r0 = r12.F()
            com.google.android.gms.measurement.internal.zzaz r0 = r0.L()
            int r0 = r0.a()
            boolean r1 = com.google.android.gms.internal.measurement.zzox.a()
            java.lang.String r2 = "google_analytics_default_allow_ad_user_data"
            r3 = 1
            if (r1 == 0) goto L_0x01db
            com.google.android.gms.measurement.internal.zzah r1 = r12.f26494g
            com.google.android.gms.measurement.internal.zzfz r4 = com.google.android.gms.measurement.internal.zzbj.Y0
            boolean r1 = r1.t(r4)
            if (r1 == 0) goto L_0x01db
            com.google.android.gms.measurement.internal.zzah r1 = r12.f26494g
            java.lang.String r4 = "google_analytics_default_allow_ad_personalization_signals"
            com.google.android.gms.measurement.internal.zzjb r1 = r1.D(r4, r3)
            com.google.android.gms.measurement.internal.zzjb r4 = com.google.android.gms.measurement.internal.zzjb.UNINITIALIZED
            if (r1 == r4) goto L_0x01b8
            com.google.android.gms.measurement.internal.zzgi r5 = r12.m()
            com.google.android.gms.measurement.internal.zzgk r5 = r5.K()
            java.lang.String r6 = "Default ad personalization consent from Manifest"
            r5.b(r6, r1)
        L_0x01b8:
            com.google.android.gms.measurement.internal.zzah r1 = r12.f26494g
            com.google.android.gms.measurement.internal.zzjb r1 = r1.D(r2, r3)
            if (r1 == r4) goto L_0x01ff
            boolean r2 = com.google.android.gms.measurement.internal.zzjc.l(r9, r0)
            if (r2 == 0) goto L_0x01ff
            com.google.android.gms.measurement.internal.zzjk r13 = r12.H()
            com.google.android.gms.measurement.internal.zzaz r0 = com.google.android.gms.measurement.internal.zzaz.c(r1, r9)
            com.google.android.gms.measurement.internal.zzah r1 = r12.f26494g
            com.google.android.gms.measurement.internal.zzfz r2 = com.google.android.gms.measurement.internal.zzbj.b1
            boolean r1 = r1.t(r2)
            r13.Q(r0, r1)
            goto L_0x0292
        L_0x01db:
            com.google.android.gms.measurement.internal.zzah r1 = r12.f26494g
            java.lang.Boolean r1 = r1.G(r2)
            if (r1 == 0) goto L_0x01ff
            boolean r2 = com.google.android.gms.measurement.internal.zzjc.l(r9, r0)
            if (r2 == 0) goto L_0x01ff
            com.google.android.gms.measurement.internal.zzjk r13 = r12.H()
            com.google.android.gms.measurement.internal.zzaz r0 = new com.google.android.gms.measurement.internal.zzaz
            r0.<init>(r1, r9)
            com.google.android.gms.measurement.internal.zzah r1 = r12.f26494g
            com.google.android.gms.measurement.internal.zzfz r2 = com.google.android.gms.measurement.internal.zzbj.b1
            boolean r1 = r1.t(r2)
            r13.Q(r0, r1)
            goto L_0x0292
        L_0x01ff:
            com.google.android.gms.measurement.internal.zzgc r1 = r12.B()
            java.lang.String r1 = r1.G()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x0226
            if (r0 == 0) goto L_0x0211
            if (r0 != r10) goto L_0x0226
        L_0x0211:
            com.google.android.gms.measurement.internal.zzjk r13 = r12.H()
            com.google.android.gms.measurement.internal.zzaz r0 = new com.google.android.gms.measurement.internal.zzaz
            r0.<init>(r8, r9)
            com.google.android.gms.measurement.internal.zzah r1 = r12.f26494g
            com.google.android.gms.measurement.internal.zzfz r2 = com.google.android.gms.measurement.internal.zzbj.b1
            boolean r1 = r1.t(r2)
            r13.Q(r0, r1)
            goto L_0x0292
        L_0x0226:
            com.google.android.gms.measurement.internal.zzgc r1 = r12.B()
            java.lang.String r1 = r1.G()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x025b
            if (r13 == 0) goto L_0x025b
            android.os.Bundle r1 = r13.F
            if (r1 == 0) goto L_0x025b
            boolean r0 = com.google.android.gms.measurement.internal.zzjc.l(r10, r0)
            if (r0 == 0) goto L_0x025b
            android.os.Bundle r0 = r13.F
            com.google.android.gms.measurement.internal.zzaz r0 = com.google.android.gms.measurement.internal.zzaz.b(r0, r10)
            boolean r1 = r0.k()
            if (r1 == 0) goto L_0x025b
            com.google.android.gms.measurement.internal.zzjk r1 = r12.H()
            com.google.android.gms.measurement.internal.zzah r2 = r12.f26494g
            com.google.android.gms.measurement.internal.zzfz r4 = com.google.android.gms.measurement.internal.zzbj.b1
            boolean r2 = r2.t(r4)
            r1.Q(r0, r2)
        L_0x025b:
            com.google.android.gms.measurement.internal.zzgc r0 = r12.B()
            java.lang.String r0 = r0.G()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0292
            if (r13 == 0) goto L_0x0292
            android.os.Bundle r0 = r13.F
            if (r0 == 0) goto L_0x0292
            com.google.android.gms.measurement.internal.zzgu r0 = r12.F()
            com.google.android.gms.measurement.internal.zzha r0 = r0.f26368o
            java.lang.String r0 = r0.a()
            if (r0 != 0) goto L_0x0292
            android.os.Bundle r0 = r13.F
            java.lang.Boolean r0 = com.google.android.gms.measurement.internal.zzaz.e(r0)
            if (r0 == 0) goto L_0x0292
            com.google.android.gms.measurement.internal.zzjk r1 = r12.H()
            java.lang.String r13 = r13.D
            java.lang.String r2 = "allow_personalized_ads"
            java.lang.String r0 = r0.toString()
            r1.l0(r13, r2, r0, r7)
        L_0x0292:
            com.google.android.gms.measurement.internal.zzah r13 = r12.f26494g
            java.lang.String r0 = "google_analytics_tcf_data_enabled"
            java.lang.Boolean r13 = r13.G(r0)
            if (r13 != 0) goto L_0x029e
            r13 = r3
            goto L_0x02a2
        L_0x029e:
            boolean r13 = r13.booleanValue()
        L_0x02a2:
            if (r13 == 0) goto L_0x02bf
            com.google.android.gms.measurement.internal.zzgi r13 = r12.m()
            com.google.android.gms.measurement.internal.zzgk r13 = r13.F()
            java.lang.String r0 = "TCF client enabled."
            r13.a(r0)
            com.google.android.gms.measurement.internal.zzjk r13 = r12.H()
            r13.I0()
            com.google.android.gms.measurement.internal.zzjk r13 = r12.H()
            r13.G0()
        L_0x02bf:
            com.google.android.gms.measurement.internal.zzgu r13 = r12.F()
            com.google.android.gms.measurement.internal.zzgz r13 = r13.f26360g
            long r0 = r13.a()
            r4 = 0
            int r13 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r13 != 0) goto L_0x02ed
            com.google.android.gms.measurement.internal.zzgi r13 = r12.m()
            com.google.android.gms.measurement.internal.zzgk r13 = r13.K()
            long r0 = r12.H
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.String r1 = "Persisting first open"
            r13.b(r1, r0)
            com.google.android.gms.measurement.internal.zzgu r13 = r12.F()
            com.google.android.gms.measurement.internal.zzgz r13 = r13.f26360g
            long r0 = r12.H
            r13.b(r0)
        L_0x02ed:
            com.google.android.gms.measurement.internal.zzjk r13 = r12.H()
            com.google.android.gms.measurement.internal.zzs r13 = r13.f26636q
            r13.c()
            boolean r13 = r12.s()
            if (r13 != 0) goto L_0x0381
            boolean r13 = r12.p()
            if (r13 == 0) goto L_0x04e1
            com.google.android.gms.measurement.internal.zzop r13 = r12.L()
            java.lang.String r0 = "android.permission.INTERNET"
            boolean r13 = r13.F0(r0)
            if (r13 != 0) goto L_0x031b
            com.google.android.gms.measurement.internal.zzgi r13 = r12.m()
            com.google.android.gms.measurement.internal.zzgk r13 = r13.G()
            java.lang.String r0 = "App is missing INTERNET permission"
            r13.a(r0)
        L_0x031b:
            com.google.android.gms.measurement.internal.zzop r13 = r12.L()
            java.lang.String r0 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r13 = r13.F0(r0)
            if (r13 != 0) goto L_0x0334
            com.google.android.gms.measurement.internal.zzgi r13 = r12.m()
            com.google.android.gms.measurement.internal.zzgk r13 = r13.G()
            java.lang.String r0 = "App is missing ACCESS_NETWORK_STATE permission"
            r13.a(r0)
        L_0x0334:
            android.content.Context r13 = r12.f26488a
            com.google.android.gms.common.wrappers.PackageManagerWrapper r13 = com.google.android.gms.common.wrappers.Wrappers.a(r13)
            boolean r13 = r13.e()
            if (r13 != 0) goto L_0x0372
            com.google.android.gms.measurement.internal.zzah r13 = r12.f26494g
            boolean r13 = r13.u()
            if (r13 != 0) goto L_0x0372
            android.content.Context r13 = r12.f26488a
            boolean r13 = com.google.android.gms.measurement.internal.zzop.d0(r13)
            if (r13 != 0) goto L_0x035d
            com.google.android.gms.measurement.internal.zzgi r13 = r12.m()
            com.google.android.gms.measurement.internal.zzgk r13 = r13.G()
            java.lang.String r0 = "AppMeasurementReceiver not registered/enabled"
            r13.a(r0)
        L_0x035d:
            android.content.Context r13 = r12.f26488a
            boolean r13 = com.google.android.gms.measurement.internal.zzop.e0(r13, r7)
            if (r13 != 0) goto L_0x0372
            com.google.android.gms.measurement.internal.zzgi r13 = r12.m()
            com.google.android.gms.measurement.internal.zzgk r13 = r13.G()
            java.lang.String r0 = "AppMeasurementService not registered/enabled"
            r13.a(r0)
        L_0x0372:
            com.google.android.gms.measurement.internal.zzgi r13 = r12.m()
            com.google.android.gms.measurement.internal.zzgk r13 = r13.G()
            java.lang.String r0 = "Uploading is not possible. App measurement disabled"
            r13.a(r0)
            goto L_0x04e1
        L_0x0381:
            com.google.android.gms.measurement.internal.zzgc r13 = r12.B()
            java.lang.String r13 = r13.G()
            boolean r13 = android.text.TextUtils.isEmpty(r13)
            if (r13 == 0) goto L_0x039d
            com.google.android.gms.measurement.internal.zzgc r13 = r12.B()
            java.lang.String r13 = r13.E()
            boolean r13 = android.text.TextUtils.isEmpty(r13)
            if (r13 != 0) goto L_0x041d
        L_0x039d:
            r12.L()
            com.google.android.gms.measurement.internal.zzgc r13 = r12.B()
            java.lang.String r13 = r13.G()
            com.google.android.gms.measurement.internal.zzgu r0 = r12.F()
            java.lang.String r0 = r0.S()
            com.google.android.gms.measurement.internal.zzgc r1 = r12.B()
            java.lang.String r1 = r1.E()
            com.google.android.gms.measurement.internal.zzgu r2 = r12.F()
            java.lang.String r2 = r2.R()
            boolean r13 = com.google.android.gms.measurement.internal.zzop.m0(r13, r0, r1, r2)
            if (r13 == 0) goto L_0x03ff
            com.google.android.gms.measurement.internal.zzgi r13 = r12.m()
            com.google.android.gms.measurement.internal.zzgk r13 = r13.J()
            java.lang.String r0 = "Rechecking which service to use due to a GMP App Id change"
            r13.a(r0)
            com.google.android.gms.measurement.internal.zzgu r13 = r12.F()
            r13.T()
            com.google.android.gms.measurement.internal.zzgf r13 = r12.C()
            r13.H()
            com.google.android.gms.measurement.internal.zzlp r13 = r12.f26508u
            r13.b0()
            com.google.android.gms.measurement.internal.zzlp r13 = r12.f26508u
            r13.a0()
            com.google.android.gms.measurement.internal.zzgu r13 = r12.F()
            com.google.android.gms.measurement.internal.zzgz r13 = r13.f26360g
            long r0 = r12.H
            r13.b(r0)
            com.google.android.gms.measurement.internal.zzgu r13 = r12.F()
            com.google.android.gms.measurement.internal.zzha r13 = r13.f26362i
            r13.b(r8)
        L_0x03ff:
            com.google.android.gms.measurement.internal.zzgu r13 = r12.F()
            com.google.android.gms.measurement.internal.zzgc r0 = r12.B()
            java.lang.String r0 = r0.G()
            r13.I(r0)
            com.google.android.gms.measurement.internal.zzgu r13 = r12.F()
            com.google.android.gms.measurement.internal.zzgc r0 = r12.B()
            java.lang.String r0 = r0.E()
            r13.F(r0)
        L_0x041d:
            com.google.android.gms.measurement.internal.zzgu r13 = r12.F()
            com.google.android.gms.measurement.internal.zzjc r13 = r13.M()
            com.google.android.gms.measurement.internal.zzjc$zza r0 = com.google.android.gms.measurement.internal.zzjc.zza.ANALYTICS_STORAGE
            boolean r13 = r13.m(r0)
            if (r13 != 0) goto L_0x0436
            com.google.android.gms.measurement.internal.zzgu r13 = r12.F()
            com.google.android.gms.measurement.internal.zzha r13 = r13.f26362i
            r13.b(r8)
        L_0x0436:
            com.google.android.gms.measurement.internal.zzjk r13 = r12.H()
            com.google.android.gms.measurement.internal.zzgu r0 = r12.F()
            com.google.android.gms.measurement.internal.zzha r0 = r0.f26362i
            java.lang.String r0 = r0.a()
            r13.a1(r0)
            com.google.android.gms.measurement.internal.zzop r13 = r12.L()
            boolean r13 = r13.Y0()
            if (r13 != 0) goto L_0x0477
            com.google.android.gms.measurement.internal.zzgu r13 = r12.F()
            com.google.android.gms.measurement.internal.zzha r13 = r13.f26377x
            java.lang.String r13 = r13.a()
            boolean r13 = android.text.TextUtils.isEmpty(r13)
            if (r13 != 0) goto L_0x0477
            com.google.android.gms.measurement.internal.zzgi r13 = r12.m()
            com.google.android.gms.measurement.internal.zzgk r13 = r13.L()
            java.lang.String r0 = "Remote config removed with active feature rollouts"
            r13.a(r0)
            com.google.android.gms.measurement.internal.zzgu r13 = r12.F()
            com.google.android.gms.measurement.internal.zzha r13 = r13.f26377x
            r13.b(r8)
        L_0x0477:
            com.google.android.gms.measurement.internal.zzgc r13 = r12.B()
            java.lang.String r13 = r13.G()
            boolean r13 = android.text.TextUtils.isEmpty(r13)
            if (r13 == 0) goto L_0x0493
            com.google.android.gms.measurement.internal.zzgc r13 = r12.B()
            java.lang.String r13 = r13.E()
            boolean r13 = android.text.TextUtils.isEmpty(r13)
            if (r13 != 0) goto L_0x04e1
        L_0x0493:
            boolean r13 = r12.p()
            com.google.android.gms.measurement.internal.zzgu r0 = r12.F()
            boolean r0 = r0.D()
            if (r0 != 0) goto L_0x04b2
            com.google.android.gms.measurement.internal.zzah r0 = r12.f26494g
            boolean r0 = r0.a0()
            if (r0 != 0) goto L_0x04b2
            com.google.android.gms.measurement.internal.zzgu r0 = r12.F()
            r1 = r13 ^ 1
            r0.G(r1)
        L_0x04b2:
            if (r13 == 0) goto L_0x04bb
            com.google.android.gms.measurement.internal.zzjk r13 = r12.H()
            r13.C0()
        L_0x04bb:
            com.google.android.gms.measurement.internal.zznb r13 = r12.K()
            com.google.android.gms.measurement.internal.zznj r13 = r13.f26861e
            r13.a()
            com.google.android.gms.measurement.internal.zzlp r13 = r12.J()
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            r13.Q(r0)
            com.google.android.gms.measurement.internal.zzlp r13 = r12.J()
            com.google.android.gms.measurement.internal.zzgu r0 = r12.F()
            com.google.android.gms.measurement.internal.zzgw r0 = r0.f26355A
            android.os.Bundle r0 = r0.a()
            r13.C(r0)
        L_0x04e1:
            boolean r13 = com.google.android.gms.internal.measurement.zzrl.a()
            if (r13 == 0) goto L_0x050f
            com.google.android.gms.measurement.internal.zzah r13 = r12.f26494g
            com.google.android.gms.measurement.internal.zzfz r0 = com.google.android.gms.measurement.internal.zzbj.I0
            boolean r13 = r13.t(r0)
            if (r13 == 0) goto L_0x050f
            com.google.android.gms.measurement.internal.zzop r13 = r12.L()
            boolean r13 = r13.X0()
            if (r13 == 0) goto L_0x050f
            java.lang.Thread r13 = new java.lang.Thread
            com.google.android.gms.measurement.internal.zzjk r0 = r12.H()
            java.util.Objects.requireNonNull(r0)
            com.google.android.gms.measurement.internal.zzhv r1 = new com.google.android.gms.measurement.internal.zzhv
            r1.<init>(r0)
            r13.<init>(r1)
            r13.start()
        L_0x050f:
            com.google.android.gms.measurement.internal.zzgu r13 = r12.F()
            com.google.android.gms.measurement.internal.zzgx r13 = r13.f26370q
            r13.a(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzhw.d(com.google.android.gms.internal.measurement.zzdt):void");
    }

    public final zzac e() {
        return this.f26493f;
    }

    public final zzhp f() {
        i(this.f26497j);
        return this.f26497j;
    }

    public final /* synthetic */ void k(String str, int i2, Throwable th, byte[] bArr, Map map) {
        if ((i2 == 200 || i2 == 204 || i2 == 304) && th == null) {
            F().f26375v.a(true);
            if (bArr == null || bArr.length == 0) {
                m().F().a("Deferred Deep Link response empty.");
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(new String(bArr));
                String optString = jSONObject.optString("deeplink", "");
                if (TextUtils.isEmpty(optString)) {
                    m().F().a("Deferred Deep Link is empty.");
                    return;
                }
                String optString2 = jSONObject.optString("gclid", "");
                String optString3 = jSONObject.optString("gbraid", "");
                String optString4 = jSONObject.optString("gad_source", "");
                double optDouble = jSONObject.optDouble("timestamp", 0.0d);
                Bundle bundle = new Bundle();
                if (!zzqn.a() || !this.f26494g.t(zzbj.T0)) {
                    if (!L().M0(optString)) {
                        m().L().c("Deferred Deep Link validation failed. gclid, deep link", optString2, optString);
                        return;
                    }
                } else if (!L().M0(optString)) {
                    m().L().d("Deferred Deep Link validation failed. gclid, gbraid, deep link", optString2, optString3, optString);
                    return;
                } else {
                    if (!TextUtils.isEmpty(optString3)) {
                        bundle.putString("gbraid", optString3);
                    }
                    if (!TextUtils.isEmpty(optString4)) {
                        bundle.putString("gad_source", optString4);
                    }
                }
                if (zzqn.a()) {
                    this.f26494g.t(zzbj.T0);
                }
                bundle.putString("gclid", optString2);
                bundle.putString("_cis", "ddp");
                this.f26503p.b1("auto", "_cmp", bundle);
                zzop L = L();
                if (!TextUtils.isEmpty(optString) && L.i0(optString, optDouble)) {
                    L.a().sendBroadcast(new Intent("android.google.analytics.action.DEEPLINK_ACTION"));
                }
            } catch (JSONException e2) {
                m().G().b("Failed to parse the Deferred Deep Link response. exception", e2);
            }
        } else {
            m().L().c("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i2), th);
        }
    }

    public final void l(boolean z2) {
        this.f26486A = Boolean.valueOf(z2);
    }

    public final zzgi m() {
        i(this.f26496i);
        return this.f26496i;
    }

    public final void n() {
        this.E++;
    }

    public final boolean o() {
        return this.f26486A != null && this.f26486A.booleanValue();
    }

    public final boolean p() {
        return x() == 0;
    }

    public final boolean q() {
        f().n();
        return this.D;
    }

    public final boolean r() {
        return TextUtils.isEmpty(this.f26489b);
    }

    public final boolean s() {
        if (this.f26511x) {
            f().n();
            Boolean bool = this.f26512y;
            if (bool == null || this.f26513z == 0 || (bool != null && !bool.booleanValue() && Math.abs(this.f26501n.c() - this.f26513z) > 1000)) {
                this.f26513z = this.f26501n.c();
                boolean z2 = true;
                Boolean valueOf = Boolean.valueOf(L().F0("android.permission.INTERNET") && L().F0("android.permission.ACCESS_NETWORK_STATE") && (Wrappers.a(this.f26488a).e() || this.f26494g.u() || (zzop.d0(this.f26488a) && zzop.e0(this.f26488a, false))));
                this.f26512y = valueOf;
                if (valueOf.booleanValue()) {
                    if (!L().k0(B().G(), B().E()) && TextUtils.isEmpty(B().E())) {
                        z2 = false;
                    }
                    this.f26512y = Boolean.valueOf(z2);
                }
            }
            return this.f26512y.booleanValue();
        }
        throw new IllegalStateException("AppMeasurement is not initialized");
    }

    public final boolean t() {
        return this.f26492e;
    }

    public final boolean u() {
        f().n();
        i(v());
        String F2 = B().F();
        Pair u2 = F().u(F2);
        boolean z2 = false;
        if (!this.f26494g.Y() || ((Boolean) u2.second).booleanValue() || TextUtils.isEmpty((CharSequence) u2.first)) {
            m().F().a("ADID unavailable to retrieve Deferred Deep Link. Skipping");
            return false;
        } else if (!v().w()) {
            m().L().a("Network is not available for Deferred Deep Link request. Skipping");
            return false;
        } else {
            StringBuilder sb = new StringBuilder();
            zzlp J = J();
            J.n();
            J.v();
            if (!J.l0() || J.j().I0() >= 234200) {
                zzak q0 = H().q0();
                Bundle bundle = q0 != null ? q0.f26182z : null;
                int i2 = 1;
                if (bundle == null) {
                    int i3 = this.F;
                    this.F = i3 + 1;
                    if (i3 < 10) {
                        z2 = true;
                    }
                    m().F().b("Failed to retrieve DMA consent from the service, " + (z2 ? "Retrying." : "Skipping.") + " retryCount", Integer.valueOf(this.F));
                    return z2;
                }
                zzjc f2 = zzjc.f(bundle, 100);
                sb.append("&gcs=");
                sb.append(f2.y());
                zzaz b2 = zzaz.b(bundle, 100);
                sb.append("&dma=");
                sb.append(b2.h() == Boolean.FALSE ? 0 : 1);
                if (!TextUtils.isEmpty(b2.i())) {
                    sb.append("&dma_cps=");
                    sb.append(b2.i());
                }
                if (zzaz.e(bundle) == Boolean.TRUE) {
                    i2 = 0;
                }
                sb.append("&npa=");
                sb.append(i2);
                m().K().b("Consent query parameters to Bow", sb);
            }
            zzop L = L();
            B();
            URL K = L.K(102001, F2, (String) u2.first, F().f26376w.a() - 1, sb.toString());
            if (K != null) {
                zzlb v2 = v();
                zzhy zzhy = new zzhy(this);
                v2.n();
                v2.p();
                Preconditions.m(K);
                Preconditions.m(zzhy);
                v2.f().z(new zzld(v2, F2, K, (byte[]) null, (Map) null, zzhy));
            }
            return false;
        }
    }

    public final zzlb v() {
        i(this.f26505r);
        return this.f26505r;
    }

    public final void w(boolean z2) {
        f().n();
        this.D = z2;
    }

    public final int x() {
        f().n();
        if (this.f26494g.a0()) {
            return 1;
        }
        Boolean bool = this.C;
        if (bool != null && bool.booleanValue()) {
            return 2;
        }
        if (!q()) {
            return 8;
        }
        Boolean P = F().P();
        if (P != null) {
            return P.booleanValue() ? 0 : 3;
        }
        Boolean G2 = this.f26494g.G("firebase_analytics_collection_enabled");
        if (G2 != null) {
            return G2.booleanValue() ? 0 : 4;
        }
        Boolean bool2 = this.f26487B;
        return bool2 != null ? bool2.booleanValue() ? 0 : 5 : (this.f26486A == null || this.f26486A.booleanValue()) ? 0 : 7;
    }

    public final zza y() {
        zza zza = this.f26504q;
        if (zza != null) {
            return zza;
        }
        throw new IllegalStateException("Component not created");
    }

    public final zzah z() {
        return this.f26494g;
    }
}
