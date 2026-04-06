package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

public final class zzbc extends zzay {
    public zzbc() {
        this.f25352a.add(zzbv.APPLY);
        this.f25352a.add(zzbv.BLOCK);
        this.f25352a.add(zzbv.BREAK);
        this.f25352a.add(zzbv.CASE);
        this.f25352a.add(zzbv.DEFAULT);
        this.f25352a.add(zzbv.CONTINUE);
        this.f25352a.add(zzbv.DEFINE_FUNCTION);
        this.f25352a.add(zzbv.FN);
        this.f25352a.add(zzbv.IF);
        this.f25352a.add(zzbv.QUOTE);
        this.f25352a.add(zzbv.RETURN);
        this.f25352a.add(zzbv.SWITCH);
        this.f25352a.add(zzbv.TERNARY);
    }

    public static zzaq c(zzh zzh, List list) {
        zzg.j(zzbv.FN, 2, list);
        zzaq b2 = zzh.b((zzaq) list.get(0));
        zzaq b3 = zzh.b((zzaq) list.get(1));
        if (b3 instanceof zzaf) {
            List E = ((zzaf) b3).E();
            List arrayList = new ArrayList();
            if (list.size() > 2) {
                arrayList = list.subList(2, list.size());
            }
            return new zzar(b2.h(), E, arrayList, zzh);
        }
        throw new IllegalArgumentException(String.format("FN requires an ArrayValue of parameter names found %s", new Object[]{b3.getClass().getCanonicalName()}));
    }

    public final zzaq b(String str, zzh zzh, List list) {
        int i2 = 0;
        switch (zzbf.f25361a[zzg.c(str).ordinal()]) {
            case 1:
                zzg.f(zzbv.APPLY, 3, list);
                zzaq b2 = zzh.b((zzaq) list.get(0));
                String h2 = zzh.b((zzaq) list.get(1)).h();
                zzaq b3 = zzh.b((zzaq) list.get(2));
                if (!(b3 instanceof zzaf)) {
                    throw new IllegalArgumentException(String.format("Function arguments for Apply are not a list found %s", new Object[]{b3.getClass().getCanonicalName()}));
                } else if (!h2.isEmpty()) {
                    return b2.o(h2, zzh, ((zzaf) b3).E());
                } else {
                    throw new IllegalArgumentException("Function name for apply is undefined");
                }
            case 2:
                return zzh.d().a(new zzaf(list));
            case 3:
                zzg.f(zzbv.BREAK, 0, list);
                return zzaq.f25339p;
            case 4:
            case 5:
                if (!list.isEmpty()) {
                    zzaq b4 = zzh.b((zzaq) list.get(0));
                    if (b4 instanceof zzaf) {
                        return zzh.a((zzaf) b4);
                    }
                }
                return zzaq.f25336m;
            case 6:
                zzg.f(zzbv.BREAK, 0, list);
                return zzaq.f25338o;
            case 7:
                zzg.j(zzbv.DEFINE_FUNCTION, 2, list);
                zzar zzar = (zzar) c(zzh, list);
                if (zzar.b() == null) {
                    zzh.h("", zzar);
                } else {
                    zzh.h(zzar.b(), zzar);
                }
                return zzar;
            case 8:
                return c(zzh, list);
            case 9:
                zzg.j(zzbv.IF, 2, list);
                zzaq b5 = zzh.b((zzaq) list.get(0));
                zzaq b6 = zzh.b((zzaq) list.get(1));
                zzaq b7 = list.size() > 2 ? zzh.b((zzaq) list.get(2)) : null;
                zzaq zzaq = zzaq.f25336m;
                zzaq a2 = b5.e().booleanValue() ? zzh.a((zzaf) b6) : b7 != null ? zzh.a((zzaf) b7) : zzaq;
                return a2 instanceof zzaj ? a2 : zzaq;
            case 10:
                return new zzaf(list);
            case 11:
                if (list.isEmpty()) {
                    return zzaq.f25340q;
                }
                zzg.f(zzbv.RETURN, 1, list);
                return new zzaj("return", zzh.b((zzaq) list.get(0)));
            case 12:
                zzg.f(zzbv.SWITCH, 3, list);
                zzaq b8 = zzh.b((zzaq) list.get(0));
                zzaq b9 = zzh.b((zzaq) list.get(1));
                zzaq b10 = zzh.b((zzaq) list.get(2));
                if (!(b9 instanceof zzaf)) {
                    throw new IllegalArgumentException("Malformed SWITCH statement, cases are not a list");
                } else if (b10 instanceof zzaf) {
                    zzaf zzaf = (zzaf) b9;
                    zzaf zzaf2 = (zzaf) b10;
                    boolean z2 = false;
                    while (true) {
                        if (i2 < zzaf.w()) {
                            if (z2 || b8.equals(zzh.b(zzaf.s(i2)))) {
                                zzaq b11 = zzh.b(zzaf2.s(i2));
                                if (!(b11 instanceof zzaj)) {
                                    z2 = true;
                                } else if (!((zzaj) b11).b().equals("break")) {
                                    return b11;
                                }
                            }
                            i2++;
                        } else if (zzaf.w() + 1 == zzaf2.w()) {
                            zzaq b12 = zzh.b(zzaf2.s(zzaf.w()));
                            if (b12 instanceof zzaj) {
                                String b13 = ((zzaj) b12).b();
                                if (b13.equals("return") || b13.equals("continue")) {
                                    return b12;
                                }
                            }
                        }
                    }
                    return zzaq.f25336m;
                } else {
                    throw new IllegalArgumentException("Malformed SWITCH statement, case statements are not a list");
                }
            case 13:
                zzg.f(zzbv.TERNARY, 3, list);
                return zzh.b((zzaq) list.get(0)).e().booleanValue() ? zzh.b((zzaq) list.get(1)) : zzh.b((zzaq) list.get(2));
            default:
                return super.a(str);
        }
    }
}
