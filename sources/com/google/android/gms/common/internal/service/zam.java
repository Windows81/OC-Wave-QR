package com.google.android.gms.common.internal.service;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.tasks.TaskCompletionSource;

public final /* synthetic */ class zam implements RemoteCall {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ TelemetryData f24922a;

    public /* synthetic */ zam(TelemetryData telemetryData) {
        this.f24922a = telemetryData;
    }

    public final void a(Object obj, Object obj2) {
        Api.ClientKey clientKey = zao.f24923k;
        ((zai) ((zap) obj).I()).W2(this.f24922a);
        ((TaskCompletionSource) obj2).c((Object) null);
    }
}
