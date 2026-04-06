package com.google.android.gms.measurement.internal;

import android.os.Bundle;

final class zzli implements Runnable {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ zzlh f26744A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ long f26745B;
    public final /* synthetic */ boolean C;
    public final /* synthetic */ zzlg D;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ zzlh f26746z;

    public zzli(zzlg zzlg, zzlh zzlh, zzlh zzlh2, long j2, boolean z2) {
        this.f26746z = zzlh;
        this.f26744A = zzlh2;
        this.f26745B = j2;
        this.C = z2;
        this.D = zzlg;
    }

    public final void run() {
        this.D.N(this.f26746z, this.f26744A, this.f26745B, this.C, (Bundle) null);
    }
}
