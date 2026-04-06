package com.google.android.gms.common.moduleinstall.internal;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.moduleinstall.ModuleInstallResponse;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.atomic.AtomicReference;

public final /* synthetic */ class zak implements SuccessContinuation {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AtomicReference f25038a;

    public final Task a(Object obj) {
        Void voidR = (Void) obj;
        Api.ClientKey clientKey = zay.f25059k;
        AtomicReference atomicReference = this.f25038a;
        return atomicReference.get() != null ? Tasks.e((ModuleInstallResponse) atomicReference.get()) : Tasks.d(new ApiException(Status.G));
    }
}
