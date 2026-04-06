package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zzw implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int N = SafeParcelReader.N(parcel);
        String str = null;
        CreditCardExpirationDate creditCardExpirationDate = null;
        while (parcel.dataPosition() < N) {
            int E = SafeParcelReader.E(parcel);
            int w2 = SafeParcelReader.w(E);
            if (w2 == 1) {
                str = SafeParcelReader.q(parcel, E);
            } else if (w2 != 2) {
                SafeParcelReader.M(parcel, E);
            } else {
                creditCardExpirationDate = (CreditCardExpirationDate) SafeParcelReader.p(parcel, E, CreditCardExpirationDate.CREATOR);
            }
        }
        SafeParcelReader.v(parcel, N);
        return new PaymentCardRecognitionResult(str, creditCardExpirationDate);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new PaymentCardRecognitionResult[i2];
    }
}
