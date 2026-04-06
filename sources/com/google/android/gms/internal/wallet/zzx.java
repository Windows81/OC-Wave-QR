package com.google.android.gms.internal.wallet;

import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.wallet.AutoResolveHelper;
import com.google.android.gms.wallet.PaymentData;

final class zzx extends zzt {

    /* renamed from: l  reason: collision with root package name */
    public final TaskCompletionSource f25947l;

    public zzx(TaskCompletionSource taskCompletionSource) {
        this.f25947l = taskCompletionSource;
    }

    public final void W1(Status status, PaymentData paymentData, Bundle bundle) {
        AutoResolveHelper.e(status, paymentData, this.f25947l);
    }
}
