package com.google.android.gms.common.moduleinstall.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zar extends zaa {

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f25049l;

    public zar(zay zay, TaskCompletionSource taskCompletionSource) {
        this.f25049l = taskCompletionSource;
    }

    public final void E1(Status status, ModuleAvailabilityResponse moduleAvailabilityResponse) {
        TaskUtil.b(status, moduleAvailabilityResponse, this.f25049l);
    }
}
