package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final /* synthetic */ class zzan {
    public static zzaq a(zzak zzak, zzaq zzaq, zzh zzh, List list) {
        if (zzak.n(zzaq.h())) {
            zzaq m2 = zzak.m(zzaq.h());
            if (m2 instanceof zzal) {
                return ((zzal) m2).a(zzh, list);
            }
            throw new IllegalArgumentException(String.format("%s is not a function", new Object[]{zzaq.h()}));
        } else if ("hasOwnProperty".equals(zzaq.h())) {
            zzg.g("hasOwnProperty", 1, list);
            return zzak.n(zzh.b((zzaq) list.get(0)).h()) ? zzaq.f25341r : zzaq.f25342s;
        } else {
            throw new IllegalArgumentException(String.format("Object has no function %s", new Object[]{zzaq.h()}));
        }
    }

    public static Iterator b(Map map) {
        return new zzam(map.keySet().iterator());
    }
}
