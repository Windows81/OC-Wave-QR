package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zzbf implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int N = SafeParcelReader.N(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        zzc zzc = null;
        while (parcel.dataPosition() < N) {
            int E = SafeParcelReader.E(parcel);
            int w2 = SafeParcelReader.w(E);
            if (w2 == 1) {
                str = SafeParcelReader.q(parcel, E);
            } else if (w2 == 2) {
                str2 = SafeParcelReader.q(parcel, E);
            } else if (w2 == 3) {
                str3 = SafeParcelReader.q(parcel, E);
            } else if (w2 != 4) {
                SafeParcelReader.M(parcel, E);
            } else {
                zzc = (zzc) SafeParcelReader.p(parcel, E, zzc.CREATOR);
            }
        }
        SafeParcelReader.v(parcel, N);
        return new zzbe(str, str2, str3, zzc);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new zzbe[i2];
    }
}
