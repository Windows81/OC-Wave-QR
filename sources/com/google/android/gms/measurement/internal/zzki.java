package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

final class zzki implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ zzjk f26683A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ long f26684z;

    public zzki(zzjk zzjk, long j2) {
        this.f26684z = j2;
        this.f26683A = zzjk;
    }

    public final void run() {
        this.f26683A.M0(this.f26684z);
        this.f26683A.t().Q(new AtomicReference());
    }
}
