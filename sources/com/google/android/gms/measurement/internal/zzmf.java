package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

final class zzmf implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Bundle f26802A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ zzlp f26803B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ zzp f26804z;

    public zzmf(zzlp zzlp, zzp zzp, Bundle bundle) {
        this.f26804z = zzp;
        this.f26802A = bundle;
        this.f26803B = zzlp;
    }

    public final void run() {
        zzgb B2 = this.f26803B.f26759d;
        if (B2 == null) {
            this.f26803B.m().G().a("Failed to send default event parameters to service");
            return;
        }
        try {
            Preconditions.m(this.f26804z);
            B2.m1(this.f26802A, this.f26804z);
        } catch (RemoteException e2) {
            this.f26803B.m().G().b("Failed to send default event parameters to service", e2);
        }
    }
}
