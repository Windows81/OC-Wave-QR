package com.google.android.gms.internal.wallet;

import android.os.Bundle;
import android.os.IInterface;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wallet.FullWallet;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.PaymentCardRecognitionIntentResponse;
import com.google.android.gms.wallet.PaymentData;

public interface zzq extends IInterface {
    void A0(int i2, boolean z2, Bundle bundle);

    void C0(Status status, PaymentCardRecognitionIntentResponse paymentCardRecognitionIntentResponse, Bundle bundle);

    void K2(int i2, FullWallet fullWallet, Bundle bundle);

    void W1(Status status, PaymentData paymentData, Bundle bundle);

    void h1(int i2, MaskedWallet maskedWallet, Bundle bundle);

    void j2(int i2, Bundle bundle);

    void p0(Status status, boolean z2, Bundle bundle);
}
