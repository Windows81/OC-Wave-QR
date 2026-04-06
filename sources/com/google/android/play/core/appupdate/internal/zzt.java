package com.google.android.play.core.appupdate.internal;

import android.os.IBinder;

final class zzt extends zzn {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ IBinder f27439A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ zzw f27440B;

    public zzt(zzw zzw, IBinder iBinder) {
        this.f27440B = zzw;
        this.f27439A = iBinder;
    }

    public final void a() {
        this.f27440B.f27442a.f27456m = zze.N(this.f27439A);
        zzx.q(this.f27440B.f27442a);
        this.f27440B.f27442a.f27450g = false;
        for (Runnable run : this.f27440B.f27442a.f27447d) {
            run.run();
        }
        this.f27440B.f27442a.f27447d.clear();
    }
}
