package com.google.android.gms.measurement.internal;

final class zzlk implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ zzlg f26750A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ long f26751z;

    public zzlk(zzlg zzlg, long j2) {
        this.f26751z = j2;
        this.f26750A = zzlg;
    }

    public final void run() {
        this.f26750A.o().v(this.f26751z);
        this.f26750A.f26730e = null;
    }
}
