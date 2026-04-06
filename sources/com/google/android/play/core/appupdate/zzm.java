package com.google.android.play.core.appupdate;

import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.appupdate.internal.zzn;

final class zzm extends zzn {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ String f27488A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f27489B;
    public final /* synthetic */ zzr C;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzm(zzr zzr, TaskCompletionSource taskCompletionSource, String str, TaskCompletionSource taskCompletionSource2) {
        super(taskCompletionSource);
        this.C = zzr;
        this.f27488A = str;
        this.f27489B = taskCompletionSource2;
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [com.google.android.play.core.appupdate.internal.zzf, android.os.IInterface] */
    public final void a() {
        try {
            ? e2 = this.C.f27499a.e();
            zzr zzr = this.C;
            e2.N2(zzr.f27500b, zzr.b(zzr, this.f27488A), new zzq(this.C, this.f27489B, this.f27488A));
        } catch (RemoteException e3) {
            zzr.f27497e.c(e3, "requestUpdateInfo(%s)", this.f27488A);
            this.f27489B.d(new RuntimeException(e3));
        }
    }
}
