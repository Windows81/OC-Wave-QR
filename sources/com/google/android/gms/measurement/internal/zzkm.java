package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

final class zzkm implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ String f26690A = null;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ String f26691B;
    public final /* synthetic */ String C;
    public final /* synthetic */ boolean D;
    public final /* synthetic */ zzjk E;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ AtomicReference f26692z;

    public zzkm(zzjk zzjk, AtomicReference atomicReference, String str, String str2, String str3, boolean z2) {
        this.f26692z = atomicReference;
        this.f26691B = str2;
        this.C = str3;
        this.D = z2;
        this.E = zzjk;
    }

    public final void run() {
        this.E.f26587a.J().T(this.f26692z, (String) null, this.f26691B, this.C, this.D);
    }
}
