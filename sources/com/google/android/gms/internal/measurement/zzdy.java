package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.measurement.zzdv;
import com.google.android.gms.measurement.internal.zzhq;

final class zzdy extends zzdv.zzb {
    public final /* synthetic */ String D;
    public final /* synthetic */ String E;
    public final /* synthetic */ Context F;
    public final /* synthetic */ Bundle G;
    public final /* synthetic */ zzdv H;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzdy(zzdv zzdv, String str, String str2, Context context, Bundle bundle) {
        super(zzdv);
        this.D = str;
        this.E = str2;
        this.F = context;
        this.G = bundle;
        this.H = zzdv;
    }

    public final void a() {
        String str;
        String str2;
        String str3;
        try {
            if (this.H.E(this.D, this.E)) {
                str = this.E;
                str2 = this.D;
                str3 = this.H.f25421a;
            } else {
                str3 = null;
                str2 = null;
                str = null;
            }
            Preconditions.m(this.F);
            zzdv zzdv = this.H;
            zzdv.f25429i = zzdv.c(this.F, true);
            if (this.H.f25429i == null) {
                Log.w(this.H.f25421a, "Failed to connect to measurement client.");
                return;
            }
            int a2 = DynamiteModule.a(this.F, ModuleDescriptor.MODULE_ID);
            int c2 = DynamiteModule.c(this.F, ModuleDescriptor.MODULE_ID);
            ((zzdk) Preconditions.m(this.H.f25429i)).initialize(ObjectWrapper.u1(this.F), new zzdt(102001, (long) Math.max(a2, c2), c2 < a2, str3, str2, str, this.G, zzhq.a(this.F)), this.f25433z);
        } catch (Exception e2) {
            this.H.r(e2, true, false);
        }
    }
}
