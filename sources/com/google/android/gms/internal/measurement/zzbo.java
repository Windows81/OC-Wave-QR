package com.google.android.gms.internal.measurement;

import java.util.List;

public final class zzbo extends zzay {
    public zzbo() {
        this.f25352a.add(zzbv.ADD);
        this.f25352a.add(zzbv.DIVIDE);
        this.f25352a.add(zzbv.MODULUS);
        this.f25352a.add(zzbv.MULTIPLY);
        this.f25352a.add(zzbv.NEGATE);
        this.f25352a.add(zzbv.POST_DECREMENT);
        this.f25352a.add(zzbv.POST_INCREMENT);
        this.f25352a.add(zzbv.PRE_DECREMENT);
        this.f25352a.add(zzbv.PRE_INCREMENT);
        this.f25352a.add(zzbv.SUBTRACT);
    }

    public final zzaq b(String str, zzh zzh, List list) {
        switch (zzbr.f25372a[zzg.c(str).ordinal()]) {
            case 1:
                zzg.f(zzbv.ADD, 2, list);
                zzaq b2 = zzh.b((zzaq) list.get(0));
                zzaq b3 = zzh.b((zzaq) list.get(1));
                if (!(b2 instanceof zzak) && !(b2 instanceof zzas) && !(b3 instanceof zzak) && !(b3 instanceof zzas)) {
                    return new zzai(Double.valueOf(b2.g().doubleValue() + b3.g().doubleValue()));
                }
                String h2 = b2.h();
                String h3 = b3.h();
                return new zzas(h2 + h3);
            case 2:
                zzg.f(zzbv.DIVIDE, 2, list);
                return new zzai(Double.valueOf(zzh.b((zzaq) list.get(0)).g().doubleValue() / zzh.b((zzaq) list.get(1)).g().doubleValue()));
            case 3:
                zzg.f(zzbv.MODULUS, 2, list);
                return new zzai(Double.valueOf(zzh.b((zzaq) list.get(0)).g().doubleValue() % zzh.b((zzaq) list.get(1)).g().doubleValue()));
            case 4:
                zzg.f(zzbv.MULTIPLY, 2, list);
                return new zzai(Double.valueOf(zzh.b((zzaq) list.get(0)).g().doubleValue() * zzh.b((zzaq) list.get(1)).g().doubleValue()));
            case 5:
                zzg.f(zzbv.NEGATE, 1, list);
                return new zzai(Double.valueOf(zzh.b((zzaq) list.get(0)).g().doubleValue() * -1.0d));
            case 6:
            case 7:
                zzg.g(str, 2, list);
                zzaq b4 = zzh.b((zzaq) list.get(0));
                zzh.b((zzaq) list.get(1));
                return b4;
            case 8:
            case 9:
                zzg.g(str, 1, list);
                return zzh.b((zzaq) list.get(0));
            case 10:
                zzg.f(zzbv.SUBTRACT, 2, list);
                return new zzai(Double.valueOf(zzh.b((zzaq) list.get(0)).g().doubleValue() + new zzai(Double.valueOf(zzh.b((zzaq) list.get(1)).g().doubleValue() * -1.0d)).g().doubleValue()));
            default:
                return super.a(str);
        }
    }
}
