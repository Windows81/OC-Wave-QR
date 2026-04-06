package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.zzjc;
import java.util.EnumMap;

final class zzai {

    /* renamed from: a  reason: collision with root package name */
    public final EnumMap f26181a;

    public zzai() {
        this.f26181a = new EnumMap(zzjc.zza.class);
    }

    public static zzai a(String str) {
        EnumMap enumMap = new EnumMap(zzjc.zza.class);
        if (str.length() >= zzjc.zza.values().length) {
            int i2 = 0;
            if (str.charAt(0) == '1') {
                zzjc.zza[] values = zzjc.zza.values();
                int length = values.length;
                int i3 = 1;
                while (i2 < length) {
                    enumMap.put(values[i2], zzal.f(str.charAt(i3)));
                    i2++;
                    i3++;
                }
                return new zzai(enumMap);
            }
        }
        return new zzai();
    }

    public final zzal b(zzjc.zza zza) {
        zzal zzal = (zzal) this.f26181a.get(zza);
        return zzal == null ? zzal.UNSET : zzal;
    }

    public final void c(zzjc.zza zza, int i2) {
        zzal zzal = zzal.UNSET;
        if (i2 != -30) {
            if (i2 != -20) {
                if (i2 == -10) {
                    zzal = zzal.MANIFEST;
                } else if (i2 != 0) {
                    if (i2 == 30) {
                        zzal = zzal.INITIALIZATION;
                    }
                }
            }
            zzal = zzal.API;
        } else {
            zzal = zzal.TCF;
        }
        this.f26181a.put(zza, zzal);
    }

    public final void d(zzjc.zza zza, zzal zzal) {
        this.f26181a.put(zza, zzal);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("1");
        for (zzjc.zza zza : zzjc.zza.values()) {
            zzal zzal = (zzal) this.f26181a.get(zza);
            if (zzal == null) {
                zzal = zzal.UNSET;
            }
            sb.append(zzal.f26185z);
        }
        return sb.toString();
    }

    public zzai(EnumMap enumMap) {
        EnumMap enumMap2 = new EnumMap(zzjc.zza.class);
        this.f26181a = enumMap2;
        enumMap2.putAll(enumMap);
    }
}
