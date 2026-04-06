package com.google.android.gms.measurement.internal;

import android.os.Bundle;

final class zzkf implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ String f26675A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ long f26676B;
    public final /* synthetic */ Bundle C;
    public final /* synthetic */ boolean D;
    public final /* synthetic */ boolean E;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ String G;
    public final /* synthetic */ zzjk H;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ String f26677z;

    public zzkf(zzjk zzjk, String str, String str2, long j2, Bundle bundle, boolean z2, boolean z3, boolean z4, String str3) {
        this.f26677z = str;
        this.f26675A = str2;
        this.f26676B = j2;
        this.C = bundle;
        this.D = z2;
        this.E = z3;
        this.F = z4;
        this.G = str3;
        this.H = zzjk;
    }

    public final void run() {
        this.H.f0(this.f26677z, this.f26675A, this.f26676B, this.C, this.D, this.E, this.F, this.G);
    }
}
