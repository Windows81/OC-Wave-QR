package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Pair;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.util.Clock;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;

public final class zzms extends zznr {

    /* renamed from: d  reason: collision with root package name */
    public final Map f26834d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    public final zzgz f26835e;

    /* renamed from: f  reason: collision with root package name */
    public final zzgz f26836f;

    /* renamed from: g  reason: collision with root package name */
    public final zzgz f26837g;

    /* renamed from: h  reason: collision with root package name */
    public final zzgz f26838h;

    /* renamed from: i  reason: collision with root package name */
    public final zzgz f26839i;

    /* renamed from: j  reason: collision with root package name */
    public final zzgz f26840j;

    public zzms(zznv zznv) {
        super(zznv);
        zzgu i2 = i();
        Objects.requireNonNull(i2);
        this.f26835e = new zzgz(i2, "last_delete_stale", 0);
        zzgu i3 = i();
        Objects.requireNonNull(i3);
        this.f26836f = new zzgz(i3, "last_delete_stale_batch", 0);
        zzgu i4 = i();
        Objects.requireNonNull(i4);
        this.f26837g = new zzgz(i4, "backoff", 0);
        zzgu i5 = i();
        Objects.requireNonNull(i5);
        this.f26838h = new zzgz(i5, "last_upload", 0);
        zzgu i6 = i();
        Objects.requireNonNull(i6);
        this.f26839i = new zzgz(i6, "last_upload_attempt", 0);
        zzgu i7 = i();
        Objects.requireNonNull(i7);
        this.f26840j = new zzgz(i7, "midnight_offset", 0);
    }

    private final Pair y(String str) {
        zzmv zzmv;
        AdvertisingIdClient.Info info;
        n();
        long c2 = b().c();
        zzmv zzmv2 = (zzmv) this.f26834d.get(str);
        if (zzmv2 != null && c2 < zzmv2.f26845c) {
            return new Pair(zzmv2.f26843a, Boolean.valueOf(zzmv2.f26844b));
        }
        AdvertisingIdClient.b(true);
        long E = d().E(str) + c2;
        try {
            info = AdvertisingIdClient.a(a());
        } catch (PackageManager.NameNotFoundException unused) {
            if (zzmv2 != null) {
                try {
                    if (c2 < zzmv2.f26845c + d().C(str, zzbj.f26261c)) {
                        return new Pair(zzmv2.f26843a, Boolean.valueOf(zzmv2.f26844b));
                    }
                } catch (Exception e2) {
                    m().F().b("Unable to get advertising id", e2);
                    zzmv = new zzmv("", false, E);
                }
            }
            info = null;
        }
        if (info == null) {
            return new Pair("00000000-0000-0000-0000-000000000000", Boolean.FALSE);
        }
        String a2 = info.a();
        zzmv = a2 != null ? new zzmv(a2, info.b(), E) : new zzmv("", info.b(), E);
        this.f26834d.put(str, zzmv);
        AdvertisingIdClient.b(false);
        return new Pair(zzmv.f26843a, Boolean.valueOf(zzmv.f26844b));
    }

    public final String A(String str, boolean z2) {
        n();
        String str2 = z2 ? (String) y(str).first : "00000000-0000-0000-0000-000000000000";
        MessageDigest V0 = zzop.V0();
        if (V0 == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new Object[]{new BigInteger(1, V0.digest(str2.getBytes()))});
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

    public final Pair z(String str, zzjc zzjc) {
        return zzjc.A() ? y(str) : new Pair("", Boolean.FALSE);
    }
}
