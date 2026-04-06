package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zzv implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int N = SafeParcelReader.N(parcel);
        zzbg[] zzbgArr = null;
        while (parcel.dataPosition() < N) {
            int E = SafeParcelReader.E(parcel);
            if (SafeParcelReader.w(E) != 1) {
                SafeParcelReader.M(parcel, E);
            } else {
                zzbgArr = (zzbg[]) SafeParcelReader.t(parcel, E, zzbg.CREATOR);
            }
        }
        SafeParcelReader.v(parcel, N);
        return new zzu(zzbgArr);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new zzu[i2];
    }
}
