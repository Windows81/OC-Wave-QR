package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

final class zzma implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ zzlp f26791A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ zzlh f26792z;

    public zzma(zzlp zzlp, zzlh zzlh) {
        this.f26792z = zzlh;
        this.f26791A = zzlp;
    }

    public final void run() {
        zzgb B2 = this.f26791A.f26759d;
        if (B2 == null) {
            this.f26791A.m().G().a("Failed to send current screen to service");
            return;
        }
        try {
            zzlh zzlh = this.f26792z;
            if (zzlh == null) {
                B2.e1(0, (String) null, (String) null, this.f26791A.a().getPackageName());
            } else {
                B2.e1(zzlh.f26740c, zzlh.f26738a, zzlh.f26739b, this.f26791A.a().getPackageName());
            }
            this.f26791A.n0();
        } catch (RemoteException e2) {
            this.f26791A.m().G().b("Failed to send current screen to the service", e2);
        }
    }
}
