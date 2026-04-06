package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzs;
import com.google.android.gms.internal.measurement.zzv;
import java.util.List;

final class zzhl implements zzv {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ zzhg f26458a;

    public zzhl(zzhg zzhg) {
        this.f26458a = zzhg;
    }

    public final void a(zzs zzs, String str, List list, boolean z2, boolean z3) {
        int i2 = zzhn.f26460a[zzs.ordinal()];
        zzgk J = i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? this.f26458a.m().J() : this.f26458a.m().K() : z2 ? this.f26458a.m().N() : !z3 ? this.f26458a.m().M() : this.f26458a.m().L() : z2 ? this.f26458a.m().I() : !z3 ? this.f26458a.m().H() : this.f26458a.m().G() : this.f26458a.m().F();
        int size = list.size();
        if (size == 1) {
            J.b(str, list.get(0));
        } else if (size == 2) {
            J.c(str, list.get(0), list.get(1));
        } else if (size != 3) {
            J.a(str);
        } else {
            J.d(str, list.get(0), list.get(1), list.get(2));
        }
    }
}
