package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.atomic.AtomicReference;

final class zzlv implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ zzp f26776A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Bundle f26777B;
    public final /* synthetic */ zzlp C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ AtomicReference f26778z;

    public zzlv(zzlp zzlp, AtomicReference atomicReference, zzp zzp, Bundle bundle) {
        this.f26778z = atomicReference;
        this.f26776A = zzp;
        this.f26777B = bundle;
        this.C = zzlp;
    }

    public final void run() {
        synchronized (this.f26778z) {
            try {
                zzgb B2 = this.C.f26759d;
                if (B2 == null) {
                    this.C.m().G().a("Failed to get trigger URIs; not connected to service");
                    this.f26778z.notify();
                    return;
                }
                Preconditions.m(this.f26776A);
                this.f26778z.set(B2.f1(this.f26776A, this.f26777B));
                this.C.n0();
                this.f26778z.notify();
            } catch (RemoteException e2) {
                try {
                    this.C.m().G().b("Failed to get trigger URIs; remote exception", e2);
                    this.f26778z.notify();
                } catch (Throwable th) {
                    this.f26778z.notify();
                    throw th;
                }
            }
        }
    }
}
