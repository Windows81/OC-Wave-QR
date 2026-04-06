package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzdl;

final class zzlt implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ String f26770A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ zzp f26771B;
    public final /* synthetic */ boolean C;
    public final /* synthetic */ zzdl D;
    public final /* synthetic */ zzlp E;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ String f26772z;

    public zzlt(zzlp zzlp, String str, String str2, zzp zzp, boolean z2, zzdl zzdl) {
        this.f26772z = str;
        this.f26770A = str2;
        this.f26771B = zzp;
        this.C = z2;
        this.D = zzdl;
        this.E = zzlp;
    }

    public final void run() {
        Bundle bundle = new Bundle();
        try {
            zzgb B2 = this.E.f26759d;
            if (B2 == null) {
                this.E.m().G().c("Failed to get user properties; not connected to service", this.f26772z, this.f26770A);
                return;
            }
            Preconditions.m(this.f26771B);
            bundle = zzop.G(B2.D2(this.f26772z, this.f26770A, this.C, this.f26771B));
            this.E.n0();
            this.E.j().R(this.D, bundle);
        } catch (RemoteException e2) {
            this.E.m().G().c("Failed to get user properties; remote exception", this.f26772z, e2);
        } finally {
            this.E.j().R(this.D, bundle);
        }
    }
}
