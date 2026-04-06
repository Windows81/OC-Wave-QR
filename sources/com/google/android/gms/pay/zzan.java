package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zzan implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int N = SafeParcelReader.N(parcel);
        zzcx[] zzcxArr = null;
        while (parcel.dataPosition() < N) {
            int E = SafeParcelReader.E(parcel);
            if (SafeParcelReader.w(E) != 1) {
                SafeParcelReader.M(parcel, E);
            } else {
                zzcxArr = (zzcx[]) SafeParcelReader.t(parcel, E, zzcx.CREATOR);
            }
        }
        SafeParcelReader.v(parcel, N);
        return new zzam(zzcxArr);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new zzam[i2];
    }
}
