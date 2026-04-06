package com.google.android.gms.measurement.internal;

final class zzkx implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ long f26713A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ boolean f26714B;
    public final /* synthetic */ zzjc C;
    public final /* synthetic */ zzjk D;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ zzjc f26715z;

    public zzkx(zzjk zzjk, zzjc zzjc, long j2, boolean z2, zzjc zzjc2) {
        this.f26715z = zzjc;
        this.f26713A = j2;
        this.f26714B = z2;
        this.C = zzjc2;
        this.D = zzjk;
    }

    public final void run() {
        this.D.R(this.f26715z);
        zzjk.X(this.D, this.f26715z, this.f26713A, false, this.f26714B);
        zzjk.Y(this.D, this.f26715z, this.C);
    }
}
