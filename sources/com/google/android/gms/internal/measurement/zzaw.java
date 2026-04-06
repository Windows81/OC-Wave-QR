package com.google.android.gms.internal.measurement;

import java.util.List;

public final class zzaw extends zzay {
    public zzaw() {
        this.f25352a.add(zzbv.BITWISE_AND);
        this.f25352a.add(zzbv.BITWISE_LEFT_SHIFT);
        this.f25352a.add(zzbv.BITWISE_NOT);
        this.f25352a.add(zzbv.BITWISE_OR);
        this.f25352a.add(zzbv.BITWISE_RIGHT_SHIFT);
        this.f25352a.add(zzbv.BITWISE_UNSIGNED_RIGHT_SHIFT);
        this.f25352a.add(zzbv.BITWISE_XOR);
    }

    public final zzaq b(String str, zzh zzh, List list) {
        switch (zzaz.f25353a[zzg.c(str).ordinal()]) {
            case 1:
                zzg.f(zzbv.BITWISE_AND, 2, list);
                return new zzai(Double.valueOf((double) (zzg.i(zzh.b((zzaq) list.get(0)).g().doubleValue()) & zzg.i(zzh.b((zzaq) list.get(1)).g().doubleValue()))));
            case 2:
                zzg.f(zzbv.BITWISE_LEFT_SHIFT, 2, list);
                return new zzai(Double.valueOf((double) (zzg.i(zzh.b((zzaq) list.get(0)).g().doubleValue()) << ((int) (zzg.m(zzh.b((zzaq) list.get(1)).g().doubleValue()) & 31)))));
            case 3:
                zzg.f(zzbv.BITWISE_NOT, 1, list);
                return new zzai(Double.valueOf((double) (~zzg.i(zzh.b((zzaq) list.get(0)).g().doubleValue()))));
            case 4:
                zzg.f(zzbv.BITWISE_OR, 2, list);
                return new zzai(Double.valueOf((double) (zzg.i(zzh.b((zzaq) list.get(0)).g().doubleValue()) | zzg.i(zzh.b((zzaq) list.get(1)).g().doubleValue()))));
            case 5:
                zzg.f(zzbv.BITWISE_RIGHT_SHIFT, 2, list);
                return new zzai(Double.valueOf((double) (zzg.i(zzh.b((zzaq) list.get(0)).g().doubleValue()) >> ((int) (zzg.m(zzh.b((zzaq) list.get(1)).g().doubleValue()) & 31)))));
            case 6:
                zzg.f(zzbv.BITWISE_UNSIGNED_RIGHT_SHIFT, 2, list);
                return new zzai(Double.valueOf((double) (zzg.m(zzh.b((zzaq) list.get(0)).g().doubleValue()) >>> ((int) (zzg.m(zzh.b((zzaq) list.get(1)).g().doubleValue()) & 31)))));
            case 7:
                zzg.f(zzbv.BITWISE_XOR, 2, list);
                return new zzai(Double.valueOf((double) (zzg.i(zzh.b((zzaq) list.get(0)).g().doubleValue()) ^ zzg.i(zzh.b((zzaq) list.get(1)).g().doubleValue()))));
            default:
                return super.a(str);
        }
    }
}
