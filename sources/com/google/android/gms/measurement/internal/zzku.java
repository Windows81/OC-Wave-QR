package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzpd;

final class zzku implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ long f26707A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ long f26708B;
    public final /* synthetic */ boolean C;
    public final /* synthetic */ zzjc D;
    public final /* synthetic */ zzjk E;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ zzjc f26709z;

    public zzku(zzjk zzjk, zzjc zzjc, long j2, long j3, boolean z2, zzjc zzjc2) {
        this.f26709z = zzjc;
        this.f26707A = j2;
        this.f26708B = j3;
        this.C = z2;
        this.D = zzjc2;
        this.E = zzjk;
    }

    public final void run() {
        this.E.R(this.f26709z);
        if (!zzpd.a() || !this.E.d().t(zzbj.c1)) {
            this.E.J(this.f26707A, false);
        }
        zzjk.X(this.E, this.f26709z, this.f26708B, true, this.C);
        zzjk.Y(this.E, this.f26709z, this.D);
    }
}
