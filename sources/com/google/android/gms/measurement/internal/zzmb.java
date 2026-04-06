package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

final class zzmb implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ zzlp f26793A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ zzp f26794z;

    public zzmb(zzlp zzlp, zzp zzp) {
        this.f26794z = zzp;
        this.f26793A = zzlp;
    }

    public final void run() {
        zzgb B2 = this.f26793A.f26759d;
        if (B2 == null) {
            this.f26793A.m().L().a("Failed to send app backgrounded");
            return;
        }
        try {
            Preconditions.m(this.f26794z);
            B2.Z(this.f26794z);
            this.f26793A.n0();
        } catch (RemoteException e2) {
            this.f26793A.m().G().b("Failed to send app backgrounded to the service", e2);
        }
    }
}
