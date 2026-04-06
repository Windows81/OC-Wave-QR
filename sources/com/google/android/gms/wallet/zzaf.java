package com.google.android.gms.wallet;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zzaf implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int N = SafeParcelReader.N(parcel);
        Bundle bundle = null;
        int i2 = 0;
        while (parcel.dataPosition() < N) {
            int E = SafeParcelReader.E(parcel);
            int w2 = SafeParcelReader.w(E);
            if (w2 == 2) {
                i2 = SafeParcelReader.G(parcel, E);
            } else if (w2 != 3) {
                SafeParcelReader.M(parcel, E);
            } else {
                bundle = SafeParcelReader.f(parcel, E);
            }
        }
        SafeParcelReader.v(parcel, N);
        return new PaymentMethodTokenizationParameters(i2, bundle);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new PaymentMethodTokenizationParameters[i2];
    }
}
