package com.google.android.gms.internal.measurement;

import java.util.List;

final class zzlu implements zzlv {
    public static zzll d(Object obj, long j2) {
        return (zzll) zzny.B(obj, j2);
    }

    public final List a(Object obj, long j2) {
        zzll d2 = d(obj, j2);
        if (d2.c()) {
            return d2;
        }
        int size = d2.size();
        zzll j3 = d2.j(size == 0 ? 10 : size << 1);
        zzny.j(obj, j2, j3);
        return j3;
    }

    public final void b(Object obj, long j2) {
        d(obj, j2).b();
    }

    public final void c(Object obj, Object obj2, long j2) {
        zzll d2 = d(obj, j2);
        zzll d3 = d(obj2, j2);
        int size = d2.size();
        int size2 = d3.size();
        if (size > 0 && size2 > 0) {
            if (!d2.c()) {
                d2 = d2.j(size2 + size);
            }
            d2.addAll(d3);
        }
        if (size > 0) {
            d3 = d2;
        }
        zzny.j(obj, j2, d3);
    }
}
