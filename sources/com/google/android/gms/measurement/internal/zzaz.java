package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.zzjc;
import java.util.EnumMap;
import java.util.Map;
import java.util.Objects;

public final class zzaz {

    /* renamed from: f  reason: collision with root package name */
    public static final zzaz f26220f = new zzaz((Boolean) null, 100);

    /* renamed from: a  reason: collision with root package name */
    public final int f26221a;

    /* renamed from: b  reason: collision with root package name */
    public final String f26222b;

    /* renamed from: c  reason: collision with root package name */
    public final Boolean f26223c;

    /* renamed from: d  reason: collision with root package name */
    public final String f26224d;

    /* renamed from: e  reason: collision with root package name */
    public final EnumMap f26225e;

    public zzaz(Boolean bool, int i2) {
        this(bool, i2, (Boolean) null, (String) null);
    }

    public static zzaz b(Bundle bundle, int i2) {
        Boolean bool = null;
        if (bundle == null) {
            return new zzaz((Boolean) null, i2);
        }
        EnumMap enumMap = new EnumMap(zzjc.zza.class);
        for (zzjc.zza zza : zzjd.DMA.d()) {
            enumMap.put(zza, zzjc.e(bundle.getString(zza.f26598z)));
        }
        if (bundle.containsKey("is_dma_region")) {
            bool = Boolean.valueOf(bundle.getString("is_dma_region"));
        }
        return new zzaz(enumMap, i2, bool, bundle.getString("cps_display_str"));
    }

    public static zzaz c(zzjb zzjb, int i2) {
        EnumMap enumMap = new EnumMap(zzjc.zza.class);
        enumMap.put(zzjc.zza.AD_USER_DATA, zzjb);
        return new zzaz(enumMap, -10, (Boolean) null, (String) null);
    }

    public static zzaz d(String str) {
        if (str == null || str.length() <= 0) {
            return f26220f;
        }
        String[] split = str.split(":");
        int parseInt = Integer.parseInt(split[0]);
        EnumMap enumMap = new EnumMap(zzjc.zza.class);
        zzjc.zza[] d2 = zzjd.DMA.d();
        int length = d2.length;
        int i2 = 1;
        int i3 = 0;
        while (i3 < length) {
            enumMap.put(d2[i3], zzjc.c(split[i2].charAt(0)));
            i3++;
            i2++;
        }
        return new zzaz(enumMap, parseInt, (Boolean) null, (String) null);
    }

    public static Boolean e(Bundle bundle) {
        zzjb e2;
        if (bundle == null || (e2 = zzjc.e(bundle.getString("ad_personalization"))) == null) {
            return null;
        }
        int i2 = zzay.f26219a[e2.ordinal()];
        if (i2 == 3) {
            return Boolean.FALSE;
        }
        if (i2 != 4) {
            return null;
        }
        return Boolean.TRUE;
    }

    public final int a() {
        return this.f26221a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzaz)) {
            return false;
        }
        zzaz zzaz = (zzaz) obj;
        if (this.f26222b.equalsIgnoreCase(zzaz.f26222b) && Objects.equals(this.f26223c, zzaz.f26223c)) {
            return Objects.equals(this.f26224d, zzaz.f26224d);
        }
        return false;
    }

    public final Bundle f() {
        Bundle bundle = new Bundle();
        for (Map.Entry entry : this.f26225e.entrySet()) {
            String r2 = zzjc.r((zzjb) entry.getValue());
            if (r2 != null) {
                bundle.putString(((zzjc.zza) entry.getKey()).f26598z, r2);
            }
        }
        Boolean bool = this.f26223c;
        if (bool != null) {
            bundle.putString("is_dma_region", bool.toString());
        }
        String str = this.f26224d;
        if (str != null) {
            bundle.putString("cps_display_str", str);
        }
        return bundle;
    }

    public final zzjb g() {
        zzjb zzjb = (zzjb) this.f26225e.get(zzjc.zza.AD_USER_DATA);
        return zzjb == null ? zzjb.UNINITIALIZED : zzjb;
    }

    public final Boolean h() {
        return this.f26223c;
    }

    public final int hashCode() {
        Boolean bool = this.f26223c;
        int i2 = bool == null ? 3 : bool == Boolean.TRUE ? 7 : 13;
        String str = this.f26224d;
        return this.f26222b.hashCode() + (i2 * 29) + ((str == null ? 17 : str.hashCode()) * 137);
    }

    public final String i() {
        return this.f26224d;
    }

    public final String j() {
        return this.f26222b;
    }

    public final boolean k() {
        for (zzjb zzjb : this.f26225e.values()) {
            if (zzjb != zzjb.UNINITIALIZED) {
                return true;
            }
        }
        return false;
    }

    public final String l() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f26221a);
        for (zzjc.zza zza : zzjd.DMA.d()) {
            sb.append(":");
            sb.append(zzjc.a((zzjb) this.f26225e.get(zza)));
        }
        return sb.toString();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("source=");
        sb.append(zzjc.j(this.f26221a));
        for (zzjc.zza zza : zzjd.DMA.d()) {
            sb.append(",");
            sb.append(zza.f26598z);
            sb.append("=");
            zzjb zzjb = (zzjb) this.f26225e.get(zza);
            if (zzjb == null) {
                sb.append("uninitialized");
            } else {
                int i2 = zzay.f26219a[zzjb.ordinal()];
                if (i2 == 1) {
                    sb.append("uninitialized");
                } else if (i2 == 2) {
                    sb.append("eu_consent_policy");
                } else if (i2 == 3) {
                    sb.append("denied");
                } else if (i2 == 4) {
                    sb.append("granted");
                }
            }
        }
        if (this.f26223c != null) {
            sb.append(",isDmaRegion=");
            sb.append(this.f26223c);
        }
        if (this.f26224d != null) {
            sb.append(",cpsDisplayStr=");
            sb.append(this.f26224d);
        }
        return sb.toString();
    }

    public zzaz(Boolean bool, int i2, Boolean bool2, String str) {
        EnumMap enumMap = new EnumMap(zzjc.zza.class);
        this.f26225e = enumMap;
        enumMap.put(zzjc.zza.AD_USER_DATA, zzjc.d(bool));
        this.f26221a = i2;
        this.f26222b = l();
        this.f26223c = bool2;
        this.f26224d = str;
    }

    public zzaz(EnumMap enumMap, int i2, Boolean bool, String str) {
        EnumMap enumMap2 = new EnumMap(zzjc.zza.class);
        this.f26225e = enumMap2;
        enumMap2.putAll(enumMap);
        this.f26221a = i2;
        this.f26222b = l();
        this.f26223c = bool;
        this.f26224d = str;
    }
}
