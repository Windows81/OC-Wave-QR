package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

final class zzkq implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ zzjk f26699A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ AtomicReference f26700z;

    public zzkq(zzjk zzjk, AtomicReference atomicReference) {
        this.f26700z = atomicReference;
        this.f26699A = zzjk;
    }

    public final void run() {
        synchronized (this.f26700z) {
            try {
                this.f26700z.set(Integer.valueOf(this.f26699A.d().y(this.f26699A.p().F(), zzbj.Q)));
                this.f26700z.notify();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
