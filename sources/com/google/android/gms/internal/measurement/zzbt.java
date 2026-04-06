package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

public final class zzbt extends zzay {
    public zzbt() {
        this.f25352a.add(zzbv.ASSIGN);
        this.f25352a.add(zzbv.CONST);
        this.f25352a.add(zzbv.CREATE_ARRAY);
        this.f25352a.add(zzbv.CREATE_OBJECT);
        this.f25352a.add(zzbv.EXPRESSION_LIST);
        this.f25352a.add(zzbv.GET);
        this.f25352a.add(zzbv.GET_INDEX);
        this.f25352a.add(zzbv.GET_PROPERTY);
        this.f25352a.add(zzbv.NULL);
        this.f25352a.add(zzbv.SET_PROPERTY);
        this.f25352a.add(zzbv.TYPEOF);
        this.f25352a.add(zzbv.UNDEFINED);
        this.f25352a.add(zzbv.VAR);
    }

    public final zzaq b(String str, zzh zzh, List list) {
        String str2;
        int i2 = 0;
        switch (zzbs.f25373a[zzg.c(str).ordinal()]) {
            case 1:
                zzg.f(zzbv.ASSIGN, 2, list);
                zzaq b2 = zzh.b((zzaq) list.get(0));
                if (!(b2 instanceof zzas)) {
                    throw new IllegalArgumentException(String.format("Expected string for assign var. got %s", new Object[]{b2.getClass().getCanonicalName()}));
                } else if (zzh.g(b2.h())) {
                    zzaq b3 = zzh.b((zzaq) list.get(1));
                    zzh.h(b2.h(), b3);
                    return b3;
                } else {
                    throw new IllegalArgumentException(String.format("Attempting to assign undefined value %s", new Object[]{b2.h()}));
                }
            case 2:
                zzg.j(zzbv.CONST, 2, list);
                if (list.size() % 2 == 0) {
                    while (i2 < list.size() - 1) {
                        zzaq b4 = zzh.b((zzaq) list.get(i2));
                        if (b4 instanceof zzas) {
                            zzh.f(b4.h(), zzh.b((zzaq) list.get(i2 + 1)));
                            i2 += 2;
                        } else {
                            throw new IllegalArgumentException(String.format("Expected string for const name. got %s", new Object[]{b4.getClass().getCanonicalName()}));
                        }
                    }
                    return zzaq.f25336m;
                }
                throw new IllegalArgumentException(String.format("CONST requires an even number of arguments, found %s", new Object[]{Integer.valueOf(list.size())}));
            case 3:
                if (list.isEmpty()) {
                    return new zzaf();
                }
                zzaf zzaf = new zzaf();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    zzaq b5 = zzh.b((zzaq) it.next());
                    if (!(b5 instanceof zzaj)) {
                        zzaf.B(i2, b5);
                        i2++;
                    } else {
                        throw new IllegalStateException("Failed to evaluate array element");
                    }
                }
                return zzaf;
            case 4:
                if (list.isEmpty()) {
                    return new zzap();
                }
                if (list.size() % 2 == 0) {
                    zzap zzap = new zzap();
                    while (i2 < list.size() - 1) {
                        zzaq b6 = zzh.b((zzaq) list.get(i2));
                        zzaq b7 = zzh.b((zzaq) list.get(i2 + 1));
                        if ((b6 instanceof zzaj) || (b7 instanceof zzaj)) {
                            throw new IllegalStateException("Failed to evaluate map entry");
                        }
                        zzap.p(b6.h(), b7);
                        i2 += 2;
                    }
                    return zzap;
                }
                throw new IllegalArgumentException(String.format("CREATE_OBJECT requires an even number of arguments, found %s", new Object[]{Integer.valueOf(list.size())}));
            case 5:
                zzg.j(zzbv.EXPRESSION_LIST, 1, list);
                zzaq zzaq = zzaq.f25336m;
                while (i2 < list.size()) {
                    zzaq = zzh.b((zzaq) list.get(i2));
                    if (!(zzaq instanceof zzaj)) {
                        i2++;
                    } else {
                        throw new IllegalStateException("ControlValue cannot be in an expression list");
                    }
                }
                return zzaq;
            case 6:
                zzg.f(zzbv.GET, 1, list);
                zzaq b8 = zzh.b((zzaq) list.get(0));
                if (b8 instanceof zzas) {
                    return zzh.c(b8.h());
                }
                throw new IllegalArgumentException(String.format("Expected string for get var. got %s", new Object[]{b8.getClass().getCanonicalName()}));
            case 7:
            case 8:
                zzg.f(zzbv.GET_PROPERTY, 2, list);
                zzaq b9 = zzh.b((zzaq) list.get(0));
                zzaq b10 = zzh.b((zzaq) list.get(1));
                if ((b9 instanceof zzaf) && zzg.l(b10)) {
                    return ((zzaf) b9).s(b10.g().intValue());
                }
                if (b9 instanceof zzak) {
                    return ((zzak) b9).m(b10.h());
                }
                if (b9 instanceof zzas) {
                    if ("length".equals(b10.h())) {
                        return new zzai(Double.valueOf((double) b9.h().length()));
                    }
                    if (zzg.l(b10) && b10.g().doubleValue() < ((double) b9.h().length())) {
                        return new zzas(String.valueOf(b9.h().charAt(b10.g().intValue())));
                    }
                }
                return zzaq.f25336m;
            case 9:
                zzg.f(zzbv.NULL, 0, list);
                return zzaq.f25337n;
            case 10:
                zzg.f(zzbv.SET_PROPERTY, 3, list);
                zzaq b11 = zzh.b((zzaq) list.get(0));
                zzaq b12 = zzh.b((zzaq) list.get(1));
                zzaq b13 = zzh.b((zzaq) list.get(2));
                if (b11 == zzaq.f25336m || b11 == zzaq.f25337n) {
                    throw new IllegalStateException(String.format("Can't set property %s of %s", new Object[]{b12.h(), b11.h()}));
                }
                if ((b11 instanceof zzaf) && (b12 instanceof zzai)) {
                    ((zzaf) b11).B(b12.g().intValue(), b13);
                } else if (b11 instanceof zzak) {
                    ((zzak) b11).p(b12.h(), b13);
                }
                return b13;
            case 11:
                zzg.f(zzbv.TYPEOF, 1, list);
                zzaq b14 = zzh.b((zzaq) list.get(0));
                if (b14 instanceof zzax) {
                    str2 = "undefined";
                } else if (b14 instanceof zzag) {
                    str2 = "boolean";
                } else if (b14 instanceof zzai) {
                    str2 = "number";
                } else if (b14 instanceof zzas) {
                    str2 = "string";
                } else if (b14 instanceof zzar) {
                    str2 = "function";
                } else if ((b14 instanceof zzat) || (b14 instanceof zzaj)) {
                    throw new IllegalArgumentException(String.format("Unsupported value type %s in typeof", new Object[]{b14}));
                } else {
                    str2 = "object";
                }
                return new zzas(str2);
            case 12:
                zzg.f(zzbv.UNDEFINED, 0, list);
                return zzaq.f25336m;
            case 13:
                zzg.j(zzbv.VAR, 1, list);
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    zzaq b15 = zzh.b((zzaq) it2.next());
                    if (b15 instanceof zzas) {
                        zzh.e(b15.h(), zzaq.f25336m);
                    } else {
                        throw new IllegalArgumentException(String.format("Expected string for var name. got %s", new Object[]{b15.getClass().getCanonicalName()}));
                    }
                }
                return zzaq.f25336m;
            default:
                return super.a(str);
        }
    }
}
