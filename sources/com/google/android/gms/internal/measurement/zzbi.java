package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

public final class zzbi extends zzay {
    public zzbi() {
        this.f25352a.add(zzbv.FOR_IN);
        this.f25352a.add(zzbv.FOR_IN_CONST);
        this.f25352a.add(zzbv.FOR_IN_LET);
        this.f25352a.add(zzbv.FOR_LET);
        this.f25352a.add(zzbv.FOR_OF);
        this.f25352a.add(zzbv.FOR_OF_CONST);
        this.f25352a.add(zzbv.FOR_OF_LET);
        this.f25352a.add(zzbv.WHILE);
    }

    public static zzaq c(zzbm zzbm, zzaq zzaq, zzaq zzaq2) {
        return d(zzbm, zzaq.i(), zzaq2);
    }

    public static zzaq d(zzbm zzbm, Iterator it, zzaq zzaq) {
        if (it != null) {
            while (it.hasNext()) {
                zzaq a2 = zzbm.a((zzaq) it.next()).a((zzaf) zzaq);
                if (a2 instanceof zzaj) {
                    zzaj zzaj = (zzaj) a2;
                    if ("break".equals(zzaj.b())) {
                        return zzaq.f25336m;
                    }
                    if ("return".equals(zzaj.b())) {
                        return zzaj;
                    }
                }
            }
        }
        return zzaq.f25336m;
    }

    public static zzaq e(zzbm zzbm, zzaq zzaq, zzaq zzaq2) {
        if (zzaq instanceof Iterable) {
            return d(zzbm, ((Iterable) zzaq).iterator(), zzaq2);
        }
        throw new IllegalArgumentException("Non-iterable type in for...of loop.");
    }

    public final zzaq b(String str, zzh zzh, List list) {
        switch (zzbl.f25367a[zzg.c(str).ordinal()]) {
            case 1:
                zzg.f(zzbv.FOR_IN, 3, list);
                if (list.get(0) instanceof zzas) {
                    return c(new zzbp(zzh, ((zzaq) list.get(0)).h()), zzh.b((zzaq) list.get(1)), zzh.b((zzaq) list.get(2)));
                }
                throw new IllegalArgumentException("Variable name in FOR_IN must be a string");
            case 2:
                zzg.f(zzbv.FOR_IN_CONST, 3, list);
                if (list.get(0) instanceof zzas) {
                    return c(new zzbk(zzh, ((zzaq) list.get(0)).h()), zzh.b((zzaq) list.get(1)), zzh.b((zzaq) list.get(2)));
                }
                throw new IllegalArgumentException("Variable name in FOR_IN_CONST must be a string");
            case 3:
                zzg.f(zzbv.FOR_IN_LET, 3, list);
                if (list.get(0) instanceof zzas) {
                    return c(new zzbn(zzh, ((zzaq) list.get(0)).h()), zzh.b((zzaq) list.get(1)), zzh.b((zzaq) list.get(2)));
                }
                throw new IllegalArgumentException("Variable name in FOR_IN_LET must be a string");
            case 4:
                zzg.f(zzbv.FOR_LET, 4, list);
                zzaq b2 = zzh.b((zzaq) list.get(0));
                if (b2 instanceof zzaf) {
                    zzaf zzaf = (zzaf) b2;
                    zzaq zzaq = (zzaq) list.get(1);
                    zzaq zzaq2 = (zzaq) list.get(2);
                    zzaq b3 = zzh.b((zzaq) list.get(3));
                    zzh d2 = zzh.d();
                    for (int i2 = 0; i2 < zzaf.w(); i2++) {
                        String h2 = zzaf.s(i2).h();
                        d2.h(h2, zzh.c(h2));
                    }
                    while (zzh.b(zzaq).e().booleanValue()) {
                        zzaq a2 = zzh.a((zzaf) b3);
                        if (a2 instanceof zzaj) {
                            zzaj zzaj = (zzaj) a2;
                            if ("break".equals(zzaj.b())) {
                                return zzaq.f25336m;
                            }
                            if ("return".equals(zzaj.b())) {
                                return zzaj;
                            }
                        }
                        zzh d3 = zzh.d();
                        for (int i3 = 0; i3 < zzaf.w(); i3++) {
                            String h3 = zzaf.s(i3).h();
                            d3.h(h3, d2.c(h3));
                        }
                        d3.b(zzaq2);
                        d2 = d3;
                    }
                    return zzaq.f25336m;
                }
                throw new IllegalArgumentException("Initializer variables in FOR_LET must be an ArrayList");
            case 5:
                zzg.f(zzbv.FOR_OF, 3, list);
                if (list.get(0) instanceof zzas) {
                    return e(new zzbp(zzh, ((zzaq) list.get(0)).h()), zzh.b((zzaq) list.get(1)), zzh.b((zzaq) list.get(2)));
                }
                throw new IllegalArgumentException("Variable name in FOR_OF must be a string");
            case 6:
                zzg.f(zzbv.FOR_OF_CONST, 3, list);
                if (list.get(0) instanceof zzas) {
                    return e(new zzbk(zzh, ((zzaq) list.get(0)).h()), zzh.b((zzaq) list.get(1)), zzh.b((zzaq) list.get(2)));
                }
                throw new IllegalArgumentException("Variable name in FOR_OF_CONST must be a string");
            case 7:
                zzg.f(zzbv.FOR_OF_LET, 3, list);
                if (list.get(0) instanceof zzas) {
                    return e(new zzbn(zzh, ((zzaq) list.get(0)).h()), zzh.b((zzaq) list.get(1)), zzh.b((zzaq) list.get(2)));
                }
                throw new IllegalArgumentException("Variable name in FOR_OF_LET must be a string");
            case 8:
                zzg.f(zzbv.WHILE, 4, list);
                zzaq zzaq3 = (zzaq) list.get(0);
                zzaq zzaq4 = (zzaq) list.get(1);
                zzaq b4 = zzh.b((zzaq) list.get(3));
                if (zzh.b((zzaq) list.get(2)).e().booleanValue()) {
                    zzaq a3 = zzh.a((zzaf) b4);
                    if (a3 instanceof zzaj) {
                        zzaj zzaj2 = (zzaj) a3;
                        if (!"break".equals(zzaj2.b())) {
                            if ("return".equals(zzaj2.b())) {
                                return zzaj2;
                            }
                        }
                        return zzaq.f25336m;
                    }
                }
                while (zzh.b(zzaq3).e().booleanValue()) {
                    zzaq a4 = zzh.a((zzaf) b4);
                    if (a4 instanceof zzaj) {
                        zzaj zzaj3 = (zzaj) a4;
                        if ("break".equals(zzaj3.b())) {
                            return zzaq.f25336m;
                        }
                        if ("return".equals(zzaj3.b())) {
                            return zzaj3;
                        }
                    }
                    zzh.b(zzaq4);
                }
                return zzaq.f25336m;
            default:
                return super.a(str);
        }
    }
}
