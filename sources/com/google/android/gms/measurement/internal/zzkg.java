package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

final class zzkg implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ zzjk f26678A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ AtomicReference f26679z;

    public zzkg(zzjk zzjk, AtomicReference atomicReference) {
        this.f26679z = atomicReference;
        this.f26678A = zzjk;
    }

    public final void run() {
        synchronized (this.f26679z) {
            try {
                this.f26679z.set(this.f26678A.d().I(this.f26678A.p().F()));
                this.f26679z.notify();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
