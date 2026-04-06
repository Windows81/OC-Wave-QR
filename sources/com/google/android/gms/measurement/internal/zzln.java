package com.google.android.gms.measurement.internal;

final class zzln implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ long f26754A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ zzlg f26755B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ zzlh f26756z;

    public zzln(zzlg zzlg, zzlh zzlh, long j2) {
        this.f26756z = zzlh;
        this.f26754A = j2;
        this.f26755B = zzlg;
    }

    public final void run() {
        this.f26755B.O(this.f26756z, false, this.f26754A);
        zzlg zzlg = this.f26755B;
        zzlg.f26730e = null;
        zzlg.t().L((zzlh) null);
    }
}
