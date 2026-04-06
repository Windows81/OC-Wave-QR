package com.google.android.play.core.appupdate.internal;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

public final /* synthetic */ class zzo implements OnCompleteListener {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f27433A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ zzx f27434z;

    public /* synthetic */ zzo(zzx zzx, TaskCompletionSource taskCompletionSource) {
        this.f27434z = zzx;
        this.f27433A = taskCompletionSource;
    }

    public final void a(Task task) {
        this.f27434z.t(this.f27433A, task);
    }
}
