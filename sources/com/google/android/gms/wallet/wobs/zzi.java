package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zzi implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int N = SafeParcelReader.N(parcel);
        int i2 = -1;
        long j2 = 0;
        String str = null;
        String str2 = null;
        double d2 = 0.0d;
        int i3 = 0;
        while (parcel.dataPosition() < N) {
            int E = SafeParcelReader.E(parcel);
            switch (SafeParcelReader.w(E)) {
                case 2:
                    i3 = SafeParcelReader.G(parcel2, E);
                    break;
                case 3:
                    str = SafeParcelReader.q(parcel2, E);
                    break;
                case 4:
                    d2 = SafeParcelReader.A(parcel2, E);
                    break;
                case 5:
                    str2 = SafeParcelReader.q(parcel2, E);
                    break;
                case 6:
                    j2 = SafeParcelReader.J(parcel2, E);
                    break;
                case 7:
                    i2 = SafeParcelReader.G(parcel2, E);
                    break;
                default:
                    SafeParcelReader.M(parcel2, E);
                    break;
            }
        }
        SafeParcelReader.v(parcel2, N);
        return new LoyaltyPointsBalance(i3, str, d2, str2, j2, i2);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new LoyaltyPointsBalance[i2];
    }
}
