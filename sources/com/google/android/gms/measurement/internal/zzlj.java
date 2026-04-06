package com.google.android.gms.measurement.internal;

import android.os.Bundle;

final class zzlj implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ zzlh f26747A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ zzlh f26748B;
    public final /* synthetic */ long C;
    public final /* synthetic */ zzlg D;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Bundle f26749z;

    public zzlj(zzlg zzlg, Bundle bundle, zzlh zzlh, zzlh zzlh2, long j2) {
        this.f26749z = bundle;
        this.f26747A = zzlh;
        this.f26748B = zzlh2;
        this.C = j2;
        this.D = zzlg;
    }

    public final void run() {
        zzlg.J(this.D, this.f26749z, this.f26747A, this.f26748B, this.C);
    }
}
