package com.google.android.gms.wallet;

import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.internal.wallet.zzy;
import com.google.android.gms.tasks.TaskCompletionSource;

public final /* synthetic */ class zzah implements RemoteCall {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ PaymentDataRequest f27374a;

    public /* synthetic */ zzah(PaymentDataRequest paymentDataRequest) {
        this.f27374a = paymentDataRequest;
    }

    public final void a(Object obj, Object obj2) {
        ((zzy) obj).u0(this.f27374a, (TaskCompletionSource) obj2);
    }
}
