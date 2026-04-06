package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zzj implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int N = SafeParcelReader.N(parcel);
        String str = null;
        LoyaltyPointsBalance loyaltyPointsBalance = null;
        TimeInterval timeInterval = null;
        while (parcel.dataPosition() < N) {
            int E = SafeParcelReader.E(parcel);
            int w2 = SafeParcelReader.w(E);
            if (w2 == 2) {
                str = SafeParcelReader.q(parcel, E);
            } else if (w2 == 3) {
                loyaltyPointsBalance = (LoyaltyPointsBalance) SafeParcelReader.p(parcel, E, LoyaltyPointsBalance.CREATOR);
            } else if (w2 != 5) {
                SafeParcelReader.M(parcel, E);
            } else {
                timeInterval = (TimeInterval) SafeParcelReader.p(parcel, E, TimeInterval.CREATOR);
            }
        }
        SafeParcelReader.v(parcel, N);
        return new LoyaltyPoints(str, loyaltyPointsBalance, timeInterval);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new LoyaltyPoints[i2];
    }
}
