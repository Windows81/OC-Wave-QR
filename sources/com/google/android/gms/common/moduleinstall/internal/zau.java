package com.google.android.gms.common.moduleinstall.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.ListenerHolders;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.common.moduleinstall.InstallStatusListener;
import com.google.android.gms.common.moduleinstall.ModuleInstallResponse;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.atomic.AtomicReference;

final class zau extends zaa {

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ AtomicReference f25052l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f25053m;

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ InstallStatusListener f25054n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ zay f25055o;

    public zau(zay zay, AtomicReference atomicReference, TaskCompletionSource taskCompletionSource, InstallStatusListener installStatusListener) {
        this.f25055o = zay;
        this.f25052l = atomicReference;
        this.f25053m = taskCompletionSource;
        this.f25054n = installStatusListener;
    }

    public final void B1(Status status, ModuleInstallResponse moduleInstallResponse) {
        if (moduleInstallResponse != null) {
            this.f25052l.set(moduleInstallResponse);
        }
        TaskUtil.b(status, (Object) null, this.f25053m);
        if (!status.o0() || (moduleInstallResponse != null && moduleInstallResponse.Q())) {
            this.f25055o.g(ListenerHolders.a(this.f25054n, InstallStatusListener.class.getSimpleName()), 27306);
        }
    }
}
