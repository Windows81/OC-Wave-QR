package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zzj implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int N = SafeParcelReader.N(parcel);
        zzk zzk = null;
        zzcl zzcl = null;
        zzcf zzcf = null;
        while (parcel.dataPosition() < N) {
            int E = SafeParcelReader.E(parcel);
            int w2 = SafeParcelReader.w(E);
            if (w2 == 1) {
                zzk = (zzk) SafeParcelReader.p(parcel, E, zzk.CREATOR);
            } else if (w2 == 2) {
                zzcl = (zzcl) SafeParcelReader.p(parcel, E, zzcl.CREATOR);
            } else if (w2 != 3) {
                SafeParcelReader.M(parcel, E);
            } else {
                zzcf = (zzcf) SafeParcelReader.p(parcel, E, zzcf.CREATOR);
            }
        }
        SafeParcelReader.v(parcel, N);
        return new zzi(zzk, zzcl, zzcf);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new zzi[i2];
    }
}
