package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzdv;

final class zzes extends zzdv.zzb {
    public final /* synthetic */ String D;
    public final /* synthetic */ String E;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ zzdi G;
    public final /* synthetic */ zzdv H;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzes(zzdv zzdv, String str, String str2, boolean z2, zzdi zzdi) {
        super(zzdv);
        this.D = str;
        this.E = str2;
        this.F = z2;
        this.G = zzdi;
        this.H = zzdv;
    }

    public final void a() {
        ((zzdk) Preconditions.m(this.H.f25429i)).getUserProperties(this.D, this.E, this.F, this.G);
    }

    public final void b() {
        this.G.u((Bundle) null);
    }
}
