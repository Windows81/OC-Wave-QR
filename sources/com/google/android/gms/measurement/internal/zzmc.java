package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

final class zzmc implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Bundle f26795A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ zzlp f26796B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ zzp f26797z;

    public zzmc(zzlp zzlp, zzp zzp, Bundle bundle) {
        this.f26797z = zzp;
        this.f26795A = bundle;
        this.f26796B = zzlp;
    }

    public final void run() {
        zzgb B2 = this.f26796B.f26759d;
        if (B2 == null) {
            this.f26796B.m().G().a("Failed to send default event parameters to service");
            return;
        }
        try {
            Preconditions.m(this.f26797z);
            B2.W(this.f26795A, this.f26797z);
        } catch (RemoteException e2) {
            this.f26796B.m().G().b("Failed to send default event parameters to service", e2);
        }
    }
}
