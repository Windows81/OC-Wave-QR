package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zzcq implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int N = SafeParcelReader.N(parcel);
        zzcn[] zzcnArr = null;
        int i2 = 0;
        while (parcel.dataPosition() < N) {
            int E = SafeParcelReader.E(parcel);
            int w2 = SafeParcelReader.w(E);
            if (w2 == 1) {
                i2 = SafeParcelReader.G(parcel, E);
            } else if (w2 != 2) {
                SafeParcelReader.M(parcel, E);
            } else {
                zzcnArr = (zzcn[]) SafeParcelReader.t(parcel, E, zzcn.CREATOR);
            }
        }
        SafeParcelReader.v(parcel, N);
        return new zzcp(i2, zzcnArr);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new zzcp[i2];
    }
}
