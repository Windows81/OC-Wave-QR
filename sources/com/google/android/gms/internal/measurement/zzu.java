package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

final class zzu extends zzal {

    /* renamed from: B  reason: collision with root package name */
    public boolean f25890B;
    public boolean C;
    public final /* synthetic */ zzr D;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzu(zzr zzr, boolean z2, boolean z3) {
        super("log");
        this.D = zzr;
        this.f25890B = z2;
        this.C = z3;
    }

    public final zzaq a(zzh zzh, List list) {
        zzg.k("log", 1, list);
        if (list.size() == 1) {
            this.D.f25838B.a(zzs.INFO, zzh.b((zzaq) list.get(0)).h(), Collections.emptyList(), this.f25890B, this.C);
            return zzaq.f25336m;
        }
        zzs d2 = zzs.d(zzg.i(zzh.b((zzaq) list.get(0)).g().doubleValue()));
        String h2 = zzh.b((zzaq) list.get(1)).h();
        if (list.size() == 2) {
            this.D.f25838B.a(d2, h2, Collections.emptyList(), this.f25890B, this.C);
            return zzaq.f25336m;
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 2; i2 < Math.min(list.size(), 5); i2++) {
            arrayList.add(zzh.b((zzaq) list.get(i2)).h());
        }
        this.D.f25838B.a(d2, h2, arrayList, this.f25890B, this.C);
        return zzaq.f25336m;
    }
}
