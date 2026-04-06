package com.google.android.gms.internal.measurement;

import java.util.List;

public final class zzba extends zzay {
    public zzba() {
        this.f25352a.add(zzbv.EQUALS);
        this.f25352a.add(zzbv.GREATER_THAN);
        this.f25352a.add(zzbv.GREATER_THAN_EQUALS);
        this.f25352a.add(zzbv.IDENTITY_EQUALS);
        this.f25352a.add(zzbv.IDENTITY_NOT_EQUALS);
        this.f25352a.add(zzbv.LESS_THAN);
        this.f25352a.add(zzbv.LESS_THAN_EQUALS);
        this.f25352a.add(zzbv.NOT_EQUALS);
    }

    public static boolean c(zzaq zzaq, zzaq zzaq2) {
        zzaq zzas;
        zzaq zzas2;
        while (!zzaq.getClass().equals(zzaq2.getClass())) {
            if (((zzaq instanceof zzax) || (zzaq instanceof zzao)) && ((zzaq2 instanceof zzax) || (zzaq2 instanceof zzao))) {
                return true;
            }
            boolean z2 = zzaq instanceof zzai;
            if (!z2 || !(zzaq2 instanceof zzas)) {
                boolean z3 = zzaq instanceof zzas;
                if (z3 && (zzaq2 instanceof zzai)) {
                    zzas = new zzai(zzaq.g());
                } else if (zzaq instanceof zzag) {
                    zzas = new zzai(zzaq.g());
                } else if (zzaq2 instanceof zzag) {
                    zzas2 = new zzai(zzaq2.g());
                } else if ((z3 || z2) && (zzaq2 instanceof zzak)) {
                    zzas2 = new zzas(zzaq2.h());
                } else if (!(zzaq instanceof zzak) || (!(zzaq2 instanceof zzas) && !(zzaq2 instanceof zzai))) {
                    return false;
                } else {
                    zzas = new zzas(zzaq.h());
                }
                zzaq = zzas;
            } else {
                zzas2 = new zzai(zzaq2.g());
            }
            zzaq2 = zzas2;
        }
        if ((zzaq instanceof zzax) || (zzaq instanceof zzao)) {
            return true;
        }
        return zzaq instanceof zzai ? !Double.isNaN(zzaq.g().doubleValue()) && !Double.isNaN(zzaq2.g().doubleValue()) && zzaq.g().doubleValue() == zzaq2.g().doubleValue() : zzaq instanceof zzas ? zzaq.h().equals(zzaq2.h()) : zzaq instanceof zzag ? zzaq.e().equals(zzaq2.e()) : zzaq == zzaq2;
    }

    public static boolean d(zzaq zzaq, zzaq zzaq2) {
        if (zzaq instanceof zzak) {
            zzaq = new zzas(zzaq.h());
        }
        if (zzaq2 instanceof zzak) {
            zzaq2 = new zzas(zzaq2.h());
        }
        if ((zzaq instanceof zzas) && (zzaq2 instanceof zzas)) {
            return zzaq.h().compareTo(zzaq2.h()) < 0;
        }
        double doubleValue = zzaq.g().doubleValue();
        double doubleValue2 = zzaq2.g().doubleValue();
        return !Double.isNaN(doubleValue) && !Double.isNaN(doubleValue2) && !(doubleValue == 0.0d && doubleValue2 == -0.0d) && (!(doubleValue == -0.0d && doubleValue2 == 0.0d) && Double.compare(doubleValue, doubleValue2) < 0);
    }

    public static boolean e(zzaq zzaq, zzaq zzaq2) {
        if (zzaq instanceof zzak) {
            zzaq = new zzas(zzaq.h());
        }
        if (zzaq2 instanceof zzak) {
            zzaq2 = new zzas(zzaq2.h());
        }
        return (((zzaq instanceof zzas) && (zzaq2 instanceof zzas)) || (!Double.isNaN(zzaq.g().doubleValue()) && !Double.isNaN(zzaq2.g().doubleValue()))) && !d(zzaq2, zzaq);
    }

    public final zzaq b(String str, zzh zzh, List list) {
        boolean z2;
        boolean h2;
        zzg.f(zzg.c(str), 2, list);
        zzaq b2 = zzh.b((zzaq) list.get(0));
        zzaq b3 = zzh.b((zzaq) list.get(1));
        switch (zzbd.f25360a[zzg.c(str).ordinal()]) {
            case 1:
                z2 = c(b2, b3);
                break;
            case 2:
                z2 = d(b3, b2);
                break;
            case 3:
                z2 = e(b3, b2);
                break;
            case 4:
                z2 = zzg.h(b2, b3);
                break;
            case 5:
                h2 = zzg.h(b2, b3);
                break;
            case 6:
                z2 = d(b2, b3);
                break;
            case 7:
                z2 = e(b2, b3);
                break;
            case 8:
                h2 = c(b2, b3);
                break;
            default:
                return super.a(str);
        }
        z2 = !h2;
        return z2 ? zzaq.f25341r : zzaq.f25342s;
    }
}
