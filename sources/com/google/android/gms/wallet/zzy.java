package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zzy implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int N = SafeParcelReader.N(parcel);
        int i2 = 0;
        while (parcel.dataPosition() < N) {
            int E = SafeParcelReader.E(parcel);
            if (SafeParcelReader.w(E) != 1) {
                SafeParcelReader.M(parcel, E);
            } else {
                i2 = SafeParcelReader.G(parcel, E);
            }
        }
        SafeParcelReader.v(parcel, N);
        return new PaymentCardRecognitionIntentRequest(i2);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new PaymentCardRecognitionIntentRequest[i2];
    }
}
