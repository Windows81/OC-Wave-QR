package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zzal implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int N = SafeParcelReader.N(parcel);
        zzcp zzcp = null;
        while (parcel.dataPosition() < N) {
            int E = SafeParcelReader.E(parcel);
            if (SafeParcelReader.w(E) != 1) {
                SafeParcelReader.M(parcel, E);
            } else {
                zzcp = (zzcp) SafeParcelReader.p(parcel, E, zzcp.CREATOR);
            }
        }
        SafeParcelReader.v(parcel, N);
        return new zzak(zzcp);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new zzak[i2];
    }
}
