package com.google.android.gms.common.moduleinstall.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zas extends zaa {

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f25050l;

    public zas(zay zay, TaskCompletionSource taskCompletionSource) {
        this.f25050l = taskCompletionSource;
    }

    public final void y2(Status status) {
        TaskUtil.b(status, (Object) null, this.f25050l);
    }
}
