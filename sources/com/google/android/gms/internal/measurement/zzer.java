package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.measurement.zzdv;

final class zzer extends zzdv.zzb {
    public final /* synthetic */ int D = 5;
    public final /* synthetic */ String E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ zzdv I;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzer(zzdv zzdv, boolean z2, int i2, String str, Object obj, Object obj2, Object obj3) {
        super(false);
        this.E = str;
        this.F = obj;
        this.G = null;
        this.H = null;
        this.I = zzdv;
    }

    public final void a() {
        ((zzdk) Preconditions.m(this.I.f25429i)).logHealthData(this.D, this.E, ObjectWrapper.u1(this.F), ObjectWrapper.u1((Object) null), ObjectWrapper.u1((Object) null));
    }
}
