package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzdl;

final class zzlz implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ zzdl f26786A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ zzlp f26787B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ zzp f26788z;

    public zzlz(zzlp zzlp, zzp zzp, zzdl zzdl) {
        this.f26788z = zzp;
        this.f26786A = zzdl;
        this.f26787B = zzlp;
    }

    public final void run() {
        try {
            if (!this.f26787B.i().M().B()) {
                this.f26787B.m().M().a("Analytics storage consent denied; will not get app instance id");
                this.f26787B.r().a1((String) null);
                this.f26787B.i().f26362i.b((String) null);
                return;
            }
            zzgb B2 = this.f26787B.f26759d;
            if (B2 == null) {
                this.f26787B.m().G().a("Failed to get app instance id");
                this.f26787B.j().S(this.f26786A, (String) null);
                return;
            }
            Preconditions.m(this.f26788z);
            String k1 = B2.k1(this.f26788z);
            if (k1 != null) {
                this.f26787B.r().a1(k1);
                this.f26787B.i().f26362i.b(k1);
            }
            this.f26787B.n0();
            this.f26787B.j().S(this.f26786A, k1);
        } catch (RemoteException e2) {
            this.f26787B.m().G().b("Failed to get app instance id", e2);
        } finally {
            this.f26787B.j().S(this.f26786A, (String) null);
        }
    }
}
