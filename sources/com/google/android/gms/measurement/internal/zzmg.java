package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

final class zzmg implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ zzlp f26805A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ zzp f26806z;

    public zzmg(zzlp zzlp, zzp zzp) {
        this.f26806z = zzp;
        this.f26805A = zzlp;
    }

    public final void run() {
        zzgb B2 = this.f26805A.f26759d;
        if (B2 == null) {
            this.f26805A.m().G().a("Failed to send consent settings to service");
            return;
        }
        try {
            Preconditions.m(this.f26806z);
            B2.z2(this.f26806z);
            this.f26805A.n0();
        } catch (RemoteException e2) {
            this.f26805A.m().G().b("Failed to send consent settings to the service", e2);
        }
    }
}
