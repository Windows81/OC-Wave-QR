package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zzab implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int N = SafeParcelReader.N(parcel);
        zzbp[] zzbpArr = null;
        while (parcel.dataPosition() < N) {
            int E = SafeParcelReader.E(parcel);
            if (SafeParcelReader.w(E) != 2) {
                SafeParcelReader.M(parcel, E);
            } else {
                zzbpArr = (zzbp[]) SafeParcelReader.t(parcel, E, zzbp.CREATOR);
            }
        }
        SafeParcelReader.v(parcel, N);
        return new zzaa(zzbpArr);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new zzaa[i2];
    }
}
