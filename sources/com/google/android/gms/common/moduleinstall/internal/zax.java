package com.google.android.gms.common.moduleinstall.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zax extends IStatusCallback.Stub {

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f25058l;

    public zax(zay zay, TaskCompletionSource taskCompletionSource) {
        this.f25058l = taskCompletionSource;
    }

    public final void K0(Status status) {
        TaskUtil.b(status, (Object) null, this.f25058l);
    }
}
