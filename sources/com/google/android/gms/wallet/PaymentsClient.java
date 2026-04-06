package com.google.android.gms.wallet;

import android.content.Context;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.wallet.Wallet;

public class PaymentsClient extends GoogleApi<Wallet.WalletOptions> {
    public PaymentsClient(Context context, Wallet.WalletOptions walletOptions) {
        super(context, Wallet.f27319a, walletOptions, GoogleApi.Settings.f24436c);
    }

    public Task s(IsReadyToPayRequest isReadyToPayRequest) {
        return f(TaskApiCall.a().e(23705).b(new zzag(isReadyToPayRequest)).a());
    }

    public Task t(PaymentDataRequest paymentDataRequest) {
        return i(TaskApiCall.a().b(new zzah(paymentDataRequest)).d(zzk.f27390c).c(true).e(23707).a());
    }
}
