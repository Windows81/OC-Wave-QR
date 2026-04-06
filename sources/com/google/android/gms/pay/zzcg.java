package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zzcg implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int N = SafeParcelReader.N(parcel);
        zzas zzas = null;
        int i2 = 0;
        zzch zzch = null;
        while (parcel.dataPosition() < N) {
            int E = SafeParcelReader.E(parcel);
            int w2 = SafeParcelReader.w(E);
            if (w2 == 1) {
                i2 = SafeParcelReader.G(parcel, E);
            } else if (w2 == 2) {
                zzas = (zzas) SafeParcelReader.p(parcel, E, zzas.CREATOR);
            } else if (w2 != 3) {
                SafeParcelReader.M(parcel, E);
            } else {
                zzch = (zzch) SafeParcelReader.p(parcel, E, zzch.CREATOR);
            }
        }
        SafeParcelReader.v(parcel, N);
        return new zzcf(i2, zzas, zzch);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new zzcf[i2];
    }
}
