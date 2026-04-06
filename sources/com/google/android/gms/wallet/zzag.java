package com.google.android.gms.wallet;

import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.internal.wallet.zzy;
import com.google.android.gms.tasks.TaskCompletionSource;

public final /* synthetic */ class zzag implements RemoteCall {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ IsReadyToPayRequest f27373a;

    public /* synthetic */ zzag(IsReadyToPayRequest isReadyToPayRequest) {
        this.f27373a = isReadyToPayRequest;
    }

    public final void a(Object obj, Object obj2) {
        ((zzy) obj).t0(this.f27373a, (TaskCompletionSource) obj2);
    }
}
