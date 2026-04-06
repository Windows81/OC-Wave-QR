package com.google.android.gms.measurement.internal;

final class zznf implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public long f26869A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ zznc f26870B;

    /* renamed from: z  reason: collision with root package name */
    public long f26871z;

    public zznf(zznc zznc, long j2, long j3) {
        this.f26870B = zznc;
        this.f26871z = j2;
        this.f26869A = j3;
    }

    public final void run() {
        this.f26870B.f26865b.f().D(new zzne(this));
    }
}
