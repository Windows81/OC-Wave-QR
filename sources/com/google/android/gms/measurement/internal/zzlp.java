package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.measurement.zzdl;
import com.google.android.gms.internal.measurement.zzpd;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public final class zzlp extends zzf {

    /* renamed from: c  reason: collision with root package name */
    public final zzmm f26758c;

    /* renamed from: d  reason: collision with root package name */
    public zzgb f26759d;

    /* renamed from: e  reason: collision with root package name */
    public volatile Boolean f26760e;

    /* renamed from: f  reason: collision with root package name */
    public final zzax f26761f;

    /* renamed from: g  reason: collision with root package name */
    public final zznl f26762g;

    /* renamed from: h  reason: collision with root package name */
    public final List f26763h = new ArrayList();

    /* renamed from: i  reason: collision with root package name */
    public final zzax f26764i;

    public zzlp(zzhw zzhw) {
        super(zzhw);
        this.f26762g = new zznl(zzhw.b());
        this.f26758c = new zzmm(this);
        this.f26761f = new zzlq(this, zzhw);
        this.f26764i = new zzmd(this, zzhw);
    }

    public static /* synthetic */ void M(zzlp zzlp, ComponentName componentName) {
        zzlp.n();
        if (zzlp.f26759d != null) {
            zzlp.f26759d = null;
            zzlp.m().K().b("Disconnected from device MeasurementService", componentName);
            zzlp.n();
            zzlp.a0();
        }
    }

    private final void P(Runnable runnable) {
        n();
        if (h0()) {
            runnable.run();
        } else if (((long) this.f26763h.size()) >= 1000) {
            m().G().a("Discarding data. Max runnable queue size reached");
        } else {
            this.f26763h.add(runnable);
            this.f26764i.b(60000);
            a0();
        }
    }

    /* access modifiers changed from: private */
    public final void m0() {
        n();
        m().K().b("Processing queued up service tasks", Integer.valueOf(this.f26763h.size()));
        for (Runnable run : this.f26763h) {
            try {
                run.run();
            } catch (RuntimeException e2) {
                m().G().b("Task exception while flushing queue", e2);
            }
        }
        this.f26763h.clear();
        this.f26764i.a();
    }

    /* access modifiers changed from: private */
    public final void n0() {
        n();
        this.f26762g.c();
        this.f26761f.b(((Long) zzbj.M.a((Object) null)).longValue());
    }

    public static /* synthetic */ void t0(zzlp zzlp) {
        zzlp.n();
        if (zzlp.h0()) {
            zzlp.m().K().a("Inactivity, disconnecting from the service");
            zzlp.b0();
        }
    }

    public final boolean A() {
        return false;
    }

    public final void C(Bundle bundle) {
        n();
        v();
        P(new zzmc(this, r0(false), bundle));
    }

    public final void D(zzdl zzdl) {
        n();
        v();
        P(new zzlz(this, r0(false), zzdl));
    }

    public final void E(zzdl zzdl, zzbh zzbh, String str) {
        n();
        v();
        if (j().u(GooglePlayServicesUtilLight.f24398a) != 0) {
            m().L().a("Not bundling data. Service unavailable or out of date");
            j().V(zzdl, new byte[0]);
            return;
        }
        P(new zzme(this, zzbh, str, zzdl));
    }

    public final void F(zzdl zzdl, String str, String str2) {
        n();
        v();
        P(new zzmk(this, str, str2, r0(false), zzdl));
    }

    public final void G(zzdl zzdl, String str, String str2, boolean z2) {
        n();
        v();
        P(new zzlt(this, str, str2, r0(false), z2, zzdl));
    }

    public final void H(zzaf zzaf) {
        Preconditions.m(zzaf);
        n();
        v();
        P(new zzmi(this, true, r0(true), q().E(zzaf), new zzaf(zzaf), zzaf));
    }

    public final void I(zzbh zzbh, String str) {
        Preconditions.m(zzbh);
        n();
        v();
        P(new zzmj(this, true, r0(true), q().F(zzbh), zzbh, str));
    }

    public final void J(zzgb zzgb) {
        n();
        Preconditions.m(zzgb);
        this.f26759d = zzgb;
        n0();
        m0();
    }

    public final void K(zzgb zzgb, AbstractSafeParcelable abstractSafeParcelable, zzp zzp) {
        int i2;
        n();
        v();
        int i3 = 100;
        int i4 = 0;
        while (i4 < 1001 && i3 == 100) {
            ArrayList arrayList = new ArrayList();
            List C = q().C(100);
            if (C != null) {
                arrayList.addAll(C);
                i2 = C.size();
            } else {
                i2 = 0;
            }
            if (abstractSafeParcelable != null && i2 < 100) {
                arrayList.add(abstractSafeParcelable);
            }
            int size = arrayList.size();
            int i5 = 0;
            while (i5 < size) {
                Object obj = arrayList.get(i5);
                i5++;
                AbstractSafeParcelable abstractSafeParcelable2 = (AbstractSafeParcelable) obj;
                if (abstractSafeParcelable2 instanceof zzbh) {
                    try {
                        zzgb.Y((zzbh) abstractSafeParcelable2, zzp);
                    } catch (RemoteException e2) {
                        m().G().b("Failed to send event to the service", e2);
                    }
                } else if (abstractSafeParcelable2 instanceof zzok) {
                    try {
                        zzgb.G2((zzok) abstractSafeParcelable2, zzp);
                    } catch (RemoteException e3) {
                        m().G().b("Failed to send user property to the service", e3);
                    }
                } else if (abstractSafeParcelable2 instanceof zzaf) {
                    try {
                        zzgb.d0((zzaf) abstractSafeParcelable2, zzp);
                    } catch (RemoteException e4) {
                        m().G().b("Failed to send conditional user property to the service", e4);
                    }
                } else {
                    m().G().a("Discarding data. Unrecognized parcel type.");
                }
            }
            i4++;
            i3 = i2;
        }
    }

    public final void L(zzlh zzlh) {
        n();
        v();
        P(new zzma(this, zzlh));
    }

    public final void O(zzok zzok) {
        n();
        v();
        P(new zzlu(this, r0(true), q().G(zzok), zzok));
    }

    public final void Q(AtomicReference atomicReference) {
        n();
        v();
        P(new zzlw(this, atomicReference, r0(false)));
    }

    public final void R(AtomicReference atomicReference, Bundle bundle) {
        n();
        v();
        P(new zzlv(this, atomicReference, r0(false), bundle));
    }

    public final void S(AtomicReference atomicReference, String str, String str2, String str3) {
        n();
        v();
        P(new zzml(this, atomicReference, str, str2, str3, r0(false)));
    }

    public final void T(AtomicReference atomicReference, String str, String str2, String str3, boolean z2) {
        n();
        v();
        P(new zzmn(this, atomicReference, str, str2, str3, r0(false), z2));
    }

    public final void U(AtomicReference atomicReference, boolean z2) {
        n();
        v();
        P(new zzls(this, atomicReference, r0(false), z2));
    }

    public final void V(boolean z2) {
        n();
        v();
        if ((!zzpd.a() || !d().t(zzbj.c1)) && z2) {
            q().H();
        }
        if (j0()) {
            P(new zzmg(this, r0(false)));
        }
    }

    public final zzak W() {
        n();
        v();
        zzgb zzgb = this.f26759d;
        if (zzgb == null) {
            a0();
            m().F().a("Failed to get consents; not connected to service yet.");
            return null;
        }
        zzp r0 = r0(false);
        Preconditions.m(r0);
        try {
            zzak N0 = zzgb.N0(r0);
            n0();
            return N0;
        } catch (RemoteException e2) {
            m().G().b("Failed to get consents; remote exception", e2);
            return null;
        }
    }

    public final Boolean X() {
        return this.f26760e;
    }

    public final void Y() {
        n();
        v();
        P(new zzmb(this, r0(true)));
    }

    public final void Z() {
        n();
        v();
        zzp r0 = r0(true);
        q().I();
        P(new zzly(this, r0));
    }

    public final /* bridge */ /* synthetic */ Context a() {
        return super.a();
    }

    public final void a0() {
        n();
        v();
        if (!h0()) {
            if (l0()) {
                this.f26758c.a();
            } else if (!d().u()) {
                List<ResolveInfo> queryIntentServices = a().getPackageManager().queryIntentServices(new Intent().setClassName(a(), "com.google.android.gms.measurement.AppMeasurementService"), 65536);
                if (queryIntentServices == null || queryIntentServices.isEmpty()) {
                    m().G().a("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
                    return;
                }
                Intent intent = new Intent("com.google.android.gms.measurement.START");
                intent.setComponent(new ComponentName(a(), "com.google.android.gms.measurement.AppMeasurementService"));
                this.f26758c.b(intent);
            }
        }
    }

    public final /* bridge */ /* synthetic */ Clock b() {
        return super.b();
    }

    public final void b0() {
        n();
        v();
        this.f26758c.d();
        try {
            ConnectionTracker.b().c(a(), this.f26758c);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.f26759d = null;
    }

    public final /* synthetic */ void c0() {
        zzgb zzgb = this.f26759d;
        if (zzgb == null) {
            m().G().a("Failed to send Dma consent settings to service");
            return;
        }
        try {
            zzp r0 = r0(false);
            Preconditions.m(r0);
            zzgb.R2(r0);
            n0();
        } catch (RemoteException e2) {
            m().G().b("Failed to send Dma consent settings to the service", e2);
        }
    }

    public final /* bridge */ /* synthetic */ zzah d() {
        return super.d();
    }

    public final /* synthetic */ void d0() {
        zzgb zzgb = this.f26759d;
        if (zzgb == null) {
            m().G().a("Failed to send storage consent settings to service");
            return;
        }
        try {
            zzp r0 = r0(false);
            Preconditions.m(r0);
            zzgb.m2(r0);
            n0();
        } catch (RemoteException e2) {
            m().G().b("Failed to send storage consent settings to the service", e2);
        }
    }

    public final /* bridge */ /* synthetic */ zzac e() {
        return super.e();
    }

    public final void e0() {
        n();
        v();
        zzp r0 = r0(false);
        q().H();
        P(new zzlx(this, r0));
    }

    public final /* bridge */ /* synthetic */ zzhp f() {
        return super.f();
    }

    public final void f0() {
        n();
        v();
        P(new zzlr(this));
    }

    public final /* bridge */ /* synthetic */ zzbb g() {
        return super.g();
    }

    public final void g0() {
        n();
        v();
        P(new zzmh(this, r0(true)));
    }

    public final /* bridge */ /* synthetic */ zzgh h() {
        return super.h();
    }

    public final boolean h0() {
        n();
        v();
        return this.f26759d != null;
    }

    public final /* bridge */ /* synthetic */ zzgu i() {
        return super.i();
    }

    public final boolean i0() {
        n();
        v();
        return !l0() || j().I0() >= 200900;
    }

    public final /* bridge */ /* synthetic */ zzop j() {
        return super.j();
    }

    public final boolean j0() {
        n();
        v();
        return !l0() || j().I0() >= ((Integer) zzbj.t0.a((Object) null)).intValue();
    }

    public final /* bridge */ /* synthetic */ void k() {
        super.k();
    }

    public final boolean k0() {
        n();
        v();
        return !l0() || j().I0() >= 241200;
    }

    public final /* bridge */ /* synthetic */ void l() {
        super.l();
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00f6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean l0() {
        /*
            r5 = this;
            r5.n()
            r5.v()
            java.lang.Boolean r0 = r5.f26760e
            if (r0 != 0) goto L_0x0103
            r5.n()
            r5.v()
            com.google.android.gms.measurement.internal.zzgu r0 = r5.i()
            java.lang.Boolean r0 = r0.N()
            r1 = 1
            if (r0 == 0) goto L_0x0023
            boolean r2 = r0.booleanValue()
            if (r2 == 0) goto L_0x0023
            goto L_0x00fd
        L_0x0023:
            com.google.android.gms.measurement.internal.zzgc r2 = r5.p()
            int r2 = r2.C()
            r3 = 0
            if (r2 != r1) goto L_0x0031
        L_0x002e:
            r0 = r1
            goto L_0x00d9
        L_0x0031:
            com.google.android.gms.measurement.internal.zzgi r2 = r5.m()
            com.google.android.gms.measurement.internal.zzgk r2 = r2.K()
            java.lang.String r4 = "Checking service availability"
            r2.a(r4)
            com.google.android.gms.measurement.internal.zzop r2 = r5.j()
            r4 = 12451000(0xbdfcb8, float:1.7447567E-38)
            int r2 = r2.u(r4)
            if (r2 == 0) goto L_0x00ca
            if (r2 == r1) goto L_0x00bc
            r4 = 2
            if (r2 == r4) goto L_0x009a
            r0 = 3
            if (r2 == r0) goto L_0x008c
            r0 = 9
            if (r2 == r0) goto L_0x007e
            r0 = 18
            if (r2 == r0) goto L_0x0070
            com.google.android.gms.measurement.internal.zzgi r0 = r5.m()
            com.google.android.gms.measurement.internal.zzgk r0 = r0.L()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            java.lang.String r2 = "Unexpected service status"
            r0.b(r2, r1)
        L_0x006c:
            r0 = r3
            r1 = r0
            goto L_0x00d9
        L_0x0070:
            com.google.android.gms.measurement.internal.zzgi r0 = r5.m()
            com.google.android.gms.measurement.internal.zzgk r0 = r0.L()
            java.lang.String r2 = "Service updating"
            r0.a(r2)
            goto L_0x002e
        L_0x007e:
            com.google.android.gms.measurement.internal.zzgi r0 = r5.m()
            com.google.android.gms.measurement.internal.zzgk r0 = r0.L()
            java.lang.String r1 = "Service invalid"
            r0.a(r1)
            goto L_0x006c
        L_0x008c:
            com.google.android.gms.measurement.internal.zzgi r0 = r5.m()
            com.google.android.gms.measurement.internal.zzgk r0 = r0.L()
            java.lang.String r1 = "Service disabled"
            r0.a(r1)
            goto L_0x006c
        L_0x009a:
            com.google.android.gms.measurement.internal.zzgi r2 = r5.m()
            com.google.android.gms.measurement.internal.zzgk r2 = r2.F()
            java.lang.String r4 = "Service container out of date"
            r2.a(r4)
            com.google.android.gms.measurement.internal.zzop r2 = r5.j()
            int r2 = r2.I0()
            r4 = 17443(0x4423, float:2.4443E-41)
            if (r2 >= r4) goto L_0x00b6
        L_0x00b3:
            r0 = r1
            r1 = r3
            goto L_0x00d9
        L_0x00b6:
            if (r0 != 0) goto L_0x00b9
            goto L_0x00ba
        L_0x00b9:
            r1 = r3
        L_0x00ba:
            r0 = r3
            goto L_0x00d9
        L_0x00bc:
            com.google.android.gms.measurement.internal.zzgi r0 = r5.m()
            com.google.android.gms.measurement.internal.zzgk r0 = r0.K()
            java.lang.String r2 = "Service missing"
            r0.a(r2)
            goto L_0x00b3
        L_0x00ca:
            com.google.android.gms.measurement.internal.zzgi r0 = r5.m()
            com.google.android.gms.measurement.internal.zzgk r0 = r0.K()
            java.lang.String r2 = "Service available"
            r0.a(r2)
            goto L_0x002e
        L_0x00d9:
            if (r1 != 0) goto L_0x00f3
            com.google.android.gms.measurement.internal.zzah r2 = r5.d()
            boolean r2 = r2.u()
            if (r2 == 0) goto L_0x00f3
            com.google.android.gms.measurement.internal.zzgi r0 = r5.m()
            com.google.android.gms.measurement.internal.zzgk r0 = r0.G()
            java.lang.String r2 = "No way to upload. Consider using the full version of Analytics"
            r0.a(r2)
            goto L_0x00f4
        L_0x00f3:
            r3 = r0
        L_0x00f4:
            if (r3 == 0) goto L_0x00fd
            com.google.android.gms.measurement.internal.zzgu r0 = r5.i()
            r0.x(r1)
        L_0x00fd:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r5.f26760e = r0
        L_0x0103:
            java.lang.Boolean r0 = r5.f26760e
            boolean r0 = r0.booleanValue()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzlp.l0():boolean");
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

    public final void p0(Bundle bundle) {
        n();
        v();
        if (d().t(zzbj.m1)) {
            P(new zzmf(this, r0(false), bundle));
        }
    }

    public final /* bridge */ /* synthetic */ zzgf q() {
        return super.q();
    }

    public final void q0(boolean z2) {
        n();
        v();
        if ((!zzpd.a() || !d().t(zzbj.c1)) && z2) {
            q().H();
        }
        P(new zzlo(this));
    }

    public final /* bridge */ /* synthetic */ zzjk r() {
        return super.r();
    }

    public final zzp r0(boolean z2) {
        return p().B(z2 ? m().O() : null);
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
