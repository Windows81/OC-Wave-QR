package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

final class zzmh implements zzme {
    public final zzmc b(Object obj) {
        zzmd zzmd = (zzmd) obj;
        throw new NoSuchMethodError();
    }

    public final Map c(Object obj) {
        return (zzmf) obj;
    }

    public final Map d(Object obj) {
        return (zzmf) obj;
    }

    public final Object e(Object obj) {
        return zzmf.c().f();
    }

    public final Object f(Object obj, Object obj2) {
        zzmf zzmf = (zzmf) obj;
        zzmf zzmf2 = (zzmf) obj2;
        if (!zzmf2.isEmpty()) {
            if (!zzmf.h()) {
                zzmf = zzmf.f();
            }
            zzmf.e(zzmf2);
        }
        return zzmf;
    }

    public final boolean g(Object obj) {
        return !((zzmf) obj).h();
    }

    public final Object h(Object obj) {
        ((zzmf) obj).g();
        return obj;
    }

    public final int i(int i2, Object obj, Object obj2) {
        zzmf zzmf = (zzmf) obj;
        zzmd zzmd = (zzmd) obj2;
        if (zzmf.isEmpty()) {
            return 0;
        }
        Iterator it = zzmf.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw new NoSuchMethodError();
    }
}
