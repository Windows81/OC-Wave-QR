package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.wallet.wobs.CommonWalletObject;

public final class zzv implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int N = SafeParcelReader.N(parcel);
        String str = null;
        CommonWalletObject commonWalletObject = null;
        int i2 = 0;
        String str2 = null;
        while (parcel.dataPosition() < N) {
            int E = SafeParcelReader.E(parcel);
            int w2 = SafeParcelReader.w(E);
            if (w2 == 1) {
                i2 = SafeParcelReader.G(parcel, E);
            } else if (w2 == 2) {
                str = SafeParcelReader.q(parcel, E);
            } else if (w2 == 3) {
                str2 = SafeParcelReader.q(parcel, E);
            } else if (w2 != 4) {
                SafeParcelReader.M(parcel, E);
            } else {
                commonWalletObject = (CommonWalletObject) SafeParcelReader.p(parcel, E, CommonWalletObject.CREATOR);
            }
        }
        SafeParcelReader.v(parcel, N);
        return new OfferWalletObject(i2, str, str2, commonWalletObject);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new OfferWalletObject[i2];
    }
}
