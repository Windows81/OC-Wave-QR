package com.google.android.gms.internal.measurement;

import java.util.List;

public final class zzw extends zzal {

    /* renamed from: B  reason: collision with root package name */
    public zzaa f25891B;

    public zzw(zzaa zzaa) {
        super("internal.registerCallback");
        this.f25891B = zzaa;
    }

    public final zzaq a(zzh zzh, List list) {
        zzg.g(this.f25333z, 3, list);
        String h2 = zzh.b((zzaq) list.get(0)).h();
        zzaq b2 = zzh.b((zzaq) list.get(1));
        if (b2 instanceof zzar) {
            zzaq b3 = zzh.b((zzaq) list.get(2));
            if (b3 instanceof zzap) {
                zzap zzap = (zzap) b3;
                if (zzap.n("type")) {
                    this.f25891B.c(h2, zzap.n("priority") ? zzg.i(zzap.m("priority").g().doubleValue()) : 1000, (zzar) b2, zzap.m("type").h());
                    return zzaq.f25336m;
                }
                throw new IllegalArgumentException("Undefined rule type");
            }
            throw new IllegalArgumentException("Invalid callback params");
        }
        throw new IllegalArgumentException("Invalid callback type");
    }
}
