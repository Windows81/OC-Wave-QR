package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

final class zzkr implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ zzjk f26701A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ AtomicReference f26702z;

    public zzkr(zzjk zzjk, AtomicReference atomicReference) {
        this.f26702z = atomicReference;
        this.f26701A = zzjk;
    }

    public final void run() {
        synchronized (this.f26702z) {
            try {
                this.f26702z.set(Long.valueOf(this.f26701A.d().C(this.f26701A.p().F(), zzbj.P)));
                this.f26702z.notify();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
