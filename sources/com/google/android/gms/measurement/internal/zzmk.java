package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzdl;
import java.util.ArrayList;

final class zzmk implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ String f26815A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ zzp f26816B;
    public final /* synthetic */ zzdl C;
    public final /* synthetic */ zzlp D;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ String f26817z;

    public zzmk(zzlp zzlp, String str, String str2, zzp zzp, zzdl zzdl) {
        this.f26817z = str;
        this.f26815A = str2;
        this.f26816B = zzp;
        this.C = zzdl;
        this.D = zzlp;
    }

    public final void run() {
        ArrayList arrayList = new ArrayList();
        try {
            zzgb B2 = this.D.f26759d;
            if (B2 == null) {
                this.D.m().G().c("Failed to get conditional properties; not connected to service", this.f26817z, this.f26815A);
                return;
            }
            Preconditions.m(this.f26816B);
            arrayList = zzop.t0(B2.n0(this.f26817z, this.f26815A, this.f26816B));
            this.D.n0();
            this.D.j().T(this.C, arrayList);
        } catch (RemoteException e2) {
            this.D.m().G().d("Failed to get conditional properties; remote exception", this.f26817z, this.f26815A, e2);
        } finally {
            this.D.j().T(this.C, arrayList);
        }
    }
}
