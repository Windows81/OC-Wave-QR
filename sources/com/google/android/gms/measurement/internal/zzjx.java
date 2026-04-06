package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

final class zzjx implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ zzjk f26659A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ AtomicReference f26660z;

    public zzjx(zzjk zzjk, AtomicReference atomicReference) {
        this.f26660z = atomicReference;
        this.f26659A = zzjk;
    }

    public final void run() {
        synchronized (this.f26660z) {
            try {
                this.f26660z.set(Boolean.valueOf(this.f26659A.d().O(this.f26659A.p().F())));
                this.f26660z.notify();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
