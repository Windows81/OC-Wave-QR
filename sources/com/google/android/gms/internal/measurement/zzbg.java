package com.google.android.gms.internal.measurement;

import java.util.List;

public final class zzbg extends zzay {
    public zzbg() {
        this.f25352a.add(zzbv.AND);
        this.f25352a.add(zzbv.NOT);
        this.f25352a.add(zzbv.OR);
    }

    public final zzaq b(String str, zzh zzh, List list) {
        int i2 = zzbj.f25364a[zzg.c(str).ordinal()];
        if (i2 == 1) {
            zzg.f(zzbv.AND, 2, list);
            zzaq b2 = zzh.b((zzaq) list.get(0));
            return !b2.e().booleanValue() ? b2 : zzh.b((zzaq) list.get(1));
        } else if (i2 == 2) {
            zzg.f(zzbv.NOT, 1, list);
            return new zzag(Boolean.valueOf(!zzh.b((zzaq) list.get(0)).e().booleanValue()));
        } else if (i2 != 3) {
            return super.a(str);
        } else {
            zzg.f(zzbv.OR, 2, list);
            zzaq b3 = zzh.b((zzaq) list.get(0));
            return b3.e().booleanValue() ? b3 : zzh.b((zzaq) list.get(1));
        }
    }
}
