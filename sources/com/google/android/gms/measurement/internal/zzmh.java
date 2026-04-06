package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

final class zzmh implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ zzlp f26807A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ zzp f26808z;

    public zzmh(zzlp zzlp, zzp zzp) {
        this.f26808z = zzp;
        this.f26807A = zzlp;
    }

    public final void run() {
        zzgb B2 = this.f26807A.f26759d;
        if (B2 == null) {
            this.f26807A.m().G().a("Failed to send measurementEnabled to service");
            return;
        }
        try {
            Preconditions.m(this.f26808z);
            B2.P1(this.f26808z);
            this.f26807A.n0();
        } catch (RemoteException e2) {
            this.f26807A.m().G().b("Failed to send measurementEnabled to the service", e2);
        }
    }
}
