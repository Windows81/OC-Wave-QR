package com.google.android.gms.measurement.internal;

final class zzke implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ String f26672A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Object f26673B;
    public final /* synthetic */ long C;
    public final /* synthetic */ zzjk D;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ String f26674z;

    public zzke(zzjk zzjk, String str, String str2, Object obj, long j2) {
        this.f26674z = str;
        this.f26672A = str2;
        this.f26673B = obj;
        this.C = j2;
        this.D = zzjk;
    }

    public final void run() {
        this.D.k0(this.f26674z, this.f26672A, this.f26673B, this.C);
    }
}
