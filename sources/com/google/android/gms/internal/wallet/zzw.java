package com.google.android.gms.internal.wallet;

import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.wallet.AutoResolveHelper;
import com.google.android.gms.wallet.PaymentCardRecognitionIntentResponse;

final class zzw extends zzt {

    /* renamed from: l  reason: collision with root package name */
    public final TaskCompletionSource f25946l;

    public zzw(TaskCompletionSource taskCompletionSource) {
        this.f25946l = taskCompletionSource;
    }

    public final void C0(Status status, PaymentCardRecognitionIntentResponse paymentCardRecognitionIntentResponse, Bundle bundle) {
        AutoResolveHelper.e(status, paymentCardRecognitionIntentResponse, this.f25946l);
    }
}
