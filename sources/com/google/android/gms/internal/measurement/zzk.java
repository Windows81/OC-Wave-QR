package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.List;

public final class zzk extends zzal {

    /* renamed from: B  reason: collision with root package name */
    public final zzac f25573B;

    public zzk(zzac zzac) {
        super("internal.eventLogger");
        this.f25573B = zzac;
    }

    public final zzaq a(zzh zzh, List list) {
        zzg.g(this.f25333z, 3, list);
        String h2 = zzh.b((zzaq) list.get(0)).h();
        long a2 = (long) zzg.a(zzh.b((zzaq) list.get(1)).g().doubleValue());
        zzaq b2 = zzh.b((zzaq) list.get(2));
        this.f25573B.c(h2, a2, b2 instanceof zzap ? zzg.e((zzap) b2) : new HashMap());
        return zzaq.f25336m;
    }
}
