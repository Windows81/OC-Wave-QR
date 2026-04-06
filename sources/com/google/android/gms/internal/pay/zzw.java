package com.google.android.gms.internal.pay;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zzw extends zzy {

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f25922l;

    public zzw(TaskCompletionSource taskCompletionSource) {
        this.f25922l = taskCompletionSource;
    }

    public final void T(Status status, int i2) {
        if (status.o0() && i2 == 3) {
            TaskUtil.b(Status.G, (Object) null, this.f25922l);
        } else if (i2 == 1) {
            TaskUtil.b(status, 2, this.f25922l);
        } else {
            TaskUtil.b(status, Integer.valueOf(i2), this.f25922l);
        }
    }
}
