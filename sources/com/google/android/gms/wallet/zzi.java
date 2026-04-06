package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zzi implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int N = SafeParcelReader.N(parcel);
        int i2 = 0;
        LoyaltyWalletObject loyaltyWalletObject = null;
        OfferWalletObject offerWalletObject = null;
        GiftCardWalletObject giftCardWalletObject = null;
        while (parcel.dataPosition() < N) {
            int E = SafeParcelReader.E(parcel);
            int w2 = SafeParcelReader.w(E);
            if (w2 == 2) {
                loyaltyWalletObject = (LoyaltyWalletObject) SafeParcelReader.p(parcel, E, LoyaltyWalletObject.CREATOR);
            } else if (w2 == 3) {
                offerWalletObject = (OfferWalletObject) SafeParcelReader.p(parcel, E, OfferWalletObject.CREATOR);
            } else if (w2 == 4) {
                giftCardWalletObject = (GiftCardWalletObject) SafeParcelReader.p(parcel, E, GiftCardWalletObject.CREATOR);
            } else if (w2 != 5) {
                SafeParcelReader.M(parcel, E);
            } else {
                i2 = SafeParcelReader.G(parcel, E);
            }
        }
        SafeParcelReader.v(parcel, N);
        return new CreateWalletObjectsRequest(loyaltyWalletObject, offerWalletObject, giftCardWalletObject, i2);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new CreateWalletObjectsRequest[i2];
    }
}
