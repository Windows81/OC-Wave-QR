package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zzcm implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int N = SafeParcelReader.N(parcel);
        String[] strArr = null;
        while (parcel.dataPosition() < N) {
            int E = SafeParcelReader.E(parcel);
            if (SafeParcelReader.w(E) != 1) {
                SafeParcelReader.M(parcel, E);
            } else {
                strArr = SafeParcelReader.r(parcel, E);
            }
        }
        SafeParcelReader.v(parcel, N);
        return new zzcl(strArr);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new zzcl[i2];
    }
}
