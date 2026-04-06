package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;

final class zzmi implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ zzp f26809A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ boolean f26810B;
    public final /* synthetic */ zzaf C;
    public final /* synthetic */ zzaf D;
    public final /* synthetic */ zzlp E;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ boolean f26811z = true;

    public zzmi(zzlp zzlp, boolean z2, zzp zzp, boolean z3, zzaf zzaf, zzaf zzaf2) {
        this.f26809A = zzp;
        this.f26810B = z3;
        this.C = zzaf;
        this.D = zzaf2;
        this.E = zzlp;
    }

    public final void run() {
        zzgb B2 = this.E.f26759d;
        if (B2 == null) {
            this.E.m().G().a("Discarding data. Failed to send conditional user property to service");
            return;
        }
        if (this.f26811z) {
            Preconditions.m(this.f26809A);
            this.E.K(B2, this.f26810B ? null : this.C, this.f26809A);
        } else {
            try {
                if (TextUtils.isEmpty(this.D.f26176z)) {
                    Preconditions.m(this.f26809A);
                    B2.d0(this.C, this.f26809A);
                } else {
                    B2.g1(this.C);
                }
            } catch (RemoteException e2) {
                this.E.m().G().b("Failed to send conditional user property to the service", e2);
            }
        }
        this.E.n0();
    }
}
