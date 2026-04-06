package com.google.android.gms.internal.pay;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zzr extends zzy {

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f25916l;

    public zzr(zzx zzx, TaskCompletionSource taskCompletionSource) {
        this.f25916l = taskCompletionSource;
    }

    public final void r1(Status status, PendingIntent pendingIntent) {
        TaskUtil.b(status, pendingIntent, this.f25916l);
    }
}
