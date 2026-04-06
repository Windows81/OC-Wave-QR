package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zzad implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int N = SafeParcelReader.N(parcel);
        int i2 = 0;
        zzbt[] zzbtArr = null;
        while (parcel.dataPosition() < N) {
            int E = SafeParcelReader.E(parcel);
            int w2 = SafeParcelReader.w(E);
            if (w2 == 1) {
                zzbtArr = (zzbt[]) SafeParcelReader.t(parcel, E, zzbt.CREATOR);
            } else if (w2 != 2) {
                SafeParcelReader.M(parcel, E);
            } else {
                i2 = SafeParcelReader.G(parcel, E);
            }
        }
        SafeParcelReader.v(parcel, N);
        return new zzac(zzbtArr, i2);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new zzac[i2];
    }
}
