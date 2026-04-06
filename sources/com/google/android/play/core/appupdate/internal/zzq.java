package com.google.android.play.core.appupdate.internal;

import com.google.android.gms.tasks.TaskCompletionSource;

final class zzq extends zzn {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f27436A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ zzn f27437B;
    public final /* synthetic */ zzx C;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzq(zzx zzx, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, zzn zzn) {
        super(taskCompletionSource);
        this.C = zzx;
        this.f27436A = taskCompletionSource2;
        this.f27437B = zzn;
    }

    public final void a() {
        synchronized (this.C.f27449f) {
            try {
                zzx.n(this.C, this.f27436A);
                if (this.C.f27454k.getAndIncrement() > 0) {
                    this.C.f27445b.d("Already connected to the service.", new Object[0]);
                }
                zzx.p(this.C, this.f27437B);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
