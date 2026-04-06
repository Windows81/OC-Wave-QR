package com.google.android.gms.internal.measurement;

import java.util.List;

final class zzp extends zzal {

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ zzo f25773B;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzp(zzm zzm, String str, zzo zzo) {
        super(str);
        this.f25773B = zzo;
    }

    public final zzaq a(zzh zzh, List list) {
        zzg.g("getValue", 2, list);
        zzaq b2 = zzh.b((zzaq) list.get(0));
        zzaq b3 = zzh.b((zzaq) list.get(1));
        String m2 = this.f25773B.m(b2.h());
        return m2 != null ? new zzas(m2) : b3;
    }
}
