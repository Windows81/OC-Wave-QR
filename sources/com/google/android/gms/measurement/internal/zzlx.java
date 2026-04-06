package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

final class zzlx implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ zzlp f26782A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ zzp f26783z;

    public zzlx(zzlp zzlp, zzp zzp) {
        this.f26783z = zzp;
        this.f26782A = zzlp;
    }

    public final void run() {
        zzgb B2 = this.f26782A.f26759d;
        if (B2 == null) {
            this.f26782A.m().G().a("Failed to reset data on the service: not connected to service");
            return;
        }
        try {
            Preconditions.m(this.f26783z);
            B2.B0(this.f26783z);
        } catch (RemoteException e2) {
            this.f26782A.m().G().b("Failed to reset data on the service: remote exception", e2);
        }
        this.f26782A.n0();
    }
}
