package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class zzz extends zzal {

    /* renamed from: B  reason: collision with root package name */
    public final zzl f25893B;
    public final Map C = new HashMap();

    public zzz(zzl zzl) {
        super("require");
        this.f25893B = zzl;
    }

    public final zzaq a(zzh zzh, List list) {
        zzg.g("require", 1, list);
        String h2 = zzh.b((zzaq) list.get(0)).h();
        if (this.C.containsKey(h2)) {
            return (zzaq) this.C.get(h2);
        }
        zzaq a2 = this.f25893B.a(h2);
        if (a2 instanceof zzal) {
            this.C.put(h2, (zzal) a2);
        }
        return a2;
    }
}
