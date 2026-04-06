package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

final class zzkt implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ zzjk f26705A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ AtomicReference f26706z;

    public zzkt(zzjk zzjk, AtomicReference atomicReference) {
        this.f26706z = atomicReference;
        this.f26705A = zzjk;
    }

    public final void run() {
        synchronized (this.f26706z) {
            try {
                this.f26706z.set(Double.valueOf(this.f26705A.d().o(this.f26705A.p().F(), zzbj.R)));
                this.f26706z.notify();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
