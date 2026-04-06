package com.google.android.play.core.appupdate;

import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zzn extends com.google.android.play.core.appupdate.internal.zzn {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f27490A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ String f27491B;
    public final /* synthetic */ zzr C;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzn(zzr zzr, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, String str) {
        super(taskCompletionSource);
        this.C = zzr;
        this.f27490A = taskCompletionSource2;
        this.f27491B = str;
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [com.google.android.play.core.appupdate.internal.zzf, android.os.IInterface] */
    public final void a() {
        try {
            this.C.f27499a.e().v2(this.C.f27500b, zzr.i(), new zzp(this.C, this.f27490A));
        } catch (RemoteException e2) {
            zzr.f27497e.c(e2, "completeUpdate(%s)", this.f27491B);
            this.f27490A.d(new RuntimeException(e2));
        }
    }
}
