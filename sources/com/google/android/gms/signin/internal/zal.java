package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.zav;

public final class zal implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int N = SafeParcelReader.N(parcel);
        ConnectionResult connectionResult = null;
        int i2 = 0;
        zav zav = null;
        while (parcel.dataPosition() < N) {
            int E = SafeParcelReader.E(parcel);
            int w2 = SafeParcelReader.w(E);
            if (w2 == 1) {
                i2 = SafeParcelReader.G(parcel, E);
            } else if (w2 == 2) {
                connectionResult = (ConnectionResult) SafeParcelReader.p(parcel, E, ConnectionResult.CREATOR);
            } else if (w2 != 3) {
                SafeParcelReader.M(parcel, E);
            } else {
                zav = (zav) SafeParcelReader.p(parcel, E, zav.CREATOR);
            }
        }
        SafeParcelReader.v(parcel, N);
        return new zak(i2, connectionResult, zav);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new zak[i2];
    }
}
