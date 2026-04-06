package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.atomic.AtomicReference;

final class zzlw implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ zzp f26779A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ zzlp f26780B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ AtomicReference f26781z;

    public zzlw(zzlp zzlp, AtomicReference atomicReference, zzp zzp) {
        this.f26781z = atomicReference;
        this.f26779A = zzp;
        this.f26780B = zzlp;
    }

    public final void run() {
        synchronized (this.f26781z) {
            try {
                if (!this.f26780B.i().M().B()) {
                    this.f26780B.m().M().a("Analytics storage consent denied; will not get app instance id");
                    this.f26780B.r().a1((String) null);
                    this.f26780B.i().f26362i.b((String) null);
                    this.f26781z.set((Object) null);
                    this.f26781z.notify();
                    return;
                }
                zzgb B2 = this.f26780B.f26759d;
                if (B2 == null) {
                    this.f26780B.m().G().a("Failed to get app instance id");
                    this.f26781z.notify();
                    return;
                }
                Preconditions.m(this.f26779A);
                this.f26781z.set(B2.k1(this.f26779A));
                String str = (String) this.f26781z.get();
                if (str != null) {
                    this.f26780B.r().a1(str);
                    this.f26780B.i().f26362i.b(str);
                }
                this.f26780B.n0();
                this.f26781z.notify();
            } catch (RemoteException e2) {
                try {
                    this.f26780B.m().G().b("Failed to get app instance id", e2);
                    this.f26781z.notify();
                } catch (Throwable th) {
                    this.f26781z.notify();
                    throw th;
                }
            }
        }
    }
}
