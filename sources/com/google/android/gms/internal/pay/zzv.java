package com.google.android.gms.internal.pay;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zzv extends zzy {

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f25921l;

    public zzv(zzx zzx, TaskCompletionSource taskCompletionSource) {
        this.f25921l = taskCompletionSource;
    }

    public final void O2(Status status) {
        TaskUtil.b(status, (Object) null, this.f25921l);
    }
}
