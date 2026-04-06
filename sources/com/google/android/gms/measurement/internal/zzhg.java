package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import androidx.collection.ArrayMap;
import androidx.collection.LruCache;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.measurement.zzb;
import com.google.android.gms.internal.measurement.zzc;
import com.google.android.gms.internal.measurement.zzfx;
import com.google.android.gms.internal.measurement.zzhg;
import com.google.android.gms.internal.measurement.zzlc;
import com.google.android.gms.internal.measurement.zzlk;
import com.google.android.gms.internal.measurement.zzv;
import com.google.android.gms.measurement.internal.zzjc;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public final class zzhg extends zznr implements zzaj {

    /* renamed from: d  reason: collision with root package name */
    public final Map f26440d = new ArrayMap();

    /* renamed from: e  reason: collision with root package name */
    public final Map f26441e = new ArrayMap();

    /* renamed from: f  reason: collision with root package name */
    public final Map f26442f = new ArrayMap();

    /* renamed from: g  reason: collision with root package name */
    public final Map f26443g = new ArrayMap();

    /* renamed from: h  reason: collision with root package name */
    public final Map f26444h = new ArrayMap();

    /* renamed from: i  reason: collision with root package name */
    public final Map f26445i = new ArrayMap();

    /* renamed from: j  reason: collision with root package name */
    public final LruCache f26446j = new zzhm(this, 20);

    /* renamed from: k  reason: collision with root package name */
    public final zzv f26447k = new zzhl(this);

    /* renamed from: l  reason: collision with root package name */
    public final Map f26448l = new ArrayMap();

    /* renamed from: m  reason: collision with root package name */
    public final Map f26449m = new ArrayMap();

    /* renamed from: n  reason: collision with root package name */
    public final Map f26450n = new ArrayMap();

    public zzhg(zznv zznv) {
        super(zznv);
    }

    public static zzjc.zza C(zzfx.zza.zze zze) {
        int i2 = zzhn.f26461b[zze.ordinal()];
        if (i2 == 1) {
            return zzjc.zza.AD_STORAGE;
        }
        if (i2 == 2) {
            return zzjc.zza.ANALYTICS_STORAGE;
        }
        if (i2 == 3) {
            return zzjc.zza.AD_USER_DATA;
        }
        if (i2 != 4) {
            return null;
        }
        return zzjc.zza.AD_PERSONALIZATION;
    }

    public static Map D(zzfx.zzd zzd) {
        ArrayMap arrayMap = new ArrayMap();
        if (zzd != null) {
            for (zzfx.zzh zzh : zzd.Z()) {
                arrayMap.put(zzh.K(), zzh.L());
            }
        }
        return arrayMap;
    }

    public static /* synthetic */ zzb z(zzhg zzhg, String str) {
        zzhg.u();
        Preconditions.g(str);
        if (!zzhg.X(str)) {
            return null;
        }
        if (!zzhg.f26444h.containsKey(str) || zzhg.f26444h.get(str) == null) {
            zzhg.h0(str);
        } else {
            zzhg.G(str, (zzfx.zzd) zzhg.f26444h.get(str));
        }
        return (zzb) zzhg.f26446j.k().get(str);
    }

    public final zzfx.zzd A(String str, byte[] bArr) {
        if (bArr == null) {
            return zzfx.zzd.S();
        }
        try {
            zzfx.zzd zzd = (zzfx.zzd) ((zzlc) ((zzfx.zzd.zza) zzol.G(zzfx.zzd.P(), bArr)).F());
            zzgk K = m().K();
            String str2 = null;
            Long valueOf = zzd.e0() ? Long.valueOf(zzd.N()) : null;
            if (zzd.c0()) {
                str2 = zzd.U();
            }
            K.c("Parsed config. version, gmp_app_id", valueOf, str2);
            return zzd;
        } catch (zzlk e2) {
            m().L().c("Unable to merge remote config. appId", zzgi.v(str), e2);
            return zzfx.zzd.S();
        } catch (RuntimeException e3) {
            m().L().c("Unable to merge remote config. appId", zzgi.v(str), e3);
            return zzfx.zzd.S();
        }
    }

    public final zzjb B(String str, zzjc.zza zza) {
        n();
        h0(str);
        zzfx.zza J = J(str);
        if (J == null) {
            return zzjb.UNINITIALIZED;
        }
        for (zzfx.zza.zzb zzb : J.O()) {
            if (C(zzb.L()) == zza) {
                int i2 = zzhn.f26462c[zzb.K().ordinal()];
                return i2 != 1 ? i2 != 2 ? zzjb.UNINITIALIZED : zzjb.GRANTED : zzjb.DENIED;
            }
        }
        return zzjb.UNINITIALIZED;
    }

    public final void F(String str, zzfx.zzd.zza zza) {
        HashSet hashSet = new HashSet();
        ArrayMap arrayMap = new ArrayMap();
        ArrayMap arrayMap2 = new ArrayMap();
        ArrayMap arrayMap3 = new ArrayMap();
        if (zza != null) {
            for (zzfx.zzb K : zza.J()) {
                hashSet.add(K.K());
            }
            for (int i2 = 0; i2 < zza.y(); i2++) {
                zzfx.zzc.zza zza2 = (zzfx.zzc.zza) zza.z(i2).z();
                if (zza2.B().isEmpty()) {
                    m().L().a("EventConfig contained null event name");
                } else {
                    String B2 = zza2.B();
                    String b2 = zzjf.b(zza2.B());
                    if (!TextUtils.isEmpty(b2)) {
                        zza2 = zza2.z(b2);
                        zza.B(i2, zza2);
                    }
                    if (zza2.I() && zza2.G()) {
                        arrayMap.put(B2, Boolean.TRUE);
                    }
                    if (zza2.J() && zza2.H()) {
                        arrayMap2.put(zza2.B(), Boolean.TRUE);
                    }
                    if (zza2.K()) {
                        if (zza2.y() < 2 || zza2.y() > 65535) {
                            m().L().c("Invalid sampling rate. Event name, sample rate", zza2.B(), Integer.valueOf(zza2.y()));
                        } else {
                            arrayMap3.put(zza2.B(), Integer.valueOf(zza2.y()));
                        }
                    }
                }
            }
        }
        this.f26441e.put(str, hashSet);
        this.f26442f.put(str, arrayMap);
        this.f26443g.put(str, arrayMap2);
        this.f26445i.put(str, arrayMap3);
    }

    public final void G(String str, zzfx.zzd zzd) {
        if (zzd.n() == 0) {
            this.f26446j.g(str);
            return;
        }
        m().K().b("EES programs found", Integer.valueOf(zzd.n()));
        zzhg.zzc zzc = (zzhg.zzc) zzd.Y().get(0);
        try {
            zzb zzb = new zzb();
            zzb.c("internal.remoteConfig", new zzhh(this, str));
            zzb.c("internal.appMetadata", new zzhk(this, str));
            zzb.c("internal.logger", new zzhj(this));
            zzb.b(zzc);
            this.f26446j.f(str, zzb);
            m().K().c("EES program loaded for appId, activities", str, Integer.valueOf(zzc.J().n()));
            for (zzhg.zzb K : zzc.J().L()) {
                m().K().b("EES program activity", K.K());
            }
        } catch (zzc unused) {
            m().G().b("Failed to load EES program. appId", str);
        }
    }

    public final boolean H(String str, byte[] bArr, String str2, String str3) {
        u();
        n();
        Preconditions.g(str);
        zzfx.zzd.zza zza = (zzfx.zzd.zza) A(str, bArr).z();
        if (zza == null) {
            return false;
        }
        F(str, zza);
        G(str, (zzfx.zzd) ((zzlc) zza.F()));
        this.f26444h.put(str, (zzfx.zzd) ((zzlc) zza.F()));
        this.f26448l.put(str, zza.H());
        this.f26449m.put(str, str2);
        this.f26450n.put(str, str3);
        this.f26440d.put(str, D((zzfx.zzd) ((zzlc) zza.F())));
        q().b0(str, new ArrayList(zza.I()));
        try {
            zza.G();
            bArr = ((zzfx.zzd) ((zzlc) zza.F())).m();
        } catch (RuntimeException e2) {
            m().L().c("Unable to serialize reduced-size config. Storing full config instead. appId", zzgi.v(str), e2);
        }
        zzam q2 = q();
        Preconditions.g(str);
        q2.n();
        q2.u();
        ContentValues contentValues = new ContentValues();
        contentValues.put("remote_config", bArr);
        contentValues.put("config_last_modified_time", str2);
        contentValues.put("e_tag", str3);
        try {
            if (((long) q2.B().update("apps", contentValues, "app_id = ?", new String[]{str})) == 0) {
                q2.m().G().b("Failed to update remote config (got 0). appId", zzgi.v(str));
            }
        } catch (SQLiteException e3) {
            q2.m().G().c("Error storing remote config. appId", zzgi.v(str), e3);
        }
        this.f26444h.put(str, (zzfx.zzd) ((zzlc) zza.F()));
        return true;
    }

    public final int I(String str, String str2) {
        Integer num;
        n();
        h0(str);
        Map map = (Map) this.f26445i.get(str);
        if (map == null || (num = (Integer) map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    public final zzfx.zza J(String str) {
        n();
        h0(str);
        zzfx.zzd L = L(str);
        if (L == null || !L.b0()) {
            return null;
        }
        return L.O();
    }

    public final zzjc.zza K(String str, zzjc.zza zza) {
        n();
        h0(str);
        zzfx.zza J = J(str);
        if (J == null) {
            return null;
        }
        for (zzfx.zza.zzc zzc : J.N()) {
            if (zza == C(zzc.L())) {
                return C(zzc.K());
            }
        }
        return null;
    }

    public final zzfx.zzd L(String str) {
        u();
        n();
        Preconditions.g(str);
        h0(str);
        return (zzfx.zzd) this.f26444h.get(str);
    }

    public final boolean M(String str, zzjc.zza zza) {
        n();
        h0(str);
        zzfx.zza J = J(str);
        if (J == null) {
            return false;
        }
        Iterator it = J.M().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            zzfx.zza.zzb zzb = (zzfx.zza.zzb) it.next();
            if (zza == C(zzb.L())) {
                if (zzb.K() == zzfx.zza.zzd.GRANTED) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean N(String str, String str2) {
        Boolean bool;
        n();
        h0(str);
        if ("ecommerce_purchase".equals(str2) || "purchase".equals(str2) || "refund".equals(str2)) {
            return true;
        }
        Map map = (Map) this.f26443g.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final String O(String str) {
        n();
        return (String) this.f26450n.get(str);
    }

    public final boolean P(String str, String str2) {
        Boolean bool;
        n();
        h0(str);
        if (Y(str) && zzop.J0(str2)) {
            return true;
        }
        if (a0(str) && zzop.L0(str2)) {
            return true;
        }
        Map map = (Map) this.f26442f.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final String Q(String str) {
        n();
        return (String) this.f26449m.get(str);
    }

    public final String R(String str) {
        n();
        h0(str);
        return (String) this.f26448l.get(str);
    }

    public final Set S(String str) {
        n();
        h0(str);
        return (Set) this.f26441e.get(str);
    }

    public final SortedSet T(String str) {
        n();
        h0(str);
        TreeSet treeSet = new TreeSet();
        zzfx.zza J = J(str);
        if (J == null) {
            return treeSet;
        }
        for (zzfx.zza.zzf K : J.L()) {
            treeSet.add(K.K());
        }
        return treeSet;
    }

    public final void U(String str) {
        n();
        this.f26449m.put(str, (Object) null);
    }

    public final void V(String str) {
        n();
        this.f26444h.remove(str);
    }

    public final boolean W(String str) {
        n();
        zzfx.zzd L = L(str);
        if (L == null) {
            return false;
        }
        return L.a0();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        r3 = (com.google.android.gms.internal.measurement.zzfx.zzd) r2.f26444h.get(r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean X(java.lang.String r3) {
        /*
            r2 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            r1 = 0
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            java.util.Map r0 = r2.f26444h
            java.lang.Object r3 = r0.get(r3)
            com.google.android.gms.internal.measurement.zzfx$zzd r3 = (com.google.android.gms.internal.measurement.zzfx.zzd) r3
            if (r3 != 0) goto L_0x0013
            return r1
        L_0x0013:
            int r3 = r3.n()
            if (r3 == 0) goto L_0x001b
            r3 = 1
            return r3
        L_0x001b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzhg.X(java.lang.String):boolean");
    }

    public final boolean Y(String str) {
        return "1".equals(c(str, "measurement.upload.blacklist_internal"));
    }

    public final boolean Z(String str) {
        n();
        h0(str);
        zzfx.zza J = J(str);
        return J == null || !J.R() || J.P();
    }

    public final /* bridge */ /* synthetic */ Context a() {
        return super.a();
    }

    public final boolean a0(String str) {
        return "1".equals(c(str, "measurement.upload.blacklist_public"));
    }

    public final /* bridge */ /* synthetic */ Clock b() {
        return super.b();
    }

    public final boolean b0(String str) {
        n();
        h0(str);
        return this.f26441e.get(str) != null && ((Set) this.f26441e.get(str)).contains("app_instance_id");
    }

    public final String c(String str, String str2) {
        n();
        h0(str);
        Map map = (Map) this.f26440d.get(str);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }

    public final boolean c0(String str) {
        n();
        h0(str);
        if (this.f26441e.get(str) != null) {
            return ((Set) this.f26441e.get(str)).contains("device_model") || ((Set) this.f26441e.get(str)).contains("device_info");
        }
        return false;
    }

    public final /* bridge */ /* synthetic */ zzah d() {
        return super.d();
    }

    public final boolean d0(String str) {
        n();
        h0(str);
        return this.f26441e.get(str) != null && ((Set) this.f26441e.get(str)).contains("enhanced_user_id");
    }

    public final /* bridge */ /* synthetic */ zzac e() {
        return super.e();
    }

    public final boolean e0(String str) {
        n();
        h0(str);
        return this.f26441e.get(str) != null && ((Set) this.f26441e.get(str)).contains("google_signals");
    }

    public final /* bridge */ /* synthetic */ zzhp f() {
        return super.f();
    }

    public final boolean f0(String str) {
        n();
        h0(str);
        if (this.f26441e.get(str) != null) {
            return ((Set) this.f26441e.get(str)).contains("os_version") || ((Set) this.f26441e.get(str)).contains("device_info");
        }
        return false;
    }

    public final /* bridge */ /* synthetic */ zzbb g() {
        return super.g();
    }

    public final boolean g0(String str) {
        n();
        h0(str);
        return this.f26441e.get(str) != null && ((Set) this.f26441e.get(str)).contains("user_id");
    }

    public final /* bridge */ /* synthetic */ zzgh h() {
        return super.h();
    }

    public final void h0(String str) {
        u();
        n();
        Preconditions.g(str);
        if (this.f26444h.get(str) == null) {
            zzao N0 = q().N0(str);
            if (N0 == null) {
                this.f26440d.put(str, (Object) null);
                this.f26442f.put(str, (Object) null);
                this.f26441e.put(str, (Object) null);
                this.f26443g.put(str, (Object) null);
                this.f26444h.put(str, (Object) null);
                this.f26448l.put(str, (Object) null);
                this.f26449m.put(str, (Object) null);
                this.f26450n.put(str, (Object) null);
                this.f26445i.put(str, (Object) null);
                return;
            }
            zzfx.zzd.zza zza = (zzfx.zzd.zza) A(str, N0.f26198a).z();
            F(str, zza);
            this.f26440d.put(str, D((zzfx.zzd) ((zzlc) zza.F())));
            this.f26444h.put(str, (zzfx.zzd) ((zzlc) zza.F()));
            G(str, (zzfx.zzd) ((zzlc) zza.F()));
            this.f26448l.put(str, zza.H());
            this.f26449m.put(str, N0.f26199b);
            this.f26450n.put(str, N0.f26200c);
        }
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

    public final /* bridge */ /* synthetic */ zzol o() {
        return super.o();
    }

    public final /* bridge */ /* synthetic */ zzv p() {
        return super.p();
    }

    public final /* bridge */ /* synthetic */ zzam q() {
        return super.q();
    }

    public final /* bridge */ /* synthetic */ zzhg r() {
        return super.r();
    }

    public final /* bridge */ /* synthetic */ zzms s() {
        return super.s();
    }

    public final /* bridge */ /* synthetic */ zznq t() {
        return super.t();
    }

    public final boolean x() {
        return false;
    }

    public final long y(String str) {
        String c2 = c(str, "measurement.account.time_zone_offset_minutes");
        if (TextUtils.isEmpty(c2)) {
            return 0;
        }
        try {
            return Long.parseLong(c2);
        } catch (NumberFormatException e2) {
            m().L().c("Unable to parse timezone offset. appId", zzgi.v(str), e2);
            return 0;
        }
    }
}
