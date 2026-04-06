package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

public final /* synthetic */ class zzjp implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public /* synthetic */ AtomicReference f26645A;

    /* renamed from: z  reason: collision with root package name */
    public /* synthetic */ zzjk f26646z;

    public /* synthetic */ zzjp(zzjk zzjk, AtomicReference atomicReference) {
        this.f26646z = zzjk;
        this.f26645A = atomicReference;
    }

    public final void run() {
        this.f26646z.o0(this.f26645A);
    }
}
