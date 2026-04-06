package com.google.android.gms.common.moduleinstall.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.common.moduleinstall.ModuleInstallResponse;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zat extends zaa {

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f25051l;

    public zat(zay zay, TaskCompletionSource taskCompletionSource) {
        this.f25051l = taskCompletionSource;
    }

    public final void B1(Status status, ModuleInstallResponse moduleInstallResponse) {
        TaskUtil.b(status, moduleInstallResponse, this.f25051l);
    }
}
