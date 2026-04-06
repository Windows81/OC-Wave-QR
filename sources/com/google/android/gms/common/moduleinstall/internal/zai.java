package com.google.android.gms.common.moduleinstall.internal;

import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.moduleinstall.InstallStatusListener;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.atomic.AtomicReference;

public final /* synthetic */ class zai implements RemoteCall {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ zay f25031a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AtomicReference f25032b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ InstallStatusListener f25033c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ ApiFeatureRequest f25034d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ zaab f25035e;

    public final void a(Object obj, Object obj2) {
        ((zaf) ((zaz) obj).I()).Y2(new zau(this.f25031a, this.f25032b, (TaskCompletionSource) obj2, this.f25033c), this.f25034d, this.f25035e);
    }
}
