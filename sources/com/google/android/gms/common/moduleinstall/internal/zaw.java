package com.google.android.gms.common.moduleinstall.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.common.moduleinstall.ModuleInstallIntentResponse;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zaw extends zaa {

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f25057l;

    public zaw(zay zay, TaskCompletionSource taskCompletionSource) {
        this.f25057l = taskCompletionSource;
    }

    public final void L0(Status status, ModuleInstallIntentResponse moduleInstallIntentResponse) {
        TaskUtil.b(status, moduleInstallIntentResponse, this.f25057l);
    }
}
