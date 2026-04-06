package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.atomic.AtomicReference;

final class zzls implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ zzp f26767A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ boolean f26768B;
    public final /* synthetic */ zzlp C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ AtomicReference f26769z;

    public zzls(zzlp zzlp, AtomicReference atomicReference, zzp zzp, boolean z2) {
        this.f26769z = atomicReference;
        this.f26767A = zzp;
        this.f26768B = z2;
        this.C = zzlp;
    }

    public final void run() {
        synchronized (this.f26769z) {
            try {
                zzgb B2 = this.C.f26759d;
                if (B2 == null) {
                    this.C.m().G().a("Failed to get all user properties; not connected to service");
                    this.f26769z.notify();
                    return;
                }
                Preconditions.m(this.f26767A);
                this.f26769z.set(B2.S0(this.f26767A, this.f26768B));
                this.C.n0();
                this.f26769z.notify();
            } catch (RemoteException e2) {
                try {
                    this.C.m().G().b("Failed to get all user properties; remote exception", e2);
                    this.f26769z.notify();
                } catch (Throwable th) {
                    this.f26769z.notify();
                    throw th;
                }
            }
        }
    }
}
