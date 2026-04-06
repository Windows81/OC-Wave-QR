package com.google.android.gms.internal.wallet;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.wallet.CreateWalletObjectsRequest;
import com.google.android.gms.wallet.IsReadyToPayRequest;
import com.google.android.gms.wallet.PaymentCardRecognitionIntentRequest;
import com.google.android.gms.wallet.PaymentDataRequest;

public final class zzo extends zza implements IInterface {
    public zzo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.wallet.internal.IOwService");
    }

    public final void W2(PaymentCardRecognitionIntentRequest paymentCardRecognitionIntentRequest, Bundle bundle, zzq zzq) {
        Parcel J = J();
        zzc.c(J, paymentCardRecognitionIntentRequest);
        zzc.c(J, bundle);
        zzc.d(J, zzq);
        P(24, J);
    }

    public final void X2(IsReadyToPayRequest isReadyToPayRequest, Bundle bundle, zzq zzq) {
        Parcel J = J();
        zzc.c(J, isReadyToPayRequest);
        zzc.c(J, bundle);
        zzc.d(J, zzq);
        P(14, J);
    }

    public final void Y2(PaymentDataRequest paymentDataRequest, Bundle bundle, zzq zzq) {
        Parcel J = J();
        zzc.c(J, paymentDataRequest);
        zzc.c(J, bundle);
        zzc.d(J, zzq);
        P(19, J);
    }

    public final void u1(CreateWalletObjectsRequest createWalletObjectsRequest, Bundle bundle, zzq zzq) {
        Parcel J = J();
        zzc.c(J, createWalletObjectsRequest);
        zzc.c(J, bundle);
        zzc.d(J, zzq);
        P(6, J);
    }
}
