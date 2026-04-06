package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zzci implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int N = SafeParcelReader.N(parcel);
        zzcj zzcj = null;
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < N) {
            int E = SafeParcelReader.E(parcel);
            int w2 = SafeParcelReader.w(E);
            if (w2 == 1) {
                zzcj = (zzcj) SafeParcelReader.p(parcel, E, zzcj.CREATOR);
            } else if (w2 == 2) {
                str = SafeParcelReader.q(parcel, E);
            } else if (w2 != 3) {
                SafeParcelReader.M(parcel, E);
            } else {
                str2 = SafeParcelReader.q(parcel, E);
            }
        }
        SafeParcelReader.v(parcel, N);
        return new zzch(zzcj, str, str2);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new zzch[i2];
    }
}
