package com.google.android.gms.measurement.internal;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzgn;
import com.google.android.gms.internal.measurement.zzlc;
import com.google.android.gms.internal.measurement.zzqn;
import com.google.android.gms.internal.measurement.zzrq;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

final class zzlf extends zznr {
    public zzlf(zznv zznv) {
        super(zznv);
    }

    private static String c(String str, String str2) {
        throw new SecurityException("This implementation should not be used.");
    }

    public final boolean x() {
        return false;
    }

    public final byte[] y(zzbh zzbh, String str) {
        zzom zzom;
        zzgn.zzj.zza zza;
        zzgn.zzk.zza zza2;
        byte[] bArr;
        zzh zzh;
        Bundle bundle;
        zzbd zzbd;
        long j2;
        zzbh zzbh2 = zzbh;
        String str2 = str;
        n();
        this.f26587a.Q();
        Preconditions.m(zzbh);
        Preconditions.g(str);
        if (!d().H(str2, zzbj.l0)) {
            m().F().b("Generating ScionPayload disabled. packageName", str2);
            return new byte[0];
        } else if ("_iap".equals(zzbh2.f26256z) || "_iapx".equals(zzbh2.f26256z)) {
            zzgn.zzj.zza O = zzgn.zzj.O();
            q().b1();
            zzh L0 = q().L0(str2);
            if (L0 == null) {
                m().F().b("Log and bundle not available. package_name", str2);
                byte[] bArr2 = new byte[0];
                q().g1();
                return bArr2;
            } else if (!L0.A()) {
                m().F().b("Log and bundle disabled. package_name", str2);
                byte[] bArr3 = new byte[0];
                q().g1();
                return bArr3;
            } else {
                zzgn.zzk.zza k1 = zzgn.zzk.z2().I0(1).k1("android");
                if (!TextUtils.isEmpty(L0.l())) {
                    k1.d0(L0.l());
                }
                if (!TextUtils.isEmpty(L0.n())) {
                    k1.q0((String) Preconditions.m(L0.n()));
                }
                if (!TextUtils.isEmpty(L0.o())) {
                    k1.w0((String) Preconditions.m(L0.o()));
                }
                if (L0.U() != -2147483648L) {
                    k1.t0((int) L0.U());
                }
                k1.z0(L0.z0()).o0(L0.v0());
                String q2 = L0.q();
                String j3 = L0.j();
                if (!TextUtils.isEmpty(q2)) {
                    k1.e1(q2);
                } else if (!TextUtils.isEmpty(j3)) {
                    k1.R(j3);
                }
                k1.R0(L0.J0());
                zzjc U = this.f26888b.U(str2);
                k1.i0(L0.t0());
                if (this.f26587a.p() && d().P(k1.r1()) && U.A() && !TextUtils.isEmpty((CharSequence) null)) {
                    k1.S0((String) null);
                }
                k1.F0(U.y());
                if (U.A() && L0.z()) {
                    Pair z2 = s().z(L0.l(), U);
                    if (L0.z() && z2 != null && !TextUtils.isEmpty((CharSequence) z2.first)) {
                        try {
                            k1.m1(c((String) z2.first, Long.toString(zzbh2.C)));
                            Object obj = z2.second;
                            if (obj != null) {
                                k1.l0(((Boolean) obj).booleanValue());
                            }
                        } catch (SecurityException e2) {
                            m().F().b("Resettable device id encryption failed", e2.getMessage());
                            return new byte[0];
                        } finally {
                            q().g1();
                        }
                    }
                }
                g().p();
                zzgn.zzk.zza O0 = k1.O0(Build.MODEL);
                g().p();
                O0.i1(Build.VERSION.RELEASE).Q0((int) g().v()).q1(g().w());
                try {
                    if (U.B() && L0.m() != null) {
                        k1.k0(c((String) Preconditions.m(L0.m()), Long.toString(zzbh2.C)));
                    }
                    if (!TextUtils.isEmpty(L0.p())) {
                        k1.c1((String) Preconditions.m(L0.p()));
                    }
                    String l2 = L0.l();
                    List X0 = q().X0(l2);
                    Iterator it = X0.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            zzom = null;
                            break;
                        }
                        zzom = (zzom) it.next();
                        if ("_lte".equals(zzom.f26964c)) {
                            break;
                        }
                    }
                    if (zzom == null || zzom.f26966e == null) {
                        zzom zzom2 = new zzom(l2, "auto", "_lte", b().a(), 0L);
                        X0.add(zzom2);
                        q().h0(zzom2);
                    }
                    zzgn.zzo[] zzoArr = new zzgn.zzo[X0.size()];
                    for (int i2 = 0; i2 < X0.size(); i2++) {
                        zzgn.zzo.zza I = zzgn.zzo.W().G(((zzom) X0.get(i2)).f26964c).I(((zzom) X0.get(i2)).f26965d);
                        o().W(I, ((zzom) X0.get(i2)).f26966e);
                        zzoArr[i2] = (zzgn.zzo) ((zzlc) I.F());
                    }
                    k1.v0(Arrays.asList(zzoArr));
                    o().V(k1);
                    this.f26888b.w(L0, k1);
                    if (zzqn.a() && d().t(zzbj.U0)) {
                        this.f26888b.a0(L0, k1);
                    }
                    zzgm b2 = zzgm.b(zzbh);
                    j().N(b2.f26343d, q().J0(str2));
                    j().W(b2, d().x(str2));
                    Bundle bundle2 = b2.f26343d;
                    bundle2.putLong("_c", 1);
                    m().F().a("Marking in-app purchase as real-time");
                    bundle2.putLong("_r", 1);
                    bundle2.putString("_o", zzbh2.f26255B);
                    if (j().E0(k1.r1(), L0.v())) {
                        j().O(bundle2, "_dbg", 1L);
                        j().O(bundle2, "_r", 1L);
                    }
                    zzbd K0 = q().K0(str2, zzbh2.f26256z);
                    if (K0 == null) {
                        bundle = bundle2;
                        zza2 = k1;
                        zza = O;
                        zzh = L0;
                        bArr = null;
                        zzbd = new zzbd(str, zzbh2.f26256z, 0, 0, zzbh2.C, 0, (Long) null, (Long) null, (Long) null, (Boolean) null);
                        j2 = 0;
                    } else {
                        bundle = bundle2;
                        zza2 = k1;
                        zza = O;
                        zzh = L0;
                        bArr = null;
                        j2 = K0.f26246f;
                        zzbd = K0.a(zzbh2.C);
                    }
                    q().U(zzbd);
                    zzba zzba = new zzba(this.f26587a, zzbh2.f26255B, str, zzbh2.f26256z, zzbh2.C, j2, bundle);
                    zzgn.zzf.zza H = zzgn.zzf.W().N(zzba.f26232d).L(zzba.f26230b).H(zzba.f26233e);
                    Iterator it2 = zzba.f26234f.iterator();
                    while (it2.hasNext()) {
                        String str3 = (String) it2.next();
                        zzgn.zzh.zza I2 = zzgn.zzh.Y().I(str3);
                        Object m0 = zzba.f26234f.m0(str3);
                        if (m0 != null) {
                            o().U(I2, m0);
                            H.I(I2);
                        }
                    }
                    zzgn.zzk.zza zza3 = zza2;
                    zza3.L(H).M(zzgn.zzl.J().y(zzgn.zzg.J().y(zzbd.f26243c).z(zzbh2.f26256z)));
                    zza3.P(p().z(zzh.l(), Collections.emptyList(), zza3.V(), Long.valueOf(H.P()), Long.valueOf(H.P())));
                    if (H.V()) {
                        zza3.N0(H.P()).u0(H.P());
                    }
                    long D0 = zzh.D0();
                    int i3 = (D0 > 0 ? 1 : (D0 == 0 ? 0 : -1));
                    if (i3 != 0) {
                        zza3.E0(D0);
                    }
                    long H0 = zzh.H0();
                    if (H0 != 0) {
                        zza3.J0(H0);
                    } else if (i3 != 0) {
                        zza3.J0(D0);
                    }
                    String u2 = zzh.u();
                    if (zzrq.a()) {
                        if (d().H(str, zzbj.w0) && u2 != null) {
                            zza3.o1(u2);
                        }
                    } else {
                        String str4 = str;
                    }
                    zzh.y();
                    zza3.y0((int) zzh.F0()).a1(102001).V0(b().a()).r0(true);
                    this.f26888b.D(zza3.r1(), zza3);
                    zzgn.zzj.zza zza4 = zza;
                    zza4.z(zza3);
                    zzh zzh2 = zzh;
                    zzh2.C0(zza3.x0());
                    zzh2.y0(zza3.s0());
                    q().V(zzh2, false, false);
                    q().i1();
                    try {
                        return o().i0(((zzgn.zzj) ((zzlc) zza4.F())).m());
                    } catch (IOException e3) {
                        m().G().c("Data loss. Failed to bundle and serialize. appId", zzgi.v(str), e3);
                        return bArr;
                    }
                } catch (SecurityException e4) {
                    m().F().b("app instance id encryption failed", e4.getMessage());
                    byte[] bArr4 = new byte[0];
                    q().g1();
                    return bArr4;
                }
            }
        } else {
            m().F().c("Generating a payload for this event is not available. package_name, event_name", str2, zzbh2.f26256z);
            return null;
        }
    }
}
