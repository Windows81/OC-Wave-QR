package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

final class zzkn implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ String f26693A = null;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ String f26694B;
    public final /* synthetic */ String C;
    public final /* synthetic */ zzjk D;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ AtomicReference f26695z;

    public zzkn(zzjk zzjk, AtomicReference atomicReference, String str, String str2, String str3) {
        this.f26695z = atomicReference;
        this.f26694B = str2;
        this.C = str3;
        this.D = zzjk;
    }

    public final void run() {
        this.D.f26587a.J().S(this.f26695z, (String) null, this.f26694B, this.C);
    }
}
