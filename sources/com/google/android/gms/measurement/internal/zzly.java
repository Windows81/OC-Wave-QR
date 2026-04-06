package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

final class zzly implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ zzlp f26784A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ zzp f26785z;

    public zzly(zzlp zzlp, zzp zzp) {
        this.f26785z = zzp;
        this.f26784A = zzlp;
    }

    public final void run() {
        zzgb B2 = this.f26784A.f26759d;
        if (B2 == null) {
            this.f26784A.m().G().a("Discarding data. Failed to send app launch");
            return;
        }
        try {
            Preconditions.m(this.f26785z);
            B2.z0(this.f26785z);
            this.f26784A.q().J();
            this.f26784A.K(B2, (AbstractSafeParcelable) null, this.f26785z);
            this.f26784A.n0();
        } catch (RemoteException e2) {
            this.f26784A.m().G().b("Failed to send app launch to the service", e2);
        }
    }
}
